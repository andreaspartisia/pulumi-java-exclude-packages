// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetInstancePoolPlacementConfigurationSecondaryVnicSubnet;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstancePoolPlacementConfiguration {
    /**
     * @return The availability domain to place instances.  Example: `Uocm:PHX-AD-1`
     * 
     */
    private final String availabilityDomain;
    /**
     * @return The fault domains to place instances.
     * 
     */
    private final List<String> faultDomains;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the primary subnet to place instances.
     * 
     */
    private final String primarySubnetId;
    /**
     * @return The set of secondary VNIC data for instances in the pool.
     * 
     */
    private final List<GetInstancePoolPlacementConfigurationSecondaryVnicSubnet> secondaryVnicSubnets;

    @CustomType.Constructor
    private GetInstancePoolPlacementConfiguration(
        @CustomType.Parameter("availabilityDomain") String availabilityDomain,
        @CustomType.Parameter("faultDomains") List<String> faultDomains,
        @CustomType.Parameter("primarySubnetId") String primarySubnetId,
        @CustomType.Parameter("secondaryVnicSubnets") List<GetInstancePoolPlacementConfigurationSecondaryVnicSubnet> secondaryVnicSubnets) {
        this.availabilityDomain = availabilityDomain;
        this.faultDomains = faultDomains;
        this.primarySubnetId = primarySubnetId;
        this.secondaryVnicSubnets = secondaryVnicSubnets;
    }

    /**
     * @return The availability domain to place instances.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return The fault domains to place instances.
     * 
     */
    public List<String> faultDomains() {
        return this.faultDomains;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the primary subnet to place instances.
     * 
     */
    public String primarySubnetId() {
        return this.primarySubnetId;
    }
    /**
     * @return The set of secondary VNIC data for instances in the pool.
     * 
     */
    public List<GetInstancePoolPlacementConfigurationSecondaryVnicSubnet> secondaryVnicSubnets() {
        return this.secondaryVnicSubnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancePoolPlacementConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityDomain;
        private List<String> faultDomains;
        private String primarySubnetId;
        private List<GetInstancePoolPlacementConfigurationSecondaryVnicSubnet> secondaryVnicSubnets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancePoolPlacementConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.faultDomains = defaults.faultDomains;
    	      this.primarySubnetId = defaults.primarySubnetId;
    	      this.secondaryVnicSubnets = defaults.secondaryVnicSubnets;
        }

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder faultDomains(List<String> faultDomains) {
            this.faultDomains = Objects.requireNonNull(faultDomains);
            return this;
        }
        public Builder faultDomains(String... faultDomains) {
            return faultDomains(List.of(faultDomains));
        }
        public Builder primarySubnetId(String primarySubnetId) {
            this.primarySubnetId = Objects.requireNonNull(primarySubnetId);
            return this;
        }
        public Builder secondaryVnicSubnets(List<GetInstancePoolPlacementConfigurationSecondaryVnicSubnet> secondaryVnicSubnets) {
            this.secondaryVnicSubnets = Objects.requireNonNull(secondaryVnicSubnets);
            return this;
        }
        public Builder secondaryVnicSubnets(GetInstancePoolPlacementConfigurationSecondaryVnicSubnet... secondaryVnicSubnets) {
            return secondaryVnicSubnets(List.of(secondaryVnicSubnets));
        }        public GetInstancePoolPlacementConfiguration build() {
            return new GetInstancePoolPlacementConfiguration(availabilityDomain, faultDomains, primarySubnetId, secondaryVnicSubnets);
        }
    }
}
