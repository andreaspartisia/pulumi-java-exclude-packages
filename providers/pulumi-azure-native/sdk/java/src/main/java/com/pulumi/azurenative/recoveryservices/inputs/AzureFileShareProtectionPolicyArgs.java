// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.WorkloadType;
import com.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureStorage backup policy.
 * 
 */
public final class AzureFileShareProtectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFileShareProtectionPolicyArgs Empty = new AzureFileShareProtectionPolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is &#39;AzureStorage&#39;.
     * 
     */
    @Import(name="backupManagementType", required=true)
    private Output<String> backupManagementType;

    public Output<String> backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @Import(name="protectedItemsCount")
    private @Nullable Output<Integer> protectedItemsCount;

    public Optional<Output<Integer>> protectedItemsCount() {
        return Optional.ofNullable(this.protectedItemsCount);
    }

    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

    public Optional<Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @Import(name="schedulePolicy")
    private @Nullable Output<Object> schedulePolicy;

    public Optional<Output<Object>> schedulePolicy() {
        return Optional.ofNullable(this.schedulePolicy);
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    /**
     * Type of workload for the backup management
     * 
     */
    @Import(name="workLoadType")
    private @Nullable Output<Either<String,WorkloadType>> workLoadType;

    public Optional<Output<Either<String,WorkloadType>>> workLoadType() {
        return Optional.ofNullable(this.workLoadType);
    }

    private AzureFileShareProtectionPolicyArgs() {}

    private AzureFileShareProtectionPolicyArgs(AzureFileShareProtectionPolicyArgs $) {
        this.backupManagementType = $.backupManagementType;
        this.protectedItemsCount = $.protectedItemsCount;
        this.retentionPolicy = $.retentionPolicy;
        this.schedulePolicy = $.schedulePolicy;
        this.timeZone = $.timeZone;
        this.workLoadType = $.workLoadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFileShareProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFileShareProtectionPolicyArgs $;

        public Builder() {
            $ = new AzureFileShareProtectionPolicyArgs();
        }

        public Builder(AzureFileShareProtectionPolicyArgs defaults) {
            $ = new AzureFileShareProtectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupManagementType(Output<String> backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        public Builder backupManagementType(String backupManagementType) {
            return backupManagementType(Output.of(backupManagementType));
        }

        public Builder protectedItemsCount(@Nullable Output<Integer> protectedItemsCount) {
            $.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder protectedItemsCount(Integer protectedItemsCount) {
            return protectedItemsCount(Output.of(protectedItemsCount));
        }

        public Builder retentionPolicy(@Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder retentionPolicy(Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs> retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        public Builder retentionPolicy(LongTermRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Either.ofLeft(retentionPolicy));
        }

        public Builder retentionPolicy(SimpleRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Either.ofRight(retentionPolicy));
        }

        public Builder schedulePolicy(@Nullable Output<Object> schedulePolicy) {
            $.schedulePolicy = schedulePolicy;
            return this;
        }

        public Builder schedulePolicy(Object schedulePolicy) {
            return schedulePolicy(Output.of(schedulePolicy));
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public Builder workLoadType(@Nullable Output<Either<String,WorkloadType>> workLoadType) {
            $.workLoadType = workLoadType;
            return this;
        }

        public Builder workLoadType(Either<String,WorkloadType> workLoadType) {
            return workLoadType(Output.of(workLoadType));
        }

        public Builder workLoadType(String workLoadType) {
            return workLoadType(Either.ofLeft(workLoadType));
        }

        public Builder workLoadType(WorkloadType workLoadType) {
            return workLoadType(Either.ofRight(workLoadType));
        }

        public AzureFileShareProtectionPolicyArgs build() {
            $.backupManagementType = Codegen.stringProp("backupManagementType").output().arg($.backupManagementType).require();
            return $;
        }
    }

}
