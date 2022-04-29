// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Integration;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Integration.inputs.IntegrationInstanceAlternateCustomEndpointArgs;
import com.pulumi.oci.Integration.inputs.IntegrationInstanceCustomEndpointArgs;
import com.pulumi.oci.Integration.inputs.IntegrationInstanceNetworkEndpointDetailsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationInstanceArgs Empty = new IntegrationInstanceArgs();

    /**
     * (Updatable) A list of alternate custom endpoints to be used for the integration instance URL (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     * 
     */
    @Import(name="alternateCustomEndpoints")
    private @Nullable Output<List<IntegrationInstanceAlternateCustomEndpointArgs>> alternateCustomEndpoints;

    /**
     * @return (Updatable) A list of alternate custom endpoints to be used for the integration instance URL (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     * 
     */
    public Optional<Output<List<IntegrationInstanceAlternateCustomEndpointArgs>>> alternateCustomEndpoints() {
        return Optional.ofNullable(this.alternateCustomEndpoints);
    }

    /**
     * (Updatable) Compartment Identifier.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     * 
     */
    @Import(name="consumptionModel")
    private @Nullable Output<String> consumptionModel;

    /**
     * @return Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     * 
     */
    public Optional<Output<String>> consumptionModel() {
        return Optional.ofNullable(this.consumptionModel);
    }

    /**
     * (Updatable) Details for a custom endpoint for the integration instance (update).
     * 
     */
    @Import(name="customEndpoint")
    private @Nullable Output<IntegrationInstanceCustomEndpointArgs> customEndpoint;

    /**
     * @return (Updatable) Details for a custom endpoint for the integration instance (update).
     * 
     */
    public Optional<Output<IntegrationInstanceCustomEndpointArgs>> customEndpoint() {
        return Optional.ofNullable(this.customEndpoint);
    }

    /**
     * (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) Integration Instance Identifier.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return (Updatable) Integration Instance Identifier.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * (Updatable) IDCS Authentication token. This is required for all realms with IDCS. Its optional as its not required for non IDCS realms.
     * 
     */
    @Import(name="idcsAt")
    private @Nullable Output<String> idcsAt;

    /**
     * @return (Updatable) IDCS Authentication token. This is required for all realms with IDCS. Its optional as its not required for non IDCS realms.
     * 
     */
    public Optional<Output<String>> idcsAt() {
        return Optional.ofNullable(this.idcsAt);
    }

    /**
     * (Updatable) Standard or Enterprise type
     * 
     */
    @Import(name="integrationInstanceType", required=true)
    private Output<String> integrationInstanceType;

    /**
     * @return (Updatable) Standard or Enterprise type
     * 
     */
    public Output<String> integrationInstanceType() {
        return this.integrationInstanceType;
    }

    /**
     * (Updatable) Bring your own license.
     * 
     */
    @Import(name="isByol", required=true)
    private Output<Boolean> isByol;

    /**
     * @return (Updatable) Bring your own license.
     * 
     */
    public Output<Boolean> isByol() {
        return this.isByol;
    }

    /**
     * (Updatable) The file server is enabled or not.
     * 
     */
    @Import(name="isFileServerEnabled")
    private @Nullable Output<Boolean> isFileServerEnabled;

    /**
     * @return (Updatable) The file server is enabled or not.
     * 
     */
    public Optional<Output<Boolean>> isFileServerEnabled() {
        return Optional.ofNullable(this.isFileServerEnabled);
    }

    /**
     * (Updatable) Visual Builder is enabled or not.
     * 
     */
    @Import(name="isVisualBuilderEnabled")
    private @Nullable Output<Boolean> isVisualBuilderEnabled;

    /**
     * @return (Updatable) Visual Builder is enabled or not.
     * 
     */
    public Optional<Output<Boolean>> isVisualBuilderEnabled() {
        return Optional.ofNullable(this.isVisualBuilderEnabled);
    }

    /**
     * (Updatable) The number of configured message packs
     * 
     */
    @Import(name="messagePacks", required=true)
    private Output<Integer> messagePacks;

    /**
     * @return (Updatable) The number of configured message packs
     * 
     */
    public Output<Integer> messagePacks() {
        return this.messagePacks;
    }

    /**
     * Base representation of a network endpoint.
     * 
     */
    @Import(name="networkEndpointDetails")
    private @Nullable Output<IntegrationInstanceNetworkEndpointDetailsArgs> networkEndpointDetails;

    /**
     * @return Base representation of a network endpoint.
     * 
     */
    public Optional<Output<IntegrationInstanceNetworkEndpointDetailsArgs>> networkEndpointDetails() {
        return Optional.ofNullable(this.networkEndpointDetails);
    }

    /**
     * (Updatable) The target state for the instance. Could be set to ACTIVE or INACTIVE
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Updatable) The target state for the instance. Could be set to ACTIVE or INACTIVE
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private IntegrationInstanceArgs() {}

    private IntegrationInstanceArgs(IntegrationInstanceArgs $) {
        this.alternateCustomEndpoints = $.alternateCustomEndpoints;
        this.compartmentId = $.compartmentId;
        this.consumptionModel = $.consumptionModel;
        this.customEndpoint = $.customEndpoint;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.idcsAt = $.idcsAt;
        this.integrationInstanceType = $.integrationInstanceType;
        this.isByol = $.isByol;
        this.isFileServerEnabled = $.isFileServerEnabled;
        this.isVisualBuilderEnabled = $.isVisualBuilderEnabled;
        this.messagePacks = $.messagePacks;
        this.networkEndpointDetails = $.networkEndpointDetails;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationInstanceArgs $;

        public Builder() {
            $ = new IntegrationInstanceArgs();
        }

        public Builder(IntegrationInstanceArgs defaults) {
            $ = new IntegrationInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternateCustomEndpoints (Updatable) A list of alternate custom endpoints to be used for the integration instance URL (contact Oracle for alternateCustomEndpoints availability for a specific instance).
         * 
         * @return builder
         * 
         */
        public Builder alternateCustomEndpoints(@Nullable Output<List<IntegrationInstanceAlternateCustomEndpointArgs>> alternateCustomEndpoints) {
            $.alternateCustomEndpoints = alternateCustomEndpoints;
            return this;
        }

        /**
         * @param alternateCustomEndpoints (Updatable) A list of alternate custom endpoints to be used for the integration instance URL (contact Oracle for alternateCustomEndpoints availability for a specific instance).
         * 
         * @return builder
         * 
         */
        public Builder alternateCustomEndpoints(List<IntegrationInstanceAlternateCustomEndpointArgs> alternateCustomEndpoints) {
            return alternateCustomEndpoints(Output.of(alternateCustomEndpoints));
        }

        /**
         * @param alternateCustomEndpoints (Updatable) A list of alternate custom endpoints to be used for the integration instance URL (contact Oracle for alternateCustomEndpoints availability for a specific instance).
         * 
         * @return builder
         * 
         */
        public Builder alternateCustomEndpoints(IntegrationInstanceAlternateCustomEndpointArgs... alternateCustomEndpoints) {
            return alternateCustomEndpoints(List.of(alternateCustomEndpoints));
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param consumptionModel Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
         * 
         * @return builder
         * 
         */
        public Builder consumptionModel(@Nullable Output<String> consumptionModel) {
            $.consumptionModel = consumptionModel;
            return this;
        }

        /**
         * @param consumptionModel Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
         * 
         * @return builder
         * 
         */
        public Builder consumptionModel(String consumptionModel) {
            return consumptionModel(Output.of(consumptionModel));
        }

        /**
         * @param customEndpoint (Updatable) Details for a custom endpoint for the integration instance (update).
         * 
         * @return builder
         * 
         */
        public Builder customEndpoint(@Nullable Output<IntegrationInstanceCustomEndpointArgs> customEndpoint) {
            $.customEndpoint = customEndpoint;
            return this;
        }

        /**
         * @param customEndpoint (Updatable) Details for a custom endpoint for the integration instance (update).
         * 
         * @return builder
         * 
         */
        public Builder customEndpoint(IntegrationInstanceCustomEndpointArgs customEndpoint) {
            return customEndpoint(Output.of(customEndpoint));
        }

        /**
         * @param definedTags (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) Integration Instance Identifier.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) Integration Instance Identifier.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param idcsAt (Updatable) IDCS Authentication token. This is required for all realms with IDCS. Its optional as its not required for non IDCS realms.
         * 
         * @return builder
         * 
         */
        public Builder idcsAt(@Nullable Output<String> idcsAt) {
            $.idcsAt = idcsAt;
            return this;
        }

        /**
         * @param idcsAt (Updatable) IDCS Authentication token. This is required for all realms with IDCS. Its optional as its not required for non IDCS realms.
         * 
         * @return builder
         * 
         */
        public Builder idcsAt(String idcsAt) {
            return idcsAt(Output.of(idcsAt));
        }

        /**
         * @param integrationInstanceType (Updatable) Standard or Enterprise type
         * 
         * @return builder
         * 
         */
        public Builder integrationInstanceType(Output<String> integrationInstanceType) {
            $.integrationInstanceType = integrationInstanceType;
            return this;
        }

        /**
         * @param integrationInstanceType (Updatable) Standard or Enterprise type
         * 
         * @return builder
         * 
         */
        public Builder integrationInstanceType(String integrationInstanceType) {
            return integrationInstanceType(Output.of(integrationInstanceType));
        }

        /**
         * @param isByol (Updatable) Bring your own license.
         * 
         * @return builder
         * 
         */
        public Builder isByol(Output<Boolean> isByol) {
            $.isByol = isByol;
            return this;
        }

        /**
         * @param isByol (Updatable) Bring your own license.
         * 
         * @return builder
         * 
         */
        public Builder isByol(Boolean isByol) {
            return isByol(Output.of(isByol));
        }

        /**
         * @param isFileServerEnabled (Updatable) The file server is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder isFileServerEnabled(@Nullable Output<Boolean> isFileServerEnabled) {
            $.isFileServerEnabled = isFileServerEnabled;
            return this;
        }

        /**
         * @param isFileServerEnabled (Updatable) The file server is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder isFileServerEnabled(Boolean isFileServerEnabled) {
            return isFileServerEnabled(Output.of(isFileServerEnabled));
        }

        /**
         * @param isVisualBuilderEnabled (Updatable) Visual Builder is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder isVisualBuilderEnabled(@Nullable Output<Boolean> isVisualBuilderEnabled) {
            $.isVisualBuilderEnabled = isVisualBuilderEnabled;
            return this;
        }

        /**
         * @param isVisualBuilderEnabled (Updatable) Visual Builder is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder isVisualBuilderEnabled(Boolean isVisualBuilderEnabled) {
            return isVisualBuilderEnabled(Output.of(isVisualBuilderEnabled));
        }

        /**
         * @param messagePacks (Updatable) The number of configured message packs
         * 
         * @return builder
         * 
         */
        public Builder messagePacks(Output<Integer> messagePacks) {
            $.messagePacks = messagePacks;
            return this;
        }

        /**
         * @param messagePacks (Updatable) The number of configured message packs
         * 
         * @return builder
         * 
         */
        public Builder messagePacks(Integer messagePacks) {
            return messagePacks(Output.of(messagePacks));
        }

        /**
         * @param networkEndpointDetails Base representation of a network endpoint.
         * 
         * @return builder
         * 
         */
        public Builder networkEndpointDetails(@Nullable Output<IntegrationInstanceNetworkEndpointDetailsArgs> networkEndpointDetails) {
            $.networkEndpointDetails = networkEndpointDetails;
            return this;
        }

        /**
         * @param networkEndpointDetails Base representation of a network endpoint.
         * 
         * @return builder
         * 
         */
        public Builder networkEndpointDetails(IntegrationInstanceNetworkEndpointDetailsArgs networkEndpointDetails) {
            return networkEndpointDetails(Output.of(networkEndpointDetails));
        }

        /**
         * @param state (Updatable) The target state for the instance. Could be set to ACTIVE or INACTIVE
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Updatable) The target state for the instance. Could be set to ACTIVE or INACTIVE
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public IntegrationInstanceArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.integrationInstanceType = Objects.requireNonNull($.integrationInstanceType, "expected parameter 'integrationInstanceType' to be non-null");
            $.isByol = Objects.requireNonNull($.isByol, "expected parameter 'isByol' to be non-null");
            $.messagePacks = Objects.requireNonNull($.messagePacks, "expected parameter 'messagePacks' to be non-null");
            return $;
        }
    }

}
