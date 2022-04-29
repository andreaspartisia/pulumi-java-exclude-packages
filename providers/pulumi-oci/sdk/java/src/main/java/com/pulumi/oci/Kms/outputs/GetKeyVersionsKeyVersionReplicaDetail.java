// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKeyVersionsKeyVersionReplicaDetail {
    /**
     * @return ReplicationId associated with a key version operation
     * 
     */
    private final String replicationId;

    @CustomType.Constructor
    private GetKeyVersionsKeyVersionReplicaDetail(@CustomType.Parameter("replicationId") String replicationId) {
        this.replicationId = replicationId;
    }

    /**
     * @return ReplicationId associated with a key version operation
     * 
     */
    public String replicationId() {
        return this.replicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyVersionsKeyVersionReplicaDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String replicationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyVersionsKeyVersionReplicaDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationId = defaults.replicationId;
        }

        public Builder replicationId(String replicationId) {
            this.replicationId = Objects.requireNonNull(replicationId);
            return this;
        }        public GetKeyVersionsKeyVersionReplicaDetail build() {
            return new GetKeyVersionsKeyVersionReplicaDetail(replicationId);
        }
    }
}
