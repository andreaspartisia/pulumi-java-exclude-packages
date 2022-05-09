// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetSubscriptionFilterNotDimensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetSubscriptionFilterNotDimensionArgs Empty = new BudgetSubscriptionFilterNotDimensionArgs();

    /**
     * The name of the column to use for the filter. The allowed values are `ChargeType`, `Frequency`, `InvoiceId`, `Meter`, `MeterCategory`, `MeterSubCategory`, `PartNumber`, `PricingModel`, `Product`, `ProductOrderId`, `ProductOrderName`, `PublisherType`, `ReservationId`, `ReservationName`, `ResourceGroupName`, `ResourceGuid`, `ResourceId`, `ResourceLocation`, `ResourceType`, `ServiceFamily`, `ServiceName`, `SubscriptionID`, `SubscriptionName`, `UnitOfMeasure`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the column to use for the filter. The allowed values are `ChargeType`, `Frequency`, `InvoiceId`, `Meter`, `MeterCategory`, `MeterSubCategory`, `PartNumber`, `PricingModel`, `Product`, `ProductOrderId`, `ProductOrderName`, `PublisherType`, `ReservationId`, `ReservationName`, `ResourceGroupName`, `ResourceGuid`, `ResourceId`, `ResourceLocation`, `ResourceType`, `ServiceFamily`, `ServiceName`, `SubscriptionID`, `SubscriptionName`, `UnitOfMeasure`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The operator to use for comparison. The allowed values are `In`.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return The operator to use for comparison. The allowed values are `In`.
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * Specifies a list of values for the column.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Specifies a list of values for the column.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private BudgetSubscriptionFilterNotDimensionArgs() {}

    private BudgetSubscriptionFilterNotDimensionArgs(BudgetSubscriptionFilterNotDimensionArgs $) {
        this.name = $.name;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetSubscriptionFilterNotDimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetSubscriptionFilterNotDimensionArgs $;

        public Builder() {
            $ = new BudgetSubscriptionFilterNotDimensionArgs();
        }

        public Builder(BudgetSubscriptionFilterNotDimensionArgs defaults) {
            $ = new BudgetSubscriptionFilterNotDimensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the column to use for the filter. The allowed values are `ChargeType`, `Frequency`, `InvoiceId`, `Meter`, `MeterCategory`, `MeterSubCategory`, `PartNumber`, `PricingModel`, `Product`, `ProductOrderId`, `ProductOrderName`, `PublisherType`, `ReservationId`, `ReservationName`, `ResourceGroupName`, `ResourceGuid`, `ResourceId`, `ResourceLocation`, `ResourceType`, `ServiceFamily`, `ServiceName`, `SubscriptionID`, `SubscriptionName`, `UnitOfMeasure`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the column to use for the filter. The allowed values are `ChargeType`, `Frequency`, `InvoiceId`, `Meter`, `MeterCategory`, `MeterSubCategory`, `PartNumber`, `PricingModel`, `Product`, `ProductOrderId`, `ProductOrderName`, `PublisherType`, `ReservationId`, `ReservationName`, `ResourceGroupName`, `ResourceGuid`, `ResourceId`, `ResourceLocation`, `ResourceType`, `ServiceFamily`, `ServiceName`, `SubscriptionID`, `SubscriptionName`, `UnitOfMeasure`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operator The operator to use for comparison. The allowed values are `In`.
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator to use for comparison. The allowed values are `In`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values Specifies a list of values for the column.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Specifies a list of values for the column.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Specifies a list of values for the column.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public BudgetSubscriptionFilterNotDimensionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
