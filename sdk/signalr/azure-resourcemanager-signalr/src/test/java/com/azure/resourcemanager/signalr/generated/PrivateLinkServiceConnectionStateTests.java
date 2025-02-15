// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkServiceConnectionStateTests {
    @Test
    public void testDeserialize() {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString(
                    "{\"status\":\"Approved\",\"description\":\"nwbmeh\",\"actionsRequired\":\"eyvjusrtslhspkde\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.APPROVED, model.status());
        Assertions.assertEquals("nwbmeh", model.description());
        Assertions.assertEquals("eyvjusrtslhspkde", model.actionsRequired());
    }

    @Test
    public void testSerialize() {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                .withDescription("nwbmeh")
                .withActionsRequired("eyvjusrtslhspkde");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.APPROVED, model.status());
        Assertions.assertEquals("nwbmeh", model.description());
        Assertions.assertEquals("eyvjusrtslhspkde", model.actionsRequired());
    }
}
