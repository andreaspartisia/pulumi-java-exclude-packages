// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.notebooks_v1.enums.LocalDiskInitializeParamsDiskType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new runtime. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
 * 
 */
public final class LocalDiskInitializeParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalDiskInitializeParamsArgs Empty = new LocalDiskInitializeParamsArgs();

    /**
     * Optional. Provide this property when creating the disk.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated.
     * 
     */
    @Import(name="diskName")
      private final @Nullable Output<String> diskName;

    public Output<String> diskName() {
        return this.diskName == null ? Codegen.empty() : this.diskName;
    }

    /**
     * Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB.
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<String> diskSizeGb;

    public Output<String> diskSizeGb() {
        return this.diskSizeGb == null ? Codegen.empty() : this.diskSizeGb;
    }

    /**
     * Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    @Import(name="diskType")
      private final @Nullable Output<LocalDiskInitializeParamsDiskType> diskType;

    public Output<LocalDiskInitializeParamsDiskType> diskType() {
        return this.diskType == null ? Codegen.empty() : this.diskType;
    }

    /**
     * Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    public LocalDiskInitializeParamsArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> diskName,
        @Nullable Output<String> diskSizeGb,
        @Nullable Output<LocalDiskInitializeParamsDiskType> diskType,
        @Nullable Output<Map<String,String>> labels) {
        this.description = description;
        this.diskName = diskName;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.labels = labels;
    }

    private LocalDiskInitializeParamsArgs() {
        this.description = Codegen.empty();
        this.diskName = Codegen.empty();
        this.diskSizeGb = Codegen.empty();
        this.diskType = Codegen.empty();
        this.labels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalDiskInitializeParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> diskName;
        private @Nullable Output<String> diskSizeGb;
        private @Nullable Output<LocalDiskInitializeParamsDiskType> diskType;
        private @Nullable Output<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalDiskInitializeParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder diskName(@Nullable Output<String> diskName) {
            this.diskName = diskName;
            return this;
        }
        public Builder diskName(@Nullable String diskName) {
            this.diskName = Codegen.ofNullable(diskName);
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
        public Builder diskType(@Nullable Output<LocalDiskInitializeParamsDiskType> diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder diskType(@Nullable LocalDiskInitializeParamsDiskType diskType) {
            this.diskType = Codegen.ofNullable(diskType);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }        public LocalDiskInitializeParamsArgs build() {
            return new LocalDiskInitializeParamsArgs(description, diskName, diskSizeGb, diskType, labels);
        }
    }
}
