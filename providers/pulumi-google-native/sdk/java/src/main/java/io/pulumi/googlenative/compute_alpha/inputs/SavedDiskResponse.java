// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An instance-attached disk resource.
 * 
 */
public final class SavedDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final SavedDiskResponse Empty = new SavedDiskResponse();

    /**
     * Type of the resource. Always compute#savedDisk for attached disks.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
     */
    @Import(name="sourceDisk", required=true)
      private final String sourceDisk;

    public String sourceDisk() {
        return this.sourceDisk;
    }

    /**
     * Size of the individual disk snapshot used by this machine image.
     * 
     */
    @Import(name="storageBytes", required=true)
      private final String storageBytes;

    public String storageBytes() {
        return this.storageBytes;
    }

    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    @Import(name="storageBytesStatus", required=true)
      private final String storageBytesStatus;

    public String storageBytesStatus() {
        return this.storageBytesStatus;
    }

    public SavedDiskResponse(
        String kind,
        String sourceDisk,
        String storageBytes,
        String storageBytesStatus) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.sourceDisk = Objects.requireNonNull(sourceDisk, "expected parameter 'sourceDisk' to be non-null");
        this.storageBytes = Objects.requireNonNull(storageBytes, "expected parameter 'storageBytes' to be non-null");
        this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus, "expected parameter 'storageBytesStatus' to be non-null");
    }

    private SavedDiskResponse() {
        this.kind = null;
        this.sourceDisk = null;
        this.storageBytes = null;
        this.storageBytesStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String sourceDisk;
        private String storageBytes;
        private String storageBytesStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.storageBytes = defaults.storageBytes;
    	      this.storageBytesStatus = defaults.storageBytesStatus;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder sourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public Builder storageBytes(String storageBytes) {
            this.storageBytes = Objects.requireNonNull(storageBytes);
            return this;
        }
        public Builder storageBytesStatus(String storageBytesStatus) {
            this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus);
            return this;
        }        public SavedDiskResponse build() {
            return new SavedDiskResponse(kind, sourceDisk, storageBytes, storageBytesStatus);
        }
    }
}
