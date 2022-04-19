// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.GetInstanceTemplateDiskDiskEncryptionKey;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetInstanceTemplateDisk extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateDisk Empty = new GetInstanceTemplateDisk();

    /**
     * Whether or not the disk should be auto-deleted.
     * This defaults to true.
     * 
     */
    @Import(name="autoDelete", required=true)
      private final Boolean autoDelete;

    public Boolean autoDelete() {
        return this.autoDelete;
    }

    /**
     * Indicates that this is a boot disk.
     * 
     */
    @Import(name="boot", required=true)
      private final Boolean boot;

    public Boolean boot() {
        return this.boot;
    }

    /**
     * A unique device name that is reflected into the
     * /dev/  tree of a Linux operating system running within the instance. If not
     * specified, the server chooses a default device name to apply to this disk.
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String deviceName() {
        return this.deviceName;
    }

    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     */
    @Import(name="diskEncryptionKeys", required=true)
      private final List<GetInstanceTemplateDiskDiskEncryptionKey> diskEncryptionKeys;

    public List<GetInstanceTemplateDiskDiskEncryptionKey> diskEncryptionKeys() {
        return this.diskEncryptionKeys;
    }

    /**
     * Name of the disk. When not provided, this defaults
     * to the name of the instance.
     * 
     */
    @Import(name="diskName", required=true)
      private final String diskName;

    public String diskName() {
        return this.diskName;
    }

    /**
     * The size of the image in gigabytes. If not
     * specified, it will inherit the size of its base image. For SCRATCH disks,
     * the size must be exactly 375GB.
     * 
     */
    @Import(name="diskSizeGb", required=true)
      private final Integer diskSizeGb;

    public Integer diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * The GCE disk type. Can be either `"pd-ssd"`,
     * `"local-ssd"`, `"pd-balanced"` or `"pd-standard"`.
     * 
     */
    @Import(name="diskType", required=true)
      private final String diskType;

    public String diskType() {
        return this.diskType;
    }

    /**
     * Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
     * and the request will fail if you attempt to attach a persistent disk in any other format
     * than SCSI. Local SSDs can use either NVME or SCSI.
     * 
     */
    @Import(name="interface", required=true)
      private final String interface_;

    public String interface_() {
        return this.interface_;
    }

    /**
     * (Optional) A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If you are attaching or creating a boot disk, this must
     * read-write mode.
     * 
     */
    @Import(name="mode", required=true)
      private final String mode;

    public String mode() {
        return this.mode;
    }

    @Import(name="resourcePolicies", required=true)
      private final List<String> resourcePolicies;

    public List<String> resourcePolicies() {
        return this.resourcePolicies;
    }

    /**
     * The name (**not self_link**)
     * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    @Import(name="source", required=true)
      private final String source;

    public String source() {
        return this.source;
    }

    /**
     * The image from which to
     * initialize this disk. This can be one of: the image's `self_link`,
     * `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    @Import(name="sourceImage", required=true)
      private final String sourceImage;

    public String sourceImage() {
        return this.sourceImage;
    }

    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GetInstanceTemplateDisk(
        Boolean autoDelete,
        Boolean boot,
        String deviceName,
        List<GetInstanceTemplateDiskDiskEncryptionKey> diskEncryptionKeys,
        String diskName,
        Integer diskSizeGb,
        String diskType,
        String interface_,
        Map<String,String> labels,
        String mode,
        List<String> resourcePolicies,
        String source,
        String sourceImage,
        String type) {
        this.autoDelete = Objects.requireNonNull(autoDelete, "expected parameter 'autoDelete' to be non-null");
        this.boot = Objects.requireNonNull(boot, "expected parameter 'boot' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.diskEncryptionKeys = Objects.requireNonNull(diskEncryptionKeys, "expected parameter 'diskEncryptionKeys' to be non-null");
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.interface_ = Objects.requireNonNull(interface_, "expected parameter 'interface' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.resourcePolicies = Objects.requireNonNull(resourcePolicies, "expected parameter 'resourcePolicies' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceImage = Objects.requireNonNull(sourceImage, "expected parameter 'sourceImage' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetInstanceTemplateDisk() {
        this.autoDelete = null;
        this.boot = null;
        this.deviceName = null;
        this.diskEncryptionKeys = List.of();
        this.diskName = null;
        this.diskSizeGb = null;
        this.diskType = null;
        this.interface_ = null;
        this.labels = Map.of();
        this.mode = null;
        this.resourcePolicies = List.of();
        this.source = null;
        this.sourceImage = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private List<GetInstanceTemplateDiskDiskEncryptionKey> diskEncryptionKeys;
        private String diskName;
        private Integer diskSizeGb;
        private String diskType;
        private String interface_;
        private Map<String,String> labels;
        private String mode;
        private List<String> resourcePolicies;
        private String source;
        private String sourceImage;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeys = defaults.diskEncryptionKeys;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.interface_ = defaults.interface_;
    	      this.labels = defaults.labels;
    	      this.mode = defaults.mode;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.source = defaults.source;
    	      this.sourceImage = defaults.sourceImage;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        public Builder boot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder diskEncryptionKeys(List<GetInstanceTemplateDiskDiskEncryptionKey> diskEncryptionKeys) {
            this.diskEncryptionKeys = Objects.requireNonNull(diskEncryptionKeys);
            return this;
        }
        public Builder diskEncryptionKeys(GetInstanceTemplateDiskDiskEncryptionKey... diskEncryptionKeys) {
            return diskEncryptionKeys(List.of(diskEncryptionKeys));
        }
        public Builder diskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }
        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder resourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }
        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder sourceImage(String sourceImage) {
            this.sourceImage = Objects.requireNonNull(sourceImage);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetInstanceTemplateDisk build() {
            return new GetInstanceTemplateDisk(autoDelete, boot, deviceName, diskEncryptionKeys, diskName, diskSizeGb, diskType, interface_, labels, mode, resourcePolicies, source, sourceImage, type);
        }
    }
}
