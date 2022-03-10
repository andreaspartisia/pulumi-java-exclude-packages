// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionCorsPolicy;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionFaultInjectionPolicy;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionRequestMirrorPolicy;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionRetryPolicy;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionTimeout;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionUrlRewrite;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionWeightedBackendService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapDefaultRouteAction {
    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionCorsPolicy corsPolicy;
    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy;
    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy;
    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionRetryPolicy retryPolicy;
    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionTimeout timeout;
    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionUrlRewrite urlRewrite;
    /**
     * A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<URLMapDefaultRouteActionWeightedBackendService> weightedBackendServices;

    @OutputCustomType.Constructor
    private URLMapDefaultRouteAction(
        @OutputCustomType.Parameter("corsPolicy") @Nullable URLMapDefaultRouteActionCorsPolicy corsPolicy,
        @OutputCustomType.Parameter("faultInjectionPolicy") @Nullable URLMapDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy,
        @OutputCustomType.Parameter("requestMirrorPolicy") @Nullable URLMapDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy,
        @OutputCustomType.Parameter("retryPolicy") @Nullable URLMapDefaultRouteActionRetryPolicy retryPolicy,
        @OutputCustomType.Parameter("timeout") @Nullable URLMapDefaultRouteActionTimeout timeout,
        @OutputCustomType.Parameter("urlRewrite") @Nullable URLMapDefaultRouteActionUrlRewrite urlRewrite,
        @OutputCustomType.Parameter("weightedBackendServices") @Nullable List<URLMapDefaultRouteActionWeightedBackendService> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
    */
    public Optional<URLMapDefaultRouteActionCorsPolicy> getCorsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }
    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapDefaultRouteActionFaultInjectionPolicy> getFaultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }
    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapDefaultRouteActionRequestMirrorPolicy> getRequestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }
    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapDefaultRouteActionRetryPolicy> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapDefaultRouteActionTimeout> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapDefaultRouteActionUrlRewrite> getUrlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }
    /**
     * A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
    */
    public List<URLMapDefaultRouteActionWeightedBackendService> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? List.of() : this.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable URLMapDefaultRouteActionCorsPolicy corsPolicy;
        private @Nullable URLMapDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy;
        private @Nullable URLMapDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy;
        private @Nullable URLMapDefaultRouteActionRetryPolicy retryPolicy;
        private @Nullable URLMapDefaultRouteActionTimeout timeout;
        private @Nullable URLMapDefaultRouteActionUrlRewrite urlRewrite;
        private @Nullable List<URLMapDefaultRouteActionWeightedBackendService> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder setCorsPolicy(@Nullable URLMapDefaultRouteActionCorsPolicy corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder setFaultInjectionPolicy(@Nullable URLMapDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder setRequestMirrorPolicy(@Nullable URLMapDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder setRetryPolicy(@Nullable URLMapDefaultRouteActionRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setTimeout(@Nullable URLMapDefaultRouteActionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setUrlRewrite(@Nullable URLMapDefaultRouteActionUrlRewrite urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder setWeightedBackendServices(@Nullable List<URLMapDefaultRouteActionWeightedBackendService> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public URLMapDefaultRouteAction build() {
            return new URLMapDefaultRouteAction(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
