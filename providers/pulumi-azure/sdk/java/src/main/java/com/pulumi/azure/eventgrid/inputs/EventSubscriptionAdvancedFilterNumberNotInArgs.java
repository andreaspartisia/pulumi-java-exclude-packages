// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EventSubscriptionAdvancedFilterNumberNotInArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionAdvancedFilterNumberNotInArgs Empty = new EventSubscriptionAdvancedFilterNumberNotInArgs();

    /**
     * Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Specifies an array of values to compare to when using a multiple values operator.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<Double>> values;

    /**
     * @return Specifies an array of values to compare to when using a multiple values operator.
     * 
     */
    public Output<List<Double>> values() {
        return this.values;
    }

    private EventSubscriptionAdvancedFilterNumberNotInArgs() {}

    private EventSubscriptionAdvancedFilterNumberNotInArgs(EventSubscriptionAdvancedFilterNumberNotInArgs $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionAdvancedFilterNumberNotInArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionAdvancedFilterNumberNotInArgs $;

        public Builder() {
            $ = new EventSubscriptionAdvancedFilterNumberNotInArgs();
        }

        public Builder(EventSubscriptionAdvancedFilterNumberNotInArgs defaults) {
            $ = new EventSubscriptionAdvancedFilterNumberNotInArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values Specifies an array of values to compare to when using a multiple values operator.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<Double>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Specifies an array of values to compare to when using a multiple values operator.
         * 
         * @return builder
         * 
         */
        public Builder values(List<Double> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Specifies an array of values to compare to when using a multiple values operator.
         * 
         * @return builder
         * 
         */
        public Builder values(Double... values) {
            return values(List.of(values));
        }

        public EventSubscriptionAdvancedFilterNumberNotInArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
