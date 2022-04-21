// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.logic.enums.WorkflowState;
import com.pulumi.azurenative.logic.inputs.FlowAccessControlConfigurationArgs;
import com.pulumi.azurenative.logic.inputs.FlowEndpointsConfigurationArgs;
import com.pulumi.azurenative.logic.inputs.ManagedServiceIdentityArgs;
import com.pulumi.azurenative.logic.inputs.ResourceReferenceArgs;
import com.pulumi.azurenative.logic.inputs.WorkflowParameterArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowArgs Empty = new WorkflowArgs();

    /**
     * The access control configuration.
     * 
     */
    @Import(name="accessControl")
    private @Nullable Output<FlowAccessControlConfigurationArgs> accessControl;

    public Optional<Output<FlowAccessControlConfigurationArgs>> accessControl() {
        return Optional.ofNullable(this.accessControl);
    }

    /**
     * The definition.
     * 
     */
    @Import(name="definition")
    private @Nullable Output<Object> definition;

    public Optional<Output<Object>> definition() {
        return Optional.ofNullable(this.definition);
    }

    /**
     * The endpoints configuration.
     * 
     */
    @Import(name="endpointsConfiguration")
    private @Nullable Output<FlowEndpointsConfigurationArgs> endpointsConfiguration;

    public Optional<Output<FlowEndpointsConfigurationArgs>> endpointsConfiguration() {
        return Optional.ofNullable(this.endpointsConfiguration);
    }

    /**
     * Managed service identity properties.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Optional<Output<ManagedServiceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The integration account.
     * 
     */
    @Import(name="integrationAccount")
    private @Nullable Output<ResourceReferenceArgs> integrationAccount;

    public Optional<Output<ResourceReferenceArgs>> integrationAccount() {
        return Optional.ofNullable(this.integrationAccount);
    }

    /**
     * The integration service environment.
     * 
     */
    @Import(name="integrationServiceEnvironment")
    private @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment;

    public Optional<Output<ResourceReferenceArgs>> integrationServiceEnvironment() {
        return Optional.ofNullable(this.integrationServiceEnvironment);
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The parameters.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,WorkflowParameterArgs>> parameters;

    public Optional<Output<Map<String,WorkflowParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,WorkflowState>> state;

    public Optional<Output<Either<String,WorkflowState>>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The workflow name.
     * 
     */
    @Import(name="workflowName")
    private @Nullable Output<String> workflowName;

    public Optional<Output<String>> workflowName() {
        return Optional.ofNullable(this.workflowName);
    }

    private WorkflowArgs() {}

    private WorkflowArgs(WorkflowArgs $) {
        this.accessControl = $.accessControl;
        this.definition = $.definition;
        this.endpointsConfiguration = $.endpointsConfiguration;
        this.identity = $.identity;
        this.integrationAccount = $.integrationAccount;
        this.integrationServiceEnvironment = $.integrationServiceEnvironment;
        this.location = $.location;
        this.parameters = $.parameters;
        this.resourceGroupName = $.resourceGroupName;
        this.state = $.state;
        this.tags = $.tags;
        this.workflowName = $.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowArgs $;

        public Builder() {
            $ = new WorkflowArgs();
        }

        public Builder(WorkflowArgs defaults) {
            $ = new WorkflowArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessControl(@Nullable Output<FlowAccessControlConfigurationArgs> accessControl) {
            $.accessControl = accessControl;
            return this;
        }

        public Builder accessControl(FlowAccessControlConfigurationArgs accessControl) {
            return accessControl(Output.of(accessControl));
        }

        public Builder definition(@Nullable Output<Object> definition) {
            $.definition = definition;
            return this;
        }

        public Builder definition(Object definition) {
            return definition(Output.of(definition));
        }

        public Builder endpointsConfiguration(@Nullable Output<FlowEndpointsConfigurationArgs> endpointsConfiguration) {
            $.endpointsConfiguration = endpointsConfiguration;
            return this;
        }

        public Builder endpointsConfiguration(FlowEndpointsConfigurationArgs endpointsConfiguration) {
            return endpointsConfiguration(Output.of(endpointsConfiguration));
        }

        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(ManagedServiceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder integrationAccount(@Nullable Output<ResourceReferenceArgs> integrationAccount) {
            $.integrationAccount = integrationAccount;
            return this;
        }

        public Builder integrationAccount(ResourceReferenceArgs integrationAccount) {
            return integrationAccount(Output.of(integrationAccount));
        }

        public Builder integrationServiceEnvironment(@Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment) {
            $.integrationServiceEnvironment = integrationServiceEnvironment;
            return this;
        }

        public Builder integrationServiceEnvironment(ResourceReferenceArgs integrationServiceEnvironment) {
            return integrationServiceEnvironment(Output.of(integrationServiceEnvironment));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder parameters(@Nullable Output<Map<String,WorkflowParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,WorkflowParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder state(@Nullable Output<Either<String,WorkflowState>> state) {
            $.state = state;
            return this;
        }

        public Builder state(Either<String,WorkflowState> state) {
            return state(Output.of(state));
        }

        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        public Builder state(WorkflowState state) {
            return state(Either.ofRight(state));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder workflowName(@Nullable Output<String> workflowName) {
            $.workflowName = workflowName;
            return this;
        }

        public Builder workflowName(String workflowName) {
            return workflowName(Output.of(workflowName));
        }

        public WorkflowArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
