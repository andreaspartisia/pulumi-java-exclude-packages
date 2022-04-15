// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Steps taken to build the artifact. For a TaskRun, typically each container corresponds to one step in the recipe.
 * 
 */
public final class SlsaRecipeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SlsaRecipeArgs Empty = new SlsaRecipeArgs();

    /**
     * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were "make", then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint. Depending on the recipe Type, the structure may be different.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<Map<String,String>> arguments;

    public Output<Map<String,String>> arguments() {
        return this.arguments == null ? Codegen.empty() : this.arguments;
    }

    /**
     * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were "make", then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn't come from a material, as zero is default unset value for int64.
     * 
     */
    @Import(name="definedInMaterial")
      private final @Nullable Output<String> definedInMaterial;

    public Output<String> definedInMaterial() {
        return this.definedInMaterial == null ? Codegen.empty() : this.definedInMaterial;
    }

    /**
     * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were "make", then this would reference the directory in which to run make as well as which target to use.
     * 
     */
    @Import(name="entryPoint")
      private final @Nullable Output<String> entryPoint;

    public Output<String> entryPoint() {
        return this.entryPoint == null ? Codegen.empty() : this.entryPoint;
    }

    /**
     * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Depending on the recipe Type, the structure may be different.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<Map<String,String>> environment;

    public Output<Map<String,String>> environment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public SlsaRecipeArgs(
        @Nullable Output<Map<String,String>> arguments,
        @Nullable Output<String> definedInMaterial,
        @Nullable Output<String> entryPoint,
        @Nullable Output<Map<String,String>> environment,
        @Nullable Output<String> type) {
        this.arguments = arguments;
        this.definedInMaterial = definedInMaterial;
        this.entryPoint = entryPoint;
        this.environment = environment;
        this.type = type;
    }

    private SlsaRecipeArgs() {
        this.arguments = Codegen.empty();
        this.definedInMaterial = Codegen.empty();
        this.entryPoint = Codegen.empty();
        this.environment = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> arguments;
        private @Nullable Output<String> definedInMaterial;
        private @Nullable Output<String> entryPoint;
        private @Nullable Output<Map<String,String>> environment;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaRecipeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.definedInMaterial = defaults.definedInMaterial;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environment = defaults.environment;
    	      this.type = defaults.type;
        }

        public Builder arguments(@Nullable Output<Map<String,String>> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable Map<String,String> arguments) {
            this.arguments = Codegen.ofNullable(arguments);
            return this;
        }
        public Builder definedInMaterial(@Nullable Output<String> definedInMaterial) {
            this.definedInMaterial = definedInMaterial;
            return this;
        }
        public Builder definedInMaterial(@Nullable String definedInMaterial) {
            this.definedInMaterial = Codegen.ofNullable(definedInMaterial);
            return this;
        }
        public Builder entryPoint(@Nullable Output<String> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }
        public Builder entryPoint(@Nullable String entryPoint) {
            this.entryPoint = Codegen.ofNullable(entryPoint);
            return this;
        }
        public Builder environment(@Nullable Output<Map<String,String>> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable Map<String,String> environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public SlsaRecipeArgs build() {
            return new SlsaRecipeArgs(arguments, definedInMaterial, entryPoint, environment, type);
        }
    }
}
