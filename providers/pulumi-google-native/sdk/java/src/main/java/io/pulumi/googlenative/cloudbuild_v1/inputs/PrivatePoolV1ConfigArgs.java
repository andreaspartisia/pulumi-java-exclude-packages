// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudbuild_v1.inputs.NetworkConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.WorkerConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a V1 `PrivatePool`.
 * 
 */
public final class PrivatePoolV1ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivatePoolV1ConfigArgs Empty = new PrivatePoolV1ConfigArgs();

    /**
     * Network configuration for the pool.
     * 
     */
    @Import(name="networkConfig")
      private final @Nullable Output<NetworkConfigArgs> networkConfig;

    public Output<NetworkConfigArgs> networkConfig() {
        return this.networkConfig == null ? Codegen.empty() : this.networkConfig;
    }

    /**
     * Machine configuration for the workers in the pool.
     * 
     */
    @Import(name="workerConfig")
      private final @Nullable Output<WorkerConfigArgs> workerConfig;

    public Output<WorkerConfigArgs> workerConfig() {
        return this.workerConfig == null ? Codegen.empty() : this.workerConfig;
    }

    public PrivatePoolV1ConfigArgs(
        @Nullable Output<NetworkConfigArgs> networkConfig,
        @Nullable Output<WorkerConfigArgs> workerConfig) {
        this.networkConfig = networkConfig;
        this.workerConfig = workerConfig;
    }

    private PrivatePoolV1ConfigArgs() {
        this.networkConfig = Codegen.empty();
        this.workerConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivatePoolV1ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NetworkConfigArgs> networkConfig;
        private @Nullable Output<WorkerConfigArgs> workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivatePoolV1ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkConfig = defaults.networkConfig;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder networkConfig(@Nullable Output<NetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public Builder networkConfig(@Nullable NetworkConfigArgs networkConfig) {
            this.networkConfig = Codegen.ofNullable(networkConfig);
            return this;
        }
        public Builder workerConfig(@Nullable Output<WorkerConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }
        public Builder workerConfig(@Nullable WorkerConfigArgs workerConfig) {
            this.workerConfig = Codegen.ofNullable(workerConfig);
            return this;
        }        public PrivatePoolV1ConfigArgs build() {
            return new PrivatePoolV1ConfigArgs(networkConfig, workerConfig);
        }
    }
}
