// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs Empty = new RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs();

    public RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs();
        }
    }
}