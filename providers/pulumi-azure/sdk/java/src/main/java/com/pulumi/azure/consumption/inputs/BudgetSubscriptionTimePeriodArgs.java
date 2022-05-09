// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetSubscriptionTimePeriodArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetSubscriptionTimePeriodArgs Empty = new BudgetSubscriptionTimePeriodArgs();

    /**
     * The end date for the budget. If not set this will be 10 years after the start date.
     * 
     */
    @Import(name="endDate")
    private @Nullable Output<String> endDate;

    /**
     * @return The end date for the budget. If not set this will be 10 years after the start date.
     * 
     */
    public Optional<Output<String>> endDate() {
        return Optional.ofNullable(this.endDate);
    }

    /**
     * The start date for the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than twelve months. Past start date should be selected within the timegrain period. Changing this forces a new Subscription Consumption Budget to be created.
     * 
     */
    @Import(name="startDate", required=true)
    private Output<String> startDate;

    /**
     * @return The start date for the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than twelve months. Past start date should be selected within the timegrain period. Changing this forces a new Subscription Consumption Budget to be created.
     * 
     */
    public Output<String> startDate() {
        return this.startDate;
    }

    private BudgetSubscriptionTimePeriodArgs() {}

    private BudgetSubscriptionTimePeriodArgs(BudgetSubscriptionTimePeriodArgs $) {
        this.endDate = $.endDate;
        this.startDate = $.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetSubscriptionTimePeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetSubscriptionTimePeriodArgs $;

        public Builder() {
            $ = new BudgetSubscriptionTimePeriodArgs();
        }

        public Builder(BudgetSubscriptionTimePeriodArgs defaults) {
            $ = new BudgetSubscriptionTimePeriodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endDate The end date for the budget. If not set this will be 10 years after the start date.
         * 
         * @return builder
         * 
         */
        public Builder endDate(@Nullable Output<String> endDate) {
            $.endDate = endDate;
            return this;
        }

        /**
         * @param endDate The end date for the budget. If not set this will be 10 years after the start date.
         * 
         * @return builder
         * 
         */
        public Builder endDate(String endDate) {
            return endDate(Output.of(endDate));
        }

        /**
         * @param startDate The start date for the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than twelve months. Past start date should be selected within the timegrain period. Changing this forces a new Subscription Consumption Budget to be created.
         * 
         * @return builder
         * 
         */
        public Builder startDate(Output<String> startDate) {
            $.startDate = startDate;
            return this;
        }

        /**
         * @param startDate The start date for the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than twelve months. Past start date should be selected within the timegrain period. Changing this forces a new Subscription Consumption Budget to be created.
         * 
         * @return builder
         * 
         */
        public Builder startDate(String startDate) {
            return startDate(Output.of(startDate));
        }

        public BudgetSubscriptionTimePeriodArgs build() {
            $.startDate = Objects.requireNonNull($.startDate, "expected parameter 'startDate' to be non-null");
            return $;
        }
    }

}
