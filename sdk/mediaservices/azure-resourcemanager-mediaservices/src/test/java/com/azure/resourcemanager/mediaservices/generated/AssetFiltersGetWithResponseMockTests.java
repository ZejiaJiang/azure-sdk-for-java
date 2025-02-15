// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.AssetFilter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AssetFiltersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"presentationTimeRange\":{\"startTimestamp\":7350934408558925942,\"endTimestamp\":7177247195685239376,\"presentationWindowDuration\":1722647833677811918,\"liveBackoffDuration\":4807830572132662683,\"timescale\":710813168717996002,\"forceEndTimestamp\":false},\"firstQuality\":{\"bitrate\":1391311949},\"tracks\":[]},\"id\":\"pypqtgsfj\",\"name\":\"cbslhhx\",\"type\":\"db\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MediaServicesManager manager =
            MediaServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AssetFilter response =
            manager
                .assetFilters()
                .getWithResponse("cuijpxt", "s", "wprtu", "wsawddjibabxvi", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals(7350934408558925942L, response.presentationTimeRange().startTimestamp());
        Assertions.assertEquals(7177247195685239376L, response.presentationTimeRange().endTimestamp());
        Assertions.assertEquals(1722647833677811918L, response.presentationTimeRange().presentationWindowDuration());
        Assertions.assertEquals(4807830572132662683L, response.presentationTimeRange().liveBackoffDuration());
        Assertions.assertEquals(710813168717996002L, response.presentationTimeRange().timescale());
        Assertions.assertEquals(false, response.presentationTimeRange().forceEndTimestamp());
        Assertions.assertEquals(1391311949, response.firstQuality().bitrate());
    }
}
