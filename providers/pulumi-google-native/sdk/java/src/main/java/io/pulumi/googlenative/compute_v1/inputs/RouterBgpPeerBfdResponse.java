// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RouterBgpPeerBfdResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterBgpPeerBfdResponse Empty = new RouterBgpPeerBfdResponse();

    /**
     * The minimum interval, in milliseconds, between BFD control packets received from the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the transmit interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    @Import(name="minReceiveInterval", required=true)
      private final Integer minReceiveInterval;

    public Integer minReceiveInterval() {
        return this.minReceiveInterval;
    }

    /**
     * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the corresponding receive interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    @Import(name="minTransmitInterval", required=true)
      private final Integer minTransmitInterval;

    public Integer minTransmitInterval() {
        return this.minTransmitInterval;
    }

    /**
     * The number of consecutive BFD packets that must be missed before BFD declares that a peer is unavailable. If set, the value must be a value between 5 and 16. The default is 5.
     * 
     */
    @Import(name="multiplier", required=true)
      private final Integer multiplier;

    public Integer multiplier() {
        return this.multiplier;
    }

    /**
     * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is PASSIVE.
     * 
     */
    @Import(name="sessionInitializationMode", required=true)
      private final String sessionInitializationMode;

    public String sessionInitializationMode() {
        return this.sessionInitializationMode;
    }

    public RouterBgpPeerBfdResponse(
        Integer minReceiveInterval,
        Integer minTransmitInterval,
        Integer multiplier,
        String sessionInitializationMode) {
        this.minReceiveInterval = Objects.requireNonNull(minReceiveInterval, "expected parameter 'minReceiveInterval' to be non-null");
        this.minTransmitInterval = Objects.requireNonNull(minTransmitInterval, "expected parameter 'minTransmitInterval' to be non-null");
        this.multiplier = Objects.requireNonNull(multiplier, "expected parameter 'multiplier' to be non-null");
        this.sessionInitializationMode = Objects.requireNonNull(sessionInitializationMode, "expected parameter 'sessionInitializationMode' to be non-null");
    }

    private RouterBgpPeerBfdResponse() {
        this.minReceiveInterval = null;
        this.minTransmitInterval = null;
        this.multiplier = null;
        this.sessionInitializationMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpPeerBfdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minReceiveInterval;
        private Integer minTransmitInterval;
        private Integer multiplier;
        private String sessionInitializationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpPeerBfdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReceiveInterval = defaults.minReceiveInterval;
    	      this.minTransmitInterval = defaults.minTransmitInterval;
    	      this.multiplier = defaults.multiplier;
    	      this.sessionInitializationMode = defaults.sessionInitializationMode;
        }

        public Builder minReceiveInterval(Integer minReceiveInterval) {
            this.minReceiveInterval = Objects.requireNonNull(minReceiveInterval);
            return this;
        }
        public Builder minTransmitInterval(Integer minTransmitInterval) {
            this.minTransmitInterval = Objects.requireNonNull(minTransmitInterval);
            return this;
        }
        public Builder multiplier(Integer multiplier) {
            this.multiplier = Objects.requireNonNull(multiplier);
            return this;
        }
        public Builder sessionInitializationMode(String sessionInitializationMode) {
            this.sessionInitializationMode = Objects.requireNonNull(sessionInitializationMode);
            return this;
        }        public RouterBgpPeerBfdResponse build() {
            return new RouterBgpPeerBfdResponse(minReceiveInterval, minTransmitInterval, multiplier, sessionInitializationMode);
        }
    }
}
