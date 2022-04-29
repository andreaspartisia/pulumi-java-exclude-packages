// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.CrossConnectGroupMacsecPropertiesArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CrossConnectGroupState extends com.pulumi.resources.ResourceArgs {

    public static final CrossConnectGroupState Empty = new CrossConnectGroupState();

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the cross-connect group.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the cross-connect group.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) A reference name or identifier for the physical fiber connection that this cross-connect group uses.
     * 
     */
    @Import(name="customerReferenceName")
    private @Nullable Output<String> customerReferenceName;

    /**
     * @return (Updatable) A reference name or identifier for the physical fiber connection that this cross-connect group uses.
     * 
     */
    public Optional<Output<String>> customerReferenceName() {
        return Optional.ofNullable(this.customerReferenceName);
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
     * (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
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
     * Properties used for MACsec (if capable).
     * 
     */
    @Import(name="macsecProperties")
    private @Nullable Output<CrossConnectGroupMacsecPropertiesArgs> macsecProperties;

    /**
     * @return Properties used for MACsec (if capable).
     * 
     */
    public Optional<Output<CrossConnectGroupMacsecPropertiesArgs>> macsecProperties() {
        return Optional.ofNullable(this.macsecProperties);
    }

    /**
     * The FastConnect device that terminates the logical connection. This device might be different than the device that terminates the physical connection.
     * 
     */
    @Import(name="ociLogicalDeviceName")
    private @Nullable Output<String> ociLogicalDeviceName;

    /**
     * @return The FastConnect device that terminates the logical connection. This device might be different than the device that terminates the physical connection.
     * 
     */
    public Optional<Output<String>> ociLogicalDeviceName() {
        return Optional.ofNullable(this.ociLogicalDeviceName);
    }

    /**
     * The FastConnect device that terminates the physical connection.
     * 
     */
    @Import(name="ociPhysicalDeviceName")
    private @Nullable Output<String> ociPhysicalDeviceName;

    /**
     * @return The FastConnect device that terminates the physical connection.
     * 
     */
    public Optional<Output<String>> ociPhysicalDeviceName() {
        return Optional.ofNullable(this.ociPhysicalDeviceName);
    }

    /**
     * The cross-connect group&#39;s current state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The cross-connect group&#39;s current state.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The date and time the cross-connect group was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the cross-connect group was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    private CrossConnectGroupState() {}

    private CrossConnectGroupState(CrossConnectGroupState $) {
        this.compartmentId = $.compartmentId;
        this.customerReferenceName = $.customerReferenceName;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.macsecProperties = $.macsecProperties;
        this.ociLogicalDeviceName = $.ociLogicalDeviceName;
        this.ociPhysicalDeviceName = $.ociPhysicalDeviceName;
        this.state = $.state;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CrossConnectGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CrossConnectGroupState $;

        public Builder() {
            $ = new CrossConnectGroupState();
        }

        public Builder(CrossConnectGroupState defaults) {
            $ = new CrossConnectGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the cross-connect group.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the cross-connect group.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param customerReferenceName (Updatable) A reference name or identifier for the physical fiber connection that this cross-connect group uses.
         * 
         * @return builder
         * 
         */
        public Builder customerReferenceName(@Nullable Output<String> customerReferenceName) {
            $.customerReferenceName = customerReferenceName;
            return this;
        }

        /**
         * @param customerReferenceName (Updatable) A reference name or identifier for the physical fiber connection that this cross-connect group uses.
         * 
         * @return builder
         * 
         */
        public Builder customerReferenceName(String customerReferenceName) {
            return customerReferenceName(Output.of(customerReferenceName));
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
         * @param displayName (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
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
         * @param macsecProperties Properties used for MACsec (if capable).
         * 
         * @return builder
         * 
         */
        public Builder macsecProperties(@Nullable Output<CrossConnectGroupMacsecPropertiesArgs> macsecProperties) {
            $.macsecProperties = macsecProperties;
            return this;
        }

        /**
         * @param macsecProperties Properties used for MACsec (if capable).
         * 
         * @return builder
         * 
         */
        public Builder macsecProperties(CrossConnectGroupMacsecPropertiesArgs macsecProperties) {
            return macsecProperties(Output.of(macsecProperties));
        }

        /**
         * @param ociLogicalDeviceName The FastConnect device that terminates the logical connection. This device might be different than the device that terminates the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder ociLogicalDeviceName(@Nullable Output<String> ociLogicalDeviceName) {
            $.ociLogicalDeviceName = ociLogicalDeviceName;
            return this;
        }

        /**
         * @param ociLogicalDeviceName The FastConnect device that terminates the logical connection. This device might be different than the device that terminates the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder ociLogicalDeviceName(String ociLogicalDeviceName) {
            return ociLogicalDeviceName(Output.of(ociLogicalDeviceName));
        }

        /**
         * @param ociPhysicalDeviceName The FastConnect device that terminates the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder ociPhysicalDeviceName(@Nullable Output<String> ociPhysicalDeviceName) {
            $.ociPhysicalDeviceName = ociPhysicalDeviceName;
            return this;
        }

        /**
         * @param ociPhysicalDeviceName The FastConnect device that terminates the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder ociPhysicalDeviceName(String ociPhysicalDeviceName) {
            return ociPhysicalDeviceName(Output.of(ociPhysicalDeviceName));
        }

        /**
         * @param state The cross-connect group&#39;s current state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The cross-connect group&#39;s current state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeCreated The date and time the cross-connect group was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the cross-connect group was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        public CrossConnectGroupState build() {
            return $;
        }
    }

}
