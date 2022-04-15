// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.CloudRunConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.ConfigConnectorConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.DnsCacheConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.GcePersistentDiskCsiDriverConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.GcpFilestoreCsiDriverConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.GkeBackupAgentConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.HorizontalPodAutoscalingResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.HttpLoadBalancingResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.IstioConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.KalmConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.KubernetesDashboardResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.NetworkPolicyConfigResponse;
import java.util.Objects;

@CustomType
public final class AddonsConfigResponse {
    /**
     * Configuration for the Cloud Run addon. The `IstioConfig` addon must be enabled in order to enable Cloud Run addon. This option can only be enabled at cluster creation time.
     * 
     */
    private final CloudRunConfigResponse cloudRunConfig;
    /**
     * Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API
     * 
     */
    private final ConfigConnectorConfigResponse configConnectorConfig;
    /**
     * Configuration for NodeLocalDNS, a dns cache running on cluster nodes
     * 
     */
    private final DnsCacheConfigResponse dnsCacheConfig;
    /**
     * Configuration for the Compute Engine Persistent Disk CSI driver.
     * 
     */
    private final GcePersistentDiskCsiDriverConfigResponse gcePersistentDiskCsiDriverConfig;
    /**
     * Configuration for the GCP Filestore CSI driver.
     * 
     */
    private final GcpFilestoreCsiDriverConfigResponse gcpFilestoreCsiDriverConfig;
    /**
     * Configuration for the Backup for GKE agent addon.
     * 
     */
    private final GkeBackupAgentConfigResponse gkeBackupAgentConfig;
    /**
     * Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
     * 
     */
    private final HorizontalPodAutoscalingResponse horizontalPodAutoscaling;
    /**
     * Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
     * 
     */
    private final HttpLoadBalancingResponse httpLoadBalancing;
    /**
     * Configuration for Istio, an open platform to connect, manage, and secure microservices.
     * 
     */
    private final IstioConfigResponse istioConfig;
    /**
     * Configuration for the KALM addon, which manages the lifecycle of k8s applications.
     * 
     */
    private final KalmConfigResponse kalmConfig;
    /**
     * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
     * 
     */
    private final KubernetesDashboardResponse kubernetesDashboard;
    /**
     * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
     * 
     */
    private final NetworkPolicyConfigResponse networkPolicyConfig;

    @CustomType.Constructor
    private AddonsConfigResponse(
        @CustomType.Parameter("cloudRunConfig") CloudRunConfigResponse cloudRunConfig,
        @CustomType.Parameter("configConnectorConfig") ConfigConnectorConfigResponse configConnectorConfig,
        @CustomType.Parameter("dnsCacheConfig") DnsCacheConfigResponse dnsCacheConfig,
        @CustomType.Parameter("gcePersistentDiskCsiDriverConfig") GcePersistentDiskCsiDriverConfigResponse gcePersistentDiskCsiDriverConfig,
        @CustomType.Parameter("gcpFilestoreCsiDriverConfig") GcpFilestoreCsiDriverConfigResponse gcpFilestoreCsiDriverConfig,
        @CustomType.Parameter("gkeBackupAgentConfig") GkeBackupAgentConfigResponse gkeBackupAgentConfig,
        @CustomType.Parameter("horizontalPodAutoscaling") HorizontalPodAutoscalingResponse horizontalPodAutoscaling,
        @CustomType.Parameter("httpLoadBalancing") HttpLoadBalancingResponse httpLoadBalancing,
        @CustomType.Parameter("istioConfig") IstioConfigResponse istioConfig,
        @CustomType.Parameter("kalmConfig") KalmConfigResponse kalmConfig,
        @CustomType.Parameter("kubernetesDashboard") KubernetesDashboardResponse kubernetesDashboard,
        @CustomType.Parameter("networkPolicyConfig") NetworkPolicyConfigResponse networkPolicyConfig) {
        this.cloudRunConfig = cloudRunConfig;
        this.configConnectorConfig = configConnectorConfig;
        this.dnsCacheConfig = dnsCacheConfig;
        this.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
        this.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
        this.gkeBackupAgentConfig = gkeBackupAgentConfig;
        this.horizontalPodAutoscaling = horizontalPodAutoscaling;
        this.httpLoadBalancing = httpLoadBalancing;
        this.istioConfig = istioConfig;
        this.kalmConfig = kalmConfig;
        this.kubernetesDashboard = kubernetesDashboard;
        this.networkPolicyConfig = networkPolicyConfig;
    }

    /**
     * Configuration for the Cloud Run addon. The `IstioConfig` addon must be enabled in order to enable Cloud Run addon. This option can only be enabled at cluster creation time.
     * 
    */
    public CloudRunConfigResponse cloudRunConfig() {
        return this.cloudRunConfig;
    }
    /**
     * Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API
     * 
    */
    public ConfigConnectorConfigResponse configConnectorConfig() {
        return this.configConnectorConfig;
    }
    /**
     * Configuration for NodeLocalDNS, a dns cache running on cluster nodes
     * 
    */
    public DnsCacheConfigResponse dnsCacheConfig() {
        return this.dnsCacheConfig;
    }
    /**
     * Configuration for the Compute Engine Persistent Disk CSI driver.
     * 
    */
    public GcePersistentDiskCsiDriverConfigResponse gcePersistentDiskCsiDriverConfig() {
        return this.gcePersistentDiskCsiDriverConfig;
    }
    /**
     * Configuration for the GCP Filestore CSI driver.
     * 
    */
    public GcpFilestoreCsiDriverConfigResponse gcpFilestoreCsiDriverConfig() {
        return this.gcpFilestoreCsiDriverConfig;
    }
    /**
     * Configuration for the Backup for GKE agent addon.
     * 
    */
    public GkeBackupAgentConfigResponse gkeBackupAgentConfig() {
        return this.gkeBackupAgentConfig;
    }
    /**
     * Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
     * 
    */
    public HorizontalPodAutoscalingResponse horizontalPodAutoscaling() {
        return this.horizontalPodAutoscaling;
    }
    /**
     * Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
     * 
    */
    public HttpLoadBalancingResponse httpLoadBalancing() {
        return this.httpLoadBalancing;
    }
    /**
     * Configuration for Istio, an open platform to connect, manage, and secure microservices.
     * 
    */
    public IstioConfigResponse istioConfig() {
        return this.istioConfig;
    }
    /**
     * Configuration for the KALM addon, which manages the lifecycle of k8s applications.
     * 
    */
    public KalmConfigResponse kalmConfig() {
        return this.kalmConfig;
    }
    /**
     * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
     * 
    */
    public KubernetesDashboardResponse kubernetesDashboard() {
        return this.kubernetesDashboard;
    }
    /**
     * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
     * 
    */
    public NetworkPolicyConfigResponse networkPolicyConfig() {
        return this.networkPolicyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddonsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudRunConfigResponse cloudRunConfig;
        private ConfigConnectorConfigResponse configConnectorConfig;
        private DnsCacheConfigResponse dnsCacheConfig;
        private GcePersistentDiskCsiDriverConfigResponse gcePersistentDiskCsiDriverConfig;
        private GcpFilestoreCsiDriverConfigResponse gcpFilestoreCsiDriverConfig;
        private GkeBackupAgentConfigResponse gkeBackupAgentConfig;
        private HorizontalPodAutoscalingResponse horizontalPodAutoscaling;
        private HttpLoadBalancingResponse httpLoadBalancing;
        private IstioConfigResponse istioConfig;
        private KalmConfigResponse kalmConfig;
        private KubernetesDashboardResponse kubernetesDashboard;
        private NetworkPolicyConfigResponse networkPolicyConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(AddonsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRunConfig = defaults.cloudRunConfig;
    	      this.configConnectorConfig = defaults.configConnectorConfig;
    	      this.dnsCacheConfig = defaults.dnsCacheConfig;
    	      this.gcePersistentDiskCsiDriverConfig = defaults.gcePersistentDiskCsiDriverConfig;
    	      this.gcpFilestoreCsiDriverConfig = defaults.gcpFilestoreCsiDriverConfig;
    	      this.gkeBackupAgentConfig = defaults.gkeBackupAgentConfig;
    	      this.horizontalPodAutoscaling = defaults.horizontalPodAutoscaling;
    	      this.httpLoadBalancing = defaults.httpLoadBalancing;
    	      this.istioConfig = defaults.istioConfig;
    	      this.kalmConfig = defaults.kalmConfig;
    	      this.kubernetesDashboard = defaults.kubernetesDashboard;
    	      this.networkPolicyConfig = defaults.networkPolicyConfig;
        }

        public Builder cloudRunConfig(CloudRunConfigResponse cloudRunConfig) {
            this.cloudRunConfig = Objects.requireNonNull(cloudRunConfig);
            return this;
        }
        public Builder configConnectorConfig(ConfigConnectorConfigResponse configConnectorConfig) {
            this.configConnectorConfig = Objects.requireNonNull(configConnectorConfig);
            return this;
        }
        public Builder dnsCacheConfig(DnsCacheConfigResponse dnsCacheConfig) {
            this.dnsCacheConfig = Objects.requireNonNull(dnsCacheConfig);
            return this;
        }
        public Builder gcePersistentDiskCsiDriverConfig(GcePersistentDiskCsiDriverConfigResponse gcePersistentDiskCsiDriverConfig) {
            this.gcePersistentDiskCsiDriverConfig = Objects.requireNonNull(gcePersistentDiskCsiDriverConfig);
            return this;
        }
        public Builder gcpFilestoreCsiDriverConfig(GcpFilestoreCsiDriverConfigResponse gcpFilestoreCsiDriverConfig) {
            this.gcpFilestoreCsiDriverConfig = Objects.requireNonNull(gcpFilestoreCsiDriverConfig);
            return this;
        }
        public Builder gkeBackupAgentConfig(GkeBackupAgentConfigResponse gkeBackupAgentConfig) {
            this.gkeBackupAgentConfig = Objects.requireNonNull(gkeBackupAgentConfig);
            return this;
        }
        public Builder horizontalPodAutoscaling(HorizontalPodAutoscalingResponse horizontalPodAutoscaling) {
            this.horizontalPodAutoscaling = Objects.requireNonNull(horizontalPodAutoscaling);
            return this;
        }
        public Builder httpLoadBalancing(HttpLoadBalancingResponse httpLoadBalancing) {
            this.httpLoadBalancing = Objects.requireNonNull(httpLoadBalancing);
            return this;
        }
        public Builder istioConfig(IstioConfigResponse istioConfig) {
            this.istioConfig = Objects.requireNonNull(istioConfig);
            return this;
        }
        public Builder kalmConfig(KalmConfigResponse kalmConfig) {
            this.kalmConfig = Objects.requireNonNull(kalmConfig);
            return this;
        }
        public Builder kubernetesDashboard(KubernetesDashboardResponse kubernetesDashboard) {
            this.kubernetesDashboard = Objects.requireNonNull(kubernetesDashboard);
            return this;
        }
        public Builder networkPolicyConfig(NetworkPolicyConfigResponse networkPolicyConfig) {
            this.networkPolicyConfig = Objects.requireNonNull(networkPolicyConfig);
            return this;
        }        public AddonsConfigResponse build() {
            return new AddonsConfigResponse(cloudRunConfig, configConnectorConfig, dnsCacheConfig, gcePersistentDiskCsiDriverConfig, gcpFilestoreCsiDriverConfig, gkeBackupAgentConfig, horizontalPodAutoscaling, httpLoadBalancing, istioConfig, kalmConfig, kubernetesDashboard, networkPolicyConfig);
        }
    }
}
