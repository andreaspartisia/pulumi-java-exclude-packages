// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteRetryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteRetryPolicyArgs Empty = new RouteSpecGrpcRouteRetryPolicyArgs();

    /**
     * List of gRPC retry events.
     * Valid values: `cancelled`, `deadline-exceeded`, `internal`, `resource-exhausted`, `unavailable`.
     * 
     */
    @InputImport(name="grpcRetryEvents")
      private final @Nullable Input<List<String>> grpcRetryEvents;

    public Input<List<String>> getGrpcRetryEvents() {
        return this.grpcRetryEvents == null ? Input.empty() : this.grpcRetryEvents;
    }

    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    @InputImport(name="httpRetryEvents")
      private final @Nullable Input<List<String>> httpRetryEvents;

    public Input<List<String>> getHttpRetryEvents() {
        return this.httpRetryEvents == null ? Input.empty() : this.httpRetryEvents;
    }

    /**
     * The maximum number of retries.
     * 
     */
    @InputImport(name="maxRetries", required=true)
      private final Input<Integer> maxRetries;

    public Input<Integer> getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * The per-retry timeout.
     * 
     */
    @InputImport(name="perRetryTimeout", required=true)
      private final Input<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout;

    public Input<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> getPerRetryTimeout() {
        return this.perRetryTimeout;
    }

    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    @InputImport(name="tcpRetryEvents")
      private final @Nullable Input<List<String>> tcpRetryEvents;

    public Input<List<String>> getTcpRetryEvents() {
        return this.tcpRetryEvents == null ? Input.empty() : this.tcpRetryEvents;
    }

    public RouteSpecGrpcRouteRetryPolicyArgs(
        @Nullable Input<List<String>> grpcRetryEvents,
        @Nullable Input<List<String>> httpRetryEvents,
        Input<Integer> maxRetries,
        Input<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout,
        @Nullable Input<List<String>> tcpRetryEvents) {
        this.grpcRetryEvents = grpcRetryEvents;
        this.httpRetryEvents = httpRetryEvents;
        this.maxRetries = Objects.requireNonNull(maxRetries, "expected parameter 'maxRetries' to be non-null");
        this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout, "expected parameter 'perRetryTimeout' to be non-null");
        this.tcpRetryEvents = tcpRetryEvents;
    }

    private RouteSpecGrpcRouteRetryPolicyArgs() {
        this.grpcRetryEvents = Input.empty();
        this.httpRetryEvents = Input.empty();
        this.maxRetries = Input.empty();
        this.perRetryTimeout = Input.empty();
        this.tcpRetryEvents = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> grpcRetryEvents;
        private @Nullable Input<List<String>> httpRetryEvents;
        private Input<Integer> maxRetries;
        private Input<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout;
        private @Nullable Input<List<String>> tcpRetryEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteRetryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcRetryEvents = defaults.grpcRetryEvents;
    	      this.httpRetryEvents = defaults.httpRetryEvents;
    	      this.maxRetries = defaults.maxRetries;
    	      this.perRetryTimeout = defaults.perRetryTimeout;
    	      this.tcpRetryEvents = defaults.tcpRetryEvents;
        }

        public Builder setGrpcRetryEvents(@Nullable Input<List<String>> grpcRetryEvents) {
            this.grpcRetryEvents = grpcRetryEvents;
            return this;
        }

        public Builder setGrpcRetryEvents(@Nullable List<String> grpcRetryEvents) {
            this.grpcRetryEvents = Input.ofNullable(grpcRetryEvents);
            return this;
        }

        public Builder setHttpRetryEvents(@Nullable Input<List<String>> httpRetryEvents) {
            this.httpRetryEvents = httpRetryEvents;
            return this;
        }

        public Builder setHttpRetryEvents(@Nullable List<String> httpRetryEvents) {
            this.httpRetryEvents = Input.ofNullable(httpRetryEvents);
            return this;
        }

        public Builder setMaxRetries(Input<Integer> maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }

        public Builder setMaxRetries(Integer maxRetries) {
            this.maxRetries = Input.of(Objects.requireNonNull(maxRetries));
            return this;
        }

        public Builder setPerRetryTimeout(Input<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout) {
            this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout);
            return this;
        }

        public Builder setPerRetryTimeout(RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs perRetryTimeout) {
            this.perRetryTimeout = Input.of(Objects.requireNonNull(perRetryTimeout));
            return this;
        }

        public Builder setTcpRetryEvents(@Nullable Input<List<String>> tcpRetryEvents) {
            this.tcpRetryEvents = tcpRetryEvents;
            return this;
        }

        public Builder setTcpRetryEvents(@Nullable List<String> tcpRetryEvents) {
            this.tcpRetryEvents = Input.ofNullable(tcpRetryEvents);
            return this;
        }
        public RouteSpecGrpcRouteRetryPolicyArgs build() {
            return new RouteSpecGrpcRouteRetryPolicyArgs(grpcRetryEvents, httpRetryEvents, maxRetries, perRetryTimeout, tcpRetryEvents);
        }
    }
}