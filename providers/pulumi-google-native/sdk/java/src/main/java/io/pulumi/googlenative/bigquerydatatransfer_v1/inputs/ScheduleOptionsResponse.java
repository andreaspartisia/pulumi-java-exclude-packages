// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquerydatatransfer_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Options customizing the data transfer schedule.
 * 
 */
public final class ScheduleOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScheduleOptionsResponse Empty = new ScheduleOptionsResponse();

    /**
     * If true, automatic scheduling of data transfer runs for this configuration will be disabled. The runs can be started on ad-hoc basis using StartManualTransferRuns API. When automatic scheduling is disabled, the TransferConfig.schedule field will be ignored.
     * 
     */
    @Import(name="disableAutoScheduling", required=true)
      private final Boolean disableAutoScheduling;

    public Boolean disableAutoScheduling() {
        return this.disableAutoScheduling;
    }

    /**
     * Defines time to stop scheduling transfer runs. A transfer run cannot be scheduled at or after the end time. The end time can be changed at any moment. The time when a data transfer can be trigerred manually is not limited by this option.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * Specifies time to start scheduling transfer runs. The first run will be scheduled at or after the start time according to a recurrence pattern defined in the schedule string. The start time can be changed at any moment. The time when a data transfer can be trigerred manually is not limited by this option.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    public ScheduleOptionsResponse(
        Boolean disableAutoScheduling,
        String endTime,
        String startTime) {
        this.disableAutoScheduling = Objects.requireNonNull(disableAutoScheduling, "expected parameter 'disableAutoScheduling' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private ScheduleOptionsResponse() {
        this.disableAutoScheduling = null;
        this.endTime = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableAutoScheduling;
        private String endTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableAutoScheduling = defaults.disableAutoScheduling;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder disableAutoScheduling(Boolean disableAutoScheduling) {
            this.disableAutoScheduling = Objects.requireNonNull(disableAutoScheduling);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public ScheduleOptionsResponse build() {
            return new ScheduleOptionsResponse(disableAutoScheduling, endTime, startTime);
        }
    }
}
