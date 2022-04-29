// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Database.AutonomousExadataInfrastructureArgs;
import com.pulumi.oci.Database.inputs.AutonomousExadataInfrastructureState;
import com.pulumi.oci.Database.outputs.AutonomousExadataInfrastructureMaintenanceWindow;
import com.pulumi.oci.Database.outputs.AutonomousExadataInfrastructureMaintenanceWindowDetails;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Autonomous Exadata Infrastructure resource in Oracle Cloud Infrastructure Database service.
 * 
 * **Deprecated** To create a new Autonomous Database system on dedicated Exadata Infrastructure, use the [CreateCloudExadataInfrastructure](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/CloudExadataInfrastructure/CreateCloudExadataInfrastructure) and [CreateCloudAutonomousVmCluster](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/CloudAutonomousVmCluster/CreateCloudAutonomousVmCluster) operations instead. Note that to create an Autonomous VM cluster, you must have an existing Exadata Infrastructure resource to contain the VM cluster.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AutonomousExadataInfrastructures can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Database/autonomousExadataInfrastructure:AutonomousExadataInfrastructure test_autonomous_exadata_infrastructure &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Database/autonomousExadataInfrastructure:AutonomousExadataInfrastructure")
public class AutonomousExadataInfrastructure extends com.pulumi.resources.CustomResource {
    /**
     * The availability domain where the Autonomous Exadata Infrastructure is located.
     * 
     * @deprecated
     * Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead.
     * 
     */
    @Deprecated /* Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead. */
    @Export(name="availabilityDomain", type=String.class, parameters={})
    private Output<String> availabilityDomain;

    /**
     * @return The availability domain where the Autonomous Exadata Infrastructure is located.
     * 
     */
    public Output<String> availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment the Autonomous Exadata Infrastructure belongs in.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment the Autonomous Exadata Infrastructure belongs in.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    @Export(name="createAsync", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> createAsync;

    public Output<Optional<Boolean>> createAsync() {
        return Codegen.optional(this.createAsync);
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) The user-friendly name for the Autonomous Exadata Infrastructure. It does not have to be unique.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) The user-friendly name for the Autonomous Exadata Infrastructure. It does not have to be unique.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A domain name used for the Autonomous Exadata Infrastructure. If the Oracle-provided Internet and VCN Resolver is enabled for the specified subnet, the domain name for the subnet is used (don&#39;t provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return A domain name used for the Autonomous Exadata Infrastructure. If the Oracle-provided Internet and VCN Resolver is enabled for the specified subnet, the domain name for the subnet is used (don&#39;t provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     * 
     */
    public Output<String> domain() {
        return this.domain;
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
     * The host name for the Autonomous Exadata Infrastructure node.
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return The host name for the Autonomous Exadata Infrastructure node.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * 
     */
    @Export(name="lastMaintenanceRunId", type=String.class, parameters={})
    private Output<String> lastMaintenanceRunId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * 
     */
    public Output<String> lastMaintenanceRunId() {
        return this.lastMaintenanceRunId;
    }
    /**
     * The Oracle license model that applies to all the databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
     * 
     */
    @Export(name="licenseModel", type=String.class, parameters={})
    private Output<String> licenseModel;

    /**
     * @return The Oracle license model that applies to all the databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
     * 
     */
    public Output<String> licenseModel() {
        return this.licenseModel;
    }
    /**
     * Additional information about the current lifecycle state of the Autonomous Exadata Infrastructure.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return Additional information about the current lifecycle state of the Autonomous Exadata Infrastructure.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * (Updatable) The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    @Export(name="maintenanceWindowDetails", type=AutonomousExadataInfrastructureMaintenanceWindowDetails.class, parameters={})
    private Output</* @Nullable */ AutonomousExadataInfrastructureMaintenanceWindowDetails> maintenanceWindowDetails;

    /**
     * @return (Updatable) The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    public Output<Optional<AutonomousExadataInfrastructureMaintenanceWindowDetails>> maintenanceWindowDetails() {
        return Codegen.optional(this.maintenanceWindowDetails);
    }
    /**
     * The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    @Export(name="maintenanceWindows", type=List.class, parameters={AutonomousExadataInfrastructureMaintenanceWindow.class})
    private Output<List<AutonomousExadataInfrastructureMaintenanceWindow>> maintenanceWindows;

    /**
     * @return The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    public Output<List<AutonomousExadataInfrastructureMaintenanceWindow>> maintenanceWindows() {
        return this.maintenanceWindows;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * 
     */
    @Export(name="nextMaintenanceRunId", type=String.class, parameters={})
    private Output<String> nextMaintenanceRunId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * 
     */
    public Output<String> nextMaintenanceRunId() {
        return this.nextMaintenanceRunId;
    }
    /**
     * (Updatable) A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds restrictions:**
     * * Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
     * 
     */
    @Export(name="nsgIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> nsgIds;

    /**
     * @return (Updatable) A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds restrictions:**
     * * Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
     * 
     */
    public Output<Optional<List<String>>> nsgIds() {
        return Codegen.optional(this.nsgIds);
    }
    /**
     * The FQDN of the DNS record for the SCAN IP addresses that are associated with the Autonomous Exadata Infrastructure.
     * 
     */
    @Export(name="scanDnsName", type=String.class, parameters={})
    private Output<String> scanDnsName;

    /**
     * @return The FQDN of the DNS record for the SCAN IP addresses that are associated with the Autonomous Exadata Infrastructure.
     * 
     */
    public Output<String> scanDnsName() {
        return this.scanDnsName;
    }
    /**
     * The shape of the Autonomous Exadata Infrastructure. The shape determines resources allocated to the Autonomous Exadata Infrastructure (CPU cores, memory and storage). To get a list of shapes, use the ListDbSystemShapes operation.
     * 
     */
    @Export(name="shape", type=String.class, parameters={})
    private Output<String> shape;

    /**
     * @return The shape of the Autonomous Exadata Infrastructure. The shape determines resources allocated to the Autonomous Exadata Infrastructure (CPU cores, memory and storage). To get a list of shapes, use the ListDbSystemShapes operation.
     * 
     */
    public Output<String> shape() {
        return this.shape;
    }
    /**
     * The current lifecycle state of the Autonomous Exadata Infrastructure.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current lifecycle state of the Autonomous Exadata Infrastructure.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the Autonomous Exadata Infrastructure is associated with.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the Autonomous Exadata Infrastructure is associated with.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * The date and time the Autonomous Exadata Infrastructure was created.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the Autonomous Exadata Infrastructure was created.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The OCID of the zone the Autonomous Exadata Infrastructure is associated with.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The OCID of the zone the Autonomous Exadata Infrastructure is associated with.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutonomousExadataInfrastructure(String name) {
        this(name, AutonomousExadataInfrastructureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutonomousExadataInfrastructure(String name, AutonomousExadataInfrastructureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutonomousExadataInfrastructure(String name, AutonomousExadataInfrastructureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/autonomousExadataInfrastructure:AutonomousExadataInfrastructure", name, args == null ? AutonomousExadataInfrastructureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutonomousExadataInfrastructure(String name, Output<String> id, @Nullable AutonomousExadataInfrastructureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/autonomousExadataInfrastructure:AutonomousExadataInfrastructure", name, state, makeResourceOptions(options, id));
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
    public static AutonomousExadataInfrastructure get(String name, Output<String> id, @Nullable AutonomousExadataInfrastructureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutonomousExadataInfrastructure(name, id, state, options);
    }
}
