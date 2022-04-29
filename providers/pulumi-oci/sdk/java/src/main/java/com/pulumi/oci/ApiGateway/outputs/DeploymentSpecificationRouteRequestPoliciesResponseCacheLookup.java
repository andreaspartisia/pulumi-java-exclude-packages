// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentSpecificationRouteRequestPoliciesResponseCacheLookup {
    /**
     * @return (Updatable) A list of context expressions whose values will be added to the base cache key. Values should contain an expression enclosed within ${} delimiters. Only the request context is available.
     * 
     */
    private final @Nullable List<String> cacheKeyAdditions;
    /**
     * @return (Updatable) Whether this policy is currently enabled.
     * 
     */
    private final @Nullable Boolean isEnabled;
    /**
     * @return (Updatable) Set true to allow caching responses where the request has an Authorization header. Ensure you have configured your  cache key additions to get the level of isolation across authenticated requests that you require.
     * 
     */
    private final @Nullable Boolean isPrivateCachingEnabled;
    /**
     * @return (Updatable) Type of the Response Cache Store Policy.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DeploymentSpecificationRouteRequestPoliciesResponseCacheLookup(
        @CustomType.Parameter("cacheKeyAdditions") @Nullable List<String> cacheKeyAdditions,
        @CustomType.Parameter("isEnabled") @Nullable Boolean isEnabled,
        @CustomType.Parameter("isPrivateCachingEnabled") @Nullable Boolean isPrivateCachingEnabled,
        @CustomType.Parameter("type") String type) {
        this.cacheKeyAdditions = cacheKeyAdditions;
        this.isEnabled = isEnabled;
        this.isPrivateCachingEnabled = isPrivateCachingEnabled;
        this.type = type;
    }

    /**
     * @return (Updatable) A list of context expressions whose values will be added to the base cache key. Values should contain an expression enclosed within ${} delimiters. Only the request context is available.
     * 
     */
    public List<String> cacheKeyAdditions() {
        return this.cacheKeyAdditions == null ? List.of() : this.cacheKeyAdditions;
    }
    /**
     * @return (Updatable) Whether this policy is currently enabled.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return (Updatable) Set true to allow caching responses where the request has an Authorization header. Ensure you have configured your  cache key additions to get the level of isolation across authenticated requests that you require.
     * 
     */
    public Optional<Boolean> isPrivateCachingEnabled() {
        return Optional.ofNullable(this.isPrivateCachingEnabled);
    }
    /**
     * @return (Updatable) Type of the Response Cache Store Policy.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpecificationRouteRequestPoliciesResponseCacheLookup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cacheKeyAdditions;
        private @Nullable Boolean isEnabled;
        private @Nullable Boolean isPrivateCachingEnabled;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpecificationRouteRequestPoliciesResponseCacheLookup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyAdditions = defaults.cacheKeyAdditions;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isPrivateCachingEnabled = defaults.isPrivateCachingEnabled;
    	      this.type = defaults.type;
        }

        public Builder cacheKeyAdditions(@Nullable List<String> cacheKeyAdditions) {
            this.cacheKeyAdditions = cacheKeyAdditions;
            return this;
        }
        public Builder cacheKeyAdditions(String... cacheKeyAdditions) {
            return cacheKeyAdditions(List.of(cacheKeyAdditions));
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder isPrivateCachingEnabled(@Nullable Boolean isPrivateCachingEnabled) {
            this.isPrivateCachingEnabled = isPrivateCachingEnabled;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DeploymentSpecificationRouteRequestPoliciesResponseCacheLookup build() {
            return new DeploymentSpecificationRouteRequestPoliciesResponseCacheLookup(cacheKeyAdditions, isEnabled, isPrivateCachingEnabled, type);
        }
    }
}
