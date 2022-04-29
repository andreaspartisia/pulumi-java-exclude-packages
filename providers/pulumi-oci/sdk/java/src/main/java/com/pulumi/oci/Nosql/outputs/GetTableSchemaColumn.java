// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Nosql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTableSchemaColumn {
    /**
     * @return The column default value.
     * 
     */
    private final String defaultValue;
    /**
     * @return The column nullable flag.
     * 
     */
    private final Boolean isNullable;
    /**
     * @return The column name.
     * 
     */
    private final String name;
    /**
     * @return The column type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetTableSchemaColumn(
        @CustomType.Parameter("defaultValue") String defaultValue,
        @CustomType.Parameter("isNullable") Boolean isNullable,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.defaultValue = defaultValue;
        this.isNullable = isNullable;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The column default value.
     * 
     */
    public String defaultValue() {
        return this.defaultValue;
    }
    /**
     * @return The column nullable flag.
     * 
     */
    public Boolean isNullable() {
        return this.isNullable;
    }
    /**
     * @return The column name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The column type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableSchemaColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultValue;
        private Boolean isNullable;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableSchemaColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.isNullable = defaults.isNullable;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public Builder isNullable(Boolean isNullable) {
            this.isNullable = Objects.requireNonNull(isNullable);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetTableSchemaColumn build() {
            return new GetTableSchemaColumn(defaultValue, isNullable, name, type);
        }
    }
}
