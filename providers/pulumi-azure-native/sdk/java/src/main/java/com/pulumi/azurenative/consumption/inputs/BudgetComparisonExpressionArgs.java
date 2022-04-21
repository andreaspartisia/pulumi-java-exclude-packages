// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.consumption.inputs;

import com.pulumi.azurenative.consumption.enums.BudgetOperatorType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The comparison expression to be used in the budgets.
 * 
 */
public final class BudgetComparisonExpressionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetComparisonExpressionArgs Empty = new BudgetComparisonExpressionArgs();

    /**
     * The name of the column to use in comparison.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The operator to use for comparison.
     * 
     */
    @Import(name="operator", required=true)
    private Output<Either<String,BudgetOperatorType>> operator;

    public Output<Either<String,BudgetOperatorType>> operator() {
        return this.operator;
    }

    /**
     * Array of values to use for comparison
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private BudgetComparisonExpressionArgs() {}

    private BudgetComparisonExpressionArgs(BudgetComparisonExpressionArgs $) {
        this.name = $.name;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetComparisonExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetComparisonExpressionArgs $;

        public Builder() {
            $ = new BudgetComparisonExpressionArgs();
        }

        public Builder(BudgetComparisonExpressionArgs defaults) {
            $ = new BudgetComparisonExpressionArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder operator(Output<Either<String,BudgetOperatorType>> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(Either<String,BudgetOperatorType> operator) {
            return operator(Output.of(operator));
        }

        public Builder operator(String operator) {
            return operator(Either.ofLeft(operator));
        }

        public Builder operator(BudgetOperatorType operator) {
            return operator(Either.ofRight(operator));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public BudgetComparisonExpressionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
