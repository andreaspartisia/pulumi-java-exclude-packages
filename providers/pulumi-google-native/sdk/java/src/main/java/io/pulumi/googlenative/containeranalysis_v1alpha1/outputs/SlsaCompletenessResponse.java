// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class SlsaCompletenessResponse {
    /**
     * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
     * 
     */
    private final Boolean arguments;
    /**
     * If true, the builder claims that recipe.environment is claimed to be complete.
     * 
     */
    private final Boolean environment;
    /**
     * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called "hermetic".
     * 
     */
    private final Boolean materials;

    @CustomType.Constructor
    private SlsaCompletenessResponse(
        @CustomType.Parameter("arguments") Boolean arguments,
        @CustomType.Parameter("environment") Boolean environment,
        @CustomType.Parameter("materials") Boolean materials) {
        this.arguments = arguments;
        this.environment = environment;
        this.materials = materials;
    }

    /**
     * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
     * 
    */
    public Boolean arguments() {
        return this.arguments;
    }
    /**
     * If true, the builder claims that recipe.environment is claimed to be complete.
     * 
    */
    public Boolean environment() {
        return this.environment;
    }
    /**
     * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called "hermetic".
     * 
    */
    public Boolean materials() {
        return this.materials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaCompletenessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean arguments;
        private Boolean environment;
        private Boolean materials;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaCompletenessResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
        }

        public Builder arguments(Boolean arguments) {
            this.arguments = Objects.requireNonNull(arguments);
            return this;
        }
        public Builder environment(Boolean environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        public Builder materials(Boolean materials) {
            this.materials = Objects.requireNonNull(materials);
            return this;
        }        public SlsaCompletenessResponse build() {
            return new SlsaCompletenessResponse(arguments, environment, materials);
        }
    }
}
