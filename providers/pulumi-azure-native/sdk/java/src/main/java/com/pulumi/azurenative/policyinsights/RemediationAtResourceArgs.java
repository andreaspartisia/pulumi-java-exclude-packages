// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights;

import com.pulumi.azurenative.policyinsights.enums.ResourceDiscoveryMode;
import com.pulumi.azurenative.policyinsights.inputs.RemediationFiltersArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RemediationAtResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RemediationAtResourceArgs Empty = new RemediationAtResourceArgs();

    /**
     * The filters that will be applied to determine which resources to remediate.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<RemediationFiltersArgs> filters;

    public Optional<Output<RemediationFiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The resource ID of the policy assignment that should be remediated.
     * 
     */
    @Import(name="policyAssignmentId")
    private @Nullable Output<String> policyAssignmentId;

    public Optional<Output<String>> policyAssignmentId() {
        return Optional.ofNullable(this.policyAssignmentId);
    }

    /**
     * The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    @Import(name="policyDefinitionReferenceId")
    private @Nullable Output<String> policyDefinitionReferenceId;

    public Optional<Output<String>> policyDefinitionReferenceId() {
        return Optional.ofNullable(this.policyDefinitionReferenceId);
    }

    /**
     * The name of the remediation.
     * 
     */
    @Import(name="remediationName")
    private @Nullable Output<String> remediationName;

    public Optional<Output<String>> remediationName() {
        return Optional.ofNullable(this.remediationName);
    }

    /**
     * The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    @Import(name="resourceDiscoveryMode")
    private @Nullable Output<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode;

    public Optional<Output<Either<String,ResourceDiscoveryMode>>> resourceDiscoveryMode() {
        return Optional.ofNullable(this.resourceDiscoveryMode);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    private RemediationAtResourceArgs() {}

    private RemediationAtResourceArgs(RemediationAtResourceArgs $) {
        this.filters = $.filters;
        this.policyAssignmentId = $.policyAssignmentId;
        this.policyDefinitionReferenceId = $.policyDefinitionReferenceId;
        this.remediationName = $.remediationName;
        this.resourceDiscoveryMode = $.resourceDiscoveryMode;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RemediationAtResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RemediationAtResourceArgs $;

        public Builder() {
            $ = new RemediationAtResourceArgs();
        }

        public Builder(RemediationAtResourceArgs defaults) {
            $ = new RemediationAtResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<RemediationFiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(RemediationFiltersArgs filters) {
            return filters(Output.of(filters));
        }

        public Builder policyAssignmentId(@Nullable Output<String> policyAssignmentId) {
            $.policyAssignmentId = policyAssignmentId;
            return this;
        }

        public Builder policyAssignmentId(String policyAssignmentId) {
            return policyAssignmentId(Output.of(policyAssignmentId));
        }

        public Builder policyDefinitionReferenceId(@Nullable Output<String> policyDefinitionReferenceId) {
            $.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder policyDefinitionReferenceId(String policyDefinitionReferenceId) {
            return policyDefinitionReferenceId(Output.of(policyDefinitionReferenceId));
        }

        public Builder remediationName(@Nullable Output<String> remediationName) {
            $.remediationName = remediationName;
            return this;
        }

        public Builder remediationName(String remediationName) {
            return remediationName(Output.of(remediationName));
        }

        public Builder resourceDiscoveryMode(@Nullable Output<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode) {
            $.resourceDiscoveryMode = resourceDiscoveryMode;
            return this;
        }

        public Builder resourceDiscoveryMode(Either<String,ResourceDiscoveryMode> resourceDiscoveryMode) {
            return resourceDiscoveryMode(Output.of(resourceDiscoveryMode));
        }

        public Builder resourceDiscoveryMode(String resourceDiscoveryMode) {
            return resourceDiscoveryMode(Either.ofLeft(resourceDiscoveryMode));
        }

        public Builder resourceDiscoveryMode(ResourceDiscoveryMode resourceDiscoveryMode) {
            return resourceDiscoveryMode(Either.ofRight(resourceDiscoveryMode));
        }

        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public RemediationAtResourceArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
