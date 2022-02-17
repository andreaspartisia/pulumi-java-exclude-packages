// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A enumeration value that specifies the status of the Macie Session.
     * 
     */
    @EnumType
    public enum SessionStatus {
        Enabled("ENABLED"),
        Paused("PAUSED");

        private final String value;

        SessionStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SessionStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }