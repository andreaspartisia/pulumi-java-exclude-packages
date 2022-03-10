// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigWorkerConfigAccelerator;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigWorkerConfigDiskConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterClusterConfigWorkerConfig {
    /**
     * The Compute Engine accelerator configuration for these instances. Can be specified multiple times.
     * 
     */
    private final @Nullable List<ClusterClusterConfigWorkerConfigAccelerator> accelerators;
    /**
     * Disk Config
     * 
     */
    private final @Nullable ClusterClusterConfigWorkerConfigDiskConfig diskConfig;
    /**
     * The URI for the image to use for this worker.  See [the guide](https://cloud.google.com/dataproc/docs/guides/dataproc-images)
     * for more information.
     * 
     */
    private final @Nullable String imageUri;
    private final @Nullable List<String> instanceNames;
    /**
     * The name of a Google Compute Engine machine type
     * to create for the worker nodes. If not specified, GCP will default to a predetermined
     * computed value (currently `n1-standard-4`).
     * 
     */
    private final @Nullable String machineType;
    /**
     * The name of a minimum generation of CPU family
     * for the master. If not specified, GCP will default to a predetermined computed value
     * for each zone. See [the guide](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for details about which CPU families are available (and defaulted) for each zone.
     * 
     */
    private final @Nullable String minCpuPlatform;
    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
     */
    private final @Nullable Integer numInstances;

    @OutputCustomType.Constructor
    private ClusterClusterConfigWorkerConfig(
        @OutputCustomType.Parameter("accelerators") @Nullable List<ClusterClusterConfigWorkerConfigAccelerator> accelerators,
        @OutputCustomType.Parameter("diskConfig") @Nullable ClusterClusterConfigWorkerConfigDiskConfig diskConfig,
        @OutputCustomType.Parameter("imageUri") @Nullable String imageUri,
        @OutputCustomType.Parameter("instanceNames") @Nullable List<String> instanceNames,
        @OutputCustomType.Parameter("machineType") @Nullable String machineType,
        @OutputCustomType.Parameter("minCpuPlatform") @Nullable String minCpuPlatform,
        @OutputCustomType.Parameter("numInstances") @Nullable Integer numInstances) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.imageUri = imageUri;
        this.instanceNames = instanceNames;
        this.machineType = machineType;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
    }

    /**
     * The Compute Engine accelerator configuration for these instances. Can be specified multiple times.
     * 
    */
    public List<ClusterClusterConfigWorkerConfigAccelerator> getAccelerators() {
        return this.accelerators == null ? List.of() : this.accelerators;
    }
    /**
     * Disk Config
     * 
    */
    public Optional<ClusterClusterConfigWorkerConfigDiskConfig> getDiskConfig() {
        return Optional.ofNullable(this.diskConfig);
    }
    /**
     * The URI for the image to use for this worker.  See [the guide](https://cloud.google.com/dataproc/docs/guides/dataproc-images)
     * for more information.
     * 
    */
    public Optional<String> getImageUri() {
        return Optional.ofNullable(this.imageUri);
    }
    public List<String> getInstanceNames() {
        return this.instanceNames == null ? List.of() : this.instanceNames;
    }
    /**
     * The name of a Google Compute Engine machine type
     * to create for the worker nodes. If not specified, GCP will default to a predetermined
     * computed value (currently `n1-standard-4`).
     * 
    */
    public Optional<String> getMachineType() {
        return Optional.ofNullable(this.machineType);
    }
    /**
     * The name of a minimum generation of CPU family
     * for the master. If not specified, GCP will default to a predetermined computed value
     * for each zone. See [the guide](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for details about which CPU families are available (and defaulted) for each zone.
     * 
    */
    public Optional<String> getMinCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }
    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
    */
    public Optional<Integer> getNumInstances() {
        return Optional.ofNullable(this.numInstances);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigWorkerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClusterClusterConfigWorkerConfigAccelerator> accelerators;
        private @Nullable ClusterClusterConfigWorkerConfigDiskConfig diskConfig;
        private @Nullable String imageUri;
        private @Nullable List<String> instanceNames;
        private @Nullable String machineType;
        private @Nullable String minCpuPlatform;
        private @Nullable Integer numInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigWorkerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.instanceNames = defaults.instanceNames;
    	      this.machineType = defaults.machineType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
        }

        public Builder setAccelerators(@Nullable List<ClusterClusterConfigWorkerConfigAccelerator> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        public Builder setDiskConfig(@Nullable ClusterClusterConfigWorkerConfigDiskConfig diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }

        public Builder setImageUri(@Nullable String imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        public Builder setInstanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder setNumInstances(@Nullable Integer numInstances) {
            this.numInstances = numInstances;
            return this;
        }
        public ClusterClusterConfigWorkerConfig build() {
            return new ClusterClusterConfigWorkerConfig(accelerators, diskConfig, imageUri, instanceNames, machineType, minCpuPlatform, numInstances);
        }
    }
}
