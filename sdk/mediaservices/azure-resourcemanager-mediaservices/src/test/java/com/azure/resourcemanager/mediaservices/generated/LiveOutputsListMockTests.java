// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.LiveOutput;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LiveOutputsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"description\":\"wfbkgozxwo\",\"assetName\":\"dby\",\"archiveWindowLength\":\"PT53H25M23S\",\"rewindWindowLength\":\"PT8H18M32S\",\"manifestName\":\"aclnapxbiygnugj\",\"hls\":{\"fragmentsPerTsSegment\":1701530674},\"outputSnapTime\":4670031312582327027,\"created\":\"2021-11-18T08:04:29Z\",\"lastModified\":\"2021-07-24T11:33:54Z\",\"provisioningState\":\"uyilflqoiquvrehm\",\"resourceState\":\"Creating\"},\"id\":\"vsujztczytqjtwh\",\"name\":\"uunfprnjletlxsm\",\"type\":\"pddouifamowaziyn\"}]}";

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

        PagedIterable<LiveOutput> response =
            manager
                .liveOutputs()
                .list("viirhgfgrws", "pgratzvzbglbyvi", "tctbrxkjzwrgxffm", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("wfbkgozxwo", response.iterator().next().description());
        Assertions.assertEquals("dby", response.iterator().next().assetName());
        Assertions.assertEquals(Duration.parse("PT53H25M23S"), response.iterator().next().archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT8H18M32S"), response.iterator().next().rewindWindowLength());
        Assertions.assertEquals("aclnapxbiygnugj", response.iterator().next().manifestName());
        Assertions.assertEquals(1701530674, response.iterator().next().hls().fragmentsPerTsSegment());
        Assertions.assertEquals(4670031312582327027L, response.iterator().next().outputSnapTime());
    }
}
