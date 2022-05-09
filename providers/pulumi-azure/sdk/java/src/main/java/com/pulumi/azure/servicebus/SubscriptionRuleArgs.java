// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus;

import com.pulumi.azure.servicebus.inputs.SubscriptionRuleCorrelationFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionRuleArgs Empty = new SubscriptionRuleArgs();

    /**
     * Represents set of actions written in SQL language-based syntax that is performed against a BrokeredMessage.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Represents set of actions written in SQL language-based syntax that is performed against a BrokeredMessage.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * A `correlation_filter` block as documented below to be evaluated against a BrokeredMessage. Required when `filter_type` is set to `CorrelationFilter`.
     * 
     */
    @Import(name="correlationFilter")
    private @Nullable Output<SubscriptionRuleCorrelationFilterArgs> correlationFilter;

    /**
     * @return A `correlation_filter` block as documented below to be evaluated against a BrokeredMessage. Required when `filter_type` is set to `CorrelationFilter`.
     * 
     */
    public Optional<Output<SubscriptionRuleCorrelationFilterArgs>> correlationFilter() {
        return Optional.ofNullable(this.correlationFilter);
    }

    /**
     * Type of filter to be applied to a BrokeredMessage. Possible values are `SqlFilter` and `CorrelationFilter`.
     * 
     */
    @Import(name="filterType", required=true)
    private Output<String> filterType;

    /**
     * @return Type of filter to be applied to a BrokeredMessage. Possible values are `SqlFilter` and `CorrelationFilter`.
     * 
     */
    public Output<String> filterType() {
        return this.filterType;
    }

    /**
     * Specifies the name of the ServiceBus Subscription Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Subscription Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Represents a filter written in SQL language-based syntax that to be evaluated against a BrokeredMessage. Required when `filter_type` is set to `SqlFilter`.
     * 
     */
    @Import(name="sqlFilter")
    private @Nullable Output<String> sqlFilter;

    /**
     * @return Represents a filter written in SQL language-based syntax that to be evaluated against a BrokeredMessage. Required when `filter_type` is set to `SqlFilter`.
     * 
     */
    public Optional<Output<String>> sqlFilter() {
        return Optional.ofNullable(this.sqlFilter);
    }

    /**
     * The ID of the ServiceBus Subscription in which this Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return The ID of the ServiceBus Subscription in which this Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private SubscriptionRuleArgs() {}

    private SubscriptionRuleArgs(SubscriptionRuleArgs $) {
        this.action = $.action;
        this.correlationFilter = $.correlationFilter;
        this.filterType = $.filterType;
        this.name = $.name;
        this.sqlFilter = $.sqlFilter;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionRuleArgs $;

        public Builder() {
            $ = new SubscriptionRuleArgs();
        }

        public Builder(SubscriptionRuleArgs defaults) {
            $ = new SubscriptionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Represents set of actions written in SQL language-based syntax that is performed against a BrokeredMessage.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Represents set of actions written in SQL language-based syntax that is performed against a BrokeredMessage.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param correlationFilter A `correlation_filter` block as documented below to be evaluated against a BrokeredMessage. Required when `filter_type` is set to `CorrelationFilter`.
         * 
         * @return builder
         * 
         */
        public Builder correlationFilter(@Nullable Output<SubscriptionRuleCorrelationFilterArgs> correlationFilter) {
            $.correlationFilter = correlationFilter;
            return this;
        }

        /**
         * @param correlationFilter A `correlation_filter` block as documented below to be evaluated against a BrokeredMessage. Required when `filter_type` is set to `CorrelationFilter`.
         * 
         * @return builder
         * 
         */
        public Builder correlationFilter(SubscriptionRuleCorrelationFilterArgs correlationFilter) {
            return correlationFilter(Output.of(correlationFilter));
        }

        /**
         * @param filterType Type of filter to be applied to a BrokeredMessage. Possible values are `SqlFilter` and `CorrelationFilter`.
         * 
         * @return builder
         * 
         */
        public Builder filterType(Output<String> filterType) {
            $.filterType = filterType;
            return this;
        }

        /**
         * @param filterType Type of filter to be applied to a BrokeredMessage. Possible values are `SqlFilter` and `CorrelationFilter`.
         * 
         * @return builder
         * 
         */
        public Builder filterType(String filterType) {
            return filterType(Output.of(filterType));
        }

        /**
         * @param name Specifies the name of the ServiceBus Subscription Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the ServiceBus Subscription Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sqlFilter Represents a filter written in SQL language-based syntax that to be evaluated against a BrokeredMessage. Required when `filter_type` is set to `SqlFilter`.
         * 
         * @return builder
         * 
         */
        public Builder sqlFilter(@Nullable Output<String> sqlFilter) {
            $.sqlFilter = sqlFilter;
            return this;
        }

        /**
         * @param sqlFilter Represents a filter written in SQL language-based syntax that to be evaluated against a BrokeredMessage. Required when `filter_type` is set to `SqlFilter`.
         * 
         * @return builder
         * 
         */
        public Builder sqlFilter(String sqlFilter) {
            return sqlFilter(Output.of(sqlFilter));
        }

        /**
         * @param subscriptionId The ID of the ServiceBus Subscription in which this Rule should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The ID of the ServiceBus Subscription in which this Rule should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public SubscriptionRuleArgs build() {
            $.filterType = Objects.requireNonNull($.filterType, "expected parameter 'filterType' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
