// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch;

import io.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchedulingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingPolicyArgs Empty = new SchedulingPolicyArgs();

    @InputImport(name="fairSharePolicy")
      private final @Nullable Input<SchedulingPolicyFairSharePolicyArgs> fairSharePolicy;

    public Input<SchedulingPolicyFairSharePolicyArgs> getFairSharePolicy() {
        return this.fairSharePolicy == null ? Input.empty() : this.fairSharePolicy;
    }

    /**
     * Specifies the name of the scheduling policy.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public SchedulingPolicyArgs(
        @Nullable Input<SchedulingPolicyFairSharePolicyArgs> fairSharePolicy,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.fairSharePolicy = fairSharePolicy;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private SchedulingPolicyArgs() {
        this.fairSharePolicy = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SchedulingPolicyFairSharePolicyArgs> fairSharePolicy;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fairSharePolicy = defaults.fairSharePolicy;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setFairSharePolicy(@Nullable Input<SchedulingPolicyFairSharePolicyArgs> fairSharePolicy) {
            this.fairSharePolicy = fairSharePolicy;
            return this;
        }

        public Builder setFairSharePolicy(@Nullable SchedulingPolicyFairSharePolicyArgs fairSharePolicy) {
            this.fairSharePolicy = Input.ofNullable(fairSharePolicy);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public SchedulingPolicyArgs build() {
            return new SchedulingPolicyArgs(fairSharePolicy, name, tags, tagsAll);
        }
    }
}