// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleUrlRedirectGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleGetArgs Empty = new URLMapPathMatcherPathRuleGetArgs();

    /**
     * The list of path patterns to match. Each must start with / and the only place a
     * \* is allowed is at the end following a /. The string fed to the path matcher
     * does not include any text after the first ? or #, and those chars are not
     * allowed here.
     * 
     */
    @InputImport(name="paths", required=true)
    private final Input<List<String>> paths;

    public Input<List<String>> getPaths() {
        return this.paths;
    }

    /**
     * In response to a matching matchRule, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If  routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="routeAction")
    private final @Nullable Input<URLMapPathMatcherPathRuleRouteActionGetArgs> routeAction;

    public Input<URLMapPathMatcherPathRuleRouteActionGetArgs> getRouteAction() {
        return this.routeAction == null ? Input.empty() : this.routeAction;
    }

    /**
     * The backend service or backend bucket link that should be matched by this test.
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * When this rule is matched, the request is redirected to a URL specified by
     * urlRedirect. If urlRedirect is specified, service or routeAction must not be
     * set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="urlRedirect")
    private final @Nullable Input<URLMapPathMatcherPathRuleUrlRedirectGetArgs> urlRedirect;

    public Input<URLMapPathMatcherPathRuleUrlRedirectGetArgs> getUrlRedirect() {
        return this.urlRedirect == null ? Input.empty() : this.urlRedirect;
    }

    public URLMapPathMatcherPathRuleGetArgs(
        Input<List<String>> paths,
        @Nullable Input<URLMapPathMatcherPathRuleRouteActionGetArgs> routeAction,
        @Nullable Input<String> service,
        @Nullable Input<URLMapPathMatcherPathRuleUrlRedirectGetArgs> urlRedirect) {
        this.paths = Objects.requireNonNull(paths, "expected parameter 'paths' to be non-null");
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    private URLMapPathMatcherPathRuleGetArgs() {
        this.paths = Input.empty();
        this.routeAction = Input.empty();
        this.service = Input.empty();
        this.urlRedirect = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> paths;
        private @Nullable Input<URLMapPathMatcherPathRuleRouteActionGetArgs> routeAction;
        private @Nullable Input<String> service;
        private @Nullable Input<URLMapPathMatcherPathRuleUrlRedirectGetArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setPaths(Input<List<String>> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }

        public Builder setPaths(List<String> paths) {
            this.paths = Input.of(Objects.requireNonNull(paths));
            return this;
        }

        public Builder setRouteAction(@Nullable Input<URLMapPathMatcherPathRuleRouteActionGetArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder setRouteAction(@Nullable URLMapPathMatcherPathRuleRouteActionGetArgs routeAction) {
            this.routeAction = Input.ofNullable(routeAction);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setUrlRedirect(@Nullable Input<URLMapPathMatcherPathRuleUrlRedirectGetArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }

        public Builder setUrlRedirect(@Nullable URLMapPathMatcherPathRuleUrlRedirectGetArgs urlRedirect) {
            this.urlRedirect = Input.ofNullable(urlRedirect);
            return this;
        }

        public URLMapPathMatcherPathRuleGetArgs build() {
            return new URLMapPathMatcherPathRuleGetArgs(paths, routeAction, service, urlRedirect);
        }
    }
}