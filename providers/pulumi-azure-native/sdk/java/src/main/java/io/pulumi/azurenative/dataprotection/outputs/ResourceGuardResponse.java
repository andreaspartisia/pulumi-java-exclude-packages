// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.ResourceGuardOperationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ResourceGuardResponse {
    private final Boolean allowAutoApprovals;
    private final String description;
    private final String provisioningState;
    private final List<ResourceGuardOperationResponse> resourceGuardOperations;
    private final List<String> vaultCriticalOperationExclusionList;

    @OutputCustomType.Constructor({"allowAutoApprovals","description","provisioningState","resourceGuardOperations","vaultCriticalOperationExclusionList"})
    private ResourceGuardResponse(
        Boolean allowAutoApprovals,
        String description,
        String provisioningState,
        List<ResourceGuardOperationResponse> resourceGuardOperations,
        List<String> vaultCriticalOperationExclusionList) {
        this.allowAutoApprovals = Objects.requireNonNull(allowAutoApprovals);
        this.description = Objects.requireNonNull(description);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGuardOperations = Objects.requireNonNull(resourceGuardOperations);
        this.vaultCriticalOperationExclusionList = Objects.requireNonNull(vaultCriticalOperationExclusionList);
    }

    public Boolean getAllowAutoApprovals() {
        return this.allowAutoApprovals;
    }
    public String getDescription() {
        return this.description;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<ResourceGuardOperationResponse> getResourceGuardOperations() {
        return this.resourceGuardOperations;
    }
    public List<String> getVaultCriticalOperationExclusionList() {
        return this.vaultCriticalOperationExclusionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowAutoApprovals;
        private String description;
        private String provisioningState;
        private List<ResourceGuardOperationResponse> resourceGuardOperations;
        private List<String> vaultCriticalOperationExclusionList;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAutoApprovals = defaults.allowAutoApprovals;
    	      this.description = defaults.description;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuardOperations = defaults.resourceGuardOperations;
    	      this.vaultCriticalOperationExclusionList = defaults.vaultCriticalOperationExclusionList;
        }

        public Builder setAllowAutoApprovals(Boolean allowAutoApprovals) {
            this.allowAutoApprovals = Objects.requireNonNull(allowAutoApprovals);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGuardOperations(List<ResourceGuardOperationResponse> resourceGuardOperations) {
            this.resourceGuardOperations = Objects.requireNonNull(resourceGuardOperations);
            return this;
        }

        public Builder setVaultCriticalOperationExclusionList(List<String> vaultCriticalOperationExclusionList) {
            this.vaultCriticalOperationExclusionList = Objects.requireNonNull(vaultCriticalOperationExclusionList);
            return this;
        }

        public ResourceGuardResponse build() {
            return new ResourceGuardResponse(allowAutoApprovals, description, provisioningState, resourceGuardOperations, vaultCriticalOperationExclusionList);
        }
    }
}