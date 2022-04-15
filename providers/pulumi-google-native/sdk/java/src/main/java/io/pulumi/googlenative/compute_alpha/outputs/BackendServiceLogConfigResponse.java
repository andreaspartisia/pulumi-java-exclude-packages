// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class BackendServiceLogConfigResponse {
    /**
     * This field denotes whether to enable logging for the load balancer traffic served by this backend service.
     * 
     */
    private final Boolean enable;
    /**
     * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
     * 
     */
    private final Double sampleRate;

    @CustomType.Constructor
    private BackendServiceLogConfigResponse(
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("sampleRate") Double sampleRate) {
        this.enable = enable;
        this.sampleRate = sampleRate;
    }

    /**
     * This field denotes whether to enable logging for the load balancer traffic served by this backend service.
     * 
    */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
     * 
    */
    public Double sampleRate() {
        return this.sampleRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private Double sampleRate;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.sampleRate = defaults.sampleRate;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder sampleRate(Double sampleRate) {
            this.sampleRate = Objects.requireNonNull(sampleRate);
            return this;
        }        public BackendServiceLogConfigResponse build() {
            return new BackendServiceLogConfigResponse(enable, sampleRate);
        }
    }
}
