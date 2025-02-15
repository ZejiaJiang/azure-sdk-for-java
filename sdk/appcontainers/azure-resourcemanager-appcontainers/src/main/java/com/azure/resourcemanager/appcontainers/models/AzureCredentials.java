// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Container App credentials. */
@Fluent
public final class AzureCredentials {
    /*
     * Client Id.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * Client Secret.
     */
    @JsonProperty(value = "clientSecret")
    private String clientSecret;

    /*
     * Tenant Id.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Subscription Id.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /** Creates an instance of AzureCredentials class. */
    public AzureCredentials() {
    }

    /**
     * Get the clientId property: Client Id.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client Id.
     *
     * @param clientId the clientId value to set.
     * @return the AzureCredentials object itself.
     */
    public AzureCredentials withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: Client Secret.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: Client Secret.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the AzureCredentials object itself.
     */
    public AzureCredentials withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the tenantId property: Tenant Id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant Id.
     *
     * @param tenantId the tenantId value to set.
     * @return the AzureCredentials object itself.
     */
    public AzureCredentials withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the subscriptionId property: Subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Subscription Id.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureCredentials object itself.
     */
    public AzureCredentials withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
