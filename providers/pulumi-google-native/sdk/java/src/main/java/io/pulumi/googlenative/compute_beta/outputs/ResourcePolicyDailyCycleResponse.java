// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePolicyDailyCycleResponse {
    /**
     * Defines a schedule with units measured in months. The value determines how many months pass between the start of each cycle.
     * 
     */
    private final Integer daysInCycle;
    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
     */
    private final String duration;
    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private ResourcePolicyDailyCycleResponse(
        @CustomType.Parameter("daysInCycle") Integer daysInCycle,
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("startTime") String startTime) {
        this.daysInCycle = daysInCycle;
        this.duration = duration;
        this.startTime = startTime;
    }

    /**
     * Defines a schedule with units measured in months. The value determines how many months pass between the start of each cycle.
     * 
    */
    public Integer daysInCycle() {
        return this.daysInCycle;
    }
    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
    */
    public String duration() {
        return this.duration;
    }
    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
    */
    public String startTime() {
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

        public Builder daysInCycle(Integer daysInCycle) {
            this.daysInCycle = Objects.requireNonNull(daysInCycle);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public ResourcePolicyDailyCycleResponse build() {
            return new ResourcePolicyDailyCycleResponse(daysInCycle, duration, startTime);
        }
    }
}
