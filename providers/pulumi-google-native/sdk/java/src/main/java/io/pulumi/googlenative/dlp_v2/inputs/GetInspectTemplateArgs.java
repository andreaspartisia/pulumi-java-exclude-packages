// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInspectTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInspectTemplateArgs Empty = new GetInspectTemplateArgs();

    @Import(name="inspectTemplateId", required=true)
      private final String inspectTemplateId;

    public String inspectTemplateId() {
        return this.inspectTemplateId;
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

    public GetInspectTemplateArgs(
        String inspectTemplateId,
        String location,
        @Nullable String project) {
        this.inspectTemplateId = Objects.requireNonNull(inspectTemplateId, "expected parameter 'inspectTemplateId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetInspectTemplateArgs() {
        this.inspectTemplateId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInspectTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inspectTemplateId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInspectTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inspectTemplateId = defaults.inspectTemplateId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder inspectTemplateId(String inspectTemplateId) {
            this.inspectTemplateId = Objects.requireNonNull(inspectTemplateId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetInspectTemplateArgs build() {
            return new GetInspectTemplateArgs(inspectTemplateId, location, project);
        }
    }
}
