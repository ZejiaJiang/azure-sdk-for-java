// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.Context;

/** Samples for VaultExtendedInfo CreateOrUpdate. */
public final class VaultExtendedInfoCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/UpdateVaultExtendedInfo.json
     */
    /**
     * Sample code: Put ExtendedInfo of Resource.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void putExtendedInfoOfResource(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .vaultExtendedInfoes()
            .createOrUpdateWithResponse("Default-RecoveryServices-ResourceGroup", "swaggerExample", null, Context.NONE);
    }
}
