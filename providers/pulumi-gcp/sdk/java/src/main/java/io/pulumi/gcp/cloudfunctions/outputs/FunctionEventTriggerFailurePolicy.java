// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class FunctionEventTriggerFailurePolicy {
    /**
     * Whether the function should be retried on failure. Defaults to `false`.
     * 
     */
    private final Boolean retry;

    @OutputCustomType.Constructor
    private FunctionEventTriggerFailurePolicy(@OutputCustomType.Parameter("retry") Boolean retry) {
        this.retry = retry;
    }

    /**
     * Whether the function should be retried on failure. Defaults to `false`.
     * 
    */
    public Boolean getRetry() {
        return this.retry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventTriggerFailurePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean retry;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventTriggerFailurePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
        }

        public Builder setRetry(Boolean retry) {
            this.retry = Objects.requireNonNull(retry);
            return this;
        }
        public FunctionEventTriggerFailurePolicy build() {
            return new FunctionEventTriggerFailurePolicy(retry);
        }
    }
}
