// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetManagedDiskParametersResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineScaleSetDataDiskResponse {
    private final @Nullable String caching;
    private final String createOption;
    private final @Nullable Double diskIOPSReadWrite;
    private final @Nullable Double diskMBpsReadWrite;
    private final @Nullable Integer diskSizeGB;
    private final Integer lun;
    private final @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;
    private final @Nullable String name;
    private final @Nullable Boolean writeAcceleratorEnabled;

    @OutputCustomType.Constructor({"caching","createOption","diskIOPSReadWrite","diskMBpsReadWrite","diskSizeGB","lun","managedDisk","name","writeAcceleratorEnabled"})
    private VirtualMachineScaleSetDataDiskResponse(
        @Nullable String caching,
        String createOption,
        @Nullable Double diskIOPSReadWrite,
        @Nullable Double diskMBpsReadWrite,
        @Nullable Integer diskSizeGB,
        Integer lun,
        @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk,
        @Nullable String name,
        @Nullable Boolean writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = Objects.requireNonNull(createOption);
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        this.diskSizeGB = diskSizeGB;
        this.lun = Objects.requireNonNull(lun);
        this.managedDisk = managedDisk;
        this.name = name;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    public Optional<String> getCaching() {
        return Optional.ofNullable(this.caching);
    }
    public String getCreateOption() {
        return this.createOption;
    }
    public Optional<Double> getDiskIOPSReadWrite() {
        return Optional.ofNullable(this.diskIOPSReadWrite);
    }
    public Optional<Double> getDiskMBpsReadWrite() {
        return Optional.ofNullable(this.diskMBpsReadWrite);
    }
    public Optional<Integer> getDiskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    public Integer getLun() {
        return this.lun;
    }
    public Optional<VirtualMachineScaleSetManagedDiskParametersResponse> getManagedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Boolean> getWriteAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetDataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private String createOption;
        private @Nullable Double diskIOPSReadWrite;
        private @Nullable Double diskMBpsReadWrite;
        private @Nullable Integer diskSizeGB;
        private Integer lun;
        private @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;
        private @Nullable String name;
        private @Nullable Boolean writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetDataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.diskIOPSReadWrite = defaults.diskIOPSReadWrite;
    	      this.diskMBpsReadWrite = defaults.diskMBpsReadWrite;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder setCaching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }

        public Builder setCreateOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }

        public Builder setDiskIOPSReadWrite(@Nullable Double diskIOPSReadWrite) {
            this.diskIOPSReadWrite = diskIOPSReadWrite;
            return this;
        }

        public Builder setDiskMBpsReadWrite(@Nullable Double diskMBpsReadWrite) {
            this.diskMBpsReadWrite = diskMBpsReadWrite;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setManagedDisk(@Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setWriteAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        public VirtualMachineScaleSetDataDiskResponse build() {
            return new VirtualMachineScaleSetDataDiskResponse(caching, createOption, diskIOPSReadWrite, diskMBpsReadWrite, diskSizeGB, lun, managedDisk, name, writeAcceleratorEnabled);
        }
    }
}