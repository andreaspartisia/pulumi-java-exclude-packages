// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSpokeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSpokeArgs Empty = new GetSpokeArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="spokeId", required=true)
      private final String spokeId;

    public String spokeId() {
        return this.spokeId;
    }

    public GetSpokeArgs(
        String location,
        @Nullable String project,
        String spokeId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.spokeId = Objects.requireNonNull(spokeId, "expected parameter 'spokeId' to be non-null");
    }

    private GetSpokeArgs() {
        this.location = null;
        this.project = null;
        this.spokeId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpokeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String spokeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpokeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.spokeId = defaults.spokeId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder spokeId(String spokeId) {
            this.spokeId = Objects.requireNonNull(spokeId);
            return this;
        }        public GetSpokeArgs build() {
            return new GetSpokeArgs(location, project, spokeId);
        }
    }
}
