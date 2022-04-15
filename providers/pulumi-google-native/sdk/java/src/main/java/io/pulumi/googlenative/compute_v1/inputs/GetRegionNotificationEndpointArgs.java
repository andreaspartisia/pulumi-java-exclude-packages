// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionNotificationEndpointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionNotificationEndpointArgs Empty = new GetRegionNotificationEndpointArgs();

    @Import(name="notificationEndpoint", required=true)
      private final String notificationEndpoint;

    public String notificationEndpoint() {
        return this.notificationEndpoint;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    public GetRegionNotificationEndpointArgs(
        String notificationEndpoint,
        @Nullable String project,
        String region) {
        this.notificationEndpoint = Objects.requireNonNull(notificationEndpoint, "expected parameter 'notificationEndpoint' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetRegionNotificationEndpointArgs() {
        this.notificationEndpoint = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionNotificationEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String notificationEndpoint;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionNotificationEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationEndpoint = defaults.notificationEndpoint;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder notificationEndpoint(String notificationEndpoint) {
            this.notificationEndpoint = Objects.requireNonNull(notificationEndpoint);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetRegionNotificationEndpointArgs build() {
            return new GetRegionNotificationEndpointArgs(notificationEndpoint, project, region);
        }
    }
}
