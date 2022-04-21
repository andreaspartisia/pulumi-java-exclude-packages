// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.machinelearningservices.enums.VariantType;
import com.pulumi.azurenative.machinelearningservices.inputs.AKSServiceCreateRequestAutoScalerArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.AKSServiceCreateRequestDataCollectionArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.AKSServiceCreateRequestLivenessProbeRequirementsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ContainerResourceRequirementsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.CreateServiceRequestEnvironmentImageRequestArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.CreateServiceRequestKeysArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AKSServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AKSServiceArgs Empty = new AKSServiceArgs();

    /**
     * Whether or not AAD authentication is enabled.
     * 
     */
    @Import(name="aadAuthEnabled")
    private @Nullable Output<Boolean> aadAuthEnabled;

    public Optional<Output<Boolean>> aadAuthEnabled() {
        return Optional.ofNullable(this.aadAuthEnabled);
    }

    /**
     * Whether or not Application Insights is enabled.
     * 
     */
    @Import(name="appInsightsEnabled")
    private @Nullable Output<Boolean> appInsightsEnabled;

    public Optional<Output<Boolean>> appInsightsEnabled() {
        return Optional.ofNullable(this.appInsightsEnabled);
    }

    /**
     * Whether or not authentication is enabled.
     * 
     */
    @Import(name="authEnabled")
    private @Nullable Output<Boolean> authEnabled;

    public Optional<Output<Boolean>> authEnabled() {
        return Optional.ofNullable(this.authEnabled);
    }

    /**
     * The auto scaler properties.
     * 
     */
    @Import(name="autoScaler")
    private @Nullable Output<AKSServiceCreateRequestAutoScalerArgs> autoScaler;

    public Optional<Output<AKSServiceCreateRequestAutoScalerArgs>> autoScaler() {
        return Optional.ofNullable(this.autoScaler);
    }

    /**
     * The name of the compute resource.
     * 
     */
    @Import(name="computeName")
    private @Nullable Output<String> computeName;

    public Optional<Output<String>> computeName() {
        return Optional.ofNullable(this.computeName);
    }

    /**
     * The compute environment type for the service.
     * Expected value is &#39;AKS&#39;.
     * 
     */
    @Import(name="computeType", required=true)
    private Output<String> computeType;

    public Output<String> computeType() {
        return this.computeType;
    }

    /**
     * The container resource requirements.
     * 
     */
    @Import(name="containerResourceRequirements")
    private @Nullable Output<ContainerResourceRequirementsArgs> containerResourceRequirements;

    public Optional<Output<ContainerResourceRequirementsArgs>> containerResourceRequirements() {
        return Optional.ofNullable(this.containerResourceRequirements);
    }

    /**
     * Details of the data collection options specified.
     * 
     */
    @Import(name="dataCollection")
    private @Nullable Output<AKSServiceCreateRequestDataCollectionArgs> dataCollection;

    public Optional<Output<AKSServiceCreateRequestDataCollectionArgs>> dataCollection() {
        return Optional.ofNullable(this.dataCollection);
    }

    /**
     * The description of the service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Environment, models and assets needed for inferencing.
     * 
     */
    @Import(name="environmentImageRequest")
    private @Nullable Output<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest;

    public Optional<Output<CreateServiceRequestEnvironmentImageRequestArgs>> environmentImageRequest() {
        return Optional.ofNullable(this.environmentImageRequest);
    }

    /**
     * Is this the default variant.
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * The authentication keys.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<CreateServiceRequestKeysArgs> keys;

    public Optional<Output<CreateServiceRequestKeysArgs>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    @Import(name="kvTags")
    private @Nullable Output<Map<String,String>> kvTags;

    public Optional<Output<Map<String,String>>> kvTags() {
        return Optional.ofNullable(this.kvTags);
    }

    /**
     * The liveness probe requirements.
     * 
     */
    @Import(name="livenessProbeRequirements")
    private @Nullable Output<AKSServiceCreateRequestLivenessProbeRequirementsArgs> livenessProbeRequirements;

    public Optional<Output<AKSServiceCreateRequestLivenessProbeRequirementsArgs>> livenessProbeRequirements() {
        return Optional.ofNullable(this.livenessProbeRequirements);
    }

    /**
     * The name of the Azure location/region.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The maximum number of concurrent requests per container.
     * 
     */
    @Import(name="maxConcurrentRequestsPerContainer")
    private @Nullable Output<Integer> maxConcurrentRequestsPerContainer;

    public Optional<Output<Integer>> maxConcurrentRequestsPerContainer() {
        return Optional.ofNullable(this.maxConcurrentRequestsPerContainer);
    }

    /**
     * Maximum time a request will wait in the queue (in milliseconds). After this time, the service will return 503 (Service Unavailable)
     * 
     */
    @Import(name="maxQueueWaitMs")
    private @Nullable Output<Integer> maxQueueWaitMs;

    public Optional<Output<Integer>> maxQueueWaitMs() {
        return Optional.ofNullable(this.maxQueueWaitMs);
    }

    /**
     * Kubernetes namespace for the service.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The number of replicas on the cluster.
     * 
     */
    @Import(name="numReplicas")
    private @Nullable Output<Integer> numReplicas;

    public Optional<Output<Integer>> numReplicas() {
        return Optional.ofNullable(this.numReplicas);
    }

    /**
     * The service properties dictionary. Properties are immutable.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The scoring timeout in milliseconds.
     * 
     */
    @Import(name="scoringTimeoutMs")
    private @Nullable Output<Integer> scoringTimeoutMs;

    public Optional<Output<Integer>> scoringTimeoutMs() {
        return Optional.ofNullable(this.scoringTimeoutMs);
    }

    /**
     * Name of the Azure Machine Learning service.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * The amount of traffic variant receives.
     * 
     */
    @Import(name="trafficPercentile")
    private @Nullable Output<Double> trafficPercentile;

    public Optional<Output<Double>> trafficPercentile() {
        return Optional.ofNullable(this.trafficPercentile);
    }

    /**
     * The type of the variant.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,VariantType>> type;

    public Optional<Output<Either<String,VariantType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private AKSServiceArgs() {}

    private AKSServiceArgs(AKSServiceArgs $) {
        this.aadAuthEnabled = $.aadAuthEnabled;
        this.appInsightsEnabled = $.appInsightsEnabled;
        this.authEnabled = $.authEnabled;
        this.autoScaler = $.autoScaler;
        this.computeName = $.computeName;
        this.computeType = $.computeType;
        this.containerResourceRequirements = $.containerResourceRequirements;
        this.dataCollection = $.dataCollection;
        this.description = $.description;
        this.environmentImageRequest = $.environmentImageRequest;
        this.isDefault = $.isDefault;
        this.keys = $.keys;
        this.kvTags = $.kvTags;
        this.livenessProbeRequirements = $.livenessProbeRequirements;
        this.location = $.location;
        this.maxConcurrentRequestsPerContainer = $.maxConcurrentRequestsPerContainer;
        this.maxQueueWaitMs = $.maxQueueWaitMs;
        this.namespace = $.namespace;
        this.numReplicas = $.numReplicas;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.scoringTimeoutMs = $.scoringTimeoutMs;
        this.serviceName = $.serviceName;
        this.trafficPercentile = $.trafficPercentile;
        this.type = $.type;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AKSServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AKSServiceArgs $;

        public Builder() {
            $ = new AKSServiceArgs();
        }

        public Builder(AKSServiceArgs defaults) {
            $ = new AKSServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder aadAuthEnabled(@Nullable Output<Boolean> aadAuthEnabled) {
            $.aadAuthEnabled = aadAuthEnabled;
            return this;
        }

        public Builder aadAuthEnabled(Boolean aadAuthEnabled) {
            return aadAuthEnabled(Output.of(aadAuthEnabled));
        }

        public Builder appInsightsEnabled(@Nullable Output<Boolean> appInsightsEnabled) {
            $.appInsightsEnabled = appInsightsEnabled;
            return this;
        }

        public Builder appInsightsEnabled(Boolean appInsightsEnabled) {
            return appInsightsEnabled(Output.of(appInsightsEnabled));
        }

        public Builder authEnabled(@Nullable Output<Boolean> authEnabled) {
            $.authEnabled = authEnabled;
            return this;
        }

        public Builder authEnabled(Boolean authEnabled) {
            return authEnabled(Output.of(authEnabled));
        }

        public Builder autoScaler(@Nullable Output<AKSServiceCreateRequestAutoScalerArgs> autoScaler) {
            $.autoScaler = autoScaler;
            return this;
        }

        public Builder autoScaler(AKSServiceCreateRequestAutoScalerArgs autoScaler) {
            return autoScaler(Output.of(autoScaler));
        }

        public Builder computeName(@Nullable Output<String> computeName) {
            $.computeName = computeName;
            return this;
        }

        public Builder computeName(String computeName) {
            return computeName(Output.of(computeName));
        }

        public Builder computeType(Output<String> computeType) {
            $.computeType = computeType;
            return this;
        }

        public Builder computeType(String computeType) {
            return computeType(Output.of(computeType));
        }

        public Builder containerResourceRequirements(@Nullable Output<ContainerResourceRequirementsArgs> containerResourceRequirements) {
            $.containerResourceRequirements = containerResourceRequirements;
            return this;
        }

        public Builder containerResourceRequirements(ContainerResourceRequirementsArgs containerResourceRequirements) {
            return containerResourceRequirements(Output.of(containerResourceRequirements));
        }

        public Builder dataCollection(@Nullable Output<AKSServiceCreateRequestDataCollectionArgs> dataCollection) {
            $.dataCollection = dataCollection;
            return this;
        }

        public Builder dataCollection(AKSServiceCreateRequestDataCollectionArgs dataCollection) {
            return dataCollection(Output.of(dataCollection));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder environmentImageRequest(@Nullable Output<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest) {
            $.environmentImageRequest = environmentImageRequest;
            return this;
        }

        public Builder environmentImageRequest(CreateServiceRequestEnvironmentImageRequestArgs environmentImageRequest) {
            return environmentImageRequest(Output.of(environmentImageRequest));
        }

        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        public Builder keys(@Nullable Output<CreateServiceRequestKeysArgs> keys) {
            $.keys = keys;
            return this;
        }

        public Builder keys(CreateServiceRequestKeysArgs keys) {
            return keys(Output.of(keys));
        }

        public Builder kvTags(@Nullable Output<Map<String,String>> kvTags) {
            $.kvTags = kvTags;
            return this;
        }

        public Builder kvTags(Map<String,String> kvTags) {
            return kvTags(Output.of(kvTags));
        }

        public Builder livenessProbeRequirements(@Nullable Output<AKSServiceCreateRequestLivenessProbeRequirementsArgs> livenessProbeRequirements) {
            $.livenessProbeRequirements = livenessProbeRequirements;
            return this;
        }

        public Builder livenessProbeRequirements(AKSServiceCreateRequestLivenessProbeRequirementsArgs livenessProbeRequirements) {
            return livenessProbeRequirements(Output.of(livenessProbeRequirements));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder maxConcurrentRequestsPerContainer(@Nullable Output<Integer> maxConcurrentRequestsPerContainer) {
            $.maxConcurrentRequestsPerContainer = maxConcurrentRequestsPerContainer;
            return this;
        }

        public Builder maxConcurrentRequestsPerContainer(Integer maxConcurrentRequestsPerContainer) {
            return maxConcurrentRequestsPerContainer(Output.of(maxConcurrentRequestsPerContainer));
        }

        public Builder maxQueueWaitMs(@Nullable Output<Integer> maxQueueWaitMs) {
            $.maxQueueWaitMs = maxQueueWaitMs;
            return this;
        }

        public Builder maxQueueWaitMs(Integer maxQueueWaitMs) {
            return maxQueueWaitMs(Output.of(maxQueueWaitMs));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder numReplicas(@Nullable Output<Integer> numReplicas) {
            $.numReplicas = numReplicas;
            return this;
        }

        public Builder numReplicas(Integer numReplicas) {
            return numReplicas(Output.of(numReplicas));
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder scoringTimeoutMs(@Nullable Output<Integer> scoringTimeoutMs) {
            $.scoringTimeoutMs = scoringTimeoutMs;
            return this;
        }

        public Builder scoringTimeoutMs(Integer scoringTimeoutMs) {
            return scoringTimeoutMs(Output.of(scoringTimeoutMs));
        }

        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder trafficPercentile(@Nullable Output<Double> trafficPercentile) {
            $.trafficPercentile = trafficPercentile;
            return this;
        }

        public Builder trafficPercentile(Double trafficPercentile) {
            return trafficPercentile(Output.of(trafficPercentile));
        }

        public Builder type(@Nullable Output<Either<String,VariantType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,VariantType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(VariantType type) {
            return type(Either.ofRight(type));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public AKSServiceArgs build() {
            $.computeType = Codegen.stringProp("computeType").output().arg($.computeType).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
