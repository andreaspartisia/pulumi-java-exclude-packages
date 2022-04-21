// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.StorageAccountTypes;
import com.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters of a managed disk.
 * 
 */
public final class ManagedDiskParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDiskParametersArgs Empty = new ManagedDiskParametersArgs();

    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    @Import(name="diskEncryptionSet")
    private @Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet;

    public Optional<Output<DiskEncryptionSetParametersArgs>> diskEncryptionSet() {
        return Optional.ofNullable(this.diskEncryptionSet);
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies the storage account type for the managed disk. Managed OS disk storage account type can only be set when you create the scale set. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable Output<Either<String,StorageAccountTypes>> storageAccountType;

    public Optional<Output<Either<String,StorageAccountTypes>>> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    private ManagedDiskParametersArgs() {}

    private ManagedDiskParametersArgs(ManagedDiskParametersArgs $) {
        this.diskEncryptionSet = $.diskEncryptionSet;
        this.id = $.id;
        this.storageAccountType = $.storageAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDiskParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDiskParametersArgs $;

        public Builder() {
            $ = new ManagedDiskParametersArgs();
        }

        public Builder(ManagedDiskParametersArgs defaults) {
            $ = new ManagedDiskParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder diskEncryptionSet(@Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet) {
            $.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder diskEncryptionSet(DiskEncryptionSetParametersArgs diskEncryptionSet) {
            return diskEncryptionSet(Output.of(diskEncryptionSet));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder storageAccountType(@Nullable Output<Either<String,StorageAccountTypes>> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        public Builder storageAccountType(Either<String,StorageAccountTypes> storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
        }

        public Builder storageAccountType(String storageAccountType) {
            return storageAccountType(Either.ofLeft(storageAccountType));
        }

        public Builder storageAccountType(StorageAccountTypes storageAccountType) {
            return storageAccountType(Either.ofRight(storageAccountType));
        }

        public ManagedDiskParametersArgs build() {
            return $;
        }
    }

}
