// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum PackageManager {
        ManagerUnspecified("MANAGER_UNSPECIFIED"),
        Any("ANY"),
        Apt("APT"),
        Yum("YUM"),
        Zypper("ZYPPER"),
        Goo("GOO");

        private final String value;

        PackageManager(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PackageManager[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }