// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.ManagementEventAggregationConditionResponse;
import com.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceResponse;
import com.pulumi.azurenative.insights.inputs.RuleMetricDataSourceResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A management event rule condition.
 * 
 */
public final class ManagementEventRuleConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagementEventRuleConditionResponse Empty = new ManagementEventRuleConditionResponse();

    /**
     * How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
     * 
     */
    @Import(name="aggregation")
      private final @Nullable ManagementEventAggregationConditionResponse aggregation;

    public Optional<ManagementEventAggregationConditionResponse> aggregation() {
        return this.aggregation == null ? Optional.empty() : Optional.ofNullable(this.aggregation);
    }

    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    @Import(name="dataSource")
      private final @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;

    public Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource() {
        return this.dataSource == null ? null : this.dataSource;
    }

    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    public ManagementEventRuleConditionResponse(
        @Nullable ManagementEventAggregationConditionResponse aggregation,
        @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource,
        String odataType) {
        this.aggregation = aggregation;
        this.dataSource = dataSource;
        this.odataType = Codegen.stringProp("odataType").arg(odataType).require();
    }

    private ManagementEventRuleConditionResponse() {
        this.aggregation = null;
        this.dataSource = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementEventRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagementEventAggregationConditionResponse aggregation;
        private @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementEventRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.dataSource = defaults.dataSource;
    	      this.odataType = defaults.odataType;
        }

        public Builder aggregation(@Nullable ManagementEventAggregationConditionResponse aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        public Builder dataSource(@Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public ManagementEventRuleConditionResponse build() {
            return new ManagementEventRuleConditionResponse(aggregation, dataSource, odataType);
        }
    }
}
