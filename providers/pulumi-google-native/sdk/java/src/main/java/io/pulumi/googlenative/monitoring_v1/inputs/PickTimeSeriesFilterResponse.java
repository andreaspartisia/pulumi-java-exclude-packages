// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a ranking-based time series filter. Each input time series is ranked with an aligner. The filter will allow up to num_time_series time series to pass through it, selecting them based on the relative ranking.For example, if ranking_method is METHOD_MEAN,direction is BOTTOM, and num_time_series is 3, then the 3 times series with the lowest mean values will pass through the filter.
 * 
 */
public final class PickTimeSeriesFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final PickTimeSeriesFilterResponse Empty = new PickTimeSeriesFilterResponse();

    /**
     * How to use the ranking to select time series that pass through the filter.
     * 
     */
    @Import(name="direction", required=true)
      private final String direction;

    public String direction() {
        return this.direction;
    }

    /**
     * How many time series to allow to pass through the filter.
     * 
     */
    @Import(name="numTimeSeries", required=true)
      private final Integer numTimeSeries;

    public Integer numTimeSeries() {
        return this.numTimeSeries;
    }

    /**
     * ranking_method is applied to each time series independently to produce the value which will be used to compare the time series to other time series.
     * 
     */
    @Import(name="rankingMethod", required=true)
      private final String rankingMethod;

    public String rankingMethod() {
        return this.rankingMethod;
    }

    public PickTimeSeriesFilterResponse(
        String direction,
        Integer numTimeSeries,
        String rankingMethod) {
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.numTimeSeries = Objects.requireNonNull(numTimeSeries, "expected parameter 'numTimeSeries' to be non-null");
        this.rankingMethod = Objects.requireNonNull(rankingMethod, "expected parameter 'rankingMethod' to be non-null");
    }

    private PickTimeSeriesFilterResponse() {
        this.direction = null;
        this.numTimeSeries = null;
        this.rankingMethod = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PickTimeSeriesFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String direction;
        private Integer numTimeSeries;
        private String rankingMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(PickTimeSeriesFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.numTimeSeries = defaults.numTimeSeries;
    	      this.rankingMethod = defaults.rankingMethod;
        }

        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder numTimeSeries(Integer numTimeSeries) {
            this.numTimeSeries = Objects.requireNonNull(numTimeSeries);
            return this;
        }
        public Builder rankingMethod(String rankingMethod) {
            this.rankingMethod = Objects.requireNonNull(rankingMethod);
            return this;
        }        public PickTimeSeriesFilterResponse build() {
            return new PickTimeSeriesFilterResponse(direction, numTimeSeries, rankingMethod);
        }
    }
}
