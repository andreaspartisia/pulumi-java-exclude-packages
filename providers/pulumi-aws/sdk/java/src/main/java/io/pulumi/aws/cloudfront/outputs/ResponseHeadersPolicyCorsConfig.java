// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicyCorsConfigAccessControlAllowHeaders;
import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicyCorsConfigAccessControlAllowMethods;
import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicyCorsConfigAccessControlAllowOrigins;
import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicyCorsConfigAccessControlExposeHeaders;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResponseHeadersPolicyCorsConfig {
    /**
     * A Boolean value that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP response header.
     * 
     */
    private final Boolean accessControlAllowCredentials;
    /**
     * Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the `Access-Control-Allow-Headers` HTTP response header.
     * 
     */
    private final ResponseHeadersPolicyCorsConfigAccessControlAllowHeaders accessControlAllowHeaders;
    /**
     * Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods` HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
     */
    private final ResponseHeadersPolicyCorsConfigAccessControlAllowMethods accessControlAllowMethods;
    /**
     * Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the `Access-Control-Allow-Origin` HTTP response header.
     * 
     */
    private final ResponseHeadersPolicyCorsConfigAccessControlAllowOrigins accessControlAllowOrigins;
    /**
     * Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the `Access-Control-Expose-Headers` HTTP response header.
     * 
     */
    private final @Nullable ResponseHeadersPolicyCorsConfigAccessControlExposeHeaders accessControlExposeHeaders;
    /**
     * A number that CloudFront uses as the value for the `max-age` directive in the `Strict-Transport-Security` HTTP response header.
     * 
     */
    private final @Nullable Integer accessControlMaxAgeSec;
    /**
     * A Boolean value that determines how CloudFront behaves for the HTTP response header.
     * 
     */
    private final Boolean originOverride;

    @OutputCustomType.Constructor
    private ResponseHeadersPolicyCorsConfig(
        @OutputCustomType.Parameter("accessControlAllowCredentials") Boolean accessControlAllowCredentials,
        @OutputCustomType.Parameter("accessControlAllowHeaders") ResponseHeadersPolicyCorsConfigAccessControlAllowHeaders accessControlAllowHeaders,
        @OutputCustomType.Parameter("accessControlAllowMethods") ResponseHeadersPolicyCorsConfigAccessControlAllowMethods accessControlAllowMethods,
        @OutputCustomType.Parameter("accessControlAllowOrigins") ResponseHeadersPolicyCorsConfigAccessControlAllowOrigins accessControlAllowOrigins,
        @OutputCustomType.Parameter("accessControlExposeHeaders") @Nullable ResponseHeadersPolicyCorsConfigAccessControlExposeHeaders accessControlExposeHeaders,
        @OutputCustomType.Parameter("accessControlMaxAgeSec") @Nullable Integer accessControlMaxAgeSec,
        @OutputCustomType.Parameter("originOverride") Boolean originOverride) {
        this.accessControlAllowCredentials = accessControlAllowCredentials;
        this.accessControlAllowHeaders = accessControlAllowHeaders;
        this.accessControlAllowMethods = accessControlAllowMethods;
        this.accessControlAllowOrigins = accessControlAllowOrigins;
        this.accessControlExposeHeaders = accessControlExposeHeaders;
        this.accessControlMaxAgeSec = accessControlMaxAgeSec;
        this.originOverride = originOverride;
    }

    /**
     * A Boolean value that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP response header.
     * 
    */
    public Boolean getAccessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }
    /**
     * Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the `Access-Control-Allow-Headers` HTTP response header.
     * 
    */
    public ResponseHeadersPolicyCorsConfigAccessControlAllowHeaders getAccessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }
    /**
     * Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods` HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
    */
    public ResponseHeadersPolicyCorsConfigAccessControlAllowMethods getAccessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }
    /**
     * Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the `Access-Control-Allow-Origin` HTTP response header.
     * 
    */
    public ResponseHeadersPolicyCorsConfigAccessControlAllowOrigins getAccessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }
    /**
     * Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the `Access-Control-Expose-Headers` HTTP response header.
     * 
    */
    public Optional<ResponseHeadersPolicyCorsConfigAccessControlExposeHeaders> getAccessControlExposeHeaders() {
        return Optional.ofNullable(this.accessControlExposeHeaders);
    }
    /**
     * A number that CloudFront uses as the value for the `max-age` directive in the `Strict-Transport-Security` HTTP response header.
     * 
    */
    public Optional<Integer> getAccessControlMaxAgeSec() {
        return Optional.ofNullable(this.accessControlMaxAgeSec);
    }
    /**
     * A Boolean value that determines how CloudFront behaves for the HTTP response header.
     * 
    */
    public Boolean getOriginOverride() {
        return this.originOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCorsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean accessControlAllowCredentials;
        private ResponseHeadersPolicyCorsConfigAccessControlAllowHeaders accessControlAllowHeaders;
        private ResponseHeadersPolicyCorsConfigAccessControlAllowMethods accessControlAllowMethods;
        private ResponseHeadersPolicyCorsConfigAccessControlAllowOrigins accessControlAllowOrigins;
        private @Nullable ResponseHeadersPolicyCorsConfigAccessControlExposeHeaders accessControlExposeHeaders;
        private @Nullable Integer accessControlMaxAgeSec;
        private Boolean originOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCorsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAllowCredentials = defaults.accessControlAllowCredentials;
    	      this.accessControlAllowHeaders = defaults.accessControlAllowHeaders;
    	      this.accessControlAllowMethods = defaults.accessControlAllowMethods;
    	      this.accessControlAllowOrigins = defaults.accessControlAllowOrigins;
    	      this.accessControlExposeHeaders = defaults.accessControlExposeHeaders;
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.originOverride = defaults.originOverride;
        }

        public Builder setAccessControlAllowCredentials(Boolean accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials);
            return this;
        }

        public Builder setAccessControlAllowHeaders(ResponseHeadersPolicyCorsConfigAccessControlAllowHeaders accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders);
            return this;
        }

        public Builder setAccessControlAllowMethods(ResponseHeadersPolicyCorsConfigAccessControlAllowMethods accessControlAllowMethods) {
            this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods);
            return this;
        }

        public Builder setAccessControlAllowOrigins(ResponseHeadersPolicyCorsConfigAccessControlAllowOrigins accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins);
            return this;
        }

        public Builder setAccessControlExposeHeaders(@Nullable ResponseHeadersPolicyCorsConfigAccessControlExposeHeaders accessControlExposeHeaders) {
            this.accessControlExposeHeaders = accessControlExposeHeaders;
            return this;
        }

        public Builder setAccessControlMaxAgeSec(@Nullable Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = accessControlMaxAgeSec;
            return this;
        }

        public Builder setOriginOverride(Boolean originOverride) {
            this.originOverride = Objects.requireNonNull(originOverride);
            return this;
        }
        public ResponseHeadersPolicyCorsConfig build() {
            return new ResponseHeadersPolicyCorsConfig(accessControlAllowCredentials, accessControlAllowHeaders, accessControlAllowMethods, accessControlAllowOrigins, accessControlExposeHeaders, accessControlMaxAgeSec, originOverride);
        }
    }
}