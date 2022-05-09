// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkSubnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkSubnetArgs Empty = new VirtualNetworkSubnetArgs();

    /**
     * The address prefix to use for the subnet.
     * 
     */
    @Import(name="addressPrefix", required=true)
    private Output<String> addressPrefix;

    /**
     * @return The address prefix to use for the subnet.
     * 
     */
    public Output<String> addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * The ID of DDoS Protection Plan.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of DDoS Protection Plan.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the virtual network. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the virtual network. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Network Security Group to associate with the subnet. (Referenced by `id`, ie. `azurerm_network_security_group.example.id`)
     * 
     */
    @Import(name="securityGroup")
    private @Nullable Output<String> securityGroup;

    /**
     * @return The Network Security Group to associate with the subnet. (Referenced by `id`, ie. `azurerm_network_security_group.example.id`)
     * 
     */
    public Optional<Output<String>> securityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }

    private VirtualNetworkSubnetArgs() {}

    private VirtualNetworkSubnetArgs(VirtualNetworkSubnetArgs $) {
        this.addressPrefix = $.addressPrefix;
        this.id = $.id;
        this.name = $.name;
        this.securityGroup = $.securityGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkSubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkSubnetArgs $;

        public Builder() {
            $ = new VirtualNetworkSubnetArgs();
        }

        public Builder(VirtualNetworkSubnetArgs defaults) {
            $ = new VirtualNetworkSubnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefix The address prefix to use for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(Output<String> addressPrefix) {
            $.addressPrefix = addressPrefix;
            return this;
        }

        /**
         * @param addressPrefix The address prefix to use for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(String addressPrefix) {
            return addressPrefix(Output.of(addressPrefix));
        }

        /**
         * @param id The ID of DDoS Protection Plan.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of DDoS Protection Plan.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the virtual network. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the virtual network. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param securityGroup The Network Security Group to associate with the subnet. (Referenced by `id`, ie. `azurerm_network_security_group.example.id`)
         * 
         * @return builder
         * 
         */
        public Builder securityGroup(@Nullable Output<String> securityGroup) {
            $.securityGroup = securityGroup;
            return this;
        }

        /**
         * @param securityGroup The Network Security Group to associate with the subnet. (Referenced by `id`, ie. `azurerm_network_security_group.example.id`)
         * 
         * @return builder
         * 
         */
        public Builder securityGroup(String securityGroup) {
            return securityGroup(Output.of(securityGroup));
        }

        public VirtualNetworkSubnetArgs build() {
            $.addressPrefix = Objects.requireNonNull($.addressPrefix, "expected parameter 'addressPrefix' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
