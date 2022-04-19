// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint;

import com.pulumi.azurenative.blueprint.inputs.ParameterValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyAssignmentArtifactArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyAssignmentArtifactArgs Empty = new PolicyAssignmentArtifactArgs();

    /**
     * Name of the blueprint artifact.
     * 
     */
    @Import(name="artifactName")
      private final @Nullable Output<String> artifactName;

    public Output<String> artifactName() {
        return this.artifactName == null ? Codegen.empty() : this.artifactName;
    }

    /**
     * Name of the blueprint definition.
     * 
     */
    @Import(name="blueprintName", required=true)
      private final Output<String> blueprintName;

    public Output<String> blueprintName() {
        return this.blueprintName;
    }

    /**
     * Artifacts which need to be deployed before the specified artifact.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<String>> dependsOn;

    public Output<List<String>> dependsOn() {
        return this.dependsOn == null ? Codegen.empty() : this.dependsOn;
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Specifies the kind of blueprint artifact.
     * Expected value is 'policyAssignment'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Parameter values for the policy definition.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<Map<String,ParameterValueArgs>> parameters;

    public Output<Map<String,ParameterValueArgs>> parameters() {
        return this.parameters;
    }

    /**
     * Azure resource ID of the policy definition.
     * 
     */
    @Import(name="policyDefinitionId", required=true)
      private final Output<String> policyDefinitionId;

    public Output<String> policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Name of the resource group placeholder to which the policy will be assigned.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable Output<String> resourceGroup;

    public Output<String> resourceGroup() {
        return this.resourceGroup == null ? Codegen.empty() : this.resourceGroup;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}').
     * 
     */
    @Import(name="resourceScope", required=true)
      private final Output<String> resourceScope;

    public Output<String> resourceScope() {
        return this.resourceScope;
    }

    public PolicyAssignmentArtifactArgs(
        @Nullable Output<String> artifactName,
        Output<String> blueprintName,
        @Nullable Output<List<String>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        Output<String> kind,
        Output<Map<String,ParameterValueArgs>> parameters,
        Output<String> policyDefinitionId,
        @Nullable Output<String> resourceGroup,
        Output<String> resourceScope) {
        this.artifactName = artifactName;
        this.blueprintName = Objects.requireNonNull(blueprintName, "expected parameter 'blueprintName' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.displayName = displayName;
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId, "expected parameter 'policyDefinitionId' to be non-null");
        this.resourceGroup = resourceGroup;
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
    }

    private PolicyAssignmentArtifactArgs() {
        this.artifactName = Codegen.empty();
        this.blueprintName = Codegen.empty();
        this.dependsOn = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.kind = Codegen.empty();
        this.parameters = Codegen.empty();
        this.policyDefinitionId = Codegen.empty();
        this.resourceGroup = Codegen.empty();
        this.resourceScope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> artifactName;
        private Output<String> blueprintName;
        private @Nullable Output<List<String>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private Output<String> kind;
        private Output<Map<String,ParameterValueArgs>> parameters;
        private Output<String> policyDefinitionId;
        private @Nullable Output<String> resourceGroup;
        private Output<String> resourceScope;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactName = defaults.artifactName;
    	      this.blueprintName = defaults.blueprintName;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.kind = defaults.kind;
    	      this.parameters = defaults.parameters;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceScope = defaults.resourceScope;
        }

        public Builder artifactName(@Nullable Output<String> artifactName) {
            this.artifactName = artifactName;
            return this;
        }
        public Builder artifactName(@Nullable String artifactName) {
            this.artifactName = Codegen.ofNullable(artifactName);
            return this;
        }
        public Builder blueprintName(Output<String> blueprintName) {
            this.blueprintName = Objects.requireNonNull(blueprintName);
            return this;
        }
        public Builder blueprintName(String blueprintName) {
            this.blueprintName = Output.of(Objects.requireNonNull(blueprintName));
            return this;
        }
        public Builder dependsOn(@Nullable Output<List<String>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<String> dependsOn) {
            this.dependsOn = Codegen.ofNullable(dependsOn);
            return this;
        }
        public Builder dependsOn(String... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder parameters(Output<Map<String,ParameterValueArgs>> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(Map<String,ParameterValueArgs> parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }
        public Builder policyDefinitionId(Output<String> policyDefinitionId) {
            this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId);
            return this;
        }
        public Builder policyDefinitionId(String policyDefinitionId) {
            this.policyDefinitionId = Output.of(Objects.requireNonNull(policyDefinitionId));
            return this;
        }
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Codegen.ofNullable(resourceGroup);
            return this;
        }
        public Builder resourceScope(Output<String> resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }
        public Builder resourceScope(String resourceScope) {
            this.resourceScope = Output.of(Objects.requireNonNull(resourceScope));
            return this;
        }        public PolicyAssignmentArtifactArgs build() {
            return new PolicyAssignmentArtifactArgs(artifactName, blueprintName, dependsOn, description, displayName, kind, parameters, policyDefinitionId, resourceGroup, resourceScope);
        }
    }
}
