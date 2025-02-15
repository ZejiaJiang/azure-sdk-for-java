// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for ImageVersions ListByImage. */
public final class ImageVersionsListByImageSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-11-11-preview/examples/ImageVersions_List.json
     */
    /**
     * Sample code: ImageVersions_ListByImage.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void imageVersionsListByImage(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.imageVersions().listByImage("rg1", "Contoso", "DefaultDevGallery", "Win11", Context.NONE);
    }
}
