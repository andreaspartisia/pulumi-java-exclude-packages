// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2BigQueryTableResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2OutputStorageConfigResponse {
    /**
     * Schema used for writing the findings for Inspect jobs. This field is only used for Inspect and must be unspecified for Risk jobs. Columns are derived from the `Finding` object. If appending to an existing table, any columns from the predefined schema that are missing will be added. No columns in the existing table will be deleted. If unspecified, then all available columns will be used for a new table or an (existing) table with no schema, and no changes will be made to an existing table that has a schema. Only for use with external storage.
     * 
     */
    private final String outputSchema;
    /**
     * Store findings in an existing table or a new table in an existing dataset. If table_id is not set a new one will be generated for you with the following format: dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for generating the date details. For Inspect, each column in an existing output table must have the same name, type, and mode of a field in the `Finding` object. For Risk, an existing output table should be the output of a previous Risk analysis job run on the same source table, with the same privacy metric and quasi-identifiers. Risk jobs that analyze the same table but compute a different privacy metric, or use different sets of quasi-identifiers, cannot store their results in the same table.
     * 
     */
    private final GooglePrivacyDlpV2BigQueryTableResponse table;

    @CustomType.Constructor
    private GooglePrivacyDlpV2OutputStorageConfigResponse(
        @CustomType.Parameter("outputSchema") String outputSchema,
        @CustomType.Parameter("table") GooglePrivacyDlpV2BigQueryTableResponse table) {
        this.outputSchema = outputSchema;
        this.table = table;
    }

    /**
     * Schema used for writing the findings for Inspect jobs. This field is only used for Inspect and must be unspecified for Risk jobs. Columns are derived from the `Finding` object. If appending to an existing table, any columns from the predefined schema that are missing will be added. No columns in the existing table will be deleted. If unspecified, then all available columns will be used for a new table or an (existing) table with no schema, and no changes will be made to an existing table that has a schema. Only for use with external storage.
     * 
    */
    public String outputSchema() {
        return this.outputSchema;
    }
    /**
     * Store findings in an existing table or a new table in an existing dataset. If table_id is not set a new one will be generated for you with the following format: dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for generating the date details. For Inspect, each column in an existing output table must have the same name, type, and mode of a field in the `Finding` object. For Risk, an existing output table should be the output of a previous Risk analysis job run on the same source table, with the same privacy metric and quasi-identifiers. Risk jobs that analyze the same table but compute a different privacy metric, or use different sets of quasi-identifiers, cannot store their results in the same table.
     * 
    */
    public GooglePrivacyDlpV2BigQueryTableResponse table() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2OutputStorageConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String outputSchema;
        private GooglePrivacyDlpV2BigQueryTableResponse table;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2OutputStorageConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputSchema = defaults.outputSchema;
    	      this.table = defaults.table;
        }

        public Builder outputSchema(String outputSchema) {
            this.outputSchema = Objects.requireNonNull(outputSchema);
            return this;
        }
        public Builder table(GooglePrivacyDlpV2BigQueryTableResponse table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }        public GooglePrivacyDlpV2OutputStorageConfigResponse build() {
            return new GooglePrivacyDlpV2OutputStorageConfigResponse(outputSchema, table);
        }
    }
}
