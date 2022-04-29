// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CloudGuard.outputs.ResponderRecipeEffectiveResponderRuleDetail;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponderRecipeEffectiveResponderRule {
    /**
     * @return (Updatable) Compartment Identifier
     * 
     */
    private final @Nullable String compartmentId;
    /**
     * @return (Updatable) ResponderRecipe Description
     * 
     */
    private final @Nullable String description;
    /**
     * @return (Updatable) Details of UpdateResponderRuleDetails.
     * 
     */
    private final @Nullable List<ResponderRecipeEffectiveResponderRuleDetail> details;
    /**
     * @return (Updatable) ResponderRecipe Display Name
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    private final @Nullable String lifecycleDetails;
    /**
     * @return List of Policy
     * 
     */
    private final @Nullable List<String> policies;
    /**
     * @return (Updatable) ResponderRecipeRule Identifier
     * 
     */
    private final @Nullable String responderRuleId;
    /**
     * @return The current state of the Example.
     * 
     */
    private final @Nullable String state;
    /**
     * @return Supported Execution Modes
     * 
     */
    private final @Nullable List<String> supportedModes;
    /**
     * @return The date and time the responder recipe was created. Format defined by RFC3339.
     * 
     */
    private final @Nullable String timeCreated;
    /**
     * @return The date and time the responder recipe was updated. Format defined by RFC3339.
     * 
     */
    private final @Nullable String timeUpdated;
    /**
     * @return Type of Responder
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ResponderRecipeEffectiveResponderRule(
        @CustomType.Parameter("compartmentId") @Nullable String compartmentId,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("details") @Nullable List<ResponderRecipeEffectiveResponderRuleDetail> details,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("lifecycleDetails") @Nullable String lifecycleDetails,
        @CustomType.Parameter("policies") @Nullable List<String> policies,
        @CustomType.Parameter("responderRuleId") @Nullable String responderRuleId,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("supportedModes") @Nullable List<String> supportedModes,
        @CustomType.Parameter("timeCreated") @Nullable String timeCreated,
        @CustomType.Parameter("timeUpdated") @Nullable String timeUpdated,
        @CustomType.Parameter("type") @Nullable String type) {
        this.compartmentId = compartmentId;
        this.description = description;
        this.details = details;
        this.displayName = displayName;
        this.lifecycleDetails = lifecycleDetails;
        this.policies = policies;
        this.responderRuleId = responderRuleId;
        this.state = state;
        this.supportedModes = supportedModes;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.type = type;
    }

    /**
     * @return (Updatable) Compartment Identifier
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }
    /**
     * @return (Updatable) ResponderRecipe Description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return (Updatable) Details of UpdateResponderRuleDetails.
     * 
     */
    public List<ResponderRecipeEffectiveResponderRuleDetail> details() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * @return (Updatable) ResponderRecipe Display Name
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public Optional<String> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }
    /**
     * @return List of Policy
     * 
     */
    public List<String> policies() {
        return this.policies == null ? List.of() : this.policies;
    }
    /**
     * @return (Updatable) ResponderRecipeRule Identifier
     * 
     */
    public Optional<String> responderRuleId() {
        return Optional.ofNullable(this.responderRuleId);
    }
    /**
     * @return The current state of the Example.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return Supported Execution Modes
     * 
     */
    public List<String> supportedModes() {
        return this.supportedModes == null ? List.of() : this.supportedModes;
    }
    /**
     * @return The date and time the responder recipe was created. Format defined by RFC3339.
     * 
     */
    public Optional<String> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }
    /**
     * @return The date and time the responder recipe was updated. Format defined by RFC3339.
     * 
     */
    public Optional<String> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }
    /**
     * @return Type of Responder
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponderRecipeEffectiveResponderRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compartmentId;
        private @Nullable String description;
        private @Nullable List<ResponderRecipeEffectiveResponderRuleDetail> details;
        private @Nullable String displayName;
        private @Nullable String lifecycleDetails;
        private @Nullable List<String> policies;
        private @Nullable String responderRuleId;
        private @Nullable String state;
        private @Nullable List<String> supportedModes;
        private @Nullable String timeCreated;
        private @Nullable String timeUpdated;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponderRecipeEffectiveResponderRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.description = defaults.description;
    	      this.details = defaults.details;
    	      this.displayName = defaults.displayName;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.policies = defaults.policies;
    	      this.responderRuleId = defaults.responderRuleId;
    	      this.state = defaults.state;
    	      this.supportedModes = defaults.supportedModes;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.type = defaults.type;
        }

        public Builder compartmentId(@Nullable String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder details(@Nullable List<ResponderRecipeEffectiveResponderRuleDetail> details) {
            this.details = details;
            return this;
        }
        public Builder details(ResponderRecipeEffectiveResponderRuleDetail... details) {
            return details(List.of(details));
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder lifecycleDetails(@Nullable String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            return this;
        }
        public Builder policies(@Nullable List<String> policies) {
            this.policies = policies;
            return this;
        }
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }
        public Builder responderRuleId(@Nullable String responderRuleId) {
            this.responderRuleId = responderRuleId;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder supportedModes(@Nullable List<String> supportedModes) {
            this.supportedModes = supportedModes;
            return this;
        }
        public Builder supportedModes(String... supportedModes) {
            return supportedModes(List.of(supportedModes));
        }
        public Builder timeCreated(@Nullable String timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }
        public Builder timeUpdated(@Nullable String timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ResponderRecipeEffectiveResponderRule build() {
            return new ResponderRecipeEffectiveResponderRule(compartmentId, description, details, displayName, lifecycleDetails, policies, responderRuleId, state, supportedModes, timeCreated, timeUpdated, type);
        }
    }
}
