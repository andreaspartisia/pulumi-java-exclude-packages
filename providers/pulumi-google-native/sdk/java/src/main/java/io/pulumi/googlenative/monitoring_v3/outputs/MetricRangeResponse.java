// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.GoogleMonitoringV3RangeResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetricRangeResponse {
    /**
     * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
     * 
     */
    private final GoogleMonitoringV3RangeResponse range;
    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying the TimeSeries to use for evaluating window quality.
     * 
     */
    private final String timeSeries;

    @CustomType.Constructor
    private MetricRangeResponse(
        @CustomType.Parameter("range") GoogleMonitoringV3RangeResponse range,
        @CustomType.Parameter("timeSeries") String timeSeries) {
        this.range = range;
        this.timeSeries = timeSeries;
    }

    /**
     * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
     * 
    */
    public GoogleMonitoringV3RangeResponse range() {
        return this.range;
    }
    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying the TimeSeries to use for evaluating window quality.
     * 
    */
    public String timeSeries() {
        return this.timeSeries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleMonitoringV3RangeResponse range;
        private String timeSeries;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.timeSeries = defaults.timeSeries;
        }

        public Builder range(GoogleMonitoringV3RangeResponse range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public Builder timeSeries(String timeSeries) {
            this.timeSeries = Objects.requireNonNull(timeSeries);
            return this;
        }        public MetricRangeResponse build() {
            return new MetricRangeResponse(range, timeSeries);
        }
    }
}
