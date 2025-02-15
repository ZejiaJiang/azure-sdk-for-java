// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveOutputInner;
import com.azure.resourcemanager.mediaservices.models.LiveOutputListResult;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LiveOutputListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveOutputListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"description\":\"hdgqggeb\",\"assetName\":\"unygaeqid\",\"archiveWindowLength\":\"PT194H9M37S\",\"rewindWindowLength\":\"PT176H23M37S\",\"manifestName\":\"pxllrx\",\"outputSnapTime\":3059787385770886832,\"created\":\"2021-01-17T00:57:30Z\",\"lastModified\":\"2021-02-02T22:23:44Z\",\"provisioningState\":\"arm\",\"resourceState\":\"Running\"},\"id\":\"jsjqbjhhyx\",\"name\":\"rw\",\"type\":\"yc\"}],\"@odata.count\":803302222,\"@odata.nextLink\":\"p\"}")
                .toObject(LiveOutputListResult.class);
        Assertions.assertEquals("hdgqggeb", model.value().get(0).description());
        Assertions.assertEquals("unygaeqid", model.value().get(0).assetName());
        Assertions.assertEquals(Duration.parse("PT194H9M37S"), model.value().get(0).archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT176H23M37S"), model.value().get(0).rewindWindowLength());
        Assertions.assertEquals("pxllrx", model.value().get(0).manifestName());
        Assertions.assertEquals(3059787385770886832L, model.value().get(0).outputSnapTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveOutputListResult model =
            new LiveOutputListResult()
                .withValue(
                    Arrays
                        .asList(
                            new LiveOutputInner()
                                .withDescription("hdgqggeb")
                                .withAssetName("unygaeqid")
                                .withArchiveWindowLength(Duration.parse("PT194H9M37S"))
                                .withRewindWindowLength(Duration.parse("PT176H23M37S"))
                                .withManifestName("pxllrx")
                                .withOutputSnapTime(3059787385770886832L)));
        model = BinaryData.fromObject(model).toObject(LiveOutputListResult.class);
        Assertions.assertEquals("hdgqggeb", model.value().get(0).description());
        Assertions.assertEquals("unygaeqid", model.value().get(0).assetName());
        Assertions.assertEquals(Duration.parse("PT194H9M37S"), model.value().get(0).archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT176H23M37S"), model.value().get(0).rewindWindowLength());
        Assertions.assertEquals("pxllrx", model.value().get(0).manifestName());
        Assertions.assertEquals(3059787385770886832L, model.value().get(0).outputSnapTime());
    }
}
