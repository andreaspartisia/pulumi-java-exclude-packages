// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs Empty = new AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs();

    /**
     * Specifies the size of the disk in base-2 GB.
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<String> diskSizeGb;

    public Output<String> diskSizeGb() {
        return this.diskSizeGb == null ? Codegen.empty() : this.diskSizeGb;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    @Import(name="interface")
      private final @Nullable Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> interface_;

    public Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> interface_() {
        return this.interface_ == null ? Codegen.empty() : this.interface_;
    }

    public AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs(
        @Nullable Output<String> diskSizeGb,
        @Nullable Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> interface_) {
        this.diskSizeGb = diskSizeGb;
        this.interface_ = interface_;
    }

    private AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs() {
        this.diskSizeGb = Codegen.empty();
        this.interface_ = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskSizeGb;
        private @Nullable Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> interface_;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.interface_ = defaults.interface_;
        }

        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable String diskSizeGb) {
            this.diskSizeGb = Codegen.ofNullable(diskSizeGb);
            return this;
        }
        public Builder interface_(@Nullable Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> interface_) {
            this.interface_ = interface_;
            return this;
        }
        public Builder interface_(@Nullable AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface interface_) {
            this.interface_ = Codegen.ofNullable(interface_);
            return this;
        }        public AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs build() {
            return new AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs(diskSizeGb, interface_);
        }
    }
}
