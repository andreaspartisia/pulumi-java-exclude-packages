// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MySQL Column.
 * 
 */
public final class MysqlColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlColumnArgs Empty = new MysqlColumnArgs();

    /**
     * Column collation.
     * 
     */
    @Import(name="collation")
      private final @Nullable Output<String> collation;

    public Output<String> collation() {
        return this.collation == null ? Codegen.empty() : this.collation;
    }

    /**
     * Column name.
     * 
     */
    @Import(name="columnName")
      private final @Nullable Output<String> columnName;

    public Output<String> columnName() {
        return this.columnName == null ? Codegen.empty() : this.columnName;
    }

    /**
     * The MySQL data type. Full data types list can be found here: https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * 
     */
    @Import(name="dataType")
      private final @Nullable Output<String> dataType;

    public Output<String> dataType() {
        return this.dataType == null ? Codegen.empty() : this.dataType;
    }

    /**
     * Column length.
     * 
     */
    @Import(name="length")
      private final @Nullable Output<Integer> length;

    public Output<Integer> length() {
        return this.length == null ? Codegen.empty() : this.length;
    }

    /**
     * Whether or not the column can accept a null value.
     * 
     */
    @Import(name="nullable")
      private final @Nullable Output<Boolean> nullable;

    public Output<Boolean> nullable() {
        return this.nullable == null ? Codegen.empty() : this.nullable;
    }

    /**
     * The ordinal position of the column in the table.
     * 
     */
    @Import(name="ordinalPosition")
      private final @Nullable Output<Integer> ordinalPosition;

    public Output<Integer> ordinalPosition() {
        return this.ordinalPosition == null ? Codegen.empty() : this.ordinalPosition;
    }

    /**
     * Whether or not the column represents a primary key.
     * 
     */
    @Import(name="primaryKey")
      private final @Nullable Output<Boolean> primaryKey;

    public Output<Boolean> primaryKey() {
        return this.primaryKey == null ? Codegen.empty() : this.primaryKey;
    }

    public MysqlColumnArgs(
        @Nullable Output<String> collation,
        @Nullable Output<String> columnName,
        @Nullable Output<String> dataType,
        @Nullable Output<Integer> length,
        @Nullable Output<Boolean> nullable,
        @Nullable Output<Integer> ordinalPosition,
        @Nullable Output<Boolean> primaryKey) {
        this.collation = collation;
        this.columnName = columnName;
        this.dataType = dataType;
        this.length = length;
        this.nullable = nullable;
        this.ordinalPosition = ordinalPosition;
        this.primaryKey = primaryKey;
    }

    private MysqlColumnArgs() {
        this.collation = Codegen.empty();
        this.columnName = Codegen.empty();
        this.dataType = Codegen.empty();
        this.length = Codegen.empty();
        this.nullable = Codegen.empty();
        this.ordinalPosition = Codegen.empty();
        this.primaryKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> collation;
        private @Nullable Output<String> columnName;
        private @Nullable Output<String> dataType;
        private @Nullable Output<Integer> length;
        private @Nullable Output<Boolean> nullable;
        private @Nullable Output<Integer> ordinalPosition;
        private @Nullable Output<Boolean> primaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collation = defaults.collation;
    	      this.columnName = defaults.columnName;
    	      this.dataType = defaults.dataType;
    	      this.length = defaults.length;
    	      this.nullable = defaults.nullable;
    	      this.ordinalPosition = defaults.ordinalPosition;
    	      this.primaryKey = defaults.primaryKey;
        }

        public Builder collation(@Nullable Output<String> collation) {
            this.collation = collation;
            return this;
        }
        public Builder collation(@Nullable String collation) {
            this.collation = Codegen.ofNullable(collation);
            return this;
        }
        public Builder columnName(@Nullable Output<String> columnName) {
            this.columnName = columnName;
            return this;
        }
        public Builder columnName(@Nullable String columnName) {
            this.columnName = Codegen.ofNullable(columnName);
            return this;
        }
        public Builder dataType(@Nullable Output<String> dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder dataType(@Nullable String dataType) {
            this.dataType = Codegen.ofNullable(dataType);
            return this;
        }
        public Builder length(@Nullable Output<Integer> length) {
            this.length = length;
            return this;
        }
        public Builder length(@Nullable Integer length) {
            this.length = Codegen.ofNullable(length);
            return this;
        }
        public Builder nullable(@Nullable Output<Boolean> nullable) {
            this.nullable = nullable;
            return this;
        }
        public Builder nullable(@Nullable Boolean nullable) {
            this.nullable = Codegen.ofNullable(nullable);
            return this;
        }
        public Builder ordinalPosition(@Nullable Output<Integer> ordinalPosition) {
            this.ordinalPosition = ordinalPosition;
            return this;
        }
        public Builder ordinalPosition(@Nullable Integer ordinalPosition) {
            this.ordinalPosition = Codegen.ofNullable(ordinalPosition);
            return this;
        }
        public Builder primaryKey(@Nullable Output<Boolean> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder primaryKey(@Nullable Boolean primaryKey) {
            this.primaryKey = Codegen.ofNullable(primaryKey);
            return this;
        }        public MysqlColumnArgs build() {
            return new MysqlColumnArgs(collation, columnName, dataType, length, nullable, ordinalPosition, primaryKey);
        }
    }
}
