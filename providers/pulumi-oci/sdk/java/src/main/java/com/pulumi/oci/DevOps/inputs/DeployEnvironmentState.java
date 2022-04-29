// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DevOps.inputs.DeployEnvironmentComputeInstanceGroupSelectorsArgs;
import com.pulumi.oci.DevOps.inputs.DeployEnvironmentNetworkChannelArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeployEnvironmentState extends com.pulumi.resources.ResourceArgs {

    public static final DeployEnvironmentState Empty = new DeployEnvironmentState();

    /**
     * (Updatable) The OCID of the Kubernetes cluster.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return (Updatable) The OCID of the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The OCID of a compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The OCID of a compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) A collection of selectors. The combination of instances matching the selectors are included in the instance group.
     * 
     */
    @Import(name="computeInstanceGroupSelectors")
    private @Nullable Output<DeployEnvironmentComputeInstanceGroupSelectorsArgs> computeInstanceGroupSelectors;

    /**
     * @return (Updatable) A collection of selectors. The combination of instances matching the selectors are included in the instance group.
     * 
     */
    public Optional<Output<DeployEnvironmentComputeInstanceGroupSelectorsArgs>> computeInstanceGroupSelectors() {
        return Optional.ofNullable(this.computeInstanceGroupSelectors);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) Deployment environment type.
     * 
     */
    @Import(name="deployEnvironmentType")
    private @Nullable Output<String> deployEnvironmentType;

    /**
     * @return (Updatable) Deployment environment type.
     * 
     */
    public Optional<Output<String>> deployEnvironmentType() {
        return Optional.ofNullable(this.deployEnvironmentType);
    }

    /**
     * (Updatable) Optional description about the deployment environment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) Optional description about the deployment environment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) Deployment environment display name. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) Deployment environment display name. Avoid entering confidential information.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * (Updatable) The OCID of the Function.
     * 
     */
    @Import(name="functionId")
    private @Nullable Output<String> functionId;

    /**
     * @return (Updatable) The OCID of the Function.
     * 
     */
    public Optional<Output<String>> functionId() {
        return Optional.ofNullable(this.functionId);
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * (Updatable) Specifies the configuration needed when the target Oracle Cloud Infrastructure resource, i.e., OKE cluster, resides in customer&#39;s private network.
     * 
     */
    @Import(name="networkChannel")
    private @Nullable Output<DeployEnvironmentNetworkChannelArgs> networkChannel;

    /**
     * @return (Updatable) Specifies the configuration needed when the target Oracle Cloud Infrastructure resource, i.e., OKE cluster, resides in customer&#39;s private network.
     * 
     */
    public Optional<Output<DeployEnvironmentNetworkChannelArgs>> networkChannel() {
        return Optional.ofNullable(this.networkChannel);
    }

    /**
     * The OCID of a project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The OCID of a project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The current state of the deployment environment.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the deployment environment.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Import(name="systemTags")
    private @Nullable Output<Map<String,Object>> systemTags;

    /**
     * @return Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> systemTags() {
        return Optional.ofNullable(this.systemTags);
    }

    /**
     * Time the deployment environment was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return Time the deployment environment was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * Time the deployment environment was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    @Import(name="timeUpdated")
    private @Nullable Output<String> timeUpdated;

    /**
     * @return Time the deployment environment was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    public Optional<Output<String>> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    private DeployEnvironmentState() {}

    private DeployEnvironmentState(DeployEnvironmentState $) {
        this.clusterId = $.clusterId;
        this.compartmentId = $.compartmentId;
        this.computeInstanceGroupSelectors = $.computeInstanceGroupSelectors;
        this.definedTags = $.definedTags;
        this.deployEnvironmentType = $.deployEnvironmentType;
        this.description = $.description;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.functionId = $.functionId;
        this.lifecycleDetails = $.lifecycleDetails;
        this.networkChannel = $.networkChannel;
        this.projectId = $.projectId;
        this.state = $.state;
        this.systemTags = $.systemTags;
        this.timeCreated = $.timeCreated;
        this.timeUpdated = $.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeployEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeployEnvironmentState $;

        public Builder() {
            $ = new DeployEnvironmentState();
        }

        public Builder(DeployEnvironmentState defaults) {
            $ = new DeployEnvironmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId (Updatable) The OCID of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId (Updatable) The OCID of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param compartmentId The OCID of a compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of a compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param computeInstanceGroupSelectors (Updatable) A collection of selectors. The combination of instances matching the selectors are included in the instance group.
         * 
         * @return builder
         * 
         */
        public Builder computeInstanceGroupSelectors(@Nullable Output<DeployEnvironmentComputeInstanceGroupSelectorsArgs> computeInstanceGroupSelectors) {
            $.computeInstanceGroupSelectors = computeInstanceGroupSelectors;
            return this;
        }

        /**
         * @param computeInstanceGroupSelectors (Updatable) A collection of selectors. The combination of instances matching the selectors are included in the instance group.
         * 
         * @return builder
         * 
         */
        public Builder computeInstanceGroupSelectors(DeployEnvironmentComputeInstanceGroupSelectorsArgs computeInstanceGroupSelectors) {
            return computeInstanceGroupSelectors(Output.of(computeInstanceGroupSelectors));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param deployEnvironmentType (Updatable) Deployment environment type.
         * 
         * @return builder
         * 
         */
        public Builder deployEnvironmentType(@Nullable Output<String> deployEnvironmentType) {
            $.deployEnvironmentType = deployEnvironmentType;
            return this;
        }

        /**
         * @param deployEnvironmentType (Updatable) Deployment environment type.
         * 
         * @return builder
         * 
         */
        public Builder deployEnvironmentType(String deployEnvironmentType) {
            return deployEnvironmentType(Output.of(deployEnvironmentType));
        }

        /**
         * @param description (Updatable) Optional description about the deployment environment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) Optional description about the deployment environment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName (Updatable) Deployment environment display name. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) Deployment environment display name. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param functionId (Updatable) The OCID of the Function.
         * 
         * @return builder
         * 
         */
        public Builder functionId(@Nullable Output<String> functionId) {
            $.functionId = functionId;
            return this;
        }

        /**
         * @param functionId (Updatable) The OCID of the Function.
         * 
         * @return builder
         * 
         */
        public Builder functionId(String functionId) {
            return functionId(Output.of(functionId));
        }

        /**
         * @param lifecycleDetails A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param networkChannel (Updatable) Specifies the configuration needed when the target Oracle Cloud Infrastructure resource, i.e., OKE cluster, resides in customer&#39;s private network.
         * 
         * @return builder
         * 
         */
        public Builder networkChannel(@Nullable Output<DeployEnvironmentNetworkChannelArgs> networkChannel) {
            $.networkChannel = networkChannel;
            return this;
        }

        /**
         * @param networkChannel (Updatable) Specifies the configuration needed when the target Oracle Cloud Infrastructure resource, i.e., OKE cluster, resides in customer&#39;s private network.
         * 
         * @return builder
         * 
         */
        public Builder networkChannel(DeployEnvironmentNetworkChannelArgs networkChannel) {
            return networkChannel(Output.of(networkChannel));
        }

        /**
         * @param projectId The OCID of a project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The OCID of a project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param state The current state of the deployment environment.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the deployment environment.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param systemTags Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(@Nullable Output<Map<String,Object>> systemTags) {
            $.systemTags = systemTags;
            return this;
        }

        /**
         * @param systemTags Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(Map<String,Object> systemTags) {
            return systemTags(Output.of(systemTags));
        }

        /**
         * @param timeCreated Time the deployment environment was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated Time the deployment environment was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeUpdated Time the deployment environment was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(@Nullable Output<String> timeUpdated) {
            $.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * @param timeUpdated Time the deployment environment was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(String timeUpdated) {
            return timeUpdated(Output.of(timeUpdated));
        }

        public DeployEnvironmentState build() {
            return $;
        }
    }

}
