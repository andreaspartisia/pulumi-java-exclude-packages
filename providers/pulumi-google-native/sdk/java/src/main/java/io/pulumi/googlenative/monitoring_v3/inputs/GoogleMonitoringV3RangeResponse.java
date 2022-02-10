// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


public final class GoogleMonitoringV3RangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleMonitoringV3RangeResponse Empty = new GoogleMonitoringV3RangeResponse();

    @InputImport(name="max", required=true)
    private final Double max;

    public Double getMax() {
        return this.max;
    }

    @InputImport(name="min", required=true)
    private final Double min;

    public Double getMin() {
        return this.min;
    }

    public GoogleMonitoringV3RangeResponse(
        Double max,
        Double min) {
        this.max = Objects.requireNonNull(max, "expected parameter 'max' to be non-null");
        this.min = Objects.requireNonNull(min, "expected parameter 'min' to be non-null");
    }

    private GoogleMonitoringV3RangeResponse() {
        this.max = null;
        this.min = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleMonitoringV3RangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double max;
        private Double min;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleMonitoringV3RangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(Double max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }

        public Builder setMin(Double min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }

        public GoogleMonitoringV3RangeResponse build() {
            return new GoogleMonitoringV3RangeResponse(max, min);
        }
    }
}