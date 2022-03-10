// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderAction;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherDefaultRouteActionWeightedBackendService {
    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    private final @Nullable String backendService;
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderAction headerAction;
    /**
     * Specifies the fraction of traffic sent to backendService, computed as
     * weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user's request
     * has been directed to a backendService, subsequent requests will be sent to the same backendService
     * as determined by the BackendService's session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    private final @Nullable Integer weight;

    @OutputCustomType.Constructor
    private URLMapPathMatcherDefaultRouteActionWeightedBackendService(
        @OutputCustomType.Parameter("backendService") @Nullable String backendService,
        @OutputCustomType.Parameter("headerAction") @Nullable URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderAction headerAction,
        @OutputCustomType.Parameter("weight") @Nullable Integer weight) {
        this.backendService = backendService;
        this.headerAction = headerAction;
        this.weight = weight;
    }

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
    */
    public Optional<String> getBackendService() {
        return Optional.ofNullable(this.backendService);
    }
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderAction> getHeaderAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * Specifies the fraction of traffic sent to backendService, computed as
     * weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user's request
     * has been directed to a backendService, subsequent requests will be sent to the same backendService
     * as determined by the BackendService's session affinity policy.
     * The value must be between 0 and 1000
     * 
    */
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionWeightedBackendService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backendService;
        private @Nullable URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderAction headerAction;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionWeightedBackendService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder setBackendService(@Nullable String backendService) {
            this.backendService = backendService;
            return this;
        }

        public Builder setHeaderAction(@Nullable URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public URLMapPathMatcherDefaultRouteActionWeightedBackendService build() {
            return new URLMapPathMatcherDefaultRouteActionWeightedBackendService(backendService, headerAction, weight);
        }
    }
}
