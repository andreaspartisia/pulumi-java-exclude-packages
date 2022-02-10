// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.ExportPipelineArgs;
import io.pulumi.azurenative.containerregistry.outputs.ExportPipelineTargetPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:containerregistry:ExportPipeline")
public class ExportPipeline extends io.pulumi.resources.CustomResource {
    @OutputExport(name="identity", type=IdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IdentityPropertiesResponse> identity;

    public Output</* @Nullable */ IdentityPropertiesResponse> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="options", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> options;

    public Output</* @Nullable */ List<String>> getOptions() {
        return this.options;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="target", type=ExportPipelineTargetPropertiesResponse.class, parameters={})
    private Output<ExportPipelineTargetPropertiesResponse> target;

    public Output<ExportPipelineTargetPropertiesResponse> getTarget() {
        return this.target;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ExportPipeline(String name, ExportPipelineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:ExportPipeline", name, args == null ? ExportPipelineArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ExportPipeline(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:ExportPipeline", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20191201preview:ExportPipeline").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20201101preview:ExportPipeline").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210601preview:ExportPipeline").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210801preview:ExportPipeline").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20211201preview:ExportPipeline").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ExportPipeline get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExportPipeline(name, id, options);
    }
}