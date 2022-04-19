// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.FtpReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.HttpReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.SftpReadSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity ORC source.
 * 
 */
public final class OrcSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrcSourceArgs Empty = new OrcSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
      private final @Nullable Output<Object> additionalColumns;

    public Output<Object> additionalColumns() {
        return this.additionalColumns == null ? Codegen.empty() : this.additionalColumns;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Output<Object> sourceRetryCount;

    public Output<Object> sourceRetryCount() {
        return this.sourceRetryCount == null ? Codegen.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Output<Object> sourceRetryWait;

    public Output<Object> sourceRetryWait() {
        return this.sourceRetryWait == null ? Codegen.empty() : this.sourceRetryWait;
    }

    /**
     * ORC store settings.
     * 
     */
    @Import(name="storeSettings")
      private final @Nullable Output<Object> storeSettings;

    public Output<Object> storeSettings() {
        return this.storeSettings == null ? Codegen.empty() : this.storeSettings;
    }

    /**
     * Copy source type.
     * Expected value is 'OrcSource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public OrcSourceArgs(
        @Nullable Output<Object> additionalColumns,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        @Nullable Output<Object> storeSettings,
        Output<String> type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.storeSettings = storeSettings;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private OrcSourceArgs() {
        this.additionalColumns = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.sourceRetryCount = Codegen.empty();
        this.sourceRetryWait = Codegen.empty();
        this.storeSettings = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrcSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> additionalColumns;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private @Nullable Output<Object> storeSettings;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrcSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Codegen.ofNullable(additionalColumns);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Codegen.ofNullable(sourceRetryCount);
            return this;
        }
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Codegen.ofNullable(sourceRetryWait);
            return this;
        }
        public Builder storeSettings(@Nullable Output<Object> storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }
        public Builder storeSettings(@Nullable Object storeSettings) {
            this.storeSettings = Codegen.ofNullable(storeSettings);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public OrcSourceArgs build() {
            return new OrcSourceArgs(additionalColumns, disableMetricsCollection, maxConcurrentConnections, sourceRetryCount, sourceRetryWait, storeSettings, type);
        }
    }
}
