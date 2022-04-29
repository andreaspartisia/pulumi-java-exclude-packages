// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetDeployPipelineDeployPipelineArtifactItemDeployPipelineStage;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeployPipelineDeployPipelineArtifactItem {
    /**
     * @return The OCID of an artifact
     * 
     */
    private final String deployArtifactId;
    /**
     * @return List of stages.
     * 
     */
    private final List<GetDeployPipelineDeployPipelineArtifactItemDeployPipelineStage> deployPipelineStages;
    /**
     * @return Deployment pipeline display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     * 
     */
    private final String displayName;

    @CustomType.Constructor
    private GetDeployPipelineDeployPipelineArtifactItem(
        @CustomType.Parameter("deployArtifactId") String deployArtifactId,
        @CustomType.Parameter("deployPipelineStages") List<GetDeployPipelineDeployPipelineArtifactItemDeployPipelineStage> deployPipelineStages,
        @CustomType.Parameter("displayName") String displayName) {
        this.deployArtifactId = deployArtifactId;
        this.deployPipelineStages = deployPipelineStages;
        this.displayName = displayName;
    }

    /**
     * @return The OCID of an artifact
     * 
     */
    public String deployArtifactId() {
        return this.deployArtifactId;
    }
    /**
     * @return List of stages.
     * 
     */
    public List<GetDeployPipelineDeployPipelineArtifactItemDeployPipelineStage> deployPipelineStages() {
        return this.deployPipelineStages;
    }
    /**
     * @return Deployment pipeline display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeployPipelineDeployPipelineArtifactItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deployArtifactId;
        private List<GetDeployPipelineDeployPipelineArtifactItemDeployPipelineStage> deployPipelineStages;
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeployPipelineDeployPipelineArtifactItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployArtifactId = defaults.deployArtifactId;
    	      this.deployPipelineStages = defaults.deployPipelineStages;
    	      this.displayName = defaults.displayName;
        }

        public Builder deployArtifactId(String deployArtifactId) {
            this.deployArtifactId = Objects.requireNonNull(deployArtifactId);
            return this;
        }
        public Builder deployPipelineStages(List<GetDeployPipelineDeployPipelineArtifactItemDeployPipelineStage> deployPipelineStages) {
            this.deployPipelineStages = Objects.requireNonNull(deployPipelineStages);
            return this;
        }
        public Builder deployPipelineStages(GetDeployPipelineDeployPipelineArtifactItemDeployPipelineStage... deployPipelineStages) {
            return deployPipelineStages(List.of(deployPipelineStages));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }        public GetDeployPipelineDeployPipelineArtifactItem build() {
            return new GetDeployPipelineDeployPipelineArtifactItem(deployArtifactId, deployPipelineStages, displayName);
        }
    }
}
