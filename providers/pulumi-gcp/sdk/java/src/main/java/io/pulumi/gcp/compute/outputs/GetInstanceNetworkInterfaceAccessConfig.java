// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceNetworkInterfaceAccessConfig {
    /**
     * The IP address that is be 1:1 mapped to the instance's
     * network ip.
     * 
     */
    private final String natIp;
    /**
     * The [networking tier][network-tier] used for configuring this instance. One of `PREMIUM` or `STANDARD`.
     * 
     */
    private final String networkTier;
    /**
     * The DNS domain name for the public PTR record.
     * 
     */
    private final String publicPtrDomainName;

    @OutputCustomType.Constructor
    private GetInstanceNetworkInterfaceAccessConfig(
        @OutputCustomType.Parameter("natIp") String natIp,
        @OutputCustomType.Parameter("networkTier") String networkTier,
        @OutputCustomType.Parameter("publicPtrDomainName") String publicPtrDomainName) {
        this.natIp = natIp;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
    }

    /**
     * The IP address that is be 1:1 mapped to the instance's
     * network ip.
     * 
    */
    public String getNatIp() {
        return this.natIp;
    }
    /**
     * The [networking tier][network-tier] used for configuring this instance. One of `PREMIUM` or `STANDARD`.
     * 
    */
    public String getNetworkTier() {
        return this.networkTier;
    }
    /**
     * The DNS domain name for the public PTR record.
     * 
    */
    public String getPublicPtrDomainName() {
        return this.publicPtrDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkInterfaceAccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String natIp;
        private String networkTier;
        private String publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceNetworkInterfaceAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natIp = defaults.natIp;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder setNatIp(String natIp) {
            this.natIp = Objects.requireNonNull(natIp);
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setPublicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }
        public GetInstanceNetworkInterfaceAccessConfig build() {
            return new GetInstanceNetworkInterfaceAccessConfig(natIp, networkTier, publicPtrDomainName);
        }
    }
}
