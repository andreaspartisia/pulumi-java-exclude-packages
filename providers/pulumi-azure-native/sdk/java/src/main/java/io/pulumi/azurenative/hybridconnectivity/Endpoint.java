// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridconnectivity;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridconnectivity.EndpointArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:hybridconnectivity:Endpoint")
public class Endpoint extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdAt;

    public Output</* @Nullable */ String> getCreatedAt() {
        return this.createdAt;
    }
    @OutputExport(name="createdBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdBy;

    public Output</* @Nullable */ String> getCreatedBy() {
        return this.createdBy;
    }
    @OutputExport(name="createdByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdByType;

    public Output</* @Nullable */ String> getCreatedByType() {
        return this.createdByType;
    }
    @OutputExport(name="lastModifiedAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedAt;

    public Output</* @Nullable */ String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    @OutputExport(name="lastModifiedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedBy;

    public Output</* @Nullable */ String> getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    @OutputExport(name="lastModifiedByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedByType;

    public Output</* @Nullable */ String> getLastModifiedByType() {
        return this.lastModifiedByType;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    public Output</* @Nullable */ String> getResourceId() {
        return this.resourceId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Endpoint(String name, EndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridconnectivity:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Endpoint(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridconnectivity:Endpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:hybridconnectivity/v20211006preview:Endpoint").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Endpoint get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, options);
    }
}