// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.SecretArgs;
import io.pulumi.azurenative.cdn.outputs.CustomerCertificateParametersResponse;
import io.pulumi.azurenative.cdn.outputs.ManagedCertificateParametersResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.azurenative.cdn.outputs.UrlSigningKeyParametersResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:cdn:Secret")
public class Secret extends io.pulumi.resources.CustomResource {
    @OutputExport(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    public Output<String> getDeploymentStatus() {
        return this.deploymentStatus;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="parameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> parameters;

    public Output</* @Nullable */ Object> getParameters() {
        return this.parameters;
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
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Secret(String name, SecretArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Secret", name, args == null ? SecretArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Secret(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Secret", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cdn/v20200901:Secret").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20210601:Secret").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Secret get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Secret(name, id, options);
    }
}