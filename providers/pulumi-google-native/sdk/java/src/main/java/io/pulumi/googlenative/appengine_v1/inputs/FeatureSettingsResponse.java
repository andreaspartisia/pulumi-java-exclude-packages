// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The feature specific settings to be used in the application. These define behaviors that are user configurable.
 * 
 */
public final class FeatureSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final FeatureSettingsResponse Empty = new FeatureSettingsResponse();

    /**
     * Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to 'readiness_check' and 'liveness_check' values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated, and this value is always true, this setting can be removed.
     * 
     */
    @Import(name="splitHealthChecks", required=true)
      private final Boolean splitHealthChecks;

    public Boolean splitHealthChecks() {
        return this.splitHealthChecks;
    }

    /**
     * If true, use Container-Optimized OS (https://cloud.google.com/container-optimized-os/) base image for VMs, rather than a base Debian image.
     * 
     */
    @Import(name="useContainerOptimizedOs", required=true)
      private final Boolean useContainerOptimizedOs;

    public Boolean useContainerOptimizedOs() {
        return this.useContainerOptimizedOs;
    }

    public FeatureSettingsResponse(
        Boolean splitHealthChecks,
        Boolean useContainerOptimizedOs) {
        this.splitHealthChecks = Objects.requireNonNull(splitHealthChecks, "expected parameter 'splitHealthChecks' to be non-null");
        this.useContainerOptimizedOs = Objects.requireNonNull(useContainerOptimizedOs, "expected parameter 'useContainerOptimizedOs' to be non-null");
    }

    private FeatureSettingsResponse() {
        this.splitHealthChecks = null;
        this.useContainerOptimizedOs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean splitHealthChecks;
        private Boolean useContainerOptimizedOs;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.splitHealthChecks = defaults.splitHealthChecks;
    	      this.useContainerOptimizedOs = defaults.useContainerOptimizedOs;
        }

        public Builder splitHealthChecks(Boolean splitHealthChecks) {
            this.splitHealthChecks = Objects.requireNonNull(splitHealthChecks);
            return this;
        }
        public Builder useContainerOptimizedOs(Boolean useContainerOptimizedOs) {
            this.useContainerOptimizedOs = Objects.requireNonNull(useContainerOptimizedOs);
            return this;
        }        public FeatureSettingsResponse build() {
            return new FeatureSettingsResponse(splitHealthChecks, useContainerOptimizedOs);
        }
    }
}
