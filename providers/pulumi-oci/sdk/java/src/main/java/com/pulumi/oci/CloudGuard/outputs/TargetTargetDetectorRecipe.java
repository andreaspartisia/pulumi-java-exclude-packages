// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CloudGuard.outputs.TargetTargetDetectorRecipeDetectorRule;
import com.pulumi.oci.CloudGuard.outputs.TargetTargetDetectorRecipeEffectiveDetectorRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetTargetDetectorRecipe {
    /**
     * @return (Updatable) compartment associated with condition
     * 
     */
    private final @Nullable String compartmentId;
    /**
     * @return The target description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return detector for the rule
     * 
     */
    private final @Nullable String detector;
    /**
     * @return Identifier for DetectorRecipe.
     * 
     */
    private final String detectorRecipeId;
    /**
     * @return (Updatable) Overrides to be applied to Detector Rule associated with the target
     * 
     */
    private final @Nullable List<TargetTargetDetectorRecipeDetectorRule> detectorRules;
    /**
     * @return (Updatable) DetectorTemplate Identifier
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return List of effective detector rules for the detector type for recipe after applying defaults
     * 
     */
    private final @Nullable List<TargetTargetDetectorRecipeEffectiveDetectorRule> effectiveDetectorRules;
    /**
     * @return Unique identifier of TargetResponderRecipe that is immutable on creation
     * 
     */
    private final @Nullable String id;
    /**
     * @return Owner of ResponderRecipe
     * 
     */
    private final @Nullable String owner;
    /**
     * @return (Updatable) The current state of the DetectorRule.
     * 
     */
    private final @Nullable String state;
    /**
     * @return The date and time the target was created. Format defined by RFC3339.
     * 
     */
    private final @Nullable String timeCreated;
    /**
     * @return The date and time the target was updated. Format defined by RFC3339.
     * 
     */
    private final @Nullable String timeUpdated;

    @CustomType.Constructor
    private TargetTargetDetectorRecipe(
        @CustomType.Parameter("compartmentId") @Nullable String compartmentId,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("detector") @Nullable String detector,
        @CustomType.Parameter("detectorRecipeId") String detectorRecipeId,
        @CustomType.Parameter("detectorRules") @Nullable List<TargetTargetDetectorRecipeDetectorRule> detectorRules,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("effectiveDetectorRules") @Nullable List<TargetTargetDetectorRecipeEffectiveDetectorRule> effectiveDetectorRules,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("owner") @Nullable String owner,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("timeCreated") @Nullable String timeCreated,
        @CustomType.Parameter("timeUpdated") @Nullable String timeUpdated) {
        this.compartmentId = compartmentId;
        this.description = description;
        this.detector = detector;
        this.detectorRecipeId = detectorRecipeId;
        this.detectorRules = detectorRules;
        this.displayName = displayName;
        this.effectiveDetectorRules = effectiveDetectorRules;
        this.id = id;
        this.owner = owner;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return (Updatable) compartment associated with condition
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }
    /**
     * @return The target description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return detector for the rule
     * 
     */
    public Optional<String> detector() {
        return Optional.ofNullable(this.detector);
    }
    /**
     * @return Identifier for DetectorRecipe.
     * 
     */
    public String detectorRecipeId() {
        return this.detectorRecipeId;
    }
    /**
     * @return (Updatable) Overrides to be applied to Detector Rule associated with the target
     * 
     */
    public List<TargetTargetDetectorRecipeDetectorRule> detectorRules() {
        return this.detectorRules == null ? List.of() : this.detectorRules;
    }
    /**
     * @return (Updatable) DetectorTemplate Identifier
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return List of effective detector rules for the detector type for recipe after applying defaults
     * 
     */
    public List<TargetTargetDetectorRecipeEffectiveDetectorRule> effectiveDetectorRules() {
        return this.effectiveDetectorRules == null ? List.of() : this.effectiveDetectorRules;
    }
    /**
     * @return Unique identifier of TargetResponderRecipe that is immutable on creation
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Owner of ResponderRecipe
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * @return (Updatable) The current state of the DetectorRule.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The date and time the target was created. Format defined by RFC3339.
     * 
     */
    public Optional<String> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }
    /**
     * @return The date and time the target was updated. Format defined by RFC3339.
     * 
     */
    public Optional<String> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetTargetDetectorRecipe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compartmentId;
        private @Nullable String description;
        private @Nullable String detector;
        private String detectorRecipeId;
        private @Nullable List<TargetTargetDetectorRecipeDetectorRule> detectorRules;
        private @Nullable String displayName;
        private @Nullable List<TargetTargetDetectorRecipeEffectiveDetectorRule> effectiveDetectorRules;
        private @Nullable String id;
        private @Nullable String owner;
        private @Nullable String state;
        private @Nullable String timeCreated;
        private @Nullable String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetTargetDetectorRecipe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.description = defaults.description;
    	      this.detector = defaults.detector;
    	      this.detectorRecipeId = defaults.detectorRecipeId;
    	      this.detectorRules = defaults.detectorRules;
    	      this.displayName = defaults.displayName;
    	      this.effectiveDetectorRules = defaults.effectiveDetectorRules;
    	      this.id = defaults.id;
    	      this.owner = defaults.owner;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder compartmentId(@Nullable String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder detector(@Nullable String detector) {
            this.detector = detector;
            return this;
        }
        public Builder detectorRecipeId(String detectorRecipeId) {
            this.detectorRecipeId = Objects.requireNonNull(detectorRecipeId);
            return this;
        }
        public Builder detectorRules(@Nullable List<TargetTargetDetectorRecipeDetectorRule> detectorRules) {
            this.detectorRules = detectorRules;
            return this;
        }
        public Builder detectorRules(TargetTargetDetectorRecipeDetectorRule... detectorRules) {
            return detectorRules(List.of(detectorRules));
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder effectiveDetectorRules(@Nullable List<TargetTargetDetectorRecipeEffectiveDetectorRule> effectiveDetectorRules) {
            this.effectiveDetectorRules = effectiveDetectorRules;
            return this;
        }
        public Builder effectiveDetectorRules(TargetTargetDetectorRecipeEffectiveDetectorRule... effectiveDetectorRules) {
            return effectiveDetectorRules(List.of(effectiveDetectorRules));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder timeCreated(@Nullable String timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }
        public Builder timeUpdated(@Nullable String timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
        }        public TargetTargetDetectorRecipe build() {
            return new TargetTargetDetectorRecipe(compartmentId, description, detector, detectorRecipeId, detectorRules, displayName, effectiveDetectorRules, id, owner, state, timeCreated, timeUpdated);
        }
    }
}
