// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeMetricArgs Empty = new RuntimeMetricArgs();

    @InputImport(name="systemMetrics")
    private final @Nullable Input<Map<String,String>> systemMetrics;

    public Input<Map<String,String>> getSystemMetrics() {
        return this.systemMetrics == null ? Input.empty() : this.systemMetrics;
    }

    public RuntimeMetricArgs(@Nullable Input<Map<String,String>> systemMetrics) {
        this.systemMetrics = systemMetrics;
    }

    private RuntimeMetricArgs() {
        this.systemMetrics = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> systemMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.systemMetrics = defaults.systemMetrics;
        }

        public Builder setSystemMetrics(@Nullable Input<Map<String,String>> systemMetrics) {
            this.systemMetrics = systemMetrics;
            return this;
        }

        public Builder setSystemMetrics(@Nullable Map<String,String> systemMetrics) {
            this.systemMetrics = Input.ofNullable(systemMetrics);
            return this;
        }

        public RuntimeMetricArgs build() {
            return new RuntimeMetricArgs(systemMetrics);
        }
    }
}