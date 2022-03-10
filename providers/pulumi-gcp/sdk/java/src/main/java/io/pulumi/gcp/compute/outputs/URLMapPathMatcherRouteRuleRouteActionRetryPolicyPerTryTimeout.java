// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout {
    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are
     * represented with a 0 seconds field and a positive nanos field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    private final @Nullable Integer nanos;
    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive.
     * Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
     */
    private final String seconds;

    @OutputCustomType.Constructor
    private URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout(
        @OutputCustomType.Parameter("nanos") @Nullable Integer nanos,
        @OutputCustomType.Parameter("seconds") String seconds) {
        this.nanos = nanos;
        this.seconds = seconds;
    }

    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are
     * represented with a 0 seconds field and a positive nanos field. Must be from 0 to 999,999,999 inclusive.
     * 
    */
    public Optional<Integer> getNanos() {
        return Optional.ofNullable(this.nanos);
    }
    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive.
     * Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
    */
    public String getSeconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer nanos;
        private String seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setNanos(@Nullable Integer nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder setSeconds(String seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }
        public URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout build() {
            return new URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout(nanos, seconds);
        }
    }
}
