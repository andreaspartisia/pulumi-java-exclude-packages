// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs Empty = new WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs();

    public WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs();
        }
    }
}