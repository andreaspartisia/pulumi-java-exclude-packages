// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceCdnPolicyCacheKeyPolicy;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceCdnPolicyNegativeCachingPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionBackendServiceCdnPolicy {
    /**
     * The CacheKeyPolicy for this CdnPolicy.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionBackendServiceCdnPolicyCacheKeyPolicy cacheKeyPolicy;
    /**
     * Specifies the cache setting for all responses from this backend.
     * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
     * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
     * 
     */
    private final @Nullable String cacheMode;
    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    private final @Nullable Integer clientTtl;
    /**
     * Specifies the default TTL for cached content served by this origin for responses
     * that do not have an existing valid TTL (max-age or s-max-age).
     * 
     */
    private final @Nullable Integer defaultTtl;
    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    private final @Nullable Integer maxTtl;
    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
     * 
     */
    private final @Nullable Boolean negativeCaching;
    /**
     * Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN's default cache TTLs.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionBackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;
    /**
     * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
     * 
     */
    private final @Nullable Integer serveWhileStale;
    /**
     * Maximum number of seconds the response to a signed URL request
     * will be considered fresh, defaults to 1hr (3600s). After this
     * time period, the response will be revalidated before
     * being served.
     * When serving responses to signed URL requests, Cloud CDN will
     * internally behave as though all responses from this backend had a
     * "Cache-Control: public, max-age=[TTL]" header, regardless of any
     * existing Cache-Control header. The actual headers served in
     * responses will not be altered.
     * 
     */
    private final @Nullable Integer signedUrlCacheMaxAgeSec;

    @OutputCustomType.Constructor
    private RegionBackendServiceCdnPolicy(
        @OutputCustomType.Parameter("cacheKeyPolicy") @Nullable RegionBackendServiceCdnPolicyCacheKeyPolicy cacheKeyPolicy,
        @OutputCustomType.Parameter("cacheMode") @Nullable String cacheMode,
        @OutputCustomType.Parameter("clientTtl") @Nullable Integer clientTtl,
        @OutputCustomType.Parameter("defaultTtl") @Nullable Integer defaultTtl,
        @OutputCustomType.Parameter("maxTtl") @Nullable Integer maxTtl,
        @OutputCustomType.Parameter("negativeCaching") @Nullable Boolean negativeCaching,
        @OutputCustomType.Parameter("negativeCachingPolicies") @Nullable List<RegionBackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicies,
        @OutputCustomType.Parameter("serveWhileStale") @Nullable Integer serveWhileStale,
        @OutputCustomType.Parameter("signedUrlCacheMaxAgeSec") @Nullable Integer signedUrlCacheMaxAgeSec) {
        this.cacheKeyPolicy = cacheKeyPolicy;
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicies = negativeCachingPolicies;
        this.serveWhileStale = serveWhileStale;
        this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    }

    /**
     * The CacheKeyPolicy for this CdnPolicy.
     * Structure is documented below.
     * 
    */
    public Optional<RegionBackendServiceCdnPolicyCacheKeyPolicy> getCacheKeyPolicy() {
        return Optional.ofNullable(this.cacheKeyPolicy);
    }
    /**
     * Specifies the cache setting for all responses from this backend.
     * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
     * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
     * 
    */
    public Optional<String> getCacheMode() {
        return Optional.ofNullable(this.cacheMode);
    }
    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
    */
    public Optional<Integer> getClientTtl() {
        return Optional.ofNullable(this.clientTtl);
    }
    /**
     * Specifies the default TTL for cached content served by this origin for responses
     * that do not have an existing valid TTL (max-age or s-max-age).
     * 
    */
    public Optional<Integer> getDefaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
    */
    public Optional<Integer> getMaxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }
    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
     * 
    */
    public Optional<Boolean> getNegativeCaching() {
        return Optional.ofNullable(this.negativeCaching);
    }
    /**
     * Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN's default cache TTLs.
     * Structure is documented below.
     * 
    */
    public List<RegionBackendServiceCdnPolicyNegativeCachingPolicy> getNegativeCachingPolicies() {
        return this.negativeCachingPolicies == null ? List.of() : this.negativeCachingPolicies;
    }
    /**
     * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
     * 
    */
    public Optional<Integer> getServeWhileStale() {
        return Optional.ofNullable(this.serveWhileStale);
    }
    /**
     * Maximum number of seconds the response to a signed URL request
     * will be considered fresh, defaults to 1hr (3600s). After this
     * time period, the response will be revalidated before
     * being served.
     * When serving responses to signed URL requests, Cloud CDN will
     * internally behave as though all responses from this backend had a
     * "Cache-Control: public, max-age=[TTL]" header, regardless of any
     * existing Cache-Control header. The actual headers served in
     * responses will not be altered.
     * 
    */
    public Optional<Integer> getSignedUrlCacheMaxAgeSec() {
        return Optional.ofNullable(this.signedUrlCacheMaxAgeSec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceCdnPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionBackendServiceCdnPolicyCacheKeyPolicy cacheKeyPolicy;
        private @Nullable String cacheMode;
        private @Nullable Integer clientTtl;
        private @Nullable Integer defaultTtl;
        private @Nullable Integer maxTtl;
        private @Nullable Boolean negativeCaching;
        private @Nullable List<RegionBackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;
        private @Nullable Integer serveWhileStale;
        private @Nullable Integer signedUrlCacheMaxAgeSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceCdnPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyPolicy = defaults.cacheKeyPolicy;
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicies = defaults.negativeCachingPolicies;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
        }

        public Builder setCacheKeyPolicy(@Nullable RegionBackendServiceCdnPolicyCacheKeyPolicy cacheKeyPolicy) {
            this.cacheKeyPolicy = cacheKeyPolicy;
            return this;
        }

        public Builder setCacheMode(@Nullable String cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }

        public Builder setClientTtl(@Nullable Integer clientTtl) {
            this.clientTtl = clientTtl;
            return this;
        }

        public Builder setDefaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder setMaxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        public Builder setNegativeCaching(@Nullable Boolean negativeCaching) {
            this.negativeCaching = negativeCaching;
            return this;
        }

        public Builder setNegativeCachingPolicies(@Nullable List<RegionBackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicies) {
            this.negativeCachingPolicies = negativeCachingPolicies;
            return this;
        }

        public Builder setServeWhileStale(@Nullable Integer serveWhileStale) {
            this.serveWhileStale = serveWhileStale;
            return this;
        }

        public Builder setSignedUrlCacheMaxAgeSec(@Nullable Integer signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
            return this;
        }
        public RegionBackendServiceCdnPolicy build() {
            return new RegionBackendServiceCdnPolicy(cacheKeyPolicy, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicies, serveWhileStale, signedUrlCacheMaxAgeSec);
        }
    }
}
