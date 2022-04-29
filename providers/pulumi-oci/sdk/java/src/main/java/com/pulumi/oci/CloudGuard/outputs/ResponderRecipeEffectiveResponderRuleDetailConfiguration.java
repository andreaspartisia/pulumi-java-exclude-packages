// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponderRecipeEffectiveResponderRuleDetailConfiguration {
    /**
     * @return Unique name of the configuration
     * 
     */
    private final @Nullable String configKey;
    /**
     * @return configuration name
     * 
     */
    private final @Nullable String name;
    /**
     * @return configuration value
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private ResponderRecipeEffectiveResponderRuleDetailConfiguration(
        @CustomType.Parameter("configKey") @Nullable String configKey,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("value") @Nullable String value) {
        this.configKey = configKey;
        this.name = name;
        this.value = value;
    }

    /**
     * @return Unique name of the configuration
     * 
     */
    public Optional<String> configKey() {
        return Optional.ofNullable(this.configKey);
    }
    /**
     * @return configuration name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return configuration value
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponderRecipeEffectiveResponderRuleDetailConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configKey;
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponderRecipeEffectiveResponderRuleDetailConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configKey = defaults.configKey;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder configKey(@Nullable String configKey) {
            this.configKey = configKey;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ResponderRecipeEffectiveResponderRuleDetailConfiguration build() {
            return new ResponderRecipeEffectiveResponderRuleDetailConfiguration(configKey, name, value);
        }
    }
}
