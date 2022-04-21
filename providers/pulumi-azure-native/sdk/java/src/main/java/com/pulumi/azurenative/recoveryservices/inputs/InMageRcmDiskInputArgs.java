// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.DiskAccountType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * InMageRcm disk input.
 * 
 */
public final class InMageRcmDiskInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final InMageRcmDiskInputArgs Empty = new InMageRcmDiskInputArgs();

    /**
     * The disk encryption set ARM Id.
     * 
     */
    @Import(name="diskEncryptionSetId")
    private @Nullable Output<String> diskEncryptionSetId;

    public Optional<Output<String>> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * The disk Id.
     * 
     */
    @Import(name="diskId")
    private @Nullable Output<String> diskId;

    public Optional<Output<String>> diskId() {
        return Optional.ofNullable(this.diskId);
    }

    /**
     * The disk type.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<Either<String,DiskAccountType>> diskType;

    public Optional<Output<Either<String,DiskAccountType>>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * The log storage account ARM Id.
     * 
     */
    @Import(name="logStorageAccountId")
    private @Nullable Output<String> logStorageAccountId;

    public Optional<Output<String>> logStorageAccountId() {
        return Optional.ofNullable(this.logStorageAccountId);
    }

    private InMageRcmDiskInputArgs() {}

    private InMageRcmDiskInputArgs(InMageRcmDiskInputArgs $) {
        this.diskEncryptionSetId = $.diskEncryptionSetId;
        this.diskId = $.diskId;
        this.diskType = $.diskType;
        this.logStorageAccountId = $.logStorageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InMageRcmDiskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InMageRcmDiskInputArgs $;

        public Builder() {
            $ = new InMageRcmDiskInputArgs();
        }

        public Builder(InMageRcmDiskInputArgs defaults) {
            $ = new InMageRcmDiskInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder diskEncryptionSetId(@Nullable Output<String> diskEncryptionSetId) {
            $.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public Builder diskEncryptionSetId(String diskEncryptionSetId) {
            return diskEncryptionSetId(Output.of(diskEncryptionSetId));
        }

        public Builder diskId(@Nullable Output<String> diskId) {
            $.diskId = diskId;
            return this;
        }

        public Builder diskId(String diskId) {
            return diskId(Output.of(diskId));
        }

        public Builder diskType(@Nullable Output<Either<String,DiskAccountType>> diskType) {
            $.diskType = diskType;
            return this;
        }

        public Builder diskType(Either<String,DiskAccountType> diskType) {
            return diskType(Output.of(diskType));
        }

        public Builder diskType(String diskType) {
            return diskType(Either.ofLeft(diskType));
        }

        public Builder diskType(DiskAccountType diskType) {
            return diskType(Either.ofRight(diskType));
        }

        public Builder logStorageAccountId(@Nullable Output<String> logStorageAccountId) {
            $.logStorageAccountId = logStorageAccountId;
            return this;
        }

        public Builder logStorageAccountId(String logStorageAccountId) {
            return logStorageAccountId(Output.of(logStorageAccountId));
        }

        public InMageRcmDiskInputArgs build() {
            return $;
        }
    }

}
