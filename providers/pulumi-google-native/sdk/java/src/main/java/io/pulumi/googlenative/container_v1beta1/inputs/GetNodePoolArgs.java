// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodePoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNodePoolArgs Empty = new GetNodePoolArgs();

    @Import(name="clusterId", required=true)
      private final String clusterId;

    public String clusterId() {
        return this.clusterId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="nodePoolId", required=true)
      private final String nodePoolId;

    public String nodePoolId() {
        return this.nodePoolId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetNodePoolArgs(
        String clusterId,
        String location,
        String nodePoolId,
        @Nullable String project) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.nodePoolId = Objects.requireNonNull(nodePoolId, "expected parameter 'nodePoolId' to be non-null");
        this.project = project;
    }

    private GetNodePoolArgs() {
        this.clusterId = null;
        this.location = null;
        this.nodePoolId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private String location;
        private String nodePoolId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodePoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.location = defaults.location;
    	      this.nodePoolId = defaults.nodePoolId;
    	      this.project = defaults.project;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder nodePoolId(String nodePoolId) {
            this.nodePoolId = Objects.requireNonNull(nodePoolId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetNodePoolArgs build() {
            return new GetNodePoolArgs(clusterId, location, nodePoolId, project);
        }
    }
}
