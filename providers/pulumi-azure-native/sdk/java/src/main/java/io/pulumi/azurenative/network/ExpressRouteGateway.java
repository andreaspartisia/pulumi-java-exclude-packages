// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ExpressRouteGatewayArgs;
import io.pulumi.azurenative.network.outputs.ExpressRouteConnectionResponse;
import io.pulumi.azurenative.network.outputs.ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration;
import io.pulumi.azurenative.network.outputs.VirtualHubIdResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:ExpressRouteGateway")
public class ExpressRouteGateway extends io.pulumi.resources.CustomResource {
    @OutputExport(name="autoScaleConfiguration", type=ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration.class, parameters={})
    private Output</* @Nullable */ ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration> autoScaleConfiguration;

    public Output</* @Nullable */ ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration> getAutoScaleConfiguration() {
        return this.autoScaleConfiguration;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="expressRouteConnections", type=List.class, parameters={ExpressRouteConnectionResponse.class})
    private Output<List<ExpressRouteConnectionResponse>> expressRouteConnections;

    public Output<List<ExpressRouteConnectionResponse>> getExpressRouteConnections() {
        return this.expressRouteConnections;
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
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="virtualHub", type=VirtualHubIdResponse.class, parameters={})
    private Output<VirtualHubIdResponse> virtualHub;

    public Output<VirtualHubIdResponse> getVirtualHub() {
        return this.virtualHub;
    }

    public ExpressRouteGateway(String name, ExpressRouteGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteGateway", name, args == null ? ExpressRouteGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ExpressRouteGateway(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteGateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180801:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:ExpressRouteGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:ExpressRouteGateway").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ExpressRouteGateway get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteGateway(name, id, options);
    }
}