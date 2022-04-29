// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironmentItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironment {
    /**
     * @return List of parameters defined for a deployment pipeline.
     * 
     */
    private final List<GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironmentItem> items;

    @CustomType.Constructor
    private GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironment(@CustomType.Parameter("items") List<GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironmentItem> items) {
        this.items = items;
    }

    /**
     * @return List of parameters defined for a deployment pipeline.
     * 
     */
    public List<GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironmentItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironmentItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironmentItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironmentItem... items) {
            return items(List.of(items));
        }        public GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironment build() {
            return new GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineEnvironment(items);
        }
    }
}
