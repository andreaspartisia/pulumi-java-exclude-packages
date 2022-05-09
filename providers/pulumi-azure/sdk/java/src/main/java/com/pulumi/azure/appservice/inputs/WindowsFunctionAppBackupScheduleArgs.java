// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFunctionAppBackupScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFunctionAppBackupScheduleArgs Empty = new WindowsFunctionAppBackupScheduleArgs();

    /**
     * How often the backup should be executed (e.g. for weekly backup, this should be set to `7` and `frequency_unit` should be set to `Day`).
     * 
     */
    @Import(name="frequencyInterval", required=true)
    private Output<Integer> frequencyInterval;

    /**
     * @return How often the backup should be executed (e.g. for weekly backup, this should be set to `7` and `frequency_unit` should be set to `Day`).
     * 
     */
    public Output<Integer> frequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * The unit of time for how often the backup should take place. Possible values include: `Day` and `Hour`.
     * 
     */
    @Import(name="frequencyUnit", required=true)
    private Output<String> frequencyUnit;

    /**
     * @return The unit of time for how often the backup should take place. Possible values include: `Day` and `Hour`.
     * 
     */
    public Output<String> frequencyUnit() {
        return this.frequencyUnit;
    }

    /**
     * Should the service keep at least one backup, regardless of age of backup. Defaults to `false`.
     * 
     */
    @Import(name="keepAtLeastOneBackup")
    private @Nullable Output<Boolean> keepAtLeastOneBackup;

    /**
     * @return Should the service keep at least one backup, regardless of age of backup. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> keepAtLeastOneBackup() {
        return Optional.ofNullable(this.keepAtLeastOneBackup);
    }

    @Import(name="lastExecutionTime")
    private @Nullable Output<String> lastExecutionTime;

    public Optional<Output<String>> lastExecutionTime() {
        return Optional.ofNullable(this.lastExecutionTime);
    }

    /**
     * After how many days backups should be deleted.
     * 
     */
    @Import(name="retentionPeriodDays")
    private @Nullable Output<Integer> retentionPeriodDays;

    /**
     * @return After how many days backups should be deleted.
     * 
     */
    public Optional<Output<Integer>> retentionPeriodDays() {
        return Optional.ofNullable(this.retentionPeriodDays);
    }

    /**
     * When the schedule should start working in RFC-3339 format.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return When the schedule should start working in RFC-3339 format.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private WindowsFunctionAppBackupScheduleArgs() {}

    private WindowsFunctionAppBackupScheduleArgs(WindowsFunctionAppBackupScheduleArgs $) {
        this.frequencyInterval = $.frequencyInterval;
        this.frequencyUnit = $.frequencyUnit;
        this.keepAtLeastOneBackup = $.keepAtLeastOneBackup;
        this.lastExecutionTime = $.lastExecutionTime;
        this.retentionPeriodDays = $.retentionPeriodDays;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFunctionAppBackupScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFunctionAppBackupScheduleArgs $;

        public Builder() {
            $ = new WindowsFunctionAppBackupScheduleArgs();
        }

        public Builder(WindowsFunctionAppBackupScheduleArgs defaults) {
            $ = new WindowsFunctionAppBackupScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequencyInterval How often the backup should be executed (e.g. for weekly backup, this should be set to `7` and `frequency_unit` should be set to `Day`).
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Output<Integer> frequencyInterval) {
            $.frequencyInterval = frequencyInterval;
            return this;
        }

        /**
         * @param frequencyInterval How often the backup should be executed (e.g. for weekly backup, this should be set to `7` and `frequency_unit` should be set to `Day`).
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Integer frequencyInterval) {
            return frequencyInterval(Output.of(frequencyInterval));
        }

        /**
         * @param frequencyUnit The unit of time for how often the backup should take place. Possible values include: `Day` and `Hour`.
         * 
         * @return builder
         * 
         */
        public Builder frequencyUnit(Output<String> frequencyUnit) {
            $.frequencyUnit = frequencyUnit;
            return this;
        }

        /**
         * @param frequencyUnit The unit of time for how often the backup should take place. Possible values include: `Day` and `Hour`.
         * 
         * @return builder
         * 
         */
        public Builder frequencyUnit(String frequencyUnit) {
            return frequencyUnit(Output.of(frequencyUnit));
        }

        /**
         * @param keepAtLeastOneBackup Should the service keep at least one backup, regardless of age of backup. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder keepAtLeastOneBackup(@Nullable Output<Boolean> keepAtLeastOneBackup) {
            $.keepAtLeastOneBackup = keepAtLeastOneBackup;
            return this;
        }

        /**
         * @param keepAtLeastOneBackup Should the service keep at least one backup, regardless of age of backup. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder keepAtLeastOneBackup(Boolean keepAtLeastOneBackup) {
            return keepAtLeastOneBackup(Output.of(keepAtLeastOneBackup));
        }

        public Builder lastExecutionTime(@Nullable Output<String> lastExecutionTime) {
            $.lastExecutionTime = lastExecutionTime;
            return this;
        }

        public Builder lastExecutionTime(String lastExecutionTime) {
            return lastExecutionTime(Output.of(lastExecutionTime));
        }

        /**
         * @param retentionPeriodDays After how many days backups should be deleted.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriodDays(@Nullable Output<Integer> retentionPeriodDays) {
            $.retentionPeriodDays = retentionPeriodDays;
            return this;
        }

        /**
         * @param retentionPeriodDays After how many days backups should be deleted.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriodDays(Integer retentionPeriodDays) {
            return retentionPeriodDays(Output.of(retentionPeriodDays));
        }

        /**
         * @param startTime When the schedule should start working in RFC-3339 format.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime When the schedule should start working in RFC-3339 format.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public WindowsFunctionAppBackupScheduleArgs build() {
            $.frequencyInterval = Objects.requireNonNull($.frequencyInterval, "expected parameter 'frequencyInterval' to be non-null");
            $.frequencyUnit = Objects.requireNonNull($.frequencyUnit, "expected parameter 'frequencyUnit' to be non-null");
            return $;
        }
    }

}
