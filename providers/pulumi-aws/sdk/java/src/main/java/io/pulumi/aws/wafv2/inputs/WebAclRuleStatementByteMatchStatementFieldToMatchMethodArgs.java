// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs Empty = new WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs();

    public WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs build() {
            return new WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs();
        }
    }
}