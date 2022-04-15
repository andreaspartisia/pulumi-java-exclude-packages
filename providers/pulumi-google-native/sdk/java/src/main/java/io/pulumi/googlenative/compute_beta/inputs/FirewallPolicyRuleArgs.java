// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.enums.FirewallPolicyRuleDirection;
import io.pulumi.googlenative.compute_beta.inputs.FirewallPolicyRuleMatcherArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a rule that describes one or more match conditions along with the action to be taken when traffic matches this condition (allow or deny).
 * 
 */
public final class FirewallPolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleArgs Empty = new FirewallPolicyRuleArgs();

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * An optional description for this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The direction in which this rule applies.
     * 
     */
    @Import(name="direction")
      private final @Nullable Output<FirewallPolicyRuleDirection> direction;

    public Output<FirewallPolicyRuleDirection> direction() {
        return this.direction == null ? Codegen.empty() : this.direction;
    }

    /**
     * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
     * 
     */
    @Import(name="enableLogging")
      private final @Nullable Output<Boolean> enableLogging;

    public Output<Boolean> enableLogging() {
        return this.enableLogging == null ? Codegen.empty() : this.enableLogging;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
     */
    @Import(name="match")
      private final @Nullable Output<FirewallPolicyRuleMatcherArgs> match;

    public Output<FirewallPolicyRuleMatcherArgs> match() {
        return this.match == null ? Codegen.empty() : this.match;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
     * 
     */
    @Import(name="targetResources")
      private final @Nullable Output<List<String>> targetResources;

    public Output<List<String>> targetResources() {
        return this.targetResources == null ? Codegen.empty() : this.targetResources;
    }

    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    @Import(name="targetServiceAccounts")
      private final @Nullable Output<List<String>> targetServiceAccounts;

    public Output<List<String>> targetServiceAccounts() {
        return this.targetServiceAccounts == null ? Codegen.empty() : this.targetServiceAccounts;
    }

    public FirewallPolicyRuleArgs(
        @Nullable Output<String> action,
        @Nullable Output<String> description,
        @Nullable Output<FirewallPolicyRuleDirection> direction,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<Boolean> enableLogging,
        @Nullable Output<FirewallPolicyRuleMatcherArgs> match,
        @Nullable Output<Integer> priority,
        @Nullable Output<List<String>> targetResources,
        @Nullable Output<List<String>> targetServiceAccounts) {
        this.action = action;
        this.description = description;
        this.direction = direction;
        this.disabled = disabled;
        this.enableLogging = enableLogging;
        this.match = match;
        this.priority = priority;
        this.targetResources = targetResources;
        this.targetServiceAccounts = targetServiceAccounts;
    }

    private FirewallPolicyRuleArgs() {
        this.action = Codegen.empty();
        this.description = Codegen.empty();
        this.direction = Codegen.empty();
        this.disabled = Codegen.empty();
        this.enableLogging = Codegen.empty();
        this.match = Codegen.empty();
        this.priority = Codegen.empty();
        this.targetResources = Codegen.empty();
        this.targetServiceAccounts = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<String> description;
        private @Nullable Output<FirewallPolicyRuleDirection> direction;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<Boolean> enableLogging;
        private @Nullable Output<FirewallPolicyRuleMatcherArgs> match;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<List<String>> targetResources;
        private @Nullable Output<List<String>> targetServiceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.enableLogging = defaults.enableLogging;
    	      this.match = defaults.match;
    	      this.priority = defaults.priority;
    	      this.targetResources = defaults.targetResources;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable String action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder direction(@Nullable Output<FirewallPolicyRuleDirection> direction) {
            this.direction = direction;
            return this;
        }
        public Builder direction(@Nullable FirewallPolicyRuleDirection direction) {
            this.direction = Codegen.ofNullable(direction);
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }
        public Builder enableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Codegen.ofNullable(enableLogging);
            return this;
        }
        public Builder match(@Nullable Output<FirewallPolicyRuleMatcherArgs> match) {
            this.match = match;
            return this;
        }
        public Builder match(@Nullable FirewallPolicyRuleMatcherArgs match) {
            this.match = Codegen.ofNullable(match);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder targetResources(@Nullable Output<List<String>> targetResources) {
            this.targetResources = targetResources;
            return this;
        }
        public Builder targetResources(@Nullable List<String> targetResources) {
            this.targetResources = Codegen.ofNullable(targetResources);
            return this;
        }
        public Builder targetResources(String... targetResources) {
            return targetResources(List.of(targetResources));
        }
        public Builder targetServiceAccounts(@Nullable Output<List<String>> targetServiceAccounts) {
            this.targetServiceAccounts = targetServiceAccounts;
            return this;
        }
        public Builder targetServiceAccounts(@Nullable List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Codegen.ofNullable(targetServiceAccounts);
            return this;
        }
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }        public FirewallPolicyRuleArgs build() {
            return new FirewallPolicyRuleArgs(action, description, direction, disabled, enableLogging, match, priority, targetResources, targetServiceAccounts);
        }
    }
}
