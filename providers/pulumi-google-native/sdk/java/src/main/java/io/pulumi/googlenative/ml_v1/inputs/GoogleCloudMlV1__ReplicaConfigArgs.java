// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__AcceleratorConfigArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__DiskConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the configuration for a replica in a cluster.
 * 
 */
public final class GoogleCloudMlV1__ReplicaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__ReplicaConfigArgs Empty = new GoogleCloudMlV1__ReplicaConfigArgs();

    /**
     * Represents the type and number of accelerators used by the replica. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu)
     * 
     */
    @Import(name="acceleratorConfig")
      private final @Nullable Output<GoogleCloudMlV1__AcceleratorConfigArgs> acceleratorConfig;

    public Output<GoogleCloudMlV1__AcceleratorConfigArgs> acceleratorConfig() {
        return this.acceleratorConfig == null ? Codegen.empty() : this.acceleratorConfig;
    }

    /**
     * Arguments to the entrypoint command. The following rules apply for container_command and container_args: - If you do not supply command or args: The defaults defined in the Docker image are used. - If you supply a command but no args: The default EntryPoint and the default Cmd defined in the Docker image are ignored. Your command is run without any arguments. - If you supply only args: The default Entrypoint defined in the Docker image is run with the args that you supplied. - If you supply a command and args: The default Entrypoint and the default Cmd defined in the Docker image are ignored. Your command is run with your args. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
     * 
     */
    @Import(name="containerArgs")
      private final @Nullable Output<List<String>> containerArgs;

    public Output<List<String>> containerArgs() {
        return this.containerArgs == null ? Codegen.empty() : this.containerArgs;
    }

    /**
     * The command with which the replica's custom container is run. If provided, it will override default ENTRYPOINT of the docker image. If not provided, the docker image's ENTRYPOINT is used. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
     * 
     */
    @Import(name="containerCommand")
      private final @Nullable Output<List<String>> containerCommand;

    public Output<List<String>> containerCommand() {
        return this.containerCommand == null ? Codegen.empty() : this.containerCommand;
    }

    /**
     * Represents the configuration of disk options.
     * 
     */
    @Import(name="diskConfig")
      private final @Nullable Output<GoogleCloudMlV1__DiskConfigArgs> diskConfig;

    public Output<GoogleCloudMlV1__DiskConfigArgs> diskConfig() {
        return this.diskConfig == null ? Codegen.empty() : this.diskConfig;
    }

    /**
     * The Docker image to run on the replica. This image must be in Container Registry. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    @Import(name="imageUri")
      private final @Nullable Output<String> imageUri;

    public Output<String> imageUri() {
        return this.imageUri == null ? Codegen.empty() : this.imageUri;
    }

    /**
     * The AI Platform runtime version that includes a TensorFlow version matching the one used in the custom container. This field is required if the replica is a TPU worker that uses a custom container. Otherwise, do not specify this field. This must be a [runtime version that currently supports training with TPUs](/ml-engine/docs/tensorflow/runtime-version-list#tpu-support). Note that the version of TensorFlow included in a runtime version may differ from the numbering of the runtime version itself, because it may have a different [patch version](https://www.tensorflow.org/guide/version_compat#semantic_versioning_20). In this field, you must specify the runtime version (TensorFlow minor version). For example, if your custom container runs TensorFlow `1.x.y`, specify `1.x`.
     * 
     */
    @Import(name="tpuTfVersion")
      private final @Nullable Output<String> tpuTfVersion;

    public Output<String> tpuTfVersion() {
        return this.tpuTfVersion == null ? Codegen.empty() : this.tpuTfVersion;
    }

    public GoogleCloudMlV1__ReplicaConfigArgs(
        @Nullable Output<GoogleCloudMlV1__AcceleratorConfigArgs> acceleratorConfig,
        @Nullable Output<List<String>> containerArgs,
        @Nullable Output<List<String>> containerCommand,
        @Nullable Output<GoogleCloudMlV1__DiskConfigArgs> diskConfig,
        @Nullable Output<String> imageUri,
        @Nullable Output<String> tpuTfVersion) {
        this.acceleratorConfig = acceleratorConfig;
        this.containerArgs = containerArgs;
        this.containerCommand = containerCommand;
        this.diskConfig = diskConfig;
        this.imageUri = imageUri;
        this.tpuTfVersion = tpuTfVersion;
    }

    private GoogleCloudMlV1__ReplicaConfigArgs() {
        this.acceleratorConfig = Codegen.empty();
        this.containerArgs = Codegen.empty();
        this.containerCommand = Codegen.empty();
        this.diskConfig = Codegen.empty();
        this.imageUri = Codegen.empty();
        this.tpuTfVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ReplicaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudMlV1__AcceleratorConfigArgs> acceleratorConfig;
        private @Nullable Output<List<String>> containerArgs;
        private @Nullable Output<List<String>> containerCommand;
        private @Nullable Output<GoogleCloudMlV1__DiskConfigArgs> diskConfig;
        private @Nullable Output<String> imageUri;
        private @Nullable Output<String> tpuTfVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ReplicaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerArgs = defaults.containerArgs;
    	      this.containerCommand = defaults.containerCommand;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.tpuTfVersion = defaults.tpuTfVersion;
        }

        public Builder acceleratorConfig(@Nullable Output<GoogleCloudMlV1__AcceleratorConfigArgs> acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }
        public Builder acceleratorConfig(@Nullable GoogleCloudMlV1__AcceleratorConfigArgs acceleratorConfig) {
            this.acceleratorConfig = Codegen.ofNullable(acceleratorConfig);
            return this;
        }
        public Builder containerArgs(@Nullable Output<List<String>> containerArgs) {
            this.containerArgs = containerArgs;
            return this;
        }
        public Builder containerArgs(@Nullable List<String> containerArgs) {
            this.containerArgs = Codegen.ofNullable(containerArgs);
            return this;
        }
        public Builder containerArgs(String... containerArgs) {
            return containerArgs(List.of(containerArgs));
        }
        public Builder containerCommand(@Nullable Output<List<String>> containerCommand) {
            this.containerCommand = containerCommand;
            return this;
        }
        public Builder containerCommand(@Nullable List<String> containerCommand) {
            this.containerCommand = Codegen.ofNullable(containerCommand);
            return this;
        }
        public Builder containerCommand(String... containerCommand) {
            return containerCommand(List.of(containerCommand));
        }
        public Builder diskConfig(@Nullable Output<GoogleCloudMlV1__DiskConfigArgs> diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }
        public Builder diskConfig(@Nullable GoogleCloudMlV1__DiskConfigArgs diskConfig) {
            this.diskConfig = Codegen.ofNullable(diskConfig);
            return this;
        }
        public Builder imageUri(@Nullable Output<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public Builder imageUri(@Nullable String imageUri) {
            this.imageUri = Codegen.ofNullable(imageUri);
            return this;
        }
        public Builder tpuTfVersion(@Nullable Output<String> tpuTfVersion) {
            this.tpuTfVersion = tpuTfVersion;
            return this;
        }
        public Builder tpuTfVersion(@Nullable String tpuTfVersion) {
            this.tpuTfVersion = Codegen.ofNullable(tpuTfVersion);
            return this;
        }        public GoogleCloudMlV1__ReplicaConfigArgs build() {
            return new GoogleCloudMlV1__ReplicaConfigArgs(acceleratorConfig, containerArgs, containerCommand, diskConfig, imageUri, tpuTfVersion);
        }
    }
}
