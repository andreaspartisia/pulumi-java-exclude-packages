// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum MetadataOptionsAcl {
        AclUnspecified("ACL_UNSPECIFIED"),
        AclDestinationBucketDefault("ACL_DESTINATION_BUCKET_DEFAULT"),
        AclPreserve("ACL_PRESERVE");

        private final String value;

        MetadataOptionsAcl(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetadataOptionsAcl[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }