// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionBlockArgs Empty = new RuleGroupRuleActionBlockArgs();

    /**
     * Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    @InputImport(name="customResponse")
      private final @Nullable Input<RuleGroupRuleActionBlockCustomResponseArgs> customResponse;

    public Input<RuleGroupRuleActionBlockCustomResponseArgs> getCustomResponse() {
        return this.customResponse == null ? Input.empty() : this.customResponse;
    }

    public RuleGroupRuleActionBlockArgs(@Nullable Input<RuleGroupRuleActionBlockCustomResponseArgs> customResponse) {
        this.customResponse = customResponse;
    }

    private RuleGroupRuleActionBlockArgs() {
        this.customResponse = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleActionBlockCustomResponseArgs> customResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponse = defaults.customResponse;
        }

        public Builder setCustomResponse(@Nullable Input<RuleGroupRuleActionBlockCustomResponseArgs> customResponse) {
            this.customResponse = customResponse;
            return this;
        }

        public Builder setCustomResponse(@Nullable RuleGroupRuleActionBlockCustomResponseArgs customResponse) {
            this.customResponse = Input.ofNullable(customResponse);
            return this;
        }
        public RuleGroupRuleActionBlockArgs build() {
            return new RuleGroupRuleActionBlockArgs(customResponse);
        }
    }
}