// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AuthorityKeySpec {
    /**
     * The algorithm to use for creating a managed Cloud KMS key for a for a simplified
     * experience. All managed keys will be have their ProtectionLevel as HSM.
     * Possible values are `SIGN_HASH_ALGORITHM_UNSPECIFIED`, `RSA_PSS_2048_SHA256`, `RSA_PSS_3072_SHA256`, `RSA_PSS_4096_SHA256`, `RSA_PKCS1_2048_SHA256`, `RSA_PKCS1_3072_SHA256`, `RSA_PKCS1_4096_SHA256`, `EC_P256_SHA256`, and `EC_P384_SHA384`.
     * 
     */
    private final @Nullable String algorithm;
    /**
     * The resource name for an existing Cloud KMS CryptoKeyVersion in the format
     * `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`.
     * 
     */
    private final @Nullable String cloudKmsKeyVersion;

    @OutputCustomType.Constructor
    private AuthorityKeySpec(
        @OutputCustomType.Parameter("algorithm") @Nullable String algorithm,
        @OutputCustomType.Parameter("cloudKmsKeyVersion") @Nullable String cloudKmsKeyVersion) {
        this.algorithm = algorithm;
        this.cloudKmsKeyVersion = cloudKmsKeyVersion;
    }

    /**
     * The algorithm to use for creating a managed Cloud KMS key for a for a simplified
     * experience. All managed keys will be have their ProtectionLevel as HSM.
     * Possible values are `SIGN_HASH_ALGORITHM_UNSPECIFIED`, `RSA_PSS_2048_SHA256`, `RSA_PSS_3072_SHA256`, `RSA_PSS_4096_SHA256`, `RSA_PKCS1_2048_SHA256`, `RSA_PKCS1_3072_SHA256`, `RSA_PKCS1_4096_SHA256`, `EC_P256_SHA256`, and `EC_P384_SHA384`.
     * 
    */
    public Optional<String> getAlgorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    /**
     * The resource name for an existing Cloud KMS CryptoKeyVersion in the format
     * `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`.
     * 
    */
    public Optional<String> getCloudKmsKeyVersion() {
        return Optional.ofNullable(this.cloudKmsKeyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityKeySpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable String cloudKmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityKeySpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.cloudKmsKeyVersion = defaults.cloudKmsKeyVersion;
        }

        public Builder setAlgorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setCloudKmsKeyVersion(@Nullable String cloudKmsKeyVersion) {
            this.cloudKmsKeyVersion = cloudKmsKeyVersion;
            return this;
        }
        public AuthorityKeySpec build() {
            return new AuthorityKeySpec(algorithm, cloudKmsKeyVersion);
        }
    }
}
