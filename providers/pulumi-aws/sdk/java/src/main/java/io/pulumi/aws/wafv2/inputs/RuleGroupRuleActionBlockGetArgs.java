// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionBlockGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionBlockGetArgs Empty = new RuleGroupRuleActionBlockGetArgs();

    /**
     * Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    @InputImport(name="customResponse")
      private final @Nullable Input<RuleGroupRuleActionBlockCustomResponseGetArgs> customResponse;

    public Input<RuleGroupRuleActionBlockCustomResponseGetArgs> getCustomResponse() {
        return this.customResponse == null ? Input.empty() : this.customResponse;
    }

    public RuleGroupRuleActionBlockGetArgs(@Nullable Input<RuleGroupRuleActionBlockCustomResponseGetArgs> customResponse) {
        this.customResponse = customResponse;
    }

    private RuleGroupRuleActionBlockGetArgs() {
        this.customResponse = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionBlockGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleActionBlockCustomResponseGetArgs> customResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionBlockGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponse = defaults.customResponse;
        }

        public Builder setCustomResponse(@Nullable Input<RuleGroupRuleActionBlockCustomResponseGetArgs> customResponse) {
            this.customResponse = customResponse;
            return this;
        }

        public Builder setCustomResponse(@Nullable RuleGroupRuleActionBlockCustomResponseGetArgs customResponse) {
            this.customResponse = Input.ofNullable(customResponse);
            return this;
        }
        public RuleGroupRuleActionBlockGetArgs build() {
            return new RuleGroupRuleActionBlockGetArgs(customResponse);
        }
    }
}