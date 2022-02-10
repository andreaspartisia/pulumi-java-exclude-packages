// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.AdvancedScheduleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SUCSchedulePropertiesResponse {
    private final @Nullable AdvancedScheduleResponse advancedSchedule;
    private final @Nullable String creationTime;
    private final @Nullable String description;
    private final @Nullable String expiryTime;
    private final @Nullable Double expiryTimeOffsetMinutes;
    private final @Nullable String frequency;
    private final @Nullable Double interval;
    private final @Nullable Boolean isEnabled;
    private final @Nullable String lastModifiedTime;
    private final @Nullable String nextRun;
    private final @Nullable Double nextRunOffsetMinutes;
    private final @Nullable String startTime;
    private final Double startTimeOffsetMinutes;
    private final @Nullable String timeZone;

    @OutputCustomType.Constructor({"advancedSchedule","creationTime","description","expiryTime","expiryTimeOffsetMinutes","frequency","interval","isEnabled","lastModifiedTime","nextRun","nextRunOffsetMinutes","startTime","startTimeOffsetMinutes","timeZone"})
    private SUCSchedulePropertiesResponse(
        @Nullable AdvancedScheduleResponse advancedSchedule,
        @Nullable String creationTime,
        @Nullable String description,
        @Nullable String expiryTime,
        @Nullable Double expiryTimeOffsetMinutes,
        @Nullable String frequency,
        @Nullable Double interval,
        @Nullable Boolean isEnabled,
        @Nullable String lastModifiedTime,
        @Nullable String nextRun,
        @Nullable Double nextRunOffsetMinutes,
        @Nullable String startTime,
        Double startTimeOffsetMinutes,
        @Nullable String timeZone) {
        this.advancedSchedule = advancedSchedule;
        this.creationTime = creationTime;
        this.description = description;
        this.expiryTime = expiryTime;
        this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
        this.frequency = frequency;
        this.interval = interval;
        this.isEnabled = isEnabled;
        this.lastModifiedTime = lastModifiedTime;
        this.nextRun = nextRun;
        this.nextRunOffsetMinutes = nextRunOffsetMinutes;
        this.startTime = startTime;
        this.startTimeOffsetMinutes = Objects.requireNonNull(startTimeOffsetMinutes);
        this.timeZone = timeZone;
    }

    public Optional<AdvancedScheduleResponse> getAdvancedSchedule() {
        return Optional.ofNullable(this.advancedSchedule);
    }
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getExpiryTime() {
        return Optional.ofNullable(this.expiryTime);
    }
    public Optional<Double> getExpiryTimeOffsetMinutes() {
        return Optional.ofNullable(this.expiryTimeOffsetMinutes);
    }
    public Optional<String> getFrequency() {
        return Optional.ofNullable(this.frequency);
    }
    public Optional<Double> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    public Optional<Boolean> getIsEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    public Optional<String> getNextRun() {
        return Optional.ofNullable(this.nextRun);
    }
    public Optional<Double> getNextRunOffsetMinutes() {
        return Optional.ofNullable(this.nextRunOffsetMinutes);
    }
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    public Double getStartTimeOffsetMinutes() {
        return this.startTimeOffsetMinutes;
    }
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SUCSchedulePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AdvancedScheduleResponse advancedSchedule;
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable String expiryTime;
        private @Nullable Double expiryTimeOffsetMinutes;
        private @Nullable String frequency;
        private @Nullable Double interval;
        private @Nullable Boolean isEnabled;
        private @Nullable String lastModifiedTime;
        private @Nullable String nextRun;
        private @Nullable Double nextRunOffsetMinutes;
        private @Nullable String startTime;
        private Double startTimeOffsetMinutes;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(SUCSchedulePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSchedule = defaults.advancedSchedule;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.expiryTime = defaults.expiryTime;
    	      this.expiryTimeOffsetMinutes = defaults.expiryTimeOffsetMinutes;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.nextRun = defaults.nextRun;
    	      this.nextRunOffsetMinutes = defaults.nextRunOffsetMinutes;
    	      this.startTime = defaults.startTime;
    	      this.startTimeOffsetMinutes = defaults.startTimeOffsetMinutes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setAdvancedSchedule(@Nullable AdvancedScheduleResponse advancedSchedule) {
            this.advancedSchedule = advancedSchedule;
            return this;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExpiryTime(@Nullable String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder setExpiryTimeOffsetMinutes(@Nullable Double expiryTimeOffsetMinutes) {
            this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
            return this;
        }

        public Builder setFrequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setInterval(@Nullable Double interval) {
            this.interval = interval;
            return this;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setNextRun(@Nullable String nextRun) {
            this.nextRun = nextRun;
            return this;
        }

        public Builder setNextRunOffsetMinutes(@Nullable Double nextRunOffsetMinutes) {
            this.nextRunOffsetMinutes = nextRunOffsetMinutes;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTimeOffsetMinutes(Double startTimeOffsetMinutes) {
            this.startTimeOffsetMinutes = Objects.requireNonNull(startTimeOffsetMinutes);
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public SUCSchedulePropertiesResponse build() {
            return new SUCSchedulePropertiesResponse(advancedSchedule, creationTime, description, expiryTime, expiryTimeOffsetMinutes, frequency, interval, isEnabled, lastModifiedTime, nextRun, nextRunOffsetMinutes, startTime, startTimeOffsetMinutes, timeZone);
        }
    }
}