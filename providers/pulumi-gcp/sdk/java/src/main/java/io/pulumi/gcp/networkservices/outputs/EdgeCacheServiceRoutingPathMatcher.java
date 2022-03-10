// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeCacheServiceRoutingPathMatcher {
    /**
     * A human-readable description of the resource.
     * 
     */
    private final @Nullable String description;
    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    private final String name;
    /**
     * The routeRules to match against. routeRules support advanced routing behaviour, and can match on paths, headers and query parameters, as well as status codes and HTTP methods.
     * Structure is documented below.
     * 
     */
    private final List<EdgeCacheServiceRoutingPathMatcherRouteRule> routeRules;

    @OutputCustomType.Constructor
    private EdgeCacheServiceRoutingPathMatcher(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("routeRules") List<EdgeCacheServiceRoutingPathMatcherRouteRule> routeRules) {
        this.description = description;
        this.name = name;
        this.routeRules = routeRules;
    }

    /**
     * A human-readable description of the resource.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The routeRules to match against. routeRules support advanced routing behaviour, and can match on paths, headers and query parameters, as well as status codes and HTTP methods.
     * Structure is documented below.
     * 
    */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRule> getRouteRules() {
        return this.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcher defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String name;
        private List<EdgeCacheServiceRoutingPathMatcherRouteRule> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.routeRules = defaults.routeRules;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRouteRules(List<EdgeCacheServiceRoutingPathMatcherRouteRule> routeRules) {
            this.routeRules = Objects.requireNonNull(routeRules);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcher build() {
            return new EdgeCacheServiceRoutingPathMatcher(description, name, routeRules);
        }
    }
}
