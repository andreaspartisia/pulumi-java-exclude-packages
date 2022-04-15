// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtrace_v2beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudtrace_v2beta1.inputs.OutputConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TraceSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final TraceSinkArgs Empty = new TraceSinkArgs();

    /**
     * The canonical sink resource name, unique within the project. Must be of the form: project/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The export destination.
     * 
     */
    @Import(name="outputConfig", required=true)
      private final Output<OutputConfigArgs> outputConfig;

    public Output<OutputConfigArgs> outputConfig() {
        return this.outputConfig;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public TraceSinkArgs(
        @Nullable Output<String> name,
        Output<OutputConfigArgs> outputConfig,
        @Nullable Output<String> project) {
        this.name = name;
        this.outputConfig = Objects.requireNonNull(outputConfig, "expected parameter 'outputConfig' to be non-null");
        this.project = project;
    }

    private TraceSinkArgs() {
        this.name = Codegen.empty();
        this.outputConfig = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private Output<OutputConfigArgs> outputConfig;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(TraceSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.outputConfig = defaults.outputConfig;
    	      this.project = defaults.project;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder outputConfig(Output<OutputConfigArgs> outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }
        public Builder outputConfig(OutputConfigArgs outputConfig) {
            this.outputConfig = Output.of(Objects.requireNonNull(outputConfig));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public TraceSinkArgs build() {
            return new TraceSinkArgs(name, outputConfig, project);
        }
    }
}
