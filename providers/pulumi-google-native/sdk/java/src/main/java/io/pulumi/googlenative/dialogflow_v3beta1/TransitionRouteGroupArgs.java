// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TransitionRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitionRouteGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitionRouteGroupArgs Empty = new TransitionRouteGroupArgs();

    @InputImport(name="agentId", required=true)
    private final Input<String> agentId;

    public Input<String> getAgentId() {
        return this.agentId;
    }

    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="flowId", required=true)
    private final Input<String> flowId;

    public Input<String> getFlowId() {
        return this.flowId;
    }

    @InputImport(name="languageCode")
    private final @Nullable Input<String> languageCode;

    public Input<String> getLanguageCode() {
        return this.languageCode == null ? Input.empty() : this.languageCode;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="transitionRoutes")
    private final @Nullable Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

    public Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> getTransitionRoutes() {
        return this.transitionRoutes == null ? Input.empty() : this.transitionRoutes;
    }

    public TransitionRouteGroupArgs(
        Input<String> agentId,
        Input<String> displayName,
        Input<String> flowId,
        @Nullable Input<String> languageCode,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes) {
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
        this.agentId = Input.empty();
        this.displayName = Input.empty();
        this.flowId = Input.empty();
        this.languageCode = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.transitionRoutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitionRouteGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> agentId;
        private Input<String> displayName;
        private Input<String> flowId;
        private @Nullable Input<String> languageCode;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

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

        public Builder setAgentId(Input<String> agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Input.of(Objects.requireNonNull(agentId));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setFlowId(Input<String> flowId) {
            this.flowId = Objects.requireNonNull(flowId);
            return this;
        }

        public Builder setFlowId(String flowId) {
            this.flowId = Input.of(Objects.requireNonNull(flowId));
            return this;
        }

        public Builder setLanguageCode(@Nullable Input<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder setLanguageCode(@Nullable String languageCode) {
            this.languageCode = Input.ofNullable(languageCode);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTransitionRoutes(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes) {
            this.transitionRoutes = transitionRoutes;
            return this;
        }

        public Builder setTransitionRoutes(@Nullable List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs> transitionRoutes) {
            this.transitionRoutes = Input.ofNullable(transitionRoutes);
            return this;
        }

        public TransitionRouteGroupArgs build() {
            return new TransitionRouteGroupArgs(agentId, displayName, flowId, languageCode, location, name, project, transitionRoutes);
        }
    }
}