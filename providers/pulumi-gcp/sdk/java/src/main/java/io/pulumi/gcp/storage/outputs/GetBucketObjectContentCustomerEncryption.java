// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBucketObjectContentCustomerEncryption {
    private final String encryptionAlgorithm;
    private final String encryptionKey;

    @OutputCustomType.Constructor
    private GetBucketObjectContentCustomerEncryption(
        @OutputCustomType.Parameter("encryptionAlgorithm") String encryptionAlgorithm,
        @OutputCustomType.Parameter("encryptionKey") String encryptionKey) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionKey = encryptionKey;
    }

    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectContentCustomerEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionAlgorithm;
        private String encryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketObjectContentCustomerEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionKey = defaults.encryptionKey;
        }

        public Builder setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }

        public Builder setEncryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }
        public GetBucketObjectContentCustomerEncryption build() {
            return new GetBucketObjectContentCustomerEncryption(encryptionAlgorithm, encryptionKey);
        }
    }
}
