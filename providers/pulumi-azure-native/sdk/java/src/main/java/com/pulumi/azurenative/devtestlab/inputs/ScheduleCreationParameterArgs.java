// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.EnableStatus;
import com.pulumi.azurenative.devtestlab.inputs.DayDetailsArgs;
import com.pulumi.azurenative.devtestlab.inputs.HourDetailsArgs;
import com.pulumi.azurenative.devtestlab.inputs.NotificationSettingsArgs;
import com.pulumi.azurenative.devtestlab.inputs.WeekDetailsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for creating a schedule.
 * 
 */
public final class ScheduleCreationParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleCreationParameterArgs Empty = new ScheduleCreationParameterArgs();

    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    @Import(name="dailyRecurrence")
    private @Nullable Output<DayDetailsArgs> dailyRecurrence;

    public Optional<Output<DayDetailsArgs>> dailyRecurrence() {
        return Optional.ofNullable(this.dailyRecurrence);
    }

    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    @Import(name="hourlyRecurrence")
    private @Nullable Output<HourDetailsArgs> hourlyRecurrence;

    public Optional<Output<HourDetailsArgs>> hourlyRecurrence() {
        return Optional.ofNullable(this.hourlyRecurrence);
    }

    /**
     * The name of the virtual machine or environment
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Notification settings.
     * 
     */
    @Import(name="notificationSettings")
    private @Nullable Output<NotificationSettingsArgs> notificationSettings;

    public Optional<Output<NotificationSettingsArgs>> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }

    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,EnableStatus>> status;

    public Optional<Output<Either<String,EnableStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The resource ID to which the schedule belongs
     * 
     */
    @Import(name="targetResourceId")
    private @Nullable Output<String> targetResourceId;

    public Optional<Output<String>> targetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }

    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    @Import(name="taskType")
    private @Nullable Output<String> taskType;

    public Optional<Output<String>> taskType() {
        return Optional.ofNullable(this.taskType);
    }

    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    @Import(name="timeZoneId")
    private @Nullable Output<String> timeZoneId;

    public Optional<Output<String>> timeZoneId() {
        return Optional.ofNullable(this.timeZoneId);
    }

    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    @Import(name="weeklyRecurrence")
    private @Nullable Output<WeekDetailsArgs> weeklyRecurrence;

    public Optional<Output<WeekDetailsArgs>> weeklyRecurrence() {
        return Optional.ofNullable(this.weeklyRecurrence);
    }

    private ScheduleCreationParameterArgs() {}

    private ScheduleCreationParameterArgs(ScheduleCreationParameterArgs $) {
        this.dailyRecurrence = $.dailyRecurrence;
        this.hourlyRecurrence = $.hourlyRecurrence;
        this.name = $.name;
        this.notificationSettings = $.notificationSettings;
        this.status = $.status;
        this.tags = $.tags;
        this.targetResourceId = $.targetResourceId;
        this.taskType = $.taskType;
        this.timeZoneId = $.timeZoneId;
        this.weeklyRecurrence = $.weeklyRecurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleCreationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleCreationParameterArgs $;

        public Builder() {
            $ = new ScheduleCreationParameterArgs();
        }

        public Builder(ScheduleCreationParameterArgs defaults) {
            $ = new ScheduleCreationParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder dailyRecurrence(@Nullable Output<DayDetailsArgs> dailyRecurrence) {
            $.dailyRecurrence = dailyRecurrence;
            return this;
        }

        public Builder dailyRecurrence(DayDetailsArgs dailyRecurrence) {
            return dailyRecurrence(Output.of(dailyRecurrence));
        }

        public Builder hourlyRecurrence(@Nullable Output<HourDetailsArgs> hourlyRecurrence) {
            $.hourlyRecurrence = hourlyRecurrence;
            return this;
        }

        public Builder hourlyRecurrence(HourDetailsArgs hourlyRecurrence) {
            return hourlyRecurrence(Output.of(hourlyRecurrence));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder notificationSettings(@Nullable Output<NotificationSettingsArgs> notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        public Builder notificationSettings(NotificationSettingsArgs notificationSettings) {
            return notificationSettings(Output.of(notificationSettings));
        }

        public Builder status(@Nullable Output<Either<String,EnableStatus>> status) {
            $.status = status;
            return this;
        }

        public Builder status(Either<String,EnableStatus> status) {
            return status(Output.of(status));
        }

        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        public Builder status(EnableStatus status) {
            return status(Either.ofRight(status));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder targetResourceId(@Nullable Output<String> targetResourceId) {
            $.targetResourceId = targetResourceId;
            return this;
        }

        public Builder targetResourceId(String targetResourceId) {
            return targetResourceId(Output.of(targetResourceId));
        }

        public Builder taskType(@Nullable Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public Builder timeZoneId(@Nullable Output<String> timeZoneId) {
            $.timeZoneId = timeZoneId;
            return this;
        }

        public Builder timeZoneId(String timeZoneId) {
            return timeZoneId(Output.of(timeZoneId));
        }

        public Builder weeklyRecurrence(@Nullable Output<WeekDetailsArgs> weeklyRecurrence) {
            $.weeklyRecurrence = weeklyRecurrence;
            return this;
        }

        public Builder weeklyRecurrence(WeekDetailsArgs weeklyRecurrence) {
            return weeklyRecurrence(Output.of(weeklyRecurrence));
        }

        public ScheduleCreationParameterArgs build() {
            $.status = Codegen.stringProp("status").left(EnableStatus.class).output().arg($.status).def("Disabled").getNullable();
            return $;
        }
    }

}
