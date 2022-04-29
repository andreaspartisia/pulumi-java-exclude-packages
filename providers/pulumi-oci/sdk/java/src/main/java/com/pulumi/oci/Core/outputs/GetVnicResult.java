// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVnicResult {
    /**
     * @return The VNIC&#39;s availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    private final String availabilityDomain;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the VNIC.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    private final String displayName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The hostname for the VNIC&#39;s primary private IP. Used for DNS. The value is the hostname portion of the primary private IP&#39;s fully qualified domain name (FQDN) (for example, `bminstance-1` in FQDN `bminstance-1.subnet123.vcn1.oraclevcn.com`). Must be unique across all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and [RFC 1123](https://tools.ietf.org/html/rfc1123).
     * 
     */
    private final String hostnameLabel;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Whether the VNIC is the primary VNIC (the VNIC that is automatically created and attached during instance launch).
     * 
     */
    private final Boolean isPrimary;
    /**
     * @return The MAC address of the VNIC.
     * 
     */
    private final String macAddress;
    /**
     * @return A list of the OCIDs of the network security groups that the VNIC belongs to.
     * 
     */
    private final List<String> nsgIds;
    /**
     * @return The private IP address of the primary `privateIp` object on the VNIC. The address is within the CIDR of the VNIC&#39;s subnet.  Example: `10.0.3.3`
     * 
     */
    private final String privateIpAddress;
    /**
     * @return The public IP address of the VNIC, if one is assigned.
     * 
     */
    private final String publicIpAddress;
    /**
     * @return Whether the source/destination check is disabled on the VNIC. Defaults to `false`, which means the check is performed. For information about why you would skip the source/destination check, see [Using a Private IP as a Route Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
     * 
     */
    private final Boolean skipSourceDestCheck;
    /**
     * @return The current state of the VNIC.
     * 
     */
    private final String state;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the VNIC is in.
     * 
     */
    private final String subnetId;
    /**
     * @return The date and time the VNIC was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    private final String timeCreated;
    /**
     * @return If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of belonging to a subnet), the `vlanId` is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN the VNIC is in. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan). If the VNIC is instead in a subnet, `subnetId` has a value.
     * 
     */
    private final String vlanId;
    private final String vnicId;

    @CustomType.Constructor
    private GetVnicResult(
        @CustomType.Parameter("availabilityDomain") String availabilityDomain,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("hostnameLabel") String hostnameLabel,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isPrimary") Boolean isPrimary,
        @CustomType.Parameter("macAddress") String macAddress,
        @CustomType.Parameter("nsgIds") List<String> nsgIds,
        @CustomType.Parameter("privateIpAddress") String privateIpAddress,
        @CustomType.Parameter("publicIpAddress") String publicIpAddress,
        @CustomType.Parameter("skipSourceDestCheck") Boolean skipSourceDestCheck,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("vlanId") String vlanId,
        @CustomType.Parameter("vnicId") String vnicId) {
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.hostnameLabel = hostnameLabel;
        this.id = id;
        this.isPrimary = isPrimary;
        this.macAddress = macAddress;
        this.nsgIds = nsgIds;
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddress = publicIpAddress;
        this.skipSourceDestCheck = skipSourceDestCheck;
        this.state = state;
        this.subnetId = subnetId;
        this.timeCreated = timeCreated;
        this.vlanId = vlanId;
        this.vnicId = vnicId;
    }

    /**
     * @return The VNIC&#39;s availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the VNIC.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The hostname for the VNIC&#39;s primary private IP. Used for DNS. The value is the hostname portion of the primary private IP&#39;s fully qualified domain name (FQDN) (for example, `bminstance-1` in FQDN `bminstance-1.subnet123.vcn1.oraclevcn.com`). Must be unique across all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and [RFC 1123](https://tools.ietf.org/html/rfc1123).
     * 
     */
    public String hostnameLabel() {
        return this.hostnameLabel;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether the VNIC is the primary VNIC (the VNIC that is automatically created and attached during instance launch).
     * 
     */
    public Boolean isPrimary() {
        return this.isPrimary;
    }
    /**
     * @return The MAC address of the VNIC.
     * 
     */
    public String macAddress() {
        return this.macAddress;
    }
    /**
     * @return A list of the OCIDs of the network security groups that the VNIC belongs to.
     * 
     */
    public List<String> nsgIds() {
        return this.nsgIds;
    }
    /**
     * @return The private IP address of the primary `privateIp` object on the VNIC. The address is within the CIDR of the VNIC&#39;s subnet.  Example: `10.0.3.3`
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return The public IP address of the VNIC, if one is assigned.
     * 
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * @return Whether the source/destination check is disabled on the VNIC. Defaults to `false`, which means the check is performed. For information about why you would skip the source/destination check, see [Using a Private IP as a Route Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
     * 
     */
    public Boolean skipSourceDestCheck() {
        return this.skipSourceDestCheck;
    }
    /**
     * @return The current state of the VNIC.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the VNIC is in.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return The date and time the VNIC was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of belonging to a subnet), the `vlanId` is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN the VNIC is in. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan). If the VNIC is instead in a subnet, `subnetId` has a value.
     * 
     */
    public String vlanId() {
        return this.vlanId;
    }
    public String vnicId() {
        return this.vnicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVnicResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityDomain;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String hostnameLabel;
        private String id;
        private Boolean isPrimary;
        private String macAddress;
        private List<String> nsgIds;
        private String privateIpAddress;
        private String publicIpAddress;
        private Boolean skipSourceDestCheck;
        private String state;
        private String subnetId;
        private String timeCreated;
        private String vlanId;
        private String vnicId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVnicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.hostnameLabel = defaults.hostnameLabel;
    	      this.id = defaults.id;
    	      this.isPrimary = defaults.isPrimary;
    	      this.macAddress = defaults.macAddress;
    	      this.nsgIds = defaults.nsgIds;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.skipSourceDestCheck = defaults.skipSourceDestCheck;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.timeCreated = defaults.timeCreated;
    	      this.vlanId = defaults.vlanId;
    	      this.vnicId = defaults.vnicId;
        }

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = Objects.requireNonNull(hostnameLabel);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = Objects.requireNonNull(isPrimary);
            return this;
        }
        public Builder macAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }
        public Builder nsgIds(List<String> nsgIds) {
            this.nsgIds = Objects.requireNonNull(nsgIds);
            return this;
        }
        public Builder nsgIds(String... nsgIds) {
            return nsgIds(List.of(nsgIds));
        }
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }
        public Builder skipSourceDestCheck(Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = Objects.requireNonNull(skipSourceDestCheck);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder vlanId(String vlanId) {
            this.vlanId = Objects.requireNonNull(vlanId);
            return this;
        }
        public Builder vnicId(String vnicId) {
            this.vnicId = Objects.requireNonNull(vnicId);
            return this;
        }        public GetVnicResult build() {
            return new GetVnicResult(availabilityDomain, compartmentId, definedTags, displayName, freeformTags, hostnameLabel, id, isPrimary, macAddress, nsgIds, privateIpAddress, publicIpAddress, skipSourceDestCheck, state, subnetId, timeCreated, vlanId, vnicId);
        }
    }
}
