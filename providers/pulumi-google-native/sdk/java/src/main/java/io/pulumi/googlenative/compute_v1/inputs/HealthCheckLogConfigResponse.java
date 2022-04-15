// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration of logging on a health check. If logging is enabled, logs will be exported to Stackdriver.
 * 
 */
public final class HealthCheckLogConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final HealthCheckLogConfigResponse Empty = new HealthCheckLogConfigResponse();

    /**
     * Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
     * 
     */
    @Import(name="enable", required=true)
      private final Boolean enable;

    public Boolean enable() {
        return this.enable;
    }

    public HealthCheckLogConfigResponse(Boolean enable) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
    }

    private HealthCheckLogConfigResponse() {
        this.enable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }        public HealthCheckLogConfigResponse build() {
            return new HealthCheckLogConfigResponse(enable);
        }
    }
}
