// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuthenticationPolicyNetworkPolicy {
    /**
     * @return Network Source ids
     * 
     */
    private final List<String> networkSourceIds;

    @CustomType.Constructor
    private GetAuthenticationPolicyNetworkPolicy(@CustomType.Parameter("networkSourceIds") List<String> networkSourceIds) {
        this.networkSourceIds = networkSourceIds;
    }

    /**
     * @return Network Source ids
     * 
     */
    public List<String> networkSourceIds() {
        return this.networkSourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthenticationPolicyNetworkPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> networkSourceIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthenticationPolicyNetworkPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkSourceIds = defaults.networkSourceIds;
        }

        public Builder networkSourceIds(List<String> networkSourceIds) {
            this.networkSourceIds = Objects.requireNonNull(networkSourceIds);
            return this;
        }
        public Builder networkSourceIds(String... networkSourceIds) {
            return networkSourceIds(List.of(networkSourceIds));
        }        public GetAuthenticationPolicyNetworkPolicy build() {
            return new GetAuthenticationPolicyNetworkPolicy(networkSourceIds);
        }
    }
}
