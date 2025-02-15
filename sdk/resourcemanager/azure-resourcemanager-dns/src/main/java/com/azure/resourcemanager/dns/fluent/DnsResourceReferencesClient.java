// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dns.fluent.models.DnsResourceReferenceResultInner;
import com.azure.resourcemanager.dns.models.DnsResourceReferenceRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DnsResourceReferencesClient. */
public interface DnsResourceReferencesClient {
    /**
     * Returns the DNS records specified by the referencing targetResourceIds.
     *
     * @param parameters Properties for dns resource reference request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the properties of the Dns Resource Reference Result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DnsResourceReferenceResultInner>> getByTargetResourcesWithResponseAsync(
        DnsResourceReferenceRequest parameters);

    /**
     * Returns the DNS records specified by the referencing targetResourceIds.
     *
     * @param parameters Properties for dns resource reference request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the properties of the Dns Resource Reference Result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DnsResourceReferenceResultInner> getByTargetResourcesAsync(DnsResourceReferenceRequest parameters);

    /**
     * Returns the DNS records specified by the referencing targetResourceIds.
     *
     * @param parameters Properties for dns resource reference request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the properties of the Dns Resource Reference Result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DnsResourceReferenceResultInner getByTargetResources(DnsResourceReferenceRequest parameters);

    /**
     * Returns the DNS records specified by the referencing targetResourceIds.
     *
     * @param parameters Properties for dns resource reference request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the properties of the Dns Resource Reference Result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DnsResourceReferenceResultInner> getByTargetResourcesWithResponse(
        DnsResourceReferenceRequest parameters, Context context);
}
