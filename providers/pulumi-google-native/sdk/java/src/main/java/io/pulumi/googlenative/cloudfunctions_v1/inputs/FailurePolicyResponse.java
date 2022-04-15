// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.RetryResponse;
import java.util.Objects;


/**
 * Describes the policy in case of function's execution failure. If empty, then defaults to ignoring failures (i.e. not retrying them).
 * 
 */
public final class FailurePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final FailurePolicyResponse Empty = new FailurePolicyResponse();

    /**
     * If specified, then the function will be retried in case of a failure.
     * 
     */
    @Import(name="retry", required=true)
      private final RetryResponse retry;

    public RetryResponse retry() {
        return this.retry;
    }

    public FailurePolicyResponse(RetryResponse retry) {
        this.retry = Objects.requireNonNull(retry, "expected parameter 'retry' to be non-null");
    }

    private FailurePolicyResponse() {
        this.retry = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailurePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetryResponse retry;

        public Builder() {
    	      // Empty
        }

        public Builder(FailurePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
        }

        public Builder retry(RetryResponse retry) {
            this.retry = Objects.requireNonNull(retry);
            return this;
        }        public FailurePolicyResponse build() {
            return new FailurePolicyResponse(retry);
        }
    }
}
