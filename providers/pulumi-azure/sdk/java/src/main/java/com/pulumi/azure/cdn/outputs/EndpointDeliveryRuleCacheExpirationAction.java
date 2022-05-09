// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeliveryRuleCacheExpirationAction {
    /**
     * @return The behavior of the cache. Valid values are `BypassCache`, `Override` and `SetIfMissing`.
     * 
     */
    private final String behavior;
    /**
     * @return Duration of the cache. Only allowed when `behavior` is set to `Override` or `SetIfMissing`. Format: `[d.]hh:mm:ss`
     * 
     */
    private final @Nullable String duration;

    @CustomType.Constructor
    private EndpointDeliveryRuleCacheExpirationAction(
        @CustomType.Parameter("behavior") String behavior,
        @CustomType.Parameter("duration") @Nullable String duration) {
        this.behavior = behavior;
        this.duration = duration;
    }

    /**
     * @return The behavior of the cache. Valid values are `BypassCache`, `Override` and `SetIfMissing`.
     * 
     */
    public String behavior() {
        return this.behavior;
    }
    /**
     * @return Duration of the cache. Only allowed when `behavior` is set to `Override` or `SetIfMissing`. Format: `[d.]hh:mm:ss`
     * 
     */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeliveryRuleCacheExpirationAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String behavior;
        private @Nullable String duration;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeliveryRuleCacheExpirationAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.duration = defaults.duration;
        }

        public Builder behavior(String behavior) {
            this.behavior = Objects.requireNonNull(behavior);
            return this;
        }
        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }        public EndpointDeliveryRuleCacheExpirationAction build() {
            return new EndpointDeliveryRuleCacheExpirationAction(behavior, duration);
        }
    }
}
