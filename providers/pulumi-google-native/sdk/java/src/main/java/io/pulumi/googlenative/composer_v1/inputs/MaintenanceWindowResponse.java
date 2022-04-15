// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration settings for Cloud Composer maintenance window. The following example: ```{ "startTime":"2019-08-01T01:00:00Z" "endTime":"2019-08-01T07:00:00Z" "recurrence":"FREQ=WEEKLY;BYDAY=TU,WE" }``` would define a maintenance window between 01 and 07 hours UTC during each Tuesday and Wednesday.
 * 
 */
public final class MaintenanceWindowResponse extends io.pulumi.resources.InvokeArgs {

    public static final MaintenanceWindowResponse Empty = new MaintenanceWindowResponse();

    /**
     * Maintenance window end time. It is used only to calculate the duration of the maintenance window. The value for end-time must be in the future, relative to `start_time`.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * Maintenance window recurrence. Format is a subset of [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed values for `FREQ` field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...` Example values: `FREQ=WEEKLY;BYDAY=TU,WE`, `FREQ=DAILY`.
     * 
     */
    @Import(name="recurrence", required=true)
      private final String recurrence;

    public String recurrence() {
        return this.recurrence;
    }

    /**
     * Start time of the first recurrence of the maintenance window.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    public MaintenanceWindowResponse(
        String endTime,
        String recurrence,
        String startTime) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.recurrence = Objects.requireNonNull(recurrence, "expected parameter 'recurrence' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private MaintenanceWindowResponse() {
        this.endTime = null;
        this.recurrence = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String recurrence;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder recurrence(String recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public MaintenanceWindowResponse build() {
            return new MaintenanceWindowResponse(endTime, recurrence, startTime);
        }
    }
}
