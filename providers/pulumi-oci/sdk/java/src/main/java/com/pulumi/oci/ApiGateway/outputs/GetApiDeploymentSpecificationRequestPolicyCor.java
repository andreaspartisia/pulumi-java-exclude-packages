// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApiDeploymentSpecificationRequestPolicyCor {
    /**
     * @return The list of headers that will be allowed from the client via the Access-Control-Allow-Headers header. &#39;*&#39; will allow all headers.
     * 
     */
    private final List<String> allowedHeaders;
    /**
     * @return The list of allowed HTTP methods that will be returned for the preflight OPTIONS request in the Access-Control-Allow-Methods header. &#39;*&#39; will allow all methods.
     * 
     */
    private final List<String> allowedMethods;
    /**
     * @return The list of allowed origins that the CORS handler will use to respond to CORS requests. The gateway will send the Access-Control-Allow-Origin header with the best origin match for the circumstances. &#39;*&#39; will match any origins, and &#39;null&#39; will match queries from &#39;file:&#39; origins. All other origins must be qualified with the scheme, full hostname, and port if necessary.
     * 
     */
    private final List<String> allowedOrigins;
    /**
     * @return The list of headers that the client will be allowed to see from the response as indicated by the Access-Control-Expose-Headers header. &#39;*&#39; will expose all headers.
     * 
     */
    private final List<String> exposedHeaders;
    /**
     * @return Whether to send the Access-Control-Allow-Credentials header to allow CORS requests with cookies.
     * 
     */
    private final Boolean isAllowCredentialsEnabled;
    /**
     * @return The time in seconds for the client to cache preflight responses. This is sent as the Access-Control-Max-Age if greater than 0.
     * 
     */
    private final Integer maxAgeInSeconds;

    @CustomType.Constructor
    private GetApiDeploymentSpecificationRequestPolicyCor(
        @CustomType.Parameter("allowedHeaders") List<String> allowedHeaders,
        @CustomType.Parameter("allowedMethods") List<String> allowedMethods,
        @CustomType.Parameter("allowedOrigins") List<String> allowedOrigins,
        @CustomType.Parameter("exposedHeaders") List<String> exposedHeaders,
        @CustomType.Parameter("isAllowCredentialsEnabled") Boolean isAllowCredentialsEnabled,
        @CustomType.Parameter("maxAgeInSeconds") Integer maxAgeInSeconds) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = allowedMethods;
        this.allowedOrigins = allowedOrigins;
        this.exposedHeaders = exposedHeaders;
        this.isAllowCredentialsEnabled = isAllowCredentialsEnabled;
        this.maxAgeInSeconds = maxAgeInSeconds;
    }

    /**
     * @return The list of headers that will be allowed from the client via the Access-Control-Allow-Headers header. &#39;*&#39; will allow all headers.
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }
    /**
     * @return The list of allowed HTTP methods that will be returned for the preflight OPTIONS request in the Access-Control-Allow-Methods header. &#39;*&#39; will allow all methods.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }
    /**
     * @return The list of allowed origins that the CORS handler will use to respond to CORS requests. The gateway will send the Access-Control-Allow-Origin header with the best origin match for the circumstances. &#39;*&#39; will match any origins, and &#39;null&#39; will match queries from &#39;file:&#39; origins. All other origins must be qualified with the scheme, full hostname, and port if necessary.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return The list of headers that the client will be allowed to see from the response as indicated by the Access-Control-Expose-Headers header. &#39;*&#39; will expose all headers.
     * 
     */
    public List<String> exposedHeaders() {
        return this.exposedHeaders;
    }
    /**
     * @return Whether to send the Access-Control-Allow-Credentials header to allow CORS requests with cookies.
     * 
     */
    public Boolean isAllowCredentialsEnabled() {
        return this.isAllowCredentialsEnabled;
    }
    /**
     * @return The time in seconds for the client to cache preflight responses. This is sent as the Access-Control-Max-Age if greater than 0.
     * 
     */
    public Integer maxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiDeploymentSpecificationRequestPolicyCor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private List<String> exposedHeaders;
        private Boolean isAllowCredentialsEnabled;
        private Integer maxAgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiDeploymentSpecificationRequestPolicyCor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.isAllowCredentialsEnabled = defaults.isAllowCredentialsEnabled;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        public Builder allowedHeaders(List<String> allowedHeaders) {
            this.allowedHeaders = Objects.requireNonNull(allowedHeaders);
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        public Builder exposedHeaders(List<String> exposedHeaders) {
            this.exposedHeaders = Objects.requireNonNull(exposedHeaders);
            return this;
        }
        public Builder exposedHeaders(String... exposedHeaders) {
            return exposedHeaders(List.of(exposedHeaders));
        }
        public Builder isAllowCredentialsEnabled(Boolean isAllowCredentialsEnabled) {
            this.isAllowCredentialsEnabled = Objects.requireNonNull(isAllowCredentialsEnabled);
            return this;
        }
        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds);
            return this;
        }        public GetApiDeploymentSpecificationRequestPolicyCor build() {
            return new GetApiDeploymentSpecificationRequestPolicyCor(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, isAllowCredentialsEnabled, maxAgeInSeconds);
        }
    }
}
