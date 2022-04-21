// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import com.pulumi.azurenative.recoveryservices.enums.CreateMode;
import com.pulumi.azurenative.recoveryservices.enums.DataSourceType;
import com.pulumi.azurenative.recoveryservices.enums.LastBackupStatus;
import com.pulumi.azurenative.recoveryservices.enums.ProtectedItemHealthStatus;
import com.pulumi.azurenative.recoveryservices.enums.ProtectionState;
import com.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadProtectedItemExtendedInfoArgs;
import com.pulumi.azurenative.recoveryservices.inputs.KPIResourceHealthDetailsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure VM workload-specific protected item representing SAP HANA Database.
 * 
 */
public final class AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs Empty = new AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Optional<Output<Either<String,BackupManagementType>>> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @Import(name="backupSetName")
    private @Nullable Output<String> backupSetName;

    public Optional<Output<String>> backupSetName() {
        return Optional.ofNullable(this.backupSetName);
    }

    /**
     * Unique name of container
     * 
     */
    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @Import(name="createMode")
    private @Nullable Output<Either<String,CreateMode>> createMode;

    public Optional<Output<Either<String,CreateMode>>> createMode() {
        return Optional.ofNullable(this.createMode);
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @Import(name="deferredDeleteTimeInUTC")
    private @Nullable Output<String> deferredDeleteTimeInUTC;

    public Optional<Output<String>> deferredDeleteTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @Import(name="deferredDeleteTimeRemaining")
    private @Nullable Output<String> deferredDeleteTimeRemaining;

    public Optional<Output<String>> deferredDeleteTimeRemaining() {
        return Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }

    /**
     * Additional information for this backup item.
     * 
     */
    @Import(name="extendedInfo")
    private @Nullable Output<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo;

    public Optional<Output<AzureVmWorkloadProtectedItemExtendedInfoArgs>> extendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of the DB represented by this backup item.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @Import(name="isDeferredDeleteScheduleUpcoming")
    private @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming;

    public Optional<Output<Boolean>> isDeferredDeleteScheduleUpcoming() {
        return Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @Import(name="isRehydrate")
    private @Nullable Output<Boolean> isRehydrate;

    public Optional<Output<Boolean>> isRehydrate() {
        return Optional.ofNullable(this.isRehydrate);
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @Import(name="isScheduledForDeferredDelete")
    private @Nullable Output<Boolean> isScheduledForDeferredDelete;

    public Optional<Output<Boolean>> isScheduledForDeferredDelete() {
        return Optional.ofNullable(this.isScheduledForDeferredDelete);
    }

    /**
     * Health details of different KPIs
     * 
     */
    @Import(name="kpisHealths")
    private @Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;

    public Optional<Output<Map<String,KPIResourceHealthDetailsArgs>>> kpisHealths() {
        return Optional.ofNullable(this.kpisHealths);
    }

    /**
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
     */
    @Import(name="lastBackupStatus")
    private @Nullable Output<Either<String,LastBackupStatus>> lastBackupStatus;

    public Optional<Output<Either<String,LastBackupStatus>>> lastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @Import(name="lastBackupTime")
    private @Nullable Output<String> lastBackupTime;

    public Optional<Output<String>> lastBackupTime() {
        return Optional.ofNullable(this.lastBackupTime);
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @Import(name="lastRecoveryPoint")
    private @Nullable Output<String> lastRecoveryPoint;

    public Optional<Output<String>> lastRecoveryPoint() {
        return Optional.ofNullable(this.lastRecoveryPoint);
    }

    /**
     * Parent name of the DB such as Instance or Availability Group.
     * 
     */
    @Import(name="parentName")
    private @Nullable Output<String> parentName;

    public Optional<Output<String>> parentName() {
        return Optional.ofNullable(this.parentName);
    }

    /**
     * Parent type of protected item, example: for a DB, standalone server or distributed
     * 
     */
    @Import(name="parentType")
    private @Nullable Output<String> parentType;

    public Optional<Output<String>> parentType() {
        return Optional.ofNullable(this.parentType);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * Data ID of the protected item.
     * 
     */
    @Import(name="protectedItemDataSourceId")
    private @Nullable Output<String> protectedItemDataSourceId;

    public Optional<Output<String>> protectedItemDataSourceId() {
        return Optional.ofNullable(this.protectedItemDataSourceId);
    }

    /**
     * Health status of the backup item, evaluated based on last heartbeat received
     * 
     */
    @Import(name="protectedItemHealthStatus")
    private @Nullable Output<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus;

    public Optional<Output<Either<String,ProtectedItemHealthStatus>>> protectedItemHealthStatus() {
        return Optional.ofNullable(this.protectedItemHealthStatus);
    }

    /**
     * backup item type.
     * Expected value is &#39;AzureVmWorkloadSAPHanaDatabase&#39;.
     * 
     */
    @Import(name="protectedItemType", required=true)
    private Output<String> protectedItemType;

    public Output<String> protectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @Import(name="protectionState")
    private @Nullable Output<Either<String,ProtectionState>> protectionState;

    public Optional<Output<Either<String,ProtectionState>>> protectionState() {
        return Optional.ofNullable(this.protectionState);
    }

    /**
     * Backup status of this backup item.
     * 
     */
    @Import(name="protectionStatus")
    private @Nullable Output<String> protectionStatus;

    public Optional<Output<String>> protectionStatus() {
        return Optional.ofNullable(this.protectionStatus);
    }

    /**
     * Host/Cluster Name for instance or AG
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
    private @Nullable Output<String> sourceResourceId;

    public Optional<Output<String>> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @Import(name="workloadType")
    private @Nullable Output<Either<String,DataSourceType>> workloadType;

    public Optional<Output<Either<String,DataSourceType>>> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    private AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs() {}

    private AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs(AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs $) {
        this.backupManagementType = $.backupManagementType;
        this.backupSetName = $.backupSetName;
        this.containerName = $.containerName;
        this.createMode = $.createMode;
        this.deferredDeleteTimeInUTC = $.deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = $.deferredDeleteTimeRemaining;
        this.extendedInfo = $.extendedInfo;
        this.friendlyName = $.friendlyName;
        this.isDeferredDeleteScheduleUpcoming = $.isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = $.isRehydrate;
        this.isScheduledForDeferredDelete = $.isScheduledForDeferredDelete;
        this.kpisHealths = $.kpisHealths;
        this.lastBackupStatus = $.lastBackupStatus;
        this.lastBackupTime = $.lastBackupTime;
        this.lastRecoveryPoint = $.lastRecoveryPoint;
        this.parentName = $.parentName;
        this.parentType = $.parentType;
        this.policyId = $.policyId;
        this.protectedItemDataSourceId = $.protectedItemDataSourceId;
        this.protectedItemHealthStatus = $.protectedItemHealthStatus;
        this.protectedItemType = $.protectedItemType;
        this.protectionState = $.protectionState;
        this.protectionStatus = $.protectionStatus;
        this.serverName = $.serverName;
        this.sourceResourceId = $.sourceResourceId;
        this.workloadType = $.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs $;

        public Builder() {
            $ = new AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs();
        }

        public Builder(AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs defaults) {
            $ = new AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs(Objects.requireNonNull(defaults));
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

        public Builder backupSetName(@Nullable Output<String> backupSetName) {
            $.backupSetName = backupSetName;
            return this;
        }

        public Builder backupSetName(String backupSetName) {
            return backupSetName(Output.of(backupSetName));
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        public Builder createMode(@Nullable Output<Either<String,CreateMode>> createMode) {
            $.createMode = createMode;
            return this;
        }

        public Builder createMode(Either<String,CreateMode> createMode) {
            return createMode(Output.of(createMode));
        }

        public Builder createMode(String createMode) {
            return createMode(Either.ofLeft(createMode));
        }

        public Builder createMode(CreateMode createMode) {
            return createMode(Either.ofRight(createMode));
        }

        public Builder deferredDeleteTimeInUTC(@Nullable Output<String> deferredDeleteTimeInUTC) {
            $.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder deferredDeleteTimeInUTC(String deferredDeleteTimeInUTC) {
            return deferredDeleteTimeInUTC(Output.of(deferredDeleteTimeInUTC));
        }

        public Builder deferredDeleteTimeRemaining(@Nullable Output<String> deferredDeleteTimeRemaining) {
            $.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder deferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
            return deferredDeleteTimeRemaining(Output.of(deferredDeleteTimeRemaining));
        }

        public Builder extendedInfo(@Nullable Output<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo) {
            $.extendedInfo = extendedInfo;
            return this;
        }

        public Builder extendedInfo(AzureVmWorkloadProtectedItemExtendedInfoArgs extendedInfo) {
            return extendedInfo(Output.of(extendedInfo));
        }

        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming) {
            $.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder isDeferredDeleteScheduleUpcoming(Boolean isDeferredDeleteScheduleUpcoming) {
            return isDeferredDeleteScheduleUpcoming(Output.of(isDeferredDeleteScheduleUpcoming));
        }

        public Builder isRehydrate(@Nullable Output<Boolean> isRehydrate) {
            $.isRehydrate = isRehydrate;
            return this;
        }

        public Builder isRehydrate(Boolean isRehydrate) {
            return isRehydrate(Output.of(isRehydrate));
        }

        public Builder isScheduledForDeferredDelete(@Nullable Output<Boolean> isScheduledForDeferredDelete) {
            $.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder isScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
            return isScheduledForDeferredDelete(Output.of(isScheduledForDeferredDelete));
        }

        public Builder kpisHealths(@Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths) {
            $.kpisHealths = kpisHealths;
            return this;
        }

        public Builder kpisHealths(Map<String,KPIResourceHealthDetailsArgs> kpisHealths) {
            return kpisHealths(Output.of(kpisHealths));
        }

        public Builder lastBackupStatus(@Nullable Output<Either<String,LastBackupStatus>> lastBackupStatus) {
            $.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder lastBackupStatus(Either<String,LastBackupStatus> lastBackupStatus) {
            return lastBackupStatus(Output.of(lastBackupStatus));
        }

        public Builder lastBackupStatus(String lastBackupStatus) {
            return lastBackupStatus(Either.ofLeft(lastBackupStatus));
        }

        public Builder lastBackupStatus(LastBackupStatus lastBackupStatus) {
            return lastBackupStatus(Either.ofRight(lastBackupStatus));
        }

        public Builder lastBackupTime(@Nullable Output<String> lastBackupTime) {
            $.lastBackupTime = lastBackupTime;
            return this;
        }

        public Builder lastBackupTime(String lastBackupTime) {
            return lastBackupTime(Output.of(lastBackupTime));
        }

        public Builder lastRecoveryPoint(@Nullable Output<String> lastRecoveryPoint) {
            $.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder lastRecoveryPoint(String lastRecoveryPoint) {
            return lastRecoveryPoint(Output.of(lastRecoveryPoint));
        }

        public Builder parentName(@Nullable Output<String> parentName) {
            $.parentName = parentName;
            return this;
        }

        public Builder parentName(String parentName) {
            return parentName(Output.of(parentName));
        }

        public Builder parentType(@Nullable Output<String> parentType) {
            $.parentType = parentType;
            return this;
        }

        public Builder parentType(String parentType) {
            return parentType(Output.of(parentType));
        }

        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public Builder protectedItemDataSourceId(@Nullable Output<String> protectedItemDataSourceId) {
            $.protectedItemDataSourceId = protectedItemDataSourceId;
            return this;
        }

        public Builder protectedItemDataSourceId(String protectedItemDataSourceId) {
            return protectedItemDataSourceId(Output.of(protectedItemDataSourceId));
        }

        public Builder protectedItemHealthStatus(@Nullable Output<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus) {
            $.protectedItemHealthStatus = protectedItemHealthStatus;
            return this;
        }

        public Builder protectedItemHealthStatus(Either<String,ProtectedItemHealthStatus> protectedItemHealthStatus) {
            return protectedItemHealthStatus(Output.of(protectedItemHealthStatus));
        }

        public Builder protectedItemHealthStatus(String protectedItemHealthStatus) {
            return protectedItemHealthStatus(Either.ofLeft(protectedItemHealthStatus));
        }

        public Builder protectedItemHealthStatus(ProtectedItemHealthStatus protectedItemHealthStatus) {
            return protectedItemHealthStatus(Either.ofRight(protectedItemHealthStatus));
        }

        public Builder protectedItemType(Output<String> protectedItemType) {
            $.protectedItemType = protectedItemType;
            return this;
        }

        public Builder protectedItemType(String protectedItemType) {
            return protectedItemType(Output.of(protectedItemType));
        }

        public Builder protectionState(@Nullable Output<Either<String,ProtectionState>> protectionState) {
            $.protectionState = protectionState;
            return this;
        }

        public Builder protectionState(Either<String,ProtectionState> protectionState) {
            return protectionState(Output.of(protectionState));
        }

        public Builder protectionState(String protectionState) {
            return protectionState(Either.ofLeft(protectionState));
        }

        public Builder protectionState(ProtectionState protectionState) {
            return protectionState(Either.ofRight(protectionState));
        }

        public Builder protectionStatus(@Nullable Output<String> protectionStatus) {
            $.protectionStatus = protectionStatus;
            return this;
        }

        public Builder protectionStatus(String protectionStatus) {
            return protectionStatus(Output.of(protectionStatus));
        }

        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            $.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder sourceResourceId(String sourceResourceId) {
            return sourceResourceId(Output.of(sourceResourceId));
        }

        public Builder workloadType(@Nullable Output<Either<String,DataSourceType>> workloadType) {
            $.workloadType = workloadType;
            return this;
        }

        public Builder workloadType(Either<String,DataSourceType> workloadType) {
            return workloadType(Output.of(workloadType));
        }

        public Builder workloadType(String workloadType) {
            return workloadType(Either.ofLeft(workloadType));
        }

        public Builder workloadType(DataSourceType workloadType) {
            return workloadType(Either.ofRight(workloadType));
        }

        public AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs build() {
            $.protectedItemType = Codegen.stringProp("protectedItemType").output().arg($.protectedItemType).require();
            return $;
        }
    }

}
