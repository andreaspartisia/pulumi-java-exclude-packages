// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum EnvironmentLoggingLevel {
        Critical("CRITICAL"),
        Error("ERROR"),
        Warning("WARNING"),
        Info("INFO"),
        Debug("DEBUG");

        private final String value;

        EnvironmentLoggingLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EnvironmentLoggingLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }