// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeployEnvironmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeployEnvironmentArgs Empty = new GetDeployEnvironmentArgs();

    /**
     * Unique environment identifier.
     * 
     */
    @Import(name="deployEnvironmentId", required=true)
    private String deployEnvironmentId;

    /**
     * @return Unique environment identifier.
     * 
     */
    public String deployEnvironmentId() {
        return this.deployEnvironmentId;
    }

    private GetDeployEnvironmentArgs() {}

    private GetDeployEnvironmentArgs(GetDeployEnvironmentArgs $) {
        this.deployEnvironmentId = $.deployEnvironmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeployEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeployEnvironmentArgs $;

        public Builder() {
            $ = new GetDeployEnvironmentArgs();
        }

        public Builder(GetDeployEnvironmentArgs defaults) {
            $ = new GetDeployEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deployEnvironmentId Unique environment identifier.
         * 
         * @return builder
         * 
         */
        public Builder deployEnvironmentId(String deployEnvironmentId) {
            $.deployEnvironmentId = deployEnvironmentId;
            return this;
        }

        public GetDeployEnvironmentArgs build() {
            $.deployEnvironmentId = Objects.requireNonNull($.deployEnvironmentId, "expected parameter 'deployEnvironmentId' to be non-null");
            return $;
        }
    }

}
