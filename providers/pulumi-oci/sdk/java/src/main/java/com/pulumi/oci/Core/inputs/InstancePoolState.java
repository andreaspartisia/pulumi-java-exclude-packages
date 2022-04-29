// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.InstancePoolLoadBalancerArgs;
import com.pulumi.oci.Core.inputs.InstancePoolPlacementConfigurationArgs;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePoolState extends com.pulumi.resources.ResourceArgs {

    public static final InstancePoolState Empty = new InstancePoolState();

    /**
     * The number of actual instances in the instance pool on the cloud. This attribute will be different when instance pool is used along with autoScaling Configuration.
     * 
     */
    @Import(name="actualSize")
    private @Nullable Output<Integer> actualSize;

    /**
     * @return The number of actual instances in the instance pool on the cloud. This attribute will be different when instance pool is used along with autoScaling Configuration.
     * 
     */
    public Optional<Output<Integer>> actualSize() {
        return Optional.ofNullable(this.actualSize);
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the instance pool.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the instance pool.
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
     * (Updatable) The display name of the VNIC. This is also use to match against the instance configuration defined secondary VNIC.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) The display name of the VNIC. This is also use to match against the instance configuration defined secondary VNIC.
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
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance configuration associated with the instance pool.
     * 
     */
    @Import(name="instanceConfigurationId")
    private @Nullable Output<String> instanceConfigurationId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance configuration associated with the instance pool.
     * 
     */
    public Optional<Output<String>> instanceConfigurationId() {
        return Optional.ofNullable(this.instanceConfigurationId);
    }

    /**
     * The load balancers to attach to the instance pool.
     * 
     */
    @Import(name="loadBalancers")
    private @Nullable Output<List<InstancePoolLoadBalancerArgs>> loadBalancers;

    /**
     * @return The load balancers to attach to the instance pool.
     * 
     */
    public Optional<Output<List<InstancePoolLoadBalancerArgs>>> loadBalancers() {
        return Optional.ofNullable(this.loadBalancers);
    }

    /**
     * (Updatable) The placement configurations for the instance pool. Provide one placement configuration for each availability domain.
     * 
     */
    @Import(name="placementConfigurations")
    private @Nullable Output<List<InstancePoolPlacementConfigurationArgs>> placementConfigurations;

    /**
     * @return (Updatable) The placement configurations for the instance pool. Provide one placement configuration for each availability domain.
     * 
     */
    public Optional<Output<List<InstancePoolPlacementConfigurationArgs>>> placementConfigurations() {
        return Optional.ofNullable(this.placementConfigurations);
    }

    /**
     * (Updatable) The number of instances that should be in the instance pool. Modifying this value will override the size of the instance pool. If the instance pool is linked with autoscaling configuration, autoscaling configuration could resize the instance pool at a later point. The instance pool&#39;s actual size may differ from the configured size if it is associated with an autoscaling configuration, instance pool&#39;s actual size will be reflected in this size attribute.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return (Updatable) The number of instances that should be in the instance pool. Modifying this value will override the size of the instance pool. If the instance pool is linked with autoscaling configuration, autoscaling configuration could resize the instance pool at a later point. The instance pool&#39;s actual size may differ from the configured size if it is associated with an autoscaling configuration, instance pool&#39;s actual size will be reflected in this size attribute.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * (Updatable) The target state for the instance pool update operation (ignored at create time and should not be set). Could be set to RUNNING or STOPPED.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Updatable) The target state for the instance pool update operation (ignored at create time and should not be set). Could be set to RUNNING or STOPPED.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The date and time the instance pool was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the instance pool was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    private InstancePoolState() {}

    private InstancePoolState(InstancePoolState $) {
        this.actualSize = $.actualSize;
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.instanceConfigurationId = $.instanceConfigurationId;
        this.loadBalancers = $.loadBalancers;
        this.placementConfigurations = $.placementConfigurations;
        this.size = $.size;
        this.state = $.state;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePoolState $;

        public Builder() {
            $ = new InstancePoolState();
        }

        public Builder(InstancePoolState defaults) {
            $ = new InstancePoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param actualSize The number of actual instances in the instance pool on the cloud. This attribute will be different when instance pool is used along with autoScaling Configuration.
         * 
         * @return builder
         * 
         */
        public Builder actualSize(@Nullable Output<Integer> actualSize) {
            $.actualSize = actualSize;
            return this;
        }

        /**
         * @param actualSize The number of actual instances in the instance pool on the cloud. This attribute will be different when instance pool is used along with autoScaling Configuration.
         * 
         * @return builder
         * 
         */
        public Builder actualSize(Integer actualSize) {
            return actualSize(Output.of(actualSize));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the instance pool.
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
         * @param displayName (Updatable) The display name of the VNIC. This is also use to match against the instance configuration defined secondary VNIC.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) The display name of the VNIC. This is also use to match against the instance configuration defined secondary VNIC.
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
         * @param instanceConfigurationId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance configuration associated with the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder instanceConfigurationId(@Nullable Output<String> instanceConfigurationId) {
            $.instanceConfigurationId = instanceConfigurationId;
            return this;
        }

        /**
         * @param instanceConfigurationId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance configuration associated with the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            return instanceConfigurationId(Output.of(instanceConfigurationId));
        }

        /**
         * @param loadBalancers The load balancers to attach to the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancers(@Nullable Output<List<InstancePoolLoadBalancerArgs>> loadBalancers) {
            $.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * @param loadBalancers The load balancers to attach to the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancers(List<InstancePoolLoadBalancerArgs> loadBalancers) {
            return loadBalancers(Output.of(loadBalancers));
        }

        /**
         * @param loadBalancers The load balancers to attach to the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancers(InstancePoolLoadBalancerArgs... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }

        /**
         * @param placementConfigurations (Updatable) The placement configurations for the instance pool. Provide one placement configuration for each availability domain.
         * 
         * @return builder
         * 
         */
        public Builder placementConfigurations(@Nullable Output<List<InstancePoolPlacementConfigurationArgs>> placementConfigurations) {
            $.placementConfigurations = placementConfigurations;
            return this;
        }

        /**
         * @param placementConfigurations (Updatable) The placement configurations for the instance pool. Provide one placement configuration for each availability domain.
         * 
         * @return builder
         * 
         */
        public Builder placementConfigurations(List<InstancePoolPlacementConfigurationArgs> placementConfigurations) {
            return placementConfigurations(Output.of(placementConfigurations));
        }

        /**
         * @param placementConfigurations (Updatable) The placement configurations for the instance pool. Provide one placement configuration for each availability domain.
         * 
         * @return builder
         * 
         */
        public Builder placementConfigurations(InstancePoolPlacementConfigurationArgs... placementConfigurations) {
            return placementConfigurations(List.of(placementConfigurations));
        }

        /**
         * @param size (Updatable) The number of instances that should be in the instance pool. Modifying this value will override the size of the instance pool. If the instance pool is linked with autoscaling configuration, autoscaling configuration could resize the instance pool at a later point. The instance pool&#39;s actual size may differ from the configured size if it is associated with an autoscaling configuration, instance pool&#39;s actual size will be reflected in this size attribute.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size (Updatable) The number of instances that should be in the instance pool. Modifying this value will override the size of the instance pool. If the instance pool is linked with autoscaling configuration, autoscaling configuration could resize the instance pool at a later point. The instance pool&#39;s actual size may differ from the configured size if it is associated with an autoscaling configuration, instance pool&#39;s actual size will be reflected in this size attribute.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param state (Updatable) The target state for the instance pool update operation (ignored at create time and should not be set). Could be set to RUNNING or STOPPED.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Updatable) The target state for the instance pool update operation (ignored at create time and should not be set). Could be set to RUNNING or STOPPED.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeCreated The date and time the instance pool was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the instance pool was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        public InstancePoolState build() {
            return $;
        }
    }

}
