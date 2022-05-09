// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs Empty = new VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs();

    /**
     * A list of custom BGP peering addresses to assign to this instance.
     * 
     */
    @Import(name="customIps", required=true)
    private Output<List<String>> customIps;

    /**
     * @return A list of custom BGP peering addresses to assign to this instance.
     * 
     */
    public Output<List<String>> customIps() {
        return this.customIps;
    }

    /**
     * The list of default BGP peering addresses which belong to the pre-defined VPN Gateway IP configuration.
     * 
     */
    @Import(name="defaultIps")
    private @Nullable Output<List<String>> defaultIps;

    /**
     * @return The list of default BGP peering addresses which belong to the pre-defined VPN Gateway IP configuration.
     * 
     */
    public Optional<Output<List<String>>> defaultIps() {
        return Optional.ofNullable(this.defaultIps);
    }

    /**
     * The pre-defined id of VPN Gateway IP Configuration.
     * 
     */
    @Import(name="ipConfigurationId")
    private @Nullable Output<String> ipConfigurationId;

    /**
     * @return The pre-defined id of VPN Gateway IP Configuration.
     * 
     */
    public Optional<Output<String>> ipConfigurationId() {
        return Optional.ofNullable(this.ipConfigurationId);
    }

    /**
     * The list of tunnel public IP addresses which belong to the pre-defined VPN Gateway IP configuration.
     * 
     */
    @Import(name="tunnelIps")
    private @Nullable Output<List<String>> tunnelIps;

    /**
     * @return The list of tunnel public IP addresses which belong to the pre-defined VPN Gateway IP configuration.
     * 
     */
    public Optional<Output<List<String>>> tunnelIps() {
        return Optional.ofNullable(this.tunnelIps);
    }

    private VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs() {}

    private VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs(VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs $) {
        this.customIps = $.customIps;
        this.defaultIps = $.defaultIps;
        this.ipConfigurationId = $.ipConfigurationId;
        this.tunnelIps = $.tunnelIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs $;

        public Builder() {
            $ = new VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs();
        }

        public Builder(VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs defaults) {
            $ = new VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customIps A list of custom BGP peering addresses to assign to this instance.
         * 
         * @return builder
         * 
         */
        public Builder customIps(Output<List<String>> customIps) {
            $.customIps = customIps;
            return this;
        }

        /**
         * @param customIps A list of custom BGP peering addresses to assign to this instance.
         * 
         * @return builder
         * 
         */
        public Builder customIps(List<String> customIps) {
            return customIps(Output.of(customIps));
        }

        /**
         * @param customIps A list of custom BGP peering addresses to assign to this instance.
         * 
         * @return builder
         * 
         */
        public Builder customIps(String... customIps) {
            return customIps(List.of(customIps));
        }

        /**
         * @param defaultIps The list of default BGP peering addresses which belong to the pre-defined VPN Gateway IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder defaultIps(@Nullable Output<List<String>> defaultIps) {
            $.defaultIps = defaultIps;
            return this;
        }

        /**
         * @param defaultIps The list of default BGP peering addresses which belong to the pre-defined VPN Gateway IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder defaultIps(List<String> defaultIps) {
            return defaultIps(Output.of(defaultIps));
        }

        /**
         * @param defaultIps The list of default BGP peering addresses which belong to the pre-defined VPN Gateway IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder defaultIps(String... defaultIps) {
            return defaultIps(List.of(defaultIps));
        }

        /**
         * @param ipConfigurationId The pre-defined id of VPN Gateway IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationId(@Nullable Output<String> ipConfigurationId) {
            $.ipConfigurationId = ipConfigurationId;
            return this;
        }

        /**
         * @param ipConfigurationId The pre-defined id of VPN Gateway IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationId(String ipConfigurationId) {
            return ipConfigurationId(Output.of(ipConfigurationId));
        }

        /**
         * @param tunnelIps The list of tunnel public IP addresses which belong to the pre-defined VPN Gateway IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIps(@Nullable Output<List<String>> tunnelIps) {
            $.tunnelIps = tunnelIps;
            return this;
        }

        /**
         * @param tunnelIps The list of tunnel public IP addresses which belong to the pre-defined VPN Gateway IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIps(List<String> tunnelIps) {
            return tunnelIps(Output.of(tunnelIps));
        }

        /**
         * @param tunnelIps The list of tunnel public IP addresses which belong to the pre-defined VPN Gateway IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIps(String... tunnelIps) {
            return tunnelIps(List.of(tunnelIps));
        }

        public VpnGatewayBgpSettingsInstance0BgpPeeringAddressArgs build() {
            $.customIps = Objects.requireNonNull($.customIps, "expected parameter 'customIps' to be non-null");
            return $;
        }
    }

}
