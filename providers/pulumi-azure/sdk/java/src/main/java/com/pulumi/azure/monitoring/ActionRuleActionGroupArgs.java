// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupConditionArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupScopeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionRuleActionGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionRuleActionGroupArgs Empty = new ActionRuleActionGroupArgs();

    /**
     * Specifies the resource id of monitor action group.
     * 
     */
    @Import(name="actionGroupId", required=true)
    private Output<String> actionGroupId;

    /**
     * @return Specifies the resource id of monitor action group.
     * 
     */
    public Output<String> actionGroupId() {
        return this.actionGroupId;
    }

    /**
     * A `condition` block as defined below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<ActionRuleActionGroupConditionArgs> condition;

    /**
     * @return A `condition` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleActionGroupConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * Specifies a description for the Action Rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specifies a description for the Action Rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Is the Action Rule enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the Action Rule enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the name of the Monitor Action Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Monitor Action Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the resource group in which the Monitor Action Rule should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group in which the Monitor Action Rule should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `scope` block as defined below.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<ActionRuleActionGroupScopeArgs> scope;

    /**
     * @return A `scope` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleActionGroupScopeArgs>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ActionRuleActionGroupArgs() {}

    private ActionRuleActionGroupArgs(ActionRuleActionGroupArgs $) {
        this.actionGroupId = $.actionGroupId;
        this.condition = $.condition;
        this.description = $.description;
        this.enabled = $.enabled;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scope = $.scope;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionRuleActionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionRuleActionGroupArgs $;

        public Builder() {
            $ = new ActionRuleActionGroupArgs();
        }

        public Builder(ActionRuleActionGroupArgs defaults) {
            $ = new ActionRuleActionGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionGroupId Specifies the resource id of monitor action group.
         * 
         * @return builder
         * 
         */
        public Builder actionGroupId(Output<String> actionGroupId) {
            $.actionGroupId = actionGroupId;
            return this;
        }

        /**
         * @param actionGroupId Specifies the resource id of monitor action group.
         * 
         * @return builder
         * 
         */
        public Builder actionGroupId(String actionGroupId) {
            return actionGroupId(Output.of(actionGroupId));
        }

        /**
         * @param condition A `condition` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<ActionRuleActionGroupConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition A `condition` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder condition(ActionRuleActionGroupConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param description Specifies a description for the Action Rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specifies a description for the Action Rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Is the Action Rule enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the Action Rule enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Specifies the name of the Monitor Action Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Monitor Action Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group in which the Monitor Action Rule should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group in which the Monitor Action Rule should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scope A `scope` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<ActionRuleActionGroupScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope A `scope` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder scope(ActionRuleActionGroupScopeArgs scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ActionRuleActionGroupArgs build() {
            $.actionGroupId = Objects.requireNonNull($.actionGroupId, "expected parameter 'actionGroupId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
