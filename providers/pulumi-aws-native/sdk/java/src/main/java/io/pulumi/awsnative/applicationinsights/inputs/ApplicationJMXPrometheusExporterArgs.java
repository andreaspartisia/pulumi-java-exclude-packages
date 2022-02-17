// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The JMX Prometheus Exporter settings.
 * 
 */
public final class ApplicationJMXPrometheusExporterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationJMXPrometheusExporterArgs Empty = new ApplicationJMXPrometheusExporterArgs();

    /**
     * Java agent host port
     * 
     */
    @InputImport(name="hostPort")
    private final @Nullable Input<String> hostPort;

    public Input<String> getHostPort() {
        return this.hostPort == null ? Input.empty() : this.hostPort;
    }

    /**
     * JMX service URL.
     * 
     */
    @InputImport(name="jMXURL")
    private final @Nullable Input<String> jMXURL;

    public Input<String> getJMXURL() {
        return this.jMXURL == null ? Input.empty() : this.jMXURL;
    }

    /**
     * Prometheus exporter port.
     * 
     */
    @InputImport(name="prometheusPort")
    private final @Nullable Input<String> prometheusPort;

    public Input<String> getPrometheusPort() {
        return this.prometheusPort == null ? Input.empty() : this.prometheusPort;
    }

    public ApplicationJMXPrometheusExporterArgs(
        @Nullable Input<String> hostPort,
        @Nullable Input<String> jMXURL,
        @Nullable Input<String> prometheusPort) {
        this.hostPort = hostPort;
        this.jMXURL = jMXURL;
        this.prometheusPort = prometheusPort;
    }

    private ApplicationJMXPrometheusExporterArgs() {
        this.hostPort = Input.empty();
        this.jMXURL = Input.empty();
        this.prometheusPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationJMXPrometheusExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hostPort;
        private @Nullable Input<String> jMXURL;
        private @Nullable Input<String> prometheusPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationJMXPrometheusExporterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostPort = defaults.hostPort;
    	      this.jMXURL = defaults.jMXURL;
    	      this.prometheusPort = defaults.prometheusPort;
        }

        public Builder setHostPort(@Nullable Input<String> hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        public Builder setHostPort(@Nullable String hostPort) {
            this.hostPort = Input.ofNullable(hostPort);
            return this;
        }

        public Builder setJMXURL(@Nullable Input<String> jMXURL) {
            this.jMXURL = jMXURL;
            return this;
        }

        public Builder setJMXURL(@Nullable String jMXURL) {
            this.jMXURL = Input.ofNullable(jMXURL);
            return this;
        }

        public Builder setPrometheusPort(@Nullable Input<String> prometheusPort) {
            this.prometheusPort = prometheusPort;
            return this;
        }

        public Builder setPrometheusPort(@Nullable String prometheusPort) {
            this.prometheusPort = Input.ofNullable(prometheusPort);
            return this;
        }

        public ApplicationJMXPrometheusExporterArgs build() {
            return new ApplicationJMXPrometheusExporterArgs(hostPort, jMXURL, prometheusPort);
        }
    }
}