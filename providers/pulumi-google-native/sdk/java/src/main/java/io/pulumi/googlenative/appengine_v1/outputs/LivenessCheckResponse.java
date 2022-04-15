// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LivenessCheckResponse {
    /**
     * Interval between health checks.
     * 
     */
    private final String checkInterval;
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy.
     * 
     */
    private final Integer failureThreshold;
    /**
     * Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com"
     * 
     */
    private final String host;
    /**
     * The initial delay before starting to execute the checks.
     * 
     */
    private final String initialDelay;
    /**
     * The request path.
     * 
     */
    private final String path;
    /**
     * Number of consecutive successful checks required before considering the VM healthy.
     * 
     */
    private final Integer successThreshold;
    /**
     * Time before the check is considered failed.
     * 
     */
    private final String timeout;

    @CustomType.Constructor
    private LivenessCheckResponse(
        @CustomType.Parameter("checkInterval") String checkInterval,
        @CustomType.Parameter("failureThreshold") Integer failureThreshold,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("initialDelay") String initialDelay,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("successThreshold") Integer successThreshold,
        @CustomType.Parameter("timeout") String timeout) {
        this.checkInterval = checkInterval;
        this.failureThreshold = failureThreshold;
        this.host = host;
        this.initialDelay = initialDelay;
        this.path = path;
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    /**
     * Interval between health checks.
     * 
    */
    public String checkInterval() {
        return this.checkInterval;
    }
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy.
     * 
    */
    public Integer failureThreshold() {
        return this.failureThreshold;
    }
    /**
     * Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com"
     * 
    */
    public String host() {
        return this.host;
    }
    /**
     * The initial delay before starting to execute the checks.
     * 
    */
    public String initialDelay() {
        return this.initialDelay;
    }
    /**
     * The request path.
     * 
    */
    public String path() {
        return this.path;
    }
    /**
     * Number of consecutive successful checks required before considering the VM healthy.
     * 
    */
    public Integer successThreshold() {
        return this.successThreshold;
    }
    /**
     * Time before the check is considered failed.
     * 
    */
    public String timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LivenessCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checkInterval;
        private Integer failureThreshold;
        private String host;
        private String initialDelay;
        private String path;
        private Integer successThreshold;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(LivenessCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.initialDelay = defaults.initialDelay;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder checkInterval(String checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = Objects.requireNonNull(failureThreshold);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder initialDelay(String initialDelay) {
            this.initialDelay = Objects.requireNonNull(initialDelay);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder successThreshold(Integer successThreshold) {
            this.successThreshold = Objects.requireNonNull(successThreshold);
            return this;
        }
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }        public LivenessCheckResponse build() {
            return new LivenessCheckResponse(checkInterval, failureThreshold, host, initialDelay, path, successThreshold, timeout);
        }
    }
}
