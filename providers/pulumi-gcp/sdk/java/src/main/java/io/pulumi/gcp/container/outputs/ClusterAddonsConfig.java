// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigCloudrunConfig;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigConfigConnectorConfig;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigDnsCacheConfig;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigGcePersistentDiskCsiDriverConfig;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigGcpFilestoreCsiDriverConfig;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigHorizontalPodAutoscaling;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigHttpLoadBalancing;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigIstioConfig;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigKalmConfig;
import io.pulumi.gcp.container.outputs.ClusterAddonsConfigNetworkPolicyConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterAddonsConfig {
    /**
     * . Structure is documented below.
     * 
     */
    private final @Nullable ClusterAddonsConfigCloudrunConfig cloudrunConfig;
    /**
     * .
     * The status of the ConfigConnector addon. It is disabled by default; Set `enabled = true` to enable.
     * 
     */
    private final @Nullable ClusterAddonsConfigConfigConnectorConfig configConnectorConfig;
    /**
     * .
     * The status of the NodeLocal DNSCache addon. It is disabled by default.
     * Set `enabled = true` to enable.
     * 
     */
    private final @Nullable ClusterAddonsConfigDnsCacheConfig dnsCacheConfig;
    /**
     * .
     * Whether this cluster should enable the Google Compute Engine Persistent Disk Container Storage Interface (CSI) Driver. Defaults to disabled; set `enabled = true` to enable.
     * 
     */
    private final @Nullable ClusterAddonsConfigGcePersistentDiskCsiDriverConfig gcePersistentDiskCsiDriverConfig;
    /**
     * The status of the Filestore CSI driver addon,
     * which allows the usage of filestore instance as volumes.
     * It is disbaled by default; set `enabled = true` to enable.
     * 
     */
    private final @Nullable ClusterAddonsConfigGcpFilestoreCsiDriverConfig gcpFilestoreCsiDriverConfig;
    /**
     * The status of the Horizontal Pod Autoscaling
     * addon, which increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * It is enabled by default;
     * set `disabled = true` to disable.
     * 
     */
    private final @Nullable ClusterAddonsConfigHorizontalPodAutoscaling horizontalPodAutoscaling;
    /**
     * The status of the HTTP (L7) load balancing
     * controller addon, which makes it easy to set up HTTP load balancers for services in a
     * cluster. It is enabled by default; set `disabled = true` to disable.
     * 
     */
    private final @Nullable ClusterAddonsConfigHttpLoadBalancing httpLoadBalancing;
    /**
     * .
     * Structure is documented below.
     * 
     */
    private final @Nullable ClusterAddonsConfigIstioConfig istioConfig;
    /**
     * .
     * Configuration for the KALM addon, which manages the lifecycle of k8s. It is disabled by default; Set `enabled = true` to enable.
     * 
     */
    private final @Nullable ClusterAddonsConfigKalmConfig kalmConfig;
    /**
     * Whether we should enable the network policy addon
     * for the master.  This must be enabled in order to enable network policy for the nodes.
     * To enable this, you must also define a `network_policy` block,
     * otherwise nothing will happen.
     * It can only be disabled if the nodes already do not have network policies enabled.
     * Defaults to disabled; set `disabled = false` to enable.
     * 
     */
    private final @Nullable ClusterAddonsConfigNetworkPolicyConfig networkPolicyConfig;

    @OutputCustomType.Constructor
    private ClusterAddonsConfig(
        @OutputCustomType.Parameter("cloudrunConfig") @Nullable ClusterAddonsConfigCloudrunConfig cloudrunConfig,
        @OutputCustomType.Parameter("configConnectorConfig") @Nullable ClusterAddonsConfigConfigConnectorConfig configConnectorConfig,
        @OutputCustomType.Parameter("dnsCacheConfig") @Nullable ClusterAddonsConfigDnsCacheConfig dnsCacheConfig,
        @OutputCustomType.Parameter("gcePersistentDiskCsiDriverConfig") @Nullable ClusterAddonsConfigGcePersistentDiskCsiDriverConfig gcePersistentDiskCsiDriverConfig,
        @OutputCustomType.Parameter("gcpFilestoreCsiDriverConfig") @Nullable ClusterAddonsConfigGcpFilestoreCsiDriverConfig gcpFilestoreCsiDriverConfig,
        @OutputCustomType.Parameter("horizontalPodAutoscaling") @Nullable ClusterAddonsConfigHorizontalPodAutoscaling horizontalPodAutoscaling,
        @OutputCustomType.Parameter("httpLoadBalancing") @Nullable ClusterAddonsConfigHttpLoadBalancing httpLoadBalancing,
        @OutputCustomType.Parameter("istioConfig") @Nullable ClusterAddonsConfigIstioConfig istioConfig,
        @OutputCustomType.Parameter("kalmConfig") @Nullable ClusterAddonsConfigKalmConfig kalmConfig,
        @OutputCustomType.Parameter("networkPolicyConfig") @Nullable ClusterAddonsConfigNetworkPolicyConfig networkPolicyConfig) {
        this.cloudrunConfig = cloudrunConfig;
        this.configConnectorConfig = configConnectorConfig;
        this.dnsCacheConfig = dnsCacheConfig;
        this.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
        this.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
        this.horizontalPodAutoscaling = horizontalPodAutoscaling;
        this.httpLoadBalancing = httpLoadBalancing;
        this.istioConfig = istioConfig;
        this.kalmConfig = kalmConfig;
        this.networkPolicyConfig = networkPolicyConfig;
    }

    /**
     * . Structure is documented below.
     * 
    */
    public Optional<ClusterAddonsConfigCloudrunConfig> getCloudrunConfig() {
        return Optional.ofNullable(this.cloudrunConfig);
    }
    /**
     * .
     * The status of the ConfigConnector addon. It is disabled by default; Set `enabled = true` to enable.
     * 
    */
    public Optional<ClusterAddonsConfigConfigConnectorConfig> getConfigConnectorConfig() {
        return Optional.ofNullable(this.configConnectorConfig);
    }
    /**
     * .
     * The status of the NodeLocal DNSCache addon. It is disabled by default.
     * Set `enabled = true` to enable.
     * 
    */
    public Optional<ClusterAddonsConfigDnsCacheConfig> getDnsCacheConfig() {
        return Optional.ofNullable(this.dnsCacheConfig);
    }
    /**
     * .
     * Whether this cluster should enable the Google Compute Engine Persistent Disk Container Storage Interface (CSI) Driver. Defaults to disabled; set `enabled = true` to enable.
     * 
    */
    public Optional<ClusterAddonsConfigGcePersistentDiskCsiDriverConfig> getGcePersistentDiskCsiDriverConfig() {
        return Optional.ofNullable(this.gcePersistentDiskCsiDriverConfig);
    }
    /**
     * The status of the Filestore CSI driver addon,
     * which allows the usage of filestore instance as volumes.
     * It is disbaled by default; set `enabled = true` to enable.
     * 
    */
    public Optional<ClusterAddonsConfigGcpFilestoreCsiDriverConfig> getGcpFilestoreCsiDriverConfig() {
        return Optional.ofNullable(this.gcpFilestoreCsiDriverConfig);
    }
    /**
     * The status of the Horizontal Pod Autoscaling
     * addon, which increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * It is enabled by default;
     * set `disabled = true` to disable.
     * 
    */
    public Optional<ClusterAddonsConfigHorizontalPodAutoscaling> getHorizontalPodAutoscaling() {
        return Optional.ofNullable(this.horizontalPodAutoscaling);
    }
    /**
     * The status of the HTTP (L7) load balancing
     * controller addon, which makes it easy to set up HTTP load balancers for services in a
     * cluster. It is enabled by default; set `disabled = true` to disable.
     * 
    */
    public Optional<ClusterAddonsConfigHttpLoadBalancing> getHttpLoadBalancing() {
        return Optional.ofNullable(this.httpLoadBalancing);
    }
    /**
     * .
     * Structure is documented below.
     * 
    */
    public Optional<ClusterAddonsConfigIstioConfig> getIstioConfig() {
        return Optional.ofNullable(this.istioConfig);
    }
    /**
     * .
     * Configuration for the KALM addon, which manages the lifecycle of k8s. It is disabled by default; Set `enabled = true` to enable.
     * 
    */
    public Optional<ClusterAddonsConfigKalmConfig> getKalmConfig() {
        return Optional.ofNullable(this.kalmConfig);
    }
    /**
     * Whether we should enable the network policy addon
     * for the master.  This must be enabled in order to enable network policy for the nodes.
     * To enable this, you must also define a `network_policy` block,
     * otherwise nothing will happen.
     * It can only be disabled if the nodes already do not have network policies enabled.
     * Defaults to disabled; set `disabled = false` to enable.
     * 
    */
    public Optional<ClusterAddonsConfigNetworkPolicyConfig> getNetworkPolicyConfig() {
        return Optional.ofNullable(this.networkPolicyConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterAddonsConfigCloudrunConfig cloudrunConfig;
        private @Nullable ClusterAddonsConfigConfigConnectorConfig configConnectorConfig;
        private @Nullable ClusterAddonsConfigDnsCacheConfig dnsCacheConfig;
        private @Nullable ClusterAddonsConfigGcePersistentDiskCsiDriverConfig gcePersistentDiskCsiDriverConfig;
        private @Nullable ClusterAddonsConfigGcpFilestoreCsiDriverConfig gcpFilestoreCsiDriverConfig;
        private @Nullable ClusterAddonsConfigHorizontalPodAutoscaling horizontalPodAutoscaling;
        private @Nullable ClusterAddonsConfigHttpLoadBalancing httpLoadBalancing;
        private @Nullable ClusterAddonsConfigIstioConfig istioConfig;
        private @Nullable ClusterAddonsConfigKalmConfig kalmConfig;
        private @Nullable ClusterAddonsConfigNetworkPolicyConfig networkPolicyConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudrunConfig = defaults.cloudrunConfig;
    	      this.configConnectorConfig = defaults.configConnectorConfig;
    	      this.dnsCacheConfig = defaults.dnsCacheConfig;
    	      this.gcePersistentDiskCsiDriverConfig = defaults.gcePersistentDiskCsiDriverConfig;
    	      this.gcpFilestoreCsiDriverConfig = defaults.gcpFilestoreCsiDriverConfig;
    	      this.horizontalPodAutoscaling = defaults.horizontalPodAutoscaling;
    	      this.httpLoadBalancing = defaults.httpLoadBalancing;
    	      this.istioConfig = defaults.istioConfig;
    	      this.kalmConfig = defaults.kalmConfig;
    	      this.networkPolicyConfig = defaults.networkPolicyConfig;
        }

        public Builder setCloudrunConfig(@Nullable ClusterAddonsConfigCloudrunConfig cloudrunConfig) {
            this.cloudrunConfig = cloudrunConfig;
            return this;
        }

        public Builder setConfigConnectorConfig(@Nullable ClusterAddonsConfigConfigConnectorConfig configConnectorConfig) {
            this.configConnectorConfig = configConnectorConfig;
            return this;
        }

        public Builder setDnsCacheConfig(@Nullable ClusterAddonsConfigDnsCacheConfig dnsCacheConfig) {
            this.dnsCacheConfig = dnsCacheConfig;
            return this;
        }

        public Builder setGcePersistentDiskCsiDriverConfig(@Nullable ClusterAddonsConfigGcePersistentDiskCsiDriverConfig gcePersistentDiskCsiDriverConfig) {
            this.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
            return this;
        }

        public Builder setGcpFilestoreCsiDriverConfig(@Nullable ClusterAddonsConfigGcpFilestoreCsiDriverConfig gcpFilestoreCsiDriverConfig) {
            this.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
            return this;
        }

        public Builder setHorizontalPodAutoscaling(@Nullable ClusterAddonsConfigHorizontalPodAutoscaling horizontalPodAutoscaling) {
            this.horizontalPodAutoscaling = horizontalPodAutoscaling;
            return this;
        }

        public Builder setHttpLoadBalancing(@Nullable ClusterAddonsConfigHttpLoadBalancing httpLoadBalancing) {
            this.httpLoadBalancing = httpLoadBalancing;
            return this;
        }

        public Builder setIstioConfig(@Nullable ClusterAddonsConfigIstioConfig istioConfig) {
            this.istioConfig = istioConfig;
            return this;
        }

        public Builder setKalmConfig(@Nullable ClusterAddonsConfigKalmConfig kalmConfig) {
            this.kalmConfig = kalmConfig;
            return this;
        }

        public Builder setNetworkPolicyConfig(@Nullable ClusterAddonsConfigNetworkPolicyConfig networkPolicyConfig) {
            this.networkPolicyConfig = networkPolicyConfig;
            return this;
        }
        public ClusterAddonsConfig build() {
            return new ClusterAddonsConfig(cloudrunConfig, configConnectorConfig, dnsCacheConfig, gcePersistentDiskCsiDriverConfig, gcpFilestoreCsiDriverConfig, horizontalPodAutoscaling, httpLoadBalancing, istioConfig, kalmConfig, networkPolicyConfig);
        }
    }
}
