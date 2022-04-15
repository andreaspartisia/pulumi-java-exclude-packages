// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.toolresults_v1beta3.enums.BasicPerfSampleSeriesPerfMetricType;
import io.pulumi.googlenative.toolresults_v1beta3.enums.BasicPerfSampleSeriesPerfUnit;
import io.pulumi.googlenative.toolresults_v1beta3.enums.BasicPerfSampleSeriesSampleSeriesLabel;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encapsulates the metadata for basic sample series represented by a line chart
 * 
 */
public final class BasicPerfSampleSeriesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasicPerfSampleSeriesArgs Empty = new BasicPerfSampleSeriesArgs();

    @Import(name="perfMetricType")
      private final @Nullable Output<BasicPerfSampleSeriesPerfMetricType> perfMetricType;

    public Output<BasicPerfSampleSeriesPerfMetricType> perfMetricType() {
        return this.perfMetricType == null ? Codegen.empty() : this.perfMetricType;
    }

    @Import(name="perfUnit")
      private final @Nullable Output<BasicPerfSampleSeriesPerfUnit> perfUnit;

    public Output<BasicPerfSampleSeriesPerfUnit> perfUnit() {
        return this.perfUnit == null ? Codegen.empty() : this.perfUnit;
    }

    @Import(name="sampleSeriesLabel")
      private final @Nullable Output<BasicPerfSampleSeriesSampleSeriesLabel> sampleSeriesLabel;

    public Output<BasicPerfSampleSeriesSampleSeriesLabel> sampleSeriesLabel() {
        return this.sampleSeriesLabel == null ? Codegen.empty() : this.sampleSeriesLabel;
    }

    public BasicPerfSampleSeriesArgs(
        @Nullable Output<BasicPerfSampleSeriesPerfMetricType> perfMetricType,
        @Nullable Output<BasicPerfSampleSeriesPerfUnit> perfUnit,
        @Nullable Output<BasicPerfSampleSeriesSampleSeriesLabel> sampleSeriesLabel) {
        this.perfMetricType = perfMetricType;
        this.perfUnit = perfUnit;
        this.sampleSeriesLabel = sampleSeriesLabel;
    }

    private BasicPerfSampleSeriesArgs() {
        this.perfMetricType = Codegen.empty();
        this.perfUnit = Codegen.empty();
        this.sampleSeriesLabel = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicPerfSampleSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BasicPerfSampleSeriesPerfMetricType> perfMetricType;
        private @Nullable Output<BasicPerfSampleSeriesPerfUnit> perfUnit;
        private @Nullable Output<BasicPerfSampleSeriesSampleSeriesLabel> sampleSeriesLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicPerfSampleSeriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perfMetricType = defaults.perfMetricType;
    	      this.perfUnit = defaults.perfUnit;
    	      this.sampleSeriesLabel = defaults.sampleSeriesLabel;
        }

        public Builder perfMetricType(@Nullable Output<BasicPerfSampleSeriesPerfMetricType> perfMetricType) {
            this.perfMetricType = perfMetricType;
            return this;
        }
        public Builder perfMetricType(@Nullable BasicPerfSampleSeriesPerfMetricType perfMetricType) {
            this.perfMetricType = Codegen.ofNullable(perfMetricType);
            return this;
        }
        public Builder perfUnit(@Nullable Output<BasicPerfSampleSeriesPerfUnit> perfUnit) {
            this.perfUnit = perfUnit;
            return this;
        }
        public Builder perfUnit(@Nullable BasicPerfSampleSeriesPerfUnit perfUnit) {
            this.perfUnit = Codegen.ofNullable(perfUnit);
            return this;
        }
        public Builder sampleSeriesLabel(@Nullable Output<BasicPerfSampleSeriesSampleSeriesLabel> sampleSeriesLabel) {
            this.sampleSeriesLabel = sampleSeriesLabel;
            return this;
        }
        public Builder sampleSeriesLabel(@Nullable BasicPerfSampleSeriesSampleSeriesLabel sampleSeriesLabel) {
            this.sampleSeriesLabel = Codegen.ofNullable(sampleSeriesLabel);
            return this;
        }        public BasicPerfSampleSeriesArgs build() {
            return new BasicPerfSampleSeriesArgs(perfMetricType, perfUnit, sampleSeriesLabel);
        }
    }
}
