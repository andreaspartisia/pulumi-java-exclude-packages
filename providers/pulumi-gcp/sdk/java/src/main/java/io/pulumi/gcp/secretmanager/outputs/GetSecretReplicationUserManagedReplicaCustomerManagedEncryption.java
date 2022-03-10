// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSecretReplicationUserManagedReplicaCustomerManagedEncryption {
    private final String kmsKeyName;

    @OutputCustomType.Constructor
    private GetSecretReplicationUserManagedReplicaCustomerManagedEncryption(@OutputCustomType.Parameter("kmsKeyName") String kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretReplicationUserManagedReplicaCustomerManagedEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretReplicationUserManagedReplicaCustomerManagedEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public GetSecretReplicationUserManagedReplicaCustomerManagedEncryption build() {
            return new GetSecretReplicationUserManagedReplicaCustomerManagedEncryption(kmsKeyName);
        }
    }
}
