// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ResourceIdentity;
import org.junit.jupiter.api.Assertions;

public final class ResourceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceIdentity model =
            BinaryData
                .fromString("{\"userAssignedIdentity\":\"qsycbkbfkgu\",\"useSystemAssignedIdentity\":true}")
                .toObject(ResourceIdentity.class);
        Assertions.assertEquals("qsycbkbfkgu", model.userAssignedIdentity());
        Assertions.assertEquals(true, model.useSystemAssignedIdentity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceIdentity model =
            new ResourceIdentity().withUserAssignedIdentity("qsycbkbfkgu").withUseSystemAssignedIdentity(true);
        model = BinaryData.fromObject(model).toObject(ResourceIdentity.class);
        Assertions.assertEquals("qsycbkbfkgu", model.userAssignedIdentity());
        Assertions.assertEquals(true, model.useSystemAssignedIdentity());
    }
}
