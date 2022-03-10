// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelPackageGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelPackageGroupArgs Empty = new ModelPackageGroupArgs();

    /**
     * A description for the model group.
     * 
     */
    @InputImport(name="modelPackageGroupDescription")
      private final @Nullable Input<String> modelPackageGroupDescription;

    public Input<String> getModelPackageGroupDescription() {
        return this.modelPackageGroupDescription == null ? Input.empty() : this.modelPackageGroupDescription;
    }

    /**
     * The name of the model group.
     * 
     */
    @InputImport(name="modelPackageGroupName", required=true)
      private final Input<String> modelPackageGroupName;

    public Input<String> getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ModelPackageGroupArgs(
        @Nullable Input<String> modelPackageGroupDescription,
        Input<String> modelPackageGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.modelPackageGroupDescription = modelPackageGroupDescription;
        this.modelPackageGroupName = Objects.requireNonNull(modelPackageGroupName, "expected parameter 'modelPackageGroupName' to be non-null");
        this.tags = tags;
    }

    private ModelPackageGroupArgs() {
        this.modelPackageGroupDescription = Input.empty();
        this.modelPackageGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPackageGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> modelPackageGroupDescription;
        private Input<String> modelPackageGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelPackageGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelPackageGroupDescription = defaults.modelPackageGroupDescription;
    	      this.modelPackageGroupName = defaults.modelPackageGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setModelPackageGroupDescription(@Nullable Input<String> modelPackageGroupDescription) {
            this.modelPackageGroupDescription = modelPackageGroupDescription;
            return this;
        }

        public Builder setModelPackageGroupDescription(@Nullable String modelPackageGroupDescription) {
            this.modelPackageGroupDescription = Input.ofNullable(modelPackageGroupDescription);
            return this;
        }

        public Builder setModelPackageGroupName(Input<String> modelPackageGroupName) {
            this.modelPackageGroupName = Objects.requireNonNull(modelPackageGroupName);
            return this;
        }

        public Builder setModelPackageGroupName(String modelPackageGroupName) {
            this.modelPackageGroupName = Input.of(Objects.requireNonNull(modelPackageGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ModelPackageGroupArgs build() {
            return new ModelPackageGroupArgs(modelPackageGroupDescription, modelPackageGroupName, tags);
        }
    }
}