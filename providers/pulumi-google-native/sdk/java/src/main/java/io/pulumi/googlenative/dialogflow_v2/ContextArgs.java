// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContextArgs Empty = new ContextArgs();

    @Import(name="environmentId", required=true)
      private final Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * Optional. The number of conversational query requests after which the context expires. The default is `0`. If set to `0`, the context expires immediately. Contexts expire automatically after 20 minutes if there are no matching queries.
     * 
     */
    @Import(name="lifespanCount")
      private final @Nullable Output<Integer> lifespanCount;

    public Output<Integer> lifespanCount() {
        return this.lifespanCount == null ? Codegen.empty() : this.lifespanCount;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The unique identifier of the context. Format: `projects//agent/sessions//contexts/`, or `projects//agent/environments//users//sessions//contexts/`. The `Context ID` is always converted to lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. The following context names are reserved for internal use by Dialogflow. You should not use these contexts or create contexts with these names: * `__system_counters__` * `*_id_dialog_context` * `*_dialog_params_size`
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Optional. The collection of parameters associated with this context. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON object composed of a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter's entity type is a composite entity: map - Else: depending on parameter value type, could be one of string, number, boolean, null, list or map - MapValue value: - If parameter's entity type is a composite entity: map from composite entity property names to property values - Else: parameter value
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="sessionId", required=true)
      private final Output<String> sessionId;

    public Output<String> sessionId() {
        return this.sessionId;
    }

    @Import(name="userId", required=true)
      private final Output<String> userId;

    public Output<String> userId() {
        return this.userId;
    }

    public ContextArgs(
        Output<String> environmentId,
        @Nullable Output<Integer> lifespanCount,
        @Nullable Output<String> location,
        Output<String> name,
        @Nullable Output<Map<String,String>> parameters,
        @Nullable Output<String> project,
        Output<String> sessionId,
        Output<String> userId) {
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.lifespanCount = lifespanCount;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.project = project;
        this.sessionId = Objects.requireNonNull(sessionId, "expected parameter 'sessionId' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private ContextArgs() {
        this.environmentId = Codegen.empty();
        this.lifespanCount = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
        this.project = Codegen.empty();
        this.sessionId = Codegen.empty();
        this.userId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> environmentId;
        private @Nullable Output<Integer> lifespanCount;
        private @Nullable Output<String> location;
        private Output<String> name;
        private @Nullable Output<Map<String,String>> parameters;
        private @Nullable Output<String> project;
        private Output<String> sessionId;
        private Output<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(ContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.lifespanCount = defaults.lifespanCount;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.sessionId = defaults.sessionId;
    	      this.userId = defaults.userId;
        }

        public Builder environmentId(Output<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Output.of(Objects.requireNonNull(environmentId));
            return this;
        }
        public Builder lifespanCount(@Nullable Output<Integer> lifespanCount) {
            this.lifespanCount = lifespanCount;
            return this;
        }
        public Builder lifespanCount(@Nullable Integer lifespanCount) {
            this.lifespanCount = Codegen.ofNullable(lifespanCount);
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
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
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
        public Builder sessionId(Output<String> sessionId) {
            this.sessionId = Objects.requireNonNull(sessionId);
            return this;
        }
        public Builder sessionId(String sessionId) {
            this.sessionId = Output.of(Objects.requireNonNull(sessionId));
            return this;
        }
        public Builder userId(Output<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Output.of(Objects.requireNonNull(userId));
            return this;
        }        public ContextArgs build() {
            return new ContextArgs(environmentId, lifespanCount, location, name, parameters, project, sessionId, userId);
        }
    }
}
