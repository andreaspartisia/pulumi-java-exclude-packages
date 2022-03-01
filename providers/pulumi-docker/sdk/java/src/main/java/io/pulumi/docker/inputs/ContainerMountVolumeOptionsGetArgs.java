// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.docker.inputs.ContainerMountVolumeOptionsLabelGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerMountVolumeOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerMountVolumeOptionsGetArgs Empty = new ContainerMountVolumeOptionsGetArgs();

    @InputImport(name="driverName")
      private final @Nullable Input<String> driverName;

    public Input<String> getDriverName() {
        return this.driverName == null ? Input.empty() : this.driverName;
    }

    @InputImport(name="driverOptions")
      private final @Nullable Input<Map<String,String>> driverOptions;

    public Input<Map<String,String>> getDriverOptions() {
        return this.driverOptions == null ? Input.empty() : this.driverOptions;
    }

    @InputImport(name="labels")
      private final @Nullable Input<List<ContainerMountVolumeOptionsLabelGetArgs>> labels;

    public Input<List<ContainerMountVolumeOptionsLabelGetArgs>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="noCopy")
      private final @Nullable Input<Boolean> noCopy;

    public Input<Boolean> getNoCopy() {
        return this.noCopy == null ? Input.empty() : this.noCopy;
    }

    public ContainerMountVolumeOptionsGetArgs(
        @Nullable Input<String> driverName,
        @Nullable Input<Map<String,String>> driverOptions,
        @Nullable Input<List<ContainerMountVolumeOptionsLabelGetArgs>> labels,
        @Nullable Input<Boolean> noCopy) {
        this.driverName = driverName;
        this.driverOptions = driverOptions;
        this.labels = labels;
        this.noCopy = noCopy;
    }

    private ContainerMountVolumeOptionsGetArgs() {
        this.driverName = Input.empty();
        this.driverOptions = Input.empty();
        this.labels = Input.empty();
        this.noCopy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerMountVolumeOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> driverName;
        private @Nullable Input<Map<String,String>> driverOptions;
        private @Nullable Input<List<ContainerMountVolumeOptionsLabelGetArgs>> labels;
        private @Nullable Input<Boolean> noCopy;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerMountVolumeOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverName = defaults.driverName;
    	      this.driverOptions = defaults.driverOptions;
    	      this.labels = defaults.labels;
    	      this.noCopy = defaults.noCopy;
        }

        public Builder setDriverName(@Nullable Input<String> driverName) {
            this.driverName = driverName;
            return this;
        }

        public Builder setDriverName(@Nullable String driverName) {
            this.driverName = Input.ofNullable(driverName);
            return this;
        }

        public Builder setDriverOptions(@Nullable Input<Map<String,String>> driverOptions) {
            this.driverOptions = driverOptions;
            return this;
        }

        public Builder setDriverOptions(@Nullable Map<String,String> driverOptions) {
            this.driverOptions = Input.ofNullable(driverOptions);
            return this;
        }

        public Builder setLabels(@Nullable Input<List<ContainerMountVolumeOptionsLabelGetArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable List<ContainerMountVolumeOptionsLabelGetArgs> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setNoCopy(@Nullable Input<Boolean> noCopy) {
            this.noCopy = noCopy;
            return this;
        }

        public Builder setNoCopy(@Nullable Boolean noCopy) {
            this.noCopy = Input.ofNullable(noCopy);
            return this;
        }
        public ContainerMountVolumeOptionsGetArgs build() {
            return new ContainerMountVolumeOptionsGetArgs(driverName, driverOptions, labels, noCopy);
        }
    }
}
