// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.CloudGuard.inputs.TargetTargetResponderRecipeEffectiveResponderRuleDetailConfigurationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs Empty = new TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs();

    /**
     * (Updatable)
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return (Updatable)
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Updatable) Configurations associated with the ResponderRule
     * 
     */
    @Import(name="configurations")
    private @Nullable Output<List<TargetTargetResponderRecipeEffectiveResponderRuleDetailConfigurationArgs>> configurations;

    /**
     * @return (Updatable) Configurations associated with the ResponderRule
     * 
     */
    public Optional<Output<List<TargetTargetResponderRecipeEffectiveResponderRuleDetailConfigurationArgs>>> configurations() {
        return Optional.ofNullable(this.configurations);
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
     * (Updatable) Execution Mode for ResponderRule
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return (Updatable) Execution Mode for ResponderRule
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    private TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs() {}

    private TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs(TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs $) {
        this.condition = $.condition;
        this.configurations = $.configurations;
        this.isEnabled = $.isEnabled;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs $;

        public Builder() {
            $ = new TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs();
        }

        public Builder(TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs defaults) {
            $ = new TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition (Updatable)
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition (Updatable)
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param configurations (Updatable) Configurations associated with the ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder configurations(@Nullable Output<List<TargetTargetResponderRecipeEffectiveResponderRuleDetailConfigurationArgs>> configurations) {
            $.configurations = configurations;
            return this;
        }

        /**
         * @param configurations (Updatable) Configurations associated with the ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder configurations(List<TargetTargetResponderRecipeEffectiveResponderRuleDetailConfigurationArgs> configurations) {
            return configurations(Output.of(configurations));
        }

        /**
         * @param configurations (Updatable) Configurations associated with the ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder configurations(TargetTargetResponderRecipeEffectiveResponderRuleDetailConfigurationArgs... configurations) {
            return configurations(List.of(configurations));
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
         * @param mode (Updatable) Execution Mode for ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode (Updatable) Execution Mode for ResponderRule
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public TargetTargetResponderRecipeEffectiveResponderRuleDetailArgs build() {
            return $;
        }
    }

}
