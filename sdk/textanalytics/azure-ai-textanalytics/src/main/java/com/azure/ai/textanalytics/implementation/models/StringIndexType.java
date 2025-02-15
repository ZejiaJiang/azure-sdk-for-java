// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the method used to interpret string offsets. Defaults to Text Elements (Graphemes) according to Unicode
 * v8.0.0. For additional information see https://aka.ms/text-analytics-offsets.
 */
public final class StringIndexType extends ExpandableStringEnum<StringIndexType> {
    /** Static value TextElements_v8 for StringIndexType. */
    public static final StringIndexType TEXT_ELEMENTS_V8 = fromString("TextElements_v8");

    /** Static value UnicodeCodePoint for StringIndexType. */
    public static final StringIndexType UNICODE_CODE_POINT = fromString("UnicodeCodePoint");

    /** Static value Utf16CodeUnit for StringIndexType. */
    public static final StringIndexType UTF16CODE_UNIT = fromString("Utf16CodeUnit");

    /**
     * Creates or finds a StringIndexType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StringIndexType.
     */
    @JsonCreator
    public static StringIndexType fromString(String name) {
        return fromString(name, StringIndexType.class);
    }

    /**
     * Gets known StringIndexType values.
     *
     * @return known StringIndexType values.
     */
    public static Collection<StringIndexType> values() {
        return values(StringIndexType.class);
    }
}
