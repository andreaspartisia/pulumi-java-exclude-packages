// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetDeployPipelineDeployPipelineArtifactItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeployPipelineDeployPipelineArtifact {
    /**
     * @return List of parameters defined for a deployment pipeline.
     * 
     */
    private final List<GetDeployPipelineDeployPipelineArtifactItem> items;

    @CustomType.Constructor
    private GetDeployPipelineDeployPipelineArtifact(@CustomType.Parameter("items") List<GetDeployPipelineDeployPipelineArtifactItem> items) {
        this.items = items;
    }

    /**
     * @return List of parameters defined for a deployment pipeline.
     * 
     */
    public List<GetDeployPipelineDeployPipelineArtifactItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeployPipelineDeployPipelineArtifact defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDeployPipelineDeployPipelineArtifactItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeployPipelineDeployPipelineArtifact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetDeployPipelineDeployPipelineArtifactItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetDeployPipelineDeployPipelineArtifactItem... items) {
            return items(List.of(items));
        }        public GetDeployPipelineDeployPipelineArtifact build() {
            return new GetDeployPipelineDeployPipelineArtifact(items);
        }
    }
}
