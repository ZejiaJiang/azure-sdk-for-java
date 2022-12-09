// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.perf;

import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.eventhubs.EventData;
import com.azure.messaging.eventhubs.EventDataBatch;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.messaging.eventhubs.EventHubProducerClient;
import com.azure.messaging.eventhubs.EventProcessorClient;
import com.azure.messaging.eventhubs.EventProcessorClientBuilder;
import com.azure.messaging.eventhubs.checkpointstore.blob.BlobCheckpointStore;
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.perf.test.core.EventPerfTest;
import com.azure.perf.test.core.TestDataCreationHelper;
import com.azure.storage.blob.BlobContainerAsyncClient;
import com.azure.storage.blob.BlobContainerClientBuilder;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EventHubEventTest<TOptions extends EventProcessorOptions> extends EventPerfTest<TOptions> {
    private static final ClientLogger LOGGER = new ClientLogger(EventHubEventTest.class);

    private static final String AZURE_EVENTHUBS_CONNECTION_STRING = "AZURE_EVENTHUBS_CONNECTION_STRING";
    private static final String AZURE_EVENTHUB_NAME = "AZURE_EVENTHUB_NAME";
    private static final String AZURE_STORAGE_CONNECTION_STRING = "AZURE_STORAGE_CONNECTION_STRING";
    private static final String AZURE_STORAGE_CONTAINER_NAME = "AZURE_STORAGE_CONTAINER_NAME";

    final EventProcessorClient processor;
    final EventHubProducerClient producer;
    Sinks.One<Void> completeInitialSignal = Sinks.one();

    /**
     * Creates an instance of performance test.
     *
     * @param options the options configured for the test.
     * @throws IllegalStateException if SSL context cannot be created.
     */
    public EventHubEventTest(TOptions options) {
        super(options);

        final String connectionString = System.getenv(AZURE_EVENTHUBS_CONNECTION_STRING);
        if (CoreUtils.isNullOrEmpty(connectionString)) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("Environment variable %s must be set", AZURE_EVENTHUBS_CONNECTION_STRING)));
        }

        final String eventhubName = System.getenv(AZURE_EVENTHUB_NAME);
        if (CoreUtils.isNullOrEmpty(eventhubName)) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("Environment variable %s must be set", AZURE_EVENTHUB_NAME)));
        }

        producer = new EventHubClientBuilder()
            .connectionString(connectionString, eventhubName)
            .buildProducerClient();

        final String storageConnectionString = System.getenv(AZURE_STORAGE_CONNECTION_STRING);
        if (CoreUtils.isNullOrEmpty(storageConnectionString)) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("Environment variable %s must be set", AZURE_STORAGE_CONNECTION_STRING)));
        }

        final String containerName = CoreUtils.isNullOrEmpty(System.getenv(AZURE_STORAGE_CONTAINER_NAME))
            ? OffsetDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HHmmss"))
            : System.getenv(AZURE_STORAGE_CONTAINER_NAME);

        final BlobContainerAsyncClient containerClient = new BlobContainerClientBuilder()
            .connectionString(storageConnectionString)
            .containerName(containerName)
            .buildAsyncClient();

        final BlobCheckpointStore checkpointStore = new BlobCheckpointStore(containerClient);

        AtomicInteger partitionCount = new AtomicInteger();

        Map<String, EventPosition> initialPosition = new HashMap<>();

        for (String partitionId : producer.getPartitionIds()) {
            initialPosition.put(partitionId, EventPosition.earliest());
        }

        processor = new EventProcessorClientBuilder()
            .connectionString(connectionString, eventhubName)
            .consumerGroup(options.getConsumerGroup())
            .prefetchCount(options.getPrefetch())
            .checkpointStore(checkpointStore)
            .initialPartitionEventPosition(initialPosition)
            .processPartitionInitialization(initializationContext -> {
                partitionCount.getAndIncrement();
                if (partitionCount.get() == options.getPartitionCount()) {
                    completeInitialSignal.tryEmitValue(null);
                }
            })
            .processEvent(eventContext -> {
                eventRaised();
            })
            .processError(errorContext -> {
                errorRaised(errorContext.getThrowable());
            })
            .buildEventProcessorClient();
    }

    @Override
    public Mono<Void> globalSetupAsync() {
        final InputStream randomInputStream = TestDataCreationHelper.createRandomInputStream(options.getSize());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] eventBytes;
        try {
            int bytesRead;
            final byte[] data = new byte[4096];

            while ((bytesRead = randomInputStream.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, bytesRead);
            }

            eventBytes = buffer.toByteArray();
        } catch (IOException e) {
            System.err.println("Unable to read input bytes." + e);
            final int size = Long.valueOf(options.getSize()).intValue();
            eventBytes = new byte[size];
            Arrays.fill(eventBytes, Integer.valueOf(95).byteValue());
        } finally {
            try {
                buffer.close();
            } catch (IOException e) {
                System.err.println("Unable to close bytebuffer. Error:" + e);
            }
        }

        final EventData eventData = new EventData(eventBytes);

        final AtomicInteger number = new AtomicInteger(options.getEventsToSend());
        while (number.get() > 0) {
            EventDataBatch batch = producer.createBatch();
            while (batch.tryAdd(eventData)) {
                number.getAndDecrement();
                if (number.get() < 0) {
                    break;
                }
            }
            producer.send(batch);
        }

        return Mono.empty();
    }
}
