// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.DurationResponse;
import java.lang.Double;
import java.util.Objects;


/**
 * Specifies the delay introduced by the load balancer before forwarding the request to the backend service as part of fault injection.
 * 
 */
public final class HttpFaultDelayResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpFaultDelayResponse Empty = new HttpFaultDelayResponse();

    /**
     * Specifies the value of the fixed delay interval.
     * 
     */
    @Import(name="fixedDelay", required=true)
      private final DurationResponse fixedDelay;

    public DurationResponse fixedDelay() {
        return this.fixedDelay;
    }

    /**
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    @Import(name="percentage", required=true)
      private final Double percentage;

    public Double percentage() {
        return this.percentage;
    }

    public HttpFaultDelayResponse(
        DurationResponse fixedDelay,
        Double percentage) {
        this.fixedDelay = Objects.requireNonNull(fixedDelay, "expected parameter 'fixedDelay' to be non-null");
        this.percentage = Objects.requireNonNull(percentage, "expected parameter 'percentage' to be non-null");
    }

    private HttpFaultDelayResponse() {
        this.fixedDelay = null;
        this.percentage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultDelayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse fixedDelay;
        private Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultDelayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(DurationResponse fixedDelay) {
            this.fixedDelay = Objects.requireNonNull(fixedDelay);
            return this;
        }
        public Builder percentage(Double percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }        public HttpFaultDelayResponse build() {
            return new HttpFaultDelayResponse(fixedDelay, percentage);
        }
    }
}
