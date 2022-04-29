// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CloudGuard.outputs.ResponderRecipeResponderRuleDetailsConfiguration;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponderRecipeResponderRuleDetails {
    private final @Nullable String condition;
    /**
     * @return ResponderRule configurations
     * 
     */
    private final @Nullable List<ResponderRecipeResponderRuleDetailsConfiguration> configurations;
    /**
     * @return (Updatable) Identifies state for ResponderRule
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return Execution Mode for ResponderRule
     * 
     */
    private final @Nullable String mode;

    @CustomType.Constructor
    private ResponderRecipeResponderRuleDetails(
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("configurations") @Nullable List<ResponderRecipeResponderRuleDetailsConfiguration> configurations,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("mode") @Nullable String mode) {
        this.condition = condition;
        this.configurations = configurations;
        this.isEnabled = isEnabled;
        this.mode = mode;
    }

    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return ResponderRule configurations
     * 
     */
    public List<ResponderRecipeResponderRuleDetailsConfiguration> configurations() {
        return this.configurations == null ? List.of() : this.configurations;
    }
    /**
     * @return (Updatable) Identifies state for ResponderRule
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return Execution Mode for ResponderRule
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponderRecipeResponderRuleDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private @Nullable List<ResponderRecipeResponderRuleDetailsConfiguration> configurations;
        private Boolean isEnabled;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponderRecipeResponderRuleDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.configurations = defaults.configurations;
    	      this.isEnabled = defaults.isEnabled;
    	      this.mode = defaults.mode;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        public Builder configurations(@Nullable List<ResponderRecipeResponderRuleDetailsConfiguration> configurations) {
            this.configurations = configurations;
            return this;
        }
        public Builder configurations(ResponderRecipeResponderRuleDetailsConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }        public ResponderRecipeResponderRuleDetails build() {
            return new ResponderRecipeResponderRuleDetails(condition, configurations, isEnabled, mode);
        }
    }
}
