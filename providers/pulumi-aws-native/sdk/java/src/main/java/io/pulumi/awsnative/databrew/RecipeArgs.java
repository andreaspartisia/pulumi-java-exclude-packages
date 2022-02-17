// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.databrew.inputs.RecipeStepArgs;
import io.pulumi.awsnative.databrew.inputs.RecipeTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecipeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecipeArgs Empty = new RecipeArgs();

    /**
     * Description of the recipe
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Recipe name
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="steps", required=true)
    private final Input<List<RecipeStepArgs>> steps;

    public Input<List<RecipeStepArgs>> getSteps() {
        return this.steps;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<RecipeTagArgs>> tags;

    public Input<List<RecipeTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RecipeArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<List<RecipeStepArgs>> steps,
        @Nullable Input<List<RecipeTagArgs>> tags) {
        this.description = description;
        this.name = name;
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
        this.tags = tags;
    }

    private RecipeArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.steps = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<List<RecipeStepArgs>> steps;
        private @Nullable Input<List<RecipeTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.steps = defaults.steps;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSteps(Input<List<RecipeStepArgs>> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }

        public Builder setSteps(List<RecipeStepArgs> steps) {
            this.steps = Input.of(Objects.requireNonNull(steps));
            return this;
        }

        public Builder setTags(@Nullable Input<List<RecipeTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<RecipeTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public RecipeArgs build() {
            return new RecipeArgs(description, name, steps, tags);
        }
    }
}