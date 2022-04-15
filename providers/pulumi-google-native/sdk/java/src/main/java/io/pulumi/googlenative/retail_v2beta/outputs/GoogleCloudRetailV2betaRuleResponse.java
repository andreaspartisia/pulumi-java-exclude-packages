// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaConditionResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleBoostActionResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleFilterActionResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleIgnoreActionResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleRedirectActionResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleReplacementActionResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaRuleResponse {
    /**
     * A boost action.
     * 
     */
    private final GoogleCloudRetailV2betaRuleBoostActionResponse boostAction;
    /**
     * The condition that triggers the rule. If the condition is empty, the rule will always apply.
     * 
     */
    private final GoogleCloudRetailV2betaConditionResponse condition;
    /**
     * Prevents term from being associated with other terms.
     * 
     */
    private final GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction;
    /**
     * Filters results.
     * 
     */
    private final GoogleCloudRetailV2betaRuleFilterActionResponse filterAction;
    /**
     * Ignores specific terms from query during search.
     * 
     */
    private final GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction;
    /**
     * Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
     * 
     */
    private final GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction;
    /**
     * Redirects a shopper to a specific page.
     * 
     */
    private final GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction;
    /**
     * Replaces specific terms in the query.
     * 
     */
    private final GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction;
    /**
     * Treats a set of terms as synonyms of one another.
     * 
     */
    private final GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaRuleResponse(
        @CustomType.Parameter("boostAction") GoogleCloudRetailV2betaRuleBoostActionResponse boostAction,
        @CustomType.Parameter("condition") GoogleCloudRetailV2betaConditionResponse condition,
        @CustomType.Parameter("doNotAssociateAction") GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction,
        @CustomType.Parameter("filterAction") GoogleCloudRetailV2betaRuleFilterActionResponse filterAction,
        @CustomType.Parameter("ignoreAction") GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction,
        @CustomType.Parameter("onewaySynonymsAction") GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction,
        @CustomType.Parameter("redirectAction") GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction,
        @CustomType.Parameter("replacementAction") GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction,
        @CustomType.Parameter("twowaySynonymsAction") GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction) {
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
    public GoogleCloudRetailV2betaRuleBoostActionResponse boostAction() {
        return this.boostAction;
    }
    /**
     * The condition that triggers the rule. If the condition is empty, the rule will always apply.
     * 
    */
    public GoogleCloudRetailV2betaConditionResponse condition() {
        return this.condition;
    }
    /**
     * Prevents term from being associated with other terms.
     * 
    */
    public GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction() {
        return this.doNotAssociateAction;
    }
    /**
     * Filters results.
     * 
    */
    public GoogleCloudRetailV2betaRuleFilterActionResponse filterAction() {
        return this.filterAction;
    }
    /**
     * Ignores specific terms from query during search.
     * 
    */
    public GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction() {
        return this.ignoreAction;
    }
    /**
     * Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
     * 
    */
    public GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction() {
        return this.onewaySynonymsAction;
    }
    /**
     * Redirects a shopper to a specific page.
     * 
    */
    public GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction() {
        return this.redirectAction;
    }
    /**
     * Replaces specific terms in the query.
     * 
    */
    public GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction() {
        return this.replacementAction;
    }
    /**
     * Treats a set of terms as synonyms of one another.
     * 
    */
    public GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction() {
        return this.twowaySynonymsAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaRuleBoostActionResponse boostAction;
        private GoogleCloudRetailV2betaConditionResponse condition;
        private GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction;
        private GoogleCloudRetailV2betaRuleFilterActionResponse filterAction;
        private GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction;
        private GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction;
        private GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction;
        private GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction;
        private GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleResponse defaults) {
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

        public Builder boostAction(GoogleCloudRetailV2betaRuleBoostActionResponse boostAction) {
            this.boostAction = Objects.requireNonNull(boostAction);
            return this;
        }
        public Builder condition(GoogleCloudRetailV2betaConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder doNotAssociateAction(GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction) {
            this.doNotAssociateAction = Objects.requireNonNull(doNotAssociateAction);
            return this;
        }
        public Builder filterAction(GoogleCloudRetailV2betaRuleFilterActionResponse filterAction) {
            this.filterAction = Objects.requireNonNull(filterAction);
            return this;
        }
        public Builder ignoreAction(GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction) {
            this.ignoreAction = Objects.requireNonNull(ignoreAction);
            return this;
        }
        public Builder onewaySynonymsAction(GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction) {
            this.onewaySynonymsAction = Objects.requireNonNull(onewaySynonymsAction);
            return this;
        }
        public Builder redirectAction(GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction) {
            this.redirectAction = Objects.requireNonNull(redirectAction);
            return this;
        }
        public Builder replacementAction(GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction) {
            this.replacementAction = Objects.requireNonNull(replacementAction);
            return this;
        }
        public Builder twowaySynonymsAction(GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction) {
            this.twowaySynonymsAction = Objects.requireNonNull(twowaySynonymsAction);
            return this;
        }        public GoogleCloudRetailV2betaRuleResponse build() {
            return new GoogleCloudRetailV2betaRuleResponse(boostAction, condition, doNotAssociateAction, filterAction, ignoreAction, onewaySynonymsAction, redirectAction, replacementAction, twowaySynonymsAction);
        }
    }
}
