// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum GRPCHealthCheckPortSpecification {
        UseFixedPort("USE_FIXED_PORT"),
        UseNamedPort("USE_NAMED_PORT"),
        UseServingPort("USE_SERVING_PORT");

        private final String value;

        GRPCHealthCheckPortSpecification(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GRPCHealthCheckPortSpecification[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }