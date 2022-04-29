// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.CloudGuard.inputs.TargetTargetDetectorRecipeDetectorRuleDetailsConditionGroupArgs;
import com.pulumi.oci.CloudGuard.inputs.TargetTargetDetectorRecipeDetectorRuleDetailsConfigurationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetTargetDetectorRecipeDetectorRuleDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetTargetDetectorRecipeDetectorRuleDetailsArgs Empty = new TargetTargetDetectorRecipeDetectorRuleDetailsArgs();

    /**
     * (Updatable) Condition group corresponding to each compartment
     * 
     */
    @Import(name="conditionGroups")
    private @Nullable Output<List<TargetTargetDetectorRecipeDetectorRuleDetailsConditionGroupArgs>> conditionGroups;

    /**
     * @return (Updatable) Condition group corresponding to each compartment
     * 
     */
    public Optional<Output<List<TargetTargetDetectorRecipeDetectorRuleDetailsConditionGroupArgs>>> conditionGroups() {
        return Optional.ofNullable(this.conditionGroups);
    }

    /**
     * (Updatable) Configurations associated with the ResponderRule
     * 
     */
    @Import(name="configurations")
    private @Nullable Output<List<TargetTargetDetectorRecipeDetectorRuleDetailsConfigurationArgs>> configurations;

    /**
     * @return (Updatable) Configurations associated with the ResponderRule
     * 
     */
    public Optional<Output<List<TargetTargetDetectorRecipeDetectorRuleDetailsConfigurationArgs>>> configurations() {
        return Optional.ofNullable(this.configurations);
    }

    /**
     * configuration allowed or not
     * 
     */
    @Import(name="isConfigurationAllowed")
    private @Nullable Output<Boolean> isConfigurationAllowed;

    /**
     * @return configuration allowed or not
     * 
     */
    public Optional<Output<Boolean>> isConfigurationAllowed() {
        return Optional.ofNullable(this.isConfigurationAllowed);
    }

    /**
     * Identifies state for ResponderRule
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Identifies state for ResponderRule
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * user defined labels for a detector rule
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return user defined labels for a detector rule
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The Risk Level
     * 
     */
    @Import(name="riskLevel")
    private @Nullable Output<String> riskLevel;

    /**
     * @return The Risk Level
     * 
     */
    public Optional<Output<String>> riskLevel() {
        return Optional.ofNullable(this.riskLevel);
    }

    private TargetTargetDetectorRecipeDetectorRuleDetailsArgs() {}

    private TargetTargetDetectorRecipeDetectorRuleDetailsArgs(TargetTargetDetectorRecipeDetectorRuleDetailsArgs $) {
        this.conditionGroups = $.conditionGroups;
        this.configurations = $.configurations;
        this.isConfigurationAllowed = $.isConfigurationAllowed;
        this.isEnabled = $.isEnabled;
        this.labels = $.labels;
        this.riskLevel = $.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetTargetDetectorRecipeDetectorRuleDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetTargetDetectorRecipeDetectorRuleDetailsArgs $;

        public Builder() {
            $ = new TargetTargetDetectorRecipeDetectorRuleDetailsArgs();
        }

        public Builder(TargetTargetDetectorRecipeDetectorRuleDetailsArgs defaults) {
            $ = new TargetTargetDetectorRecipeDetectorRuleDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditionGroups (Updatable) Condition group corresponding to each compartment
         * 
         * @return builder
         * 
         */
        public Builder conditionGroups(@Nullable Output<List<TargetTargetDetectorRecipeDetectorRuleDetailsConditionGroupArgs>> conditionGroups) {
            $.conditionGroups = conditionGroups;
            return this;
        }

        /**
         * @param conditionGroups (Updatable) Condition group corresponding to each compartment
         * 
         * @return builder
         * 
         */
        public Builder conditionGroups(List<TargetTargetDetectorRecipeDetectorRuleDetailsConditionGroupArgs> conditionGroups) {
            return conditionGroups(Output.of(conditionGroups));
        }

        /**
         * @param conditionGroups (Updatable) Condition group corresponding to each compartment
         * 
         * @return builder
         * 
         */
        public Builder conditionGroups(TargetTargetDetectorRecipeDetectorRuleDetailsConditionGroupArgs... conditionGroups) {
            return conditionGroups(List.of(conditionGroups));
        }

        /**
         * @param configurations (Updatable) Configurations associated with the ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder configurations(@Nullable Output<List<TargetTargetDetectorRecipeDetectorRuleDetailsConfigurationArgs>> configurations) {
            $.configurations = configurations;
            return this;
        }

        /**
         * @param configurations (Updatable) Configurations associated with the ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder configurations(List<TargetTargetDetectorRecipeDetectorRuleDetailsConfigurationArgs> configurations) {
            return configurations(Output.of(configurations));
        }

        /**
         * @param configurations (Updatable) Configurations associated with the ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder configurations(TargetTargetDetectorRecipeDetectorRuleDetailsConfigurationArgs... configurations) {
            return configurations(List.of(configurations));
        }

        /**
         * @param isConfigurationAllowed configuration allowed or not
         * 
         * @return builder
         * 
         */
        public Builder isConfigurationAllowed(@Nullable Output<Boolean> isConfigurationAllowed) {
            $.isConfigurationAllowed = isConfigurationAllowed;
            return this;
        }

        /**
         * @param isConfigurationAllowed configuration allowed or not
         * 
         * @return builder
         * 
         */
        public Builder isConfigurationAllowed(Boolean isConfigurationAllowed) {
            return isConfigurationAllowed(Output.of(isConfigurationAllowed));
        }

        /**
         * @param isEnabled Identifies state for ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Identifies state for ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param labels user defined labels for a detector rule
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels user defined labels for a detector rule
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels user defined labels for a detector rule
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param riskLevel The Risk Level
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(@Nullable Output<String> riskLevel) {
            $.riskLevel = riskLevel;
            return this;
        }

        /**
         * @param riskLevel The Risk Level
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(String riskLevel) {
            return riskLevel(Output.of(riskLevel));
        }

        public TargetTargetDetectorRecipeDetectorRuleDetailsArgs build() {
            return $;
        }
    }

}
