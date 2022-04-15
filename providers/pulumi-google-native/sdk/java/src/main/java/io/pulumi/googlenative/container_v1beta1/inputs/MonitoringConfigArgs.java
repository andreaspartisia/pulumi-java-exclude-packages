// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.container_v1beta1.inputs.ManagedPrometheusConfigArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.MonitoringComponentConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MonitoringConfig is cluster monitoring configuration.
 * 
 */
public final class MonitoringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringConfigArgs Empty = new MonitoringConfigArgs();

    /**
     * Monitoring components configuration
     * 
     */
    @Import(name="componentConfig")
      private final @Nullable Output<MonitoringComponentConfigArgs> componentConfig;

    public Output<MonitoringComponentConfigArgs> componentConfig() {
        return this.componentConfig == null ? Codegen.empty() : this.componentConfig;
    }

    /**
     * Enable Google Cloud Managed Service for Prometheus in the cluster.
     * 
     */
    @Import(name="managedPrometheusConfig")
      private final @Nullable Output<ManagedPrometheusConfigArgs> managedPrometheusConfig;

    public Output<ManagedPrometheusConfigArgs> managedPrometheusConfig() {
        return this.managedPrometheusConfig == null ? Codegen.empty() : this.managedPrometheusConfig;
    }

    public MonitoringConfigArgs(
        @Nullable Output<MonitoringComponentConfigArgs> componentConfig,
        @Nullable Output<ManagedPrometheusConfigArgs> managedPrometheusConfig) {
        this.componentConfig = componentConfig;
        this.managedPrometheusConfig = managedPrometheusConfig;
    }

    private MonitoringConfigArgs() {
        this.componentConfig = Codegen.empty();
        this.managedPrometheusConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MonitoringComponentConfigArgs> componentConfig;
        private @Nullable Output<ManagedPrometheusConfigArgs> managedPrometheusConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentConfig = defaults.componentConfig;
    	      this.managedPrometheusConfig = defaults.managedPrometheusConfig;
        }

        public Builder componentConfig(@Nullable Output<MonitoringComponentConfigArgs> componentConfig) {
            this.componentConfig = componentConfig;
            return this;
        }
        public Builder componentConfig(@Nullable MonitoringComponentConfigArgs componentConfig) {
            this.componentConfig = Codegen.ofNullable(componentConfig);
            return this;
        }
        public Builder managedPrometheusConfig(@Nullable Output<ManagedPrometheusConfigArgs> managedPrometheusConfig) {
            this.managedPrometheusConfig = managedPrometheusConfig;
            return this;
        }
        public Builder managedPrometheusConfig(@Nullable ManagedPrometheusConfigArgs managedPrometheusConfig) {
            this.managedPrometheusConfig = Codegen.ofNullable(managedPrometheusConfig);
            return this;
        }        public MonitoringConfigArgs build() {
            return new MonitoringConfigArgs(componentConfig, managedPrometheusConfig);
        }
    }
}
