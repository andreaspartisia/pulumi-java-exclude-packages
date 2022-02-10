// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HyperVReplicaAzurePolicyDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final HyperVReplicaAzurePolicyDetailsResponse Empty = new HyperVReplicaAzurePolicyDetailsResponse();

    @InputImport(name="activeStorageAccountId")
    private final @Nullable String activeStorageAccountId;

    public Optional<String> getActiveStorageAccountId() {
        return this.activeStorageAccountId == null ? Optional.empty() : Optional.ofNullable(this.activeStorageAccountId);
    }

    @InputImport(name="applicationConsistentSnapshotFrequencyInHours")
    private final @Nullable Integer applicationConsistentSnapshotFrequencyInHours;

    public Optional<Integer> getApplicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours == null ? Optional.empty() : Optional.ofNullable(this.applicationConsistentSnapshotFrequencyInHours);
    }

    @InputImport(name="encryption")
    private final @Nullable String encryption;

    public Optional<String> getEncryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    @InputImport(name="instanceType", required=true)
    private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    @InputImport(name="onlineReplicationStartTime")
    private final @Nullable String onlineReplicationStartTime;

    public Optional<String> getOnlineReplicationStartTime() {
        return this.onlineReplicationStartTime == null ? Optional.empty() : Optional.ofNullable(this.onlineReplicationStartTime);
    }

    @InputImport(name="recoveryPointHistoryDurationInHours")
    private final @Nullable Integer recoveryPointHistoryDurationInHours;

    public Optional<Integer> getRecoveryPointHistoryDurationInHours() {
        return this.recoveryPointHistoryDurationInHours == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointHistoryDurationInHours);
    }

    @InputImport(name="replicationInterval")
    private final @Nullable Integer replicationInterval;

    public Optional<Integer> getReplicationInterval() {
        return this.replicationInterval == null ? Optional.empty() : Optional.ofNullable(this.replicationInterval);
    }

    public HyperVReplicaAzurePolicyDetailsResponse(
        @Nullable String activeStorageAccountId,
        @Nullable Integer applicationConsistentSnapshotFrequencyInHours,
        @Nullable String encryption,
        String instanceType,
        @Nullable String onlineReplicationStartTime,
        @Nullable Integer recoveryPointHistoryDurationInHours,
        @Nullable Integer replicationInterval) {
        this.activeStorageAccountId = activeStorageAccountId;
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        this.encryption = encryption;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        this.recoveryPointHistoryDurationInHours = recoveryPointHistoryDurationInHours;
        this.replicationInterval = replicationInterval;
    }

    private HyperVReplicaAzurePolicyDetailsResponse() {
        this.activeStorageAccountId = null;
        this.applicationConsistentSnapshotFrequencyInHours = null;
        this.encryption = null;
        this.instanceType = null;
        this.onlineReplicationStartTime = null;
        this.recoveryPointHistoryDurationInHours = null;
        this.replicationInterval = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaAzurePolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeStorageAccountId;
        private @Nullable Integer applicationConsistentSnapshotFrequencyInHours;
        private @Nullable String encryption;
        private String instanceType;
        private @Nullable String onlineReplicationStartTime;
        private @Nullable Integer recoveryPointHistoryDurationInHours;
        private @Nullable Integer replicationInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaAzurePolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeStorageAccountId = defaults.activeStorageAccountId;
    	      this.applicationConsistentSnapshotFrequencyInHours = defaults.applicationConsistentSnapshotFrequencyInHours;
    	      this.encryption = defaults.encryption;
    	      this.instanceType = defaults.instanceType;
    	      this.onlineReplicationStartTime = defaults.onlineReplicationStartTime;
    	      this.recoveryPointHistoryDurationInHours = defaults.recoveryPointHistoryDurationInHours;
    	      this.replicationInterval = defaults.replicationInterval;
        }

        public Builder setActiveStorageAccountId(@Nullable String activeStorageAccountId) {
            this.activeStorageAccountId = activeStorageAccountId;
            return this;
        }

        public Builder setApplicationConsistentSnapshotFrequencyInHours(@Nullable Integer applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
            return this;
        }

        public Builder setEncryption(@Nullable String encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setOnlineReplicationStartTime(@Nullable String onlineReplicationStartTime) {
            this.onlineReplicationStartTime = onlineReplicationStartTime;
            return this;
        }

        public Builder setRecoveryPointHistoryDurationInHours(@Nullable Integer recoveryPointHistoryDurationInHours) {
            this.recoveryPointHistoryDurationInHours = recoveryPointHistoryDurationInHours;
            return this;
        }

        public Builder setReplicationInterval(@Nullable Integer replicationInterval) {
            this.replicationInterval = replicationInterval;
            return this;
        }

        public HyperVReplicaAzurePolicyDetailsResponse build() {
            return new HyperVReplicaAzurePolicyDetailsResponse(activeStorageAccountId, applicationConsistentSnapshotFrequencyInHours, encryption, instanceType, onlineReplicationStartTime, recoveryPointHistoryDurationInHours, replicationInterval);
        }
    }
}