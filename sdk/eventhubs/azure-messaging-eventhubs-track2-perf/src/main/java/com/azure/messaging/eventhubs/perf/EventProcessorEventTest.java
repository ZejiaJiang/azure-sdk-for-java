package com.azure.messaging.eventhubs.perf;

import reactor.core.publisher.Mono;

import java.time.Duration;

public class EventProcessorEventTest extends EventHubEventTest<EventProcessorOptions> {
    /**
     * Creates an instance of performance test.
     *
     * @param options the options configured for the test.
     * @throws IllegalStateException if SSL context cannot be created.
     */
    public EventProcessorEventTest(EventProcessorOptions options) {
        super(options);
    }

    @Override
    public Mono<Void> setupAsync() {
        return super.setupAsync().then(Mono.defer(() -> {
            processor.start();
//            return Mono.delay(Duration.ofSeconds(20)).then();
            return completeInitialSignal.asMono();
        }));
    }

    @Override
    public Mono<Void> cleanupAsync() {
        return Mono.defer(() -> {
            processor.stop();
            return Mono.empty();
        }).then(super.cleanupAsync());
    }

}
