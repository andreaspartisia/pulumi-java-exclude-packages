// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.LoadBalancer.LoadBalancerArgs;
import com.pulumi.oci.LoadBalancer.inputs.LoadBalancerState;
import com.pulumi.oci.LoadBalancer.outputs.LoadBalancerIpAddressDetail;
import com.pulumi.oci.LoadBalancer.outputs.LoadBalancerReservedIp;
import com.pulumi.oci.LoadBalancer.outputs.LoadBalancerShapeDetails;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Load Balancer resource in Oracle Cloud Infrastructure Load Balancer service.
 * 
 * Creates a new load balancer in the specified compartment. For general information about load balancers,
 * see [Overview of the Load Balancing Service](https://docs.cloud.oracle.com/iaas/Content/Balance/Concepts/balanceoverview.htm).
 * 
 * For the purposes of access control, you must provide the OCID of the compartment where you want
 * the load balancer to reside. Notice that the load balancer doesn&#39;t have to be in the same compartment as the VCN
 * or backend set. If you&#39;re not sure which compartment to use, put the load balancer in the same compartment as the VCN.
 * For information about access control and compartments, see
 * [Overview of the IAM Service](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
 * 
 * You must specify a display name for the load balancer. It does not have to be unique, and you can change it.
 * 
 * For information about Availability Domains, see
 * [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
 * To get a list of Availability Domains, use the `ListAvailabilityDomains` operation
 * in the Identity and Access Management Service API.
 * 
 * All Oracle Cloud Infrastructure resources, including load balancers, get an Oracle-assigned,
 * unique ID called an Oracle Cloud Identifier (OCID). When you create a resource, you can find its OCID
 * in the response. You can also retrieve a resource&#39;s OCID by using a List API operation on that resource type,
 * or by viewing the resource in the Console. Fore more information, see
 * [Resource Identifiers](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
 * 
 * When you create a load balancer, the system assigns an IP address.
 * To get the IP address, use the [GetLoadBalancer](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancer/GetLoadBalancer) operation.
 * 
 * ## Supported Aliases
 * 
 * * `oci_load_balancer`
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * LoadBalancers can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:LoadBalancer/loadBalancer:LoadBalancer test_load_balancer &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:LoadBalancer/loadBalancer:LoadBalancer")
public class LoadBalancer extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
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
     * (Updatable) A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering confidential information.  Example: `example_load_balancer`
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering confidential information.  Example: `example_load_balancer`
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
     * An array of IP addresses.
     * 
     */
    @Export(name="ipAddressDetails", type=List.class, parameters={LoadBalancerIpAddressDetail.class})
    private Output<List<LoadBalancerIpAddressDetail>> ipAddressDetails;

    /**
     * @return An array of IP addresses.
     * 
     */
    public Output<List<LoadBalancerIpAddressDetail>> ipAddressDetails() {
        return this.ipAddressDetails;
    }
    /**
     * An array of IP addresses. Deprecated: use ip_address_details instead
     * 
     * @deprecated
     * The &#39;ip_addresses&#39; field has been deprecated. Please use &#39;ip_address_details&#39; instead.
     * 
     */
    @Deprecated /* The 'ip_addresses' field has been deprecated. Please use 'ip_address_details' instead. */
    @Export(name="ipAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> ipAddresses;

    /**
     * @return An array of IP addresses. Deprecated: use ip_address_details instead
     * 
     */
    public Output<List<String>> ipAddresses() {
        return this.ipAddresses;
    }
    /**
     * IPv6 is currently supported only in the Government Cloud. Whether the load balancer has an IPv4 or IPv6 IP address.
     * 
     */
    @Export(name="ipMode", type=String.class, parameters={})
    private Output<String> ipMode;

    /**
     * @return IPv6 is currently supported only in the Government Cloud. Whether the load balancer has an IPv4 or IPv6 IP address.
     * 
     */
    public Output<String> ipMode() {
        return this.ipMode;
    }
    /**
     * Whether the load balancer has a VCN-local (private) IP address.
     * 
     */
    @Export(name="isPrivate", type=Boolean.class, parameters={})
    private Output<Boolean> isPrivate;

    /**
     * @return Whether the load balancer has a VCN-local (private) IP address.
     * 
     */
    public Output<Boolean> isPrivate() {
        return this.isPrivate;
    }
    /**
     * (Updatable) An array of NSG [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
     * 
     */
    @Export(name="networkSecurityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> networkSecurityGroupIds;

    /**
     * @return (Updatable) An array of NSG [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
     * 
     */
    public Output<Optional<List<String>>> networkSecurityGroupIds() {
        return Codegen.optional(this.networkSecurityGroupIds);
    }
    /**
     * An array of reserved Ips. Pre-created public IP that will be used as the IP of this load balancer. This reserved IP will not be deleted when load balancer is deleted. This ip should not be already mapped to any other resource.
     * 
     */
    @Export(name="reservedIps", type=List.class, parameters={LoadBalancerReservedIp.class})
    private Output</* @Nullable */ List<LoadBalancerReservedIp>> reservedIps;

    /**
     * @return An array of reserved Ips. Pre-created public IP that will be used as the IP of this load balancer. This reserved IP will not be deleted when load balancer is deleted. This ip should not be already mapped to any other resource.
     * 
     */
    public Output<Optional<List<LoadBalancerReservedIp>>> reservedIps() {
        return Codegen.optional(this.reservedIps);
    }
    /**
     * (Updatable) A template that determines the total pre-provisioned bandwidth (ingress plus egress). To get a list of available shapes, use the [ListShapes](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerShape/ListShapes) operation.  Example: `100Mbps` *Note: When updating shape for a load balancer, all existing connections to the load balancer will be reset during the update process. Also `10Mbps-Micro` shape cannot be updated to any other shape nor can any other shape be updated to `10Mbps-Micro`.
     * 
     */
    @Export(name="shape", type=String.class, parameters={})
    private Output<String> shape;

    /**
     * @return (Updatable) A template that determines the total pre-provisioned bandwidth (ingress plus egress). To get a list of available shapes, use the [ListShapes](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerShape/ListShapes) operation.  Example: `100Mbps` *Note: When updating shape for a load balancer, all existing connections to the load balancer will be reset during the update process. Also `10Mbps-Micro` shape cannot be updated to any other shape nor can any other shape be updated to `10Mbps-Micro`.
     * 
     */
    public Output<String> shape() {
        return this.shape;
    }
    /**
     * (Updatable) The configuration details to create load balancer using Flexible shape. This is required only if shapeName is `Flexible`.
     * 
     */
    @Export(name="shapeDetails", type=LoadBalancerShapeDetails.class, parameters={})
    private Output<LoadBalancerShapeDetails> shapeDetails;

    /**
     * @return (Updatable) The configuration details to create load balancer using Flexible shape. This is required only if shapeName is `Flexible`.
     * 
     */
    public Output<LoadBalancerShapeDetails> shapeDetails() {
        return this.shapeDetails;
    }
    /**
     * The current state of the load balancer.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the load balancer.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * An array of subnet [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return An array of subnet [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The date and time the load balancer was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the load balancer was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancer(String name) {
        this(name, LoadBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancer(String name, LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(String name, LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:LoadBalancer/loadBalancer:LoadBalancer", name, args == null ? LoadBalancerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancer(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:LoadBalancer/loadBalancer:LoadBalancer", name, state, makeResourceOptions(options, id));
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
    public static LoadBalancer get(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, state, options);
    }
}
