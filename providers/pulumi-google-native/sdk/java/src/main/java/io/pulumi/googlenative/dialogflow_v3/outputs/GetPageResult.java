// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3EventHandlerResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3FormResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3FulfillmentResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPageResult {
    /**
     * The human-readable name of the page, unique within the agent.
     * 
     */
    private final String displayName;
    /**
     * The fulfillment to call when the session is entering the page.
     * 
     */
    private final GoogleCloudDialogflowCxV3FulfillmentResponse entryFulfillment;
    /**
     * Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers;
    /**
     * The form associated with the page, used for collecting parameters relevant to the page.
     * 
     */
    private final GoogleCloudDialogflowCxV3FormResponse form;
    /**
     * The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    private final String name;
    /**
     * Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page's transition route -> page's transition route group -> flow's transition routes. * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    private final List<String> transitionRouteGroups;
    /**
     * A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes;

    @CustomType.Constructor
    private GetPageResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("entryFulfillment") GoogleCloudDialogflowCxV3FulfillmentResponse entryFulfillment,
        @CustomType.Parameter("eventHandlers") List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers,
        @CustomType.Parameter("form") GoogleCloudDialogflowCxV3FormResponse form,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("transitionRouteGroups") List<String> transitionRouteGroups,
        @CustomType.Parameter("transitionRoutes") List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes) {
        this.displayName = displayName;
        this.entryFulfillment = entryFulfillment;
        this.eventHandlers = eventHandlers;
        this.form = form;
        this.name = name;
        this.transitionRouteGroups = transitionRouteGroups;
        this.transitionRoutes = transitionRoutes;
    }

    /**
     * The human-readable name of the page, unique within the agent.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * The fulfillment to call when the session is entering the page.
     * 
    */
    public GoogleCloudDialogflowCxV3FulfillmentResponse entryFulfillment() {
        return this.entryFulfillment;
    }
    /**
     * Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * 
    */
    public List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers() {
        return this.eventHandlers;
    }
    /**
     * The form associated with the page, used for collecting parameters relevant to the page.
     * 
    */
    public GoogleCloudDialogflowCxV3FormResponse form() {
        return this.form;
    }
    /**
     * The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page's transition route -> page's transition route group -> flow's transition routes. * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
    */
    public List<String> transitionRouteGroups() {
        return this.transitionRouteGroups;
    }
    /**
     * A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
     * 
    */
    public List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes() {
        return this.transitionRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private GoogleCloudDialogflowCxV3FulfillmentResponse entryFulfillment;
        private List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers;
        private GoogleCloudDialogflowCxV3FormResponse form;
        private String name;
        private List<String> transitionRouteGroups;
        private List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.entryFulfillment = defaults.entryFulfillment;
    	      this.eventHandlers = defaults.eventHandlers;
    	      this.form = defaults.form;
    	      this.name = defaults.name;
    	      this.transitionRouteGroups = defaults.transitionRouteGroups;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder entryFulfillment(GoogleCloudDialogflowCxV3FulfillmentResponse entryFulfillment) {
            this.entryFulfillment = Objects.requireNonNull(entryFulfillment);
            return this;
        }
        public Builder eventHandlers(List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers) {
            this.eventHandlers = Objects.requireNonNull(eventHandlers);
            return this;
        }
        public Builder eventHandlers(GoogleCloudDialogflowCxV3EventHandlerResponse... eventHandlers) {
            return eventHandlers(List.of(eventHandlers));
        }
        public Builder form(GoogleCloudDialogflowCxV3FormResponse form) {
            this.form = Objects.requireNonNull(form);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder transitionRouteGroups(List<String> transitionRouteGroups) {
            this.transitionRouteGroups = Objects.requireNonNull(transitionRouteGroups);
            return this;
        }
        public Builder transitionRouteGroups(String... transitionRouteGroups) {
            return transitionRouteGroups(List.of(transitionRouteGroups));
        }
        public Builder transitionRoutes(List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes) {
            this.transitionRoutes = Objects.requireNonNull(transitionRoutes);
            return this;
        }
        public Builder transitionRoutes(GoogleCloudDialogflowCxV3TransitionRouteResponse... transitionRoutes) {
            return transitionRoutes(List.of(transitionRoutes));
        }        public GetPageResult build() {
            return new GetPageResult(displayName, entryFulfillment, eventHandlers, form, name, transitionRouteGroups, transitionRoutes);
        }
    }
}
