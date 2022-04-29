// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseTools;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.DatabaseTools.DatabaseToolsPrivateEndpointArgs;
import com.pulumi.oci.DatabaseTools.inputs.DatabaseToolsPrivateEndpointState;
import com.pulumi.oci.DatabaseTools.outputs.DatabaseToolsPrivateEndpointReverseConnectionConfiguration;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Database Tools Private Endpoint resource in Oracle Cloud Infrastructure Database Tools service.
 * 
 * Creates a new DatabaseToolsPrivateEndpoint.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DatabaseToolsPrivateEndpoints can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:DatabaseTools/databaseToolsPrivateEndpoint:DatabaseToolsPrivateEndpoint test_database_tools_private_endpoint &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:DatabaseTools/databaseToolsPrivateEndpoint:DatabaseToolsPrivateEndpoint")
public class DatabaseToolsPrivateEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * A list of additional FQDNs that can be also be used for the private endpoint.
     * 
     */
    @Export(name="additionalFqdns", type=List.class, parameters={String.class})
    private Output<List<String>> additionalFqdns;

    /**
     * @return A list of additional FQDNs that can be also be used for the private endpoint.
     * 
     */
    public Output<List<String>> additionalFqdns() {
        return this.additionalFqdns;
    }
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the containing Compartment.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the containing Compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) A description of the DatabaseToolsPrivateEndpoint.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) A description of the DatabaseToolsPrivateEndpoint.
     * 
     */
    public Output<String> description() {
        return this.description;
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
     * Then FQDN to use for the private endpoint.
     * 
     */
    @Export(name="endpointFqdn", type=String.class, parameters={})
    private Output<String> endpointFqdn;

    /**
     * @return Then FQDN to use for the private endpoint.
     * 
     */
    public Output<String> endpointFqdn() {
        return this.endpointFqdn;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DatabaseToolsEndpointService.
     * 
     */
    @Export(name="endpointServiceId", type=String.class, parameters={})
    private Output<String> endpointServiceId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DatabaseToolsEndpointService.
     * 
     */
    public Output<String> endpointServiceId() {
        return this.endpointServiceId;
    }
    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups that the private endpoint&#39;s VNIC belongs to.  For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/).
     * 
     */
    @Export(name="nsgIds", type=List.class, parameters={String.class})
    private Output<List<String>> nsgIds;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups that the private endpoint&#39;s VNIC belongs to.  For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/).
     * 
     */
    public Output<List<String>> nsgIds() {
        return this.nsgIds;
    }
    /**
     * The private IP address that represents the access point for the associated endpoint service.
     * 
     */
    @Export(name="privateEndpointIp", type=String.class, parameters={})
    private Output<String> privateEndpointIp;

    /**
     * @return The private IP address that represents the access point for the associated endpoint service.
     * 
     */
    public Output<String> privateEndpointIp() {
        return this.privateEndpointIp;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private endpoint&#39;s VNIC.
     * 
     */
    @Export(name="privateEndpointVnicId", type=String.class, parameters={})
    private Output<String> privateEndpointVnicId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private endpoint&#39;s VNIC.
     * 
     */
    public Output<String> privateEndpointVnicId() {
        return this.privateEndpointVnicId;
    }
    /**
     * Reverse connection configuration details of Private Endpoint.
     * 
     */
    @Export(name="reverseConnectionConfigurations", type=List.class, parameters={DatabaseToolsPrivateEndpointReverseConnectionConfiguration.class})
    private Output<List<DatabaseToolsPrivateEndpointReverseConnectionConfiguration>> reverseConnectionConfigurations;

    /**
     * @return Reverse connection configuration details of Private Endpoint.
     * 
     */
    public Output<List<DatabaseToolsPrivateEndpointReverseConnectionConfiguration>> reverseConnectionConfigurations() {
        return this.reverseConnectionConfigurations;
    }
    /**
     * The current state of the DatabaseToolsPrivateEndpoint.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the DatabaseToolsPrivateEndpoint.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet that the private endpoint belongs to.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet that the private endpoint belongs to.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The time the DatabaseToolsPrivateEndpoint was created. An RFC3339 formatted datetime string
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time the DatabaseToolsPrivateEndpoint was created. An RFC3339 formatted datetime string
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The time the DatabaseToolsPrivateEndpoint was updated. An RFC3339 formatted datetime string
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The time the DatabaseToolsPrivateEndpoint was updated. An RFC3339 formatted datetime string
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN that the private endpoint belongs to.
     * 
     */
    @Export(name="vcnId", type=String.class, parameters={})
    private Output<String> vcnId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN that the private endpoint belongs to.
     * 
     */
    public Output<String> vcnId() {
        return this.vcnId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseToolsPrivateEndpoint(String name) {
        this(name, DatabaseToolsPrivateEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseToolsPrivateEndpoint(String name, DatabaseToolsPrivateEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseToolsPrivateEndpoint(String name, DatabaseToolsPrivateEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DatabaseTools/databaseToolsPrivateEndpoint:DatabaseToolsPrivateEndpoint", name, args == null ? DatabaseToolsPrivateEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseToolsPrivateEndpoint(String name, Output<String> id, @Nullable DatabaseToolsPrivateEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DatabaseTools/databaseToolsPrivateEndpoint:DatabaseToolsPrivateEndpoint", name, state, makeResourceOptions(options, id));
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
    public static DatabaseToolsPrivateEndpoint get(String name, Output<String> id, @Nullable DatabaseToolsPrivateEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseToolsPrivateEndpoint(name, id, state, options);
    }
}
