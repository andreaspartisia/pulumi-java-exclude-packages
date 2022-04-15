// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EventHandlerArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1NluSettingsArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TransitionRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowArgs Empty = new FlowArgs();

    @Import(name="agentId", required=true)
      private final Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The human-readable name of the flow.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * A flow's event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page's event handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * 
     */
    @Import(name="eventHandlers")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers;

    public Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers() {
        return this.eventHandlers == null ? Codegen.empty() : this.eventHandlers;
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
     * The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * NLU related settings of the flow.
     * 
     */
    @Import(name="nluSettings")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> nluSettings;

    public Output<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> nluSettings() {
        return this.nluSettings == null ? Codegen.empty() : this.nluSettings;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A flow's transition route group serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @Import(name="transitionRouteGroups")
      private final @Nullable Output<List<String>> transitionRouteGroups;

    public Output<List<String>> transitionRouteGroups() {
        return this.transitionRouteGroups == null ? Codegen.empty() : this.transitionRouteGroups;
    }

    /**
     * A flow's transition routes serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition routes and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified.. * TransitionRoutes with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
     * 
     */
    @Import(name="transitionRoutes")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

    public Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes() {
        return this.transitionRoutes == null ? Codegen.empty() : this.transitionRoutes;
    }

    public FlowArgs(
        Output<String> agentId,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers,
        @Nullable Output<String> languageCode,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> nluSettings,
        @Nullable Output<String> project,
        @Nullable Output<List<String>> transitionRouteGroups,
        @Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.eventHandlers = eventHandlers;
        this.languageCode = languageCode;
        this.location = location;
        this.name = name;
        this.nluSettings = nluSettings;
        this.project = project;
        this.transitionRouteGroups = transitionRouteGroups;
        this.transitionRoutes = transitionRoutes;
    }

    private FlowArgs() {
        this.agentId = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.eventHandlers = Codegen.empty();
        this.languageCode = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.nluSettings = Codegen.empty();
        this.project = Codegen.empty();
        this.transitionRouteGroups = Codegen.empty();
        this.transitionRoutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> agentId;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers;
        private @Nullable Output<String> languageCode;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> nluSettings;
        private @Nullable Output<String> project;
        private @Nullable Output<List<String>> transitionRouteGroups;
        private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.eventHandlers = defaults.eventHandlers;
    	      this.languageCode = defaults.languageCode;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nluSettings = defaults.nluSettings;
    	      this.project = defaults.project;
    	      this.transitionRouteGroups = defaults.transitionRouteGroups;
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
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder eventHandlers(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers) {
            this.eventHandlers = eventHandlers;
            return this;
        }
        public Builder eventHandlers(@Nullable List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs> eventHandlers) {
            this.eventHandlers = Codegen.ofNullable(eventHandlers);
            return this;
        }
        public Builder eventHandlers(GoogleCloudDialogflowCxV3beta1EventHandlerArgs... eventHandlers) {
            return eventHandlers(List.of(eventHandlers));
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
        public Builder nluSettings(@Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsArgs> nluSettings) {
            this.nluSettings = nluSettings;
            return this;
        }
        public Builder nluSettings(@Nullable GoogleCloudDialogflowCxV3beta1NluSettingsArgs nluSettings) {
            this.nluSettings = Codegen.ofNullable(nluSettings);
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
        public Builder transitionRouteGroups(@Nullable Output<List<String>> transitionRouteGroups) {
            this.transitionRouteGroups = transitionRouteGroups;
            return this;
        }
        public Builder transitionRouteGroups(@Nullable List<String> transitionRouteGroups) {
            this.transitionRouteGroups = Codegen.ofNullable(transitionRouteGroups);
            return this;
        }
        public Builder transitionRouteGroups(String... transitionRouteGroups) {
            return transitionRouteGroups(List.of(transitionRouteGroups));
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
        }        public FlowArgs build() {
            return new FlowArgs(agentId, description, displayName, eventHandlers, languageCode, location, name, nluSettings, project, transitionRouteGroups, transitionRoutes);
        }
    }
}
