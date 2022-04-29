// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuditPolicyAuditSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuditPolicyAuditSpecificationArgs Empty = new AuditPolicyAuditSpecificationArgs();

    /**
     * The category to which the audit policy belongs.
     * 
     */
    @Import(name="auditPolicyCategory")
    private @Nullable Output<String> auditPolicyCategory;

    /**
     * @return The category to which the audit policy belongs.
     * 
     */
    public Optional<Output<String>> auditPolicyCategory() {
        return Optional.ofNullable(this.auditPolicyCategory);
    }

    /**
     * Indicates the audit policy name. Refer to the [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827) for seeded audit policy names. For custom policies, refer to the user-defined policy name created in the target database.
     * 
     */
    @Import(name="auditPolicyName")
    private @Nullable Output<String> auditPolicyName;

    /**
     * @return Indicates the audit policy name. Refer to the [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827) for seeded audit policy names. For custom policies, refer to the user-defined policy name created in the target database.
     * 
     */
    public Optional<Output<String>> auditPolicyName() {
        return Optional.ofNullable(this.auditPolicyName);
    }

    /**
     * Indicates the names of corresponding database policy ( or policies) in the target database.
     * 
     */
    @Import(name="databasePolicyNames")
    private @Nullable Output<List<String>> databasePolicyNames;

    /**
     * @return Indicates the names of corresponding database policy ( or policies) in the target database.
     * 
     */
    public Optional<Output<List<String>>> databasePolicyNames() {
        return Optional.ofNullable(this.databasePolicyNames);
    }

    /**
     * Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
     * 
     */
    @Import(name="enableStatus")
    private @Nullable Output<String> enableStatus;

    /**
     * @return Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
     * 
     */
    public Optional<Output<String>> enableStatus() {
        return Optional.ofNullable(this.enableStatus);
    }

    /**
     * Indicates on whom the audit policy is enabled.
     * 
     */
    @Import(name="enabledEntities")
    private @Nullable Output<String> enabledEntities;

    /**
     * @return Indicates on whom the audit policy is enabled.
     * 
     */
    public Optional<Output<String>> enabledEntities() {
        return Optional.ofNullable(this.enabledEntities);
    }

    /**
     * Indicates whether the policy is already created on the target database.
     * 
     */
    @Import(name="isCreated")
    private @Nullable Output<Boolean> isCreated;

    /**
     * @return Indicates whether the policy is already created on the target database.
     * 
     */
    public Optional<Output<Boolean>> isCreated() {
        return Optional.ofNullable(this.isCreated);
    }

    /**
     * Indicates whether the policy by default is enabled for all users with no flexibility to alter the enablement conditions.
     * 
     */
    @Import(name="isEnabledForAllUsers")
    private @Nullable Output<Boolean> isEnabledForAllUsers;

    /**
     * @return Indicates whether the policy by default is enabled for all users with no flexibility to alter the enablement conditions.
     * 
     */
    public Optional<Output<Boolean>> isEnabledForAllUsers() {
        return Optional.ofNullable(this.isEnabledForAllUsers);
    }

    /**
     * Indicates whether the audit policy is one of the seeded policies provided by Oracle Data Safe.
     * 
     */
    @Import(name="isSeededInDataSafe")
    private @Nullable Output<Boolean> isSeededInDataSafe;

    /**
     * @return Indicates whether the audit policy is one of the seeded policies provided by Oracle Data Safe.
     * 
     */
    public Optional<Output<Boolean>> isSeededInDataSafe() {
        return Optional.ofNullable(this.isSeededInDataSafe);
    }

    /**
     * Indicates whether the audit policy is one of the predefined policies provided by Oracle Database.
     * 
     */
    @Import(name="isSeededInTarget")
    private @Nullable Output<Boolean> isSeededInTarget;

    /**
     * @return Indicates whether the audit policy is one of the predefined policies provided by Oracle Database.
     * 
     */
    public Optional<Output<Boolean>> isSeededInTarget() {
        return Optional.ofNullable(this.isSeededInTarget);
    }

    /**
     * Indicates whether the audit policy is available for provisioning/ de-provisioning from Oracle Data Safe, or is only available for displaying the current provisioning status from the target.
     * 
     */
    @Import(name="isViewOnly")
    private @Nullable Output<Boolean> isViewOnly;

    /**
     * @return Indicates whether the audit policy is available for provisioning/ de-provisioning from Oracle Data Safe, or is only available for displaying the current provisioning status from the target.
     * 
     */
    public Optional<Output<Boolean>> isViewOnly() {
        return Optional.ofNullable(this.isViewOnly);
    }

    /**
     * Provides information about the policy that has been only partially enabled.
     * 
     */
    @Import(name="partiallyEnabledMsg")
    private @Nullable Output<String> partiallyEnabledMsg;

    /**
     * @return Provides information about the policy that has been only partially enabled.
     * 
     */
    public Optional<Output<String>> partiallyEnabledMsg() {
        return Optional.ofNullable(this.partiallyEnabledMsg);
    }

    private AuditPolicyAuditSpecificationArgs() {}

    private AuditPolicyAuditSpecificationArgs(AuditPolicyAuditSpecificationArgs $) {
        this.auditPolicyCategory = $.auditPolicyCategory;
        this.auditPolicyName = $.auditPolicyName;
        this.databasePolicyNames = $.databasePolicyNames;
        this.enableStatus = $.enableStatus;
        this.enabledEntities = $.enabledEntities;
        this.isCreated = $.isCreated;
        this.isEnabledForAllUsers = $.isEnabledForAllUsers;
        this.isSeededInDataSafe = $.isSeededInDataSafe;
        this.isSeededInTarget = $.isSeededInTarget;
        this.isViewOnly = $.isViewOnly;
        this.partiallyEnabledMsg = $.partiallyEnabledMsg;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuditPolicyAuditSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuditPolicyAuditSpecificationArgs $;

        public Builder() {
            $ = new AuditPolicyAuditSpecificationArgs();
        }

        public Builder(AuditPolicyAuditSpecificationArgs defaults) {
            $ = new AuditPolicyAuditSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditPolicyCategory The category to which the audit policy belongs.
         * 
         * @return builder
         * 
         */
        public Builder auditPolicyCategory(@Nullable Output<String> auditPolicyCategory) {
            $.auditPolicyCategory = auditPolicyCategory;
            return this;
        }

        /**
         * @param auditPolicyCategory The category to which the audit policy belongs.
         * 
         * @return builder
         * 
         */
        public Builder auditPolicyCategory(String auditPolicyCategory) {
            return auditPolicyCategory(Output.of(auditPolicyCategory));
        }

        /**
         * @param auditPolicyName Indicates the audit policy name. Refer to the [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827) for seeded audit policy names. For custom policies, refer to the user-defined policy name created in the target database.
         * 
         * @return builder
         * 
         */
        public Builder auditPolicyName(@Nullable Output<String> auditPolicyName) {
            $.auditPolicyName = auditPolicyName;
            return this;
        }

        /**
         * @param auditPolicyName Indicates the audit policy name. Refer to the [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827) for seeded audit policy names. For custom policies, refer to the user-defined policy name created in the target database.
         * 
         * @return builder
         * 
         */
        public Builder auditPolicyName(String auditPolicyName) {
            return auditPolicyName(Output.of(auditPolicyName));
        }

        /**
         * @param databasePolicyNames Indicates the names of corresponding database policy ( or policies) in the target database.
         * 
         * @return builder
         * 
         */
        public Builder databasePolicyNames(@Nullable Output<List<String>> databasePolicyNames) {
            $.databasePolicyNames = databasePolicyNames;
            return this;
        }

        /**
         * @param databasePolicyNames Indicates the names of corresponding database policy ( or policies) in the target database.
         * 
         * @return builder
         * 
         */
        public Builder databasePolicyNames(List<String> databasePolicyNames) {
            return databasePolicyNames(Output.of(databasePolicyNames));
        }

        /**
         * @param databasePolicyNames Indicates the names of corresponding database policy ( or policies) in the target database.
         * 
         * @return builder
         * 
         */
        public Builder databasePolicyNames(String... databasePolicyNames) {
            return databasePolicyNames(List.of(databasePolicyNames));
        }

        /**
         * @param enableStatus Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableStatus(@Nullable Output<String> enableStatus) {
            $.enableStatus = enableStatus;
            return this;
        }

        /**
         * @param enableStatus Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableStatus(String enableStatus) {
            return enableStatus(Output.of(enableStatus));
        }

        /**
         * @param enabledEntities Indicates on whom the audit policy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabledEntities(@Nullable Output<String> enabledEntities) {
            $.enabledEntities = enabledEntities;
            return this;
        }

        /**
         * @param enabledEntities Indicates on whom the audit policy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabledEntities(String enabledEntities) {
            return enabledEntities(Output.of(enabledEntities));
        }

        /**
         * @param isCreated Indicates whether the policy is already created on the target database.
         * 
         * @return builder
         * 
         */
        public Builder isCreated(@Nullable Output<Boolean> isCreated) {
            $.isCreated = isCreated;
            return this;
        }

        /**
         * @param isCreated Indicates whether the policy is already created on the target database.
         * 
         * @return builder
         * 
         */
        public Builder isCreated(Boolean isCreated) {
            return isCreated(Output.of(isCreated));
        }

        /**
         * @param isEnabledForAllUsers Indicates whether the policy by default is enabled for all users with no flexibility to alter the enablement conditions.
         * 
         * @return builder
         * 
         */
        public Builder isEnabledForAllUsers(@Nullable Output<Boolean> isEnabledForAllUsers) {
            $.isEnabledForAllUsers = isEnabledForAllUsers;
            return this;
        }

        /**
         * @param isEnabledForAllUsers Indicates whether the policy by default is enabled for all users with no flexibility to alter the enablement conditions.
         * 
         * @return builder
         * 
         */
        public Builder isEnabledForAllUsers(Boolean isEnabledForAllUsers) {
            return isEnabledForAllUsers(Output.of(isEnabledForAllUsers));
        }

        /**
         * @param isSeededInDataSafe Indicates whether the audit policy is one of the seeded policies provided by Oracle Data Safe.
         * 
         * @return builder
         * 
         */
        public Builder isSeededInDataSafe(@Nullable Output<Boolean> isSeededInDataSafe) {
            $.isSeededInDataSafe = isSeededInDataSafe;
            return this;
        }

        /**
         * @param isSeededInDataSafe Indicates whether the audit policy is one of the seeded policies provided by Oracle Data Safe.
         * 
         * @return builder
         * 
         */
        public Builder isSeededInDataSafe(Boolean isSeededInDataSafe) {
            return isSeededInDataSafe(Output.of(isSeededInDataSafe));
        }

        /**
         * @param isSeededInTarget Indicates whether the audit policy is one of the predefined policies provided by Oracle Database.
         * 
         * @return builder
         * 
         */
        public Builder isSeededInTarget(@Nullable Output<Boolean> isSeededInTarget) {
            $.isSeededInTarget = isSeededInTarget;
            return this;
        }

        /**
         * @param isSeededInTarget Indicates whether the audit policy is one of the predefined policies provided by Oracle Database.
         * 
         * @return builder
         * 
         */
        public Builder isSeededInTarget(Boolean isSeededInTarget) {
            return isSeededInTarget(Output.of(isSeededInTarget));
        }

        /**
         * @param isViewOnly Indicates whether the audit policy is available for provisioning/ de-provisioning from Oracle Data Safe, or is only available for displaying the current provisioning status from the target.
         * 
         * @return builder
         * 
         */
        public Builder isViewOnly(@Nullable Output<Boolean> isViewOnly) {
            $.isViewOnly = isViewOnly;
            return this;
        }

        /**
         * @param isViewOnly Indicates whether the audit policy is available for provisioning/ de-provisioning from Oracle Data Safe, or is only available for displaying the current provisioning status from the target.
         * 
         * @return builder
         * 
         */
        public Builder isViewOnly(Boolean isViewOnly) {
            return isViewOnly(Output.of(isViewOnly));
        }

        /**
         * @param partiallyEnabledMsg Provides information about the policy that has been only partially enabled.
         * 
         * @return builder
         * 
         */
        public Builder partiallyEnabledMsg(@Nullable Output<String> partiallyEnabledMsg) {
            $.partiallyEnabledMsg = partiallyEnabledMsg;
            return this;
        }

        /**
         * @param partiallyEnabledMsg Provides information about the policy that has been only partially enabled.
         * 
         * @return builder
         * 
         */
        public Builder partiallyEnabledMsg(String partiallyEnabledMsg) {
            return partiallyEnabledMsg(Output.of(partiallyEnabledMsg));
        }

        public AuditPolicyAuditSpecificationArgs build() {
            return $;
        }
    }

}
