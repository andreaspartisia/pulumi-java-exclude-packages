// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationPolicyArgs Empty = new ReplicationPolicyArgs();

    /**
     * Specifies the frequency(in minutes) at which to create application consistent recovery points.
     * 
     */
    @Import(name="applicationConsistentSnapshotFrequencyInMinutes", required=true)
    private Output<Integer> applicationConsistentSnapshotFrequencyInMinutes;

    /**
     * @return Specifies the frequency(in minutes) at which to create application consistent recovery points.
     * 
     */
    public Output<Integer> applicationConsistentSnapshotFrequencyInMinutes() {
        return this.applicationConsistentSnapshotFrequencyInMinutes;
    }

    /**
     * The name of the replication policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the replication policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The duration in minutes for which the recovery points need to be stored.
     * 
     */
    @Import(name="recoveryPointRetentionInMinutes", required=true)
    private Output<Integer> recoveryPointRetentionInMinutes;

    /**
     * @return The duration in minutes for which the recovery points need to be stored.
     * 
     */
    public Output<Integer> recoveryPointRetentionInMinutes() {
        return this.recoveryPointRetentionInMinutes;
    }

    /**
     * The name of the vault that should be updated.
     * 
     */
    @Import(name="recoveryVaultName", required=true)
    private Output<String> recoveryVaultName;

    /**
     * @return The name of the vault that should be updated.
     * 
     */
    public Output<String> recoveryVaultName() {
        return this.recoveryVaultName;
    }

    /**
     * Name of the resource group where the vault that should be updated is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group where the vault that should be updated is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ReplicationPolicyArgs() {}

    private ReplicationPolicyArgs(ReplicationPolicyArgs $) {
        this.applicationConsistentSnapshotFrequencyInMinutes = $.applicationConsistentSnapshotFrequencyInMinutes;
        this.name = $.name;
        this.recoveryPointRetentionInMinutes = $.recoveryPointRetentionInMinutes;
        this.recoveryVaultName = $.recoveryVaultName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationPolicyArgs $;

        public Builder() {
            $ = new ReplicationPolicyArgs();
        }

        public Builder(ReplicationPolicyArgs defaults) {
            $ = new ReplicationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationConsistentSnapshotFrequencyInMinutes Specifies the frequency(in minutes) at which to create application consistent recovery points.
         * 
         * @return builder
         * 
         */
        public Builder applicationConsistentSnapshotFrequencyInMinutes(Output<Integer> applicationConsistentSnapshotFrequencyInMinutes) {
            $.applicationConsistentSnapshotFrequencyInMinutes = applicationConsistentSnapshotFrequencyInMinutes;
            return this;
        }

        /**
         * @param applicationConsistentSnapshotFrequencyInMinutes Specifies the frequency(in minutes) at which to create application consistent recovery points.
         * 
         * @return builder
         * 
         */
        public Builder applicationConsistentSnapshotFrequencyInMinutes(Integer applicationConsistentSnapshotFrequencyInMinutes) {
            return applicationConsistentSnapshotFrequencyInMinutes(Output.of(applicationConsistentSnapshotFrequencyInMinutes));
        }

        /**
         * @param name The name of the replication policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the replication policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param recoveryPointRetentionInMinutes The duration in minutes for which the recovery points need to be stored.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointRetentionInMinutes(Output<Integer> recoveryPointRetentionInMinutes) {
            $.recoveryPointRetentionInMinutes = recoveryPointRetentionInMinutes;
            return this;
        }

        /**
         * @param recoveryPointRetentionInMinutes The duration in minutes for which the recovery points need to be stored.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointRetentionInMinutes(Integer recoveryPointRetentionInMinutes) {
            return recoveryPointRetentionInMinutes(Output.of(recoveryPointRetentionInMinutes));
        }

        /**
         * @param recoveryVaultName The name of the vault that should be updated.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(Output<String> recoveryVaultName) {
            $.recoveryVaultName = recoveryVaultName;
            return this;
        }

        /**
         * @param recoveryVaultName The name of the vault that should be updated.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(String recoveryVaultName) {
            return recoveryVaultName(Output.of(recoveryVaultName));
        }

        /**
         * @param resourceGroupName Name of the resource group where the vault that should be updated is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group where the vault that should be updated is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ReplicationPolicyArgs build() {
            $.applicationConsistentSnapshotFrequencyInMinutes = Objects.requireNonNull($.applicationConsistentSnapshotFrequencyInMinutes, "expected parameter 'applicationConsistentSnapshotFrequencyInMinutes' to be non-null");
            $.recoveryPointRetentionInMinutes = Objects.requireNonNull($.recoveryPointRetentionInMinutes, "expected parameter 'recoveryPointRetentionInMinutes' to be non-null");
            $.recoveryVaultName = Objects.requireNonNull($.recoveryVaultName, "expected parameter 'recoveryVaultName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
