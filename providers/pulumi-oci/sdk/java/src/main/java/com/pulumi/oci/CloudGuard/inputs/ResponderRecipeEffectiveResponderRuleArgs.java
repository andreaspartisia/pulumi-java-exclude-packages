// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.CloudGuard.inputs.ResponderRecipeEffectiveResponderRuleDetailArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponderRecipeEffectiveResponderRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponderRecipeEffectiveResponderRuleArgs Empty = new ResponderRecipeEffectiveResponderRuleArgs();

    /**
     * (Updatable) Compartment Identifier
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) ResponderRecipe Description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) ResponderRecipe Description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) Details of UpdateResponderRuleDetails.
     * 
     */
    @Import(name="details")
    private @Nullable Output<List<ResponderRecipeEffectiveResponderRuleDetailArgs>> details;

    /**
     * @return (Updatable) Details of UpdateResponderRuleDetails.
     * 
     */
    public Optional<Output<List<ResponderRecipeEffectiveResponderRuleDetailArgs>>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * (Updatable) ResponderRecipe Display Name
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) ResponderRecipe Display Name
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * List of Policy
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<String>> policies;

    /**
     * @return List of Policy
     * 
     */
    public Optional<Output<List<String>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * (Updatable) ResponderRecipeRule Identifier
     * 
     */
    @Import(name="responderRuleId")
    private @Nullable Output<String> responderRuleId;

    /**
     * @return (Updatable) ResponderRecipeRule Identifier
     * 
     */
    public Optional<Output<String>> responderRuleId() {
        return Optional.ofNullable(this.responderRuleId);
    }

    /**
     * The current state of the Example.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the Example.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Supported Execution Modes
     * 
     */
    @Import(name="supportedModes")
    private @Nullable Output<List<String>> supportedModes;

    /**
     * @return Supported Execution Modes
     * 
     */
    public Optional<Output<List<String>>> supportedModes() {
        return Optional.ofNullable(this.supportedModes);
    }

    /**
     * The date and time the responder recipe was created. Format defined by RFC3339.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the responder recipe was created. Format defined by RFC3339.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * The date and time the responder recipe was updated. Format defined by RFC3339.
     * 
     */
    @Import(name="timeUpdated")
    private @Nullable Output<String> timeUpdated;

    /**
     * @return The date and time the responder recipe was updated. Format defined by RFC3339.
     * 
     */
    public Optional<Output<String>> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    /**
     * Type of Responder
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of Responder
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ResponderRecipeEffectiveResponderRuleArgs() {}

    private ResponderRecipeEffectiveResponderRuleArgs(ResponderRecipeEffectiveResponderRuleArgs $) {
        this.compartmentId = $.compartmentId;
        this.description = $.description;
        this.details = $.details;
        this.displayName = $.displayName;
        this.lifecycleDetails = $.lifecycleDetails;
        this.policies = $.policies;
        this.responderRuleId = $.responderRuleId;
        this.state = $.state;
        this.supportedModes = $.supportedModes;
        this.timeCreated = $.timeCreated;
        this.timeUpdated = $.timeUpdated;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponderRecipeEffectiveResponderRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponderRecipeEffectiveResponderRuleArgs $;

        public Builder() {
            $ = new ResponderRecipeEffectiveResponderRuleArgs();
        }

        public Builder(ResponderRecipeEffectiveResponderRuleArgs defaults) {
            $ = new ResponderRecipeEffectiveResponderRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param description (Updatable) ResponderRecipe Description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) ResponderRecipe Description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param details (Updatable) Details of UpdateResponderRuleDetails.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<List<ResponderRecipeEffectiveResponderRuleDetailArgs>> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details (Updatable) Details of UpdateResponderRuleDetails.
         * 
         * @return builder
         * 
         */
        public Builder details(List<ResponderRecipeEffectiveResponderRuleDetailArgs> details) {
            return details(Output.of(details));
        }

        /**
         * @param details (Updatable) Details of UpdateResponderRuleDetails.
         * 
         * @return builder
         * 
         */
        public Builder details(ResponderRecipeEffectiveResponderRuleDetailArgs... details) {
            return details(List.of(details));
        }

        /**
         * @param displayName (Updatable) ResponderRecipe Display Name
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) ResponderRecipe Display Name
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param lifecycleDetails A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param policies List of Policy
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies List of Policy
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies List of Policy
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        /**
         * @param responderRuleId (Updatable) ResponderRecipeRule Identifier
         * 
         * @return builder
         * 
         */
        public Builder responderRuleId(@Nullable Output<String> responderRuleId) {
            $.responderRuleId = responderRuleId;
            return this;
        }

        /**
         * @param responderRuleId (Updatable) ResponderRecipeRule Identifier
         * 
         * @return builder
         * 
         */
        public Builder responderRuleId(String responderRuleId) {
            return responderRuleId(Output.of(responderRuleId));
        }

        /**
         * @param state The current state of the Example.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the Example.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param supportedModes Supported Execution Modes
         * 
         * @return builder
         * 
         */
        public Builder supportedModes(@Nullable Output<List<String>> supportedModes) {
            $.supportedModes = supportedModes;
            return this;
        }

        /**
         * @param supportedModes Supported Execution Modes
         * 
         * @return builder
         * 
         */
        public Builder supportedModes(List<String> supportedModes) {
            return supportedModes(Output.of(supportedModes));
        }

        /**
         * @param supportedModes Supported Execution Modes
         * 
         * @return builder
         * 
         */
        public Builder supportedModes(String... supportedModes) {
            return supportedModes(List.of(supportedModes));
        }

        /**
         * @param timeCreated The date and time the responder recipe was created. Format defined by RFC3339.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the responder recipe was created. Format defined by RFC3339.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeUpdated The date and time the responder recipe was updated. Format defined by RFC3339.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(@Nullable Output<String> timeUpdated) {
            $.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * @param timeUpdated The date and time the responder recipe was updated. Format defined by RFC3339.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(String timeUpdated) {
            return timeUpdated(Output.of(timeUpdated));
        }

        /**
         * @param type Type of Responder
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of Responder
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ResponderRecipeEffectiveResponderRuleArgs build() {
            return $;
        }
    }

}
