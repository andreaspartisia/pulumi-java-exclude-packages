// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databricks.VNetPeeringArgs;
import io.pulumi.azurenative.databricks.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.databricks.outputs.VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork;
import io.pulumi.azurenative.databricks.outputs.VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:databricks:vNetPeering")
public class VNetPeering extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allowForwardedTraffic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowForwardedTraffic;

    public Output</* @Nullable */ Boolean> getAllowForwardedTraffic() {
        return this.allowForwardedTraffic;
    }
    @OutputExport(name="allowGatewayTransit", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowGatewayTransit;

    public Output</* @Nullable */ Boolean> getAllowGatewayTransit() {
        return this.allowGatewayTransit;
    }
    @OutputExport(name="allowVirtualNetworkAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowVirtualNetworkAccess;

    public Output</* @Nullable */ Boolean> getAllowVirtualNetworkAccess() {
        return this.allowVirtualNetworkAccess;
    }
    @OutputExport(name="databricksAddressSpace", type=AddressSpaceResponse.class, parameters={})
    private Output</* @Nullable */ AddressSpaceResponse> databricksAddressSpace;

    public Output</* @Nullable */ AddressSpaceResponse> getDatabricksAddressSpace() {
        return this.databricksAddressSpace;
    }
    @OutputExport(name="databricksVirtualNetwork", type=VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork> databricksVirtualNetwork;

    public Output</* @Nullable */ VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork> getDatabricksVirtualNetwork() {
        return this.databricksVirtualNetwork;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="peeringState", type=String.class, parameters={})
    private Output<String> peeringState;

    public Output<String> getPeeringState() {
        return this.peeringState;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="remoteAddressSpace", type=AddressSpaceResponse.class, parameters={})
    private Output</* @Nullable */ AddressSpaceResponse> remoteAddressSpace;

    public Output</* @Nullable */ AddressSpaceResponse> getRemoteAddressSpace() {
        return this.remoteAddressSpace;
    }
    @OutputExport(name="remoteVirtualNetwork", type=VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork.class, parameters={})
    private Output<VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork> remoteVirtualNetwork;

    public Output<VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork> getRemoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="useRemoteGateways", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useRemoteGateways;

    public Output</* @Nullable */ Boolean> getUseRemoteGateways() {
        return this.useRemoteGateways;
    }

    public VNetPeering(String name, VNetPeeringArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databricks:vNetPeering", name, args == null ? VNetPeeringArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VNetPeering(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databricks:vNetPeering", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databricks/v20180401:vNetPeering").build()),
                Input.of(Alias.builder().setType("azure-native:databricks/v20210401preview:vNetPeering").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static VNetPeering get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VNetPeering(name, id, options);
    }
}