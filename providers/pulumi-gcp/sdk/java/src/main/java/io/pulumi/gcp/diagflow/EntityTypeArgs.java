// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.EntityTypeEntityArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntityTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntityTypeArgs Empty = new EntityTypeArgs();

    /**
     * The name of this entity type to be displayed on the console.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    @InputImport(name="enableFuzzyExtraction")
    private final @Nullable Input<Boolean> enableFuzzyExtraction;

    public Input<Boolean> getEnableFuzzyExtraction() {
        return this.enableFuzzyExtraction == null ? Input.empty() : this.enableFuzzyExtraction;
    }

    /**
     * The collection of entity entries associated with the entity type.
     * Structure is documented below.
     * 
     */
    @InputImport(name="entities")
    private final @Nullable Input<List<EntityTypeEntityArgs>> entities;

    public Input<List<EntityTypeEntityArgs>> getEntities() {
        return this.entities == null ? Input.empty() : this.entities;
    }

    /**
     * Indicates the kind of entity type.
     * * KIND_MAP: Map entity types allow mapping of a group of synonyms to a reference value.
     * * KIND_LIST: List entity types contain a set of entries that do not map to reference values. However, list entity
     *   types can contain references to other entity types (with or without aliases).
     * * KIND_REGEXP: Regexp entity types allow to specify regular expressions in entries values.
     *   Possible values are `KIND_MAP`, `KIND_LIST`, and `KIND_REGEXP`.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public EntityTypeArgs(
        Input<String> displayName,
        @Nullable Input<Boolean> enableFuzzyExtraction,
        @Nullable Input<List<EntityTypeEntityArgs>> entities,
        Input<String> kind,
        @Nullable Input<String> project) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableFuzzyExtraction = enableFuzzyExtraction;
        this.entities = entities;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.project = project;
    }

    private EntityTypeArgs() {
        this.displayName = Input.empty();
        this.enableFuzzyExtraction = Input.empty();
        this.entities = Input.empty();
        this.kind = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> displayName;
        private @Nullable Input<Boolean> enableFuzzyExtraction;
        private @Nullable Input<List<EntityTypeEntityArgs>> entities;
        private Input<String> kind;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enableFuzzyExtraction = defaults.enableFuzzyExtraction;
    	      this.entities = defaults.entities;
    	      this.kind = defaults.kind;
    	      this.project = defaults.project;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEnableFuzzyExtraction(@Nullable Input<Boolean> enableFuzzyExtraction) {
            this.enableFuzzyExtraction = enableFuzzyExtraction;
            return this;
        }

        public Builder setEnableFuzzyExtraction(@Nullable Boolean enableFuzzyExtraction) {
            this.enableFuzzyExtraction = Input.ofNullable(enableFuzzyExtraction);
            return this;
        }

        public Builder setEntities(@Nullable Input<List<EntityTypeEntityArgs>> entities) {
            this.entities = entities;
            return this;
        }

        public Builder setEntities(@Nullable List<EntityTypeEntityArgs> entities) {
            this.entities = Input.ofNullable(entities);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public EntityTypeArgs build() {
            return new EntityTypeArgs(displayName, enableFuzzyExtraction, entities, kind, project);
        }
    }
}