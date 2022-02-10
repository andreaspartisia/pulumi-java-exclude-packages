// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExpressRouteCircuitPeeringConfigResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Ipv6ExpressRouteCircuitPeeringConfigResponse {
    private final @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig;
    private final @Nullable String primaryPeerAddressPrefix;
    private final @Nullable SubResourceResponse routeFilter;
    private final @Nullable String secondaryPeerAddressPrefix;
    private final @Nullable String state;

    @OutputCustomType.Constructor({"microsoftPeeringConfig","primaryPeerAddressPrefix","routeFilter","secondaryPeerAddressPrefix","state"})
    private Ipv6ExpressRouteCircuitPeeringConfigResponse(
        @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig,
        @Nullable String primaryPeerAddressPrefix,
        @Nullable SubResourceResponse routeFilter,
        @Nullable String secondaryPeerAddressPrefix,
        @Nullable String state) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        this.routeFilter = routeFilter;
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        this.state = state;
    }

    public Optional<ExpressRouteCircuitPeeringConfigResponse> getMicrosoftPeeringConfig() {
        return Optional.ofNullable(this.microsoftPeeringConfig);
    }
    public Optional<String> getPrimaryPeerAddressPrefix() {
        return Optional.ofNullable(this.primaryPeerAddressPrefix);
    }
    public Optional<SubResourceResponse> getRouteFilter() {
        return Optional.ofNullable(this.routeFilter);
    }
    public Optional<String> getSecondaryPeerAddressPrefix() {
        return Optional.ofNullable(this.secondaryPeerAddressPrefix);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ipv6ExpressRouteCircuitPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig;
        private @Nullable String primaryPeerAddressPrefix;
        private @Nullable SubResourceResponse routeFilter;
        private @Nullable String secondaryPeerAddressPrefix;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(Ipv6ExpressRouteCircuitPeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.microsoftPeeringConfig = defaults.microsoftPeeringConfig;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.routeFilter = defaults.routeFilter;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
    	      this.state = defaults.state;
        }

        public Builder setMicrosoftPeeringConfig(@Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig) {
            this.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }

        public Builder setPrimaryPeerAddressPrefix(@Nullable String primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }

        public Builder setRouteFilter(@Nullable SubResourceResponse routeFilter) {
            this.routeFilter = routeFilter;
            return this;
        }

        public Builder setSecondaryPeerAddressPrefix(@Nullable String secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Ipv6ExpressRouteCircuitPeeringConfigResponse build() {
            return new Ipv6ExpressRouteCircuitPeeringConfigResponse(microsoftPeeringConfig, primaryPeerAddressPrefix, routeFilter, secondaryPeerAddressPrefix, state);
        }
    }
}