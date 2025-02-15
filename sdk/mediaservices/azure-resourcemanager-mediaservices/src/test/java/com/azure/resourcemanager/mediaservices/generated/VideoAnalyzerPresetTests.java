// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.AudioAnalysisMode;
import com.azure.resourcemanager.mediaservices.models.InsightsType;
import com.azure.resourcemanager.mediaservices.models.VideoAnalyzerPreset;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VideoAnalyzerPresetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VideoAnalyzerPreset model =
            BinaryData
                .fromString(
                    "{\"@odata.type\":\"#Microsoft.Media.VideoAnalyzerPreset\",\"insightsToExtract\":\"VideoInsightsOnly\",\"audioLanguage\":\"qzfavyv\",\"mode\":\"Basic\",\"experimentalOptions\":{\"yjkqabqgzslesjcb\":\"aryeu\"}}")
                .toObject(VideoAnalyzerPreset.class);
        Assertions.assertEquals("qzfavyv", model.audioLanguage());
        Assertions.assertEquals(AudioAnalysisMode.BASIC, model.mode());
        Assertions.assertEquals("aryeu", model.experimentalOptions().get("yjkqabqgzslesjcb"));
        Assertions.assertEquals(InsightsType.VIDEO_INSIGHTS_ONLY, model.insightsToExtract());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VideoAnalyzerPreset model =
            new VideoAnalyzerPreset()
                .withAudioLanguage("qzfavyv")
                .withMode(AudioAnalysisMode.BASIC)
                .withExperimentalOptions(mapOf("yjkqabqgzslesjcb", "aryeu"))
                .withInsightsToExtract(InsightsType.VIDEO_INSIGHTS_ONLY);
        model = BinaryData.fromObject(model).toObject(VideoAnalyzerPreset.class);
        Assertions.assertEquals("qzfavyv", model.audioLanguage());
        Assertions.assertEquals(AudioAnalysisMode.BASIC, model.mode());
        Assertions.assertEquals("aryeu", model.experimentalOptions().get("yjkqabqgzslesjcb"));
        Assertions.assertEquals(InsightsType.VIDEO_INSIGHTS_ONLY, model.insightsToExtract());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
