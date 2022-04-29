// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentsDeploymentCollectionSpecificationRequestPolicyAuthentication;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentsDeploymentCollectionSpecificationRequestPolicyCor;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentsDeploymentCollectionSpecificationRequestPolicyMutualTl;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentsDeploymentCollectionSpecificationRequestPolicyRateLimiting;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentsDeploymentCollectionSpecificationRequestPolicy {
    /**
     * @return Information on how to authenticate incoming requests.
     * 
     */
    private final List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyAuthentication> authentications;
    /**
     * @return Enable CORS (Cross-Origin-Resource-Sharing) request handling.
     * 
     */
    private final List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyCor> cors;
    /**
     * @return Properties used to configure client mTLS verification when API Consumer makes connection to the gateway.
     * 
     */
    private final List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyMutualTl> mutualTls;
    /**
     * @return Limit the number of requests that should be handled for the specified window using a specfic key.
     * 
     */
    private final List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyRateLimiting> rateLimitings;

    @CustomType.Constructor
    private GetDeploymentsDeploymentCollectionSpecificationRequestPolicy(
        @CustomType.Parameter("authentications") List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyAuthentication> authentications,
        @CustomType.Parameter("cors") List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyCor> cors,
        @CustomType.Parameter("mutualTls") List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyMutualTl> mutualTls,
        @CustomType.Parameter("rateLimitings") List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyRateLimiting> rateLimitings) {
        this.authentications = authentications;
        this.cors = cors;
        this.mutualTls = mutualTls;
        this.rateLimitings = rateLimitings;
    }

    /**
     * @return Information on how to authenticate incoming requests.
     * 
     */
    public List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyAuthentication> authentications() {
        return this.authentications;
    }
    /**
     * @return Enable CORS (Cross-Origin-Resource-Sharing) request handling.
     * 
     */
    public List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyCor> cors() {
        return this.cors;
    }
    /**
     * @return Properties used to configure client mTLS verification when API Consumer makes connection to the gateway.
     * 
     */
    public List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyMutualTl> mutualTls() {
        return this.mutualTls;
    }
    /**
     * @return Limit the number of requests that should be handled for the specified window using a specfic key.
     * 
     */
    public List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyRateLimiting> rateLimitings() {
        return this.rateLimitings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentsDeploymentCollectionSpecificationRequestPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyAuthentication> authentications;
        private List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyCor> cors;
        private List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyMutualTl> mutualTls;
        private List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyRateLimiting> rateLimitings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentsDeploymentCollectionSpecificationRequestPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentications = defaults.authentications;
    	      this.cors = defaults.cors;
    	      this.mutualTls = defaults.mutualTls;
    	      this.rateLimitings = defaults.rateLimitings;
        }

        public Builder authentications(List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyAuthentication> authentications) {
            this.authentications = Objects.requireNonNull(authentications);
            return this;
        }
        public Builder authentications(GetDeploymentsDeploymentCollectionSpecificationRequestPolicyAuthentication... authentications) {
            return authentications(List.of(authentications));
        }
        public Builder cors(List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyCor> cors) {
            this.cors = Objects.requireNonNull(cors);
            return this;
        }
        public Builder cors(GetDeploymentsDeploymentCollectionSpecificationRequestPolicyCor... cors) {
            return cors(List.of(cors));
        }
        public Builder mutualTls(List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyMutualTl> mutualTls) {
            this.mutualTls = Objects.requireNonNull(mutualTls);
            return this;
        }
        public Builder mutualTls(GetDeploymentsDeploymentCollectionSpecificationRequestPolicyMutualTl... mutualTls) {
            return mutualTls(List.of(mutualTls));
        }
        public Builder rateLimitings(List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicyRateLimiting> rateLimitings) {
            this.rateLimitings = Objects.requireNonNull(rateLimitings);
            return this;
        }
        public Builder rateLimitings(GetDeploymentsDeploymentCollectionSpecificationRequestPolicyRateLimiting... rateLimitings) {
            return rateLimitings(List.of(rateLimitings));
        }        public GetDeploymentsDeploymentCollectionSpecificationRequestPolicy build() {
            return new GetDeploymentsDeploymentCollectionSpecificationRequestPolicy(authentications, cors, mutualTls, rateLimitings);
        }
    }
}
