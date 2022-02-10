// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType {
        ScaleTypeUnspecified("SCALE_TYPE_UNSPECIFIED"),
        UnitLinearScale("UNIT_LINEAR_SCALE"),
        UnitLogScale("UNIT_LOG_SCALE"),
        UnitReverseLogScale("UNIT_REVERSE_LOG_SCALE");

        private final String value;

        GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }