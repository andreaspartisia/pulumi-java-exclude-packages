// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.ManagementPolicyRuleActions;
import com.pulumi.azure.storage.outputs.ManagementPolicyRuleFilters;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementPolicyRule {
    /**
     * @return An `actions` block as documented below.
     * 
     */
    private final ManagementPolicyRuleActions actions;
    /**
     * @return Boolean to specify whether the rule is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * @return A `filter` block as documented below.
     * 
     */
    private final @Nullable ManagementPolicyRuleFilters filters;
    /**
     * @return A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ManagementPolicyRule(
        @CustomType.Parameter("actions") ManagementPolicyRuleActions actions,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("filters") @Nullable ManagementPolicyRuleFilters filters,
        @CustomType.Parameter("name") String name) {
        this.actions = actions;
        this.enabled = enabled;
        this.filters = filters;
        this.name = name;
    }

    /**
     * @return An `actions` block as documented below.
     * 
     */
    public ManagementPolicyRuleActions actions() {
        return this.actions;
    }
    /**
     * @return Boolean to specify whether the rule is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return A `filter` block as documented below.
     * 
     */
    public Optional<ManagementPolicyRuleFilters> filters() {
        return Optional.ofNullable(this.filters);
    }
    /**
     * @return A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyRuleActions actions;
        private Boolean enabled;
        private @Nullable ManagementPolicyRuleFilters filters;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.enabled = defaults.enabled;
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
        }

        public Builder actions(ManagementPolicyRuleActions actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder filters(@Nullable ManagementPolicyRuleFilters filters) {
            this.filters = filters;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ManagementPolicyRule build() {
            return new ManagementPolicyRule(actions, enabled, filters, name);
        }
    }
}
