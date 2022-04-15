// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse {
    /**
     * The last time the schedule successfully ran. The timestamp is an RFC3339 string.
     * 
     */
    private final String lastRunStartTime;
    /**
     * The next time the schedule is planned to run. The actual time might be slightly different. The timestamp is an RFC3339 string.
     * 
     */
    private final String nextRunStartTime;

    @CustomType.Constructor
    private ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse(
        @CustomType.Parameter("lastRunStartTime") String lastRunStartTime,
        @CustomType.Parameter("nextRunStartTime") String nextRunStartTime) {
        this.lastRunStartTime = lastRunStartTime;
        this.nextRunStartTime = nextRunStartTime;
    }

    /**
     * The last time the schedule successfully ran. The timestamp is an RFC3339 string.
     * 
    */
    public String lastRunStartTime() {
        return this.lastRunStartTime;
    }
    /**
     * The next time the schedule is planned to run. The actual time might be slightly different. The timestamp is an RFC3339 string.
     * 
    */
    public String nextRunStartTime() {
        return this.nextRunStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastRunStartTime;
        private String nextRunStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastRunStartTime = defaults.lastRunStartTime;
    	      this.nextRunStartTime = defaults.nextRunStartTime;
        }

        public Builder lastRunStartTime(String lastRunStartTime) {
            this.lastRunStartTime = Objects.requireNonNull(lastRunStartTime);
            return this;
        }
        public Builder nextRunStartTime(String nextRunStartTime) {
            this.nextRunStartTime = Objects.requireNonNull(nextRunStartTime);
            return this;
        }        public ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse build() {
            return new ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse(lastRunStartTime, nextRunStartTime);
        }
    }
}
