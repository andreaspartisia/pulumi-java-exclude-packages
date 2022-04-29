// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CloudGuard.outputs.GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConditionGroup;
import com.pulumi.oci.CloudGuard.outputs.GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConfiguration;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail {
    /**
     * @return Condition group corresponding to each compartment
     * 
     */
    private final List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConditionGroup> conditionGroups;
    /**
     * @return ResponderRule configurations
     * 
     */
    private final List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConfiguration> configurations;
    /**
     * @return configuration allowed or not
     * 
     */
    private final Boolean isConfigurationAllowed;
    /**
     * @return Identifies state for ResponderRule
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return user defined labels for a detector rule
     * 
     */
    private final List<String> labels;
    /**
     * @return The Risk Level
     * 
     */
    private final String riskLevel;

    @CustomType.Constructor
    private GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail(
        @CustomType.Parameter("conditionGroups") List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConditionGroup> conditionGroups,
        @CustomType.Parameter("configurations") List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConfiguration> configurations,
        @CustomType.Parameter("isConfigurationAllowed") Boolean isConfigurationAllowed,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("labels") List<String> labels,
        @CustomType.Parameter("riskLevel") String riskLevel) {
        this.conditionGroups = conditionGroups;
        this.configurations = configurations;
        this.isConfigurationAllowed = isConfigurationAllowed;
        this.isEnabled = isEnabled;
        this.labels = labels;
        this.riskLevel = riskLevel;
    }

    /**
     * @return Condition group corresponding to each compartment
     * 
     */
    public List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConditionGroup> conditionGroups() {
        return this.conditionGroups;
    }
    /**
     * @return ResponderRule configurations
     * 
     */
    public List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConfiguration> configurations() {
        return this.configurations;
    }
    /**
     * @return configuration allowed or not
     * 
     */
    public Boolean isConfigurationAllowed() {
        return this.isConfigurationAllowed;
    }
    /**
     * @return Identifies state for ResponderRule
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return user defined labels for a detector rule
     * 
     */
    public List<String> labels() {
        return this.labels;
    }
    /**
     * @return The Risk Level
     * 
     */
    public String riskLevel() {
        return this.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConditionGroup> conditionGroups;
        private List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConfiguration> configurations;
        private Boolean isConfigurationAllowed;
        private Boolean isEnabled;
        private List<String> labels;
        private String riskLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionGroups = defaults.conditionGroups;
    	      this.configurations = defaults.configurations;
    	      this.isConfigurationAllowed = defaults.isConfigurationAllowed;
    	      this.isEnabled = defaults.isEnabled;
    	      this.labels = defaults.labels;
    	      this.riskLevel = defaults.riskLevel;
        }

        public Builder conditionGroups(List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConditionGroup> conditionGroups) {
            this.conditionGroups = Objects.requireNonNull(conditionGroups);
            return this;
        }
        public Builder conditionGroups(GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConditionGroup... conditionGroups) {
            return conditionGroups(List.of(conditionGroups));
        }
        public Builder configurations(List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConfiguration> configurations) {
            this.configurations = Objects.requireNonNull(configurations);
            return this;
        }
        public Builder configurations(GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetailConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        public Builder isConfigurationAllowed(Boolean isConfigurationAllowed) {
            this.isConfigurationAllowed = Objects.requireNonNull(isConfigurationAllowed);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder labels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = Objects.requireNonNull(riskLevel);
            return this;
        }        public GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail build() {
            return new GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail(conditionGroups, configurations, isConfigurationAllowed, isEnabled, labels, riskLevel);
        }
    }
}
