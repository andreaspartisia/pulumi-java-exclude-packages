// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerRoutingPolicyRuleAction {
    /**
     * @return Name of the backend set the listener will forward the traffic to.  Example: `backendSetForImages`
     * 
     */
    private final String backendSetName;
    /**
     * @return A unique name for the routing policy rule. Avoid entering confidential information.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetLoadBalancerRoutingPolicyRuleAction(
        @CustomType.Parameter("backendSetName") String backendSetName,
        @CustomType.Parameter("name") String name) {
        this.backendSetName = backendSetName;
        this.name = name;
    }

    /**
     * @return Name of the backend set the listener will forward the traffic to.  Example: `backendSetForImages`
     * 
     */
    public String backendSetName() {
        return this.backendSetName;
    }
    /**
     * @return A unique name for the routing policy rule. Avoid entering confidential information.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerRoutingPolicyRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendSetName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerRoutingPolicyRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendSetName = defaults.backendSetName;
    	      this.name = defaults.name;
        }

        public Builder backendSetName(String backendSetName) {
            this.backendSetName = Objects.requireNonNull(backendSetName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetLoadBalancerRoutingPolicyRuleAction build() {
            return new GetLoadBalancerRoutingPolicyRuleAction(backendSetName, name);
        }
    }
}
