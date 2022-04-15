// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRouteArgs Empty = new GetRouteArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="privateConnectionId", required=true)
      private final String privateConnectionId;

    public String privateConnectionId() {
        return this.privateConnectionId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="routeId", required=true)
      private final String routeId;

    public String routeId() {
        return this.routeId;
    }

    public GetRouteArgs(
        String location,
        String privateConnectionId,
        @Nullable String project,
        String routeId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.privateConnectionId = Objects.requireNonNull(privateConnectionId, "expected parameter 'privateConnectionId' to be non-null");
        this.project = project;
        this.routeId = Objects.requireNonNull(routeId, "expected parameter 'routeId' to be non-null");
    }

    private GetRouteArgs() {
        this.location = null;
        this.privateConnectionId = null;
        this.project = null;
        this.routeId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String privateConnectionId;
        private @Nullable String project;
        private String routeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.privateConnectionId = defaults.privateConnectionId;
    	      this.project = defaults.project;
    	      this.routeId = defaults.routeId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder privateConnectionId(String privateConnectionId) {
            this.privateConnectionId = Objects.requireNonNull(privateConnectionId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder routeId(String routeId) {
            this.routeId = Objects.requireNonNull(routeId);
            return this;
        }        public GetRouteArgs build() {
            return new GetRouteArgs(location, privateConnectionId, project, routeId);
        }
    }
}
