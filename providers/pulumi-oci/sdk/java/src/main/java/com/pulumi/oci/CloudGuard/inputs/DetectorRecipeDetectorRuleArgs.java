// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.CloudGuard.inputs.DetectorRecipeDetectorRuleCandidateResponderRuleArgs;
import com.pulumi.oci.CloudGuard.inputs.DetectorRecipeDetectorRuleDetailsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorRecipeDetectorRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorRecipeDetectorRuleArgs Empty = new DetectorRecipeDetectorRuleArgs();

    /**
     * List of CandidateResponderRule related to this rule
     * 
     */
    @Import(name="candidateResponderRules")
    private @Nullable Output<List<DetectorRecipeDetectorRuleCandidateResponderRuleArgs>> candidateResponderRules;

    /**
     * @return List of CandidateResponderRule related to this rule
     * 
     */
    public Optional<Output<List<DetectorRecipeDetectorRuleCandidateResponderRuleArgs>>> candidateResponderRules() {
        return Optional.ofNullable(this.candidateResponderRules);
    }

    /**
     * (Updatable) DetectorRecipe Description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) DetectorRecipe Description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) Details of a Detector Rule to be overriden in Detector Recipe
     * 
     */
    @Import(name="details", required=true)
    private Output<DetectorRecipeDetectorRuleDetailsArgs> details;

    /**
     * @return (Updatable) Details of a Detector Rule to be overriden in Detector Recipe
     * 
     */
    public Output<DetectorRecipeDetectorRuleDetailsArgs> details() {
        return this.details;
    }

    /**
     * detector for the rule
     * 
     */
    @Import(name="detector")
    private @Nullable Output<String> detector;

    /**
     * @return detector for the rule
     * 
     */
    public Optional<Output<String>> detector() {
        return Optional.ofNullable(this.detector);
    }

    /**
     * (Updatable) DetectorRecipeRule Identifier
     * 
     */
    @Import(name="detectorRuleId", required=true)
    private Output<String> detectorRuleId;

    /**
     * @return (Updatable) DetectorRecipeRule Identifier
     * 
     */
    public Output<String> detectorRuleId() {
        return this.detectorRuleId;
    }

    /**
     * (Updatable) DetectorRecipe Display Name
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) DetectorRecipe Display Name
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
     * List of cloudguard managed list types related to this rule
     * 
     */
    @Import(name="managedListTypes")
    private @Nullable Output<List<String>> managedListTypes;

    /**
     * @return List of cloudguard managed list types related to this rule
     * 
     */
    public Optional<Output<List<String>>> managedListTypes() {
        return Optional.ofNullable(this.managedListTypes);
    }

    /**
     * Recommendation for DetectorRecipeDetectorRule
     * 
     */
    @Import(name="recommendation")
    private @Nullable Output<String> recommendation;

    /**
     * @return Recommendation for DetectorRecipeDetectorRule
     * 
     */
    public Optional<Output<String>> recommendation() {
        return Optional.ofNullable(this.recommendation);
    }

    /**
     * resource type of the configuration to which the rule is applied
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return resource type of the configuration to which the rule is applied
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * service type of the configuration to which the rule is applied
     * 
     */
    @Import(name="serviceType")
    private @Nullable Output<String> serviceType;

    /**
     * @return service type of the configuration to which the rule is applied
     * 
     */
    public Optional<Output<String>> serviceType() {
        return Optional.ofNullable(this.serviceType);
    }

    /**
     * The current state of the resource.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the resource.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The date and time the detector recipe was created. Format defined by RFC3339.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the detector recipe was created. Format defined by RFC3339.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * The date and time the detector recipe was updated. Format defined by RFC3339.
     * 
     */
    @Import(name="timeUpdated")
    private @Nullable Output<String> timeUpdated;

    /**
     * @return The date and time the detector recipe was updated. Format defined by RFC3339.
     * 
     */
    public Optional<Output<String>> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    private DetectorRecipeDetectorRuleArgs() {}

    private DetectorRecipeDetectorRuleArgs(DetectorRecipeDetectorRuleArgs $) {
        this.candidateResponderRules = $.candidateResponderRules;
        this.description = $.description;
        this.details = $.details;
        this.detector = $.detector;
        this.detectorRuleId = $.detectorRuleId;
        this.displayName = $.displayName;
        this.lifecycleDetails = $.lifecycleDetails;
        this.managedListTypes = $.managedListTypes;
        this.recommendation = $.recommendation;
        this.resourceType = $.resourceType;
        this.serviceType = $.serviceType;
        this.state = $.state;
        this.timeCreated = $.timeCreated;
        this.timeUpdated = $.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorRecipeDetectorRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorRecipeDetectorRuleArgs $;

        public Builder() {
            $ = new DetectorRecipeDetectorRuleArgs();
        }

        public Builder(DetectorRecipeDetectorRuleArgs defaults) {
            $ = new DetectorRecipeDetectorRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param candidateResponderRules List of CandidateResponderRule related to this rule
         * 
         * @return builder
         * 
         */
        public Builder candidateResponderRules(@Nullable Output<List<DetectorRecipeDetectorRuleCandidateResponderRuleArgs>> candidateResponderRules) {
            $.candidateResponderRules = candidateResponderRules;
            return this;
        }

        /**
         * @param candidateResponderRules List of CandidateResponderRule related to this rule
         * 
         * @return builder
         * 
         */
        public Builder candidateResponderRules(List<DetectorRecipeDetectorRuleCandidateResponderRuleArgs> candidateResponderRules) {
            return candidateResponderRules(Output.of(candidateResponderRules));
        }

        /**
         * @param candidateResponderRules List of CandidateResponderRule related to this rule
         * 
         * @return builder
         * 
         */
        public Builder candidateResponderRules(DetectorRecipeDetectorRuleCandidateResponderRuleArgs... candidateResponderRules) {
            return candidateResponderRules(List.of(candidateResponderRules));
        }

        /**
         * @param description (Updatable) DetectorRecipe Description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) DetectorRecipe Description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param details (Updatable) Details of a Detector Rule to be overriden in Detector Recipe
         * 
         * @return builder
         * 
         */
        public Builder details(Output<DetectorRecipeDetectorRuleDetailsArgs> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details (Updatable) Details of a Detector Rule to be overriden in Detector Recipe
         * 
         * @return builder
         * 
         */
        public Builder details(DetectorRecipeDetectorRuleDetailsArgs details) {
            return details(Output.of(details));
        }

        /**
         * @param detector detector for the rule
         * 
         * @return builder
         * 
         */
        public Builder detector(@Nullable Output<String> detector) {
            $.detector = detector;
            return this;
        }

        /**
         * @param detector detector for the rule
         * 
         * @return builder
         * 
         */
        public Builder detector(String detector) {
            return detector(Output.of(detector));
        }

        /**
         * @param detectorRuleId (Updatable) DetectorRecipeRule Identifier
         * 
         * @return builder
         * 
         */
        public Builder detectorRuleId(Output<String> detectorRuleId) {
            $.detectorRuleId = detectorRuleId;
            return this;
        }

        /**
         * @param detectorRuleId (Updatable) DetectorRecipeRule Identifier
         * 
         * @return builder
         * 
         */
        public Builder detectorRuleId(String detectorRuleId) {
            return detectorRuleId(Output.of(detectorRuleId));
        }

        /**
         * @param displayName (Updatable) DetectorRecipe Display Name
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) DetectorRecipe Display Name
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
         * @param managedListTypes List of cloudguard managed list types related to this rule
         * 
         * @return builder
         * 
         */
        public Builder managedListTypes(@Nullable Output<List<String>> managedListTypes) {
            $.managedListTypes = managedListTypes;
            return this;
        }

        /**
         * @param managedListTypes List of cloudguard managed list types related to this rule
         * 
         * @return builder
         * 
         */
        public Builder managedListTypes(List<String> managedListTypes) {
            return managedListTypes(Output.of(managedListTypes));
        }

        /**
         * @param managedListTypes List of cloudguard managed list types related to this rule
         * 
         * @return builder
         * 
         */
        public Builder managedListTypes(String... managedListTypes) {
            return managedListTypes(List.of(managedListTypes));
        }

        /**
         * @param recommendation Recommendation for DetectorRecipeDetectorRule
         * 
         * @return builder
         * 
         */
        public Builder recommendation(@Nullable Output<String> recommendation) {
            $.recommendation = recommendation;
            return this;
        }

        /**
         * @param recommendation Recommendation for DetectorRecipeDetectorRule
         * 
         * @return builder
         * 
         */
        public Builder recommendation(String recommendation) {
            return recommendation(Output.of(recommendation));
        }

        /**
         * @param resourceType resource type of the configuration to which the rule is applied
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType resource type of the configuration to which the rule is applied
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param serviceType service type of the configuration to which the rule is applied
         * 
         * @return builder
         * 
         */
        public Builder serviceType(@Nullable Output<String> serviceType) {
            $.serviceType = serviceType;
            return this;
        }

        /**
         * @param serviceType service type of the configuration to which the rule is applied
         * 
         * @return builder
         * 
         */
        public Builder serviceType(String serviceType) {
            return serviceType(Output.of(serviceType));
        }

        /**
         * @param state The current state of the resource.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the resource.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeCreated The date and time the detector recipe was created. Format defined by RFC3339.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the detector recipe was created. Format defined by RFC3339.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeUpdated The date and time the detector recipe was updated. Format defined by RFC3339.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(@Nullable Output<String> timeUpdated) {
            $.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * @param timeUpdated The date and time the detector recipe was updated. Format defined by RFC3339.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(String timeUpdated) {
            return timeUpdated(Output.of(timeUpdated));
        }

        public DetectorRecipeDetectorRuleArgs build() {
            $.details = Objects.requireNonNull($.details, "expected parameter 'details' to be non-null");
            $.detectorRuleId = Objects.requireNonNull($.detectorRuleId, "expected parameter 'detectorRuleId' to be non-null");
            return $;
        }
    }

}
