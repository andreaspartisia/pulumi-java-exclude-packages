// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.QueryStringOperator;
import com.pulumi.azurenative.cdn.enums.Transform;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for QueryString match conditions
 * 
 */
public final class QueryStringMatchConditionParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryStringMatchConditionParametersArgs Empty = new QueryStringMatchConditionParametersArgs();

    /**
     * The match value for the condition of the delivery rule
     * 
     */
    @Import(name="matchValues")
    private @Nullable Output<List<String>> matchValues;

    public Optional<Output<List<String>>> matchValues() {
        return Optional.ofNullable(this.matchValues);
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @Import(name="negateCondition")
    private @Nullable Output<Boolean> negateCondition;

    public Optional<Output<Boolean>> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }

    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @Import(name="operator", required=true)
    private Output<Either<String,QueryStringOperator>> operator;

    public Output<Either<String,QueryStringOperator>> operator() {
        return this.operator;
    }

    /**
     * List of transforms
     * 
     */
    @Import(name="transforms")
    private @Nullable Output<List<Either<String,Transform>>> transforms;

    public Optional<Output<List<Either<String,Transform>>>> transforms() {
        return Optional.ofNullable(this.transforms);
    }

    private QueryStringMatchConditionParametersArgs() {}

    private QueryStringMatchConditionParametersArgs(QueryStringMatchConditionParametersArgs $) {
        this.matchValues = $.matchValues;
        this.negateCondition = $.negateCondition;
        this.odataType = $.odataType;
        this.operator = $.operator;
        this.transforms = $.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryStringMatchConditionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryStringMatchConditionParametersArgs $;

        public Builder() {
            $ = new QueryStringMatchConditionParametersArgs();
        }

        public Builder(QueryStringMatchConditionParametersArgs defaults) {
            $ = new QueryStringMatchConditionParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder matchValues(@Nullable Output<List<String>> matchValues) {
            $.matchValues = matchValues;
            return this;
        }

        public Builder matchValues(List<String> matchValues) {
            return matchValues(Output.of(matchValues));
        }

        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }

        public Builder negateCondition(@Nullable Output<Boolean> negateCondition) {
            $.negateCondition = negateCondition;
            return this;
        }

        public Builder negateCondition(Boolean negateCondition) {
            return negateCondition(Output.of(negateCondition));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public Builder operator(Output<Either<String,QueryStringOperator>> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(Either<String,QueryStringOperator> operator) {
            return operator(Output.of(operator));
        }

        public Builder operator(String operator) {
            return operator(Either.ofLeft(operator));
        }

        public Builder operator(QueryStringOperator operator) {
            return operator(Either.ofRight(operator));
        }

        public Builder transforms(@Nullable Output<List<Either<String,Transform>>> transforms) {
            $.transforms = transforms;
            return this;
        }

        public Builder transforms(List<Either<String,Transform>> transforms) {
            return transforms(Output.of(transforms));
        }

        public Builder transforms(Either<String,Transform>... transforms) {
            return transforms(List.of(transforms));
        }

        public QueryStringMatchConditionParametersArgs build() {
            $.odataType = Objects.requireNonNull($.odataType, "expected parameter 'odataType' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            return $;
        }
    }

}
