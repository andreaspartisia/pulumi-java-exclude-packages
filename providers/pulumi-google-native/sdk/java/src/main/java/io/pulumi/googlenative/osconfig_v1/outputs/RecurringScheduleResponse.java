// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.MonthlyScheduleResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.TimeOfDayResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.TimeZoneResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.WeeklyScheduleResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RecurringScheduleResponse {
    /**
     * Optional. The end time at which a recurring patch deployment schedule is no longer active.
     * 
     */
    private final String endTime;
    /**
     * The frequency unit of this recurring schedule.
     * 
     */
    private final String frequency;
    /**
     * The time the last patch job ran successfully.
     * 
     */
    private final String lastExecuteTime;
    /**
     * Schedule with monthly executions.
     * 
     */
    private final MonthlyScheduleResponse monthly;
    /**
     * The time the next patch job is scheduled to run.
     * 
     */
    private final String nextExecuteTime;
    /**
     * Optional. The time that the recurring schedule becomes effective. Defaults to `create_time` of the patch deployment.
     * 
     */
    private final String startTime;
    /**
     * Time of the day to run a recurring deployment.
     * 
     */
    private final TimeOfDayResponse timeOfDay;
    /**
     * Defines the time zone that `time_of_day` is relative to. The rules for daylight saving time are determined by the chosen time zone.
     * 
     */
    private final TimeZoneResponse timeZone;
    /**
     * Schedule with weekly executions.
     * 
     */
    private final WeeklyScheduleResponse weekly;

    @CustomType.Constructor
    private RecurringScheduleResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("frequency") String frequency,
        @CustomType.Parameter("lastExecuteTime") String lastExecuteTime,
        @CustomType.Parameter("monthly") MonthlyScheduleResponse monthly,
        @CustomType.Parameter("nextExecuteTime") String nextExecuteTime,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("timeOfDay") TimeOfDayResponse timeOfDay,
        @CustomType.Parameter("timeZone") TimeZoneResponse timeZone,
        @CustomType.Parameter("weekly") WeeklyScheduleResponse weekly) {
        this.endTime = endTime;
        this.frequency = frequency;
        this.lastExecuteTime = lastExecuteTime;
        this.monthly = monthly;
        this.nextExecuteTime = nextExecuteTime;
        this.startTime = startTime;
        this.timeOfDay = timeOfDay;
        this.timeZone = timeZone;
        this.weekly = weekly;
    }

    /**
     * Optional. The end time at which a recurring patch deployment schedule is no longer active.
     * 
    */
    public String endTime() {
        return this.endTime;
    }
    /**
     * The frequency unit of this recurring schedule.
     * 
    */
    public String frequency() {
        return this.frequency;
    }
    /**
     * The time the last patch job ran successfully.
     * 
    */
    public String lastExecuteTime() {
        return this.lastExecuteTime;
    }
    /**
     * Schedule with monthly executions.
     * 
    */
    public MonthlyScheduleResponse monthly() {
        return this.monthly;
    }
    /**
     * The time the next patch job is scheduled to run.
     * 
    */
    public String nextExecuteTime() {
        return this.nextExecuteTime;
    }
    /**
     * Optional. The time that the recurring schedule becomes effective. Defaults to `create_time` of the patch deployment.
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * Time of the day to run a recurring deployment.
     * 
    */
    public TimeOfDayResponse timeOfDay() {
        return this.timeOfDay;
    }
    /**
     * Defines the time zone that `time_of_day` is relative to. The rules for daylight saving time are determined by the chosen time zone.
     * 
    */
    public TimeZoneResponse timeZone() {
        return this.timeZone;
    }
    /**
     * Schedule with weekly executions.
     * 
    */
    public WeeklyScheduleResponse weekly() {
        return this.weekly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurringScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String frequency;
        private String lastExecuteTime;
        private MonthlyScheduleResponse monthly;
        private String nextExecuteTime;
        private String startTime;
        private TimeOfDayResponse timeOfDay;
        private TimeZoneResponse timeZone;
        private WeeklyScheduleResponse weekly;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurringScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.lastExecuteTime = defaults.lastExecuteTime;
    	      this.monthly = defaults.monthly;
    	      this.nextExecuteTime = defaults.nextExecuteTime;
    	      this.startTime = defaults.startTime;
    	      this.timeOfDay = defaults.timeOfDay;
    	      this.timeZone = defaults.timeZone;
    	      this.weekly = defaults.weekly;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder frequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }
        public Builder lastExecuteTime(String lastExecuteTime) {
            this.lastExecuteTime = Objects.requireNonNull(lastExecuteTime);
            return this;
        }
        public Builder monthly(MonthlyScheduleResponse monthly) {
            this.monthly = Objects.requireNonNull(monthly);
            return this;
        }
        public Builder nextExecuteTime(String nextExecuteTime) {
            this.nextExecuteTime = Objects.requireNonNull(nextExecuteTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder timeOfDay(TimeOfDayResponse timeOfDay) {
            this.timeOfDay = Objects.requireNonNull(timeOfDay);
            return this;
        }
        public Builder timeZone(TimeZoneResponse timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder weekly(WeeklyScheduleResponse weekly) {
            this.weekly = Objects.requireNonNull(weekly);
            return this;
        }        public RecurringScheduleResponse build() {
            return new RecurringScheduleResponse(endTime, frequency, lastExecuteTime, monthly, nextExecuteTime, startTime, timeOfDay, timeZone, weekly);
        }
    }
}
