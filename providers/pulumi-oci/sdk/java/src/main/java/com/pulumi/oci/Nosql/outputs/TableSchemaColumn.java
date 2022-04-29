// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Nosql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableSchemaColumn {
    /**
     * @return The column default value.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * @return The column nullable flag.
     * 
     */
    private final @Nullable Boolean isNullable;
    /**
     * @return Table name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The column type.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private TableSchemaColumn(
        @CustomType.Parameter("defaultValue") @Nullable String defaultValue,
        @CustomType.Parameter("isNullable") @Nullable Boolean isNullable,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.defaultValue = defaultValue;
        this.isNullable = isNullable;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The column default value.
     * 
     */
    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * @return The column nullable flag.
     * 
     */
    public Optional<Boolean> isNullable() {
        return Optional.ofNullable(this.isNullable);
    }
    /**
     * @return Table name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The column type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableSchemaColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable Boolean isNullable;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableSchemaColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.isNullable = defaults.isNullable;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder isNullable(@Nullable Boolean isNullable) {
            this.isNullable = isNullable;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public TableSchemaColumn build() {
            return new TableSchemaColumn(defaultValue, isNullable, name, type);
        }
    }
}
