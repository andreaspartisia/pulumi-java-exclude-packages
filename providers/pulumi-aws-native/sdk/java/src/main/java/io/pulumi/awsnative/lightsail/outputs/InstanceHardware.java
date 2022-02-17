// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.awsnative.lightsail.outputs.InstanceDisk;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceHardware {
    /**
     * CPU count of the Instance.
     * 
     */
    private final @Nullable Integer cpuCount;
    /**
     * Disks attached to the Instance.
     * 
     */
    private final @Nullable List<InstanceDisk> disks;
    /**
     * RAM Size of the Instance.
     * 
     */
    private final @Nullable Integer ramSizeInGb;

    @OutputCustomType.Constructor({"cpuCount","disks","ramSizeInGb"})
    private InstanceHardware(
        @Nullable Integer cpuCount,
        @Nullable List<InstanceDisk> disks,
        @Nullable Integer ramSizeInGb) {
        this.cpuCount = cpuCount;
        this.disks = disks;
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * CPU count of the Instance.
     * 
     */
    public Optional<Integer> getCpuCount() {
        return Optional.ofNullable(this.cpuCount);
    }
    /**
     * Disks attached to the Instance.
     * 
     */
    public List<InstanceDisk> getDisks() {
        return this.disks == null ? List.of() : this.disks;
    }
    /**
     * RAM Size of the Instance.
     * 
     */
    public Optional<Integer> getRamSizeInGb() {
        return Optional.ofNullable(this.ramSizeInGb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceHardware defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cpuCount;
        private @Nullable List<InstanceDisk> disks;
        private @Nullable Integer ramSizeInGb;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceHardware defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
    	      this.disks = defaults.disks;
    	      this.ramSizeInGb = defaults.ramSizeInGb;
        }

        public Builder setCpuCount(@Nullable Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        public Builder setDisks(@Nullable List<InstanceDisk> disks) {
            this.disks = disks;
            return this;
        }

        public Builder setRamSizeInGb(@Nullable Integer ramSizeInGb) {
            this.ramSizeInGb = ramSizeInGb;
            return this;
        }

        public InstanceHardware build() {
            return new InstanceHardware(cpuCount, disks, ramSizeInGb);
        }
    }
}