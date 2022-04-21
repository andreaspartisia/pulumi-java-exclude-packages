// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.VirtualNetworkGatewayType;
import com.pulumi.azurenative.network.enums.VpnGatewayGeneration;
import com.pulumi.azurenative.network.enums.VpnType;
import com.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import com.pulumi.azurenative.network.inputs.BgpSettingsArgs;
import com.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.azurenative.network.inputs.VirtualNetworkGatewayIPConfigurationArgs;
import com.pulumi.azurenative.network.inputs.VirtualNetworkGatewaySkuArgs;
import com.pulumi.azurenative.network.inputs.VpnClientConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A common class for general resource information.
 * 
 */
public final class VirtualNetworkGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayArgs Empty = new VirtualNetworkGatewayArgs();

    /**
     * ActiveActive flag.
     * 
     */
    @Import(name="activeActive")
    private @Nullable Output<Boolean> activeActive;

    public Optional<Output<Boolean>> activeActive() {
        return Optional.ofNullable(this.activeActive);
    }

    /**
     * Virtual network gateway&#39;s BGP speaker settings.
     * 
     */
    @Import(name="bgpSettings")
    private @Nullable Output<BgpSettingsArgs> bgpSettings;

    public Optional<Output<BgpSettingsArgs>> bgpSettings() {
        return Optional.ofNullable(this.bgpSettings);
    }

    /**
     * The reference to the address space resource which represents the custom routes address space specified by the customer for virtual network gateway and VpnClient.
     * 
     */
    @Import(name="customRoutes")
    private @Nullable Output<AddressSpaceArgs> customRoutes;

    public Optional<Output<AddressSpaceArgs>> customRoutes() {
        return Optional.ofNullable(this.customRoutes);
    }

    /**
     * Whether BGP is enabled for this virtual network gateway or not.
     * 
     */
    @Import(name="enableBgp")
    private @Nullable Output<Boolean> enableBgp;

    public Optional<Output<Boolean>> enableBgp() {
        return Optional.ofNullable(this.enableBgp);
    }

    /**
     * Whether dns forwarding is enabled or not.
     * 
     */
    @Import(name="enableDnsForwarding")
    private @Nullable Output<Boolean> enableDnsForwarding;

    public Optional<Output<Boolean>> enableDnsForwarding() {
        return Optional.ofNullable(this.enableDnsForwarding);
    }

    /**
     * Whether private IP needs to be enabled on this gateway for connections or not.
     * 
     */
    @Import(name="enablePrivateIpAddress")
    private @Nullable Output<Boolean> enablePrivateIpAddress;

    public Optional<Output<Boolean>> enablePrivateIpAddress() {
        return Optional.ofNullable(this.enablePrivateIpAddress);
    }

    /**
     * The extended location of type local virtual network gateway.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * The reference to the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     */
    @Import(name="gatewayDefaultSite")
    private @Nullable Output<SubResourceArgs> gatewayDefaultSite;

    public Optional<Output<SubResourceArgs>> gatewayDefaultSite() {
        return Optional.ofNullable(this.gatewayDefaultSite);
    }

    /**
     * The type of this virtual network gateway.
     * 
     */
    @Import(name="gatewayType")
    private @Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType;

    public Optional<Output<Either<String,VirtualNetworkGatewayType>>> gatewayType() {
        return Optional.ofNullable(this.gatewayType);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * IP configurations for virtual network gateway.
     * 
     */
    @Import(name="ipConfigurations")
    private @Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations;

    public Optional<Output<List<VirtualNetworkGatewayIPConfigurationArgs>>> ipConfigurations() {
        return Optional.ofNullable(this.ipConfigurations);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<VirtualNetworkGatewaySkuArgs> sku;

    public Optional<Output<VirtualNetworkGatewaySkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     * 
     */
    @Import(name="vNetExtendedLocationResourceId")
    private @Nullable Output<String> vNetExtendedLocationResourceId;

    public Optional<Output<String>> vNetExtendedLocationResourceId() {
        return Optional.ofNullable(this.vNetExtendedLocationResourceId);
    }

    /**
     * The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     * 
     */
    @Import(name="vpnClientConfiguration")
    private @Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration;

    public Optional<Output<VpnClientConfigurationArgs>> vpnClientConfiguration() {
        return Optional.ofNullable(this.vpnClientConfiguration);
    }

    /**
     * The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     * 
     */
    @Import(name="vpnGatewayGeneration")
    private @Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration;

    public Optional<Output<Either<String,VpnGatewayGeneration>>> vpnGatewayGeneration() {
        return Optional.ofNullable(this.vpnGatewayGeneration);
    }

    /**
     * The type of this virtual network gateway.
     * 
     */
    @Import(name="vpnType")
    private @Nullable Output<Either<String,VpnType>> vpnType;

    public Optional<Output<Either<String,VpnType>>> vpnType() {
        return Optional.ofNullable(this.vpnType);
    }

    private VirtualNetworkGatewayArgs() {}

    private VirtualNetworkGatewayArgs(VirtualNetworkGatewayArgs $) {
        this.activeActive = $.activeActive;
        this.bgpSettings = $.bgpSettings;
        this.customRoutes = $.customRoutes;
        this.enableBgp = $.enableBgp;
        this.enableDnsForwarding = $.enableDnsForwarding;
        this.enablePrivateIpAddress = $.enablePrivateIpAddress;
        this.extendedLocation = $.extendedLocation;
        this.gatewayDefaultSite = $.gatewayDefaultSite;
        this.gatewayType = $.gatewayType;
        this.id = $.id;
        this.ipConfigurations = $.ipConfigurations;
        this.location = $.location;
        this.sku = $.sku;
        this.tags = $.tags;
        this.vNetExtendedLocationResourceId = $.vNetExtendedLocationResourceId;
        this.vpnClientConfiguration = $.vpnClientConfiguration;
        this.vpnGatewayGeneration = $.vpnGatewayGeneration;
        this.vpnType = $.vpnType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayArgs();
        }

        public Builder(VirtualNetworkGatewayArgs defaults) {
            $ = new VirtualNetworkGatewayArgs(Objects.requireNonNull(defaults));
        }

        public Builder activeActive(@Nullable Output<Boolean> activeActive) {
            $.activeActive = activeActive;
            return this;
        }

        public Builder activeActive(Boolean activeActive) {
            return activeActive(Output.of(activeActive));
        }

        public Builder bgpSettings(@Nullable Output<BgpSettingsArgs> bgpSettings) {
            $.bgpSettings = bgpSettings;
            return this;
        }

        public Builder bgpSettings(BgpSettingsArgs bgpSettings) {
            return bgpSettings(Output.of(bgpSettings));
        }

        public Builder customRoutes(@Nullable Output<AddressSpaceArgs> customRoutes) {
            $.customRoutes = customRoutes;
            return this;
        }

        public Builder customRoutes(AddressSpaceArgs customRoutes) {
            return customRoutes(Output.of(customRoutes));
        }

        public Builder enableBgp(@Nullable Output<Boolean> enableBgp) {
            $.enableBgp = enableBgp;
            return this;
        }

        public Builder enableBgp(Boolean enableBgp) {
            return enableBgp(Output.of(enableBgp));
        }

        public Builder enableDnsForwarding(@Nullable Output<Boolean> enableDnsForwarding) {
            $.enableDnsForwarding = enableDnsForwarding;
            return this;
        }

        public Builder enableDnsForwarding(Boolean enableDnsForwarding) {
            return enableDnsForwarding(Output.of(enableDnsForwarding));
        }

        public Builder enablePrivateIpAddress(@Nullable Output<Boolean> enablePrivateIpAddress) {
            $.enablePrivateIpAddress = enablePrivateIpAddress;
            return this;
        }

        public Builder enablePrivateIpAddress(Boolean enablePrivateIpAddress) {
            return enablePrivateIpAddress(Output.of(enablePrivateIpAddress));
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        public Builder gatewayDefaultSite(@Nullable Output<SubResourceArgs> gatewayDefaultSite) {
            $.gatewayDefaultSite = gatewayDefaultSite;
            return this;
        }

        public Builder gatewayDefaultSite(SubResourceArgs gatewayDefaultSite) {
            return gatewayDefaultSite(Output.of(gatewayDefaultSite));
        }

        public Builder gatewayType(@Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType) {
            $.gatewayType = gatewayType;
            return this;
        }

        public Builder gatewayType(Either<String,VirtualNetworkGatewayType> gatewayType) {
            return gatewayType(Output.of(gatewayType));
        }

        public Builder gatewayType(String gatewayType) {
            return gatewayType(Either.ofLeft(gatewayType));
        }

        public Builder gatewayType(VirtualNetworkGatewayType gatewayType) {
            return gatewayType(Either.ofRight(gatewayType));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder ipConfigurations(@Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder ipConfigurations(List<VirtualNetworkGatewayIPConfigurationArgs> ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        public Builder ipConfigurations(VirtualNetworkGatewayIPConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder sku(@Nullable Output<VirtualNetworkGatewaySkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(VirtualNetworkGatewaySkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder vNetExtendedLocationResourceId(@Nullable Output<String> vNetExtendedLocationResourceId) {
            $.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
            return this;
        }

        public Builder vNetExtendedLocationResourceId(String vNetExtendedLocationResourceId) {
            return vNetExtendedLocationResourceId(Output.of(vNetExtendedLocationResourceId));
        }

        public Builder vpnClientConfiguration(@Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration) {
            $.vpnClientConfiguration = vpnClientConfiguration;
            return this;
        }

        public Builder vpnClientConfiguration(VpnClientConfigurationArgs vpnClientConfiguration) {
            return vpnClientConfiguration(Output.of(vpnClientConfiguration));
        }

        public Builder vpnGatewayGeneration(@Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration) {
            $.vpnGatewayGeneration = vpnGatewayGeneration;
            return this;
        }

        public Builder vpnGatewayGeneration(Either<String,VpnGatewayGeneration> vpnGatewayGeneration) {
            return vpnGatewayGeneration(Output.of(vpnGatewayGeneration));
        }

        public Builder vpnGatewayGeneration(String vpnGatewayGeneration) {
            return vpnGatewayGeneration(Either.ofLeft(vpnGatewayGeneration));
        }

        public Builder vpnGatewayGeneration(VpnGatewayGeneration vpnGatewayGeneration) {
            return vpnGatewayGeneration(Either.ofRight(vpnGatewayGeneration));
        }

        public Builder vpnType(@Nullable Output<Either<String,VpnType>> vpnType) {
            $.vpnType = vpnType;
            return this;
        }

        public Builder vpnType(Either<String,VpnType> vpnType) {
            return vpnType(Output.of(vpnType));
        }

        public Builder vpnType(String vpnType) {
            return vpnType(Either.ofLeft(vpnType));
        }

        public Builder vpnType(VpnType vpnType) {
            return vpnType(Either.ofRight(vpnType));
        }

        public VirtualNetworkGatewayArgs build() {
            return $;
        }
    }

}
