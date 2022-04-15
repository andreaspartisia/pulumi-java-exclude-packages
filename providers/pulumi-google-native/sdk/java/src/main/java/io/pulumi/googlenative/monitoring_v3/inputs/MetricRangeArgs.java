// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v3.inputs.GoogleMonitoringV3RangeArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A MetricRange is used when each window is good when the value x of a single TimeSeries satisfies range.min <= x <= range.max. The provided TimeSeries must have ValueType = INT64 or ValueType = DOUBLE and MetricKind = GAUGE.
 * 
 */
public final class MetricRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricRangeArgs Empty = new MetricRangeArgs();

    /**
     * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
     * 
     */
    @Import(name="range")
      private final @Nullable Output<GoogleMonitoringV3RangeArgs> range;

    public Output<GoogleMonitoringV3RangeArgs> range() {
        return this.range == null ? Codegen.empty() : this.range;
    }

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying the TimeSeries to use for evaluating window quality.
     * 
     */
    @Import(name="timeSeries")
      private final @Nullable Output<String> timeSeries;

    public Output<String> timeSeries() {
        return this.timeSeries == null ? Codegen.empty() : this.timeSeries;
    }

    public MetricRangeArgs(
        @Nullable Output<GoogleMonitoringV3RangeArgs> range,
        @Nullable Output<String> timeSeries) {
        this.range = range;
        this.timeSeries = timeSeries;
    }

    private MetricRangeArgs() {
        this.range = Codegen.empty();
        this.timeSeries = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleMonitoringV3RangeArgs> range;
        private @Nullable Output<String> timeSeries;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.timeSeries = defaults.timeSeries;
        }

        public Builder range(@Nullable Output<GoogleMonitoringV3RangeArgs> range) {
            this.range = range;
            return this;
        }
        public Builder range(@Nullable GoogleMonitoringV3RangeArgs range) {
            this.range = Codegen.ofNullable(range);
            return this;
        }
        public Builder timeSeries(@Nullable Output<String> timeSeries) {
            this.timeSeries = timeSeries;
            return this;
        }
        public Builder timeSeries(@Nullable String timeSeries) {
            this.timeSeries = Codegen.ofNullable(timeSeries);
            return this;
        }        public MetricRangeArgs build() {
            return new MetricRangeArgs(range, timeSeries);
        }
    }
}
