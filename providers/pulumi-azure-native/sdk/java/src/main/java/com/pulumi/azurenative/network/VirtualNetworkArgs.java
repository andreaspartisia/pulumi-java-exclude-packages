// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import com.pulumi.azurenative.network.inputs.DhcpOptionsArgs;
import com.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.azurenative.network.inputs.SubnetArgs;
import com.pulumi.azurenative.network.inputs.VirtualNetworkBgpCommunitiesArgs;
import com.pulumi.azurenative.network.inputs.VirtualNetworkPeeringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkArgs Empty = new VirtualNetworkArgs();

    /**
     * The AddressSpace that contains an array of IP address ranges that can be used by subnets.
     * 
     */
    @Import(name="addressSpace")
      private final @Nullable Output<AddressSpaceArgs> addressSpace;

    public Output<AddressSpaceArgs> addressSpace() {
        return this.addressSpace == null ? Codegen.empty() : this.addressSpace;
    }

    /**
     * Bgp Communities sent over ExpressRoute with each route corresponding to a prefix in this VNET.
     * 
     */
    @Import(name="bgpCommunities")
      private final @Nullable Output<VirtualNetworkBgpCommunitiesArgs> bgpCommunities;

    public Output<VirtualNetworkBgpCommunitiesArgs> bgpCommunities() {
        return this.bgpCommunities == null ? Codegen.empty() : this.bgpCommunities;
    }

    /**
     * The DDoS protection plan associated with the virtual network.
     * 
     */
    @Import(name="ddosProtectionPlan")
      private final @Nullable Output<SubResourceArgs> ddosProtectionPlan;

    public Output<SubResourceArgs> ddosProtectionPlan() {
        return this.ddosProtectionPlan == null ? Codegen.empty() : this.ddosProtectionPlan;
    }

    /**
     * The dhcpOptions that contains an array of DNS servers available to VMs deployed in the virtual network.
     * 
     */
    @Import(name="dhcpOptions")
      private final @Nullable Output<DhcpOptionsArgs> dhcpOptions;

    public Output<DhcpOptionsArgs> dhcpOptions() {
        return this.dhcpOptions == null ? Codegen.empty() : this.dhcpOptions;
    }

    /**
     * Indicates if DDoS protection is enabled for all the protected resources in the virtual network. It requires a DDoS protection plan associated with the resource.
     * 
     */
    @Import(name="enableDdosProtection")
      private final @Nullable Output<Boolean> enableDdosProtection;

    public Output<Boolean> enableDdosProtection() {
        return this.enableDdosProtection == null ? Codegen.empty() : this.enableDdosProtection;
    }

    /**
     * Indicates if VM protection is enabled for all the subnets in the virtual network.
     * 
     */
    @Import(name="enableVmProtection")
      private final @Nullable Output<Boolean> enableVmProtection;

    public Output<Boolean> enableVmProtection() {
        return this.enableVmProtection == null ? Codegen.empty() : this.enableVmProtection;
    }

    /**
     * The extended location of the virtual network.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> extendedLocation() {
        return this.extendedLocation == null ? Codegen.empty() : this.extendedLocation;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Array of IpAllocation which reference this VNET.
     * 
     */
    @Import(name="ipAllocations")
      private final @Nullable Output<List<SubResourceArgs>> ipAllocations;

    public Output<List<SubResourceArgs>> ipAllocations() {
        return this.ipAllocations == null ? Codegen.empty() : this.ipAllocations;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A list of subnets in a Virtual Network.
     * 
     */
    @Import(name="subnets")
      private final @Nullable Output<List<SubnetArgs>> subnets;

    public Output<List<SubnetArgs>> subnets() {
        return this.subnets == null ? Codegen.empty() : this.subnets;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The name of the virtual network.
     * 
     */
    @Import(name="virtualNetworkName")
      private final @Nullable Output<String> virtualNetworkName;

    public Output<String> virtualNetworkName() {
        return this.virtualNetworkName == null ? Codegen.empty() : this.virtualNetworkName;
    }

    /**
     * A list of peerings in a Virtual Network.
     * 
     */
    @Import(name="virtualNetworkPeerings")
      private final @Nullable Output<List<VirtualNetworkPeeringArgs>> virtualNetworkPeerings;

    public Output<List<VirtualNetworkPeeringArgs>> virtualNetworkPeerings() {
        return this.virtualNetworkPeerings == null ? Codegen.empty() : this.virtualNetworkPeerings;
    }

    public VirtualNetworkArgs(
        @Nullable Output<AddressSpaceArgs> addressSpace,
        @Nullable Output<VirtualNetworkBgpCommunitiesArgs> bgpCommunities,
        @Nullable Output<SubResourceArgs> ddosProtectionPlan,
        @Nullable Output<DhcpOptionsArgs> dhcpOptions,
        @Nullable Output<Boolean> enableDdosProtection,
        @Nullable Output<Boolean> enableVmProtection,
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<String> id,
        @Nullable Output<List<SubResourceArgs>> ipAllocations,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<List<SubnetArgs>> subnets,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> virtualNetworkName,
        @Nullable Output<List<VirtualNetworkPeeringArgs>> virtualNetworkPeerings) {
        this.addressSpace = addressSpace;
        this.bgpCommunities = bgpCommunities;
        this.ddosProtectionPlan = ddosProtectionPlan;
        this.dhcpOptions = dhcpOptions;
        this.enableDdosProtection = Codegen.booleanProp("enableDdosProtection").output().arg(enableDdosProtection).def(false).getNullable();
        this.enableVmProtection = Codegen.booleanProp("enableVmProtection").output().arg(enableVmProtection).def(false).getNullable();
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.ipAllocations = ipAllocations;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnets = subnets;
        this.tags = tags;
        this.virtualNetworkName = virtualNetworkName;
        this.virtualNetworkPeerings = virtualNetworkPeerings;
    }

    private VirtualNetworkArgs() {
        this.addressSpace = Codegen.empty();
        this.bgpCommunities = Codegen.empty();
        this.ddosProtectionPlan = Codegen.empty();
        this.dhcpOptions = Codegen.empty();
        this.enableDdosProtection = Codegen.empty();
        this.enableVmProtection = Codegen.empty();
        this.extendedLocation = Codegen.empty();
        this.id = Codegen.empty();
        this.ipAllocations = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.subnets = Codegen.empty();
        this.tags = Codegen.empty();
        this.virtualNetworkName = Codegen.empty();
        this.virtualNetworkPeerings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AddressSpaceArgs> addressSpace;
        private @Nullable Output<VirtualNetworkBgpCommunitiesArgs> bgpCommunities;
        private @Nullable Output<SubResourceArgs> ddosProtectionPlan;
        private @Nullable Output<DhcpOptionsArgs> dhcpOptions;
        private @Nullable Output<Boolean> enableDdosProtection;
        private @Nullable Output<Boolean> enableVmProtection;
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<String> id;
        private @Nullable Output<List<SubResourceArgs>> ipAllocations;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<List<SubnetArgs>> subnets;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> virtualNetworkName;
        private @Nullable Output<List<VirtualNetworkPeeringArgs>> virtualNetworkPeerings;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
    	      this.bgpCommunities = defaults.bgpCommunities;
    	      this.ddosProtectionPlan = defaults.ddosProtectionPlan;
    	      this.dhcpOptions = defaults.dhcpOptions;
    	      this.enableDdosProtection = defaults.enableDdosProtection;
    	      this.enableVmProtection = defaults.enableVmProtection;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.ipAllocations = defaults.ipAllocations;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkName = defaults.virtualNetworkName;
    	      this.virtualNetworkPeerings = defaults.virtualNetworkPeerings;
        }

        public Builder addressSpace(@Nullable Output<AddressSpaceArgs> addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }
        public Builder addressSpace(@Nullable AddressSpaceArgs addressSpace) {
            this.addressSpace = Codegen.ofNullable(addressSpace);
            return this;
        }
        public Builder bgpCommunities(@Nullable Output<VirtualNetworkBgpCommunitiesArgs> bgpCommunities) {
            this.bgpCommunities = bgpCommunities;
            return this;
        }
        public Builder bgpCommunities(@Nullable VirtualNetworkBgpCommunitiesArgs bgpCommunities) {
            this.bgpCommunities = Codegen.ofNullable(bgpCommunities);
            return this;
        }
        public Builder ddosProtectionPlan(@Nullable Output<SubResourceArgs> ddosProtectionPlan) {
            this.ddosProtectionPlan = ddosProtectionPlan;
            return this;
        }
        public Builder ddosProtectionPlan(@Nullable SubResourceArgs ddosProtectionPlan) {
            this.ddosProtectionPlan = Codegen.ofNullable(ddosProtectionPlan);
            return this;
        }
        public Builder dhcpOptions(@Nullable Output<DhcpOptionsArgs> dhcpOptions) {
            this.dhcpOptions = dhcpOptions;
            return this;
        }
        public Builder dhcpOptions(@Nullable DhcpOptionsArgs dhcpOptions) {
            this.dhcpOptions = Codegen.ofNullable(dhcpOptions);
            return this;
        }
        public Builder enableDdosProtection(@Nullable Output<Boolean> enableDdosProtection) {
            this.enableDdosProtection = enableDdosProtection;
            return this;
        }
        public Builder enableDdosProtection(@Nullable Boolean enableDdosProtection) {
            this.enableDdosProtection = Codegen.ofNullable(enableDdosProtection);
            return this;
        }
        public Builder enableVmProtection(@Nullable Output<Boolean> enableVmProtection) {
            this.enableVmProtection = enableVmProtection;
            return this;
        }
        public Builder enableVmProtection(@Nullable Boolean enableVmProtection) {
            this.enableVmProtection = Codegen.ofNullable(enableVmProtection);
            return this;
        }
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Codegen.ofNullable(extendedLocation);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder ipAllocations(@Nullable Output<List<SubResourceArgs>> ipAllocations) {
            this.ipAllocations = ipAllocations;
            return this;
        }
        public Builder ipAllocations(@Nullable List<SubResourceArgs> ipAllocations) {
            this.ipAllocations = Codegen.ofNullable(ipAllocations);
            return this;
        }
        public Builder ipAllocations(SubResourceArgs... ipAllocations) {
            return ipAllocations(List.of(ipAllocations));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder subnets(@Nullable Output<List<SubnetArgs>> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(@Nullable List<SubnetArgs> subnets) {
            this.subnets = Codegen.ofNullable(subnets);
            return this;
        }
        public Builder subnets(SubnetArgs... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder virtualNetworkName(@Nullable Output<String> virtualNetworkName) {
            this.virtualNetworkName = virtualNetworkName;
            return this;
        }
        public Builder virtualNetworkName(@Nullable String virtualNetworkName) {
            this.virtualNetworkName = Codegen.ofNullable(virtualNetworkName);
            return this;
        }
        public Builder virtualNetworkPeerings(@Nullable Output<List<VirtualNetworkPeeringArgs>> virtualNetworkPeerings) {
            this.virtualNetworkPeerings = virtualNetworkPeerings;
            return this;
        }
        public Builder virtualNetworkPeerings(@Nullable List<VirtualNetworkPeeringArgs> virtualNetworkPeerings) {
            this.virtualNetworkPeerings = Codegen.ofNullable(virtualNetworkPeerings);
            return this;
        }
        public Builder virtualNetworkPeerings(VirtualNetworkPeeringArgs... virtualNetworkPeerings) {
            return virtualNetworkPeerings(List.of(virtualNetworkPeerings));
        }        public VirtualNetworkArgs build() {
            return new VirtualNetworkArgs(addressSpace, bgpCommunities, ddosProtectionPlan, dhcpOptions, enableDdosProtection, enableVmProtection, extendedLocation, id, ipAllocations, location, resourceGroupName, subnets, tags, virtualNetworkName, virtualNetworkPeerings);
        }
    }
}
