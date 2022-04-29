// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApiDeploymentSpecificationRouteRequestPolicyAuthorization {
    /**
     * @return A user whose scope includes any of these access ranges is allowed on this route. Access ranges are case-sensitive.
     * 
     */
    private final List<String> allowedScopes;
    /**
     * @return Type of the Response Cache Store Policy.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetApiDeploymentSpecificationRouteRequestPolicyAuthorization(
        @CustomType.Parameter("allowedScopes") List<String> allowedScopes,
        @CustomType.Parameter("type") String type) {
        this.allowedScopes = allowedScopes;
        this.type = type;
    }

    /**
     * @return A user whose scope includes any of these access ranges is allowed on this route. Access ranges are case-sensitive.
     * 
     */
    public List<String> allowedScopes() {
        return this.allowedScopes;
    }
    /**
     * @return Type of the Response Cache Store Policy.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiDeploymentSpecificationRouteRequestPolicyAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedScopes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiDeploymentSpecificationRouteRequestPolicyAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedScopes = defaults.allowedScopes;
    	      this.type = defaults.type;
        }

        public Builder allowedScopes(List<String> allowedScopes) {
            this.allowedScopes = Objects.requireNonNull(allowedScopes);
            return this;
        }
        public Builder allowedScopes(String... allowedScopes) {
            return allowedScopes(List.of(allowedScopes));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetApiDeploymentSpecificationRouteRequestPolicyAuthorization build() {
            return new GetApiDeploymentSpecificationRouteRequestPolicyAuthorization(allowedScopes, type);
        }
    }
}
