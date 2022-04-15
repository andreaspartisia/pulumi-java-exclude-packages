// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1TableSpecResponse;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1ViewSpecResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a BigQuery table.
 * 
 */
public final class GoogleCloudDatacatalogV1BigQueryTableSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1BigQueryTableSpecResponse Empty = new GoogleCloudDatacatalogV1BigQueryTableSpecResponse();

    /**
     * The table source type.
     * 
     */
    @Import(name="tableSourceType", required=true)
      private final String tableSourceType;

    public String tableSourceType() {
        return this.tableSourceType;
    }

    /**
     * Specification of a BigQuery table. Populated only if the `table_source_type` is `BIGQUERY_TABLE`.
     * 
     */
    @Import(name="tableSpec", required=true)
      private final GoogleCloudDatacatalogV1TableSpecResponse tableSpec;

    public GoogleCloudDatacatalogV1TableSpecResponse tableSpec() {
        return this.tableSpec;
    }

    /**
     * Table view specification. Populated only if the `table_source_type` is `BIGQUERY_VIEW`.
     * 
     */
    @Import(name="viewSpec", required=true)
      private final GoogleCloudDatacatalogV1ViewSpecResponse viewSpec;

    public GoogleCloudDatacatalogV1ViewSpecResponse viewSpec() {
        return this.viewSpec;
    }

    public GoogleCloudDatacatalogV1BigQueryTableSpecResponse(
        String tableSourceType,
        GoogleCloudDatacatalogV1TableSpecResponse tableSpec,
        GoogleCloudDatacatalogV1ViewSpecResponse viewSpec) {
        this.tableSourceType = Objects.requireNonNull(tableSourceType, "expected parameter 'tableSourceType' to be non-null");
        this.tableSpec = Objects.requireNonNull(tableSpec, "expected parameter 'tableSpec' to be non-null");
        this.viewSpec = Objects.requireNonNull(viewSpec, "expected parameter 'viewSpec' to be non-null");
    }

    private GoogleCloudDatacatalogV1BigQueryTableSpecResponse() {
        this.tableSourceType = null;
        this.tableSpec = null;
        this.viewSpec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BigQueryTableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tableSourceType;
        private GoogleCloudDatacatalogV1TableSpecResponse tableSpec;
        private GoogleCloudDatacatalogV1ViewSpecResponse viewSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryTableSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableSourceType = defaults.tableSourceType;
    	      this.tableSpec = defaults.tableSpec;
    	      this.viewSpec = defaults.viewSpec;
        }

        public Builder tableSourceType(String tableSourceType) {
            this.tableSourceType = Objects.requireNonNull(tableSourceType);
            return this;
        }
        public Builder tableSpec(GoogleCloudDatacatalogV1TableSpecResponse tableSpec) {
            this.tableSpec = Objects.requireNonNull(tableSpec);
            return this;
        }
        public Builder viewSpec(GoogleCloudDatacatalogV1ViewSpecResponse viewSpec) {
            this.viewSpec = Objects.requireNonNull(viewSpec);
            return this;
        }        public GoogleCloudDatacatalogV1BigQueryTableSpecResponse build() {
            return new GoogleCloudDatacatalogV1BigQueryTableSpecResponse(tableSourceType, tableSpec, viewSpec);
        }
    }
}
