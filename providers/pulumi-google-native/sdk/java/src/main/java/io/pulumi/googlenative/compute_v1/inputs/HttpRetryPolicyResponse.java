// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.DurationResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class HttpRetryPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpRetryPolicyResponse Empty = new HttpRetryPolicyResponse();

    @InputImport(name="numRetries", required=true)
    private final Integer numRetries;

    public Integer getNumRetries() {
        return this.numRetries;
    }

    @InputImport(name="perTryTimeout", required=true)
    private final DurationResponse perTryTimeout;

    public DurationResponse getPerTryTimeout() {
        return this.perTryTimeout;
    }

    @InputImport(name="retryConditions", required=true)
    private final List<String> retryConditions;

    public List<String> getRetryConditions() {
        return this.retryConditions;
    }

    public HttpRetryPolicyResponse(
        Integer numRetries,
        DurationResponse perTryTimeout,
        List<String> retryConditions) {
        this.numRetries = Objects.requireNonNull(numRetries, "expected parameter 'numRetries' to be non-null");
        this.perTryTimeout = Objects.requireNonNull(perTryTimeout, "expected parameter 'perTryTimeout' to be non-null");
        this.retryConditions = Objects.requireNonNull(retryConditions, "expected parameter 'retryConditions' to be non-null");
    }

    private HttpRetryPolicyResponse() {
        this.numRetries = null;
        this.perTryTimeout = null;
        this.retryConditions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numRetries;
        private DurationResponse perTryTimeout;
        private List<String> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder setNumRetries(Integer numRetries) {
            this.numRetries = Objects.requireNonNull(numRetries);
            return this;
        }

        public Builder setPerTryTimeout(DurationResponse perTryTimeout) {
            this.perTryTimeout = Objects.requireNonNull(perTryTimeout);
            return this;
        }

        public Builder setRetryConditions(List<String> retryConditions) {
            this.retryConditions = Objects.requireNonNull(retryConditions);
            return this;
        }

        public HttpRetryPolicyResponse build() {
            return new HttpRetryPolicyResponse(numRetries, perTryTimeout, retryConditions);
        }
    }
}