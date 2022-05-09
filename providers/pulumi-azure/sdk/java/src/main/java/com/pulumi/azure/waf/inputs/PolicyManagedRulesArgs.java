// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf.inputs;

import com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionArgs;
import com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyManagedRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyManagedRulesArgs Empty = new PolicyManagedRulesArgs();

    /**
     * One or more `exclusion` block defined below.
     * 
     */
    @Import(name="exclusions")
    private @Nullable Output<List<PolicyManagedRulesExclusionArgs>> exclusions;

    /**
     * @return One or more `exclusion` block defined below.
     * 
     */
    public Optional<Output<List<PolicyManagedRulesExclusionArgs>>> exclusions() {
        return Optional.ofNullable(this.exclusions);
    }

    /**
     * One or more `managed_rule_set` block defined below.
     * 
     */
    @Import(name="managedRuleSets", required=true)
    private Output<List<PolicyManagedRulesManagedRuleSetArgs>> managedRuleSets;

    /**
     * @return One or more `managed_rule_set` block defined below.
     * 
     */
    public Output<List<PolicyManagedRulesManagedRuleSetArgs>> managedRuleSets() {
        return this.managedRuleSets;
    }

    private PolicyManagedRulesArgs() {}

    private PolicyManagedRulesArgs(PolicyManagedRulesArgs $) {
        this.exclusions = $.exclusions;
        this.managedRuleSets = $.managedRuleSets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyManagedRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyManagedRulesArgs $;

        public Builder() {
            $ = new PolicyManagedRulesArgs();
        }

        public Builder(PolicyManagedRulesArgs defaults) {
            $ = new PolicyManagedRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exclusions One or more `exclusion` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(@Nullable Output<List<PolicyManagedRulesExclusionArgs>> exclusions) {
            $.exclusions = exclusions;
            return this;
        }

        /**
         * @param exclusions One or more `exclusion` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(List<PolicyManagedRulesExclusionArgs> exclusions) {
            return exclusions(Output.of(exclusions));
        }

        /**
         * @param exclusions One or more `exclusion` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(PolicyManagedRulesExclusionArgs... exclusions) {
            return exclusions(List.of(exclusions));
        }

        /**
         * @param managedRuleSets One or more `managed_rule_set` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder managedRuleSets(Output<List<PolicyManagedRulesManagedRuleSetArgs>> managedRuleSets) {
            $.managedRuleSets = managedRuleSets;
            return this;
        }

        /**
         * @param managedRuleSets One or more `managed_rule_set` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder managedRuleSets(List<PolicyManagedRulesManagedRuleSetArgs> managedRuleSets) {
            return managedRuleSets(Output.of(managedRuleSets));
        }

        /**
         * @param managedRuleSets One or more `managed_rule_set` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder managedRuleSets(PolicyManagedRulesManagedRuleSetArgs... managedRuleSets) {
            return managedRuleSets(List.of(managedRuleSets));
        }

        public PolicyManagedRulesArgs build() {
            $.managedRuleSets = Objects.requireNonNull($.managedRuleSets, "expected parameter 'managedRuleSets' to be non-null");
            return $;
        }
    }

}
