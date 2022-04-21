// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import com.pulumi.azurenative.recoveryservices.enums.OperationType;
import com.pulumi.azurenative.recoveryservices.enums.WorkloadType;
import com.pulumi.azurenative.recoveryservices.inputs.AzureWorkloadContainerExtendedInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container for SQL workloads under SQL Availability Group.
 * 
 */
public final class AzureSQLAGWorkloadContainerProtectionContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureSQLAGWorkloadContainerProtectionContainerArgs Empty = new AzureSQLAGWorkloadContainerProtectionContainerArgs();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Optional<Output<Either<String,BackupManagementType>>> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;SQLAGWorkLoadContainer&#39;.
     * 
     */
    @Import(name="containerType", required=true)
    private Output<String> containerType;

    public Output<String> containerType() {
        return this.containerType;
    }

    /**
     * Additional details of a workload container.
     * 
     */
    @Import(name="extendedInfo")
    private @Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo;

    public Optional<Output<AzureWorkloadContainerExtendedInfoArgs>> extendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
    private @Nullable Output<String> healthStatus;

    public Optional<Output<String>> healthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }

    /**
     * Time stamp when this container was updated.
     * 
     */
    @Import(name="lastUpdatedTime")
    private @Nullable Output<String> lastUpdatedTime;

    public Optional<Output<String>> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }

    /**
     * Re-Do Operation
     * 
     */
    @Import(name="operationType")
    private @Nullable Output<Either<String,OperationType>> operationType;

    public Optional<Output<Either<String,OperationType>>> operationType() {
        return Optional.ofNullable(this.operationType);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
    private @Nullable Output<String> registrationStatus;

    public Optional<Output<String>> registrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }

    /**
     * ARM ID of the virtual machine represented by this Azure Workload Container
     * 
     */
    @Import(name="sourceResourceId")
    private @Nullable Output<String> sourceResourceId;

    public Optional<Output<String>> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Workload type for which registration was sent.
     * 
     */
    @Import(name="workloadType")
    private @Nullable Output<Either<String,WorkloadType>> workloadType;

    public Optional<Output<Either<String,WorkloadType>>> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    private AzureSQLAGWorkloadContainerProtectionContainerArgs() {}

    private AzureSQLAGWorkloadContainerProtectionContainerArgs(AzureSQLAGWorkloadContainerProtectionContainerArgs $) {
        this.backupManagementType = $.backupManagementType;
        this.containerType = $.containerType;
        this.extendedInfo = $.extendedInfo;
        this.friendlyName = $.friendlyName;
        this.healthStatus = $.healthStatus;
        this.lastUpdatedTime = $.lastUpdatedTime;
        this.operationType = $.operationType;
        this.registrationStatus = $.registrationStatus;
        this.sourceResourceId = $.sourceResourceId;
        this.workloadType = $.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureSQLAGWorkloadContainerProtectionContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureSQLAGWorkloadContainerProtectionContainerArgs $;

        public Builder() {
            $ = new AzureSQLAGWorkloadContainerProtectionContainerArgs();
        }

        public Builder(AzureSQLAGWorkloadContainerProtectionContainerArgs defaults) {
            $ = new AzureSQLAGWorkloadContainerProtectionContainerArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupManagementType(@Nullable Output<Either<String,BackupManagementType>> backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        public Builder backupManagementType(Either<String,BackupManagementType> backupManagementType) {
            return backupManagementType(Output.of(backupManagementType));
        }

        public Builder backupManagementType(String backupManagementType) {
            return backupManagementType(Either.ofLeft(backupManagementType));
        }

        public Builder backupManagementType(BackupManagementType backupManagementType) {
            return backupManagementType(Either.ofRight(backupManagementType));
        }

        public Builder containerType(Output<String> containerType) {
            $.containerType = containerType;
            return this;
        }

        public Builder containerType(String containerType) {
            return containerType(Output.of(containerType));
        }

        public Builder extendedInfo(@Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo) {
            $.extendedInfo = extendedInfo;
            return this;
        }

        public Builder extendedInfo(AzureWorkloadContainerExtendedInfoArgs extendedInfo) {
            return extendedInfo(Output.of(extendedInfo));
        }

        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        public Builder healthStatus(@Nullable Output<String> healthStatus) {
            $.healthStatus = healthStatus;
            return this;
        }

        public Builder healthStatus(String healthStatus) {
            return healthStatus(Output.of(healthStatus));
        }

        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            $.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder lastUpdatedTime(String lastUpdatedTime) {
            return lastUpdatedTime(Output.of(lastUpdatedTime));
        }

        public Builder operationType(@Nullable Output<Either<String,OperationType>> operationType) {
            $.operationType = operationType;
            return this;
        }

        public Builder operationType(Either<String,OperationType> operationType) {
            return operationType(Output.of(operationType));
        }

        public Builder operationType(String operationType) {
            return operationType(Either.ofLeft(operationType));
        }

        public Builder operationType(OperationType operationType) {
            return operationType(Either.ofRight(operationType));
        }

        public Builder registrationStatus(@Nullable Output<String> registrationStatus) {
            $.registrationStatus = registrationStatus;
            return this;
        }

        public Builder registrationStatus(String registrationStatus) {
            return registrationStatus(Output.of(registrationStatus));
        }

        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            $.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder sourceResourceId(String sourceResourceId) {
            return sourceResourceId(Output.of(sourceResourceId));
        }

        public Builder workloadType(@Nullable Output<Either<String,WorkloadType>> workloadType) {
            $.workloadType = workloadType;
            return this;
        }

        public Builder workloadType(Either<String,WorkloadType> workloadType) {
            return workloadType(Output.of(workloadType));
        }

        public Builder workloadType(String workloadType) {
            return workloadType(Either.ofLeft(workloadType));
        }

        public Builder workloadType(WorkloadType workloadType) {
            return workloadType(Either.ofRight(workloadType));
        }

        public AzureSQLAGWorkloadContainerProtectionContainerArgs build() {
            $.containerType = Codegen.stringProp("containerType").output().arg($.containerType).require();
            return $;
        }
    }

}
