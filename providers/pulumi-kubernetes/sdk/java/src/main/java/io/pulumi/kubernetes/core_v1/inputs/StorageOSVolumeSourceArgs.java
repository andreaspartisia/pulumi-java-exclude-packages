// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a StorageOS persistent volume resource.
 * 
 */
public final class StorageOSVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageOSVolumeSourceArgs Empty = new StorageOSVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    /**
     * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
     * 
     */
    @InputImport(name="secretRef")
    private final @Nullable Input<LocalObjectReferenceArgs> secretRef;

    public Input<LocalObjectReferenceArgs> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    /**
     * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    @InputImport(name="volumeName")
    private final @Nullable Input<String> volumeName;

    public Input<String> getVolumeName() {
        return this.volumeName == null ? Input.empty() : this.volumeName;
    }

    /**
     * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    @InputImport(name="volumeNamespace")
    private final @Nullable Input<String> volumeNamespace;

    public Input<String> getVolumeNamespace() {
        return this.volumeNamespace == null ? Input.empty() : this.volumeNamespace;
    }

    public StorageOSVolumeSourceArgs(
        @Nullable Input<String> fsType,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<LocalObjectReferenceArgs> secretRef,
        @Nullable Input<String> volumeName,
        @Nullable Input<String> volumeNamespace) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeName = volumeName;
        this.volumeNamespace = volumeNamespace;
    }

    private StorageOSVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.readOnly = Input.empty();
        this.secretRef = Input.empty();
        this.volumeName = Input.empty();
        this.volumeNamespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageOSVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<LocalObjectReferenceArgs> secretRef;
        private @Nullable Input<String> volumeName;
        private @Nullable Input<String> volumeNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageOSVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeName = defaults.volumeName;
    	      this.volumeNamespace = defaults.volumeNamespace;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setSecretRef(@Nullable Input<LocalObjectReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setSecretRef(@Nullable LocalObjectReferenceArgs secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public Builder setVolumeName(@Nullable Input<String> volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = Input.ofNullable(volumeName);
            return this;
        }

        public Builder setVolumeNamespace(@Nullable Input<String> volumeNamespace) {
            this.volumeNamespace = volumeNamespace;
            return this;
        }

        public Builder setVolumeNamespace(@Nullable String volumeNamespace) {
            this.volumeNamespace = Input.ofNullable(volumeNamespace);
            return this;
        }

        public StorageOSVolumeSourceArgs build() {
            return new StorageOSVolumeSourceArgs(fsType, readOnly, secretRef, volumeName, volumeNamespace);
        }
    }
}