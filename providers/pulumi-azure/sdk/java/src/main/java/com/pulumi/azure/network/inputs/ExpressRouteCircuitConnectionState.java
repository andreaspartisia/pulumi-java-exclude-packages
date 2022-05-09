// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExpressRouteCircuitConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitConnectionState Empty = new ExpressRouteCircuitConnectionState();

    /**
     * The IPv4 address space from which to allocate customer address for global reach. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    @Import(name="addressPrefixIpv4")
    private @Nullable Output<String> addressPrefixIpv4;

    /**
     * @return The IPv4 address space from which to allocate customer address for global reach. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    public Optional<Output<String>> addressPrefixIpv4() {
        return Optional.ofNullable(this.addressPrefixIpv4);
    }

    /**
     * The IPv6 address space from which to allocate customer addresses for global reach.
     * 
     */
    @Import(name="addressPrefixIpv6")
    private @Nullable Output<String> addressPrefixIpv6;

    /**
     * @return The IPv6 address space from which to allocate customer addresses for global reach.
     * 
     */
    public Optional<Output<String>> addressPrefixIpv6() {
        return Optional.ofNullable(this.addressPrefixIpv6);
    }

    /**
     * The authorization key which is associated with the Express Route Circuit Connection.
     * 
     */
    @Import(name="authorizationKey")
    private @Nullable Output<String> authorizationKey;

    /**
     * @return The authorization key which is associated with the Express Route Circuit Connection.
     * 
     */
    public Optional<Output<String>> authorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }

    /**
     * The name which should be used for this Express Route Circuit Connection. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Express Route Circuit Connection. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the peered Express Route Circuit Private Peering. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    @Import(name="peerPeeringId")
    private @Nullable Output<String> peerPeeringId;

    /**
     * @return The ID of the peered Express Route Circuit Private Peering. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    public Optional<Output<String>> peerPeeringId() {
        return Optional.ofNullable(this.peerPeeringId);
    }

    /**
     * The ID of the Express Route Circuit Private Peering that this Express Route Circuit Connection connects with. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    @Import(name="peeringId")
    private @Nullable Output<String> peeringId;

    /**
     * @return The ID of the Express Route Circuit Private Peering that this Express Route Circuit Connection connects with. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    public Optional<Output<String>> peeringId() {
        return Optional.ofNullable(this.peeringId);
    }

    private ExpressRouteCircuitConnectionState() {}

    private ExpressRouteCircuitConnectionState(ExpressRouteCircuitConnectionState $) {
        this.addressPrefixIpv4 = $.addressPrefixIpv4;
        this.addressPrefixIpv6 = $.addressPrefixIpv6;
        this.authorizationKey = $.authorizationKey;
        this.name = $.name;
        this.peerPeeringId = $.peerPeeringId;
        this.peeringId = $.peeringId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteCircuitConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteCircuitConnectionState $;

        public Builder() {
            $ = new ExpressRouteCircuitConnectionState();
        }

        public Builder(ExpressRouteCircuitConnectionState defaults) {
            $ = new ExpressRouteCircuitConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefixIpv4 The IPv4 address space from which to allocate customer address for global reach. Changing this forces a new Express Route Circuit Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixIpv4(@Nullable Output<String> addressPrefixIpv4) {
            $.addressPrefixIpv4 = addressPrefixIpv4;
            return this;
        }

        /**
         * @param addressPrefixIpv4 The IPv4 address space from which to allocate customer address for global reach. Changing this forces a new Express Route Circuit Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixIpv4(String addressPrefixIpv4) {
            return addressPrefixIpv4(Output.of(addressPrefixIpv4));
        }

        /**
         * @param addressPrefixIpv6 The IPv6 address space from which to allocate customer addresses for global reach.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixIpv6(@Nullable Output<String> addressPrefixIpv6) {
            $.addressPrefixIpv6 = addressPrefixIpv6;
            return this;
        }

        /**
         * @param addressPrefixIpv6 The IPv6 address space from which to allocate customer addresses for global reach.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixIpv6(String addressPrefixIpv6) {
            return addressPrefixIpv6(Output.of(addressPrefixIpv6));
        }

        /**
         * @param authorizationKey The authorization key which is associated with the Express Route Circuit Connection.
         * 
         * @return builder
         * 
         */
        public Builder authorizationKey(@Nullable Output<String> authorizationKey) {
            $.authorizationKey = authorizationKey;
            return this;
        }

        /**
         * @param authorizationKey The authorization key which is associated with the Express Route Circuit Connection.
         * 
         * @return builder
         * 
         */
        public Builder authorizationKey(String authorizationKey) {
            return authorizationKey(Output.of(authorizationKey));
        }

        /**
         * @param name The name which should be used for this Express Route Circuit Connection. Changing this forces a new Express Route Circuit Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Express Route Circuit Connection. Changing this forces a new Express Route Circuit Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param peerPeeringId The ID of the peered Express Route Circuit Private Peering. Changing this forces a new Express Route Circuit Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder peerPeeringId(@Nullable Output<String> peerPeeringId) {
            $.peerPeeringId = peerPeeringId;
            return this;
        }

        /**
         * @param peerPeeringId The ID of the peered Express Route Circuit Private Peering. Changing this forces a new Express Route Circuit Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder peerPeeringId(String peerPeeringId) {
            return peerPeeringId(Output.of(peerPeeringId));
        }

        /**
         * @param peeringId The ID of the Express Route Circuit Private Peering that this Express Route Circuit Connection connects with. Changing this forces a new Express Route Circuit Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder peeringId(@Nullable Output<String> peeringId) {
            $.peeringId = peeringId;
            return this;
        }

        /**
         * @param peeringId The ID of the Express Route Circuit Private Peering that this Express Route Circuit Connection connects with. Changing this forces a new Express Route Circuit Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder peeringId(String peeringId) {
            return peeringId(Output.of(peeringId));
        }

        public ExpressRouteCircuitConnectionState build() {
            return $;
        }
    }

}
