// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApiGateway.outputs.GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeaderItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeader {
    /**
     * @return The list of headers.
     * 
     */
    private final List<GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeaderItem> items;

    @CustomType.Constructor
    private GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeader(@CustomType.Parameter("items") List<GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeaderItem> items) {
        this.items = items;
    }

    /**
     * @return The list of headers.
     * 
     */
    public List<GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeaderItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeaderItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeaderItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeaderItem... items) {
            return items(List.of(items));
        }        public GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeader build() {
            return new GetApiDeploymentSpecificationRouteRequestPolicyHeaderTransformationRenameHeader(items);
        }
    }
}
