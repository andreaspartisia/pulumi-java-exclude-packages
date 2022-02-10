// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.azurenative.operationalinsights.inputs.ColumnArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    @InputImport(name="columns")
    private final @Nullable Input<List<ColumnArgs>> columns;

    public Input<List<ColumnArgs>> getColumns() {
        return this.columns == null ? Input.empty() : this.columns;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public SchemaArgs(
        @Nullable Input<List<ColumnArgs>> columns,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name) {
        this.columns = columns;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
    }

    private SchemaArgs() {
        this.columns = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ColumnArgs>> columns;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder setColumns(@Nullable Input<List<ColumnArgs>> columns) {
            this.columns = columns;
            return this;
        }

        public Builder setColumns(@Nullable List<ColumnArgs> columns) {
            this.columns = Input.ofNullable(columns);
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

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
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

        public SchemaArgs build() {
            return new SchemaArgs(columns, description, displayName, name);
        }
    }
}