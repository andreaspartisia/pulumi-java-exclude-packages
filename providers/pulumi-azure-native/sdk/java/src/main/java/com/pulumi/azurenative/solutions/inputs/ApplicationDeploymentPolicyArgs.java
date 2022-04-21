// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.azurenative.solutions.enums.DeploymentMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Managed application deployment policy.
 * 
 */
public final class ApplicationDeploymentPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationDeploymentPolicyArgs Empty = new ApplicationDeploymentPolicyArgs();

    /**
     * The managed application deployment mode.
     * 
     */
    @Import(name="deploymentMode", required=true)
    private Output<Either<String,DeploymentMode>> deploymentMode;

    public Output<Either<String,DeploymentMode>> deploymentMode() {
        return this.deploymentMode;
    }

    private ApplicationDeploymentPolicyArgs() {}

    private ApplicationDeploymentPolicyArgs(ApplicationDeploymentPolicyArgs $) {
        this.deploymentMode = $.deploymentMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationDeploymentPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationDeploymentPolicyArgs $;

        public Builder() {
            $ = new ApplicationDeploymentPolicyArgs();
        }

        public Builder(ApplicationDeploymentPolicyArgs defaults) {
            $ = new ApplicationDeploymentPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder deploymentMode(Output<Either<String,DeploymentMode>> deploymentMode) {
            $.deploymentMode = deploymentMode;
            return this;
        }

        public Builder deploymentMode(Either<String,DeploymentMode> deploymentMode) {
            return deploymentMode(Output.of(deploymentMode));
        }

        public Builder deploymentMode(String deploymentMode) {
            return deploymentMode(Either.ofLeft(deploymentMode));
        }

        public Builder deploymentMode(DeploymentMode deploymentMode) {
            return deploymentMode(Either.ofRight(deploymentMode));
        }

        public ApplicationDeploymentPolicyArgs build() {
            $.deploymentMode = Objects.requireNonNull($.deploymentMode, "expected parameter 'deploymentMode' to be non-null");
            return $;
        }
    }

}
