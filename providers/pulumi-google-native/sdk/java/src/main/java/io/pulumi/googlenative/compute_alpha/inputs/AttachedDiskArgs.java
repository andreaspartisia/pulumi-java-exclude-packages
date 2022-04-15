// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.AttachedDiskInterface;
import io.pulumi.googlenative.compute_alpha.enums.AttachedDiskMode;
import io.pulumi.googlenative.compute_alpha.enums.AttachedDiskSavedState;
import io.pulumi.googlenative.compute_alpha.enums.AttachedDiskType;
import io.pulumi.googlenative.compute_alpha.inputs.AttachedDiskInitializeParamsArgs;
import io.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.GuestOsFeatureArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An instance-attached disk resource.
 * 
 */
public final class AttachedDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttachedDiskArgs Empty = new AttachedDiskArgs();

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    @Import(name="autoDelete")
      private final @Nullable Output<Boolean> autoDelete;

    public Output<Boolean> autoDelete() {
        return this.autoDelete == null ? Codegen.empty() : this.autoDelete;
    }

    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    @Import(name="boot")
      private final @Nullable Output<Boolean> boot;

    public Output<Boolean> boot() {
        return this.boot == null ? Codegen.empty() : this.boot;
    }

    /**
     * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
     * 
     */
    @Import(name="diskEncryptionKey")
      private final @Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey;

    public Output<CustomerEncryptionKeyArgs> diskEncryptionKey() {
        return this.diskEncryptionKey == null ? Codegen.empty() : this.diskEncryptionKey;
    }

    /**
     * The size of the disk in GB.
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<String> diskSizeGb;

    public Output<String> diskSizeGb() {
        return this.diskSizeGb == null ? Codegen.empty() : this.diskSizeGb;
    }

    /**
     * [Input Only] Whether to force attach the regional disk even if it's currently attached to another instance. If you try to force attach a zonal disk to an instance, you will receive an error.
     * 
     */
    @Import(name="forceAttach")
      private final @Nullable Output<Boolean> forceAttach;

    public Output<Boolean> forceAttach() {
        return this.forceAttach == null ? Codegen.empty() : this.forceAttach;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    @Import(name="guestOsFeatures")
      private final @Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures;

    public Output<List<GuestOsFeatureArgs>> guestOsFeatures() {
        return this.guestOsFeatures == null ? Codegen.empty() : this.guestOsFeatures;
    }

    /**
     * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    @Import(name="initializeParams")
      private final @Nullable Output<AttachedDiskInitializeParamsArgs> initializeParams;

    public Output<AttachedDiskInitializeParamsArgs> initializeParams() {
        return this.initializeParams == null ? Codegen.empty() : this.initializeParams;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    @Import(name="interface")
      private final @Nullable Output<AttachedDiskInterface> interface_;

    public Output<AttachedDiskInterface> interface_() {
        return this.interface_ == null ? Codegen.empty() : this.interface_;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<AttachedDiskMode> mode;

    public Output<AttachedDiskMode> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to PRESERVED if the LocalSSD data has been saved to a persistent location by customer request. (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
     * 
     */
    @Import(name="savedState")
      private final @Nullable Output<AttachedDiskSavedState> savedState;

    public Output<AttachedDiskSavedState> savedState() {
        return this.savedState == null ? Codegen.empty() : this.savedState;
    }

    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> source() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<AttachedDiskType> type;

    public Output<AttachedDiskType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public AttachedDiskArgs(
        @Nullable Output<Boolean> autoDelete,
        @Nullable Output<Boolean> boot,
        @Nullable Output<String> deviceName,
        @Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey,
        @Nullable Output<String> diskSizeGb,
        @Nullable Output<Boolean> forceAttach,
        @Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures,
        @Nullable Output<AttachedDiskInitializeParamsArgs> initializeParams,
        @Nullable Output<AttachedDiskInterface> interface_,
        @Nullable Output<AttachedDiskMode> mode,
        @Nullable Output<AttachedDiskSavedState> savedState,
        @Nullable Output<String> source,
        @Nullable Output<AttachedDiskType> type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskSizeGb = diskSizeGb;
        this.forceAttach = forceAttach;
        this.guestOsFeatures = guestOsFeatures;
        this.initializeParams = initializeParams;
        this.interface_ = interface_;
        this.mode = mode;
        this.savedState = savedState;
        this.source = source;
        this.type = type;
    }

    private AttachedDiskArgs() {
        this.autoDelete = Codegen.empty();
        this.boot = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.diskEncryptionKey = Codegen.empty();
        this.diskSizeGb = Codegen.empty();
        this.forceAttach = Codegen.empty();
        this.guestOsFeatures = Codegen.empty();
        this.initializeParams = Codegen.empty();
        this.interface_ = Codegen.empty();
        this.mode = Codegen.empty();
        this.savedState = Codegen.empty();
        this.source = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoDelete;
        private @Nullable Output<Boolean> boot;
        private @Nullable Output<String> deviceName;
        private @Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey;
        private @Nullable Output<String> diskSizeGb;
        private @Nullable Output<Boolean> forceAttach;
        private @Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures;
        private @Nullable Output<AttachedDiskInitializeParamsArgs> initializeParams;
        private @Nullable Output<AttachedDiskInterface> interface_;
        private @Nullable Output<AttachedDiskMode> mode;
        private @Nullable Output<AttachedDiskSavedState> savedState;
        private @Nullable Output<String> source;
        private @Nullable Output<AttachedDiskType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.forceAttach = defaults.forceAttach;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.initializeParams = defaults.initializeParams;
    	      this.interface_ = defaults.interface_;
    	      this.mode = defaults.mode;
    	      this.savedState = defaults.savedState;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Codegen.ofNullable(autoDelete);
            return this;
        }
        public Builder boot(@Nullable Output<Boolean> boot) {
            this.boot = boot;
            return this;
        }
        public Builder boot(@Nullable Boolean boot) {
            this.boot = Codegen.ofNullable(boot);
            return this;
        }
        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder diskEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }
        public Builder diskEncryptionKey(@Nullable CustomerEncryptionKeyArgs diskEncryptionKey) {
            this.diskEncryptionKey = Codegen.ofNullable(diskEncryptionKey);
            return this;
        }
        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable String diskSizeGb) {
            this.diskSizeGb = Codegen.ofNullable(diskSizeGb);
            return this;
        }
        public Builder forceAttach(@Nullable Output<Boolean> forceAttach) {
            this.forceAttach = forceAttach;
            return this;
        }
        public Builder forceAttach(@Nullable Boolean forceAttach) {
            this.forceAttach = Codegen.ofNullable(forceAttach);
            return this;
        }
        public Builder guestOsFeatures(@Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures) {
            this.guestOsFeatures = guestOsFeatures;
            return this;
        }
        public Builder guestOsFeatures(@Nullable List<GuestOsFeatureArgs> guestOsFeatures) {
            this.guestOsFeatures = Codegen.ofNullable(guestOsFeatures);
            return this;
        }
        public Builder guestOsFeatures(GuestOsFeatureArgs... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        public Builder initializeParams(@Nullable Output<AttachedDiskInitializeParamsArgs> initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }
        public Builder initializeParams(@Nullable AttachedDiskInitializeParamsArgs initializeParams) {
            this.initializeParams = Codegen.ofNullable(initializeParams);
            return this;
        }
        public Builder interface_(@Nullable Output<AttachedDiskInterface> interface_) {
            this.interface_ = interface_;
            return this;
        }
        public Builder interface_(@Nullable AttachedDiskInterface interface_) {
            this.interface_ = Codegen.ofNullable(interface_);
            return this;
        }
        public Builder mode(@Nullable Output<AttachedDiskMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable AttachedDiskMode mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder savedState(@Nullable Output<AttachedDiskSavedState> savedState) {
            this.savedState = savedState;
            return this;
        }
        public Builder savedState(@Nullable AttachedDiskSavedState savedState) {
            this.savedState = Codegen.ofNullable(savedState);
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder type(@Nullable Output<AttachedDiskType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable AttachedDiskType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public AttachedDiskArgs build() {
            return new AttachedDiskArgs(autoDelete, boot, deviceName, diskEncryptionKey, diskSizeGb, forceAttach, guestOsFeatures, initializeParams, interface_, mode, savedState, source, type);
        }
    }
}
