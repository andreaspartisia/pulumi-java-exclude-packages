// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.spanner_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EncryptionInfoResponse {
    /**
     * If present, the status of a recent encrypt/decrypt call on underlying data for this database or backup. Regardless of status, data is always encrypted at rest.
     * 
     */
    private final StatusResponse encryptionStatus;
    /**
     * The type of encryption.
     * 
     */
    private final String encryptionType;
    /**
     * A Cloud KMS key version that is being used to protect the database or backup.
     * 
     */
    private final String kmsKeyVersion;

    @CustomType.Constructor
    private EncryptionInfoResponse(
        @CustomType.Parameter("encryptionStatus") StatusResponse encryptionStatus,
        @CustomType.Parameter("encryptionType") String encryptionType,
        @CustomType.Parameter("kmsKeyVersion") String kmsKeyVersion) {
        this.encryptionStatus = encryptionStatus;
        this.encryptionType = encryptionType;
        this.kmsKeyVersion = kmsKeyVersion;
    }

    /**
     * If present, the status of a recent encrypt/decrypt call on underlying data for this database or backup. Regardless of status, data is always encrypted at rest.
     * 
    */
    public StatusResponse encryptionStatus() {
        return this.encryptionStatus;
    }
    /**
     * The type of encryption.
     * 
    */
    public String encryptionType() {
        return this.encryptionType;
    }
    /**
     * A Cloud KMS key version that is being used to protect the database or backup.
     * 
    */
    public String kmsKeyVersion() {
        return this.kmsKeyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusResponse encryptionStatus;
        private String encryptionType;
        private String kmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionStatus = defaults.encryptionStatus;
    	      this.encryptionType = defaults.encryptionType;
    	      this.kmsKeyVersion = defaults.kmsKeyVersion;
        }

        public Builder encryptionStatus(StatusResponse encryptionStatus) {
            this.encryptionStatus = Objects.requireNonNull(encryptionStatus);
            return this;
        }
        public Builder encryptionType(String encryptionType) {
            this.encryptionType = Objects.requireNonNull(encryptionType);
            return this;
        }
        public Builder kmsKeyVersion(String kmsKeyVersion) {
            this.kmsKeyVersion = Objects.requireNonNull(kmsKeyVersion);
            return this;
        }        public EncryptionInfoResponse build() {
            return new EncryptionInfoResponse(encryptionStatus, encryptionType, kmsKeyVersion);
        }
    }
}
