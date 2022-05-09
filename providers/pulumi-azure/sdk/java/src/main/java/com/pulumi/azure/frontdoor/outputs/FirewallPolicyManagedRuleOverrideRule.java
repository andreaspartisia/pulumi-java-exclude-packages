// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.outputs;

import com.pulumi.azure.frontdoor.outputs.FirewallPolicyManagedRuleOverrideRuleExclusion;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyManagedRuleOverrideRule {
    /**
     * @return The action to be applied when the rule matches. Possible values are `Allow`, `Block`, `Log`, or `Redirect`.
     * 
     */
    private final String action;
    /**
     * @return Is the managed rule override enabled or disabled. Defaults to `false`
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return One or more `exclusion` blocks as defined below.
     * 
     */
    private final @Nullable List<FirewallPolicyManagedRuleOverrideRuleExclusion> exclusions;
    /**
     * @return Identifier for the managed rule.
     * 
     */
    private final String ruleId;

    @CustomType.Constructor
    private FirewallPolicyManagedRuleOverrideRule(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("exclusions") @Nullable List<FirewallPolicyManagedRuleOverrideRuleExclusion> exclusions,
        @CustomType.Parameter("ruleId") String ruleId) {
        this.action = action;
        this.enabled = enabled;
        this.exclusions = exclusions;
        this.ruleId = ruleId;
    }

    /**
     * @return The action to be applied when the rule matches. Possible values are `Allow`, `Block`, `Log`, or `Redirect`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Is the managed rule override enabled or disabled. Defaults to `false`
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return One or more `exclusion` blocks as defined below.
     * 
     */
    public List<FirewallPolicyManagedRuleOverrideRuleExclusion> exclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }
    /**
     * @return Identifier for the managed rule.
     * 
     */
    public String ruleId() {
        return this.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyManagedRuleOverrideRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private @Nullable Boolean enabled;
        private @Nullable List<FirewallPolicyManagedRuleOverrideRuleExclusion> exclusions;
        private String ruleId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyManagedRuleOverrideRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabled = defaults.enabled;
    	      this.exclusions = defaults.exclusions;
    	      this.ruleId = defaults.ruleId;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder exclusions(@Nullable List<FirewallPolicyManagedRuleOverrideRuleExclusion> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(FirewallPolicyManagedRuleOverrideRuleExclusion... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder ruleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }        public FirewallPolicyManagedRuleOverrideRule build() {
            return new FirewallPolicyManagedRuleOverrideRule(action, enabled, exclusions, ruleId);
        }
    }
}
