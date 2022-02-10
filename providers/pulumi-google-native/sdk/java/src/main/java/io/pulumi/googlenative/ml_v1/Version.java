// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ml_v1.VersionArgs;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__AcceleratorConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__AutoScalingResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ContainerSpecResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ExplanationConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ManualScalingResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__RequestLoggingConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__RouteMapResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:ml/v1:Version")
public class Version extends io.pulumi.resources.CustomResource {
    @OutputExport(name="acceleratorConfig", type=GoogleCloudMlV1__AcceleratorConfigResponse.class, parameters={})
    private Output<GoogleCloudMlV1__AcceleratorConfigResponse> acceleratorConfig;

    public Output<GoogleCloudMlV1__AcceleratorConfigResponse> getAcceleratorConfig() {
        return this.acceleratorConfig;
    }
    @OutputExport(name="autoScaling", type=GoogleCloudMlV1__AutoScalingResponse.class, parameters={})
    private Output<GoogleCloudMlV1__AutoScalingResponse> autoScaling;

    public Output<GoogleCloudMlV1__AutoScalingResponse> getAutoScaling() {
        return this.autoScaling;
    }
    @OutputExport(name="container", type=GoogleCloudMlV1__ContainerSpecResponse.class, parameters={})
    private Output<GoogleCloudMlV1__ContainerSpecResponse> container;

    public Output<GoogleCloudMlV1__ContainerSpecResponse> getContainer() {
        return this.container;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="deploymentUri", type=String.class, parameters={})
    private Output<String> deploymentUri;

    public Output<String> getDeploymentUri() {
        return this.deploymentUri;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    public Output<String> getErrorMessage() {
        return this.errorMessage;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="explanationConfig", type=GoogleCloudMlV1__ExplanationConfigResponse.class, parameters={})
    private Output<GoogleCloudMlV1__ExplanationConfigResponse> explanationConfig;

    public Output<GoogleCloudMlV1__ExplanationConfigResponse> getExplanationConfig() {
        return this.explanationConfig;
    }
    @OutputExport(name="framework", type=String.class, parameters={})
    private Output<String> framework;

    public Output<String> getFramework() {
        return this.framework;
    }
    @OutputExport(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    public Output<Boolean> getIsDefault() {
        return this.isDefault;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="lastMigrationModelId", type=String.class, parameters={})
    private Output<String> lastMigrationModelId;

    public Output<String> getLastMigrationModelId() {
        return this.lastMigrationModelId;
    }
    @OutputExport(name="lastMigrationTime", type=String.class, parameters={})
    private Output<String> lastMigrationTime;

    public Output<String> getLastMigrationTime() {
        return this.lastMigrationTime;
    }
    @OutputExport(name="lastUseTime", type=String.class, parameters={})
    private Output<String> lastUseTime;

    public Output<String> getLastUseTime() {
        return this.lastUseTime;
    }
    @OutputExport(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType;
    }
    @OutputExport(name="manualScaling", type=GoogleCloudMlV1__ManualScalingResponse.class, parameters={})
    private Output<GoogleCloudMlV1__ManualScalingResponse> manualScaling;

    public Output<GoogleCloudMlV1__ManualScalingResponse> getManualScaling() {
        return this.manualScaling;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="packageUris", type=List.class, parameters={String.class})
    private Output<List<String>> packageUris;

    public Output<List<String>> getPackageUris() {
        return this.packageUris;
    }
    @OutputExport(name="predictionClass", type=String.class, parameters={})
    private Output<String> predictionClass;

    public Output<String> getPredictionClass() {
        return this.predictionClass;
    }
    @OutputExport(name="pythonVersion", type=String.class, parameters={})
    private Output<String> pythonVersion;

    public Output<String> getPythonVersion() {
        return this.pythonVersion;
    }
    @OutputExport(name="requestLoggingConfig", type=GoogleCloudMlV1__RequestLoggingConfigResponse.class, parameters={})
    private Output<GoogleCloudMlV1__RequestLoggingConfigResponse> requestLoggingConfig;

    public Output<GoogleCloudMlV1__RequestLoggingConfigResponse> getRequestLoggingConfig() {
        return this.requestLoggingConfig;
    }
    @OutputExport(name="routes", type=GoogleCloudMlV1__RouteMapResponse.class, parameters={})
    private Output<GoogleCloudMlV1__RouteMapResponse> routes;

    public Output<GoogleCloudMlV1__RouteMapResponse> getRoutes() {
        return this.routes;
    }
    @OutputExport(name="runtimeVersion", type=String.class, parameters={})
    private Output<String> runtimeVersion;

    public Output<String> getRuntimeVersion() {
        return this.runtimeVersion;
    }
    @OutputExport(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }

    public Version(String name, VersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Version", name, args == null ? VersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Version(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Version", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Version get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Version(name, id, options);
    }
}