// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.SharedPrivateLinkResourceInner;
import com.azure.resourcemanager.signalr.models.SharedPrivateLinkResourceList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SharedPrivateLinkResourceListTests {
    @Test
    public void testDeserialize() {
        SharedPrivateLinkResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"tg\",\"privateLinkResourceId\":\"wbwo\",\"provisioningState\":\"Canceled\",\"requestMessage\":\"shrtdtkcnqxwb\",\"status\":\"Approved\"},\"id\":\"ulpiuj\",\"name\":\"aasipqi\",\"type\":\"obyu\"},{\"properties\":{\"groupId\":\"pqlpq\",\"privateLinkResourceId\":\"cciuqgbdbutau\",\"provisioningState\":\"Running\",\"requestMessage\":\"kuwhh\",\"status\":\"Approved\"},\"id\":\"k\",\"name\":\"joxafnndlpi\",\"type\":\"hkoymkcdyhbp\"},{\"properties\":{\"groupId\":\"wdreqnovvqfovl\",\"privateLinkResourceId\":\"xywsuws\",\"provisioningState\":\"Running\",\"requestMessage\":\"dsytgadgvr\",\"status\":\"Pending\"},\"id\":\"en\",\"name\":\"qnzarrwl\",\"type\":\"uu\"}],\"nextLink\":\"fqka\"}")
                .toObject(SharedPrivateLinkResourceList.class);
        Assertions.assertEquals("tg", model.value().get(0).groupId());
        Assertions.assertEquals("wbwo", model.value().get(0).privateLinkResourceId());
        Assertions.assertEquals("shrtdtkcnqxwb", model.value().get(0).requestMessage());
        Assertions.assertEquals("fqka", model.nextLink());
    }

    @Test
    public void testSerialize() {
        SharedPrivateLinkResourceList model =
            new SharedPrivateLinkResourceList()
                .withValue(
                    Arrays
                        .asList(
                            new SharedPrivateLinkResourceInner()
                                .withGroupId("tg")
                                .withPrivateLinkResourceId("wbwo")
                                .withRequestMessage("shrtdtkcnqxwb"),
                            new SharedPrivateLinkResourceInner()
                                .withGroupId("pqlpq")
                                .withPrivateLinkResourceId("cciuqgbdbutau")
                                .withRequestMessage("kuwhh"),
                            new SharedPrivateLinkResourceInner()
                                .withGroupId("wdreqnovvqfovl")
                                .withPrivateLinkResourceId("xywsuws")
                                .withRequestMessage("dsytgadgvr")))
                .withNextLink("fqka");
        model = BinaryData.fromObject(model).toObject(SharedPrivateLinkResourceList.class);
        Assertions.assertEquals("tg", model.value().get(0).groupId());
        Assertions.assertEquals("wbwo", model.value().get(0).privateLinkResourceId());
        Assertions.assertEquals("shrtdtkcnqxwb", model.value().get(0).requestMessage());
        Assertions.assertEquals("fqka", model.nextLink());
    }
}
