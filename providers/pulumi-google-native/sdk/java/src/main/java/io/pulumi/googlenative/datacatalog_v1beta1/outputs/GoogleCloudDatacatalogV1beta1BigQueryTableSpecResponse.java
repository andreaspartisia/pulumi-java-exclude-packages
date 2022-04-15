// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1TableSpecResponse;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1ViewSpecResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse {
    /**
     * The table source type.
     * 
     */
    private final String tableSourceType;
    /**
     * Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`.
     * 
     */
    private final GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec;
    /**
     * Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`.
     * 
     */
    private final GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse(
        @CustomType.Parameter("tableSourceType") String tableSourceType,
        @CustomType.Parameter("tableSpec") GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec,
        @CustomType.Parameter("viewSpec") GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec) {
        this.tableSourceType = tableSourceType;
        this.tableSpec = tableSpec;
        this.viewSpec = viewSpec;
    }

    /**
     * The table source type.
     * 
    */
    public String tableSourceType() {
        return this.tableSourceType;
    }
    /**
     * Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`.
     * 
    */
    public GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec() {
        return this.tableSpec;
    }
    /**
     * Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`.
     * 
    */
    public GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec() {
        return this.viewSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tableSourceType;
        private GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec;
        private GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableSourceType = defaults.tableSourceType;
    	      this.tableSpec = defaults.tableSpec;
    	      this.viewSpec = defaults.viewSpec;
        }

        public Builder tableSourceType(String tableSourceType) {
            this.tableSourceType = Objects.requireNonNull(tableSourceType);
            return this;
        }
        public Builder tableSpec(GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec) {
            this.tableSpec = Objects.requireNonNull(tableSpec);
            return this;
        }
        public Builder viewSpec(GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec) {
            this.viewSpec = Objects.requireNonNull(viewSpec);
            return this;
        }        public GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse build() {
            return new GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse(tableSourceType, tableSpec, viewSpec);
        }
    }
}
