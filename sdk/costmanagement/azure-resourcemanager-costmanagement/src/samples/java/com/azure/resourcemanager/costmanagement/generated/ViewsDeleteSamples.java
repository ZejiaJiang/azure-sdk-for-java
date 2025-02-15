// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

/** Samples for Views Delete. */
public final class ViewsDeleteSamples {
    /*
     * x-ms-original-file: specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2020-06-01/examples/PrivateViewDelete.json
     */
    /**
     * Sample code: DeletePrivateView.
     *
     * @param manager Entry point to CostManagementManager.
     */
    public static void deletePrivateView(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager.views().deleteWithResponse("TestView", com.azure.core.util.Context.NONE);
    }
}
