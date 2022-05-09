// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointDeliveryRuleHttpVersionConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointDeliveryRuleHttpVersionConditionArgs Empty = new EndpointDeliveryRuleHttpVersionConditionArgs();

    /**
     * Valid values are `0.9`, `1.0`, `1.1` and `2.0`.
     * 
     */
    @Import(name="matchValues", required=true)
    private Output<List<String>> matchValues;

    /**
     * @return Valid values are `0.9`, `1.0`, `1.1` and `2.0`.
     * 
     */
    public Output<List<String>> matchValues() {
        return this.matchValues;
    }

    /**
     * Defaults to `false`.
     * 
     */
    @Import(name="negateCondition")
    private @Nullable Output<Boolean> negateCondition;

    /**
     * @return Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }

    /**
     * Valid values are `Equal`.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return Valid values are `Equal`.
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    private EndpointDeliveryRuleHttpVersionConditionArgs() {}

    private EndpointDeliveryRuleHttpVersionConditionArgs(EndpointDeliveryRuleHttpVersionConditionArgs $) {
        this.matchValues = $.matchValues;
        this.negateCondition = $.negateCondition;
        this.operator = $.operator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointDeliveryRuleHttpVersionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointDeliveryRuleHttpVersionConditionArgs $;

        public Builder() {
            $ = new EndpointDeliveryRuleHttpVersionConditionArgs();
        }

        public Builder(EndpointDeliveryRuleHttpVersionConditionArgs defaults) {
            $ = new EndpointDeliveryRuleHttpVersionConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchValues Valid values are `0.9`, `1.0`, `1.1` and `2.0`.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(Output<List<String>> matchValues) {
            $.matchValues = matchValues;
            return this;
        }

        /**
         * @param matchValues Valid values are `0.9`, `1.0`, `1.1` and `2.0`.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(List<String> matchValues) {
            return matchValues(Output.of(matchValues));
        }

        /**
         * @param matchValues Valid values are `0.9`, `1.0`, `1.1` and `2.0`.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }

        /**
         * @param negateCondition Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(@Nullable Output<Boolean> negateCondition) {
            $.negateCondition = negateCondition;
            return this;
        }

        /**
         * @param negateCondition Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(Boolean negateCondition) {
            return negateCondition(Output.of(negateCondition));
        }

        /**
         * @param operator Valid values are `Equal`.
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Valid values are `Equal`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public EndpointDeliveryRuleHttpVersionConditionArgs build() {
            $.matchValues = Objects.requireNonNull($.matchValues, "expected parameter 'matchValues' to be non-null");
            return $;
        }
    }

}
