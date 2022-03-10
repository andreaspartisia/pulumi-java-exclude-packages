// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotScheduleState extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotScheduleState Empty = new SnapshotScheduleState();

    /**
     * Amazon Resource Name (ARN) of the Redshift Snapshot Schedule.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
     * 
     */
    @InputImport(name="definitions")
      private final @Nullable Input<List<String>> definitions;

    public Input<List<String>> getDefinitions() {
        return this.definitions == null ? Input.empty() : this.definitions;
    }

    /**
     * The description of the snapshot schedule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
     * 
     */
    @InputImport(name="forceDestroy")
      private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @InputImport(name="identifier")
      private final @Nullable Input<String> identifier;

    public Input<String> getIdentifier() {
        return this.identifier == null ? Input.empty() : this.identifier;
    }

    /**
     * Creates a unique
     * identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @InputImport(name="identifierPrefix")
      private final @Nullable Input<String> identifierPrefix;

    public Input<String> getIdentifierPrefix() {
        return this.identifierPrefix == null ? Input.empty() : this.identifierPrefix;
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

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public SnapshotScheduleState(
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> definitions,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> forceDestroy,
        @Nullable Input<String> identifier,
        @Nullable Input<String> identifierPrefix,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.definitions = definitions;
        this.description = description;
        this.forceDestroy = forceDestroy;
        this.identifier = identifier;
        this.identifierPrefix = identifierPrefix;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private SnapshotScheduleState() {
        this.arn = Input.empty();
        this.definitions = Input.empty();
        this.description = Input.empty();
        this.forceDestroy = Input.empty();
        this.identifier = Input.empty();
        this.identifierPrefix = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotScheduleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> definitions;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> forceDestroy;
        private @Nullable Input<String> identifier;
        private @Nullable Input<String> identifierPrefix;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotScheduleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.definitions = defaults.definitions;
    	      this.description = defaults.description;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.identifier = defaults.identifier;
    	      this.identifierPrefix = defaults.identifierPrefix;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDefinitions(@Nullable Input<List<String>> definitions) {
            this.definitions = definitions;
            return this;
        }

        public Builder setDefinitions(@Nullable List<String> definitions) {
            this.definitions = Input.ofNullable(definitions);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setForceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder setForceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
            return this;
        }

        public Builder setIdentifier(@Nullable Input<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setIdentifier(@Nullable String identifier) {
            this.identifier = Input.ofNullable(identifier);
            return this;
        }

        public Builder setIdentifierPrefix(@Nullable Input<String> identifierPrefix) {
            this.identifierPrefix = identifierPrefix;
            return this;
        }

        public Builder setIdentifierPrefix(@Nullable String identifierPrefix) {
            this.identifierPrefix = Input.ofNullable(identifierPrefix);
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
        public SnapshotScheduleState build() {
            return new SnapshotScheduleState(arn, definitions, description, forceDestroy, identifier, identifierPrefix, tags, tagsAll);
        }
    }
}