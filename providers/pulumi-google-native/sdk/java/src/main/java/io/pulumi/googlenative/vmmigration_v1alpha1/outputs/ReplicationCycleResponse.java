// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.CycleStepResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReplicationCycleResponse {
    /**
     * The time the replication cycle has ended.
     * 
     */
    private final String endTime;
    /**
     * The current progress in percentage of this cycle.
     * 
     */
    private final Integer progress;
    /**
     * The current progress in percentage of this cycle.
     * 
     */
    private final Integer progressPercent;
    /**
     * The time the replication cycle has started.
     * 
     */
    private final String startTime;
    /**
     * The cycle's steps list reflecting its progress.
     * 
     */
    private final List<CycleStepResponse> steps;
    /**
     * The accumulated duration the replication cycle was paused.
     * 
     */
    private final String totalPauseDuration;

    @CustomType.Constructor
    private ReplicationCycleResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("progress") Integer progress,
        @CustomType.Parameter("progressPercent") Integer progressPercent,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("steps") List<CycleStepResponse> steps,
        @CustomType.Parameter("totalPauseDuration") String totalPauseDuration) {
        this.endTime = endTime;
        this.progress = progress;
        this.progressPercent = progressPercent;
        this.startTime = startTime;
        this.steps = steps;
        this.totalPauseDuration = totalPauseDuration;
    }

    /**
     * The time the replication cycle has ended.
     * 
    */
    public String endTime() {
        return this.endTime;
    }
    /**
     * The current progress in percentage of this cycle.
     * 
    */
    public Integer progress() {
        return this.progress;
    }
    /**
     * The current progress in percentage of this cycle.
     * 
    */
    public Integer progressPercent() {
        return this.progressPercent;
    }
    /**
     * The time the replication cycle has started.
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * The cycle's steps list reflecting its progress.
     * 
    */
    public List<CycleStepResponse> steps() {
        return this.steps;
    }
    /**
     * The accumulated duration the replication cycle was paused.
     * 
    */
    public String totalPauseDuration() {
        return this.totalPauseDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private Integer progress;
        private Integer progressPercent;
        private String startTime;
        private List<CycleStepResponse> steps;
        private String totalPauseDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.progress = defaults.progress;
    	      this.progressPercent = defaults.progressPercent;
    	      this.startTime = defaults.startTime;
    	      this.steps = defaults.steps;
    	      this.totalPauseDuration = defaults.totalPauseDuration;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }
        public Builder progressPercent(Integer progressPercent) {
            this.progressPercent = Objects.requireNonNull(progressPercent);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder steps(List<CycleStepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(CycleStepResponse... steps) {
            return steps(List.of(steps));
        }
        public Builder totalPauseDuration(String totalPauseDuration) {
            this.totalPauseDuration = Objects.requireNonNull(totalPauseDuration);
            return this;
        }        public ReplicationCycleResponse build() {
            return new ReplicationCycleResponse(endTime, progress, progressPercent, startTime, steps, totalPauseDuration);
        }
    }
}
