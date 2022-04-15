// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.bigquery_v2.inputs.ModelReferenceArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobConfigurationExtractArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobConfigurationExtractArgs Empty = new JobConfigurationExtractArgs();

    /**
     * [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
     * 
     */
    @Import(name="compression")
      private final @Nullable Output<String> compression;

    public Output<String> compression() {
        return this.compression == null ? Codegen.empty() : this.compression;
    }

    /**
     * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
     * 
     */
    @Import(name="destinationFormat")
      private final @Nullable Output<String> destinationFormat;

    public Output<String> destinationFormat() {
        return this.destinationFormat == null ? Codegen.empty() : this.destinationFormat;
    }

    /**
     * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
     * 
     */
    @Import(name="destinationUri")
      private final @Nullable Output<String> destinationUri;

    public Output<String> destinationUri() {
        return this.destinationUri == null ? Codegen.empty() : this.destinationUri;
    }

    /**
     * [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    @Import(name="destinationUris")
      private final @Nullable Output<List<String>> destinationUris;

    public Output<List<String>> destinationUris() {
        return this.destinationUris == null ? Codegen.empty() : this.destinationUris;
    }

    /**
     * [Optional] Delimiter to use between fields in the exported data. Default is ','. Not applicable when extracting models.
     * 
     */
    @Import(name="fieldDelimiter")
      private final @Nullable Output<String> fieldDelimiter;

    public Output<String> fieldDelimiter() {
        return this.fieldDelimiter == null ? Codegen.empty() : this.fieldDelimiter;
    }

    /**
     * [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
     * 
     */
    @Import(name="printHeader")
      private final @Nullable Output<Boolean> printHeader;

    public Output<Boolean> printHeader() {
        return this.printHeader == null ? Codegen.empty() : this.printHeader;
    }

    /**
     * A reference to the model being exported.
     * 
     */
    @Import(name="sourceModel")
      private final @Nullable Output<ModelReferenceArgs> sourceModel;

    public Output<ModelReferenceArgs> sourceModel() {
        return this.sourceModel == null ? Codegen.empty() : this.sourceModel;
    }

    /**
     * A reference to the table being exported.
     * 
     */
    @Import(name="sourceTable")
      private final @Nullable Output<TableReferenceArgs> sourceTable;

    public Output<TableReferenceArgs> sourceTable() {
        return this.sourceTable == null ? Codegen.empty() : this.sourceTable;
    }

    /**
     * [Optional] If destinationFormat is set to "AVRO", this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
     * 
     */
    @Import(name="useAvroLogicalTypes")
      private final @Nullable Output<Boolean> useAvroLogicalTypes;

    public Output<Boolean> useAvroLogicalTypes() {
        return this.useAvroLogicalTypes == null ? Codegen.empty() : this.useAvroLogicalTypes;
    }

    public JobConfigurationExtractArgs(
        @Nullable Output<String> compression,
        @Nullable Output<String> destinationFormat,
        @Nullable Output<String> destinationUri,
        @Nullable Output<List<String>> destinationUris,
        @Nullable Output<String> fieldDelimiter,
        @Nullable Output<Boolean> printHeader,
        @Nullable Output<ModelReferenceArgs> sourceModel,
        @Nullable Output<TableReferenceArgs> sourceTable,
        @Nullable Output<Boolean> useAvroLogicalTypes) {
        this.compression = compression;
        this.destinationFormat = destinationFormat;
        this.destinationUri = destinationUri;
        this.destinationUris = destinationUris;
        this.fieldDelimiter = fieldDelimiter;
        this.printHeader = printHeader;
        this.sourceModel = sourceModel;
        this.sourceTable = sourceTable;
        this.useAvroLogicalTypes = useAvroLogicalTypes;
    }

    private JobConfigurationExtractArgs() {
        this.compression = Codegen.empty();
        this.destinationFormat = Codegen.empty();
        this.destinationUri = Codegen.empty();
        this.destinationUris = Codegen.empty();
        this.fieldDelimiter = Codegen.empty();
        this.printHeader = Codegen.empty();
        this.sourceModel = Codegen.empty();
        this.sourceTable = Codegen.empty();
        this.useAvroLogicalTypes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationExtractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> compression;
        private @Nullable Output<String> destinationFormat;
        private @Nullable Output<String> destinationUri;
        private @Nullable Output<List<String>> destinationUris;
        private @Nullable Output<String> fieldDelimiter;
        private @Nullable Output<Boolean> printHeader;
        private @Nullable Output<ModelReferenceArgs> sourceModel;
        private @Nullable Output<TableReferenceArgs> sourceTable;
        private @Nullable Output<Boolean> useAvroLogicalTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationExtractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.destinationFormat = defaults.destinationFormat;
    	      this.destinationUri = defaults.destinationUri;
    	      this.destinationUris = defaults.destinationUris;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.printHeader = defaults.printHeader;
    	      this.sourceModel = defaults.sourceModel;
    	      this.sourceTable = defaults.sourceTable;
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
        }

        public Builder compression(@Nullable Output<String> compression) {
            this.compression = compression;
            return this;
        }
        public Builder compression(@Nullable String compression) {
            this.compression = Codegen.ofNullable(compression);
            return this;
        }
        public Builder destinationFormat(@Nullable Output<String> destinationFormat) {
            this.destinationFormat = destinationFormat;
            return this;
        }
        public Builder destinationFormat(@Nullable String destinationFormat) {
            this.destinationFormat = Codegen.ofNullable(destinationFormat);
            return this;
        }
        public Builder destinationUri(@Nullable Output<String> destinationUri) {
            this.destinationUri = destinationUri;
            return this;
        }
        public Builder destinationUri(@Nullable String destinationUri) {
            this.destinationUri = Codegen.ofNullable(destinationUri);
            return this;
        }
        public Builder destinationUris(@Nullable Output<List<String>> destinationUris) {
            this.destinationUris = destinationUris;
            return this;
        }
        public Builder destinationUris(@Nullable List<String> destinationUris) {
            this.destinationUris = Codegen.ofNullable(destinationUris);
            return this;
        }
        public Builder destinationUris(String... destinationUris) {
            return destinationUris(List.of(destinationUris));
        }
        public Builder fieldDelimiter(@Nullable Output<String> fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }
        public Builder fieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = Codegen.ofNullable(fieldDelimiter);
            return this;
        }
        public Builder printHeader(@Nullable Output<Boolean> printHeader) {
            this.printHeader = printHeader;
            return this;
        }
        public Builder printHeader(@Nullable Boolean printHeader) {
            this.printHeader = Codegen.ofNullable(printHeader);
            return this;
        }
        public Builder sourceModel(@Nullable Output<ModelReferenceArgs> sourceModel) {
            this.sourceModel = sourceModel;
            return this;
        }
        public Builder sourceModel(@Nullable ModelReferenceArgs sourceModel) {
            this.sourceModel = Codegen.ofNullable(sourceModel);
            return this;
        }
        public Builder sourceTable(@Nullable Output<TableReferenceArgs> sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }
        public Builder sourceTable(@Nullable TableReferenceArgs sourceTable) {
            this.sourceTable = Codegen.ofNullable(sourceTable);
            return this;
        }
        public Builder useAvroLogicalTypes(@Nullable Output<Boolean> useAvroLogicalTypes) {
            this.useAvroLogicalTypes = useAvroLogicalTypes;
            return this;
        }
        public Builder useAvroLogicalTypes(@Nullable Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Codegen.ofNullable(useAvroLogicalTypes);
            return this;
        }        public JobConfigurationExtractArgs build() {
            return new JobConfigurationExtractArgs(compression, destinationFormat, destinationUri, destinationUris, fieldDelimiter, printHeader, sourceModel, sourceTable, useAvroLogicalTypes);
        }
    }
}
