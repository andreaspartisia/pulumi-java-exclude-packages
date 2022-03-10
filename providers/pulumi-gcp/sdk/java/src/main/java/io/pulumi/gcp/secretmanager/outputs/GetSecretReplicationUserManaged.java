// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.secretmanager.outputs.GetSecretReplicationUserManagedReplica;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSecretReplicationUserManaged {
    private final List<GetSecretReplicationUserManagedReplica> replicas;

    @OutputCustomType.Constructor
    private GetSecretReplicationUserManaged(@OutputCustomType.Parameter("replicas") List<GetSecretReplicationUserManagedReplica> replicas) {
        this.replicas = replicas;
    }

    public List<GetSecretReplicationUserManagedReplica> getReplicas() {
        return this.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretReplicationUserManaged defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSecretReplicationUserManagedReplica> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretReplicationUserManaged defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder setReplicas(List<GetSecretReplicationUserManagedReplica> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }
        public GetSecretReplicationUserManaged build() {
            return new GetSecretReplicationUserManaged(replicas);
        }
    }
}
