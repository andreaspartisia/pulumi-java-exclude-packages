// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineArtifactItemDeployPipelineStageItem {
    /**
     * @return The OCID of a stage
     * 
     */
    private final String deployStageId;
    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    private final String displayName;

    @CustomType.Constructor
    private GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineArtifactItemDeployPipelineStageItem(
        @CustomType.Parameter("deployStageId") String deployStageId,
        @CustomType.Parameter("displayName") String displayName) {
        this.deployStageId = deployStageId;
        this.displayName = displayName;
    }

    /**
     * @return The OCID of a stage
     * 
     */
    public String deployStageId() {
        return this.deployStageId;
    }
    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineArtifactItemDeployPipelineStageItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deployStageId;
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineArtifactItemDeployPipelineStageItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployStageId = defaults.deployStageId;
    	      this.displayName = defaults.displayName;
        }

        public Builder deployStageId(String deployStageId) {
            this.deployStageId = Objects.requireNonNull(deployStageId);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }        public GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineArtifactItemDeployPipelineStageItem build() {
            return new GetDeployPipelinesDeployPipelineCollectionItemDeployPipelineArtifactItemDeployPipelineStageItem(deployStageId, displayName);
        }
    }
}
