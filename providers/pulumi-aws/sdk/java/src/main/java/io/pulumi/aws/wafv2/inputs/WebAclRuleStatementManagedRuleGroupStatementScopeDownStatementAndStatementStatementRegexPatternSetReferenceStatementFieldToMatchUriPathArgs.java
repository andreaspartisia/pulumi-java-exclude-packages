// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs();

    public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs();
        }
    }
}