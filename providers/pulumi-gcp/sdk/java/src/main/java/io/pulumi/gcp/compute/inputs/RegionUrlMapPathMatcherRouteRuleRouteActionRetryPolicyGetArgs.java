// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs();

    /**
     * Specifies the allowed number retries. This number must be > 0.
     * 
     */
    @InputImport(name="numRetries", required=true)
    private final Input<Integer> numRetries;

    public Input<Integer> getNumRetries() {
        return this.numRetries;
    }

    /**
     * Specifies a non-zero timeout per retry attempt.
     * Structure is documented below.
     * 
     */
    @InputImport(name="perTryTimeout")
    private final @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout;

    public Input<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> getPerTryTimeout() {
        return this.perTryTimeout == null ? Input.empty() : this.perTryTimeout;
    }

    /**
     * Specifies one or more conditions when this retry rule applies. Valid values are:
     * - 5xx: Loadbalancer will attempt a retry if the backend service responds with
     *   any 5xx response code, or if the backend service does not respond at all,
     *   example: disconnects, reset, read timeout, connection failure, and refused
     *   streams.
     * - gateway-error: Similar to 5xx, but only applies to response codes
     *   502, 503 or 504.
     * - connect-failure: Loadbalancer will retry on failures
     *   connecting to backend services, for example due to connection timeouts.
     * - retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
     *   Currently the only retriable error supported is 409.
     * - refused-stream: Loadbalancer will retry if the backend service resets the stream with a
     *   REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
     * - cancelled: Loadbalancer will retry if the gRPC status code in the response
     *   header is set to cancelled
     * - deadline-exceeded: Loadbalancer will retry if the
     *   gRPC status code in the response header is set to deadline-exceeded
     * - resource-exhausted: Loadbalancer will retry if the gRPC status code in the response
     *   header is set to resource-exhausted
     * - unavailable: Loadbalancer will retry if
     *   the gRPC status code in the response header is set to unavailable
     * 
     */
    @InputImport(name="retryConditions")
    private final @Nullable Input<List<String>> retryConditions;

    public Input<List<String>> getRetryConditions() {
        return this.retryConditions == null ? Input.empty() : this.retryConditions;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs(
        Input<Integer> numRetries,
        @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout,
        @Nullable Input<List<String>> retryConditions) {
        this.numRetries = Objects.requireNonNull(numRetries, "expected parameter 'numRetries' to be non-null");
        this.perTryTimeout = perTryTimeout;
        this.retryConditions = retryConditions;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs() {
        this.numRetries = Input.empty();
        this.perTryTimeout = Input.empty();
        this.retryConditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> numRetries;
        private @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout;
        private @Nullable Input<List<String>> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder setNumRetries(Input<Integer> numRetries) {
            this.numRetries = Objects.requireNonNull(numRetries);
            return this;
        }

        public Builder setNumRetries(Integer numRetries) {
            this.numRetries = Input.of(Objects.requireNonNull(numRetries));
            return this;
        }

        public Builder setPerTryTimeout(@Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }

        public Builder setPerTryTimeout(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutGetArgs perTryTimeout) {
            this.perTryTimeout = Input.ofNullable(perTryTimeout);
            return this;
        }

        public Builder setRetryConditions(@Nullable Input<List<String>> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }

        public Builder setRetryConditions(@Nullable List<String> retryConditions) {
            this.retryConditions = Input.ofNullable(retryConditions);
            return this;
        }

        public RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs(numRetries, perTryTimeout, retryConditions);
        }
    }
}