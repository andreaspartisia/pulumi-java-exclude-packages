// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specification for the BigQuery connection to a Cloud SQL instance.
 * 
 */
public final class GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse Empty = new GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse();

    /**
     * Database name.
     * 
     */
    @Import(name="database", required=true)
      private final String database;

    public String database() {
        return this.database;
    }

    /**
     * Cloud SQL instance ID in the format of `project:location:instance`.
     * 
     */
    @Import(name="instanceId", required=true)
      private final String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Type of the Cloud SQL database.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse(
        String database,
        String instanceId,
        String type) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse() {
        this.database = null;
        this.instanceId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String instanceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
    	      this.type = defaults.type;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse build() {
            return new GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse(database, instanceId, type);
        }
    }
}
