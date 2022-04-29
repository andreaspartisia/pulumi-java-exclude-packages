// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentSpecificationRouteRequestPoliciesHeaderValidationsHeader {
    /**
     * @return (Updatable) The case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    private final String name;
    /**
     * @return (Updatable) Determines if the parameter is required in the request.
     * 
     */
    private final @Nullable Boolean required;

    @CustomType.Constructor
    private DeploymentSpecificationRouteRequestPoliciesHeaderValidationsHeader(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("required") @Nullable Boolean required) {
        this.name = name;
        this.required = required;
    }

    /**
     * @return (Updatable) The case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Updatable) Determines if the parameter is required in the request.
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpecificationRouteRequestPoliciesHeaderValidationsHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable Boolean required;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpecificationRouteRequestPoliciesHeaderValidationsHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.required = defaults.required;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }        public DeploymentSpecificationRouteRequestPoliciesHeaderValidationsHeader build() {
            return new DeploymentSpecificationRouteRequestPoliciesHeaderValidationsHeader(name, required);
        }
    }
}
