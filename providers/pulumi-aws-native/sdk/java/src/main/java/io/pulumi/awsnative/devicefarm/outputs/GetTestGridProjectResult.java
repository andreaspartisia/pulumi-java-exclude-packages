// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.outputs;

import io.pulumi.awsnative.devicefarm.outputs.TestGridProjectTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTestGridProjectResult {
    private final @Nullable String arn;
    private final @Nullable String description;
    private final @Nullable String name;
    private final @Nullable List<TestGridProjectTag> tags;

    @OutputCustomType.Constructor({"arn","description","name","tags"})
    private GetTestGridProjectResult(
        @Nullable String arn,
        @Nullable String description,
        @Nullable String name,
        @Nullable List<TestGridProjectTag> tags) {
        this.arn = arn;
        this.description = description;
        this.name = name;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<TestGridProjectTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestGridProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable String name;
        private @Nullable List<TestGridProjectTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestGridProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable List<TestGridProjectTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetTestGridProjectResult build() {
            return new GetTestGridProjectResult(arn, description, name, tags);
        }
    }
}