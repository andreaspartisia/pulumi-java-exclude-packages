// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.inputs.HttpHeaderActionArgs;
import io.pulumi.googlenative.compute_v1.inputs.HttpRedirectActionArgs;
import io.pulumi.googlenative.compute_v1.inputs.HttpRouteActionArgs;
import io.pulumi.googlenative.compute_v1.inputs.HttpRouteRuleMatchArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The HttpRouteRule setting specifies how to match an HTTP request and the corresponding routing action that load balancing proxies perform.
 * 
 */
public final class HttpRouteRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRouteRuleArgs Empty = new HttpRouteRuleArgs();

    /**
     * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="headerAction")
      private final @Nullable Output<HttpHeaderActionArgs> headerAction;

    public Output<HttpHeaderActionArgs> headerAction() {
        return this.headerAction == null ? Codegen.empty() : this.headerAction;
    }

    /**
     * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * 
     */
    @Import(name="matchRules")
      private final @Nullable Output<List<HttpRouteRuleMatchArgs>> matchRules;

    public Output<List<HttpRouteRuleMatchArgs>> matchRules() {
        return this.matchRules == null ? Codegen.empty() : this.matchRules;
    }

    /**
     * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule's routeAction.
     * 
     */
    @Import(name="routeAction")
      private final @Nullable Output<HttpRouteActionArgs> routeAction;

    public Output<HttpRouteActionArgs> routeAction() {
        return this.routeAction == null ? Codegen.empty() : this.routeAction;
    }

    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> service() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    /**
     * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="urlRedirect")
      private final @Nullable Output<HttpRedirectActionArgs> urlRedirect;

    public Output<HttpRedirectActionArgs> urlRedirect() {
        return this.urlRedirect == null ? Codegen.empty() : this.urlRedirect;
    }

    public HttpRouteRuleArgs(
        @Nullable Output<String> description,
        @Nullable Output<HttpHeaderActionArgs> headerAction,
        @Nullable Output<List<HttpRouteRuleMatchArgs>> matchRules,
        @Nullable Output<Integer> priority,
        @Nullable Output<HttpRouteActionArgs> routeAction,
        @Nullable Output<String> service,
        @Nullable Output<HttpRedirectActionArgs> urlRedirect) {
        this.description = description;
        this.headerAction = headerAction;
        this.matchRules = matchRules;
        this.priority = priority;
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    private HttpRouteRuleArgs() {
        this.description = Codegen.empty();
        this.headerAction = Codegen.empty();
        this.matchRules = Codegen.empty();
        this.priority = Codegen.empty();
        this.routeAction = Codegen.empty();
        this.service = Codegen.empty();
        this.urlRedirect = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<HttpHeaderActionArgs> headerAction;
        private @Nullable Output<List<HttpRouteRuleMatchArgs>> matchRules;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<HttpRouteActionArgs> routeAction;
        private @Nullable Output<String> service;
        private @Nullable Output<HttpRedirectActionArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder headerAction(@Nullable Output<HttpHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder headerAction(@Nullable HttpHeaderActionArgs headerAction) {
            this.headerAction = Codegen.ofNullable(headerAction);
            return this;
        }
        public Builder matchRules(@Nullable Output<List<HttpRouteRuleMatchArgs>> matchRules) {
            this.matchRules = matchRules;
            return this;
        }
        public Builder matchRules(@Nullable List<HttpRouteRuleMatchArgs> matchRules) {
            this.matchRules = Codegen.ofNullable(matchRules);
            return this;
        }
        public Builder matchRules(HttpRouteRuleMatchArgs... matchRules) {
            return matchRules(List.of(matchRules));
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder routeAction(@Nullable Output<HttpRouteActionArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }
        public Builder routeAction(@Nullable HttpRouteActionArgs routeAction) {
            this.routeAction = Codegen.ofNullable(routeAction);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder urlRedirect(@Nullable Output<HttpRedirectActionArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }
        public Builder urlRedirect(@Nullable HttpRedirectActionArgs urlRedirect) {
            this.urlRedirect = Codegen.ofNullable(urlRedirect);
            return this;
        }        public HttpRouteRuleArgs build() {
            return new HttpRouteRuleArgs(description, headerAction, matchRules, priority, routeAction, service, urlRedirect);
        }
    }
}
