// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExecutionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExecutionArgs Empty = new GetExecutionArgs();

    @Import(name="executionId", required=true)
      private final String executionId;

    public String executionId() {
        return this.executionId;
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

    @Import(name="workflowId", required=true)
      private final String workflowId;

    public String workflowId() {
        return this.workflowId;
    }

    public GetExecutionArgs(
        String executionId,
        String location,
        @Nullable String project,
        @Nullable String view,
        String workflowId) {
        this.executionId = Objects.requireNonNull(executionId, "expected parameter 'executionId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.view = view;
        this.workflowId = Objects.requireNonNull(workflowId, "expected parameter 'workflowId' to be non-null");
    }

    private GetExecutionArgs() {
        this.executionId = null;
        this.location = null;
        this.project = null;
        this.view = null;
        this.workflowId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executionId;
        private String location;
        private @Nullable String project;
        private @Nullable String view;
        private String workflowId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExecutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionId = defaults.executionId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.view = defaults.view;
    	      this.workflowId = defaults.workflowId;
        }

        public Builder executionId(String executionId) {
            this.executionId = Objects.requireNonNull(executionId);
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
        }
        public Builder workflowId(String workflowId) {
            this.workflowId = Objects.requireNonNull(workflowId);
            return this;
        }        public GetExecutionArgs build() {
            return new GetExecutionArgs(executionId, location, project, view, workflowId);
        }
    }
}
