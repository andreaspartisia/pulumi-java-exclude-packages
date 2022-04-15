// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkflowTemplateIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkflowTemplateIamPolicyArgs Empty = new GetWorkflowTemplateIamPolicyArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="workflowTemplateId", required=true)
      private final String workflowTemplateId;

    public String workflowTemplateId() {
        return this.workflowTemplateId;
    }

    public GetWorkflowTemplateIamPolicyArgs(
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String workflowTemplateId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.workflowTemplateId = Objects.requireNonNull(workflowTemplateId, "expected parameter 'workflowTemplateId' to be non-null");
    }

    private GetWorkflowTemplateIamPolicyArgs() {
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.workflowTemplateId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowTemplateIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String workflowTemplateId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowTemplateIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.workflowTemplateId = defaults.workflowTemplateId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder workflowTemplateId(String workflowTemplateId) {
            this.workflowTemplateId = Objects.requireNonNull(workflowTemplateId);
            return this;
        }        public GetWorkflowTemplateIamPolicyArgs build() {
            return new GetWorkflowTemplateIamPolicyArgs(location, optionsRequestedPolicyVersion, project, workflowTemplateId);
        }
    }
}
