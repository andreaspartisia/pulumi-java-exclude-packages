// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceConsistentHashHttpCookie;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionBackendServiceConsistentHash {
    /**
     * Hash is based on HTTP Cookie. This field describes a HTTP cookie
     * that will be used as the hash key for the consistent hash load
     * balancer. If the cookie is not present, it will be generated.
     * This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionBackendServiceConsistentHashHttpCookie httpCookie;
    /**
     * The hash based on the value of the specified header field.
     * This field is applicable if the sessionAffinity is set to HEADER_FIELD.
     * 
     */
    private final @Nullable String httpHeaderName;
    /**
     * The minimum number of virtual nodes to use for the hash ring.
     * Larger ring sizes result in more granular load
     * distributions. If the number of hosts in the load balancing pool
     * is larger than the ring size, each host will be assigned a single
     * virtual node.
     * Defaults to 1024.
     * 
     */
    private final @Nullable Integer minimumRingSize;

    @OutputCustomType.Constructor
    private RegionBackendServiceConsistentHash(
        @OutputCustomType.Parameter("httpCookie") @Nullable RegionBackendServiceConsistentHashHttpCookie httpCookie,
        @OutputCustomType.Parameter("httpHeaderName") @Nullable String httpHeaderName,
        @OutputCustomType.Parameter("minimumRingSize") @Nullable Integer minimumRingSize) {
        this.httpCookie = httpCookie;
        this.httpHeaderName = httpHeaderName;
        this.minimumRingSize = minimumRingSize;
    }

    /**
     * Hash is based on HTTP Cookie. This field describes a HTTP cookie
     * that will be used as the hash key for the consistent hash load
     * balancer. If the cookie is not present, it will be generated.
     * This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
     * Structure is documented below.
     * 
    */
    public Optional<RegionBackendServiceConsistentHashHttpCookie> getHttpCookie() {
        return Optional.ofNullable(this.httpCookie);
    }
    /**
     * The hash based on the value of the specified header field.
     * This field is applicable if the sessionAffinity is set to HEADER_FIELD.
     * 
    */
    public Optional<String> getHttpHeaderName() {
        return Optional.ofNullable(this.httpHeaderName);
    }
    /**
     * The minimum number of virtual nodes to use for the hash ring.
     * Larger ring sizes result in more granular load
     * distributions. If the number of hosts in the load balancing pool
     * is larger than the ring size, each host will be assigned a single
     * virtual node.
     * Defaults to 1024.
     * 
    */
    public Optional<Integer> getMinimumRingSize() {
        return Optional.ofNullable(this.minimumRingSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceConsistentHash defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionBackendServiceConsistentHashHttpCookie httpCookie;
        private @Nullable String httpHeaderName;
        private @Nullable Integer minimumRingSize;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceConsistentHash defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpCookie = defaults.httpCookie;
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.minimumRingSize = defaults.minimumRingSize;
        }

        public Builder setHttpCookie(@Nullable RegionBackendServiceConsistentHashHttpCookie httpCookie) {
            this.httpCookie = httpCookie;
            return this;
        }

        public Builder setHttpHeaderName(@Nullable String httpHeaderName) {
            this.httpHeaderName = httpHeaderName;
            return this;
        }

        public Builder setMinimumRingSize(@Nullable Integer minimumRingSize) {
            this.minimumRingSize = minimumRingSize;
            return this;
        }
        public RegionBackendServiceConsistentHash build() {
            return new RegionBackendServiceConsistentHash(httpCookie, httpHeaderName, minimumRingSize);
        }
    }
}
