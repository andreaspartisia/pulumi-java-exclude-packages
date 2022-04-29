// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs Empty = new DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs();

    /**
     * (Updatable) The original case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    @Import(name="from", required=true)
    private Output<String> from;

    /**
     * @return (Updatable) The original case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    public Output<String> from() {
        return this.from;
    }

    /**
     * (Updatable) The new name of the header.  This name must be unique across transformation policies.
     * 
     */
    @Import(name="to", required=true)
    private Output<String> to;

    /**
     * @return (Updatable) The new name of the header.  This name must be unique across transformation policies.
     * 
     */
    public Output<String> to() {
        return this.to;
    }

    private DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs() {}

    private DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs(DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs $) {
        this.from = $.from;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs $;

        public Builder() {
            $ = new DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs();
        }

        public Builder(DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs defaults) {
            $ = new DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param from (Updatable) The original case-insensitive name of the header.  This name must be unique across transformation policies.
         * 
         * @return builder
         * 
         */
        public Builder from(Output<String> from) {
            $.from = from;
            return this;
        }

        /**
         * @param from (Updatable) The original case-insensitive name of the header.  This name must be unique across transformation policies.
         * 
         * @return builder
         * 
         */
        public Builder from(String from) {
            return from(Output.of(from));
        }

        /**
         * @param to (Updatable) The new name of the header.  This name must be unique across transformation policies.
         * 
         * @return builder
         * 
         */
        public Builder to(Output<String> to) {
            $.to = to;
            return this;
        }

        /**
         * @param to (Updatable) The new name of the header.  This name must be unique across transformation policies.
         * 
         * @return builder
         * 
         */
        public Builder to(String to) {
            return to(Output.of(to));
        }

        public DeploymentSpecificationRouteResponsePoliciesHeaderTransformationsRenameHeadersItemArgs build() {
            $.from = Objects.requireNonNull($.from, "expected parameter 'from' to be non-null");
            $.to = Objects.requireNonNull($.to, "expected parameter 'to' to be non-null");
            return $;
        }
    }

}
