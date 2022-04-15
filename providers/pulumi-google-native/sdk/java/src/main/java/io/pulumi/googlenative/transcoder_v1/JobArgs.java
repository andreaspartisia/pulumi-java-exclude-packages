// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.transcoder_v1.inputs.JobConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * The configuration for this job.
     * 
     */
    @Import(name="config")
      private final @Nullable Output<JobConfigArgs> config;

    public Output<JobConfigArgs> config() {
        return this.config == null ? Codegen.empty() : this.config;
    }

    /**
     * Input only. Specify the `input_uri` to populate empty `uri` fields in each element of `Job.config.inputs` or `JobTemplate.config.inputs` when using template. URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
     * 
     */
    @Import(name="inputUri")
      private final @Nullable Output<String> inputUri;

    public Output<String> inputUri() {
        return this.inputUri == null ? Codegen.empty() : this.inputUri;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The resource name of the job. Format: `projects/{project_number}/locations/{location}/jobs/{job}`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Input only. Specify the `output_uri` to populate an empty `Job.config.output.uri` or `JobTemplate.config.output.uri` when using template. URI for the output file(s). For example, `gs://my-bucket/outputs/`.
     * 
     */
    @Import(name="outputUri")
      private final @Nullable Output<String> outputUri;

    public Output<String> outputUri() {
        return this.outputUri == null ? Codegen.empty() : this.outputUri;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Input only. Specify the `template_id` to use for populating `Job.config`. The default is `preset/web-hd`. Preset Transcoder templates: - `preset/{preset_id}` - User defined JobTemplate: `{job_template_id}`
     * 
     */
    @Import(name="templateId")
      private final @Nullable Output<String> templateId;

    public Output<String> templateId() {
        return this.templateId == null ? Codegen.empty() : this.templateId;
    }

    /**
     * Job time to live value in days, which will be effective after job completion. Job should be deleted automatically after the given TTL. Enter a value between 1 and 90. The default is 30.
     * 
     */
    @Import(name="ttlAfterCompletionDays")
      private final @Nullable Output<Integer> ttlAfterCompletionDays;

    public Output<Integer> ttlAfterCompletionDays() {
        return this.ttlAfterCompletionDays == null ? Codegen.empty() : this.ttlAfterCompletionDays;
    }

    public JobArgs(
        @Nullable Output<JobConfigArgs> config,
        @Nullable Output<String> inputUri,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> outputUri,
        @Nullable Output<String> project,
        @Nullable Output<String> templateId,
        @Nullable Output<Integer> ttlAfterCompletionDays) {
        this.config = config;
        this.inputUri = inputUri;
        this.location = location;
        this.name = name;
        this.outputUri = outputUri;
        this.project = project;
        this.templateId = templateId;
        this.ttlAfterCompletionDays = ttlAfterCompletionDays;
    }

    private JobArgs() {
        this.config = Codegen.empty();
        this.inputUri = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.outputUri = Codegen.empty();
        this.project = Codegen.empty();
        this.templateId = Codegen.empty();
        this.ttlAfterCompletionDays = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobConfigArgs> config;
        private @Nullable Output<String> inputUri;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> outputUri;
        private @Nullable Output<String> project;
        private @Nullable Output<String> templateId;
        private @Nullable Output<Integer> ttlAfterCompletionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.inputUri = defaults.inputUri;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outputUri = defaults.outputUri;
    	      this.project = defaults.project;
    	      this.templateId = defaults.templateId;
    	      this.ttlAfterCompletionDays = defaults.ttlAfterCompletionDays;
        }

        public Builder config(@Nullable Output<JobConfigArgs> config) {
            this.config = config;
            return this;
        }
        public Builder config(@Nullable JobConfigArgs config) {
            this.config = Codegen.ofNullable(config);
            return this;
        }
        public Builder inputUri(@Nullable Output<String> inputUri) {
            this.inputUri = inputUri;
            return this;
        }
        public Builder inputUri(@Nullable String inputUri) {
            this.inputUri = Codegen.ofNullable(inputUri);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder outputUri(@Nullable Output<String> outputUri) {
            this.outputUri = outputUri;
            return this;
        }
        public Builder outputUri(@Nullable String outputUri) {
            this.outputUri = Codegen.ofNullable(outputUri);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder templateId(@Nullable Output<String> templateId) {
            this.templateId = templateId;
            return this;
        }
        public Builder templateId(@Nullable String templateId) {
            this.templateId = Codegen.ofNullable(templateId);
            return this;
        }
        public Builder ttlAfterCompletionDays(@Nullable Output<Integer> ttlAfterCompletionDays) {
            this.ttlAfterCompletionDays = ttlAfterCompletionDays;
            return this;
        }
        public Builder ttlAfterCompletionDays(@Nullable Integer ttlAfterCompletionDays) {
            this.ttlAfterCompletionDays = Codegen.ofNullable(ttlAfterCompletionDays);
            return this;
        }        public JobArgs build() {
            return new JobArgs(config, inputUri, location, name, outputUri, project, templateId, ttlAfterCompletionDays);
        }
    }
}
