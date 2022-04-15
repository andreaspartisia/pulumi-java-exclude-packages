// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A sparkChart is a small chart suitable for inclusion in a table-cell or inline in text. This message contains the configuration for a sparkChart to show up on a Scorecard, showing recent trends of the scorecard's timeseries.
 * 
 */
public final class SparkChartViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final SparkChartViewResponse Empty = new SparkChartViewResponse();

    /**
     * The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
     * 
     */
    @Import(name="minAlignmentPeriod", required=true)
      private final String minAlignmentPeriod;

    public String minAlignmentPeriod() {
        return this.minAlignmentPeriod;
    }

    /**
     * The type of sparkchart to show in this chartView.
     * 
     */
    @Import(name="sparkChartType", required=true)
      private final String sparkChartType;

    public String sparkChartType() {
        return this.sparkChartType;
    }

    public SparkChartViewResponse(
        String minAlignmentPeriod,
        String sparkChartType) {
        this.minAlignmentPeriod = Objects.requireNonNull(minAlignmentPeriod, "expected parameter 'minAlignmentPeriod' to be non-null");
        this.sparkChartType = Objects.requireNonNull(sparkChartType, "expected parameter 'sparkChartType' to be non-null");
    }

    private SparkChartViewResponse() {
        this.minAlignmentPeriod = null;
        this.sparkChartType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkChartViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String minAlignmentPeriod;
        private String sparkChartType;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkChartViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minAlignmentPeriod = defaults.minAlignmentPeriod;
    	      this.sparkChartType = defaults.sparkChartType;
        }

        public Builder minAlignmentPeriod(String minAlignmentPeriod) {
            this.minAlignmentPeriod = Objects.requireNonNull(minAlignmentPeriod);
            return this;
        }
        public Builder sparkChartType(String sparkChartType) {
            this.sparkChartType = Objects.requireNonNull(sparkChartType);
            return this;
        }        public SparkChartViewResponse build() {
            return new SparkChartViewResponse(minAlignmentPeriod, sparkChartType);
        }
    }
}
