// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementExcludedRuleArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementArgs();

    /**
     * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
     */
    @InputImport(name="excludedRules")
      private final @Nullable Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleArgs>> excludedRules;

    public Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleArgs>> getExcludedRules() {
        return this.excludedRules == null ? Input.empty() : this.excludedRules;
    }

    /**
     * The name of the managed rule group.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Narrows the scope of the statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details.
     * 
     */
    @InputImport(name="scopeDownStatement")
      private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs> scopeDownStatement;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Input.empty() : this.scopeDownStatement;
    }

    /**
     * The name of the managed rule group vendor.
     * 
     */
    @InputImport(name="vendorName", required=true)
      private final Input<String> vendorName;

    public Input<String> getVendorName() {
        return this.vendorName;
    }

    public WebAclRuleStatementManagedRuleGroupStatementArgs(
        @Nullable Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleArgs>> excludedRules,
        Input<String> name,
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs> scopeDownStatement,
        Input<String> vendorName) {
        this.excludedRules = excludedRules;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
    }

    private WebAclRuleStatementManagedRuleGroupStatementArgs() {
        this.excludedRules = Input.empty();
        this.name = Input.empty();
        this.scopeDownStatement = Input.empty();
        this.vendorName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleArgs>> excludedRules;
        private Input<String> name;
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs> scopeDownStatement;
        private Input<String> vendorName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedRules = defaults.excludedRules;
    	      this.name = defaults.name;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
    	      this.vendorName = defaults.vendorName;
        }

        public Builder setExcludedRules(@Nullable Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleArgs>> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }

        public Builder setExcludedRules(@Nullable List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleArgs> excludedRules) {
            this.excludedRules = Input.ofNullable(excludedRules);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setScopeDownStatement(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs> scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }

        public Builder setScopeDownStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs scopeDownStatement) {
            this.scopeDownStatement = Input.ofNullable(scopeDownStatement);
            return this;
        }

        public Builder setVendorName(Input<String> vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }

        public Builder setVendorName(String vendorName) {
            this.vendorName = Input.of(Objects.requireNonNull(vendorName));
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementArgs(excludedRules, name, scopeDownStatement, vendorName);
        }
    }
}