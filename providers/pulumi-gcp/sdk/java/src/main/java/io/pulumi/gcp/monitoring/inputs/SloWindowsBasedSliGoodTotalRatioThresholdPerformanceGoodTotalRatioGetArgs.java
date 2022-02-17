// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs();

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying bad service provided, either demanded service that
     * was not provided or demanded service that was of inadequate
     * quality. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @InputImport(name="badServiceFilter")
    private final @Nullable Input<String> badServiceFilter;

    public Input<String> getBadServiceFilter() {
        return this.badServiceFilter == null ? Input.empty() : this.badServiceFilter;
    }

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying good service provided. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @InputImport(name="goodServiceFilter")
    private final @Nullable Input<String> goodServiceFilter;

    public Input<String> getGoodServiceFilter() {
        return this.goodServiceFilter == null ? Input.empty() : this.goodServiceFilter;
    }

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying total demanded service. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @InputImport(name="totalServiceFilter")
    private final @Nullable Input<String> totalServiceFilter;

    public Input<String> getTotalServiceFilter() {
        return this.totalServiceFilter == null ? Input.empty() : this.totalServiceFilter;
    }

    public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs(
        @Nullable Input<String> badServiceFilter,
        @Nullable Input<String> goodServiceFilter,
        @Nullable Input<String> totalServiceFilter) {
        this.badServiceFilter = badServiceFilter;
        this.goodServiceFilter = goodServiceFilter;
        this.totalServiceFilter = totalServiceFilter;
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs() {
        this.badServiceFilter = Input.empty();
        this.goodServiceFilter = Input.empty();
        this.totalServiceFilter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> badServiceFilter;
        private @Nullable Input<String> goodServiceFilter;
        private @Nullable Input<String> totalServiceFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.badServiceFilter = defaults.badServiceFilter;
    	      this.goodServiceFilter = defaults.goodServiceFilter;
    	      this.totalServiceFilter = defaults.totalServiceFilter;
        }

        public Builder setBadServiceFilter(@Nullable Input<String> badServiceFilter) {
            this.badServiceFilter = badServiceFilter;
            return this;
        }

        public Builder setBadServiceFilter(@Nullable String badServiceFilter) {
            this.badServiceFilter = Input.ofNullable(badServiceFilter);
            return this;
        }

        public Builder setGoodServiceFilter(@Nullable Input<String> goodServiceFilter) {
            this.goodServiceFilter = goodServiceFilter;
            return this;
        }

        public Builder setGoodServiceFilter(@Nullable String goodServiceFilter) {
            this.goodServiceFilter = Input.ofNullable(goodServiceFilter);
            return this;
        }

        public Builder setTotalServiceFilter(@Nullable Input<String> totalServiceFilter) {
            this.totalServiceFilter = totalServiceFilter;
            return this;
        }

        public Builder setTotalServiceFilter(@Nullable String totalServiceFilter) {
            this.totalServiceFilter = Input.ofNullable(totalServiceFilter);
            return this;
        }

        public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs(badServiceFilter, goodServiceFilter, totalServiceFilter);
        }
    }
}