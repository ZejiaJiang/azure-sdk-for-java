// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.DefaultPrincipalsModificationKind;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;
import com.azure.resourcemanager.synapse.models.TableLevelSharingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class representing the an attached database configuration properties of kind specific. */
@Fluent
public final class AttachedDatabaseConfigurationProperties {
    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceProvisioningState provisioningState;

    /*
     * The name of the database which you would like to attach, use * if you
     * want to follow all current and future databases.
     */
    @JsonProperty(value = "databaseName", required = true)
    private String databaseName;

    /*
     * The resource id of the kusto pool where the databases you would like to
     * attach reside.
     */
    @JsonProperty(value = "clusterResourceId", required = true)
    private String kustoPoolResourceId;

    /*
     * The list of databases from the clusterResourceId which are currently
     * attached to the kusto pool.
     */
    @JsonProperty(value = "attachedDatabaseNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> attachedDatabaseNames;

    /*
     * The default principals modification kind
     */
    @JsonProperty(value = "defaultPrincipalsModificationKind", required = true)
    private DefaultPrincipalsModificationKind defaultPrincipalsModificationKind;

    /*
     * Table level sharing specifications
     */
    @JsonProperty(value = "tableLevelSharingProperties")
    private TableLevelSharingProperties tableLevelSharingProperties;

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the databaseName property: The name of the database which you would like to attach, use * if you want to
     * follow all current and future databases.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the database which you would like to attach, use * if you want to
     * follow all current and future databases.
     *
     * @param databaseName the databaseName value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the kustoPoolResourceId property: The resource id of the kusto pool where the databases you would like to
     * attach reside.
     *
     * @return the kustoPoolResourceId value.
     */
    public String kustoPoolResourceId() {
        return this.kustoPoolResourceId;
    }

    /**
     * Set the kustoPoolResourceId property: The resource id of the kusto pool where the databases you would like to
     * attach reside.
     *
     * @param kustoPoolResourceId the kustoPoolResourceId value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties withKustoPoolResourceId(String kustoPoolResourceId) {
        this.kustoPoolResourceId = kustoPoolResourceId;
        return this;
    }

    /**
     * Get the attachedDatabaseNames property: The list of databases from the clusterResourceId which are currently
     * attached to the kusto pool.
     *
     * @return the attachedDatabaseNames value.
     */
    public List<String> attachedDatabaseNames() {
        return this.attachedDatabaseNames;
    }

    /**
     * Get the defaultPrincipalsModificationKind property: The default principals modification kind.
     *
     * @return the defaultPrincipalsModificationKind value.
     */
    public DefaultPrincipalsModificationKind defaultPrincipalsModificationKind() {
        return this.defaultPrincipalsModificationKind;
    }

    /**
     * Set the defaultPrincipalsModificationKind property: The default principals modification kind.
     *
     * @param defaultPrincipalsModificationKind the defaultPrincipalsModificationKind value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties withDefaultPrincipalsModificationKind(
        DefaultPrincipalsModificationKind defaultPrincipalsModificationKind) {
        this.defaultPrincipalsModificationKind = defaultPrincipalsModificationKind;
        return this;
    }

    /**
     * Get the tableLevelSharingProperties property: Table level sharing specifications.
     *
     * @return the tableLevelSharingProperties value.
     */
    public TableLevelSharingProperties tableLevelSharingProperties() {
        return this.tableLevelSharingProperties;
    }

    /**
     * Set the tableLevelSharingProperties property: Table level sharing specifications.
     *
     * @param tableLevelSharingProperties the tableLevelSharingProperties value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties withTableLevelSharingProperties(
        TableLevelSharingProperties tableLevelSharingProperties) {
        this.tableLevelSharingProperties = tableLevelSharingProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (databaseName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property databaseName in model AttachedDatabaseConfigurationProperties"));
        }
        if (kustoPoolResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property kustoPoolResourceId in model"
                            + " AttachedDatabaseConfigurationProperties"));
        }
        if (defaultPrincipalsModificationKind() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property defaultPrincipalsModificationKind in model"
                            + " AttachedDatabaseConfigurationProperties"));
        }
        if (tableLevelSharingProperties() != null) {
            tableLevelSharingProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AttachedDatabaseConfigurationProperties.class);
}
