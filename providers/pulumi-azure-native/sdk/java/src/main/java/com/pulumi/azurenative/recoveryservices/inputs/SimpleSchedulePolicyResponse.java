// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Simple policy schedule.
 * 
 */
public final class SimpleSchedulePolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final SimpleSchedulePolicyResponse Empty = new SimpleSchedulePolicyResponse();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'SimpleSchedulePolicy'.
     * 
     */
    @Import(name="schedulePolicyType", required=true)
      private final String schedulePolicyType;

    public String schedulePolicyType() {
        return this.schedulePolicyType;
    }

    /**
     * List of days of week this schedule has to be run.
     * 
     */
    @Import(name="scheduleRunDays")
      private final @Nullable List<String> scheduleRunDays;

    public List<String> scheduleRunDays() {
        return this.scheduleRunDays == null ? List.of() : this.scheduleRunDays;
    }

    /**
     * Frequency of the schedule operation of this policy.
     * 
     */
    @Import(name="scheduleRunFrequency")
      private final @Nullable String scheduleRunFrequency;

    public Optional<String> scheduleRunFrequency() {
        return this.scheduleRunFrequency == null ? Optional.empty() : Optional.ofNullable(this.scheduleRunFrequency);
    }

    /**
     * List of times of day this schedule has to be run.
     * 
     */
    @Import(name="scheduleRunTimes")
      private final @Nullable List<String> scheduleRunTimes;

    public List<String> scheduleRunTimes() {
        return this.scheduleRunTimes == null ? List.of() : this.scheduleRunTimes;
    }

    /**
     * At every number weeks this schedule has to be run.
     * 
     */
    @Import(name="scheduleWeeklyFrequency")
      private final @Nullable Integer scheduleWeeklyFrequency;

    public Optional<Integer> scheduleWeeklyFrequency() {
        return this.scheduleWeeklyFrequency == null ? Optional.empty() : Optional.ofNullable(this.scheduleWeeklyFrequency);
    }

    public SimpleSchedulePolicyResponse(
        String schedulePolicyType,
        @Nullable List<String> scheduleRunDays,
        @Nullable String scheduleRunFrequency,
        @Nullable List<String> scheduleRunTimes,
        @Nullable Integer scheduleWeeklyFrequency) {
        this.schedulePolicyType = Codegen.stringProp("schedulePolicyType").arg(schedulePolicyType).require();
        this.scheduleRunDays = scheduleRunDays;
        this.scheduleRunFrequency = scheduleRunFrequency;
        this.scheduleRunTimes = scheduleRunTimes;
        this.scheduleWeeklyFrequency = scheduleWeeklyFrequency;
    }

    private SimpleSchedulePolicyResponse() {
        this.schedulePolicyType = null;
        this.scheduleRunDays = List.of();
        this.scheduleRunFrequency = null;
        this.scheduleRunTimes = List.of();
        this.scheduleWeeklyFrequency = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimpleSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schedulePolicyType;
        private @Nullable List<String> scheduleRunDays;
        private @Nullable String scheduleRunFrequency;
        private @Nullable List<String> scheduleRunTimes;
        private @Nullable Integer scheduleWeeklyFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(SimpleSchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulePolicyType = defaults.schedulePolicyType;
    	      this.scheduleRunDays = defaults.scheduleRunDays;
    	      this.scheduleRunFrequency = defaults.scheduleRunFrequency;
    	      this.scheduleRunTimes = defaults.scheduleRunTimes;
    	      this.scheduleWeeklyFrequency = defaults.scheduleWeeklyFrequency;
        }

        public Builder schedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }
        public Builder scheduleRunDays(@Nullable List<String> scheduleRunDays) {
            this.scheduleRunDays = scheduleRunDays;
            return this;
        }
        public Builder scheduleRunDays(String... scheduleRunDays) {
            return scheduleRunDays(List.of(scheduleRunDays));
        }
        public Builder scheduleRunFrequency(@Nullable String scheduleRunFrequency) {
            this.scheduleRunFrequency = scheduleRunFrequency;
            return this;
        }
        public Builder scheduleRunTimes(@Nullable List<String> scheduleRunTimes) {
            this.scheduleRunTimes = scheduleRunTimes;
            return this;
        }
        public Builder scheduleRunTimes(String... scheduleRunTimes) {
            return scheduleRunTimes(List.of(scheduleRunTimes));
        }
        public Builder scheduleWeeklyFrequency(@Nullable Integer scheduleWeeklyFrequency) {
            this.scheduleWeeklyFrequency = scheduleWeeklyFrequency;
            return this;
        }        public SimpleSchedulePolicyResponse build() {
            return new SimpleSchedulePolicyResponse(schedulePolicyType, scheduleRunDays, scheduleRunFrequency, scheduleRunTimes, scheduleWeeklyFrequency);
        }
    }
}
