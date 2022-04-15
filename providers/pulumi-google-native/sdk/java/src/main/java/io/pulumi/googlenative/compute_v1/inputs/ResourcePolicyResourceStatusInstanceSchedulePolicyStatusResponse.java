// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse Empty = new ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse();

    /**
     * The last time the schedule successfully ran. The timestamp is an RFC3339 string.
     * 
     */
    @Import(name="lastRunStartTime", required=true)
      private final String lastRunStartTime;

    public String lastRunStartTime() {
        return this.lastRunStartTime;
    }

    /**
     * The next time the schedule is planned to run. The actual time might be slightly different. The timestamp is an RFC3339 string.
     * 
     */
    @Import(name="nextRunStartTime", required=true)
      private final String nextRunStartTime;

    public String nextRunStartTime() {
        return this.nextRunStartTime;
    }

    public ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse(
        String lastRunStartTime,
        String nextRunStartTime) {
        this.lastRunStartTime = Objects.requireNonNull(lastRunStartTime, "expected parameter 'lastRunStartTime' to be non-null");
        this.nextRunStartTime = Objects.requireNonNull(nextRunStartTime, "expected parameter 'nextRunStartTime' to be non-null");
    }

    private ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse() {
        this.lastRunStartTime = null;
        this.nextRunStartTime = null;
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
