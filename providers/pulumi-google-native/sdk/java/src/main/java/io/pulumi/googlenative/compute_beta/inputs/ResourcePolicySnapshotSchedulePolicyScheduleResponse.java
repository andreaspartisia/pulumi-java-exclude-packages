// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyDailyCycleResponse;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyHourlyCycleResponse;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyWeeklyCycleResponse;
import java.util.Objects;


/**
 * A schedule for disks where the schedueled operations are performed.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleResponse Empty = new ResourcePolicySnapshotSchedulePolicyScheduleResponse();

    @Import(name="dailySchedule", required=true)
      private final ResourcePolicyDailyCycleResponse dailySchedule;

    public ResourcePolicyDailyCycleResponse dailySchedule() {
        return this.dailySchedule;
    }

    @Import(name="hourlySchedule", required=true)
      private final ResourcePolicyHourlyCycleResponse hourlySchedule;

    public ResourcePolicyHourlyCycleResponse hourlySchedule() {
        return this.hourlySchedule;
    }

    @Import(name="weeklySchedule", required=true)
      private final ResourcePolicyWeeklyCycleResponse weeklySchedule;

    public ResourcePolicyWeeklyCycleResponse weeklySchedule() {
        return this.weeklySchedule;
    }

    public ResourcePolicySnapshotSchedulePolicyScheduleResponse(
        ResourcePolicyDailyCycleResponse dailySchedule,
        ResourcePolicyHourlyCycleResponse hourlySchedule,
        ResourcePolicyWeeklyCycleResponse weeklySchedule) {
        this.dailySchedule = Objects.requireNonNull(dailySchedule, "expected parameter 'dailySchedule' to be non-null");
        this.hourlySchedule = Objects.requireNonNull(hourlySchedule, "expected parameter 'hourlySchedule' to be non-null");
        this.weeklySchedule = Objects.requireNonNull(weeklySchedule, "expected parameter 'weeklySchedule' to be non-null");
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleResponse() {
        this.dailySchedule = null;
        this.hourlySchedule = null;
        this.weeklySchedule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyDailyCycleResponse dailySchedule;
        private ResourcePolicyHourlyCycleResponse hourlySchedule;
        private ResourcePolicyWeeklyCycleResponse weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder dailySchedule(ResourcePolicyDailyCycleResponse dailySchedule) {
            this.dailySchedule = Objects.requireNonNull(dailySchedule);
            return this;
        }
        public Builder hourlySchedule(ResourcePolicyHourlyCycleResponse hourlySchedule) {
            this.hourlySchedule = Objects.requireNonNull(hourlySchedule);
            return this;
        }
        public Builder weeklySchedule(ResourcePolicyWeeklyCycleResponse weeklySchedule) {
            this.weeklySchedule = Objects.requireNonNull(weeklySchedule);
            return this;
        }        public ResourcePolicySnapshotSchedulePolicyScheduleResponse build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleResponse(dailySchedule, hourlySchedule, weeklySchedule);
        }
    }
}
