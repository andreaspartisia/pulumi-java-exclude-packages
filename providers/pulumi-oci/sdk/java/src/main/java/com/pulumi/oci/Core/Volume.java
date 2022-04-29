// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Core.VolumeArgs;
import com.pulumi.oci.Core.inputs.VolumeState;
import com.pulumi.oci.Core.outputs.VolumeBlockVolumeReplica;
import com.pulumi.oci.Core.outputs.VolumeSourceDetails;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Volume resource in Oracle Cloud Infrastructure Core service.
 * 
 * Creates a new volume in the specified compartment. Volumes can be created in sizes ranging from
 * 50 GB (51200 MB) to 32 TB (33554432 MB), in 1 GB (1024 MB) increments. By default, volumes are 1 TB (1048576 MB).
 * For general information about block volumes, see
 * [Overview of Block Volume Service](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm).
 * 
 * A volume and instance can be in separate compartments but must be in the same availability domain.
 * For information about access control and compartments, see
 * [Overview of the IAM Service](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For information about
 * availability domains, see [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
 * To get a list of availability domains, use the `ListAvailabilityDomains` operation
 * in the Identity and Access Management Service API.
 * 
 * You may optionally specify a *display name* for the volume, which is simply a friendly name or
 * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Volumes can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Core/volume:Volume test_volume &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Core/volume:Volume")
public class Volume extends com.pulumi.resources.CustomResource {
    /**
     * The number of Volume Performance Units per GB that this volume is effectively tuned to when it&#39;s idle.
     * 
     */
    @Export(name="autoTunedVpusPerGb", type=String.class, parameters={})
    private Output<String> autoTunedVpusPerGb;

    /**
     * @return The number of Volume Performance Units per GB that this volume is effectively tuned to when it&#39;s idle.
     * 
     */
    public Output<String> autoTunedVpusPerGb() {
        return this.autoTunedVpusPerGb;
    }
    /**
     * (Updatable) The availability domain of the block volume replica.  Example: `Uocm:PHX-AD-1`
     * 
     */
    @Export(name="availabilityDomain", type=String.class, parameters={})
    private Output<String> availabilityDomain;

    /**
     * @return (Updatable) The availability domain of the block volume replica.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public Output<String> availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * If provided, specifies the ID of the volume backup policy to assign to the newly created volume. If omitted, no policy will be assigned.
     * 
     * @deprecated
     * The &#39;backup_policy_id&#39; field has been deprecated. Please use the &#39;oci_core_volume_backup_policy_assignment&#39; resource instead.
     * 
     */
    @Deprecated /* The 'backup_policy_id' field has been deprecated. Please use the 'oci_core_volume_backup_policy_assignment' resource instead. */
    @Export(name="backupPolicyId", type=String.class, parameters={})
    private Output<String> backupPolicyId;

    /**
     * @return If provided, specifies the ID of the volume backup policy to assign to the newly created volume. If omitted, no policy will be assigned.
     * 
     */
    public Output<String> backupPolicyId() {
        return this.backupPolicyId;
    }
    /**
     * (Updatable) The list of block volume replicas to be enabled for this volume in the specified destination availability domains.
     * 
     */
    @Export(name="blockVolumeReplicas", type=List.class, parameters={VolumeBlockVolumeReplica.class})
    private Output<List<VolumeBlockVolumeReplica>> blockVolumeReplicas;

    /**
     * @return (Updatable) The list of block volume replicas to be enabled for this volume in the specified destination availability domains.
     * 
     */
    public Output<List<VolumeBlockVolumeReplica>> blockVolumeReplicas() {
        return this.blockVolumeReplicas;
    }
    @Export(name="blockVolumeReplicasDeletion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> blockVolumeReplicasDeletion;

    public Output<Optional<Boolean>> blockVolumeReplicasDeletion() {
        return Codegen.optional(this.blockVolumeReplicasDeletion);
    }
    /**
     * (Updatable) The OCID of the compartment that contains the volume.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment that contains the volume.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * (Updatable) Specifies whether the auto-tune performance is enabled for this boot volume.
     * 
     */
    @Export(name="isAutoTuneEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isAutoTuneEnabled;

    /**
     * @return (Updatable) Specifies whether the auto-tune performance is enabled for this boot volume.
     * 
     */
    public Output<Boolean> isAutoTuneEnabled() {
        return this.isAutoTuneEnabled;
    }
    /**
     * Specifies whether the cloned volume&#39;s data has finished copying from the source volume or backup.
     * 
     */
    @Export(name="isHydrated", type=Boolean.class, parameters={})
    private Output<Boolean> isHydrated;

    /**
     * @return Specifies whether the cloned volume&#39;s data has finished copying from the source volume or backup.
     * 
     */
    public Output<Boolean> isHydrated() {
        return this.isHydrated;
    }
    /**
     * (Updatable) The OCID of the Key Management key to assign as the master encryption key for the volume.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return (Updatable) The OCID of the Key Management key to assign as the master encryption key for the volume.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * (Updatable) The size of the volume in GBs.
     * 
     */
    @Export(name="sizeInGbs", type=String.class, parameters={})
    private Output<String> sizeInGbs;

    /**
     * @return (Updatable) The size of the volume in GBs.
     * 
     */
    public Output<String> sizeInGbs() {
        return this.sizeInGbs;
    }
    /**
     * The size of the volume in MBs. The value must be a multiple of 1024. This field is deprecated. Use `size_in_gbs` instead.
     * 
     * @deprecated
     * The &#39;size_in_mbs&#39; field has been deprecated. Please use &#39;size_in_gbs&#39; instead.
     * 
     */
    @Deprecated /* The 'size_in_mbs' field has been deprecated. Please use 'size_in_gbs' instead. */
    @Export(name="sizeInMbs", type=String.class, parameters={})
    private Output<String> sizeInMbs;

    /**
     * @return The size of the volume in MBs. The value must be a multiple of 1024. This field is deprecated. Use `size_in_gbs` instead.
     * 
     */
    public Output<String> sizeInMbs() {
        return this.sizeInMbs;
    }
    @Export(name="sourceDetails", type=VolumeSourceDetails.class, parameters={})
    private Output<VolumeSourceDetails> sourceDetails;

    public Output<VolumeSourceDetails> sourceDetails() {
        return this.sourceDetails;
    }
    /**
     * The current state of a volume.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of a volume.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The date and time the volume was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the volume was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The OCID of the volume backup from which the data should be restored on the newly created volume. This field is deprecated. Use the sourceDetails field instead to specify the backup for the volume.
     * 
     */
    @Export(name="volumeBackupId", type=String.class, parameters={})
    private Output<String> volumeBackupId;

    /**
     * @return The OCID of the volume backup from which the data should be restored on the newly created volume. This field is deprecated. Use the sourceDetails field instead to specify the backup for the volume.
     * 
     */
    public Output<String> volumeBackupId() {
        return this.volumeBackupId;
    }
    /**
     * The OCID of the source volume group.
     * 
     */
    @Export(name="volumeGroupId", type=String.class, parameters={})
    private Output<String> volumeGroupId;

    /**
     * @return The OCID of the source volume group.
     * 
     */
    public Output<String> volumeGroupId() {
        return this.volumeGroupId;
    }
    /**
     * (Updatable) The number of volume performance units (VPUs) that will be applied to this volume per GB, representing the Block Volume service&#39;s elastic performance options. See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
     * 
     */
    @Export(name="vpusPerGb", type=String.class, parameters={})
    private Output<String> vpusPerGb;

    /**
     * @return (Updatable) The number of volume performance units (VPUs) that will be applied to this volume per GB, representing the Block Volume service&#39;s elastic performance options. See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
     * 
     */
    public Output<String> vpusPerGb() {
        return this.vpusPerGb;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, VolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/volume:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Volume(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/volume:Volume", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Volume get(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, state, options);
    }
}
