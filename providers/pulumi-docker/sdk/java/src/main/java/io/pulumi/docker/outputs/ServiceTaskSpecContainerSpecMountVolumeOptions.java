// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecMountVolumeOptionsLabel;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTaskSpecContainerSpecMountVolumeOptions {
    private final @Nullable String driverName;
    private final @Nullable Map<String,String> driverOptions;
    private final @Nullable List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabel> labels;
    private final @Nullable Boolean noCopy;

    @OutputCustomType.Constructor({"driverName","driverOptions","labels","noCopy"})
    private ServiceTaskSpecContainerSpecMountVolumeOptions(
        @Nullable String driverName,
        @Nullable Map<String,String> driverOptions,
        @Nullable List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabel> labels,
        @Nullable Boolean noCopy) {
        this.driverName = driverName;
        this.driverOptions = driverOptions;
        this.labels = labels;
        this.noCopy = noCopy;
    }

    public Optional<String> getDriverName() {
        return Optional.ofNullable(this.driverName);
    }
    public Map<String,String> getDriverOptions() {
        return this.driverOptions == null ? Map.of() : this.driverOptions;
    }
    public List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabel> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    public Optional<Boolean> getNoCopy() {
        return Optional.ofNullable(this.noCopy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecMountVolumeOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String driverName;
        private @Nullable Map<String,String> driverOptions;
        private @Nullable List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabel> labels;
        private @Nullable Boolean noCopy;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecMountVolumeOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverName = defaults.driverName;
    	      this.driverOptions = defaults.driverOptions;
    	      this.labels = defaults.labels;
    	      this.noCopy = defaults.noCopy;
        }

        public Builder setDriverName(@Nullable String driverName) {
            this.driverName = driverName;
            return this;
        }

        public Builder setDriverOptions(@Nullable Map<String,String> driverOptions) {
            this.driverOptions = driverOptions;
            return this;
        }

        public Builder setLabels(@Nullable List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabel> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setNoCopy(@Nullable Boolean noCopy) {
            this.noCopy = noCopy;
            return this;
        }
        public ServiceTaskSpecContainerSpecMountVolumeOptions build() {
            return new ServiceTaskSpecContainerSpecMountVolumeOptions(driverName, driverOptions, labels, noCopy);
        }
    }
}
