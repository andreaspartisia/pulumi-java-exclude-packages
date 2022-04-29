// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWaasPolicyPolicyConfigLoadBalancingMethod {
    /**
     * @return The domain for which the cookie is set, defaults to WAAS policy domain.
     * 
     */
    private final String domain;
    /**
     * @return The time for which a browser should keep the cookie in seconds. Empty value will cause the cookie to expire at the end of a browser session.
     * 
     */
    private final Integer expirationTimeInSeconds;
    /**
     * @return Load balancing methods are algorithms used to efficiently distribute traffic among origin servers.
     * * **[IP_HASH](https://www.terraform.io/iaas/api/#/en/waas/latest/datatypes/IPHashLoadBalancingMethod):** All the incoming requests from the same client IP address should go to the same content origination server. IP_HASH load balancing method uses origin weights when choosing which origin should the hash be assigned to initially.
     * * **[ROUND_ROBIN](https://www.terraform.io/iaas/api/#/en/waas/latest/datatypes/RoundRobinLoadBalancingMethod):** Forwards requests sequentially to the available origin servers. The first request - to the first origin server, the second request - to the next origin server, and so on. After it sends a request to the last origin server, it starts again with the first origin server. When using weights on origins, Weighted Round Robin assigns more requests to origins with a greater weight. Over a period of time, origins will receive a number of requests in proportion to their weight.
     * * **[STICKY_COOKIE](https://www.terraform.io/iaas/api/#/en/waas/latest/datatypes/StickyCookieLoadBalancingMethod):** Adds a session cookie to the first response from the origin server and identifies the server that sent the response. The client&#39;s next request contains the cookie value, and nginx routes the request to the origin server that responded to the first request. STICKY_COOKIE load balancing method falls back to Round Robin for the first request.
     * 
     */
    private final String method;
    /**
     * @return The unique name of the whitelist.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetWaasPolicyPolicyConfigLoadBalancingMethod(
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("expirationTimeInSeconds") Integer expirationTimeInSeconds,
        @CustomType.Parameter("method") String method,
        @CustomType.Parameter("name") String name) {
        this.domain = domain;
        this.expirationTimeInSeconds = expirationTimeInSeconds;
        this.method = method;
        this.name = name;
    }

    /**
     * @return The domain for which the cookie is set, defaults to WAAS policy domain.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return The time for which a browser should keep the cookie in seconds. Empty value will cause the cookie to expire at the end of a browser session.
     * 
     */
    public Integer expirationTimeInSeconds() {
        return this.expirationTimeInSeconds;
    }
    /**
     * @return Load balancing methods are algorithms used to efficiently distribute traffic among origin servers.
     * * **[IP_HASH](https://www.terraform.io/iaas/api/#/en/waas/latest/datatypes/IPHashLoadBalancingMethod):** All the incoming requests from the same client IP address should go to the same content origination server. IP_HASH load balancing method uses origin weights when choosing which origin should the hash be assigned to initially.
     * * **[ROUND_ROBIN](https://www.terraform.io/iaas/api/#/en/waas/latest/datatypes/RoundRobinLoadBalancingMethod):** Forwards requests sequentially to the available origin servers. The first request - to the first origin server, the second request - to the next origin server, and so on. After it sends a request to the last origin server, it starts again with the first origin server. When using weights on origins, Weighted Round Robin assigns more requests to origins with a greater weight. Over a period of time, origins will receive a number of requests in proportion to their weight.
     * * **[STICKY_COOKIE](https://www.terraform.io/iaas/api/#/en/waas/latest/datatypes/StickyCookieLoadBalancingMethod):** Adds a session cookie to the first response from the origin server and identifies the server that sent the response. The client&#39;s next request contains the cookie value, and nginx routes the request to the origin server that responded to the first request. STICKY_COOKIE load balancing method falls back to Round Robin for the first request.
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return The unique name of the whitelist.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWaasPolicyPolicyConfigLoadBalancingMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;
        private Integer expirationTimeInSeconds;
        private String method;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWaasPolicyPolicyConfigLoadBalancingMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.expirationTimeInSeconds = defaults.expirationTimeInSeconds;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
        }

        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder expirationTimeInSeconds(Integer expirationTimeInSeconds) {
            this.expirationTimeInSeconds = Objects.requireNonNull(expirationTimeInSeconds);
            return this;
        }
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetWaasPolicyPolicyConfigLoadBalancingMethod build() {
            return new GetWaasPolicyPolicyConfigLoadBalancingMethod(domain, expirationTimeInSeconds, method, name);
        }
    }
}
