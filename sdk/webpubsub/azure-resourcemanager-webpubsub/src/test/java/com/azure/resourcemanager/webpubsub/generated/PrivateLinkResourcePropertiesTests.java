// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateLinkResourceProperties;
import com.azure.resourcemanager.webpubsub.models.ShareablePrivateLinkResourceProperties;
import com.azure.resourcemanager.webpubsub.models.ShareablePrivateLinkResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkResourcePropertiesTests {
    @Test
    public void testDeserialize() {
        PrivateLinkResourceProperties model =
            BinaryData
                .fromString(
                    "{\"groupId\":\"lcxog\",\"requiredMembers\":[\"onz\",\"nsikvmkqzeqqkdl\",\"fzxmhhvhgureodkw\"],\"requiredZoneNames\":[\"agxti\",\"qdxbxwa\",\"bogqxndlkzgxhu\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"bpodxunkbebxm\",\"properties\":{\"description\":\"yntwlrbq\",\"groupId\":\"oievseotgqrlltm\",\"type\":\"lauwzizxbmpgcjef\"}},{\"name\":\"muvp\",\"properties\":{\"description\":\"d\",\"groupId\":\"orppxebmnzbtb\",\"type\":\"pglkf\"}},{\"name\":\"hdneuelfph\",\"properties\":{\"description\":\"htozfikdow\",\"groupId\":\"uuvxz\",\"type\":\"lvithhqzonosgg\"}}]}")
                .toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("lcxog", model.groupId());
        Assertions.assertEquals("onz", model.requiredMembers().get(0));
        Assertions.assertEquals("agxti", model.requiredZoneNames().get(0));
        Assertions.assertEquals("bpodxunkbebxm", model.shareablePrivateLinkResourceTypes().get(0).name());
        Assertions
            .assertEquals("yntwlrbq", model.shareablePrivateLinkResourceTypes().get(0).properties().description());
        Assertions
            .assertEquals("oievseotgqrlltm", model.shareablePrivateLinkResourceTypes().get(0).properties().groupId());
        Assertions
            .assertEquals("lauwzizxbmpgcjef", model.shareablePrivateLinkResourceTypes().get(0).properties().type());
    }

    @Test
    public void testSerialize() {
        PrivateLinkResourceProperties model =
            new PrivateLinkResourceProperties()
                .withGroupId("lcxog")
                .withRequiredMembers(Arrays.asList("onz", "nsikvmkqzeqqkdl", "fzxmhhvhgureodkw"))
                .withRequiredZoneNames(Arrays.asList("agxti", "qdxbxwa", "bogqxndlkzgxhu"))
                .withShareablePrivateLinkResourceTypes(
                    Arrays
                        .asList(
                            new ShareablePrivateLinkResourceType()
                                .withName("bpodxunkbebxm")
                                .withProperties(
                                    new ShareablePrivateLinkResourceProperties()
                                        .withDescription("yntwlrbq")
                                        .withGroupId("oievseotgqrlltm")
                                        .withType("lauwzizxbmpgcjef")),
                            new ShareablePrivateLinkResourceType()
                                .withName("muvp")
                                .withProperties(
                                    new ShareablePrivateLinkResourceProperties()
                                        .withDescription("d")
                                        .withGroupId("orppxebmnzbtb")
                                        .withType("pglkf")),
                            new ShareablePrivateLinkResourceType()
                                .withName("hdneuelfph")
                                .withProperties(
                                    new ShareablePrivateLinkResourceProperties()
                                        .withDescription("htozfikdow")
                                        .withGroupId("uuvxz")
                                        .withType("lvithhqzonosgg"))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("lcxog", model.groupId());
        Assertions.assertEquals("onz", model.requiredMembers().get(0));
        Assertions.assertEquals("agxti", model.requiredZoneNames().get(0));
        Assertions.assertEquals("bpodxunkbebxm", model.shareablePrivateLinkResourceTypes().get(0).name());
        Assertions
            .assertEquals("yntwlrbq", model.shareablePrivateLinkResourceTypes().get(0).properties().description());
        Assertions
            .assertEquals("oievseotgqrlltm", model.shareablePrivateLinkResourceTypes().get(0).properties().groupId());
        Assertions
            .assertEquals("lauwzizxbmpgcjef", model.shareablePrivateLinkResourceTypes().get(0).properties().type());
    }
}
