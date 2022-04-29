// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.GoldenGate;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.GoldenGate.DeploymentArgs;
import com.pulumi.oci.GoldenGate.inputs.DeploymentState;
import com.pulumi.oci.GoldenGate.outputs.DeploymentOggData;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Deployment resource in Oracle Cloud Infrastructure Golden Gate service.
 * 
 * Creates a new Deployment.
 * 
 * ## Import
 * 
 * Deployments can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:GoldenGate/deployment:Deployment test_deployment &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:GoldenGate/deployment:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) The Minimum number of OCPUs to be made available for this Deployment.
     * 
     */
    @Export(name="cpuCoreCount", type=Integer.class, parameters={})
    private Output<Integer> cpuCoreCount;

    /**
     * @return (Updatable) The Minimum number of OCPUs to be made available for this Deployment.
     * 
     */
    public Output<Integer> cpuCoreCount() {
        return this.cpuCoreCount;
    }
    /**
     * (Updatable) Tags defined for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Tags defined for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup being referenced.
     * 
     */
    @Export(name="deploymentBackupId", type=String.class, parameters={})
    private Output<String> deploymentBackupId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup being referenced.
     * 
     */
    public Output<String> deploymentBackupId() {
        return this.deploymentBackupId;
    }
    /**
     * The deployment type.
     * 
     */
    @Export(name="deploymentType", type=String.class, parameters={})
    private Output<String> deploymentType;

    /**
     * @return The deployment type.
     * 
     */
    public Output<String> deploymentType() {
        return this.deploymentType;
    }
    /**
     * The URL of a resource.
     * 
     */
    @Export(name="deploymentUrl", type=String.class, parameters={})
    private Output<String> deploymentUrl;

    /**
     * @return The URL of a resource.
     * 
     */
    public Output<String> deploymentUrl() {
        return this.deploymentUrl;
    }
    /**
     * (Updatable) Metadata about this specific object.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) Metadata about this specific object.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) An object&#39;s Display Name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) An object&#39;s Display Name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) A three-label Fully Qualified Domain Name (FQDN) for a resource.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return (Updatable) A three-label Fully Qualified Domain Name (FQDN) for a resource.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * (Updatable) A simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) A simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * (Updatable) Indicates if auto scaling is enabled for the Deployment&#39;s CPU core count.
     * 
     */
    @Export(name="isAutoScalingEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isAutoScalingEnabled;

    /**
     * @return (Updatable) Indicates if auto scaling is enabled for the Deployment&#39;s CPU core count.
     * 
     */
    public Output<Boolean> isAutoScalingEnabled() {
        return this.isAutoScalingEnabled;
    }
    /**
     * True if all of the aggregate resources are working correctly.
     * 
     */
    @Export(name="isHealthy", type=Boolean.class, parameters={})
    private Output<Boolean> isHealthy;

    /**
     * @return True if all of the aggregate resources are working correctly.
     * 
     */
    public Output<Boolean> isHealthy() {
        return this.isHealthy;
    }
    /**
     * Indicates if the resource is the the latest available version.
     * 
     */
    @Export(name="isLatestVersion", type=Boolean.class, parameters={})
    private Output<Boolean> isLatestVersion;

    /**
     * @return Indicates if the resource is the the latest available version.
     * 
     */
    public Output<Boolean> isLatestVersion() {
        return this.isLatestVersion;
    }
    /**
     * (Updatable) True if this object is publicly available.
     * 
     */
    @Export(name="isPublic", type=Boolean.class, parameters={})
    private Output<Boolean> isPublic;

    /**
     * @return (Updatable) True if this object is publicly available.
     * 
     */
    public Output<Boolean> isPublic() {
        return this.isPublic;
    }
    /**
     * Indicator will be true if the amount of storage being utilized exceeds the allowable storage utilization limit.  Exceeding the limit may be an indication of a misconfiguration of the deployment&#39;s GoldenGate service.
     * 
     */
    @Export(name="isStorageUtilizationLimitExceeded", type=Boolean.class, parameters={})
    private Output<Boolean> isStorageUtilizationLimitExceeded;

    /**
     * @return Indicator will be true if the amount of storage being utilized exceeds the allowable storage utilization limit.  Exceeding the limit may be an indication of a misconfiguration of the deployment&#39;s GoldenGate service.
     * 
     */
    public Output<Boolean> isStorageUtilizationLimitExceeded() {
        return this.isStorageUtilizationLimitExceeded;
    }
    /**
     * (Updatable) The Oracle license model that applies to a Deployment.
     * 
     */
    @Export(name="licenseModel", type=String.class, parameters={})
    private Output<String> licenseModel;

    /**
     * @return (Updatable) The Oracle license model that applies to a Deployment.
     * 
     */
    public Output<String> licenseModel() {
        return this.licenseModel;
    }
    /**
     * Describes the object&#39;s current state in detail. For example, it can be used to provide actionable information for a resource in a Failed state.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return Describes the object&#39;s current state in detail. For example, it can be used to provide actionable information for a resource in a Failed state.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * Possible GGS lifecycle sub-states.
     * 
     */
    @Export(name="lifecycleSubState", type=String.class, parameters={})
    private Output<String> lifecycleSubState;

    /**
     * @return Possible GGS lifecycle sub-states.
     * 
     */
    public Output<String> lifecycleSubState() {
        return this.lifecycleSubState;
    }
    /**
     * (Updatable) An array of [Network Security Group](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm) OCIDs used to define network access for a deployment.
     * 
     */
    @Export(name="nsgIds", type=List.class, parameters={String.class})
    private Output<List<String>> nsgIds;

    /**
     * @return (Updatable) An array of [Network Security Group](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm) OCIDs used to define network access for a deployment.
     * 
     */
    public Output<List<String>> nsgIds() {
        return this.nsgIds;
    }
    /**
     * (Updatable) Deployment Data for creating an OggDeployment
     * 
     */
    @Export(name="oggData", type=DeploymentOggData.class, parameters={})
    private Output<DeploymentOggData> oggData;

    /**
     * @return (Updatable) Deployment Data for creating an OggDeployment
     * 
     */
    public Output<DeploymentOggData> oggData() {
        return this.oggData;
    }
    /**
     * The private IP address in the customer&#39;s VCN representing the access point for the associated endpoint service in the GoldenGate service VCN.
     * 
     */
    @Export(name="privateIpAddress", type=String.class, parameters={})
    private Output<String> privateIpAddress;

    /**
     * @return The private IP address in the customer&#39;s VCN representing the access point for the associated endpoint service in the GoldenGate service VCN.
     * 
     */
    public Output<String> privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * The public IP address representing the access point for the Deployment.
     * 
     */
    @Export(name="publicIpAddress", type=String.class, parameters={})
    private Output<String> publicIpAddress;

    /**
     * @return The public IP address representing the access point for the Deployment.
     * 
     */
    public Output<String> publicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * Possible lifecycle states.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Possible lifecycle states.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The amount of storage being utilized (in bytes)
     * 
     */
    @Export(name="storageUtilizationInBytes", type=String.class, parameters={})
    private Output<String> storageUtilizationInBytes;

    /**
     * @return The amount of storage being utilized (in bytes)
     * 
     */
    public Output<String> storageUtilizationInBytes() {
        return this.storageUtilizationInBytes;
    }
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet being referenced.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet being referenced.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle Cloud Infrastructure services. Each key is predefined and scoped to namespaces.  For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{orcl-cloud: {free-tier-retain: true}}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return The system tags associated with this resource, if any. The system tags are set by Oracle Cloud Infrastructure services. Each key is predefined and scoped to namespaces.  For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{orcl-cloud: {free-tier-retain: true}}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The time the resource was created. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as `2016-08-25T21:10:29.600Z`.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time the resource was created. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as `2016-08-25T21:10:29.600Z`.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The time the resource was last updated. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as `2016-08-25T21:10:29.600Z`.
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The time the resource was last updated. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as `2016-08-25T21:10:29.600Z`.
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * The date the existing version in use will no longer be considered as usable and an upgrade will be required.  This date is typically 6 months after the version was released for use by GGS.  The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as `2016-08-25T21:10:29.600Z`.
     * 
     */
    @Export(name="timeUpgradeRequired", type=String.class, parameters={})
    private Output<String> timeUpgradeRequired;

    /**
     * @return The date the existing version in use will no longer be considered as usable and an upgrade will be required.  This date is typically 6 months after the version was released for use by GGS.  The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as `2016-08-25T21:10:29.600Z`.
     * 
     */
    public Output<String> timeUpgradeRequired() {
        return this.timeUpgradeRequired;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:GoldenGate/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:GoldenGate/deployment:Deployment", name, state, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}
