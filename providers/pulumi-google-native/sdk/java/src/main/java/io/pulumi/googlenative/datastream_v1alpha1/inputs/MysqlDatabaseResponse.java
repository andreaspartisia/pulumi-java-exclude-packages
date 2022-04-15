// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * MySQL database.
 * 
 */
public final class MysqlDatabaseResponse extends io.pulumi.resources.InvokeArgs {

    public static final MysqlDatabaseResponse Empty = new MysqlDatabaseResponse();

    /**
     * Database name.
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Tables in the database.
     * 
     */
    @Import(name="mysqlTables", required=true)
      private final List<MysqlTableResponse> mysqlTables;

    public List<MysqlTableResponse> mysqlTables() {
        return this.mysqlTables;
    }

    public MysqlDatabaseResponse(
        String databaseName,
        List<MysqlTableResponse> mysqlTables) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.mysqlTables = Objects.requireNonNull(mysqlTables, "expected parameter 'mysqlTables' to be non-null");
    }

    private MysqlDatabaseResponse() {
        this.databaseName = null;
        this.mysqlTables = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlDatabaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private List<MysqlTableResponse> mysqlTables;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlDatabaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder mysqlTables(List<MysqlTableResponse> mysqlTables) {
            this.mysqlTables = Objects.requireNonNull(mysqlTables);
            return this;
        }
        public Builder mysqlTables(MysqlTableResponse... mysqlTables) {
            return mysqlTables(List.of(mysqlTables));
        }        public MysqlDatabaseResponse build() {
            return new MysqlDatabaseResponse(databaseName, mysqlTables);
        }
    }
}
