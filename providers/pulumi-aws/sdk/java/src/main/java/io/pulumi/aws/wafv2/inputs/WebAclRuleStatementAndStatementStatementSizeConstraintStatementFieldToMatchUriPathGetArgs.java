// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs Empty = new WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs();

    public WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs();
        }
    }
}