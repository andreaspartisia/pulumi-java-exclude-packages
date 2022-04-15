// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances. Only applicable for instances in App Engine flexible environment.
 * 
 */
public final class HealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckArgs Empty = new HealthCheckArgs();

    /**
     * Interval between health checks.
     * 
     */
    @Import(name="checkInterval")
      private final @Nullable Output<String> checkInterval;

    public Output<String> checkInterval() {
        return this.checkInterval == null ? Codegen.empty() : this.checkInterval;
    }

    /**
     * Whether to explicitly disable health checks for this instance.
     * 
     */
    @Import(name="disableHealthCheck")
      private final @Nullable Output<Boolean> disableHealthCheck;

    public Output<Boolean> disableHealthCheck() {
        return this.disableHealthCheck == null ? Codegen.empty() : this.disableHealthCheck;
    }

    /**
     * Number of consecutive successful health checks required before receiving traffic.
     * 
     */
    @Import(name="healthyThreshold")
      private final @Nullable Output<Integer> healthyThreshold;

    public Output<Integer> healthyThreshold() {
        return this.healthyThreshold == null ? Codegen.empty() : this.healthyThreshold;
    }

    /**
     * Host header to send when performing an HTTP health check. Example: "myapp.appspot.com"
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> host() {
        return this.host == null ? Codegen.empty() : this.host;
    }

    /**
     * Number of consecutive failed health checks required before an instance is restarted.
     * 
     */
    @Import(name="restartThreshold")
      private final @Nullable Output<Integer> restartThreshold;

    public Output<Integer> restartThreshold() {
        return this.restartThreshold == null ? Codegen.empty() : this.restartThreshold;
    }

    /**
     * Time before the health check is considered failed.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * Number of consecutive failed health checks required before removing traffic.
     * 
     */
    @Import(name="unhealthyThreshold")
      private final @Nullable Output<Integer> unhealthyThreshold;

    public Output<Integer> unhealthyThreshold() {
        return this.unhealthyThreshold == null ? Codegen.empty() : this.unhealthyThreshold;
    }

    public HealthCheckArgs(
        @Nullable Output<String> checkInterval,
        @Nullable Output<Boolean> disableHealthCheck,
        @Nullable Output<Integer> healthyThreshold,
        @Nullable Output<String> host,
        @Nullable Output<Integer> restartThreshold,
        @Nullable Output<String> timeout,
        @Nullable Output<Integer> unhealthyThreshold) {
        this.checkInterval = checkInterval;
        this.disableHealthCheck = disableHealthCheck;
        this.healthyThreshold = healthyThreshold;
        this.host = host;
        this.restartThreshold = restartThreshold;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private HealthCheckArgs() {
        this.checkInterval = Codegen.empty();
        this.disableHealthCheck = Codegen.empty();
        this.healthyThreshold = Codegen.empty();
        this.host = Codegen.empty();
        this.restartThreshold = Codegen.empty();
        this.timeout = Codegen.empty();
        this.unhealthyThreshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> checkInterval;
        private @Nullable Output<Boolean> disableHealthCheck;
        private @Nullable Output<Integer> healthyThreshold;
        private @Nullable Output<String> host;
        private @Nullable Output<Integer> restartThreshold;
        private @Nullable Output<String> timeout;
        private @Nullable Output<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.disableHealthCheck = defaults.disableHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.host = defaults.host;
    	      this.restartThreshold = defaults.restartThreshold;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder checkInterval(@Nullable Output<String> checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }
        public Builder checkInterval(@Nullable String checkInterval) {
            this.checkInterval = Codegen.ofNullable(checkInterval);
            return this;
        }
        public Builder disableHealthCheck(@Nullable Output<Boolean> disableHealthCheck) {
            this.disableHealthCheck = disableHealthCheck;
            return this;
        }
        public Builder disableHealthCheck(@Nullable Boolean disableHealthCheck) {
            this.disableHealthCheck = Codegen.ofNullable(disableHealthCheck);
            return this;
        }
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Codegen.ofNullable(healthyThreshold);
            return this;
        }
        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Codegen.ofNullable(host);
            return this;
        }
        public Builder restartThreshold(@Nullable Output<Integer> restartThreshold) {
            this.restartThreshold = restartThreshold;
            return this;
        }
        public Builder restartThreshold(@Nullable Integer restartThreshold) {
            this.restartThreshold = Codegen.ofNullable(restartThreshold);
            return this;
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Codegen.ofNullable(unhealthyThreshold);
            return this;
        }        public HealthCheckArgs build() {
            return new HealthCheckArgs(checkInterval, disableHealthCheck, healthyThreshold, host, restartThreshold, timeout, unhealthyThreshold);
        }
    }
}
