// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.PipelineReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Execute pipeline activity.
 * 
 */
public final class ExecutePipelineActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutePipelineActivityArgs Empty = new ExecutePipelineActivityArgs();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> dependsOn() {
        return this.dependsOn == null ? Codegen.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Pipeline parameters.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,Object>> parameters;

    public Output<Map<String,Object>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Pipeline reference.
     * 
     */
    @Import(name="pipeline", required=true)
      private final Output<PipelineReferenceArgs> pipeline;

    public Output<PipelineReferenceArgs> pipeline() {
        return this.pipeline;
    }

    /**
     * Type of activity.
     * Expected value is 'ExecutePipeline'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Output<List<UserPropertyArgs>> userProperties() {
        return this.userProperties == null ? Codegen.empty() : this.userProperties;
    }

    /**
     * Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     * 
     */
    @Import(name="waitOnCompletion")
      private final @Nullable Output<Boolean> waitOnCompletion;

    public Output<Boolean> waitOnCompletion() {
        return this.waitOnCompletion == null ? Codegen.empty() : this.waitOnCompletion;
    }

    public ExecutePipelineActivityArgs(
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        Output<String> name,
        @Nullable Output<Map<String,Object>> parameters,
        Output<PipelineReferenceArgs> pipeline,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties,
        @Nullable Output<Boolean> waitOnCompletion) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.pipeline = Objects.requireNonNull(pipeline, "expected parameter 'pipeline' to be non-null");
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.userProperties = userProperties;
        this.waitOnCompletion = waitOnCompletion;
    }

    private ExecutePipelineActivityArgs() {
        this.dependsOn = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
        this.pipeline = Codegen.empty();
        this.type = Codegen.empty();
        this.userProperties = Codegen.empty();
        this.waitOnCompletion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutePipelineActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private Output<String> name;
        private @Nullable Output<Map<String,Object>> parameters;
        private Output<PipelineReferenceArgs> pipeline;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;
        private @Nullable Output<Boolean> waitOnCompletion;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutePipelineActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.pipeline = defaults.pipeline;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.waitOnCompletion = defaults.waitOnCompletion;
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Codegen.ofNullable(dependsOn);
            return this;
        }
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder pipeline(Output<PipelineReferenceArgs> pipeline) {
            this.pipeline = Objects.requireNonNull(pipeline);
            return this;
        }
        public Builder pipeline(PipelineReferenceArgs pipeline) {
            this.pipeline = Output.of(Objects.requireNonNull(pipeline));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Codegen.ofNullable(userProperties);
            return this;
        }
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }
        public Builder waitOnCompletion(@Nullable Output<Boolean> waitOnCompletion) {
            this.waitOnCompletion = waitOnCompletion;
            return this;
        }
        public Builder waitOnCompletion(@Nullable Boolean waitOnCompletion) {
            this.waitOnCompletion = Codegen.ofNullable(waitOnCompletion);
            return this;
        }        public ExecutePipelineActivityArgs build() {
            return new ExecutePipelineActivityArgs(dependsOn, description, name, parameters, pipeline, type, userProperties, waitOnCompletion);
        }
    }
}
