// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.avs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateCloudCircuitArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateCloudCircuitArgs Empty = new PrivateCloudCircuitArgs();

    /**
     * The ID of the ExpressRoute Circuit.
     * 
     */
    @Import(name="expressRouteId")
    private @Nullable Output<String> expressRouteId;

    /**
     * @return The ID of the ExpressRoute Circuit.
     * 
     */
    public Optional<Output<String>> expressRouteId() {
        return Optional.ofNullable(this.expressRouteId);
    }

    /**
     * The ID of the ExpressRoute Circuit private peering.
     * 
     */
    @Import(name="expressRoutePrivatePeeringId")
    private @Nullable Output<String> expressRoutePrivatePeeringId;

    /**
     * @return The ID of the ExpressRoute Circuit private peering.
     * 
     */
    public Optional<Output<String>> expressRoutePrivatePeeringId() {
        return Optional.ofNullable(this.expressRoutePrivatePeeringId);
    }

    /**
     * The CIDR of the primary subnet.
     * 
     */
    @Import(name="primarySubnetCidr")
    private @Nullable Output<String> primarySubnetCidr;

    /**
     * @return The CIDR of the primary subnet.
     * 
     */
    public Optional<Output<String>> primarySubnetCidr() {
        return Optional.ofNullable(this.primarySubnetCidr);
    }

    /**
     * The CIDR of the secondary subnet.
     * 
     */
    @Import(name="secondarySubnetCidr")
    private @Nullable Output<String> secondarySubnetCidr;

    /**
     * @return The CIDR of the secondary subnet.
     * 
     */
    public Optional<Output<String>> secondarySubnetCidr() {
        return Optional.ofNullable(this.secondarySubnetCidr);
    }

    private PrivateCloudCircuitArgs() {}

    private PrivateCloudCircuitArgs(PrivateCloudCircuitArgs $) {
        this.expressRouteId = $.expressRouteId;
        this.expressRoutePrivatePeeringId = $.expressRoutePrivatePeeringId;
        this.primarySubnetCidr = $.primarySubnetCidr;
        this.secondarySubnetCidr = $.secondarySubnetCidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateCloudCircuitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateCloudCircuitArgs $;

        public Builder() {
            $ = new PrivateCloudCircuitArgs();
        }

        public Builder(PrivateCloudCircuitArgs defaults) {
            $ = new PrivateCloudCircuitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expressRouteId The ID of the ExpressRoute Circuit.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteId(@Nullable Output<String> expressRouteId) {
            $.expressRouteId = expressRouteId;
            return this;
        }

        /**
         * @param expressRouteId The ID of the ExpressRoute Circuit.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteId(String expressRouteId) {
            return expressRouteId(Output.of(expressRouteId));
        }

        /**
         * @param expressRoutePrivatePeeringId The ID of the ExpressRoute Circuit private peering.
         * 
         * @return builder
         * 
         */
        public Builder expressRoutePrivatePeeringId(@Nullable Output<String> expressRoutePrivatePeeringId) {
            $.expressRoutePrivatePeeringId = expressRoutePrivatePeeringId;
            return this;
        }

        /**
         * @param expressRoutePrivatePeeringId The ID of the ExpressRoute Circuit private peering.
         * 
         * @return builder
         * 
         */
        public Builder expressRoutePrivatePeeringId(String expressRoutePrivatePeeringId) {
            return expressRoutePrivatePeeringId(Output.of(expressRoutePrivatePeeringId));
        }

        /**
         * @param primarySubnetCidr The CIDR of the primary subnet.
         * 
         * @return builder
         * 
         */
        public Builder primarySubnetCidr(@Nullable Output<String> primarySubnetCidr) {
            $.primarySubnetCidr = primarySubnetCidr;
            return this;
        }

        /**
         * @param primarySubnetCidr The CIDR of the primary subnet.
         * 
         * @return builder
         * 
         */
        public Builder primarySubnetCidr(String primarySubnetCidr) {
            return primarySubnetCidr(Output.of(primarySubnetCidr));
        }

        /**
         * @param secondarySubnetCidr The CIDR of the secondary subnet.
         * 
         * @return builder
         * 
         */
        public Builder secondarySubnetCidr(@Nullable Output<String> secondarySubnetCidr) {
            $.secondarySubnetCidr = secondarySubnetCidr;
            return this;
        }

        /**
         * @param secondarySubnetCidr The CIDR of the secondary subnet.
         * 
         * @return builder
         * 
         */
        public Builder secondarySubnetCidr(String secondarySubnetCidr) {
            return secondarySubnetCidr(Output.of(secondarySubnetCidr));
        }

        public PrivateCloudCircuitArgs build() {
            return $;
        }
    }

}
