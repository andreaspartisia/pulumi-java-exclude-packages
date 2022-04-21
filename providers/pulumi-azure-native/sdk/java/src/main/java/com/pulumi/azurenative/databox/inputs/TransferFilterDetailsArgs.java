// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.enums.DataAccountType;
import com.pulumi.azurenative.databox.inputs.AzureFileFilterDetailsArgs;
import com.pulumi.azurenative.databox.inputs.BlobFilterDetailsArgs;
import com.pulumi.azurenative.databox.inputs.FilterFileDetailsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the filtering the transfer of data.
 * 
 */
public final class TransferFilterDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferFilterDetailsArgs Empty = new TransferFilterDetailsArgs();

    /**
     * Filter details to transfer Azure files.
     * 
     */
    @Import(name="azureFileFilterDetails")
    private @Nullable Output<AzureFileFilterDetailsArgs> azureFileFilterDetails;

    public Optional<Output<AzureFileFilterDetailsArgs>> azureFileFilterDetails() {
        return Optional.ofNullable(this.azureFileFilterDetails);
    }

    /**
     * Filter details to transfer blobs.
     * 
     */
    @Import(name="blobFilterDetails")
    private @Nullable Output<BlobFilterDetailsArgs> blobFilterDetails;

    public Optional<Output<BlobFilterDetailsArgs>> blobFilterDetails() {
        return Optional.ofNullable(this.blobFilterDetails);
    }

    /**
     * Type of the account of data.
     * 
     */
    @Import(name="dataAccountType", required=true)
    private Output<Either<String,DataAccountType>> dataAccountType;

    public Output<Either<String,DataAccountType>> dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Details of the filter files to be used for data transfer.
     * 
     */
    @Import(name="filterFileDetails")
    private @Nullable Output<List<FilterFileDetailsArgs>> filterFileDetails;

    public Optional<Output<List<FilterFileDetailsArgs>>> filterFileDetails() {
        return Optional.ofNullable(this.filterFileDetails);
    }

    private TransferFilterDetailsArgs() {}

    private TransferFilterDetailsArgs(TransferFilterDetailsArgs $) {
        this.azureFileFilterDetails = $.azureFileFilterDetails;
        this.blobFilterDetails = $.blobFilterDetails;
        this.dataAccountType = $.dataAccountType;
        this.filterFileDetails = $.filterFileDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferFilterDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferFilterDetailsArgs $;

        public Builder() {
            $ = new TransferFilterDetailsArgs();
        }

        public Builder(TransferFilterDetailsArgs defaults) {
            $ = new TransferFilterDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder azureFileFilterDetails(@Nullable Output<AzureFileFilterDetailsArgs> azureFileFilterDetails) {
            $.azureFileFilterDetails = azureFileFilterDetails;
            return this;
        }

        public Builder azureFileFilterDetails(AzureFileFilterDetailsArgs azureFileFilterDetails) {
            return azureFileFilterDetails(Output.of(azureFileFilterDetails));
        }

        public Builder blobFilterDetails(@Nullable Output<BlobFilterDetailsArgs> blobFilterDetails) {
            $.blobFilterDetails = blobFilterDetails;
            return this;
        }

        public Builder blobFilterDetails(BlobFilterDetailsArgs blobFilterDetails) {
            return blobFilterDetails(Output.of(blobFilterDetails));
        }

        public Builder dataAccountType(Output<Either<String,DataAccountType>> dataAccountType) {
            $.dataAccountType = dataAccountType;
            return this;
        }

        public Builder dataAccountType(Either<String,DataAccountType> dataAccountType) {
            return dataAccountType(Output.of(dataAccountType));
        }

        public Builder dataAccountType(String dataAccountType) {
            return dataAccountType(Either.ofLeft(dataAccountType));
        }

        public Builder dataAccountType(DataAccountType dataAccountType) {
            return dataAccountType(Either.ofRight(dataAccountType));
        }

        public Builder filterFileDetails(@Nullable Output<List<FilterFileDetailsArgs>> filterFileDetails) {
            $.filterFileDetails = filterFileDetails;
            return this;
        }

        public Builder filterFileDetails(List<FilterFileDetailsArgs> filterFileDetails) {
            return filterFileDetails(Output.of(filterFileDetails));
        }

        public Builder filterFileDetails(FilterFileDetailsArgs... filterFileDetails) {
            return filterFileDetails(List.of(filterFileDetails));
        }

        public TransferFilterDetailsArgs build() {
            $.dataAccountType = Codegen.stringProp("dataAccountType").left(DataAccountType.class).output().arg($.dataAccountType).def("StorageAccount").require();
            return $;
        }
    }

}
