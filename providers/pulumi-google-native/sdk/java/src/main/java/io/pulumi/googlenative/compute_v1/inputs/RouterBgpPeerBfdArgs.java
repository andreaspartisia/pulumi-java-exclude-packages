// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.enums.RouterBgpPeerBfdSessionInitializationMode;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterBgpPeerBfdArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterBgpPeerBfdArgs Empty = new RouterBgpPeerBfdArgs();

    /**
     * The minimum interval, in milliseconds, between BFD control packets received from the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the transmit interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    @Import(name="minReceiveInterval")
      private final @Nullable Output<Integer> minReceiveInterval;

    public Output<Integer> minReceiveInterval() {
        return this.minReceiveInterval == null ? Codegen.empty() : this.minReceiveInterval;
    }

    /**
     * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the corresponding receive interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    @Import(name="minTransmitInterval")
      private final @Nullable Output<Integer> minTransmitInterval;

    public Output<Integer> minTransmitInterval() {
        return this.minTransmitInterval == null ? Codegen.empty() : this.minTransmitInterval;
    }

    /**
     * The number of consecutive BFD packets that must be missed before BFD declares that a peer is unavailable. If set, the value must be a value between 5 and 16. The default is 5.
     * 
     */
    @Import(name="multiplier")
      private final @Nullable Output<Integer> multiplier;

    public Output<Integer> multiplier() {
        return this.multiplier == null ? Codegen.empty() : this.multiplier;
    }

    /**
     * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is PASSIVE.
     * 
     */
    @Import(name="sessionInitializationMode")
      private final @Nullable Output<RouterBgpPeerBfdSessionInitializationMode> sessionInitializationMode;

    public Output<RouterBgpPeerBfdSessionInitializationMode> sessionInitializationMode() {
        return this.sessionInitializationMode == null ? Codegen.empty() : this.sessionInitializationMode;
    }

    public RouterBgpPeerBfdArgs(
        @Nullable Output<Integer> minReceiveInterval,
        @Nullable Output<Integer> minTransmitInterval,
        @Nullable Output<Integer> multiplier,
        @Nullable Output<RouterBgpPeerBfdSessionInitializationMode> sessionInitializationMode) {
        this.minReceiveInterval = minReceiveInterval;
        this.minTransmitInterval = minTransmitInterval;
        this.multiplier = multiplier;
        this.sessionInitializationMode = sessionInitializationMode;
    }

    private RouterBgpPeerBfdArgs() {
        this.minReceiveInterval = Codegen.empty();
        this.minTransmitInterval = Codegen.empty();
        this.multiplier = Codegen.empty();
        this.sessionInitializationMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpPeerBfdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minReceiveInterval;
        private @Nullable Output<Integer> minTransmitInterval;
        private @Nullable Output<Integer> multiplier;
        private @Nullable Output<RouterBgpPeerBfdSessionInitializationMode> sessionInitializationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpPeerBfdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReceiveInterval = defaults.minReceiveInterval;
    	      this.minTransmitInterval = defaults.minTransmitInterval;
    	      this.multiplier = defaults.multiplier;
    	      this.sessionInitializationMode = defaults.sessionInitializationMode;
        }

        public Builder minReceiveInterval(@Nullable Output<Integer> minReceiveInterval) {
            this.minReceiveInterval = minReceiveInterval;
            return this;
        }
        public Builder minReceiveInterval(@Nullable Integer minReceiveInterval) {
            this.minReceiveInterval = Codegen.ofNullable(minReceiveInterval);
            return this;
        }
        public Builder minTransmitInterval(@Nullable Output<Integer> minTransmitInterval) {
            this.minTransmitInterval = minTransmitInterval;
            return this;
        }
        public Builder minTransmitInterval(@Nullable Integer minTransmitInterval) {
            this.minTransmitInterval = Codegen.ofNullable(minTransmitInterval);
            return this;
        }
        public Builder multiplier(@Nullable Output<Integer> multiplier) {
            this.multiplier = multiplier;
            return this;
        }
        public Builder multiplier(@Nullable Integer multiplier) {
            this.multiplier = Codegen.ofNullable(multiplier);
            return this;
        }
        public Builder sessionInitializationMode(@Nullable Output<RouterBgpPeerBfdSessionInitializationMode> sessionInitializationMode) {
            this.sessionInitializationMode = sessionInitializationMode;
            return this;
        }
        public Builder sessionInitializationMode(@Nullable RouterBgpPeerBfdSessionInitializationMode sessionInitializationMode) {
            this.sessionInitializationMode = Codegen.ofNullable(sessionInitializationMode);
            return this;
        }        public RouterBgpPeerBfdArgs build() {
            return new RouterBgpPeerBfdArgs(minReceiveInterval, minTransmitInterval, multiplier, sessionInitializationMode);
        }
    }
}
