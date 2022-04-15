// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecMountVolumeOptionsLabelGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecMountVolumeOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecMountVolumeOptionsGetArgs Empty = new ServiceTaskSpecContainerSpecMountVolumeOptionsGetArgs();

    @Import(name="driverName")
      private final @Nullable Output<String> driverName;

    public Output<String> driverName() {
        return this.driverName == null ? Codegen.empty() : this.driverName;
    }

    @Import(name="driverOptions")
      private final @Nullable Output<Map<String,String>> driverOptions;

    public Output<Map<String,String>> driverOptions() {
        return this.driverOptions == null ? Codegen.empty() : this.driverOptions;
    }

    @Import(name="labels")
      private final @Nullable Output<List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabelGetArgs>> labels;

    public Output<List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabelGetArgs>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="noCopy")
      private final @Nullable Output<Boolean> noCopy;

    public Output<Boolean> noCopy() {
        return this.noCopy == null ? Codegen.empty() : this.noCopy;
    }

    public ServiceTaskSpecContainerSpecMountVolumeOptionsGetArgs(
        @Nullable Output<String> driverName,
        @Nullable Output<Map<String,String>> driverOptions,
        @Nullable Output<List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabelGetArgs>> labels,
        @Nullable Output<Boolean> noCopy) {
        this.driverName = driverName;
        this.driverOptions = driverOptions;
        this.labels = labels;
        this.noCopy = noCopy;
    }

    private ServiceTaskSpecContainerSpecMountVolumeOptionsGetArgs() {
        this.driverName = Codegen.empty();
        this.driverOptions = Codegen.empty();
        this.labels = Codegen.empty();
        this.noCopy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecMountVolumeOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> driverName;
        private @Nullable Output<Map<String,String>> driverOptions;
        private @Nullable Output<List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabelGetArgs>> labels;
        private @Nullable Output<Boolean> noCopy;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecMountVolumeOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverName = defaults.driverName;
    	      this.driverOptions = defaults.driverOptions;
    	      this.labels = defaults.labels;
    	      this.noCopy = defaults.noCopy;
        }

        public Builder driverName(@Nullable Output<String> driverName) {
            this.driverName = driverName;
            return this;
        }
        public Builder driverName(@Nullable String driverName) {
            this.driverName = Codegen.ofNullable(driverName);
            return this;
        }
        public Builder driverOptions(@Nullable Output<Map<String,String>> driverOptions) {
            this.driverOptions = driverOptions;
            return this;
        }
        public Builder driverOptions(@Nullable Map<String,String> driverOptions) {
            this.driverOptions = Codegen.ofNullable(driverOptions);
            return this;
        }
        public Builder labels(@Nullable Output<List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabelGetArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabelGetArgs> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder labels(ServiceTaskSpecContainerSpecMountVolumeOptionsLabelGetArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder noCopy(@Nullable Output<Boolean> noCopy) {
            this.noCopy = noCopy;
            return this;
        }
        public Builder noCopy(@Nullable Boolean noCopy) {
            this.noCopy = Codegen.ofNullable(noCopy);
            return this;
        }        public ServiceTaskSpecContainerSpecMountVolumeOptionsGetArgs build() {
            return new ServiceTaskSpecContainerSpecMountVolumeOptionsGetArgs(driverName, driverOptions, labels, noCopy);
        }
    }
}
