// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeaderItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeader {
    /**
     * @return The list of headers.
     * 
     */
    private final List<GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeaderItem> items;

    @CustomType.Constructor
    private GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeader(@CustomType.Parameter("items") List<GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeaderItem> items) {
        this.items = items;
    }

    /**
     * @return The list of headers.
     * 
     */
    public List<GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeaderItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeaderItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeaderItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeaderItem... items) {
            return items(List.of(items));
        }        public GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeader build() {
            return new GetDeploymentsDeploymentCollectionSpecificationRouteRequestPolicyHeaderTransformationSetHeader(items);
        }
    }
}
