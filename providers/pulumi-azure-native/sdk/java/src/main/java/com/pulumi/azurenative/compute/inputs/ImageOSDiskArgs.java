// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.CachingTypes;
import com.pulumi.azurenative.compute.enums.OperatingSystemStateTypes;
import com.pulumi.azurenative.compute.enums.OperatingSystemTypes;
import com.pulumi.azurenative.compute.enums.StorageAccountTypes;
import com.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersArgs;
import com.pulumi.azurenative.compute.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Operating System disk.
 * 
 */
public final class ImageOSDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageOSDiskArgs Empty = new ImageOSDiskArgs();

    /**
     * The Virtual Hard Disk.
     * 
     */
    @Import(name="blobUri")
    private @Nullable Output<String> blobUri;

    public Optional<Output<String>> blobUri() {
        return Optional.ofNullable(this.blobUri);
    }

    /**
     * Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @Import(name="caching")
    private @Nullable Output<CachingTypes> caching;

    public Optional<Output<CachingTypes>> caching() {
        return Optional.ofNullable(this.caching);
    }

    /**
     * Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    @Import(name="diskEncryptionSet")
    private @Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet;

    public Optional<Output<DiskEncryptionSetParametersArgs>> diskEncryptionSet() {
        return Optional.ofNullable(this.diskEncryptionSet);
    }

    /**
     * Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    @Import(name="diskSizeGB")
    private @Nullable Output<Integer> diskSizeGB;

    public Optional<Output<Integer>> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * The managedDisk.
     * 
     */
    @Import(name="managedDisk")
    private @Nullable Output<SubResourceArgs> managedDisk;

    public Optional<Output<SubResourceArgs>> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }

    /**
     * The OS State.
     * 
     */
    @Import(name="osState", required=true)
    private Output<OperatingSystemStateTypes> osState;

    public Output<OperatingSystemStateTypes> osState() {
        return this.osState;
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
     * 
     */
    @Import(name="osType", required=true)
    private Output<OperatingSystemTypes> osType;

    public Output<OperatingSystemTypes> osType() {
        return this.osType;
    }

    /**
     * The snapshot.
     * 
     */
    @Import(name="snapshot")
    private @Nullable Output<SubResourceArgs> snapshot;

    public Optional<Output<SubResourceArgs>> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }

    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable Output<Either<String,StorageAccountTypes>> storageAccountType;

    public Optional<Output<Either<String,StorageAccountTypes>>> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    private ImageOSDiskArgs() {}

    private ImageOSDiskArgs(ImageOSDiskArgs $) {
        this.blobUri = $.blobUri;
        this.caching = $.caching;
        this.diskEncryptionSet = $.diskEncryptionSet;
        this.diskSizeGB = $.diskSizeGB;
        this.managedDisk = $.managedDisk;
        this.osState = $.osState;
        this.osType = $.osType;
        this.snapshot = $.snapshot;
        this.storageAccountType = $.storageAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageOSDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageOSDiskArgs $;

        public Builder() {
            $ = new ImageOSDiskArgs();
        }

        public Builder(ImageOSDiskArgs defaults) {
            $ = new ImageOSDiskArgs(Objects.requireNonNull(defaults));
        }

        public Builder blobUri(@Nullable Output<String> blobUri) {
            $.blobUri = blobUri;
            return this;
        }

        public Builder blobUri(String blobUri) {
            return blobUri(Output.of(blobUri));
        }

        public Builder caching(@Nullable Output<CachingTypes> caching) {
            $.caching = caching;
            return this;
        }

        public Builder caching(CachingTypes caching) {
            return caching(Output.of(caching));
        }

        public Builder diskEncryptionSet(@Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet) {
            $.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder diskEncryptionSet(DiskEncryptionSetParametersArgs diskEncryptionSet) {
            return diskEncryptionSet(Output.of(diskEncryptionSet));
        }

        public Builder diskSizeGB(@Nullable Output<Integer> diskSizeGB) {
            $.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder diskSizeGB(Integer diskSizeGB) {
            return diskSizeGB(Output.of(diskSizeGB));
        }

        public Builder managedDisk(@Nullable Output<SubResourceArgs> managedDisk) {
            $.managedDisk = managedDisk;
            return this;
        }

        public Builder managedDisk(SubResourceArgs managedDisk) {
            return managedDisk(Output.of(managedDisk));
        }

        public Builder osState(Output<OperatingSystemStateTypes> osState) {
            $.osState = osState;
            return this;
        }

        public Builder osState(OperatingSystemStateTypes osState) {
            return osState(Output.of(osState));
        }

        public Builder osType(Output<OperatingSystemTypes> osType) {
            $.osType = osType;
            return this;
        }

        public Builder osType(OperatingSystemTypes osType) {
            return osType(Output.of(osType));
        }

        public Builder snapshot(@Nullable Output<SubResourceArgs> snapshot) {
            $.snapshot = snapshot;
            return this;
        }

        public Builder snapshot(SubResourceArgs snapshot) {
            return snapshot(Output.of(snapshot));
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

        public ImageOSDiskArgs build() {
            $.osState = Objects.requireNonNull($.osState, "expected parameter 'osState' to be non-null");
            $.osType = Objects.requireNonNull($.osType, "expected parameter 'osType' to be non-null");
            return $;
        }
    }

}
