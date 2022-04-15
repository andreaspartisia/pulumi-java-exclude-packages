// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TransitionRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitionRouteGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitionRouteGroupArgs Empty = new TransitionRouteGroupArgs();

    @Import(name="agentId", required=true)
      private final Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * The human-readable name of the transition route group, unique within the Agent. The display name can be no longer than 30 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="flowId", required=true)
      private final Output<String> flowId;

    public Output<String> flowId() {
        return this.flowId;
    }

    @Import(name="languageCode")
      private final @Nullable Output<String> languageCode;

    public Output<String> languageCode() {
        return this.languageCode == null ? Codegen.empty() : this.languageCode;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Transition routes associated with the TransitionRouteGroup.
     * 
     */
    @Import(name="transitionRoutes")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

    public Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes() {
        return this.transitionRoutes == null ? Codegen.empty() : this.transitionRoutes;
    }

    public TransitionRouteGroupArgs(
        Output<String> agentId,
        Output<String> displayName,
        Output<String> flowId,
        @Nullable Output<String> languageCode,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.flowId = Objects.requireNonNull(flowId, "expected parameter 'flowId' to be non-null");
        this.languageCode = languageCode;
        this.location = location;
        this.name = name;
        this.project = project;
        this.transitionRoutes = transitionRoutes;
    }

    private TransitionRouteGroupArgs() {
        this.agentId = Codegen.empty();
        this.displayName = Codegen.empty();
        this.flowId = Codegen.empty();
        this.languageCode = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.transitionRoutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitionRouteGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> agentId;
        private Output<String> displayName;
        private Output<String> flowId;
        private @Nullable Output<String> languageCode;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitionRouteGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.displayName = defaults.displayName;
    	      this.flowId = defaults.flowId;
    	      this.languageCode = defaults.languageCode;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        public Builder agentId(Output<String> agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }
        public Builder agentId(String agentId) {
            this.agentId = Output.of(Objects.requireNonNull(agentId));
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder flowId(Output<String> flowId) {
            this.flowId = Objects.requireNonNull(flowId);
            return this;
        }
        public Builder flowId(String flowId) {
            this.flowId = Output.of(Objects.requireNonNull(flowId));
            return this;
        }
        public Builder languageCode(@Nullable Output<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = Codegen.ofNullable(languageCode);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder transitionRoutes(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes) {
            this.transitionRoutes = transitionRoutes;
            return this;
        }
        public Builder transitionRoutes(@Nullable List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs> transitionRoutes) {
            this.transitionRoutes = Codegen.ofNullable(transitionRoutes);
            return this;
        }
        public Builder transitionRoutes(GoogleCloudDialogflowCxV3beta1TransitionRouteArgs... transitionRoutes) {
            return transitionRoutes(List.of(transitionRoutes));
        }        public TransitionRouteGroupArgs build() {
            return new TransitionRouteGroupArgs(agentId, displayName, flowId, languageCode, location, name, project, transitionRoutes);
        }
    }
}
