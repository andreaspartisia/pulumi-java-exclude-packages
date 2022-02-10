// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum KeyVersionSpecAlgorithm {
        SignHashAlgorithmUnspecified("SIGN_HASH_ALGORITHM_UNSPECIFIED"),
        RsaPss2048Sha256("RSA_PSS_2048_SHA256"),
        RsaPss3072Sha256("RSA_PSS_3072_SHA256"),
        RsaPss4096Sha256("RSA_PSS_4096_SHA256"),
        RsaPkcs12048Sha256("RSA_PKCS1_2048_SHA256"),
        RsaPkcs13072Sha256("RSA_PKCS1_3072_SHA256"),
        RsaPkcs14096Sha256("RSA_PKCS1_4096_SHA256"),
        EcP256Sha256("EC_P256_SHA256"),
        EcP384Sha384("EC_P384_SHA384");

        private final String value;

        KeyVersionSpecAlgorithm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "KeyVersionSpecAlgorithm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }