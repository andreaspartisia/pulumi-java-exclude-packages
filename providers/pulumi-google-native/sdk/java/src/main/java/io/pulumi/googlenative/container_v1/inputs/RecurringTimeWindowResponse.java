// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1.inputs.TimeWindowResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an arbitrary window of time that recurs.
 * 
 */
public final class RecurringTimeWindowResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecurringTimeWindowResponse Empty = new RecurringTimeWindowResponse();

    /**
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how this window reccurs. They go on for the span of time between the start and end time. For example, to have something repeat every weekday, you'd use: `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR` To repeat some window daily (equivalent to the DailyMaintenanceWindow): `FREQ=DAILY` For the first weekend of every month: `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU` This specifies how frequently the window starts. Eg, if you wanted to have a 9-5 UTC-4 window every weekday, you'd use something like: ```start time = 2019-01-01T09:00:00-0400 end time = 2019-01-01T17:00:00-0400 recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR``` Windows can span multiple days. Eg, to make the window encompass every weekend from midnight Saturday till the last minute of Sunday UTC: ```start time = 2019-01-05T00:00:00Z end time = 2019-01-07T23:59:00Z recurrence = FREQ=WEEKLY;BYDAY=SA``` Note the start and end time's specific dates are largely arbitrary except to specify duration of the window and when it first starts. The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * 
     */
    @Import(name="recurrence", required=true)
      private final String recurrence;

    public String recurrence() {
        return this.recurrence;
    }

    /**
     * The window of the first recurrence.
     * 
     */
    @Import(name="window", required=true)
      private final TimeWindowResponse window;

    public TimeWindowResponse window() {
        return this.window;
    }

    public RecurringTimeWindowResponse(
        String recurrence,
        TimeWindowResponse window) {
        this.recurrence = Objects.requireNonNull(recurrence, "expected parameter 'recurrence' to be non-null");
        this.window = Objects.requireNonNull(window, "expected parameter 'window' to be non-null");
    }

    private RecurringTimeWindowResponse() {
        this.recurrence = null;
        this.window = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurringTimeWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recurrence;
        private TimeWindowResponse window;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurringTimeWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrence = defaults.recurrence;
    	      this.window = defaults.window;
        }

        public Builder recurrence(String recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }
        public Builder window(TimeWindowResponse window) {
            this.window = Objects.requireNonNull(window);
            return this;
        }        public RecurringTimeWindowResponse build() {
            return new RecurringTimeWindowResponse(recurrence, window);
        }
    }
}
