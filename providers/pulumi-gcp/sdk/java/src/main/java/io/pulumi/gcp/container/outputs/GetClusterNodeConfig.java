// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.GetClusterNodeConfigEphemeralStorageConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodeConfigGcfsConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodeConfigGuestAccelerator;
import io.pulumi.gcp.container.outputs.GetClusterNodeConfigKubeletConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodeConfigLinuxNodeConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodeConfigSandboxConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodeConfigShieldedInstanceConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodeConfigTaint;
import io.pulumi.gcp.container.outputs.GetClusterNodeConfigWorkloadMetadataConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodeConfig {
    private final String bootDiskKmsKey;
    private final Integer diskSizeGb;
    private final String diskType;
    private final List<GetClusterNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs;
    private final List<GetClusterNodeConfigGcfsConfig> gcfsConfigs;
    private final List<GetClusterNodeConfigGuestAccelerator> guestAccelerators;
    private final String imageType;
    private final List<GetClusterNodeConfigKubeletConfig> kubeletConfigs;
    private final Map<String,String> labels;
    private final List<GetClusterNodeConfigLinuxNodeConfig> linuxNodeConfigs;
    private final Integer localSsdCount;
    private final String machineType;
    private final Map<String,String> metadata;
    private final String minCpuPlatform;
    private final String nodeGroup;
    private final List<String> oauthScopes;
    private final Boolean preemptible;
    private final List<GetClusterNodeConfigSandboxConfig> sandboxConfigs;
    private final String serviceAccount;
    private final List<GetClusterNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs;
    private final Boolean spot;
    private final List<String> tags;
    private final List<GetClusterNodeConfigTaint> taints;
    private final List<GetClusterNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs;

    @OutputCustomType.Constructor
    private GetClusterNodeConfig(
        @OutputCustomType.Parameter("bootDiskKmsKey") String bootDiskKmsKey,
        @OutputCustomType.Parameter("diskSizeGb") Integer diskSizeGb,
        @OutputCustomType.Parameter("diskType") String diskType,
        @OutputCustomType.Parameter("ephemeralStorageConfigs") List<GetClusterNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs,
        @OutputCustomType.Parameter("gcfsConfigs") List<GetClusterNodeConfigGcfsConfig> gcfsConfigs,
        @OutputCustomType.Parameter("guestAccelerators") List<GetClusterNodeConfigGuestAccelerator> guestAccelerators,
        @OutputCustomType.Parameter("imageType") String imageType,
        @OutputCustomType.Parameter("kubeletConfigs") List<GetClusterNodeConfigKubeletConfig> kubeletConfigs,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("linuxNodeConfigs") List<GetClusterNodeConfigLinuxNodeConfig> linuxNodeConfigs,
        @OutputCustomType.Parameter("localSsdCount") Integer localSsdCount,
        @OutputCustomType.Parameter("machineType") String machineType,
        @OutputCustomType.Parameter("metadata") Map<String,String> metadata,
        @OutputCustomType.Parameter("minCpuPlatform") String minCpuPlatform,
        @OutputCustomType.Parameter("nodeGroup") String nodeGroup,
        @OutputCustomType.Parameter("oauthScopes") List<String> oauthScopes,
        @OutputCustomType.Parameter("preemptible") Boolean preemptible,
        @OutputCustomType.Parameter("sandboxConfigs") List<GetClusterNodeConfigSandboxConfig> sandboxConfigs,
        @OutputCustomType.Parameter("serviceAccount") String serviceAccount,
        @OutputCustomType.Parameter("shieldedInstanceConfigs") List<GetClusterNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs,
        @OutputCustomType.Parameter("spot") Boolean spot,
        @OutputCustomType.Parameter("tags") List<String> tags,
        @OutputCustomType.Parameter("taints") List<GetClusterNodeConfigTaint> taints,
        @OutputCustomType.Parameter("workloadMetadataConfigs") List<GetClusterNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs) {
        this.bootDiskKmsKey = bootDiskKmsKey;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.ephemeralStorageConfigs = ephemeralStorageConfigs;
        this.gcfsConfigs = gcfsConfigs;
        this.guestAccelerators = guestAccelerators;
        this.imageType = imageType;
        this.kubeletConfigs = kubeletConfigs;
        this.labels = labels;
        this.linuxNodeConfigs = linuxNodeConfigs;
        this.localSsdCount = localSsdCount;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.nodeGroup = nodeGroup;
        this.oauthScopes = oauthScopes;
        this.preemptible = preemptible;
        this.sandboxConfigs = sandboxConfigs;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfigs = shieldedInstanceConfigs;
        this.spot = spot;
        this.tags = tags;
        this.taints = taints;
        this.workloadMetadataConfigs = workloadMetadataConfigs;
    }

    public String getBootDiskKmsKey() {
        return this.bootDiskKmsKey;
    }
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    public String getDiskType() {
        return this.diskType;
    }
    public List<GetClusterNodeConfigEphemeralStorageConfig> getEphemeralStorageConfigs() {
        return this.ephemeralStorageConfigs;
    }
    public List<GetClusterNodeConfigGcfsConfig> getGcfsConfigs() {
        return this.gcfsConfigs;
    }
    public List<GetClusterNodeConfigGuestAccelerator> getGuestAccelerators() {
        return this.guestAccelerators;
    }
    public String getImageType() {
        return this.imageType;
    }
    public List<GetClusterNodeConfigKubeletConfig> getKubeletConfigs() {
        return this.kubeletConfigs;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public List<GetClusterNodeConfigLinuxNodeConfig> getLinuxNodeConfigs() {
        return this.linuxNodeConfigs;
    }
    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }
    public String getMachineType() {
        return this.machineType;
    }
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    public String getNodeGroup() {
        return this.nodeGroup;
    }
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }
    public Boolean getPreemptible() {
        return this.preemptible;
    }
    public List<GetClusterNodeConfigSandboxConfig> getSandboxConfigs() {
        return this.sandboxConfigs;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    public List<GetClusterNodeConfigShieldedInstanceConfig> getShieldedInstanceConfigs() {
        return this.shieldedInstanceConfigs;
    }
    public Boolean getSpot() {
        return this.spot;
    }
    public List<String> getTags() {
        return this.tags;
    }
    public List<GetClusterNodeConfigTaint> getTaints() {
        return this.taints;
    }
    public List<GetClusterNodeConfigWorkloadMetadataConfig> getWorkloadMetadataConfigs() {
        return this.workloadMetadataConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootDiskKmsKey;
        private Integer diskSizeGb;
        private String diskType;
        private List<GetClusterNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs;
        private List<GetClusterNodeConfigGcfsConfig> gcfsConfigs;
        private List<GetClusterNodeConfigGuestAccelerator> guestAccelerators;
        private String imageType;
        private List<GetClusterNodeConfigKubeletConfig> kubeletConfigs;
        private Map<String,String> labels;
        private List<GetClusterNodeConfigLinuxNodeConfig> linuxNodeConfigs;
        private Integer localSsdCount;
        private String machineType;
        private Map<String,String> metadata;
        private String minCpuPlatform;
        private String nodeGroup;
        private List<String> oauthScopes;
        private Boolean preemptible;
        private List<GetClusterNodeConfigSandboxConfig> sandboxConfigs;
        private String serviceAccount;
        private List<GetClusterNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs;
        private Boolean spot;
        private List<String> tags;
        private List<GetClusterNodeConfigTaint> taints;
        private List<GetClusterNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.ephemeralStorageConfigs = defaults.ephemeralStorageConfigs;
    	      this.gcfsConfigs = defaults.gcfsConfigs;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.imageType = defaults.imageType;
    	      this.kubeletConfigs = defaults.kubeletConfigs;
    	      this.labels = defaults.labels;
    	      this.linuxNodeConfigs = defaults.linuxNodeConfigs;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.sandboxConfigs = defaults.sandboxConfigs;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfigs = defaults.shieldedInstanceConfigs;
    	      this.spot = defaults.spot;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfigs = defaults.workloadMetadataConfigs;
        }

        public Builder setBootDiskKmsKey(String bootDiskKmsKey) {
            this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
            return this;
        }

        public Builder setDiskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setEphemeralStorageConfigs(List<GetClusterNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs) {
            this.ephemeralStorageConfigs = Objects.requireNonNull(ephemeralStorageConfigs);
            return this;
        }

        public Builder setGcfsConfigs(List<GetClusterNodeConfigGcfsConfig> gcfsConfigs) {
            this.gcfsConfigs = Objects.requireNonNull(gcfsConfigs);
            return this;
        }

        public Builder setGuestAccelerators(List<GetClusterNodeConfigGuestAccelerator> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }

        public Builder setImageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder setKubeletConfigs(List<GetClusterNodeConfigKubeletConfig> kubeletConfigs) {
            this.kubeletConfigs = Objects.requireNonNull(kubeletConfigs);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLinuxNodeConfigs(List<GetClusterNodeConfigLinuxNodeConfig> linuxNodeConfigs) {
            this.linuxNodeConfigs = Objects.requireNonNull(linuxNodeConfigs);
            return this;
        }

        public Builder setLocalSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setNodeGroup(String nodeGroup) {
            this.nodeGroup = Objects.requireNonNull(nodeGroup);
            return this;
        }

        public Builder setOauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }

        public Builder setPreemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder setSandboxConfigs(List<GetClusterNodeConfigSandboxConfig> sandboxConfigs) {
            this.sandboxConfigs = Objects.requireNonNull(sandboxConfigs);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setShieldedInstanceConfigs(List<GetClusterNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs) {
            this.shieldedInstanceConfigs = Objects.requireNonNull(shieldedInstanceConfigs);
            return this;
        }

        public Builder setSpot(Boolean spot) {
            this.spot = Objects.requireNonNull(spot);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTaints(List<GetClusterNodeConfigTaint> taints) {
            this.taints = Objects.requireNonNull(taints);
            return this;
        }

        public Builder setWorkloadMetadataConfigs(List<GetClusterNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs) {
            this.workloadMetadataConfigs = Objects.requireNonNull(workloadMetadataConfigs);
            return this;
        }
        public GetClusterNodeConfig build() {
            return new GetClusterNodeConfig(bootDiskKmsKey, diskSizeGb, diskType, ephemeralStorageConfigs, gcfsConfigs, guestAccelerators, imageType, kubeletConfigs, labels, linuxNodeConfigs, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, sandboxConfigs, serviceAccount, shieldedInstanceConfigs, spot, tags, taints, workloadMetadataConfigs);
        }
    }
}
