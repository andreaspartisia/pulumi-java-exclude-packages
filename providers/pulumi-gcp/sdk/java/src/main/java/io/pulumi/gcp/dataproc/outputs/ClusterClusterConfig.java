// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigAutoscalingConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigEncryptionConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigEndpointConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigGceClusterConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigInitializationAction;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigLifecycleConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigMasterConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigMetastoreConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigPreemptibleWorkerConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigSecurityConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigSoftwareConfig;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigWorkerConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterClusterConfig {
    /**
     * The autoscaling policy config associated with the cluster.
     * Note that once set, if `autoscaling_config` is the only field set in `cluster_config`, it can
     * only be removed by setting `policy_uri = ""`, rather than removing the whole block.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigAutoscalingConfig autoscalingConfig;
    private final @Nullable String bucket;
    /**
     * The Customer managed encryption keys settings for the cluster.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigEncryptionConfig encryptionConfig;
    /**
     * The config settings for port access on the cluster.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigEndpointConfig endpointConfig;
    /**
     * Common config settings for resources of Google Compute Engine cluster
     * instances, applicable to all instances in the cluster. Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigGceClusterConfig gceClusterConfig;
    /**
     * Commands to execute on each node after config is completed.
     * You can specify multiple versions of these. Structure defined below.
     * 
     */
    private final @Nullable List<ClusterClusterConfigInitializationAction> initializationActions;
    /**
     * The settings for auto deletion cluster schedule.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigLifecycleConfig lifecycleConfig;
    /**
     * The Google Compute Engine config settings for the master instances
     * in a cluster. Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigMasterConfig masterConfig;
    /**
     * The config setting for metastore service with the cluster.
     * Structure defined below.
     * ***
     * 
     */
    private final @Nullable ClusterClusterConfigMetastoreConfig metastoreConfig;
    /**
     * The Google Compute Engine config settings for the additional
     * instances in a cluster. Structure defined below.
     * * **NOTE** : `preemptible_worker_config` is
     *   an alias for the api's [secondaryWorkerConfig](https://cloud.google.com/dataproc/docs/reference/rest/v1/ClusterConfig#InstanceGroupConfig). The name doesn't necessarily mean it is preemptible and is named as
     *   such for legacy/compatibility reasons.
     * 
     */
    private final @Nullable ClusterClusterConfigPreemptibleWorkerConfig preemptibleWorkerConfig;
    /**
     * Security related configuration. Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigSecurityConfig securityConfig;
    /**
     * The config settings for software inside the cluster.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigSoftwareConfig softwareConfig;
    /**
     * The Cloud Storage staging bucket used to stage files,
     * such as Hadoop jars, between client machines and the cluster.
     * Note: If you don't explicitly specify a `staging_bucket`
     * then GCP will auto create / assign one for you. However, you are not guaranteed
     * an auto generated bucket which is solely dedicated to your cluster; it may be shared
     * with other clusters in the same region/zone also choosing to use the auto generation
     * option.
     * 
     */
    private final @Nullable String stagingBucket;
    /**
     * The Cloud Storage temp bucket used to store ephemeral cluster
     * and jobs data, such as Spark and MapReduce history files.
     * Note: If you don't explicitly specify a `temp_bucket` then GCP will auto create / assign one for you.
     * 
     */
    private final @Nullable String tempBucket;
    /**
     * The Google Compute Engine config settings for the worker instances
     * in a cluster. Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigWorkerConfig workerConfig;

    @OutputCustomType.Constructor
    private ClusterClusterConfig(
        @OutputCustomType.Parameter("autoscalingConfig") @Nullable ClusterClusterConfigAutoscalingConfig autoscalingConfig,
        @OutputCustomType.Parameter("bucket") @Nullable String bucket,
        @OutputCustomType.Parameter("encryptionConfig") @Nullable ClusterClusterConfigEncryptionConfig encryptionConfig,
        @OutputCustomType.Parameter("endpointConfig") @Nullable ClusterClusterConfigEndpointConfig endpointConfig,
        @OutputCustomType.Parameter("gceClusterConfig") @Nullable ClusterClusterConfigGceClusterConfig gceClusterConfig,
        @OutputCustomType.Parameter("initializationActions") @Nullable List<ClusterClusterConfigInitializationAction> initializationActions,
        @OutputCustomType.Parameter("lifecycleConfig") @Nullable ClusterClusterConfigLifecycleConfig lifecycleConfig,
        @OutputCustomType.Parameter("masterConfig") @Nullable ClusterClusterConfigMasterConfig masterConfig,
        @OutputCustomType.Parameter("metastoreConfig") @Nullable ClusterClusterConfigMetastoreConfig metastoreConfig,
        @OutputCustomType.Parameter("preemptibleWorkerConfig") @Nullable ClusterClusterConfigPreemptibleWorkerConfig preemptibleWorkerConfig,
        @OutputCustomType.Parameter("securityConfig") @Nullable ClusterClusterConfigSecurityConfig securityConfig,
        @OutputCustomType.Parameter("softwareConfig") @Nullable ClusterClusterConfigSoftwareConfig softwareConfig,
        @OutputCustomType.Parameter("stagingBucket") @Nullable String stagingBucket,
        @OutputCustomType.Parameter("tempBucket") @Nullable String tempBucket,
        @OutputCustomType.Parameter("workerConfig") @Nullable ClusterClusterConfigWorkerConfig workerConfig) {
        this.autoscalingConfig = autoscalingConfig;
        this.bucket = bucket;
        this.encryptionConfig = encryptionConfig;
        this.endpointConfig = endpointConfig;
        this.gceClusterConfig = gceClusterConfig;
        this.initializationActions = initializationActions;
        this.lifecycleConfig = lifecycleConfig;
        this.masterConfig = masterConfig;
        this.metastoreConfig = metastoreConfig;
        this.preemptibleWorkerConfig = preemptibleWorkerConfig;
        this.securityConfig = securityConfig;
        this.softwareConfig = softwareConfig;
        this.stagingBucket = stagingBucket;
        this.tempBucket = tempBucket;
        this.workerConfig = workerConfig;
    }

    /**
     * The autoscaling policy config associated with the cluster.
     * Note that once set, if `autoscaling_config` is the only field set in `cluster_config`, it can
     * only be removed by setting `policy_uri = ""`, rather than removing the whole block.
     * Structure defined below.
     * 
    */
    public Optional<ClusterClusterConfigAutoscalingConfig> getAutoscalingConfig() {
        return Optional.ofNullable(this.autoscalingConfig);
    }
    public Optional<String> getBucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * The Customer managed encryption keys settings for the cluster.
     * Structure defined below.
     * 
    */
    public Optional<ClusterClusterConfigEncryptionConfig> getEncryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }
    /**
     * The config settings for port access on the cluster.
     * Structure defined below.
     * 
    */
    public Optional<ClusterClusterConfigEndpointConfig> getEndpointConfig() {
        return Optional.ofNullable(this.endpointConfig);
    }
    /**
     * Common config settings for resources of Google Compute Engine cluster
     * instances, applicable to all instances in the cluster. Structure defined below.
     * 
    */
    public Optional<ClusterClusterConfigGceClusterConfig> getGceClusterConfig() {
        return Optional.ofNullable(this.gceClusterConfig);
    }
    /**
     * Commands to execute on each node after config is completed.
     * You can specify multiple versions of these. Structure defined below.
     * 
    */
    public List<ClusterClusterConfigInitializationAction> getInitializationActions() {
        return this.initializationActions == null ? List.of() : this.initializationActions;
    }
    /**
     * The settings for auto deletion cluster schedule.
     * Structure defined below.
     * 
    */
    public Optional<ClusterClusterConfigLifecycleConfig> getLifecycleConfig() {
        return Optional.ofNullable(this.lifecycleConfig);
    }
    /**
     * The Google Compute Engine config settings for the master instances
     * in a cluster. Structure defined below.
     * 
    */
    public Optional<ClusterClusterConfigMasterConfig> getMasterConfig() {
        return Optional.ofNullable(this.masterConfig);
    }
    /**
     * The config setting for metastore service with the cluster.
     * Structure defined below.
     * ***
     * 
    */
    public Optional<ClusterClusterConfigMetastoreConfig> getMetastoreConfig() {
        return Optional.ofNullable(this.metastoreConfig);
    }
    /**
     * The Google Compute Engine config settings for the additional
     * instances in a cluster. Structure defined below.
     * * **NOTE** : `preemptible_worker_config` is
     *   an alias for the api's [secondaryWorkerConfig](https://cloud.google.com/dataproc/docs/reference/rest/v1/ClusterConfig#InstanceGroupConfig). The name doesn't necessarily mean it is preemptible and is named as
     *   such for legacy/compatibility reasons.
     * 
    */
    public Optional<ClusterClusterConfigPreemptibleWorkerConfig> getPreemptibleWorkerConfig() {
        return Optional.ofNullable(this.preemptibleWorkerConfig);
    }
    /**
     * Security related configuration. Structure defined below.
     * 
    */
    public Optional<ClusterClusterConfigSecurityConfig> getSecurityConfig() {
        return Optional.ofNullable(this.securityConfig);
    }
    /**
     * The config settings for software inside the cluster.
     * Structure defined below.
     * 
    */
    public Optional<ClusterClusterConfigSoftwareConfig> getSoftwareConfig() {
        return Optional.ofNullable(this.softwareConfig);
    }
    /**
     * The Cloud Storage staging bucket used to stage files,
     * such as Hadoop jars, between client machines and the cluster.
     * Note: If you don't explicitly specify a `staging_bucket`
     * then GCP will auto create / assign one for you. However, you are not guaranteed
     * an auto generated bucket which is solely dedicated to your cluster; it may be shared
     * with other clusters in the same region/zone also choosing to use the auto generation
     * option.
     * 
    */
    public Optional<String> getStagingBucket() {
        return Optional.ofNullable(this.stagingBucket);
    }
    /**
     * The Cloud Storage temp bucket used to store ephemeral cluster
     * and jobs data, such as Spark and MapReduce history files.
     * Note: If you don't explicitly specify a `temp_bucket` then GCP will auto create / assign one for you.
     * 
    */
    public Optional<String> getTempBucket() {
        return Optional.ofNullable(this.tempBucket);
    }
    /**
     * The Google Compute Engine config settings for the worker instances
     * in a cluster. Structure defined below.
     * 
    */
    public Optional<ClusterClusterConfigWorkerConfig> getWorkerConfig() {
        return Optional.ofNullable(this.workerConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterClusterConfigAutoscalingConfig autoscalingConfig;
        private @Nullable String bucket;
        private @Nullable ClusterClusterConfigEncryptionConfig encryptionConfig;
        private @Nullable ClusterClusterConfigEndpointConfig endpointConfig;
        private @Nullable ClusterClusterConfigGceClusterConfig gceClusterConfig;
        private @Nullable List<ClusterClusterConfigInitializationAction> initializationActions;
        private @Nullable ClusterClusterConfigLifecycleConfig lifecycleConfig;
        private @Nullable ClusterClusterConfigMasterConfig masterConfig;
        private @Nullable ClusterClusterConfigMetastoreConfig metastoreConfig;
        private @Nullable ClusterClusterConfigPreemptibleWorkerConfig preemptibleWorkerConfig;
        private @Nullable ClusterClusterConfigSecurityConfig securityConfig;
        private @Nullable ClusterClusterConfigSoftwareConfig softwareConfig;
        private @Nullable String stagingBucket;
        private @Nullable String tempBucket;
        private @Nullable ClusterClusterConfigWorkerConfig workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingConfig = defaults.autoscalingConfig;
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointConfig = defaults.endpointConfig;
    	      this.gceClusterConfig = defaults.gceClusterConfig;
    	      this.initializationActions = defaults.initializationActions;
    	      this.lifecycleConfig = defaults.lifecycleConfig;
    	      this.masterConfig = defaults.masterConfig;
    	      this.metastoreConfig = defaults.metastoreConfig;
    	      this.preemptibleWorkerConfig = defaults.preemptibleWorkerConfig;
    	      this.securityConfig = defaults.securityConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.stagingBucket = defaults.stagingBucket;
    	      this.tempBucket = defaults.tempBucket;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder setAutoscalingConfig(@Nullable ClusterClusterConfigAutoscalingConfig autoscalingConfig) {
            this.autoscalingConfig = autoscalingConfig;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setEncryptionConfig(@Nullable ClusterClusterConfigEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder setEndpointConfig(@Nullable ClusterClusterConfigEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }

        public Builder setGceClusterConfig(@Nullable ClusterClusterConfigGceClusterConfig gceClusterConfig) {
            this.gceClusterConfig = gceClusterConfig;
            return this;
        }

        public Builder setInitializationActions(@Nullable List<ClusterClusterConfigInitializationAction> initializationActions) {
            this.initializationActions = initializationActions;
            return this;
        }

        public Builder setLifecycleConfig(@Nullable ClusterClusterConfigLifecycleConfig lifecycleConfig) {
            this.lifecycleConfig = lifecycleConfig;
            return this;
        }

        public Builder setMasterConfig(@Nullable ClusterClusterConfigMasterConfig masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }

        public Builder setMetastoreConfig(@Nullable ClusterClusterConfigMetastoreConfig metastoreConfig) {
            this.metastoreConfig = metastoreConfig;
            return this;
        }

        public Builder setPreemptibleWorkerConfig(@Nullable ClusterClusterConfigPreemptibleWorkerConfig preemptibleWorkerConfig) {
            this.preemptibleWorkerConfig = preemptibleWorkerConfig;
            return this;
        }

        public Builder setSecurityConfig(@Nullable ClusterClusterConfigSecurityConfig securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }

        public Builder setSoftwareConfig(@Nullable ClusterClusterConfigSoftwareConfig softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }

        public Builder setStagingBucket(@Nullable String stagingBucket) {
            this.stagingBucket = stagingBucket;
            return this;
        }

        public Builder setTempBucket(@Nullable String tempBucket) {
            this.tempBucket = tempBucket;
            return this;
        }

        public Builder setWorkerConfig(@Nullable ClusterClusterConfigWorkerConfig workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }
        public ClusterClusterConfig build() {
            return new ClusterClusterConfig(autoscalingConfig, bucket, encryptionConfig, endpointConfig, gceClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, preemptibleWorkerConfig, securityConfig, softwareConfig, stagingBucket, tempBucket, workerConfig);
        }
    }
}
