// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.P2sVpnGatewayArgs;
import io.pulumi.azurenative.network.outputs.P2SConnectionConfigurationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VpnClientConnectionHealthResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:P2sVpnGateway")
public class P2sVpnGateway extends io.pulumi.resources.CustomResource {
    @OutputExport(name="customDnsServers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customDnsServers;

    public Output</* @Nullable */ List<String>> getCustomDnsServers() {
        return this.customDnsServers;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="isRoutingPreferenceInternet", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isRoutingPreferenceInternet;

    public Output</* @Nullable */ Boolean> getIsRoutingPreferenceInternet() {
        return this.isRoutingPreferenceInternet;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="p2SConnectionConfigurations", type=List.class, parameters={P2SConnectionConfigurationResponse.class})
    private Output</* @Nullable */ List<P2SConnectionConfigurationResponse>> p2SConnectionConfigurations;

    public Output</* @Nullable */ List<P2SConnectionConfigurationResponse>> getP2SConnectionConfigurations() {
        return this.p2SConnectionConfigurations;
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
    @OutputExport(name="virtualHub", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> virtualHub;

    public Output</* @Nullable */ SubResourceResponse> getVirtualHub() {
        return this.virtualHub;
    }
    @OutputExport(name="vpnClientConnectionHealth", type=VpnClientConnectionHealthResponse.class, parameters={})
    private Output<VpnClientConnectionHealthResponse> vpnClientConnectionHealth;

    public Output<VpnClientConnectionHealthResponse> getVpnClientConnectionHealth() {
        return this.vpnClientConnectionHealth;
    }
    @OutputExport(name="vpnGatewayScaleUnit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> vpnGatewayScaleUnit;

    public Output</* @Nullable */ Integer> getVpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }
    @OutputExport(name="vpnServerConfiguration", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> vpnServerConfiguration;

    public Output</* @Nullable */ SubResourceResponse> getVpnServerConfiguration() {
        return this.vpnServerConfiguration;
    }

    public P2sVpnGateway(String name, P2sVpnGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:P2sVpnGateway", name, args == null ? P2sVpnGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private P2sVpnGateway(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:P2sVpnGateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180801:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:P2sVpnGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:P2sVpnGateway").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static P2sVpnGateway get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new P2sVpnGateway(name, id, options);
    }
}