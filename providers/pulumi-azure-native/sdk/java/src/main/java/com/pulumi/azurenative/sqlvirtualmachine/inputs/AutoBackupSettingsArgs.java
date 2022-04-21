// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.azurenative.sqlvirtualmachine.enums.BackupScheduleType;
import com.pulumi.azurenative.sqlvirtualmachine.enums.FullBackupFrequencyType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configure backups for databases in your SQL virtual machine.
 * 
 */
public final class AutoBackupSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoBackupSettingsArgs Empty = new AutoBackupSettingsArgs();

    /**
     * Backup schedule type.
     * 
     */
    @Import(name="backupScheduleType")
    private @Nullable Output<Either<String,BackupScheduleType>> backupScheduleType;

    public Optional<Output<Either<String,BackupScheduleType>>> backupScheduleType() {
        return Optional.ofNullable(this.backupScheduleType);
    }

    /**
     * Include or exclude system databases from auto backup.
     * 
     */
    @Import(name="backupSystemDbs")
    private @Nullable Output<Boolean> backupSystemDbs;

    public Optional<Output<Boolean>> backupSystemDbs() {
        return Optional.ofNullable(this.backupSystemDbs);
    }

    /**
     * Enable or disable autobackup on SQL virtual machine.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Enable or disable encryption for backup on SQL virtual machine.
     * 
     */
    @Import(name="enableEncryption")
    private @Nullable Output<Boolean> enableEncryption;

    public Optional<Output<Boolean>> enableEncryption() {
        return Optional.ofNullable(this.enableEncryption);
    }

    /**
     * Frequency of full backups. In both cases, full backups begin during the next scheduled time window.
     * 
     */
    @Import(name="fullBackupFrequency")
    private @Nullable Output<Either<String,FullBackupFrequencyType>> fullBackupFrequency;

    public Optional<Output<Either<String,FullBackupFrequencyType>>> fullBackupFrequency() {
        return Optional.ofNullable(this.fullBackupFrequency);
    }

    /**
     * Start time of a given day during which full backups can take place. 0-23 hours.
     * 
     */
    @Import(name="fullBackupStartTime")
    private @Nullable Output<Integer> fullBackupStartTime;

    public Optional<Output<Integer>> fullBackupStartTime() {
        return Optional.ofNullable(this.fullBackupStartTime);
    }

    /**
     * Duration of the time window of a given day during which full backups can take place. 1-23 hours.
     * 
     */
    @Import(name="fullBackupWindowHours")
    private @Nullable Output<Integer> fullBackupWindowHours;

    public Optional<Output<Integer>> fullBackupWindowHours() {
        return Optional.ofNullable(this.fullBackupWindowHours);
    }

    /**
     * Frequency of log backups. 5-60 minutes.
     * 
     */
    @Import(name="logBackupFrequency")
    private @Nullable Output<Integer> logBackupFrequency;

    public Optional<Output<Integer>> logBackupFrequency() {
        return Optional.ofNullable(this.logBackupFrequency);
    }

    /**
     * Password for encryption on backup.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Retention period of backup: 1-30 days.
     * 
     */
    @Import(name="retentionPeriod")
    private @Nullable Output<Integer> retentionPeriod;

    public Optional<Output<Integer>> retentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }

    /**
     * Storage account key where backup will be taken to.
     * 
     */
    @Import(name="storageAccessKey")
    private @Nullable Output<String> storageAccessKey;

    public Optional<Output<String>> storageAccessKey() {
        return Optional.ofNullable(this.storageAccessKey);
    }

    /**
     * Storage account url where backup will be taken to.
     * 
     */
    @Import(name="storageAccountUrl")
    private @Nullable Output<String> storageAccountUrl;

    public Optional<Output<String>> storageAccountUrl() {
        return Optional.ofNullable(this.storageAccountUrl);
    }

    private AutoBackupSettingsArgs() {}

    private AutoBackupSettingsArgs(AutoBackupSettingsArgs $) {
        this.backupScheduleType = $.backupScheduleType;
        this.backupSystemDbs = $.backupSystemDbs;
        this.enable = $.enable;
        this.enableEncryption = $.enableEncryption;
        this.fullBackupFrequency = $.fullBackupFrequency;
        this.fullBackupStartTime = $.fullBackupStartTime;
        this.fullBackupWindowHours = $.fullBackupWindowHours;
        this.logBackupFrequency = $.logBackupFrequency;
        this.password = $.password;
        this.retentionPeriod = $.retentionPeriod;
        this.storageAccessKey = $.storageAccessKey;
        this.storageAccountUrl = $.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoBackupSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoBackupSettingsArgs $;

        public Builder() {
            $ = new AutoBackupSettingsArgs();
        }

        public Builder(AutoBackupSettingsArgs defaults) {
            $ = new AutoBackupSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupScheduleType(@Nullable Output<Either<String,BackupScheduleType>> backupScheduleType) {
            $.backupScheduleType = backupScheduleType;
            return this;
        }

        public Builder backupScheduleType(Either<String,BackupScheduleType> backupScheduleType) {
            return backupScheduleType(Output.of(backupScheduleType));
        }

        public Builder backupScheduleType(String backupScheduleType) {
            return backupScheduleType(Either.ofLeft(backupScheduleType));
        }

        public Builder backupScheduleType(BackupScheduleType backupScheduleType) {
            return backupScheduleType(Either.ofRight(backupScheduleType));
        }

        public Builder backupSystemDbs(@Nullable Output<Boolean> backupSystemDbs) {
            $.backupSystemDbs = backupSystemDbs;
            return this;
        }

        public Builder backupSystemDbs(Boolean backupSystemDbs) {
            return backupSystemDbs(Output.of(backupSystemDbs));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder enableEncryption(@Nullable Output<Boolean> enableEncryption) {
            $.enableEncryption = enableEncryption;
            return this;
        }

        public Builder enableEncryption(Boolean enableEncryption) {
            return enableEncryption(Output.of(enableEncryption));
        }

        public Builder fullBackupFrequency(@Nullable Output<Either<String,FullBackupFrequencyType>> fullBackupFrequency) {
            $.fullBackupFrequency = fullBackupFrequency;
            return this;
        }

        public Builder fullBackupFrequency(Either<String,FullBackupFrequencyType> fullBackupFrequency) {
            return fullBackupFrequency(Output.of(fullBackupFrequency));
        }

        public Builder fullBackupFrequency(String fullBackupFrequency) {
            return fullBackupFrequency(Either.ofLeft(fullBackupFrequency));
        }

        public Builder fullBackupFrequency(FullBackupFrequencyType fullBackupFrequency) {
            return fullBackupFrequency(Either.ofRight(fullBackupFrequency));
        }

        public Builder fullBackupStartTime(@Nullable Output<Integer> fullBackupStartTime) {
            $.fullBackupStartTime = fullBackupStartTime;
            return this;
        }

        public Builder fullBackupStartTime(Integer fullBackupStartTime) {
            return fullBackupStartTime(Output.of(fullBackupStartTime));
        }

        public Builder fullBackupWindowHours(@Nullable Output<Integer> fullBackupWindowHours) {
            $.fullBackupWindowHours = fullBackupWindowHours;
            return this;
        }

        public Builder fullBackupWindowHours(Integer fullBackupWindowHours) {
            return fullBackupWindowHours(Output.of(fullBackupWindowHours));
        }

        public Builder logBackupFrequency(@Nullable Output<Integer> logBackupFrequency) {
            $.logBackupFrequency = logBackupFrequency;
            return this;
        }

        public Builder logBackupFrequency(Integer logBackupFrequency) {
            return logBackupFrequency(Output.of(logBackupFrequency));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder retentionPeriod(@Nullable Output<Integer> retentionPeriod) {
            $.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder retentionPeriod(Integer retentionPeriod) {
            return retentionPeriod(Output.of(retentionPeriod));
        }

        public Builder storageAccessKey(@Nullable Output<String> storageAccessKey) {
            $.storageAccessKey = storageAccessKey;
            return this;
        }

        public Builder storageAccessKey(String storageAccessKey) {
            return storageAccessKey(Output.of(storageAccessKey));
        }

        public Builder storageAccountUrl(@Nullable Output<String> storageAccountUrl) {
            $.storageAccountUrl = storageAccountUrl;
            return this;
        }

        public Builder storageAccountUrl(String storageAccountUrl) {
            return storageAccountUrl(Output.of(storageAccountUrl));
        }

        public AutoBackupSettingsArgs build() {
            return $;
        }
    }

}
