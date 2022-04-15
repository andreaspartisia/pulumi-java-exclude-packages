// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.container_v1.inputs.AcceleratorConfigArgs;
import io.pulumi.googlenative.container_v1.inputs.AdvancedMachineFeaturesArgs;
import io.pulumi.googlenative.container_v1.inputs.GcfsConfigArgs;
import io.pulumi.googlenative.container_v1.inputs.LinuxNodeConfigArgs;
import io.pulumi.googlenative.container_v1.inputs.NodeKubeletConfigArgs;
import io.pulumi.googlenative.container_v1.inputs.NodeTaintArgs;
import io.pulumi.googlenative.container_v1.inputs.ReservationAffinityArgs;
import io.pulumi.googlenative.container_v1.inputs.SandboxConfigArgs;
import io.pulumi.googlenative.container_v1.inputs.ShieldedInstanceConfigArgs;
import io.pulumi.googlenative.container_v1.inputs.VirtualNICArgs;
import io.pulumi.googlenative.container_v1.inputs.WorkloadMetadataConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters that describe the nodes in a cluster.
 * 
 */
public final class NodeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeConfigArgs Empty = new NodeConfigArgs();

    /**
     * A list of hardware accelerators to be attached to each node. See https://cloud.google.com/compute/docs/gpus for more information about support for GPUs.
     * 
     */
    @Import(name="accelerators")
      private final @Nullable Output<List<AcceleratorConfigArgs>> accelerators;

    public Output<List<AcceleratorConfigArgs>> accelerators() {
        return this.accelerators == null ? Codegen.empty() : this.accelerators;
    }

    /**
     * Advanced features for the Compute Engine VM.
     * 
     */
    @Import(name="advancedMachineFeatures")
      private final @Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures;

    public Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures() {
        return this.advancedMachineFeatures == null ? Codegen.empty() : this.advancedMachineFeatures;
    }

    /**
     *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
     */
    @Import(name="bootDiskKmsKey")
      private final @Nullable Output<String> bootDiskKmsKey;

    public Output<String> bootDiskKmsKey() {
        return this.bootDiskKmsKey == null ? Codegen.empty() : this.bootDiskKmsKey;
    }

    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<Integer> diskSizeGb;

    public Output<Integer> diskSizeGb() {
        return this.diskSizeGb == null ? Codegen.empty() : this.diskSizeGb;
    }

    /**
     * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard'
     * 
     */
    @Import(name="diskType")
      private final @Nullable Output<String> diskType;

    public Output<String> diskType() {
        return this.diskType == null ? Codegen.empty() : this.diskType;
    }

    /**
     * Google Container File System (image streaming) configs.
     * 
     */
    @Import(name="gcfsConfig")
      private final @Nullable Output<GcfsConfigArgs> gcfsConfig;

    public Output<GcfsConfigArgs> gcfsConfig() {
        return this.gcfsConfig == null ? Codegen.empty() : this.gcfsConfig;
    }

    /**
     * Enable or disable gvnic in the node pool.
     * 
     */
    @Import(name="gvnic")
      private final @Nullable Output<VirtualNICArgs> gvnic;

    public Output<VirtualNICArgs> gvnic() {
        return this.gvnic == null ? Codegen.empty() : this.gvnic;
    }

    /**
     * The image type to use for this node. Note that for a given image type, the latest version of it will be used.
     * 
     */
    @Import(name="imageType")
      private final @Nullable Output<String> imageType;

    public Output<String> imageType() {
        return this.imageType == null ? Codegen.empty() : this.imageType;
    }

    /**
     * Node kubelet configs.
     * 
     */
    @Import(name="kubeletConfig")
      private final @Nullable Output<NodeKubeletConfigArgs> kubeletConfig;

    public Output<NodeKubeletConfigArgs> kubeletConfig() {
        return this.kubeletConfig == null ? Codegen.empty() : this.kubeletConfig;
    }

    /**
     * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in addition to any default label(s) that Kubernetes may apply to the node. In case of conflict in label keys, the applied set may differ depending on the Kubernetes version -- it's best to assume the behavior is undefined and conflicts should be avoided. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Parameters that can be configured on Linux nodes.
     * 
     */
    @Import(name="linuxNodeConfig")
      private final @Nullable Output<LinuxNodeConfigArgs> linuxNodeConfig;

    public Output<LinuxNodeConfigArgs> linuxNodeConfig() {
        return this.linuxNodeConfig == null ? Codegen.empty() : this.linuxNodeConfig;
    }

    /**
     * The number of local SSD disks to be attached to the node. The limit for this value is dependent upon the maximum number of disks available on a machine per zone. See: https://cloud.google.com/compute/docs/disks/local-ssd for more information.
     * 
     */
    @Import(name="localSsdCount")
      private final @Nullable Output<Integer> localSsdCount;

    public Output<Integer> localSsdCount() {
        return this.localSsdCount == null ? Codegen.empty() : this.localSsdCount;
    }

    /**
     * The name of a Google Compute Engine [machine type](https://cloud.google.com/compute/docs/machine-types) If unspecified, the default machine type is `e2-medium`.
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType == null ? Codegen.empty() : this.machineType;
    }

    /**
     * The metadata key/value pairs assigned to instances in the cluster. Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes in length. These are reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project or be one of the reserved keys: - "cluster-location" - "cluster-name" - "cluster-uid" - "configure-sh" - "containerd-configure-sh" - "enable-os-login" - "gci-ensure-gke-docker" - "gci-metrics-enabled" - "gci-update-strategy" - "instance-template" - "kube-env" - "startup-script" - "user-data" - "disable-address-manager" - "windows-startup-script-ps1" - "common-psm1" - "k8s-node-setup-psm1" - "install-ssh-psm1" - "user-profile-psm1" Values are free-form strings, and only have meaning as interpreted by the image running in the instance. The only restriction placed on them is that each value's size must be less than or equal to 32 KB. The total size of all keys and values must be less than 512 KB.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> minCpuPlatform() {
        return this.minCpuPlatform == null ? Codegen.empty() : this.minCpuPlatform;
    }

    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
     */
    @Import(name="nodeGroup")
      private final @Nullable Output<String> nodeGroup;

    public Output<String> nodeGroup() {
        return this.nodeGroup == null ? Codegen.empty() : this.nodeGroup;
    }

    /**
     * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
     * 
     */
    @Import(name="oauthScopes")
      private final @Nullable Output<List<String>> oauthScopes;

    public Output<List<String>> oauthScopes() {
        return this.oauthScopes == null ? Codegen.empty() : this.oauthScopes;
    }

    /**
     * Whether the nodes are created as preemptible VM instances. See: https://cloud.google.com/compute/docs/instances/preemptible for more information about preemptible VM instances.
     * 
     */
    @Import(name="preemptible")
      private final @Nullable Output<Boolean> preemptible;

    public Output<Boolean> preemptible() {
        return this.preemptible == null ? Codegen.empty() : this.preemptible;
    }

    /**
     * The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this node pool.
     * 
     */
    @Import(name="reservationAffinity")
      private final @Nullable Output<ReservationAffinityArgs> reservationAffinity;

    public Output<ReservationAffinityArgs> reservationAffinity() {
        return this.reservationAffinity == null ? Codegen.empty() : this.reservationAffinity;
    }

    /**
     * Sandbox configuration for this node.
     * 
     */
    @Import(name="sandboxConfig")
      private final @Nullable Output<SandboxConfigArgs> sandboxConfig;

    public Output<SandboxConfigArgs> sandboxConfig() {
        return this.sandboxConfig == null ? Codegen.empty() : this.sandboxConfig;
    }

    /**
     * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default" service account is used.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Shielded Instance options.
     * 
     */
    @Import(name="shieldedInstanceConfig")
      private final @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Codegen.empty() : this.shieldedInstanceConfig;
    }

    /**
     * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster or node pool creation. Each tag within the list must comply with RFC1035.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * List of kubernetes taints to be applied to each node. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
     * 
     */
    @Import(name="taints")
      private final @Nullable Output<List<NodeTaintArgs>> taints;

    public Output<List<NodeTaintArgs>> taints() {
        return this.taints == null ? Codegen.empty() : this.taints;
    }

    /**
     * The workload metadata configuration for this node.
     * 
     */
    @Import(name="workloadMetadataConfig")
      private final @Nullable Output<WorkloadMetadataConfigArgs> workloadMetadataConfig;

    public Output<WorkloadMetadataConfigArgs> workloadMetadataConfig() {
        return this.workloadMetadataConfig == null ? Codegen.empty() : this.workloadMetadataConfig;
    }

    public NodeConfigArgs(
        @Nullable Output<List<AcceleratorConfigArgs>> accelerators,
        @Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures,
        @Nullable Output<String> bootDiskKmsKey,
        @Nullable Output<Integer> diskSizeGb,
        @Nullable Output<String> diskType,
        @Nullable Output<GcfsConfigArgs> gcfsConfig,
        @Nullable Output<VirtualNICArgs> gvnic,
        @Nullable Output<String> imageType,
        @Nullable Output<NodeKubeletConfigArgs> kubeletConfig,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<LinuxNodeConfigArgs> linuxNodeConfig,
        @Nullable Output<Integer> localSsdCount,
        @Nullable Output<String> machineType,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<String> nodeGroup,
        @Nullable Output<List<String>> oauthScopes,
        @Nullable Output<Boolean> preemptible,
        @Nullable Output<ReservationAffinityArgs> reservationAffinity,
        @Nullable Output<SandboxConfigArgs> sandboxConfig,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Output<List<String>> tags,
        @Nullable Output<List<NodeTaintArgs>> taints,
        @Nullable Output<WorkloadMetadataConfigArgs> workloadMetadataConfig) {
        this.accelerators = accelerators;
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.bootDiskKmsKey = bootDiskKmsKey;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.gcfsConfig = gcfsConfig;
        this.gvnic = gvnic;
        this.imageType = imageType;
        this.kubeletConfig = kubeletConfig;
        this.labels = labels;
        this.linuxNodeConfig = linuxNodeConfig;
        this.localSsdCount = localSsdCount;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.nodeGroup = nodeGroup;
        this.oauthScopes = oauthScopes;
        this.preemptible = preemptible;
        this.reservationAffinity = reservationAffinity;
        this.sandboxConfig = sandboxConfig;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.tags = tags;
        this.taints = taints;
        this.workloadMetadataConfig = workloadMetadataConfig;
    }

    private NodeConfigArgs() {
        this.accelerators = Codegen.empty();
        this.advancedMachineFeatures = Codegen.empty();
        this.bootDiskKmsKey = Codegen.empty();
        this.diskSizeGb = Codegen.empty();
        this.diskType = Codegen.empty();
        this.gcfsConfig = Codegen.empty();
        this.gvnic = Codegen.empty();
        this.imageType = Codegen.empty();
        this.kubeletConfig = Codegen.empty();
        this.labels = Codegen.empty();
        this.linuxNodeConfig = Codegen.empty();
        this.localSsdCount = Codegen.empty();
        this.machineType = Codegen.empty();
        this.metadata = Codegen.empty();
        this.minCpuPlatform = Codegen.empty();
        this.nodeGroup = Codegen.empty();
        this.oauthScopes = Codegen.empty();
        this.preemptible = Codegen.empty();
        this.reservationAffinity = Codegen.empty();
        this.sandboxConfig = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.shieldedInstanceConfig = Codegen.empty();
        this.tags = Codegen.empty();
        this.taints = Codegen.empty();
        this.workloadMetadataConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AcceleratorConfigArgs>> accelerators;
        private @Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures;
        private @Nullable Output<String> bootDiskKmsKey;
        private @Nullable Output<Integer> diskSizeGb;
        private @Nullable Output<String> diskType;
        private @Nullable Output<GcfsConfigArgs> gcfsConfig;
        private @Nullable Output<VirtualNICArgs> gvnic;
        private @Nullable Output<String> imageType;
        private @Nullable Output<NodeKubeletConfigArgs> kubeletConfig;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<LinuxNodeConfigArgs> linuxNodeConfig;
        private @Nullable Output<Integer> localSsdCount;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<String> nodeGroup;
        private @Nullable Output<List<String>> oauthScopes;
        private @Nullable Output<Boolean> preemptible;
        private @Nullable Output<ReservationAffinityArgs> reservationAffinity;
        private @Nullable Output<SandboxConfigArgs> sandboxConfig;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<List<NodeTaintArgs>> taints;
        private @Nullable Output<WorkloadMetadataConfigArgs> workloadMetadataConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.gcfsConfig = defaults.gcfsConfig;
    	      this.gvnic = defaults.gvnic;
    	      this.imageType = defaults.imageType;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.labels = defaults.labels;
    	      this.linuxNodeConfig = defaults.linuxNodeConfig;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.sandboxConfig = defaults.sandboxConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfig = defaults.workloadMetadataConfig;
        }

        public Builder accelerators(@Nullable Output<List<AcceleratorConfigArgs>> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public Builder accelerators(@Nullable List<AcceleratorConfigArgs> accelerators) {
            this.accelerators = Codegen.ofNullable(accelerators);
            return this;
        }
        public Builder accelerators(AcceleratorConfigArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder advancedMachineFeatures(@Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures) {
            this.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }
        public Builder advancedMachineFeatures(@Nullable AdvancedMachineFeaturesArgs advancedMachineFeatures) {
            this.advancedMachineFeatures = Codegen.ofNullable(advancedMachineFeatures);
            return this;
        }
        public Builder bootDiskKmsKey(@Nullable Output<String> bootDiskKmsKey) {
            this.bootDiskKmsKey = bootDiskKmsKey;
            return this;
        }
        public Builder bootDiskKmsKey(@Nullable String bootDiskKmsKey) {
            this.bootDiskKmsKey = Codegen.ofNullable(bootDiskKmsKey);
            return this;
        }
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Codegen.ofNullable(diskSizeGb);
            return this;
        }
        public Builder diskType(@Nullable Output<String> diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder diskType(@Nullable String diskType) {
            this.diskType = Codegen.ofNullable(diskType);
            return this;
        }
        public Builder gcfsConfig(@Nullable Output<GcfsConfigArgs> gcfsConfig) {
            this.gcfsConfig = gcfsConfig;
            return this;
        }
        public Builder gcfsConfig(@Nullable GcfsConfigArgs gcfsConfig) {
            this.gcfsConfig = Codegen.ofNullable(gcfsConfig);
            return this;
        }
        public Builder gvnic(@Nullable Output<VirtualNICArgs> gvnic) {
            this.gvnic = gvnic;
            return this;
        }
        public Builder gvnic(@Nullable VirtualNICArgs gvnic) {
            this.gvnic = Codegen.ofNullable(gvnic);
            return this;
        }
        public Builder imageType(@Nullable Output<String> imageType) {
            this.imageType = imageType;
            return this;
        }
        public Builder imageType(@Nullable String imageType) {
            this.imageType = Codegen.ofNullable(imageType);
            return this;
        }
        public Builder kubeletConfig(@Nullable Output<NodeKubeletConfigArgs> kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }
        public Builder kubeletConfig(@Nullable NodeKubeletConfigArgs kubeletConfig) {
            this.kubeletConfig = Codegen.ofNullable(kubeletConfig);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder linuxNodeConfig(@Nullable Output<LinuxNodeConfigArgs> linuxNodeConfig) {
            this.linuxNodeConfig = linuxNodeConfig;
            return this;
        }
        public Builder linuxNodeConfig(@Nullable LinuxNodeConfigArgs linuxNodeConfig) {
            this.linuxNodeConfig = Codegen.ofNullable(linuxNodeConfig);
            return this;
        }
        public Builder localSsdCount(@Nullable Output<Integer> localSsdCount) {
            this.localSsdCount = localSsdCount;
            return this;
        }
        public Builder localSsdCount(@Nullable Integer localSsdCount) {
            this.localSsdCount = Codegen.ofNullable(localSsdCount);
            return this;
        }
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Codegen.ofNullable(machineType);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Codegen.ofNullable(minCpuPlatform);
            return this;
        }
        public Builder nodeGroup(@Nullable Output<String> nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }
        public Builder nodeGroup(@Nullable String nodeGroup) {
            this.nodeGroup = Codegen.ofNullable(nodeGroup);
            return this;
        }
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }
        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = Codegen.ofNullable(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public Builder preemptible(@Nullable Output<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = Codegen.ofNullable(preemptible);
            return this;
        }
        public Builder reservationAffinity(@Nullable Output<ReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }
        public Builder reservationAffinity(@Nullable ReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Codegen.ofNullable(reservationAffinity);
            return this;
        }
        public Builder sandboxConfig(@Nullable Output<SandboxConfigArgs> sandboxConfig) {
            this.sandboxConfig = sandboxConfig;
            return this;
        }
        public Builder sandboxConfig(@Nullable SandboxConfigArgs sandboxConfig) {
            this.sandboxConfig = Codegen.ofNullable(sandboxConfig);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable ShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Codegen.ofNullable(shieldedInstanceConfig);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder taints(@Nullable Output<List<NodeTaintArgs>> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(@Nullable List<NodeTaintArgs> taints) {
            this.taints = Codegen.ofNullable(taints);
            return this;
        }
        public Builder taints(NodeTaintArgs... taints) {
            return taints(List.of(taints));
        }
        public Builder workloadMetadataConfig(@Nullable Output<WorkloadMetadataConfigArgs> workloadMetadataConfig) {
            this.workloadMetadataConfig = workloadMetadataConfig;
            return this;
        }
        public Builder workloadMetadataConfig(@Nullable WorkloadMetadataConfigArgs workloadMetadataConfig) {
            this.workloadMetadataConfig = Codegen.ofNullable(workloadMetadataConfig);
            return this;
        }        public NodeConfigArgs build() {
            return new NodeConfigArgs(accelerators, advancedMachineFeatures, bootDiskKmsKey, diskSizeGb, diskType, gcfsConfig, gvnic, imageType, kubeletConfig, labels, linuxNodeConfig, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, reservationAffinity, sandboxConfig, serviceAccount, shieldedInstanceConfig, tags, taints, workloadMetadataConfig);
        }
    }
}
