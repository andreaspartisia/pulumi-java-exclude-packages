// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutIdleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecTcpRouteTimeoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecTcpRouteTimeoutArgs Empty = new RouteSpecTcpRouteTimeoutArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @InputImport(name="idle")
      private final @Nullable Input<RouteSpecTcpRouteTimeoutIdleArgs> idle;

    public Input<RouteSpecTcpRouteTimeoutIdleArgs> getIdle() {
        return this.idle == null ? Input.empty() : this.idle;
    }

    public RouteSpecTcpRouteTimeoutArgs(@Nullable Input<RouteSpecTcpRouteTimeoutIdleArgs> idle) {
        this.idle = idle;
    }

    private RouteSpecTcpRouteTimeoutArgs() {
        this.idle = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRouteTimeoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RouteSpecTcpRouteTimeoutIdleArgs> idle;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRouteTimeoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
        }

        public Builder setIdle(@Nullable Input<RouteSpecTcpRouteTimeoutIdleArgs> idle) {
            this.idle = idle;
            return this;
        }

        public Builder setIdle(@Nullable RouteSpecTcpRouteTimeoutIdleArgs idle) {
            this.idle = Input.ofNullable(idle);
            return this;
        }
        public RouteSpecTcpRouteTimeoutArgs build() {
            return new RouteSpecTcpRouteTimeoutArgs(idle);
        }
    }
}