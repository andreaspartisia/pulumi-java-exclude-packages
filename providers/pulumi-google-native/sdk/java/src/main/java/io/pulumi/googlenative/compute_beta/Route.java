// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.RouteArgs;
import io.pulumi.googlenative.compute_beta.outputs.RouteAsPathResponse;
import io.pulumi.googlenative.compute_beta.outputs.RouteWarningsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:compute/beta:Route")
public class Route extends io.pulumi.resources.CustomResource {
    @OutputExport(name="asPaths", type=List.class, parameters={RouteAsPathResponse.class})
    private Output<List<RouteAsPathResponse>> asPaths;

    public Output<List<RouteAsPathResponse>> getAsPaths() {
        return this.asPaths;
    }
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="destRange", type=String.class, parameters={})
    private Output<String> destRange;

    public Output<String> getDestRange() {
        return this.destRange;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    public Output<String> getNetwork() {
        return this.network;
    }
    @OutputExport(name="nextHopGateway", type=String.class, parameters={})
    private Output<String> nextHopGateway;

    public Output<String> getNextHopGateway() {
        return this.nextHopGateway;
    }
    @OutputExport(name="nextHopIlb", type=String.class, parameters={})
    private Output<String> nextHopIlb;

    public Output<String> getNextHopIlb() {
        return this.nextHopIlb;
    }
    @OutputExport(name="nextHopInstance", type=String.class, parameters={})
    private Output<String> nextHopInstance;

    public Output<String> getNextHopInstance() {
        return this.nextHopInstance;
    }
    @OutputExport(name="nextHopInterconnectAttachment", type=String.class, parameters={})
    private Output<String> nextHopInterconnectAttachment;

    public Output<String> getNextHopInterconnectAttachment() {
        return this.nextHopInterconnectAttachment;
    }
    @OutputExport(name="nextHopIp", type=String.class, parameters={})
    private Output<String> nextHopIp;

    public Output<String> getNextHopIp() {
        return this.nextHopIp;
    }
    @OutputExport(name="nextHopNetwork", type=String.class, parameters={})
    private Output<String> nextHopNetwork;

    public Output<String> getNextHopNetwork() {
        return this.nextHopNetwork;
    }
    @OutputExport(name="nextHopPeering", type=String.class, parameters={})
    private Output<String> nextHopPeering;

    public Output<String> getNextHopPeering() {
        return this.nextHopPeering;
    }
    @OutputExport(name="nextHopVpnTunnel", type=String.class, parameters={})
    private Output<String> nextHopVpnTunnel;

    public Output<String> getNextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }
    @OutputExport(name="routeType", type=String.class, parameters={})
    private Output<String> routeType;

    public Output<String> getRouteType() {
        return this.routeType;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="warnings", type=List.class, parameters={RouteWarningsItemResponse.class})
    private Output<List<RouteWarningsItemResponse>> warnings;

    public Output<List<RouteWarningsItemResponse>> getWarnings() {
        return this.warnings;
    }

    public Route(String name, @Nullable RouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Route(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Route", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Route get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, options);
    }
}