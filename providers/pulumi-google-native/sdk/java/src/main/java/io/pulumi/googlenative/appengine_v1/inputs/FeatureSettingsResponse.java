// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class FeatureSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final FeatureSettingsResponse Empty = new FeatureSettingsResponse();

    @InputImport(name="splitHealthChecks", required=true)
    private final Boolean splitHealthChecks;

    public Boolean getSplitHealthChecks() {
        return this.splitHealthChecks;
    }

    @InputImport(name="useContainerOptimizedOs", required=true)
    private final Boolean useContainerOptimizedOs;

    public Boolean getUseContainerOptimizedOs() {
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

        public Builder setSplitHealthChecks(Boolean splitHealthChecks) {
            this.splitHealthChecks = Objects.requireNonNull(splitHealthChecks);
            return this;
        }

        public Builder setUseContainerOptimizedOs(Boolean useContainerOptimizedOs) {
            this.useContainerOptimizedOs = Objects.requireNonNull(useContainerOptimizedOs);
            return this;
        }

        public FeatureSettingsResponse build() {
            return new FeatureSettingsResponse(splitHealthChecks, useContainerOptimizedOs);
        }
    }
}