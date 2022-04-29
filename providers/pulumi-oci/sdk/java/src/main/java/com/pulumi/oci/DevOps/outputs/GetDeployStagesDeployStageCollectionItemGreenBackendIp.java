// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeployStagesDeployStageCollectionItemGreenBackendIp {
    /**
     * @return The IP address of the backend server. A server could be a compute instance or a load balancer.
     * 
     */
    private final List<String> items;

    @CustomType.Constructor
    private GetDeployStagesDeployStageCollectionItemGreenBackendIp(@CustomType.Parameter("items") List<String> items) {
        this.items = items;
    }

    /**
     * @return The IP address of the backend server. A server could be a compute instance or a load balancer.
     * 
     */
    public List<String> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeployStagesDeployStageCollectionItemGreenBackendIp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeployStagesDeployStageCollectionItemGreenBackendIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public GetDeployStagesDeployStageCollectionItemGreenBackendIp build() {
            return new GetDeployStagesDeployStageCollectionItemGreenBackendIp(items);
        }
    }
}
