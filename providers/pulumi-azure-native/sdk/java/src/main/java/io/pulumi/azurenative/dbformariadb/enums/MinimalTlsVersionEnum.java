// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum MinimalTlsVersionEnum {
        TLS1_0("TLS1_0"),
        TLS1_1("TLS1_1"),
        TLS1_2("TLS1_2"),
        TLSEnforcementDisabled("TLSEnforcementDisabled");

        private final String value;

        MinimalTlsVersionEnum(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MinimalTlsVersionEnum[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }