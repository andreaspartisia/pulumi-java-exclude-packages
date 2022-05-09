// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.ServiceAdditionalLocationVirtualNetworkConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAdditionalLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAdditionalLocationArgs Empty = new ServiceAdditionalLocationArgs();

    /**
     * The number of compute units in this region. Defaults to the capacity of the main region.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return The number of compute units in this region. Defaults to the capacity of the main region.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The URL of the Regional Gateway for the API Management Service in the specified region.
     * 
     */
    @Import(name="gatewayRegionalUrl")
    private @Nullable Output<String> gatewayRegionalUrl;

    /**
     * @return The URL of the Regional Gateway for the API Management Service in the specified region.
     * 
     */
    public Optional<Output<String>> gatewayRegionalUrl() {
        return Optional.ofNullable(this.gatewayRegionalUrl);
    }

    /**
     * The name of the Azure Region in which the API Management Service should be expanded to.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The name of the Azure Region in which the API Management Service should be expanded to.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The Private IP addresses of the API Management Service.  Available only when the API Manager instance is using Virtual Network mode.
     * 
     */
    @Import(name="privateIpAddresses")
    private @Nullable Output<List<String>> privateIpAddresses;

    /**
     * @return The Private IP addresses of the API Management Service.  Available only when the API Manager instance is using Virtual Network mode.
     * 
     */
    public Optional<Output<List<String>>> privateIpAddresses() {
        return Optional.ofNullable(this.privateIpAddresses);
    }

    /**
     * ID of a standard SKU IPv4 Public IP.
     * 
     */
    @Import(name="publicIpAddressId")
    private @Nullable Output<String> publicIpAddressId;

    /**
     * @return ID of a standard SKU IPv4 Public IP.
     * 
     */
    public Optional<Output<String>> publicIpAddressId() {
        return Optional.ofNullable(this.publicIpAddressId);
    }

    /**
     * Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
     * 
     */
    @Import(name="publicIpAddresses")
    private @Nullable Output<List<String>> publicIpAddresses;

    /**
     * @return Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
     * 
     */
    public Optional<Output<List<String>>> publicIpAddresses() {
        return Optional.ofNullable(this.publicIpAddresses);
    }

    /**
     * A `virtual_network_configuration` block as defined below.  Required when `virtual_network_type` is `External` or `Internal`.
     * 
     */
    @Import(name="virtualNetworkConfiguration")
    private @Nullable Output<ServiceAdditionalLocationVirtualNetworkConfigurationArgs> virtualNetworkConfiguration;

    /**
     * @return A `virtual_network_configuration` block as defined below.  Required when `virtual_network_type` is `External` or `Internal`.
     * 
     */
    public Optional<Output<ServiceAdditionalLocationVirtualNetworkConfigurationArgs>> virtualNetworkConfiguration() {
        return Optional.ofNullable(this.virtualNetworkConfiguration);
    }

    /**
     * A list of availability zones.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return A list of availability zones.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private ServiceAdditionalLocationArgs() {}

    private ServiceAdditionalLocationArgs(ServiceAdditionalLocationArgs $) {
        this.capacity = $.capacity;
        this.gatewayRegionalUrl = $.gatewayRegionalUrl;
        this.location = $.location;
        this.privateIpAddresses = $.privateIpAddresses;
        this.publicIpAddressId = $.publicIpAddressId;
        this.publicIpAddresses = $.publicIpAddresses;
        this.virtualNetworkConfiguration = $.virtualNetworkConfiguration;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAdditionalLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAdditionalLocationArgs $;

        public Builder() {
            $ = new ServiceAdditionalLocationArgs();
        }

        public Builder(ServiceAdditionalLocationArgs defaults) {
            $ = new ServiceAdditionalLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The number of compute units in this region. Defaults to the capacity of the main region.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The number of compute units in this region. Defaults to the capacity of the main region.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param gatewayRegionalUrl The URL of the Regional Gateway for the API Management Service in the specified region.
         * 
         * @return builder
         * 
         */
        public Builder gatewayRegionalUrl(@Nullable Output<String> gatewayRegionalUrl) {
            $.gatewayRegionalUrl = gatewayRegionalUrl;
            return this;
        }

        /**
         * @param gatewayRegionalUrl The URL of the Regional Gateway for the API Management Service in the specified region.
         * 
         * @return builder
         * 
         */
        public Builder gatewayRegionalUrl(String gatewayRegionalUrl) {
            return gatewayRegionalUrl(Output.of(gatewayRegionalUrl));
        }

        /**
         * @param location The name of the Azure Region in which the API Management Service should be expanded to.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the Azure Region in which the API Management Service should be expanded to.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param privateIpAddresses The Private IP addresses of the API Management Service.  Available only when the API Manager instance is using Virtual Network mode.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddresses(@Nullable Output<List<String>> privateIpAddresses) {
            $.privateIpAddresses = privateIpAddresses;
            return this;
        }

        /**
         * @param privateIpAddresses The Private IP addresses of the API Management Service.  Available only when the API Manager instance is using Virtual Network mode.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddresses(List<String> privateIpAddresses) {
            return privateIpAddresses(Output.of(privateIpAddresses));
        }

        /**
         * @param privateIpAddresses The Private IP addresses of the API Management Service.  Available only when the API Manager instance is using Virtual Network mode.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddresses(String... privateIpAddresses) {
            return privateIpAddresses(List.of(privateIpAddresses));
        }

        /**
         * @param publicIpAddressId ID of a standard SKU IPv4 Public IP.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(@Nullable Output<String> publicIpAddressId) {
            $.publicIpAddressId = publicIpAddressId;
            return this;
        }

        /**
         * @param publicIpAddressId ID of a standard SKU IPv4 Public IP.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(String publicIpAddressId) {
            return publicIpAddressId(Output.of(publicIpAddressId));
        }

        /**
         * @param publicIpAddresses Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(@Nullable Output<List<String>> publicIpAddresses) {
            $.publicIpAddresses = publicIpAddresses;
            return this;
        }

        /**
         * @param publicIpAddresses Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(List<String> publicIpAddresses) {
            return publicIpAddresses(Output.of(publicIpAddresses));
        }

        /**
         * @param publicIpAddresses Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(String... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }

        /**
         * @param virtualNetworkConfiguration A `virtual_network_configuration` block as defined below.  Required when `virtual_network_type` is `External` or `Internal`.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkConfiguration(@Nullable Output<ServiceAdditionalLocationVirtualNetworkConfigurationArgs> virtualNetworkConfiguration) {
            $.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }

        /**
         * @param virtualNetworkConfiguration A `virtual_network_configuration` block as defined below.  Required when `virtual_network_type` is `External` or `Internal`.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkConfiguration(ServiceAdditionalLocationVirtualNetworkConfigurationArgs virtualNetworkConfiguration) {
            return virtualNetworkConfiguration(Output.of(virtualNetworkConfiguration));
        }

        /**
         * @param zones A list of availability zones.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones A list of availability zones.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones A list of availability zones.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public ServiceAdditionalLocationArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
