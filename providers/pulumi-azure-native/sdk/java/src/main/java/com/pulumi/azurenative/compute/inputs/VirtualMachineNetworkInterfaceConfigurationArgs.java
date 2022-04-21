// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.DeleteOptions;
import com.pulumi.azurenative.compute.inputs.SubResourceArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineNetworkInterfaceIPConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine network interface configurations.
 * 
 */
public final class VirtualMachineNetworkInterfaceConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineNetworkInterfaceConfigurationArgs Empty = new VirtualMachineNetworkInterfaceConfigurationArgs();

    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
     */
    @Import(name="deleteOption")
    private @Nullable Output<Either<String,DeleteOptions>> deleteOption;

    public Optional<Output<Either<String,DeleteOptions>>> deleteOption() {
        return Optional.ofNullable(this.deleteOption);
    }

    /**
     * The dns settings to be applied on the network interfaces.
     * 
     */
    @Import(name="dnsSettings")
    private @Nullable Output<VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs> dnsSettings;

    public Optional<Output<VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs>> dnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }

    @Import(name="dscpConfiguration")
    private @Nullable Output<SubResourceArgs> dscpConfiguration;

    public Optional<Output<SubResourceArgs>> dscpConfiguration() {
        return Optional.ofNullable(this.dscpConfiguration);
    }

    /**
     * Specifies whether the network interface is accelerated networking-enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworking")
    private @Nullable Output<Boolean> enableAcceleratedNetworking;

    public Optional<Output<Boolean>> enableAcceleratedNetworking() {
        return Optional.ofNullable(this.enableAcceleratedNetworking);
    }

    /**
     * Specifies whether the network interface is FPGA networking-enabled.
     * 
     */
    @Import(name="enableFpga")
    private @Nullable Output<Boolean> enableFpga;

    public Optional<Output<Boolean>> enableFpga() {
        return Optional.ofNullable(this.enableFpga);
    }

    /**
     * Whether IP forwarding enabled on this NIC.
     * 
     */
    @Import(name="enableIPForwarding")
    private @Nullable Output<Boolean> enableIPForwarding;

    public Optional<Output<Boolean>> enableIPForwarding() {
        return Optional.ofNullable(this.enableIPForwarding);
    }

    /**
     * Specifies the IP configurations of the network interface.
     * 
     */
    @Import(name="ipConfigurations", required=true)
    private Output<List<VirtualMachineNetworkInterfaceIPConfigurationArgs>> ipConfigurations;

    public Output<List<VirtualMachineNetworkInterfaceIPConfigurationArgs>> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * The network interface configuration name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The network security group.
     * 
     */
    @Import(name="networkSecurityGroup")
    private @Nullable Output<SubResourceArgs> networkSecurityGroup;

    public Optional<Output<SubResourceArgs>> networkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }

    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    private VirtualMachineNetworkInterfaceConfigurationArgs() {}

    private VirtualMachineNetworkInterfaceConfigurationArgs(VirtualMachineNetworkInterfaceConfigurationArgs $) {
        this.deleteOption = $.deleteOption;
        this.dnsSettings = $.dnsSettings;
        this.dscpConfiguration = $.dscpConfiguration;
        this.enableAcceleratedNetworking = $.enableAcceleratedNetworking;
        this.enableFpga = $.enableFpga;
        this.enableIPForwarding = $.enableIPForwarding;
        this.ipConfigurations = $.ipConfigurations;
        this.name = $.name;
        this.networkSecurityGroup = $.networkSecurityGroup;
        this.primary = $.primary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineNetworkInterfaceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineNetworkInterfaceConfigurationArgs $;

        public Builder() {
            $ = new VirtualMachineNetworkInterfaceConfigurationArgs();
        }

        public Builder(VirtualMachineNetworkInterfaceConfigurationArgs defaults) {
            $ = new VirtualMachineNetworkInterfaceConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteOption(@Nullable Output<Either<String,DeleteOptions>> deleteOption) {
            $.deleteOption = deleteOption;
            return this;
        }

        public Builder deleteOption(Either<String,DeleteOptions> deleteOption) {
            return deleteOption(Output.of(deleteOption));
        }

        public Builder deleteOption(String deleteOption) {
            return deleteOption(Either.ofLeft(deleteOption));
        }

        public Builder deleteOption(DeleteOptions deleteOption) {
            return deleteOption(Either.ofRight(deleteOption));
        }

        public Builder dnsSettings(@Nullable Output<VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs> dnsSettings) {
            $.dnsSettings = dnsSettings;
            return this;
        }

        public Builder dnsSettings(VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs dnsSettings) {
            return dnsSettings(Output.of(dnsSettings));
        }

        public Builder dscpConfiguration(@Nullable Output<SubResourceArgs> dscpConfiguration) {
            $.dscpConfiguration = dscpConfiguration;
            return this;
        }

        public Builder dscpConfiguration(SubResourceArgs dscpConfiguration) {
            return dscpConfiguration(Output.of(dscpConfiguration));
        }

        public Builder enableAcceleratedNetworking(@Nullable Output<Boolean> enableAcceleratedNetworking) {
            $.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }

        public Builder enableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
            return enableAcceleratedNetworking(Output.of(enableAcceleratedNetworking));
        }

        public Builder enableFpga(@Nullable Output<Boolean> enableFpga) {
            $.enableFpga = enableFpga;
            return this;
        }

        public Builder enableFpga(Boolean enableFpga) {
            return enableFpga(Output.of(enableFpga));
        }

        public Builder enableIPForwarding(@Nullable Output<Boolean> enableIPForwarding) {
            $.enableIPForwarding = enableIPForwarding;
            return this;
        }

        public Builder enableIPForwarding(Boolean enableIPForwarding) {
            return enableIPForwarding(Output.of(enableIPForwarding));
        }

        public Builder ipConfigurations(Output<List<VirtualMachineNetworkInterfaceIPConfigurationArgs>> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder ipConfigurations(List<VirtualMachineNetworkInterfaceIPConfigurationArgs> ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        public Builder ipConfigurations(VirtualMachineNetworkInterfaceIPConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networkSecurityGroup(@Nullable Output<SubResourceArgs> networkSecurityGroup) {
            $.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder networkSecurityGroup(SubResourceArgs networkSecurityGroup) {
            return networkSecurityGroup(Output.of(networkSecurityGroup));
        }

        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        public VirtualMachineNetworkInterfaceConfigurationArgs build() {
            $.ipConfigurations = Objects.requireNonNull($.ipConfigurations, "expected parameter 'ipConfigurations' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
