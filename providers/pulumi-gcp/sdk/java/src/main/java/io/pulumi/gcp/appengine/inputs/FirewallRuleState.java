// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleState extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleState Empty = new FirewallRuleState();

    /**
     * The action to take if this rule matches.
     * Possible values are `UNSPECIFIED_ACTION`, `ALLOW`, and `DENY`.
     * 
     */
    @InputImport(name="action")
    private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * An optional string description of this rule.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A positive integer that defines the order of rule evaluation.
     * Rules with the lowest priority are evaluated first.
     * A default rule at priority Int32.MaxValue matches all IPv4 and
     * IPv6 traffic when no previous rule matches. Only the action of
     * this rule can be modified by the user.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * IP address or range, defined using CIDR notation, of requests that this rule applies to.
     * 
     */
    @InputImport(name="sourceRange")
    private final @Nullable Input<String> sourceRange;

    public Input<String> getSourceRange() {
        return this.sourceRange == null ? Input.empty() : this.sourceRange;
    }

    public FirewallRuleState(
        @Nullable Input<String> action,
        @Nullable Input<String> description,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> project,
        @Nullable Input<String> sourceRange) {
        this.action = action;
        this.description = description;
        this.priority = priority;
        this.project = project;
        this.sourceRange = sourceRange;
    }

    private FirewallRuleState() {
        this.action = Input.empty();
        this.description = Input.empty();
        this.priority = Input.empty();
        this.project = Input.empty();
        this.sourceRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> project;
        private @Nullable Input<String> sourceRange;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.sourceRange = defaults.sourceRange;
        }

        public Builder setAction(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSourceRange(@Nullable Input<String> sourceRange) {
            this.sourceRange = sourceRange;
            return this;
        }

        public Builder setSourceRange(@Nullable String sourceRange) {
            this.sourceRange = Input.ofNullable(sourceRange);
            return this;
        }

        public FirewallRuleState build() {
            return new FirewallRuleState(action, description, priority, project, sourceRange);
        }
    }
}