// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicyDailyCycleResponse {
    private final Integer daysInCycle;
    private final String duration;
    private final String startTime;

    @OutputCustomType.Constructor({"daysInCycle","duration","startTime"})
    private ResourcePolicyDailyCycleResponse(
        Integer daysInCycle,
        String duration,
        String startTime) {
        this.daysInCycle = Objects.requireNonNull(daysInCycle);
        this.duration = Objects.requireNonNull(duration);
        this.startTime = Objects.requireNonNull(startTime);
    }

    public Integer getDaysInCycle() {
        return this.daysInCycle;
    }
    public String getDuration() {
        return this.duration;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyDailyCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer daysInCycle;
        private String duration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyDailyCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysInCycle = defaults.daysInCycle;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDaysInCycle(Integer daysInCycle) {
            this.daysInCycle = Objects.requireNonNull(daysInCycle);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public ResourcePolicyDailyCycleResponse build() {
            return new ResourcePolicyDailyCycleResponse(daysInCycle, duration, startTime);
        }
    }
}