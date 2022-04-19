// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a backup schedule. Describes how often should be the backup performed and what should be the retention policy.
 * 
 */
public final class BackupScheduleResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackupScheduleResponse Empty = new BackupScheduleResponse();

    /**
     * How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should be set to Day)
     * 
     */
    @Import(name="frequencyInterval", required=true)
      private final Integer frequencyInterval;

    public Integer frequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day and FrequencyInterval should be set to 7)
     * 
     */
    @Import(name="frequencyUnit", required=true)
      private final String frequencyUnit;

    public String frequencyUnit() {
        return this.frequencyUnit;
    }

    /**
     * True if the retention policy should always keep at least one backup in the storage account, regardless how old it is; false otherwise.
     * 
     */
    @Import(name="keepAtLeastOneBackup", required=true)
      private final Boolean keepAtLeastOneBackup;

    public Boolean keepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }

    /**
     * Last time when this schedule was triggered.
     * 
     */
    @Import(name="lastExecutionTime", required=true)
      private final String lastExecutionTime;

    public String lastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * After how many days backups should be deleted.
     * 
     */
    @Import(name="retentionPeriodInDays", required=true)
      private final Integer retentionPeriodInDays;

    public Integer retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * When the schedule should start working.
     * 
     */
    @Import(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> startTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public BackupScheduleResponse(
        Integer frequencyInterval,
        String frequencyUnit,
        Boolean keepAtLeastOneBackup,
        String lastExecutionTime,
        Integer retentionPeriodInDays,
        @Nullable String startTime) {
        this.frequencyInterval = Codegen.integerProp("frequencyInterval").arg(frequencyInterval).def(7).require();
        this.frequencyUnit = Codegen.stringProp("frequencyUnit").arg(frequencyUnit).def("Day").require();
        this.keepAtLeastOneBackup = Codegen.booleanProp("keepAtLeastOneBackup").arg(keepAtLeastOneBackup).def(true).require();
        this.lastExecutionTime = Objects.requireNonNull(lastExecutionTime, "expected parameter 'lastExecutionTime' to be non-null");
        this.retentionPeriodInDays = Codegen.integerProp("retentionPeriodInDays").arg(retentionPeriodInDays).def(30).require();
        this.startTime = startTime;
    }

    private BackupScheduleResponse() {
        this.frequencyInterval = null;
        this.frequencyUnit = null;
        this.keepAtLeastOneBackup = null;
        this.lastExecutionTime = null;
        this.retentionPeriodInDays = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer frequencyInterval;
        private String frequencyUnit;
        private Boolean keepAtLeastOneBackup;
        private String lastExecutionTime;
        private Integer retentionPeriodInDays;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInterval = defaults.frequencyInterval;
    	      this.frequencyUnit = defaults.frequencyUnit;
    	      this.keepAtLeastOneBackup = defaults.keepAtLeastOneBackup;
    	      this.lastExecutionTime = defaults.lastExecutionTime;
    	      this.retentionPeriodInDays = defaults.retentionPeriodInDays;
    	      this.startTime = defaults.startTime;
        }

        public Builder frequencyInterval(Integer frequencyInterval) {
            this.frequencyInterval = Objects.requireNonNull(frequencyInterval);
            return this;
        }
        public Builder frequencyUnit(String frequencyUnit) {
            this.frequencyUnit = Objects.requireNonNull(frequencyUnit);
            return this;
        }
        public Builder keepAtLeastOneBackup(Boolean keepAtLeastOneBackup) {
            this.keepAtLeastOneBackup = Objects.requireNonNull(keepAtLeastOneBackup);
            return this;
        }
        public Builder lastExecutionTime(String lastExecutionTime) {
            this.lastExecutionTime = Objects.requireNonNull(lastExecutionTime);
            return this;
        }
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = Objects.requireNonNull(retentionPeriodInDays);
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }        public BackupScheduleResponse build() {
            return new BackupScheduleResponse(frequencyInterval, frequencyUnit, keepAtLeastOneBackup, lastExecutionTime, retentionPeriodInDays, startTime);
        }
    }
}
