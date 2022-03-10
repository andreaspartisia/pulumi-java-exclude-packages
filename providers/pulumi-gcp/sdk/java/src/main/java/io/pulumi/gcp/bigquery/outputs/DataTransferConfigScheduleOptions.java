// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataTransferConfigScheduleOptions {
    /**
     * If true, automatic scheduling of data transfer runs for this
     * configuration will be disabled. The runs can be started on ad-hoc
     * basis using transferConfigs.startManualRuns API. When automatic
     * scheduling is disabled, the TransferConfig.schedule field will
     * be ignored.
     * 
     */
    private final @Nullable Boolean disableAutoScheduling;
    /**
     * Defines time to stop scheduling transfer runs. A transfer run cannot be
     * scheduled at or after the end time. The end time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    private final @Nullable String endTime;
    /**
     * Specifies time to start scheduling transfer runs. The first run will be
     * scheduled at or after the start time according to a recurrence pattern
     * defined in the schedule string. The start time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    private final @Nullable String startTime;

    @OutputCustomType.Constructor
    private DataTransferConfigScheduleOptions(
        @OutputCustomType.Parameter("disableAutoScheduling") @Nullable Boolean disableAutoScheduling,
        @OutputCustomType.Parameter("endTime") @Nullable String endTime,
        @OutputCustomType.Parameter("startTime") @Nullable String startTime) {
        this.disableAutoScheduling = disableAutoScheduling;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    /**
     * If true, automatic scheduling of data transfer runs for this
     * configuration will be disabled. The runs can be started on ad-hoc
     * basis using transferConfigs.startManualRuns API. When automatic
     * scheduling is disabled, the TransferConfig.schedule field will
     * be ignored.
     * 
    */
    public Optional<Boolean> getDisableAutoScheduling() {
        return Optional.ofNullable(this.disableAutoScheduling);
    }
    /**
     * Defines time to stop scheduling transfer runs. A transfer run cannot be
     * scheduled at or after the end time. The end time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
    */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Specifies time to start scheduling transfer runs. The first run will be
     * scheduled at or after the start time according to a recurrence pattern
     * defined in the schedule string. The start time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigScheduleOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableAutoScheduling;
        private @Nullable String endTime;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigScheduleOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableAutoScheduling = defaults.disableAutoScheduling;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDisableAutoScheduling(@Nullable Boolean disableAutoScheduling) {
            this.disableAutoScheduling = disableAutoScheduling;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public DataTransferConfigScheduleOptions build() {
            return new DataTransferConfigScheduleOptions(disableAutoScheduling, endTime, startTime);
        }
    }
}
