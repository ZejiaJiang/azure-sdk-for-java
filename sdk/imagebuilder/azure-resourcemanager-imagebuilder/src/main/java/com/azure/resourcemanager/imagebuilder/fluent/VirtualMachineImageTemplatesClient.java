// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.imagebuilder.fluent.models.ImageTemplateInner;
import com.azure.resourcemanager.imagebuilder.fluent.models.RunOutputInner;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateUpdateParameters;

/** An instance of this class provides access to all the operations defined in VirtualMachineImageTemplatesClient. */
public interface VirtualMachineImageTemplatesClient {
    /**
     * Gets information about the VM image templates associated with the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the VM image templates associated with the subscription as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImageTemplateInner> list();

    /**
     * Gets information about the VM image templates associated with the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the VM image templates associated with the subscription as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImageTemplateInner> list(Context context);

    /**
     * Gets information about the VM image templates associated with the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the VM image templates associated with the specified resource group as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImageTemplateInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets information about the VM image templates associated with the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the VM image templates associated with the specified resource group as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImageTemplateInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Create or update a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param parameters Parameters supplied to the CreateImageTemplate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of image template is an ARM resource managed by
     *     Microsoft.VirtualMachineImages provider.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImageTemplateInner>, ImageTemplateInner> beginCreateOrUpdate(
        String resourceGroupName, String imageTemplateName, ImageTemplateInner parameters);

    /**
     * Create or update a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param parameters Parameters supplied to the CreateImageTemplate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of image template is an ARM resource managed by
     *     Microsoft.VirtualMachineImages provider.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImageTemplateInner>, ImageTemplateInner> beginCreateOrUpdate(
        String resourceGroupName, String imageTemplateName, ImageTemplateInner parameters, Context context);

    /**
     * Create or update a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param parameters Parameters supplied to the CreateImageTemplate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return image template is an ARM resource managed by Microsoft.VirtualMachineImages provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageTemplateInner createOrUpdate(
        String resourceGroupName, String imageTemplateName, ImageTemplateInner parameters);

    /**
     * Create or update a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param parameters Parameters supplied to the CreateImageTemplate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return image template is an ARM resource managed by Microsoft.VirtualMachineImages provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageTemplateInner createOrUpdate(
        String resourceGroupName, String imageTemplateName, ImageTemplateInner parameters, Context context);

    /**
     * Update the tags for this Virtual Machine Image Template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param parameters Additional parameters for Image Template update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of image template is an ARM resource managed by
     *     Microsoft.VirtualMachineImages provider.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImageTemplateInner>, ImageTemplateInner> beginUpdate(
        String resourceGroupName, String imageTemplateName, ImageTemplateUpdateParameters parameters);

    /**
     * Update the tags for this Virtual Machine Image Template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param parameters Additional parameters for Image Template update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of image template is an ARM resource managed by
     *     Microsoft.VirtualMachineImages provider.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImageTemplateInner>, ImageTemplateInner> beginUpdate(
        String resourceGroupName, String imageTemplateName, ImageTemplateUpdateParameters parameters, Context context);

    /**
     * Update the tags for this Virtual Machine Image Template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param parameters Additional parameters for Image Template update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return image template is an ARM resource managed by Microsoft.VirtualMachineImages provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageTemplateInner update(
        String resourceGroupName, String imageTemplateName, ImageTemplateUpdateParameters parameters);

    /**
     * Update the tags for this Virtual Machine Image Template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param parameters Additional parameters for Image Template update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return image template is an ARM resource managed by Microsoft.VirtualMachineImages provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageTemplateInner update(
        String resourceGroupName, String imageTemplateName, ImageTemplateUpdateParameters parameters, Context context);

    /**
     * Get information about a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a virtual machine image template.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImageTemplateInner getByResourceGroup(String resourceGroupName, String imageTemplateName);

    /**
     * Get information about a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a virtual machine image template along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ImageTemplateInner> getByResourceGroupWithResponse(
        String resourceGroupName, String imageTemplateName, Context context);

    /**
     * Delete a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String imageTemplateName);

    /**
     * Delete a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String imageTemplateName, Context context);

    /**
     * Delete a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String imageTemplateName);

    /**
     * Delete a virtual machine image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String imageTemplateName, Context context);

    /**
     * Create artifacts from a existing image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRun(String resourceGroupName, String imageTemplateName);

    /**
     * Create artifacts from a existing image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRun(String resourceGroupName, String imageTemplateName, Context context);

    /**
     * Create artifacts from a existing image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void run(String resourceGroupName, String imageTemplateName);

    /**
     * Create artifacts from a existing image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void run(String resourceGroupName, String imageTemplateName, Context context);

    /**
     * Cancel the long running image build based on the image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCancel(String resourceGroupName, String imageTemplateName);

    /**
     * Cancel the long running image build based on the image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCancel(String resourceGroupName, String imageTemplateName, Context context);

    /**
     * Cancel the long running image build based on the image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(String resourceGroupName, String imageTemplateName);

    /**
     * Cancel the long running image build based on the image template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(String resourceGroupName, String imageTemplateName, Context context);

    /**
     * List all run outputs for the specified Image Template resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of List run outputs operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RunOutputInner> listRunOutputs(String resourceGroupName, String imageTemplateName);

    /**
     * List all run outputs for the specified Image Template resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of List run outputs operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RunOutputInner> listRunOutputs(String resourceGroupName, String imageTemplateName, Context context);

    /**
     * Get the specified run output for the specified image template resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param runOutputName The name of the run output.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified run output for the specified image template resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RunOutputInner getRunOutput(String resourceGroupName, String imageTemplateName, String runOutputName);

    /**
     * Get the specified run output for the specified image template resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageTemplateName The name of the image Template.
     * @param runOutputName The name of the run output.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified run output for the specified image template resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RunOutputInner> getRunOutputWithResponse(
        String resourceGroupName, String imageTemplateName, String runOutputName, Context context);
}
