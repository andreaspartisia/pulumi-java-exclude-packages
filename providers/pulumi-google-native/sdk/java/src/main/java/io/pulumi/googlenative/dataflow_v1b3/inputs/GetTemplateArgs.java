// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTemplateArgs Empty = new GetTemplateArgs();

    @Import(name="gcsPath", required=true)
      private final String gcsPath;

    public String gcsPath() {
        return this.gcsPath;
    }

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

    @Import(name="view")
      private final @Nullable String view;

    public Optional<String> view() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetTemplateArgs(
        String gcsPath,
        String location,
        @Nullable String project,
        @Nullable String view) {
        this.gcsPath = Objects.requireNonNull(gcsPath, "expected parameter 'gcsPath' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.view = view;
    }

    private GetTemplateArgs() {
        this.gcsPath = null;
        this.location = null;
        this.project = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcsPath;
        private String location;
        private @Nullable String project;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsPath = defaults.gcsPath;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.view = defaults.view;
        }

        public Builder gcsPath(String gcsPath) {
            this.gcsPath = Objects.requireNonNull(gcsPath);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder view(@Nullable String view) {
            this.view = view;
            return this;
        }        public GetTemplateArgs build() {
            return new GetTemplateArgs(gcsPath, location, project, view);
        }
    }
}
