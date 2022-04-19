// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.ManagedDiskDetailsResponse;
import com.pulumi.azurenative.databox.inputs.StorageAccountDetailsResponse;
import com.pulumi.azurenative.databox.inputs.TransferConfigurationResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the data to be used for exporting data from azure.
 * 
 */
public final class DataExportDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataExportDetailsResponse Empty = new DataExportDetailsResponse();

    /**
     * Account details of the data to be transferred
     * 
     */
    @Import(name="accountDetails", required=true)
      private final Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails;

    public Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails() {
        return this.accountDetails;
    }

    /**
     * Level of the logs to be collected.
     * 
     */
    @Import(name="logCollectionLevel")
      private final @Nullable String logCollectionLevel;

    public Optional<String> logCollectionLevel() {
        return this.logCollectionLevel == null ? Optional.empty() : Optional.ofNullable(this.logCollectionLevel);
    }

    /**
     * Configuration for the data transfer.
     * 
     */
    @Import(name="transferConfiguration", required=true)
      private final TransferConfigurationResponse transferConfiguration;

    public TransferConfigurationResponse transferConfiguration() {
        return this.transferConfiguration;
    }

    public DataExportDetailsResponse(
        Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails,
        @Nullable String logCollectionLevel,
        TransferConfigurationResponse transferConfiguration) {
        this.accountDetails = Objects.requireNonNull(accountDetails, "expected parameter 'accountDetails' to be non-null");
        this.logCollectionLevel = Codegen.stringProp("logCollectionLevel").arg(logCollectionLevel).def("Error").getNullable();
        this.transferConfiguration = Objects.requireNonNull(transferConfiguration, "expected parameter 'transferConfiguration' to be non-null");
    }

    private DataExportDetailsResponse() {
        this.accountDetails = null;
        this.logCollectionLevel = null;
        this.transferConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataExportDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails;
        private @Nullable String logCollectionLevel;
        private TransferConfigurationResponse transferConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataExportDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountDetails = defaults.accountDetails;
    	      this.logCollectionLevel = defaults.logCollectionLevel;
    	      this.transferConfiguration = defaults.transferConfiguration;
        }

        public Builder accountDetails(Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails) {
            this.accountDetails = Objects.requireNonNull(accountDetails);
            return this;
        }
        public Builder logCollectionLevel(@Nullable String logCollectionLevel) {
            this.logCollectionLevel = logCollectionLevel;
            return this;
        }
        public Builder transferConfiguration(TransferConfigurationResponse transferConfiguration) {
            this.transferConfiguration = Objects.requireNonNull(transferConfiguration);
            return this;
        }        public DataExportDetailsResponse build() {
            return new DataExportDetailsResponse(accountDetails, logCollectionLevel, transferConfiguration);
        }
    }
}
