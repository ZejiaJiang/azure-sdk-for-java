// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.containers.containerregistry.models.OciBlobDescriptor;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Returns the requested Docker V2 Manifest file. */
@Fluent
public final class V2Manifest extends Manifest {
    /*
     * Media type for this Manifest
     */
    @JsonProperty(value = "mediaType")
    private String mediaType;

    /*
     * V2 image config descriptor
     */
    @JsonProperty(value = "config")
    private OciBlobDescriptor config;

    /*
     * List of V2 image layer information
     */
    @JsonProperty(value = "layers")
    private List<OciBlobDescriptor> layers;

    /** Creates an instance of V2Manifest class. */
    public V2Manifest() {}

    /**
     * Get the mediaType property: Media type for this Manifest.
     *
     * @return the mediaType value.
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * Set the mediaType property: Media type for this Manifest.
     *
     * @param mediaType the mediaType value to set.
     * @return the V2Manifest object itself.
     */
    public V2Manifest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get the config property: V2 image config descriptor.
     *
     * @return the config value.
     */
    public OciBlobDescriptor getConfig() {
        return this.config;
    }

    /**
     * Set the config property: V2 image config descriptor.
     *
     * @param config the config value to set.
     * @return the V2Manifest object itself.
     */
    public V2Manifest setConfig(OciBlobDescriptor config) {
        this.config = config;
        return this;
    }

    /**
     * Get the layers property: List of V2 image layer information.
     *
     * @return the layers value.
     */
    public List<OciBlobDescriptor> getLayers() {
        return this.layers;
    }

    /**
     * Set the layers property: List of V2 image layer information.
     *
     * @param layers the layers value to set.
     * @return the V2Manifest object itself.
     */
    public V2Manifest setLayers(List<OciBlobDescriptor> layers) {
        this.layers = layers;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public V2Manifest setSchemaVersion(Integer schemaVersion) {
        super.setSchemaVersion(schemaVersion);
        return this;
    }
}
