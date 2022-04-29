// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Nosql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final IndexKeyArgs Empty = new IndexKeyArgs();

    /**
     * The name of a column to be included as an index key.
     * 
     */
    @Import(name="columnName", required=true)
    private Output<String> columnName;

    /**
     * @return The name of a column to be included as an index key.
     * 
     */
    public Output<String> columnName() {
        return this.columnName;
    }

    /**
     * If the specified column is of type JSON, jsonFieldType contains the type of the field indicated by jsonPath.
     * 
     */
    @Import(name="jsonFieldType")
    private @Nullable Output<String> jsonFieldType;

    /**
     * @return If the specified column is of type JSON, jsonFieldType contains the type of the field indicated by jsonPath.
     * 
     */
    public Optional<Output<String>> jsonFieldType() {
        return Optional.ofNullable(this.jsonFieldType);
    }

    /**
     * If the specified column is of type JSON, jsonPath contains a dotted path indicating the field within the JSON object that will be the index key.
     * 
     */
    @Import(name="jsonPath")
    private @Nullable Output<String> jsonPath;

    /**
     * @return If the specified column is of type JSON, jsonPath contains a dotted path indicating the field within the JSON object that will be the index key.
     * 
     */
    public Optional<Output<String>> jsonPath() {
        return Optional.ofNullable(this.jsonPath);
    }

    private IndexKeyArgs() {}

    private IndexKeyArgs(IndexKeyArgs $) {
        this.columnName = $.columnName;
        this.jsonFieldType = $.jsonFieldType;
        this.jsonPath = $.jsonPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexKeyArgs $;

        public Builder() {
            $ = new IndexKeyArgs();
        }

        public Builder(IndexKeyArgs defaults) {
            $ = new IndexKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnName The name of a column to be included as an index key.
         * 
         * @return builder
         * 
         */
        public Builder columnName(Output<String> columnName) {
            $.columnName = columnName;
            return this;
        }

        /**
         * @param columnName The name of a column to be included as an index key.
         * 
         * @return builder
         * 
         */
        public Builder columnName(String columnName) {
            return columnName(Output.of(columnName));
        }

        /**
         * @param jsonFieldType If the specified column is of type JSON, jsonFieldType contains the type of the field indicated by jsonPath.
         * 
         * @return builder
         * 
         */
        public Builder jsonFieldType(@Nullable Output<String> jsonFieldType) {
            $.jsonFieldType = jsonFieldType;
            return this;
        }

        /**
         * @param jsonFieldType If the specified column is of type JSON, jsonFieldType contains the type of the field indicated by jsonPath.
         * 
         * @return builder
         * 
         */
        public Builder jsonFieldType(String jsonFieldType) {
            return jsonFieldType(Output.of(jsonFieldType));
        }

        /**
         * @param jsonPath If the specified column is of type JSON, jsonPath contains a dotted path indicating the field within the JSON object that will be the index key.
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(@Nullable Output<String> jsonPath) {
            $.jsonPath = jsonPath;
            return this;
        }

        /**
         * @param jsonPath If the specified column is of type JSON, jsonPath contains a dotted path indicating the field within the JSON object that will be the index key.
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(String jsonPath) {
            return jsonPath(Output.of(jsonPath));
        }

        public IndexKeyArgs build() {
            $.columnName = Objects.requireNonNull($.columnName, "expected parameter 'columnName' to be non-null");
            return $;
        }
    }

}
