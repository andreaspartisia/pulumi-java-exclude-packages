// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datastream_v1.inputs.MysqlTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MySQL database.
 * 
 */
public final class MysqlDatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlDatabaseArgs Empty = new MysqlDatabaseArgs();

    /**
     * Database name.
     * 
     */
    @Import(name="database")
      private final @Nullable Output<String> database;

    public Output<String> database() {
        return this.database == null ? Codegen.empty() : this.database;
    }

    /**
     * Tables in the database.
     * 
     */
    @Import(name="mysqlTables")
      private final @Nullable Output<List<MysqlTableArgs>> mysqlTables;

    public Output<List<MysqlTableArgs>> mysqlTables() {
        return this.mysqlTables == null ? Codegen.empty() : this.mysqlTables;
    }

    public MysqlDatabaseArgs(
        @Nullable Output<String> database,
        @Nullable Output<List<MysqlTableArgs>> mysqlTables) {
        this.database = database;
        this.mysqlTables = mysqlTables;
    }

    private MysqlDatabaseArgs() {
        this.database = Codegen.empty();
        this.mysqlTables = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> database;
        private @Nullable Output<List<MysqlTableArgs>> mysqlTables;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        public Builder database(@Nullable Output<String> database) {
            this.database = database;
            return this;
        }
        public Builder database(@Nullable String database) {
            this.database = Codegen.ofNullable(database);
            return this;
        }
        public Builder mysqlTables(@Nullable Output<List<MysqlTableArgs>> mysqlTables) {
            this.mysqlTables = mysqlTables;
            return this;
        }
        public Builder mysqlTables(@Nullable List<MysqlTableArgs> mysqlTables) {
            this.mysqlTables = Codegen.ofNullable(mysqlTables);
            return this;
        }
        public Builder mysqlTables(MysqlTableArgs... mysqlTables) {
            return mysqlTables(List.of(mysqlTables));
        }        public MysqlDatabaseArgs build() {
            return new MysqlDatabaseArgs(database, mysqlTables);
        }
    }
}
