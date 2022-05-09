// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BastionHostIpConfiguration {
    /**
     * @return The name of the IP configuration.
     * 
     */
    private final String name;
    /**
     * @return Reference to a Public IP Address to associate with this Bastion Host.
     * 
     */
    private final String publicIpAddressId;
    /**
     * @return Reference to a subnet in which this Bastion Host has been created.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private BastionHostIpConfiguration(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publicIpAddressId") String publicIpAddressId,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.name = name;
        this.publicIpAddressId = publicIpAddressId;
        this.subnetId = subnetId;
    }

    /**
     * @return The name of the IP configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Reference to a Public IP Address to associate with this Bastion Host.
     * 
     */
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }
    /**
     * @return Reference to a subnet in which this Bastion Host has been created.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BastionHostIpConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String publicIpAddressId;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(BastionHostIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publicIpAddressId(String publicIpAddressId) {
            this.publicIpAddressId = Objects.requireNonNull(publicIpAddressId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public BastionHostIpConfiguration build() {
            return new BastionHostIpConfiguration(name, publicIpAddressId, subnetId);
        }
    }
}
