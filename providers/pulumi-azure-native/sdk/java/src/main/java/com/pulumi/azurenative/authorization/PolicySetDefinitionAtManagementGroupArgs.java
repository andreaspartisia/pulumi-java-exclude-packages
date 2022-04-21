// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.authorization.enums.PolicyType;
import com.pulumi.azurenative.authorization.inputs.ParameterDefinitionsValueArgs;
import com.pulumi.azurenative.authorization.inputs.PolicyDefinitionGroupArgs;
import com.pulumi.azurenative.authorization.inputs.PolicyDefinitionReferenceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicySetDefinitionAtManagementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicySetDefinitionAtManagementGroupArgs Empty = new PolicySetDefinitionAtManagementGroupArgs();

    /**
     * The policy set definition description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the policy set definition.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the management group.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private Output<String> managementGroupId;

    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The policy set definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The policy set definition parameters that can be used in policy definition references.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterDefinitionsValueArgs>> parameters;

    public Optional<Output<Map<String,ParameterDefinitionsValueArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The metadata describing groups of policy definition references within the policy set definition.
     * 
     */
    @Import(name="policyDefinitionGroups")
    private @Nullable Output<List<PolicyDefinitionGroupArgs>> policyDefinitionGroups;

    public Optional<Output<List<PolicyDefinitionGroupArgs>>> policyDefinitionGroups() {
        return Optional.ofNullable(this.policyDefinitionGroups);
    }

    /**
     * An array of policy definition references.
     * 
     */
    @Import(name="policyDefinitions", required=true)
    private Output<List<PolicyDefinitionReferenceArgs>> policyDefinitions;

    public Output<List<PolicyDefinitionReferenceArgs>> policyDefinitions() {
        return this.policyDefinitions;
    }

    /**
     * The name of the policy set definition to create.
     * 
     */
    @Import(name="policySetDefinitionName")
    private @Nullable Output<String> policySetDefinitionName;

    public Optional<Output<String>> policySetDefinitionName() {
        return Optional.ofNullable(this.policySetDefinitionName);
    }

    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<Either<String,PolicyType>> policyType;

    public Optional<Output<Either<String,PolicyType>>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private PolicySetDefinitionAtManagementGroupArgs() {}

    private PolicySetDefinitionAtManagementGroupArgs(PolicySetDefinitionAtManagementGroupArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.managementGroupId = $.managementGroupId;
        this.metadata = $.metadata;
        this.parameters = $.parameters;
        this.policyDefinitionGroups = $.policyDefinitionGroups;
        this.policyDefinitions = $.policyDefinitions;
        this.policySetDefinitionName = $.policySetDefinitionName;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicySetDefinitionAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicySetDefinitionAtManagementGroupArgs $;

        public Builder() {
            $ = new PolicySetDefinitionAtManagementGroupArgs();
        }

        public Builder(PolicySetDefinitionAtManagementGroupArgs defaults) {
            $ = new PolicySetDefinitionAtManagementGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder managementGroupId(Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterDefinitionsValueArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterDefinitionsValueArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder policyDefinitionGroups(@Nullable Output<List<PolicyDefinitionGroupArgs>> policyDefinitionGroups) {
            $.policyDefinitionGroups = policyDefinitionGroups;
            return this;
        }

        public Builder policyDefinitionGroups(List<PolicyDefinitionGroupArgs> policyDefinitionGroups) {
            return policyDefinitionGroups(Output.of(policyDefinitionGroups));
        }

        public Builder policyDefinitionGroups(PolicyDefinitionGroupArgs... policyDefinitionGroups) {
            return policyDefinitionGroups(List.of(policyDefinitionGroups));
        }

        public Builder policyDefinitions(Output<List<PolicyDefinitionReferenceArgs>> policyDefinitions) {
            $.policyDefinitions = policyDefinitions;
            return this;
        }

        public Builder policyDefinitions(List<PolicyDefinitionReferenceArgs> policyDefinitions) {
            return policyDefinitions(Output.of(policyDefinitions));
        }

        public Builder policyDefinitions(PolicyDefinitionReferenceArgs... policyDefinitions) {
            return policyDefinitions(List.of(policyDefinitions));
        }

        public Builder policySetDefinitionName(@Nullable Output<String> policySetDefinitionName) {
            $.policySetDefinitionName = policySetDefinitionName;
            return this;
        }

        public Builder policySetDefinitionName(String policySetDefinitionName) {
            return policySetDefinitionName(Output.of(policySetDefinitionName));
        }

        public Builder policyType(@Nullable Output<Either<String,PolicyType>> policyType) {
            $.policyType = policyType;
            return this;
        }

        public Builder policyType(Either<String,PolicyType> policyType) {
            return policyType(Output.of(policyType));
        }

        public Builder policyType(String policyType) {
            return policyType(Either.ofLeft(policyType));
        }

        public Builder policyType(PolicyType policyType) {
            return policyType(Either.ofRight(policyType));
        }

        public PolicySetDefinitionAtManagementGroupArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            $.policyDefinitions = Objects.requireNonNull($.policyDefinitions, "expected parameter 'policyDefinitions' to be non-null");
            return $;
        }
    }

}
