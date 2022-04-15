// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaConditionResponse;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaRuleBoostActionResponse;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaRuleFilterActionResponse;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaRuleIgnoreActionResponse;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaRuleRedirectActionResponse;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaRuleReplacementActionResponse;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2alphaRuleResponse {
    /**
     * A boost action.
     * 
     */
    private final GoogleCloudRetailV2alphaRuleBoostActionResponse boostAction;
    /**
     * The condition that triggers the rule. If the condition is empty, the rule will always apply.
     * 
     */
    private final GoogleCloudRetailV2alphaConditionResponse condition;
    /**
     * Prevents term from being associated with other terms.
     * 
     */
    private final GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse doNotAssociateAction;
    /**
     * Filters results.
     * 
     */
    private final GoogleCloudRetailV2alphaRuleFilterActionResponse filterAction;
    /**
     * Ignores specific terms from query during search.
     * 
     */
    private final GoogleCloudRetailV2alphaRuleIgnoreActionResponse ignoreAction;
    /**
     * Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
     * 
     */
    private final GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse onewaySynonymsAction;
    /**
     * Redirects a shopper to a specific page.
     * 
     */
    private final GoogleCloudRetailV2alphaRuleRedirectActionResponse redirectAction;
    /**
     * Replaces specific terms in the query.
     * 
     */
    private final GoogleCloudRetailV2alphaRuleReplacementActionResponse replacementAction;
    /**
     * Treats a set of terms as synonyms of one another.
     * 
     */
    private final GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse twowaySynonymsAction;

    @CustomType.Constructor
    private GoogleCloudRetailV2alphaRuleResponse(
        @CustomType.Parameter("boostAction") GoogleCloudRetailV2alphaRuleBoostActionResponse boostAction,
        @CustomType.Parameter("condition") GoogleCloudRetailV2alphaConditionResponse condition,
        @CustomType.Parameter("doNotAssociateAction") GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse doNotAssociateAction,
        @CustomType.Parameter("filterAction") GoogleCloudRetailV2alphaRuleFilterActionResponse filterAction,
        @CustomType.Parameter("ignoreAction") GoogleCloudRetailV2alphaRuleIgnoreActionResponse ignoreAction,
        @CustomType.Parameter("onewaySynonymsAction") GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse onewaySynonymsAction,
        @CustomType.Parameter("redirectAction") GoogleCloudRetailV2alphaRuleRedirectActionResponse redirectAction,
        @CustomType.Parameter("replacementAction") GoogleCloudRetailV2alphaRuleReplacementActionResponse replacementAction,
        @CustomType.Parameter("twowaySynonymsAction") GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse twowaySynonymsAction) {
        this.boostAction = boostAction;
        this.condition = condition;
        this.doNotAssociateAction = doNotAssociateAction;
        this.filterAction = filterAction;
        this.ignoreAction = ignoreAction;
        this.onewaySynonymsAction = onewaySynonymsAction;
        this.redirectAction = redirectAction;
        this.replacementAction = replacementAction;
        this.twowaySynonymsAction = twowaySynonymsAction;
    }

    /**
     * A boost action.
     * 
    */
    public GoogleCloudRetailV2alphaRuleBoostActionResponse boostAction() {
        return this.boostAction;
    }
    /**
     * The condition that triggers the rule. If the condition is empty, the rule will always apply.
     * 
    */
    public GoogleCloudRetailV2alphaConditionResponse condition() {
        return this.condition;
    }
    /**
     * Prevents term from being associated with other terms.
     * 
    */
    public GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse doNotAssociateAction() {
        return this.doNotAssociateAction;
    }
    /**
     * Filters results.
     * 
    */
    public GoogleCloudRetailV2alphaRuleFilterActionResponse filterAction() {
        return this.filterAction;
    }
    /**
     * Ignores specific terms from query during search.
     * 
    */
    public GoogleCloudRetailV2alphaRuleIgnoreActionResponse ignoreAction() {
        return this.ignoreAction;
    }
    /**
     * Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
     * 
    */
    public GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse onewaySynonymsAction() {
        return this.onewaySynonymsAction;
    }
    /**
     * Redirects a shopper to a specific page.
     * 
    */
    public GoogleCloudRetailV2alphaRuleRedirectActionResponse redirectAction() {
        return this.redirectAction;
    }
    /**
     * Replaces specific terms in the query.
     * 
    */
    public GoogleCloudRetailV2alphaRuleReplacementActionResponse replacementAction() {
        return this.replacementAction;
    }
    /**
     * Treats a set of terms as synonyms of one another.
     * 
    */
    public GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse twowaySynonymsAction() {
        return this.twowaySynonymsAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaRuleBoostActionResponse boostAction;
        private GoogleCloudRetailV2alphaConditionResponse condition;
        private GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse doNotAssociateAction;
        private GoogleCloudRetailV2alphaRuleFilterActionResponse filterAction;
        private GoogleCloudRetailV2alphaRuleIgnoreActionResponse ignoreAction;
        private GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse onewaySynonymsAction;
        private GoogleCloudRetailV2alphaRuleRedirectActionResponse redirectAction;
        private GoogleCloudRetailV2alphaRuleReplacementActionResponse replacementAction;
        private GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse twowaySynonymsAction;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boostAction = defaults.boostAction;
    	      this.condition = defaults.condition;
    	      this.doNotAssociateAction = defaults.doNotAssociateAction;
    	      this.filterAction = defaults.filterAction;
    	      this.ignoreAction = defaults.ignoreAction;
    	      this.onewaySynonymsAction = defaults.onewaySynonymsAction;
    	      this.redirectAction = defaults.redirectAction;
    	      this.replacementAction = defaults.replacementAction;
    	      this.twowaySynonymsAction = defaults.twowaySynonymsAction;
        }

        public Builder boostAction(GoogleCloudRetailV2alphaRuleBoostActionResponse boostAction) {
            this.boostAction = Objects.requireNonNull(boostAction);
            return this;
        }
        public Builder condition(GoogleCloudRetailV2alphaConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder doNotAssociateAction(GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse doNotAssociateAction) {
            this.doNotAssociateAction = Objects.requireNonNull(doNotAssociateAction);
            return this;
        }
        public Builder filterAction(GoogleCloudRetailV2alphaRuleFilterActionResponse filterAction) {
            this.filterAction = Objects.requireNonNull(filterAction);
            return this;
        }
        public Builder ignoreAction(GoogleCloudRetailV2alphaRuleIgnoreActionResponse ignoreAction) {
            this.ignoreAction = Objects.requireNonNull(ignoreAction);
            return this;
        }
        public Builder onewaySynonymsAction(GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse onewaySynonymsAction) {
            this.onewaySynonymsAction = Objects.requireNonNull(onewaySynonymsAction);
            return this;
        }
        public Builder redirectAction(GoogleCloudRetailV2alphaRuleRedirectActionResponse redirectAction) {
            this.redirectAction = Objects.requireNonNull(redirectAction);
            return this;
        }
        public Builder replacementAction(GoogleCloudRetailV2alphaRuleReplacementActionResponse replacementAction) {
            this.replacementAction = Objects.requireNonNull(replacementAction);
            return this;
        }
        public Builder twowaySynonymsAction(GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse twowaySynonymsAction) {
            this.twowaySynonymsAction = Objects.requireNonNull(twowaySynonymsAction);
            return this;
        }        public GoogleCloudRetailV2alphaRuleResponse build() {
            return new GoogleCloudRetailV2alphaRuleResponse(boostAction, condition, doNotAssociateAction, filterAction, ignoreAction, onewaySynonymsAction, redirectAction, replacementAction, twowaySynonymsAction);
        }
    }
}
