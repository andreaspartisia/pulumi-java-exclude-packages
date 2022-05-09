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


public final class BudgetManagementGroupFilterTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetManagementGroupFilterTagArgs Empty = new BudgetManagementGroupFilterTagArgs();

    /**
     * The name of the tag to use for the filter.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the tag to use for the filter.
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
     * Specifies a list of values for the tag.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Specifies a list of values for the tag.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private BudgetManagementGroupFilterTagArgs() {}

    private BudgetManagementGroupFilterTagArgs(BudgetManagementGroupFilterTagArgs $) {
        this.name = $.name;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetManagementGroupFilterTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetManagementGroupFilterTagArgs $;

        public Builder() {
            $ = new BudgetManagementGroupFilterTagArgs();
        }

        public Builder(BudgetManagementGroupFilterTagArgs defaults) {
            $ = new BudgetManagementGroupFilterTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the tag to use for the filter.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the tag to use for the filter.
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
         * @param values Specifies a list of values for the tag.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Specifies a list of values for the tag.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Specifies a list of values for the tag.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public BudgetManagementGroupFilterTagArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
