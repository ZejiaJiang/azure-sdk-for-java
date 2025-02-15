// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BackupVaults. */
public interface BackupVaults {
    /**
     * Returns resource collection belonging to a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVaultResourceList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BackupVaultResource> list();

    /**
     * Returns resource collection belonging to a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVaultResourceList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BackupVaultResource> list(Context context);

    /**
     * Returns resource collection belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVaultResourceList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BackupVaultResource> listByResourceGroup(String resourceGroupName);

    /**
     * Returns resource collection belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVaultResourceList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BackupVaultResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Returns a resource belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVault Resource along with {@link Response}.
     */
    Response<BackupVaultResource> getByResourceGroupWithResponse(
        String resourceGroupName, String vaultName, Context context);

    /**
     * Returns a resource belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVault Resource.
     */
    BackupVaultResource getByResourceGroup(String resourceGroupName, String vaultName);

    /**
     * Deletes a BackupVault resource from the resource group.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String vaultName, Context context);

    /**
     * Deletes a BackupVault resource from the resource group.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String vaultName);

    /**
     * API to check for resource name availability.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param location The location in which uniqueness will be verified.
     * @param parameters Check name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return checkNameAvailabilityResult along with {@link Response}.
     */
    Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        String resourceGroupName, String location, CheckNameAvailabilityRequest parameters, Context context);

    /**
     * API to check for resource name availability.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param location The location in which uniqueness will be verified.
     * @param parameters Check name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return checkNameAvailabilityResult.
     */
    CheckNameAvailabilityResult checkNameAvailability(
        String resourceGroupName, String location, CheckNameAvailabilityRequest parameters);

    /**
     * Returns a resource belonging to a resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVault Resource along with {@link Response}.
     */
    BackupVaultResource getById(String id);

    /**
     * Returns a resource belonging to a resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVault Resource along with {@link Response}.
     */
    Response<BackupVaultResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a BackupVault resource from the resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a BackupVault resource from the resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new BackupVaultResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new BackupVaultResource definition.
     */
    BackupVaultResource.DefinitionStages.Blank define(String name);
}
