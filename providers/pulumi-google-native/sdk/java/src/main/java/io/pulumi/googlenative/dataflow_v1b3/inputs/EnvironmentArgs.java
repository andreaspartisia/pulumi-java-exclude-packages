// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataflow_v1b3.enums.EnvironmentFlexResourceSchedulingGoal;
import io.pulumi.googlenative.dataflow_v1b3.inputs.DebugOptionsArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.WorkerPoolArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @InputImport(name="clusterManagerApiService")
    private final @Nullable Input<String> clusterManagerApiService;

    public Input<String> getClusterManagerApiService() {
        return this.clusterManagerApiService == null ? Input.empty() : this.clusterManagerApiService;
    }

    @InputImport(name="dataset")
    private final @Nullable Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset == null ? Input.empty() : this.dataset;
    }

    @InputImport(name="debugOptions")
    private final @Nullable Input<DebugOptionsArgs> debugOptions;

    public Input<DebugOptionsArgs> getDebugOptions() {
        return this.debugOptions == null ? Input.empty() : this.debugOptions;
    }

    @InputImport(name="experiments")
    private final @Nullable Input<List<String>> experiments;

    public Input<List<String>> getExperiments() {
        return this.experiments == null ? Input.empty() : this.experiments;
    }

    @InputImport(name="flexResourceSchedulingGoal")
    private final @Nullable Input<EnvironmentFlexResourceSchedulingGoal> flexResourceSchedulingGoal;

    public Input<EnvironmentFlexResourceSchedulingGoal> getFlexResourceSchedulingGoal() {
        return this.flexResourceSchedulingGoal == null ? Input.empty() : this.flexResourceSchedulingGoal;
    }

    @InputImport(name="internalExperiments")
    private final @Nullable Input<Map<String,String>> internalExperiments;

    public Input<Map<String,String>> getInternalExperiments() {
        return this.internalExperiments == null ? Input.empty() : this.internalExperiments;
    }

    @InputImport(name="sdkPipelineOptions")
    private final @Nullable Input<Map<String,String>> sdkPipelineOptions;

    public Input<Map<String,String>> getSdkPipelineOptions() {
        return this.sdkPipelineOptions == null ? Input.empty() : this.sdkPipelineOptions;
    }

    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    @InputImport(name="serviceKmsKeyName")
    private final @Nullable Input<String> serviceKmsKeyName;

    public Input<String> getServiceKmsKeyName() {
        return this.serviceKmsKeyName == null ? Input.empty() : this.serviceKmsKeyName;
    }

    @InputImport(name="serviceOptions")
    private final @Nullable Input<List<String>> serviceOptions;

    public Input<List<String>> getServiceOptions() {
        return this.serviceOptions == null ? Input.empty() : this.serviceOptions;
    }

    @InputImport(name="tempStoragePrefix")
    private final @Nullable Input<String> tempStoragePrefix;

    public Input<String> getTempStoragePrefix() {
        return this.tempStoragePrefix == null ? Input.empty() : this.tempStoragePrefix;
    }

    @InputImport(name="userAgent")
    private final @Nullable Input<Map<String,String>> userAgent;

    public Input<Map<String,String>> getUserAgent() {
        return this.userAgent == null ? Input.empty() : this.userAgent;
    }

    @InputImport(name="version")
    private final @Nullable Input<Map<String,String>> version;

    public Input<Map<String,String>> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    @InputImport(name="workerPools")
    private final @Nullable Input<List<WorkerPoolArgs>> workerPools;

    public Input<List<WorkerPoolArgs>> getWorkerPools() {
        return this.workerPools == null ? Input.empty() : this.workerPools;
    }

    @InputImport(name="workerRegion")
    private final @Nullable Input<String> workerRegion;

    public Input<String> getWorkerRegion() {
        return this.workerRegion == null ? Input.empty() : this.workerRegion;
    }

    @InputImport(name="workerZone")
    private final @Nullable Input<String> workerZone;

    public Input<String> getWorkerZone() {
        return this.workerZone == null ? Input.empty() : this.workerZone;
    }

    public EnvironmentArgs(
        @Nullable Input<String> clusterManagerApiService,
        @Nullable Input<String> dataset,
        @Nullable Input<DebugOptionsArgs> debugOptions,
        @Nullable Input<List<String>> experiments,
        @Nullable Input<EnvironmentFlexResourceSchedulingGoal> flexResourceSchedulingGoal,
        @Nullable Input<Map<String,String>> internalExperiments,
        @Nullable Input<Map<String,String>> sdkPipelineOptions,
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<String> serviceKmsKeyName,
        @Nullable Input<List<String>> serviceOptions,
        @Nullable Input<String> tempStoragePrefix,
        @Nullable Input<Map<String,String>> userAgent,
        @Nullable Input<Map<String,String>> version,
        @Nullable Input<List<WorkerPoolArgs>> workerPools,
        @Nullable Input<String> workerRegion,
        @Nullable Input<String> workerZone) {
        this.clusterManagerApiService = clusterManagerApiService;
        this.dataset = dataset;
        this.debugOptions = debugOptions;
        this.experiments = experiments;
        this.flexResourceSchedulingGoal = flexResourceSchedulingGoal;
        this.internalExperiments = internalExperiments;
        this.sdkPipelineOptions = sdkPipelineOptions;
        this.serviceAccountEmail = serviceAccountEmail;
        this.serviceKmsKeyName = serviceKmsKeyName;
        this.serviceOptions = serviceOptions;
        this.tempStoragePrefix = tempStoragePrefix;
        this.userAgent = userAgent;
        this.version = version;
        this.workerPools = workerPools;
        this.workerRegion = workerRegion;
        this.workerZone = workerZone;
    }

    private EnvironmentArgs() {
        this.clusterManagerApiService = Input.empty();
        this.dataset = Input.empty();
        this.debugOptions = Input.empty();
        this.experiments = Input.empty();
        this.flexResourceSchedulingGoal = Input.empty();
        this.internalExperiments = Input.empty();
        this.sdkPipelineOptions = Input.empty();
        this.serviceAccountEmail = Input.empty();
        this.serviceKmsKeyName = Input.empty();
        this.serviceOptions = Input.empty();
        this.tempStoragePrefix = Input.empty();
        this.userAgent = Input.empty();
        this.version = Input.empty();
        this.workerPools = Input.empty();
        this.workerRegion = Input.empty();
        this.workerZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterManagerApiService;
        private @Nullable Input<String> dataset;
        private @Nullable Input<DebugOptionsArgs> debugOptions;
        private @Nullable Input<List<String>> experiments;
        private @Nullable Input<EnvironmentFlexResourceSchedulingGoal> flexResourceSchedulingGoal;
        private @Nullable Input<Map<String,String>> internalExperiments;
        private @Nullable Input<Map<String,String>> sdkPipelineOptions;
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<String> serviceKmsKeyName;
        private @Nullable Input<List<String>> serviceOptions;
        private @Nullable Input<String> tempStoragePrefix;
        private @Nullable Input<Map<String,String>> userAgent;
        private @Nullable Input<Map<String,String>> version;
        private @Nullable Input<List<WorkerPoolArgs>> workerPools;
        private @Nullable Input<String> workerRegion;
        private @Nullable Input<String> workerZone;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterManagerApiService = defaults.clusterManagerApiService;
    	      this.dataset = defaults.dataset;
    	      this.debugOptions = defaults.debugOptions;
    	      this.experiments = defaults.experiments;
    	      this.flexResourceSchedulingGoal = defaults.flexResourceSchedulingGoal;
    	      this.internalExperiments = defaults.internalExperiments;
    	      this.sdkPipelineOptions = defaults.sdkPipelineOptions;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.serviceKmsKeyName = defaults.serviceKmsKeyName;
    	      this.serviceOptions = defaults.serviceOptions;
    	      this.tempStoragePrefix = defaults.tempStoragePrefix;
    	      this.userAgent = defaults.userAgent;
    	      this.version = defaults.version;
    	      this.workerPools = defaults.workerPools;
    	      this.workerRegion = defaults.workerRegion;
    	      this.workerZone = defaults.workerZone;
        }

        public Builder setClusterManagerApiService(@Nullable Input<String> clusterManagerApiService) {
            this.clusterManagerApiService = clusterManagerApiService;
            return this;
        }

        public Builder setClusterManagerApiService(@Nullable String clusterManagerApiService) {
            this.clusterManagerApiService = Input.ofNullable(clusterManagerApiService);
            return this;
        }

        public Builder setDataset(@Nullable Input<String> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder setDataset(@Nullable String dataset) {
            this.dataset = Input.ofNullable(dataset);
            return this;
        }

        public Builder setDebugOptions(@Nullable Input<DebugOptionsArgs> debugOptions) {
            this.debugOptions = debugOptions;
            return this;
        }

        public Builder setDebugOptions(@Nullable DebugOptionsArgs debugOptions) {
            this.debugOptions = Input.ofNullable(debugOptions);
            return this;
        }

        public Builder setExperiments(@Nullable Input<List<String>> experiments) {
            this.experiments = experiments;
            return this;
        }

        public Builder setExperiments(@Nullable List<String> experiments) {
            this.experiments = Input.ofNullable(experiments);
            return this;
        }

        public Builder setFlexResourceSchedulingGoal(@Nullable Input<EnvironmentFlexResourceSchedulingGoal> flexResourceSchedulingGoal) {
            this.flexResourceSchedulingGoal = flexResourceSchedulingGoal;
            return this;
        }

        public Builder setFlexResourceSchedulingGoal(@Nullable EnvironmentFlexResourceSchedulingGoal flexResourceSchedulingGoal) {
            this.flexResourceSchedulingGoal = Input.ofNullable(flexResourceSchedulingGoal);
            return this;
        }

        public Builder setInternalExperiments(@Nullable Input<Map<String,String>> internalExperiments) {
            this.internalExperiments = internalExperiments;
            return this;
        }

        public Builder setInternalExperiments(@Nullable Map<String,String> internalExperiments) {
            this.internalExperiments = Input.ofNullable(internalExperiments);
            return this;
        }

        public Builder setSdkPipelineOptions(@Nullable Input<Map<String,String>> sdkPipelineOptions) {
            this.sdkPipelineOptions = sdkPipelineOptions;
            return this;
        }

        public Builder setSdkPipelineOptions(@Nullable Map<String,String> sdkPipelineOptions) {
            this.sdkPipelineOptions = Input.ofNullable(sdkPipelineOptions);
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }

        public Builder setServiceKmsKeyName(@Nullable Input<String> serviceKmsKeyName) {
            this.serviceKmsKeyName = serviceKmsKeyName;
            return this;
        }

        public Builder setServiceKmsKeyName(@Nullable String serviceKmsKeyName) {
            this.serviceKmsKeyName = Input.ofNullable(serviceKmsKeyName);
            return this;
        }

        public Builder setServiceOptions(@Nullable Input<List<String>> serviceOptions) {
            this.serviceOptions = serviceOptions;
            return this;
        }

        public Builder setServiceOptions(@Nullable List<String> serviceOptions) {
            this.serviceOptions = Input.ofNullable(serviceOptions);
            return this;
        }

        public Builder setTempStoragePrefix(@Nullable Input<String> tempStoragePrefix) {
            this.tempStoragePrefix = tempStoragePrefix;
            return this;
        }

        public Builder setTempStoragePrefix(@Nullable String tempStoragePrefix) {
            this.tempStoragePrefix = Input.ofNullable(tempStoragePrefix);
            return this;
        }

        public Builder setUserAgent(@Nullable Input<Map<String,String>> userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public Builder setUserAgent(@Nullable Map<String,String> userAgent) {
            this.userAgent = Input.ofNullable(userAgent);
            return this;
        }

        public Builder setVersion(@Nullable Input<Map<String,String>> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Map<String,String> version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setWorkerPools(@Nullable Input<List<WorkerPoolArgs>> workerPools) {
            this.workerPools = workerPools;
            return this;
        }

        public Builder setWorkerPools(@Nullable List<WorkerPoolArgs> workerPools) {
            this.workerPools = Input.ofNullable(workerPools);
            return this;
        }

        public Builder setWorkerRegion(@Nullable Input<String> workerRegion) {
            this.workerRegion = workerRegion;
            return this;
        }

        public Builder setWorkerRegion(@Nullable String workerRegion) {
            this.workerRegion = Input.ofNullable(workerRegion);
            return this;
        }

        public Builder setWorkerZone(@Nullable Input<String> workerZone) {
            this.workerZone = workerZone;
            return this;
        }

        public Builder setWorkerZone(@Nullable String workerZone) {
            this.workerZone = Input.ofNullable(workerZone);
            return this;
        }

        public EnvironmentArgs build() {
            return new EnvironmentArgs(clusterManagerApiService, dataset, debugOptions, experiments, flexResourceSchedulingGoal, internalExperiments, sdkPipelineOptions, serviceAccountEmail, serviceKmsKeyName, serviceOptions, tempStoragePrefix, userAgent, version, workerPools, workerRegion, workerZone);
        }
    }
}