// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.ResourcePolicyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyGroupPlacementPolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyInstanceSchedulePolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyResourceStatusResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicySnapshotSchedulePolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyVmMaintenancePolicyResponse;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="google-native:compute/alpha:ResourcePolicy")
public class ResourcePolicy extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="groupPlacementPolicy", type=ResourcePolicyGroupPlacementPolicyResponse.class, parameters={})
    private Output<ResourcePolicyGroupPlacementPolicyResponse> groupPlacementPolicy;

    public Output<ResourcePolicyGroupPlacementPolicyResponse> getGroupPlacementPolicy() {
        return this.groupPlacementPolicy;
    }
    @OutputExport(name="instanceSchedulePolicy", type=ResourcePolicyInstanceSchedulePolicyResponse.class, parameters={})
    private Output<ResourcePolicyInstanceSchedulePolicyResponse> instanceSchedulePolicy;

    public Output<ResourcePolicyInstanceSchedulePolicyResponse> getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
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
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @OutputExport(name="resourceStatus", type=ResourcePolicyResourceStatusResponse.class, parameters={})
    private Output<ResourcePolicyResourceStatusResponse> resourceStatus;

    public Output<ResourcePolicyResourceStatusResponse> getResourceStatus() {
        return this.resourceStatus;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    @OutputExport(name="snapshotSchedulePolicy", type=ResourcePolicySnapshotSchedulePolicyResponse.class, parameters={})
    private Output<ResourcePolicySnapshotSchedulePolicyResponse> snapshotSchedulePolicy;

    public Output<ResourcePolicySnapshotSchedulePolicyResponse> getSnapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="vmMaintenancePolicy", type=ResourcePolicyVmMaintenancePolicyResponse.class, parameters={})
    private Output<ResourcePolicyVmMaintenancePolicyResponse> vmMaintenancePolicy;

    public Output<ResourcePolicyVmMaintenancePolicyResponse> getVmMaintenancePolicy() {
        return this.vmMaintenancePolicy;
    }

    public ResourcePolicy(String name, ResourcePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:ResourcePolicy", name, args == null ? ResourcePolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourcePolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:ResourcePolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ResourcePolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicy(name, id, options);
    }
}