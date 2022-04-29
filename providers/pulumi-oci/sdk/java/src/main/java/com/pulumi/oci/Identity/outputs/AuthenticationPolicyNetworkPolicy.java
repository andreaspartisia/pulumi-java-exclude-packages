// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AuthenticationPolicyNetworkPolicy {
    /**
     * @return (Updatable) Network Source ids
     * 
     */
    private final @Nullable List<String> networkSourceIds;

    @CustomType.Constructor
    private AuthenticationPolicyNetworkPolicy(@CustomType.Parameter("networkSourceIds") @Nullable List<String> networkSourceIds) {
        this.networkSourceIds = networkSourceIds;
    }

    /**
     * @return (Updatable) Network Source ids
     * 
     */
    public List<String> networkSourceIds() {
        return this.networkSourceIds == null ? List.of() : this.networkSourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationPolicyNetworkPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> networkSourceIds;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationPolicyNetworkPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkSourceIds = defaults.networkSourceIds;
        }

        public Builder networkSourceIds(@Nullable List<String> networkSourceIds) {
            this.networkSourceIds = networkSourceIds;
            return this;
        }
        public Builder networkSourceIds(String... networkSourceIds) {
            return networkSourceIds(List.of(networkSourceIds));
        }        public AuthenticationPolicyNetworkPolicy build() {
            return new AuthenticationPolicyNetworkPolicy(networkSourceIds);
        }
    }
}
