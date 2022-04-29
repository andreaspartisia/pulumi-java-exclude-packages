// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResponderRecipesResponderRecipeCollectionItemResponderRuleDetailConfiguration {
    /**
     * @return Unique name of the configuration
     * 
     */
    private final String configKey;
    /**
     * @return configuration name
     * 
     */
    private final String name;
    /**
     * @return configuration value
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetResponderRecipesResponderRecipeCollectionItemResponderRuleDetailConfiguration(
        @CustomType.Parameter("configKey") String configKey,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.configKey = configKey;
        this.name = name;
        this.value = value;
    }

    /**
     * @return Unique name of the configuration
     * 
     */
    public String configKey() {
        return this.configKey;
    }
    /**
     * @return configuration name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return configuration value
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponderRecipesResponderRecipeCollectionItemResponderRuleDetailConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configKey;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponderRecipesResponderRecipeCollectionItemResponderRuleDetailConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configKey = defaults.configKey;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder configKey(String configKey) {
            this.configKey = Objects.requireNonNull(configKey);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetResponderRecipesResponderRecipeCollectionItemResponderRuleDetailConfiguration build() {
            return new GetResponderRecipesResponderRecipeCollectionItemResponderRuleDetailConfiguration(configKey, name, value);
        }
    }
}
