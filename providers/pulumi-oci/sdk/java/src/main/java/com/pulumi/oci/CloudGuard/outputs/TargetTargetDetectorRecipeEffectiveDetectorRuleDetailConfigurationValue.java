// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetTargetDetectorRecipeEffectiveDetectorRuleDetailConfigurationValue {
    /**
     * @return configuration list item type, either CUSTOM or MANAGED
     * 
     */
    private final @Nullable String listType;
    /**
     * @return type of the managed list
     * 
     */
    private final @Nullable String managedListType;
    /**
     * @return (Updatable) configuration value
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private TargetTargetDetectorRecipeEffectiveDetectorRuleDetailConfigurationValue(
        @CustomType.Parameter("listType") @Nullable String listType,
        @CustomType.Parameter("managedListType") @Nullable String managedListType,
        @CustomType.Parameter("value") @Nullable String value) {
        this.listType = listType;
        this.managedListType = managedListType;
        this.value = value;
    }

    /**
     * @return configuration list item type, either CUSTOM or MANAGED
     * 
     */
    public Optional<String> listType() {
        return Optional.ofNullable(this.listType);
    }
    /**
     * @return type of the managed list
     * 
     */
    public Optional<String> managedListType() {
        return Optional.ofNullable(this.managedListType);
    }
    /**
     * @return (Updatable) configuration value
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetTargetDetectorRecipeEffectiveDetectorRuleDetailConfigurationValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String listType;
        private @Nullable String managedListType;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetTargetDetectorRecipeEffectiveDetectorRuleDetailConfigurationValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listType = defaults.listType;
    	      this.managedListType = defaults.managedListType;
    	      this.value = defaults.value;
        }

        public Builder listType(@Nullable String listType) {
            this.listType = listType;
            return this;
        }
        public Builder managedListType(@Nullable String managedListType) {
            this.managedListType = managedListType;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public TargetTargetDetectorRecipeEffectiveDetectorRuleDetailConfigurationValue build() {
            return new TargetTargetDetectorRecipeEffectiveDetectorRuleDetailConfigurationValue(listType, managedListType, value);
        }
    }
}
