// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuditPoliciesAuditPolicyCollectionItemAuditConditionEnableCondition {
    /**
     * @return List of users or roles that the policy must be enabled for.
     * 
     */
    private final List<String> entityNames;
    /**
     * @return The entity include or exclude selection.
     * 
     */
    private final String entitySelection;
    /**
     * @return The entity type that the policy must be enabled for.
     * 
     */
    private final String entityType;
    /**
     * @return The operation status that the policy must be enabled for.
     * 
     */
    private final String operationStatus;

    @CustomType.Constructor
    private GetAuditPoliciesAuditPolicyCollectionItemAuditConditionEnableCondition(
        @CustomType.Parameter("entityNames") List<String> entityNames,
        @CustomType.Parameter("entitySelection") String entitySelection,
        @CustomType.Parameter("entityType") String entityType,
        @CustomType.Parameter("operationStatus") String operationStatus) {
        this.entityNames = entityNames;
        this.entitySelection = entitySelection;
        this.entityType = entityType;
        this.operationStatus = operationStatus;
    }

    /**
     * @return List of users or roles that the policy must be enabled for.
     * 
     */
    public List<String> entityNames() {
        return this.entityNames;
    }
    /**
     * @return The entity include or exclude selection.
     * 
     */
    public String entitySelection() {
        return this.entitySelection;
    }
    /**
     * @return The entity type that the policy must be enabled for.
     * 
     */
    public String entityType() {
        return this.entityType;
    }
    /**
     * @return The operation status that the policy must be enabled for.
     * 
     */
    public String operationStatus() {
        return this.operationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuditPoliciesAuditPolicyCollectionItemAuditConditionEnableCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> entityNames;
        private String entitySelection;
        private String entityType;
        private String operationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuditPoliciesAuditPolicyCollectionItemAuditConditionEnableCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityNames = defaults.entityNames;
    	      this.entitySelection = defaults.entitySelection;
    	      this.entityType = defaults.entityType;
    	      this.operationStatus = defaults.operationStatus;
        }

        public Builder entityNames(List<String> entityNames) {
            this.entityNames = Objects.requireNonNull(entityNames);
            return this;
        }
        public Builder entityNames(String... entityNames) {
            return entityNames(List.of(entityNames));
        }
        public Builder entitySelection(String entitySelection) {
            this.entitySelection = Objects.requireNonNull(entitySelection);
            return this;
        }
        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder operationStatus(String operationStatus) {
            this.operationStatus = Objects.requireNonNull(operationStatus);
            return this;
        }        public GetAuditPoliciesAuditPolicyCollectionItemAuditConditionEnableCondition build() {
            return new GetAuditPoliciesAuditPolicyCollectionItemAuditConditionEnableCondition(entityNames, entitySelection, entityType, operationStatus);
        }
    }
}
