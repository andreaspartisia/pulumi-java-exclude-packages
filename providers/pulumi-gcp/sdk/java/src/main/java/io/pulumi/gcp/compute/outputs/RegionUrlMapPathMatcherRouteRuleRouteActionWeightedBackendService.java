// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService {
    /**
     * The default RegionBackendService resource. Before
     * forwarding the request to backendService, the loadbalancer applies any relevant
     * headerActions specified as part of this backendServiceWeight.
     * 
     */
    private final String backendService;
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction headerAction;
    /**
     * Specifies the fraction of traffic sent to backendService, computed as weight /
     * (sum of all weightedBackendService weights in routeAction) . The selection of a
     * backend service is determined only for new traffic. Once a user's request has
     * been directed to a backendService, subsequent requests will be sent to the same
     * backendService as determined by the BackendService's session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    private final Integer weight;

    @OutputCustomType.Constructor({"backendService","headerAction","weight"})
    private RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService(
        String backendService,
        @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction headerAction,
        Integer weight) {
        this.backendService = Objects.requireNonNull(backendService);
        this.headerAction = headerAction;
        this.weight = Objects.requireNonNull(weight);
    }

    /**
     * The default RegionBackendService resource. Before
     * forwarding the request to backendService, the loadbalancer applies any relevant
     * headerActions specified as part of this backendServiceWeight.
     * 
     */
    public String getBackendService() {
        return this.backendService;
    }
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction> getHeaderAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * Specifies the fraction of traffic sent to backendService, computed as weight /
     * (sum of all weightedBackendService weights in routeAction) . The selection of a
     * backend service is determined only for new traffic. Once a user's request has
     * been directed to a backendService, subsequent requests will be sent to the same
     * backendService as determined by the BackendService's session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction headerAction;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setHeaderAction(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendService(backendService, headerAction, weight);
        }
    }
}