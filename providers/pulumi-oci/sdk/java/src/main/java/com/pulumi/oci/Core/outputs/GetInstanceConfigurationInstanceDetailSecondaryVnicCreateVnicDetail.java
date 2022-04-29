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
public final class GetInstanceConfigurationInstanceDetailSecondaryVnicCreateVnicDetail {
    /**
     * @return Whether the VNIC should be assigned a private DNS record. See the `assignPrivateDnsRecord` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/CreateVnicDetails/) for more information.
     * 
     */
    private final Boolean assignPrivateDnsRecord;
    /**
     * @return Whether the VNIC should be assigned a public IP address. See the `assignPublicIp` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final Boolean assignPublicIp;
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
     * @return The hostname for the VNIC&#39;s primary private IP. See the `hostnameLabel` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final String hostnameLabel;
    /**
     * @return A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/NetworkSecurityGroup/).
     * 
     */
    private final List<String> nsgIds;
    /**
     * @return A private IP address of your choice to assign to the VNIC. See the `privateIp` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final String privateIp;
    /**
     * @return Whether the source/destination check is disabled on the VNIC. See the `skipSourceDestCheck` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final Boolean skipSourceDestCheck;
    /**
     * @return The OCID of the subnet to create the VNIC in. See the `subnetId` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private GetInstanceConfigurationInstanceDetailSecondaryVnicCreateVnicDetail(
        @CustomType.Parameter("assignPrivateDnsRecord") Boolean assignPrivateDnsRecord,
        @CustomType.Parameter("assignPublicIp") Boolean assignPublicIp,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("hostnameLabel") String hostnameLabel,
        @CustomType.Parameter("nsgIds") List<String> nsgIds,
        @CustomType.Parameter("privateIp") String privateIp,
        @CustomType.Parameter("skipSourceDestCheck") Boolean skipSourceDestCheck,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.assignPrivateDnsRecord = assignPrivateDnsRecord;
        this.assignPublicIp = assignPublicIp;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.hostnameLabel = hostnameLabel;
        this.nsgIds = nsgIds;
        this.privateIp = privateIp;
        this.skipSourceDestCheck = skipSourceDestCheck;
        this.subnetId = subnetId;
    }

    /**
     * @return Whether the VNIC should be assigned a private DNS record. See the `assignPrivateDnsRecord` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/CreateVnicDetails/) for more information.
     * 
     */
    public Boolean assignPrivateDnsRecord() {
        return this.assignPrivateDnsRecord;
    }
    /**
     * @return Whether the VNIC should be assigned a public IP address. See the `assignPublicIp` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public Boolean assignPublicIp() {
        return this.assignPublicIp;
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
     * @return The hostname for the VNIC&#39;s primary private IP. See the `hostnameLabel` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public String hostnameLabel() {
        return this.hostnameLabel;
    }
    /**
     * @return A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/NetworkSecurityGroup/).
     * 
     */
    public List<String> nsgIds() {
        return this.nsgIds;
    }
    /**
     * @return A private IP address of your choice to assign to the VNIC. See the `privateIp` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return Whether the source/destination check is disabled on the VNIC. See the `skipSourceDestCheck` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public Boolean skipSourceDestCheck() {
        return this.skipSourceDestCheck;
    }
    /**
     * @return The OCID of the subnet to create the VNIC in. See the `subnetId` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceConfigurationInstanceDetailSecondaryVnicCreateVnicDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean assignPrivateDnsRecord;
        private Boolean assignPublicIp;
        private Map<String,Object> definedTags;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String hostnameLabel;
        private List<String> nsgIds;
        private String privateIp;
        private Boolean skipSourceDestCheck;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceConfigurationInstanceDetailSecondaryVnicCreateVnicDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPrivateDnsRecord = defaults.assignPrivateDnsRecord;
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.hostnameLabel = defaults.hostnameLabel;
    	      this.nsgIds = defaults.nsgIds;
    	      this.privateIp = defaults.privateIp;
    	      this.skipSourceDestCheck = defaults.skipSourceDestCheck;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder assignPrivateDnsRecord(Boolean assignPrivateDnsRecord) {
            this.assignPrivateDnsRecord = Objects.requireNonNull(assignPrivateDnsRecord);
            return this;
        }
        public Builder assignPublicIp(Boolean assignPublicIp) {
            this.assignPublicIp = Objects.requireNonNull(assignPublicIp);
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
        public Builder nsgIds(List<String> nsgIds) {
            this.nsgIds = Objects.requireNonNull(nsgIds);
            return this;
        }
        public Builder nsgIds(String... nsgIds) {
            return nsgIds(List.of(nsgIds));
        }
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        public Builder skipSourceDestCheck(Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = Objects.requireNonNull(skipSourceDestCheck);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public GetInstanceConfigurationInstanceDetailSecondaryVnicCreateVnicDetail build() {
            return new GetInstanceConfigurationInstanceDetailSecondaryVnicCreateVnicDetail(assignPrivateDnsRecord, assignPublicIp, definedTags, displayName, freeformTags, hostnameLabel, nsgIds, privateIp, skipSourceDestCheck, subnetId);
        }
    }
}
