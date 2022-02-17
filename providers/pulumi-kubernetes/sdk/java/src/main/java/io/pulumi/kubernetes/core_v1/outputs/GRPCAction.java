// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GRPCAction {
    /**
     * Port number of the gRPC service. Number must be in the range 1 to 65535.
     * 
     */
    private final Integer port;
    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    private final @Nullable String service;

    @OutputCustomType.Constructor({"port","service"})
    private GRPCAction(
        Integer port,
        @Nullable String service) {
        this.port = Objects.requireNonNull(port);
        this.service = service;
    }

    /**
     * Port number of the gRPC service. Number must be in the range 1 to 65535.
     * 
     */
    public Integer getPort() {
        return this.port;
    }
    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    public Optional<String> getService() {
        return Optional.ofNullable(this.service);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GRPCAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private @Nullable String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GRPCAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.service = defaults.service;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = service;
            return this;
        }

        public GRPCAction build() {
            return new GRPCAction(port, service);
        }
    }
}