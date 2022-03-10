// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherPathRuleRouteActionCorsPolicy {
    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials header.
     * 
     */
    private final @Nullable Boolean allowCredentials;
    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
     */
    private final @Nullable List<String> allowHeaders;
    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
     */
    private final @Nullable List<String> allowMethods;
    /**
     * Specifies the regular expression patterns that match allowed origins. For regular expression grammar
     * please see en.cppreference.com/w/cpp/regex/ecmascript
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    private final @Nullable List<String> allowOriginRegexes;
    /**
     * Specifies the list of origins that will be allowed to do CORS requests.
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    private final @Nullable List<String> allowOrigins;
    /**
     * If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    private final Boolean disabled;
    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
     */
    private final @Nullable List<String> exposeHeaders;
    /**
     * Specifies how long results of a preflight request can be cached in seconds.
     * This translates to the Access-Control-Max-Age header.
     * 
     */
    private final @Nullable Integer maxAge;

    @OutputCustomType.Constructor
    private URLMapPathMatcherPathRuleRouteActionCorsPolicy(
        @OutputCustomType.Parameter("allowCredentials") @Nullable Boolean allowCredentials,
        @OutputCustomType.Parameter("allowHeaders") @Nullable List<String> allowHeaders,
        @OutputCustomType.Parameter("allowMethods") @Nullable List<String> allowMethods,
        @OutputCustomType.Parameter("allowOriginRegexes") @Nullable List<String> allowOriginRegexes,
        @OutputCustomType.Parameter("allowOrigins") @Nullable List<String> allowOrigins,
        @OutputCustomType.Parameter("disabled") Boolean disabled,
        @OutputCustomType.Parameter("exposeHeaders") @Nullable List<String> exposeHeaders,
        @OutputCustomType.Parameter("maxAge") @Nullable Integer maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOriginRegexes = allowOriginRegexes;
        this.allowOrigins = allowOrigins;
        this.disabled = disabled;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = maxAge;
    }

    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials header.
     * 
    */
    public Optional<Boolean> getAllowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
    */
    public List<String> getAllowHeaders() {
        return this.allowHeaders == null ? List.of() : this.allowHeaders;
    }
    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
    */
    public List<String> getAllowMethods() {
        return this.allowMethods == null ? List.of() : this.allowMethods;
    }
    /**
     * Specifies the regular expression patterns that match allowed origins. For regular expression grammar
     * please see en.cppreference.com/w/cpp/regex/ecmascript
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
    */
    public List<String> getAllowOriginRegexes() {
        return this.allowOriginRegexes == null ? List.of() : this.allowOriginRegexes;
    }
    /**
     * Specifies the list of origins that will be allowed to do CORS requests.
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
    */
    public List<String> getAllowOrigins() {
        return this.allowOrigins == null ? List.of() : this.allowOrigins;
    }
    /**
     * If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }
    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
    */
    public List<String> getExposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    /**
     * Specifies how long results of a preflight request can be cached in seconds.
     * This translates to the Access-Control-Max-Age header.
     * 
    */
    public Optional<Integer> getMaxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionCorsPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowHeaders;
        private @Nullable List<String> allowMethods;
        private @Nullable List<String> allowOriginRegexes;
        private @Nullable List<String> allowOrigins;
        private Boolean disabled;
        private @Nullable List<String> exposeHeaders;
        private @Nullable Integer maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionCorsPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOriginRegexes = defaults.allowOriginRegexes;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder setAllowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder setAllowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }

        public Builder setAllowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }

        public Builder setAllowOriginRegexes(@Nullable List<String> allowOriginRegexes) {
            this.allowOriginRegexes = allowOriginRegexes;
            return this;
        }

        public Builder setAllowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setExposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder setMaxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public URLMapPathMatcherPathRuleRouteActionCorsPolicy build() {
            return new URLMapPathMatcherPathRuleRouteActionCorsPolicy(allowCredentials, allowHeaders, allowMethods, allowOriginRegexes, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
