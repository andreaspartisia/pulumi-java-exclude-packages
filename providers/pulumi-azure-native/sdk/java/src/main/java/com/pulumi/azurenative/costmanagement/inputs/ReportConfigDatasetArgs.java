// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.ReportGranularityType;
import com.pulumi.azurenative.costmanagement.inputs.ReportConfigAggregationArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportConfigDatasetConfigurationArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportConfigFilterArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportConfigGroupingArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportConfigSortingArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of data present in the report.
 * 
 */
public final class ReportConfigDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportConfigDatasetArgs Empty = new ReportConfigDatasetArgs();

    /**
     * Dictionary of aggregation expression to use in the report. The key of each item in the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
     * 
     */
    @Import(name="aggregation")
    private @Nullable Output<Map<String,ReportConfigAggregationArgs>> aggregation;

    public Optional<Output<Map<String,ReportConfigAggregationArgs>>> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }

    /**
     * Has configuration information for the data in the report. The configuration will be ignored if aggregation and grouping are provided.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<ReportConfigDatasetConfigurationArgs> configuration;

    public Optional<Output<ReportConfigDatasetConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Has filter expression to use in the report.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<ReportConfigFilterArgs> filter;

    public Optional<Output<ReportConfigFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The granularity of rows in the report.
     * 
     */
    @Import(name="granularity")
    private @Nullable Output<Either<String,ReportGranularityType>> granularity;

    public Optional<Output<Either<String,ReportGranularityType>>> granularity() {
        return Optional.ofNullable(this.granularity);
    }

    /**
     * Array of group by expression to use in the report. Report can have up to 2 group by clauses.
     * 
     */
    @Import(name="grouping")
    private @Nullable Output<List<ReportConfigGroupingArgs>> grouping;

    public Optional<Output<List<ReportConfigGroupingArgs>>> grouping() {
        return Optional.ofNullable(this.grouping);
    }

    /**
     * Array of order by expression to use in the report.
     * 
     */
    @Import(name="sorting")
    private @Nullable Output<List<ReportConfigSortingArgs>> sorting;

    public Optional<Output<List<ReportConfigSortingArgs>>> sorting() {
        return Optional.ofNullable(this.sorting);
    }

    private ReportConfigDatasetArgs() {}

    private ReportConfigDatasetArgs(ReportConfigDatasetArgs $) {
        this.aggregation = $.aggregation;
        this.configuration = $.configuration;
        this.filter = $.filter;
        this.granularity = $.granularity;
        this.grouping = $.grouping;
        this.sorting = $.sorting;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportConfigDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportConfigDatasetArgs $;

        public Builder() {
            $ = new ReportConfigDatasetArgs();
        }

        public Builder(ReportConfigDatasetArgs defaults) {
            $ = new ReportConfigDatasetArgs(Objects.requireNonNull(defaults));
        }

        public Builder aggregation(@Nullable Output<Map<String,ReportConfigAggregationArgs>> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        public Builder aggregation(Map<String,ReportConfigAggregationArgs> aggregation) {
            return aggregation(Output.of(aggregation));
        }

        public Builder configuration(@Nullable Output<ReportConfigDatasetConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(ReportConfigDatasetConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder filter(@Nullable Output<ReportConfigFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(ReportConfigFilterArgs filter) {
            return filter(Output.of(filter));
        }

        public Builder granularity(@Nullable Output<Either<String,ReportGranularityType>> granularity) {
            $.granularity = granularity;
            return this;
        }

        public Builder granularity(Either<String,ReportGranularityType> granularity) {
            return granularity(Output.of(granularity));
        }

        public Builder granularity(String granularity) {
            return granularity(Either.ofLeft(granularity));
        }

        public Builder granularity(ReportGranularityType granularity) {
            return granularity(Either.ofRight(granularity));
        }

        public Builder grouping(@Nullable Output<List<ReportConfigGroupingArgs>> grouping) {
            $.grouping = grouping;
            return this;
        }

        public Builder grouping(List<ReportConfigGroupingArgs> grouping) {
            return grouping(Output.of(grouping));
        }

        public Builder grouping(ReportConfigGroupingArgs... grouping) {
            return grouping(List.of(grouping));
        }

        public Builder sorting(@Nullable Output<List<ReportConfigSortingArgs>> sorting) {
            $.sorting = sorting;
            return this;
        }

        public Builder sorting(List<ReportConfigSortingArgs> sorting) {
            return sorting(Output.of(sorting));
        }

        public Builder sorting(ReportConfigSortingArgs... sorting) {
            return sorting(List.of(sorting));
        }

        public ReportConfigDatasetArgs build() {
            return $;
        }
    }

}
