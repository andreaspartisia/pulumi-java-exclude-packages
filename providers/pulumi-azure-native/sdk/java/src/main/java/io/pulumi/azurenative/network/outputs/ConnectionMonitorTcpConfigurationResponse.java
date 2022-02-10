// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorTcpConfigurationResponse {
    private final @Nullable String destinationPortBehavior;
    private final @Nullable Boolean disableTraceRoute;
    private final @Nullable Integer port;

    @OutputCustomType.Constructor({"destinationPortBehavior","disableTraceRoute","port"})
    private ConnectionMonitorTcpConfigurationResponse(
        @Nullable String destinationPortBehavior,
        @Nullable Boolean disableTraceRoute,
        @Nullable Integer port) {
        this.destinationPortBehavior = destinationPortBehavior;
        this.disableTraceRoute = disableTraceRoute;
        this.port = port;
    }

    public Optional<String> getDestinationPortBehavior() {
        return Optional.ofNullable(this.destinationPortBehavior);
    }
    public Optional<Boolean> getDisableTraceRoute() {
        return Optional.ofNullable(this.disableTraceRoute);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorTcpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destinationPortBehavior;
        private @Nullable Boolean disableTraceRoute;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorTcpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPortBehavior = defaults.destinationPortBehavior;
    	      this.disableTraceRoute = defaults.disableTraceRoute;
    	      this.port = defaults.port;
        }

        public Builder setDestinationPortBehavior(@Nullable String destinationPortBehavior) {
            this.destinationPortBehavior = destinationPortBehavior;
            return this;
        }

        public Builder setDisableTraceRoute(@Nullable Boolean disableTraceRoute) {
            this.disableTraceRoute = disableTraceRoute;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public ConnectionMonitorTcpConfigurationResponse build() {
            return new ConnectionMonitorTcpConfigurationResponse(destinationPortBehavior, disableTraceRoute, port);
        }
    }
}