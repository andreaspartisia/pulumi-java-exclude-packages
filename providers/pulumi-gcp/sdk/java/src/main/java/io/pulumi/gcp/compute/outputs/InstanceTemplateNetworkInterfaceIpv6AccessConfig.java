// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceTemplateNetworkInterfaceIpv6AccessConfig {
    private final @Nullable String externalIpv6;
    private final @Nullable String externalIpv6PrefixLength;
    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
     */
    private final String networkTier;
    private final @Nullable String publicPtrDomainName;

    @OutputCustomType.Constructor
    private InstanceTemplateNetworkInterfaceIpv6AccessConfig(
        @OutputCustomType.Parameter("externalIpv6") @Nullable String externalIpv6,
        @OutputCustomType.Parameter("externalIpv6PrefixLength") @Nullable String externalIpv6PrefixLength,
        @OutputCustomType.Parameter("networkTier") String networkTier,
        @OutputCustomType.Parameter("publicPtrDomainName") @Nullable String publicPtrDomainName) {
        this.externalIpv6 = externalIpv6;
        this.externalIpv6PrefixLength = externalIpv6PrefixLength;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
    }

    public Optional<String> getExternalIpv6() {
        return Optional.ofNullable(this.externalIpv6);
    }
    public Optional<String> getExternalIpv6PrefixLength() {
        return Optional.ofNullable(this.externalIpv6PrefixLength);
    }
    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
    */
    public String getNetworkTier() {
        return this.networkTier;
    }
    public Optional<String> getPublicPtrDomainName() {
        return Optional.ofNullable(this.publicPtrDomainName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateNetworkInterfaceIpv6AccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String externalIpv6;
        private @Nullable String externalIpv6PrefixLength;
        private String networkTier;
        private @Nullable String publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateNetworkInterfaceIpv6AccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder setExternalIpv6(@Nullable String externalIpv6) {
            this.externalIpv6 = externalIpv6;
            return this;
        }

        public Builder setExternalIpv6PrefixLength(@Nullable String externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = externalIpv6PrefixLength;
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setPublicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }
        public InstanceTemplateNetworkInterfaceIpv6AccessConfig build() {
            return new InstanceTemplateNetworkInterfaceIpv6AccessConfig(externalIpv6, externalIpv6PrefixLength, networkTier, publicPtrDomainName);
        }
    }
}
