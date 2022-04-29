// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.VnicAttachmentCreateVnicDetailsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VnicAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final VnicAttachmentState Empty = new VnicAttachmentState();

    /**
     * The availability domain of the instance.  Example: `Uocm:PHX-AD-1`
     * 
     */
    @Import(name="availabilityDomain")
    private @Nullable Output<String> availabilityDomain;

    /**
     * @return The availability domain of the instance.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public Optional<Output<String>> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }

    /**
     * The OCID of the compartment the VNIC attachment is in, which is the same compartment the instance is in.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The OCID of the compartment the VNIC attachment is in, which is the same compartment the instance is in.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) Contains properties for a VNIC. You use this object when creating the primary VNIC during instance launch or when creating a secondary VNIC. For more information about VNICs, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     * 
     */
    @Import(name="createVnicDetails")
    private @Nullable Output<VnicAttachmentCreateVnicDetailsArgs> createVnicDetails;

    /**
     * @return (Updatable) Contains properties for a VNIC. You use this object when creating the primary VNIC during instance launch or when creating a secondary VNIC. For more information about VNICs, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     * 
     */
    public Optional<Output<VnicAttachmentCreateVnicDetailsArgs>> createVnicDetails() {
        return Optional.ofNullable(this.createVnicDetails);
    }

    /**
     * A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The OCID of the instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The OCID of the instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Which physical network interface card (NIC) the VNIC will use. Defaults to 0. Certain bare metal instance shapes have two active physical NICs (0 and 1). If you add a secondary VNIC to one of these instances, you can specify which NIC the VNIC will use. For more information, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     * 
     */
    @Import(name="nicIndex")
    private @Nullable Output<Integer> nicIndex;

    /**
     * @return Which physical network interface card (NIC) the VNIC will use. Defaults to 0. Certain bare metal instance shapes have two active physical NICs (0 and 1). If you add a secondary VNIC to one of these instances, you can specify which NIC the VNIC will use. For more information, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     * 
     */
    public Optional<Output<Integer>> nicIndex() {
        return Optional.ofNullable(this.nicIndex);
    }

    /**
     * The current state of the VNIC attachment.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the VNIC attachment.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create the VNIC in. When launching an instance, use this `subnetId` instead of the deprecated `subnetId` in [LaunchInstanceDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/requests/LaunchInstanceDetails). At least one of them is required; if you provide both, the values must match.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create the VNIC in. When launching an instance, use this `subnetId` instead of the deprecated `subnetId` in [LaunchInstanceDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/requests/LaunchInstanceDetails). At least one of them is required; if you provide both, the values must match.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The date and time the VNIC attachment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the VNIC attachment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * Provide this attribute only if you are an Oracle Cloud VMware Solution customer and creating a secondary VNIC in a VLAN. The value is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan).
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<String> vlanId;

    /**
     * @return Provide this attribute only if you are an Oracle Cloud VMware Solution customer and creating a secondary VNIC in a VLAN. The value is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan).
     * 
     */
    public Optional<Output<String>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    /**
     * The Oracle-assigned VLAN tag of the attached VNIC. Available after the attachment process is complete.
     * 
     */
    @Import(name="vlanTag")
    private @Nullable Output<Integer> vlanTag;

    /**
     * @return The Oracle-assigned VLAN tag of the attached VNIC. Available after the attachment process is complete.
     * 
     */
    public Optional<Output<Integer>> vlanTag() {
        return Optional.ofNullable(this.vlanTag);
    }

    /**
     * The OCID of the VNIC. Available after the attachment process is complete.
     * 
     */
    @Import(name="vnicId")
    private @Nullable Output<String> vnicId;

    /**
     * @return The OCID of the VNIC. Available after the attachment process is complete.
     * 
     */
    public Optional<Output<String>> vnicId() {
        return Optional.ofNullable(this.vnicId);
    }

    private VnicAttachmentState() {}

    private VnicAttachmentState(VnicAttachmentState $) {
        this.availabilityDomain = $.availabilityDomain;
        this.compartmentId = $.compartmentId;
        this.createVnicDetails = $.createVnicDetails;
        this.displayName = $.displayName;
        this.instanceId = $.instanceId;
        this.nicIndex = $.nicIndex;
        this.state = $.state;
        this.subnetId = $.subnetId;
        this.timeCreated = $.timeCreated;
        this.vlanId = $.vlanId;
        this.vlanTag = $.vlanTag;
        this.vnicId = $.vnicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VnicAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VnicAttachmentState $;

        public Builder() {
            $ = new VnicAttachmentState();
        }

        public Builder(VnicAttachmentState defaults) {
            $ = new VnicAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomain The availability domain of the instance.  Example: `Uocm:PHX-AD-1`
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(@Nullable Output<String> availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * @param availabilityDomain The availability domain of the instance.  Example: `Uocm:PHX-AD-1`
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(String availabilityDomain) {
            return availabilityDomain(Output.of(availabilityDomain));
        }

        /**
         * @param compartmentId The OCID of the compartment the VNIC attachment is in, which is the same compartment the instance is in.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment the VNIC attachment is in, which is the same compartment the instance is in.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param createVnicDetails (Updatable) Contains properties for a VNIC. You use this object when creating the primary VNIC during instance launch or when creating a secondary VNIC. For more information about VNICs, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         * 
         * @return builder
         * 
         */
        public Builder createVnicDetails(@Nullable Output<VnicAttachmentCreateVnicDetailsArgs> createVnicDetails) {
            $.createVnicDetails = createVnicDetails;
            return this;
        }

        /**
         * @param createVnicDetails (Updatable) Contains properties for a VNIC. You use this object when creating the primary VNIC during instance launch or when creating a secondary VNIC. For more information about VNICs, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         * 
         * @return builder
         * 
         */
        public Builder createVnicDetails(VnicAttachmentCreateVnicDetailsArgs createVnicDetails) {
            return createVnicDetails(Output.of(createVnicDetails));
        }

        /**
         * @param displayName A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param instanceId The OCID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The OCID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param nicIndex Which physical network interface card (NIC) the VNIC will use. Defaults to 0. Certain bare metal instance shapes have two active physical NICs (0 and 1). If you add a secondary VNIC to one of these instances, you can specify which NIC the VNIC will use. For more information, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         * 
         * @return builder
         * 
         */
        public Builder nicIndex(@Nullable Output<Integer> nicIndex) {
            $.nicIndex = nicIndex;
            return this;
        }

        /**
         * @param nicIndex Which physical network interface card (NIC) the VNIC will use. Defaults to 0. Certain bare metal instance shapes have two active physical NICs (0 and 1). If you add a secondary VNIC to one of these instances, you can specify which NIC the VNIC will use. For more information, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         * 
         * @return builder
         * 
         */
        public Builder nicIndex(Integer nicIndex) {
            return nicIndex(Output.of(nicIndex));
        }

        /**
         * @param state The current state of the VNIC attachment.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the VNIC attachment.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subnetId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create the VNIC in. When launching an instance, use this `subnetId` instead of the deprecated `subnetId` in [LaunchInstanceDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/requests/LaunchInstanceDetails). At least one of them is required; if you provide both, the values must match.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create the VNIC in. When launching an instance, use this `subnetId` instead of the deprecated `subnetId` in [LaunchInstanceDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/requests/LaunchInstanceDetails). At least one of them is required; if you provide both, the values must match.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param timeCreated The date and time the VNIC attachment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the VNIC attachment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param vlanId Provide this attribute only if you are an Oracle Cloud VMware Solution customer and creating a secondary VNIC in a VLAN. The value is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan).
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<String> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId Provide this attribute only if you are an Oracle Cloud VMware Solution customer and creating a secondary VNIC in a VLAN. The value is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan).
         * 
         * @return builder
         * 
         */
        public Builder vlanId(String vlanId) {
            return vlanId(Output.of(vlanId));
        }

        /**
         * @param vlanTag The Oracle-assigned VLAN tag of the attached VNIC. Available after the attachment process is complete.
         * 
         * @return builder
         * 
         */
        public Builder vlanTag(@Nullable Output<Integer> vlanTag) {
            $.vlanTag = vlanTag;
            return this;
        }

        /**
         * @param vlanTag The Oracle-assigned VLAN tag of the attached VNIC. Available after the attachment process is complete.
         * 
         * @return builder
         * 
         */
        public Builder vlanTag(Integer vlanTag) {
            return vlanTag(Output.of(vlanTag));
        }

        /**
         * @param vnicId The OCID of the VNIC. Available after the attachment process is complete.
         * 
         * @return builder
         * 
         */
        public Builder vnicId(@Nullable Output<String> vnicId) {
            $.vnicId = vnicId;
            return this;
        }

        /**
         * @param vnicId The OCID of the VNIC. Available after the attachment process is complete.
         * 
         * @return builder
         * 
         */
        public Builder vnicId(String vnicId) {
            return vnicId(Output.of(vnicId));
        }

        public VnicAttachmentState build() {
            return $;
        }
    }

}
