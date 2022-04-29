// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.DeploymentDeployArtifactOverrideArgumentsItem;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentDeployArtifactOverrideArguments {
    /**
     * @return List of arguments provided at the time of deployment.
     * 
     */
    private final @Nullable List<DeploymentDeployArtifactOverrideArgumentsItem> items;

    @CustomType.Constructor
    private DeploymentDeployArtifactOverrideArguments(@CustomType.Parameter("items") @Nullable List<DeploymentDeployArtifactOverrideArgumentsItem> items) {
        this.items = items;
    }

    /**
     * @return List of arguments provided at the time of deployment.
     * 
     */
    public List<DeploymentDeployArtifactOverrideArgumentsItem> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentDeployArtifactOverrideArguments defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DeploymentDeployArtifactOverrideArgumentsItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentDeployArtifactOverrideArguments defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable List<DeploymentDeployArtifactOverrideArgumentsItem> items) {
            this.items = items;
            return this;
        }
        public Builder items(DeploymentDeployArtifactOverrideArgumentsItem... items) {
            return items(List.of(items));
        }        public DeploymentDeployArtifactOverrideArguments build() {
            return new DeploymentDeployArtifactOverrideArguments(items);
        }
    }
}
