// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.LoadBalancer.inputs.LoadBalancerIpAddressDetailArgs;
import com.pulumi.oci.LoadBalancer.inputs.LoadBalancerReservedIpArgs;
import com.pulumi.oci.LoadBalancer.inputs.LoadBalancerShapeDetailsArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerState Empty = new LoadBalancerState();

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering confidential information.  Example: `example_load_balancer`
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering confidential information.  Example: `example_load_balancer`
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * An array of IP addresses.
     * 
     */
    @Import(name="ipAddressDetails")
    private @Nullable Output<List<LoadBalancerIpAddressDetailArgs>> ipAddressDetails;

    /**
     * @return An array of IP addresses.
     * 
     */
    public Optional<Output<List<LoadBalancerIpAddressDetailArgs>>> ipAddressDetails() {
        return Optional.ofNullable(this.ipAddressDetails);
    }

    /**
     * An array of IP addresses. Deprecated: use ip_address_details instead
     * 
     * @deprecated
     * The &#39;ip_addresses&#39; field has been deprecated. Please use &#39;ip_address_details&#39; instead.
     * 
     */
    @Deprecated /* The 'ip_addresses' field has been deprecated. Please use 'ip_address_details' instead. */
    @Import(name="ipAddresses")
    private @Nullable Output<List<String>> ipAddresses;

    /**
     * @return An array of IP addresses. Deprecated: use ip_address_details instead
     * 
     * @deprecated
     * The &#39;ip_addresses&#39; field has been deprecated. Please use &#39;ip_address_details&#39; instead.
     * 
     */
    @Deprecated /* The 'ip_addresses' field has been deprecated. Please use 'ip_address_details' instead. */
    public Optional<Output<List<String>>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * IPv6 is currently supported only in the Government Cloud. Whether the load balancer has an IPv4 or IPv6 IP address.
     * 
     */
    @Import(name="ipMode")
    private @Nullable Output<String> ipMode;

    /**
     * @return IPv6 is currently supported only in the Government Cloud. Whether the load balancer has an IPv4 or IPv6 IP address.
     * 
     */
    public Optional<Output<String>> ipMode() {
        return Optional.ofNullable(this.ipMode);
    }

    /**
     * Whether the load balancer has a VCN-local (private) IP address.
     * 
     */
    @Import(name="isPrivate")
    private @Nullable Output<Boolean> isPrivate;

    /**
     * @return Whether the load balancer has a VCN-local (private) IP address.
     * 
     */
    public Optional<Output<Boolean>> isPrivate() {
        return Optional.ofNullable(this.isPrivate);
    }

    /**
     * (Updatable) An array of NSG [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
     * 
     */
    @Import(name="networkSecurityGroupIds")
    private @Nullable Output<List<String>> networkSecurityGroupIds;

    /**
     * @return (Updatable) An array of NSG [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
     * 
     */
    public Optional<Output<List<String>>> networkSecurityGroupIds() {
        return Optional.ofNullable(this.networkSecurityGroupIds);
    }

    /**
     * An array of reserved Ips. Pre-created public IP that will be used as the IP of this load balancer. This reserved IP will not be deleted when load balancer is deleted. This ip should not be already mapped to any other resource.
     * 
     */
    @Import(name="reservedIps")
    private @Nullable Output<List<LoadBalancerReservedIpArgs>> reservedIps;

    /**
     * @return An array of reserved Ips. Pre-created public IP that will be used as the IP of this load balancer. This reserved IP will not be deleted when load balancer is deleted. This ip should not be already mapped to any other resource.
     * 
     */
    public Optional<Output<List<LoadBalancerReservedIpArgs>>> reservedIps() {
        return Optional.ofNullable(this.reservedIps);
    }

    /**
     * (Updatable) A template that determines the total pre-provisioned bandwidth (ingress plus egress). To get a list of available shapes, use the [ListShapes](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerShape/ListShapes) operation.  Example: `100Mbps` *Note: When updating shape for a load balancer, all existing connections to the load balancer will be reset during the update process. Also `10Mbps-Micro` shape cannot be updated to any other shape nor can any other shape be updated to `10Mbps-Micro`.
     * 
     */
    @Import(name="shape")
    private @Nullable Output<String> shape;

    /**
     * @return (Updatable) A template that determines the total pre-provisioned bandwidth (ingress plus egress). To get a list of available shapes, use the [ListShapes](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerShape/ListShapes) operation.  Example: `100Mbps` *Note: When updating shape for a load balancer, all existing connections to the load balancer will be reset during the update process. Also `10Mbps-Micro` shape cannot be updated to any other shape nor can any other shape be updated to `10Mbps-Micro`.
     * 
     */
    public Optional<Output<String>> shape() {
        return Optional.ofNullable(this.shape);
    }

    /**
     * (Updatable) The configuration details to create load balancer using Flexible shape. This is required only if shapeName is `Flexible`.
     * 
     */
    @Import(name="shapeDetails")
    private @Nullable Output<LoadBalancerShapeDetailsArgs> shapeDetails;

    /**
     * @return (Updatable) The configuration details to create load balancer using Flexible shape. This is required only if shapeName is `Flexible`.
     * 
     */
    public Optional<Output<LoadBalancerShapeDetailsArgs>> shapeDetails() {
        return Optional.ofNullable(this.shapeDetails);
    }

    /**
     * The current state of the load balancer.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the load balancer.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * An array of subnet [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return An array of subnet [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Import(name="systemTags")
    private @Nullable Output<Map<String,Object>> systemTags;

    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> systemTags() {
        return Optional.ofNullable(this.systemTags);
    }

    /**
     * The date and time the load balancer was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the load balancer was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    private LoadBalancerState() {}

    private LoadBalancerState(LoadBalancerState $) {
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.ipAddressDetails = $.ipAddressDetails;
        this.ipAddresses = $.ipAddresses;
        this.ipMode = $.ipMode;
        this.isPrivate = $.isPrivate;
        this.networkSecurityGroupIds = $.networkSecurityGroupIds;
        this.reservedIps = $.reservedIps;
        this.shape = $.shape;
        this.shapeDetails = $.shapeDetails;
        this.state = $.state;
        this.subnetIds = $.subnetIds;
        this.systemTags = $.systemTags;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerState $;

        public Builder() {
            $ = new LoadBalancerState();
        }

        public Builder(LoadBalancerState defaults) {
            $ = new LoadBalancerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering confidential information.  Example: `example_load_balancer`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering confidential information.  Example: `example_load_balancer`
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param ipAddressDetails An array of IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressDetails(@Nullable Output<List<LoadBalancerIpAddressDetailArgs>> ipAddressDetails) {
            $.ipAddressDetails = ipAddressDetails;
            return this;
        }

        /**
         * @param ipAddressDetails An array of IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressDetails(List<LoadBalancerIpAddressDetailArgs> ipAddressDetails) {
            return ipAddressDetails(Output.of(ipAddressDetails));
        }

        /**
         * @param ipAddressDetails An array of IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressDetails(LoadBalancerIpAddressDetailArgs... ipAddressDetails) {
            return ipAddressDetails(List.of(ipAddressDetails));
        }

        /**
         * @param ipAddresses An array of IP addresses. Deprecated: use ip_address_details instead
         * 
         * @return builder
         * 
         * @deprecated
         * The &#39;ip_addresses&#39; field has been deprecated. Please use &#39;ip_address_details&#39; instead.
         * 
         */
        @Deprecated /* The 'ip_addresses' field has been deprecated. Please use 'ip_address_details' instead. */
        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @param ipAddresses An array of IP addresses. Deprecated: use ip_address_details instead
         * 
         * @return builder
         * 
         * @deprecated
         * The &#39;ip_addresses&#39; field has been deprecated. Please use &#39;ip_address_details&#39; instead.
         * 
         */
        @Deprecated /* The 'ip_addresses' field has been deprecated. Please use 'ip_address_details' instead. */
        public Builder ipAddresses(List<String> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        /**
         * @param ipAddresses An array of IP addresses. Deprecated: use ip_address_details instead
         * 
         * @return builder
         * 
         * @deprecated
         * The &#39;ip_addresses&#39; field has been deprecated. Please use &#39;ip_address_details&#39; instead.
         * 
         */
        @Deprecated /* The 'ip_addresses' field has been deprecated. Please use 'ip_address_details' instead. */
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param ipMode IPv6 is currently supported only in the Government Cloud. Whether the load balancer has an IPv4 or IPv6 IP address.
         * 
         * @return builder
         * 
         */
        public Builder ipMode(@Nullable Output<String> ipMode) {
            $.ipMode = ipMode;
            return this;
        }

        /**
         * @param ipMode IPv6 is currently supported only in the Government Cloud. Whether the load balancer has an IPv4 or IPv6 IP address.
         * 
         * @return builder
         * 
         */
        public Builder ipMode(String ipMode) {
            return ipMode(Output.of(ipMode));
        }

        /**
         * @param isPrivate Whether the load balancer has a VCN-local (private) IP address.
         * 
         * @return builder
         * 
         */
        public Builder isPrivate(@Nullable Output<Boolean> isPrivate) {
            $.isPrivate = isPrivate;
            return this;
        }

        /**
         * @param isPrivate Whether the load balancer has a VCN-local (private) IP address.
         * 
         * @return builder
         * 
         */
        public Builder isPrivate(Boolean isPrivate) {
            return isPrivate(Output.of(isPrivate));
        }

        /**
         * @param networkSecurityGroupIds (Updatable) An array of NSG [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupIds(@Nullable Output<List<String>> networkSecurityGroupIds) {
            $.networkSecurityGroupIds = networkSecurityGroupIds;
            return this;
        }

        /**
         * @param networkSecurityGroupIds (Updatable) An array of NSG [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupIds(List<String> networkSecurityGroupIds) {
            return networkSecurityGroupIds(Output.of(networkSecurityGroupIds));
        }

        /**
         * @param networkSecurityGroupIds (Updatable) An array of NSG [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupIds(String... networkSecurityGroupIds) {
            return networkSecurityGroupIds(List.of(networkSecurityGroupIds));
        }

        /**
         * @param reservedIps An array of reserved Ips. Pre-created public IP that will be used as the IP of this load balancer. This reserved IP will not be deleted when load balancer is deleted. This ip should not be already mapped to any other resource.
         * 
         * @return builder
         * 
         */
        public Builder reservedIps(@Nullable Output<List<LoadBalancerReservedIpArgs>> reservedIps) {
            $.reservedIps = reservedIps;
            return this;
        }

        /**
         * @param reservedIps An array of reserved Ips. Pre-created public IP that will be used as the IP of this load balancer. This reserved IP will not be deleted when load balancer is deleted. This ip should not be already mapped to any other resource.
         * 
         * @return builder
         * 
         */
        public Builder reservedIps(List<LoadBalancerReservedIpArgs> reservedIps) {
            return reservedIps(Output.of(reservedIps));
        }

        /**
         * @param reservedIps An array of reserved Ips. Pre-created public IP that will be used as the IP of this load balancer. This reserved IP will not be deleted when load balancer is deleted. This ip should not be already mapped to any other resource.
         * 
         * @return builder
         * 
         */
        public Builder reservedIps(LoadBalancerReservedIpArgs... reservedIps) {
            return reservedIps(List.of(reservedIps));
        }

        /**
         * @param shape (Updatable) A template that determines the total pre-provisioned bandwidth (ingress plus egress). To get a list of available shapes, use the [ListShapes](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerShape/ListShapes) operation.  Example: `100Mbps` *Note: When updating shape for a load balancer, all existing connections to the load balancer will be reset during the update process. Also `10Mbps-Micro` shape cannot be updated to any other shape nor can any other shape be updated to `10Mbps-Micro`.
         * 
         * @return builder
         * 
         */
        public Builder shape(@Nullable Output<String> shape) {
            $.shape = shape;
            return this;
        }

        /**
         * @param shape (Updatable) A template that determines the total pre-provisioned bandwidth (ingress plus egress). To get a list of available shapes, use the [ListShapes](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerShape/ListShapes) operation.  Example: `100Mbps` *Note: When updating shape for a load balancer, all existing connections to the load balancer will be reset during the update process. Also `10Mbps-Micro` shape cannot be updated to any other shape nor can any other shape be updated to `10Mbps-Micro`.
         * 
         * @return builder
         * 
         */
        public Builder shape(String shape) {
            return shape(Output.of(shape));
        }

        /**
         * @param shapeDetails (Updatable) The configuration details to create load balancer using Flexible shape. This is required only if shapeName is `Flexible`.
         * 
         * @return builder
         * 
         */
        public Builder shapeDetails(@Nullable Output<LoadBalancerShapeDetailsArgs> shapeDetails) {
            $.shapeDetails = shapeDetails;
            return this;
        }

        /**
         * @param shapeDetails (Updatable) The configuration details to create load balancer using Flexible shape. This is required only if shapeName is `Flexible`.
         * 
         * @return builder
         * 
         */
        public Builder shapeDetails(LoadBalancerShapeDetailsArgs shapeDetails) {
            return shapeDetails(Output.of(shapeDetails));
        }

        /**
         * @param state The current state of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subnetIds An array of subnet [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds An array of subnet [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds An array of subnet [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param systemTags System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(@Nullable Output<Map<String,Object>> systemTags) {
            $.systemTags = systemTags;
            return this;
        }

        /**
         * @param systemTags System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(Map<String,Object> systemTags) {
            return systemTags(Output.of(systemTags));
        }

        /**
         * @param timeCreated The date and time the load balancer was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the load balancer was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        public LoadBalancerState build() {
            return $;
        }
    }

}
