// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DevOps.inputs.DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs Empty = new DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs();

    /**
     * List of arguments provided at the time of deployment.
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs>> items;

    /**
     * @return List of arguments provided at the time of deployment.
     * 
     */
    public Optional<Output<List<DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    private DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs() {}

    private DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs(DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs $;

        public Builder() {
            $ = new DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs();
        }

        public Builder(DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs defaults) {
            $ = new DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items List of arguments provided at the time of deployment.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items List of arguments provided at the time of deployment.
         * 
         * @return builder
         * 
         */
        public Builder items(List<DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items List of arguments provided at the time of deployment.
         * 
         * @return builder
         * 
         */
        public Builder items(DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs... items) {
            return items(List.of(items));
        }

        public DeploymentDeployPipelineEnvironmentItemDeployPipelineStageArgs build() {
            return $;
        }
    }

}
