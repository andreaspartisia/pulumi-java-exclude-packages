// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentArgs Empty = new GetDeploymentArgs();

    /**
     * The ocid of the deployment.
     * 
     */
    @Import(name="deploymentId", required=true)
    private String deploymentId;

    /**
     * @return The ocid of the deployment.
     * 
     */
    public String deploymentId() {
        return this.deploymentId;
    }

    private GetDeploymentArgs() {}

    private GetDeploymentArgs(GetDeploymentArgs $) {
        this.deploymentId = $.deploymentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentArgs $;

        public Builder() {
            $ = new GetDeploymentArgs();
        }

        public Builder(GetDeploymentArgs defaults) {
            $ = new GetDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentId The ocid of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        public GetDeploymentArgs build() {
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            return $;
        }
    }

}
