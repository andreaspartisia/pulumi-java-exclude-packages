// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.NetworkInterfaceMigrationPhase;
import com.pulumi.azurenative.network.enums.NetworkInterfaceNicType;
import com.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.network.inputs.NetworkInterfaceDnsSettingsArgs;
import com.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationArgs;
import com.pulumi.azurenative.network.inputs.NetworkSecurityGroupArgs;
import com.pulumi.azurenative.network.inputs.PrivateLinkServiceArgs;
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


public final class NetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * The DNS settings in network interface.
     * 
     */
    @Import(name="dnsSettings")
    private @Nullable Output<NetworkInterfaceDnsSettingsArgs> dnsSettings;

    public Optional<Output<NetworkInterfaceDnsSettingsArgs>> dnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }

    /**
     * If the network interface is accelerated networking enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworking")
    private @Nullable Output<Boolean> enableAcceleratedNetworking;

    public Optional<Output<Boolean>> enableAcceleratedNetworking() {
        return Optional.ofNullable(this.enableAcceleratedNetworking);
    }

    /**
     * Indicates whether IP forwarding is enabled on this network interface.
     * 
     */
    @Import(name="enableIPForwarding")
    private @Nullable Output<Boolean> enableIPForwarding;

    public Optional<Output<Boolean>> enableIPForwarding() {
        return Optional.ofNullable(this.enableIPForwarding);
    }

    /**
     * The extended location of the network interface.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
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
     * A list of IPConfigurations of the network interface.
     * 
     */
    @Import(name="ipConfigurations")
    private @Nullable Output<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations;

    public Optional<Output<List<NetworkInterfaceIPConfigurationArgs>>> ipConfigurations() {
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
     * Migration phase of Network Interface resource.
     * 
     */
    @Import(name="migrationPhase")
    private @Nullable Output<Either<String,NetworkInterfaceMigrationPhase>> migrationPhase;

    public Optional<Output<Either<String,NetworkInterfaceMigrationPhase>>> migrationPhase() {
        return Optional.ofNullable(this.migrationPhase);
    }

    /**
     * The name of the network interface.
     * 
     */
    @Import(name="networkInterfaceName")
    private @Nullable Output<String> networkInterfaceName;

    public Optional<Output<String>> networkInterfaceName() {
        return Optional.ofNullable(this.networkInterfaceName);
    }

    /**
     * The reference to the NetworkSecurityGroup resource.
     * 
     */
    @Import(name="networkSecurityGroup")
    private @Nullable Output<NetworkSecurityGroupArgs> networkSecurityGroup;

    public Optional<Output<NetworkSecurityGroupArgs>> networkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }

    /**
     * Type of Network Interface resource.
     * 
     */
    @Import(name="nicType")
    private @Nullable Output<Either<String,NetworkInterfaceNicType>> nicType;

    public Optional<Output<Either<String,NetworkInterfaceNicType>>> nicType() {
        return Optional.ofNullable(this.nicType);
    }

    /**
     * Privatelinkservice of the network interface resource.
     * 
     */
    @Import(name="privateLinkService")
    private @Nullable Output<PrivateLinkServiceArgs> privateLinkService;

    public Optional<Output<PrivateLinkServiceArgs>> privateLinkService() {
        return Optional.ofNullable(this.privateLinkService);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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

    private NetworkInterfaceArgs() {}

    private NetworkInterfaceArgs(NetworkInterfaceArgs $) {
        this.dnsSettings = $.dnsSettings;
        this.enableAcceleratedNetworking = $.enableAcceleratedNetworking;
        this.enableIPForwarding = $.enableIPForwarding;
        this.extendedLocation = $.extendedLocation;
        this.id = $.id;
        this.ipConfigurations = $.ipConfigurations;
        this.location = $.location;
        this.migrationPhase = $.migrationPhase;
        this.networkInterfaceName = $.networkInterfaceName;
        this.networkSecurityGroup = $.networkSecurityGroup;
        this.nicType = $.nicType;
        this.privateLinkService = $.privateLinkService;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceArgs $;

        public Builder() {
            $ = new NetworkInterfaceArgs();
        }

        public Builder(NetworkInterfaceArgs defaults) {
            $ = new NetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder dnsSettings(@Nullable Output<NetworkInterfaceDnsSettingsArgs> dnsSettings) {
            $.dnsSettings = dnsSettings;
            return this;
        }

        public Builder dnsSettings(NetworkInterfaceDnsSettingsArgs dnsSettings) {
            return dnsSettings(Output.of(dnsSettings));
        }

        public Builder enableAcceleratedNetworking(@Nullable Output<Boolean> enableAcceleratedNetworking) {
            $.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }

        public Builder enableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
            return enableAcceleratedNetworking(Output.of(enableAcceleratedNetworking));
        }

        public Builder enableIPForwarding(@Nullable Output<Boolean> enableIPForwarding) {
            $.enableIPForwarding = enableIPForwarding;
            return this;
        }

        public Builder enableIPForwarding(Boolean enableIPForwarding) {
            return enableIPForwarding(Output.of(enableIPForwarding));
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder ipConfigurations(@Nullable Output<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder ipConfigurations(List<NetworkInterfaceIPConfigurationArgs> ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        public Builder ipConfigurations(NetworkInterfaceIPConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder migrationPhase(@Nullable Output<Either<String,NetworkInterfaceMigrationPhase>> migrationPhase) {
            $.migrationPhase = migrationPhase;
            return this;
        }

        public Builder migrationPhase(Either<String,NetworkInterfaceMigrationPhase> migrationPhase) {
            return migrationPhase(Output.of(migrationPhase));
        }

        public Builder migrationPhase(String migrationPhase) {
            return migrationPhase(Either.ofLeft(migrationPhase));
        }

        public Builder migrationPhase(NetworkInterfaceMigrationPhase migrationPhase) {
            return migrationPhase(Either.ofRight(migrationPhase));
        }

        public Builder networkInterfaceName(@Nullable Output<String> networkInterfaceName) {
            $.networkInterfaceName = networkInterfaceName;
            return this;
        }

        public Builder networkInterfaceName(String networkInterfaceName) {
            return networkInterfaceName(Output.of(networkInterfaceName));
        }

        public Builder networkSecurityGroup(@Nullable Output<NetworkSecurityGroupArgs> networkSecurityGroup) {
            $.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder networkSecurityGroup(NetworkSecurityGroupArgs networkSecurityGroup) {
            return networkSecurityGroup(Output.of(networkSecurityGroup));
        }

        public Builder nicType(@Nullable Output<Either<String,NetworkInterfaceNicType>> nicType) {
            $.nicType = nicType;
            return this;
        }

        public Builder nicType(Either<String,NetworkInterfaceNicType> nicType) {
            return nicType(Output.of(nicType));
        }

        public Builder nicType(String nicType) {
            return nicType(Either.ofLeft(nicType));
        }

        public Builder nicType(NetworkInterfaceNicType nicType) {
            return nicType(Either.ofRight(nicType));
        }

        public Builder privateLinkService(@Nullable Output<PrivateLinkServiceArgs> privateLinkService) {
            $.privateLinkService = privateLinkService;
            return this;
        }

        public Builder privateLinkService(PrivateLinkServiceArgs privateLinkService) {
            return privateLinkService(Output.of(privateLinkService));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkInterfaceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
