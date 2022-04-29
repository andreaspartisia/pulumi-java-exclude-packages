// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersLoadBalancerIpAddressDetailReservedIp {
    /**
     * @return Ocid of the pre-created public IP. That should be attahed to this load balancer.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetLoadBalancersLoadBalancerIpAddressDetailReservedIp(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * @return Ocid of the pre-created public IP. That should be attahed to this load balancer.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersLoadBalancerIpAddressDetailReservedIp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancersLoadBalancerIpAddressDetailReservedIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetLoadBalancersLoadBalancerIpAddressDetailReservedIp build() {
            return new GetLoadBalancersLoadBalancerIpAddressDetailReservedIp(id);
        }
    }
}
