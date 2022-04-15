// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v3.inputs.BasicAuthenticationResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Information involved in an HTTP/HTTPS Uptime check request.
 * 
 */
public final class HttpCheckResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpCheckResponse Empty = new HttpCheckResponse();

    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * 
     */
    @Import(name="authInfo", required=true)
      private final BasicAuthenticationResponse authInfo;

    public BasicAuthenticationResponse authInfo() {
        return this.authInfo;
    }

    /**
     * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the request_method is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte.Note: If client libraries aren't used (which performs the conversion automatically) base64 encode your body data since the field is of bytes type.
     * 
     */
    @Import(name="body", required=true)
      private final String body;

    public String body() {
        return this.body;
    }

    /**
     * The content type header to use for the check. The following configurations result in errors: 1. Content type is specified in both the headers field and the content_type field. 2. Request method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header is provided via headers field. The content_type field should be used instead.
     * 
     */
    @Import(name="contentType", required=true)
      private final String contentType;

    public String contentType() {
        return this.contentType;
    }

    /**
     * The list of headers to send as part of the Uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    @Import(name="headers", required=true)
      private final Map<String,String> headers;

    public Map<String,String> headers() {
        return this.headers;
    }

    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to true then the headers will be obscured with ******.
     * 
     */
    @Import(name="maskHeaders", required=true)
      private final Boolean maskHeaders;

    public Boolean maskHeaders() {
        return this.maskHeaders;
    }

    /**
     * Optional (defaults to "/"). The path to the page against which to run the check. Will be combined with the host (specified within the monitored_resource) and port to construct the full URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String path() {
        return this.path;
    }

    /**
     * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on the HTTP server against which to run the check. Will be combined with host (specified within the monitored_resource) and path to construct the full URL.
     * 
     */
    @Import(name="port", required=true)
      private final Integer port;

    public Integer port() {
        return this.port;
    }

    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method defaults to GET.
     * 
     */
    @Import(name="requestMethod", required=true)
      private final String requestMethod;

    public String requestMethod() {
        return this.requestMethod;
    }

    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    @Import(name="useSsl", required=true)
      private final Boolean useSsl;

    public Boolean useSsl() {
        return this.useSsl;
    }

    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false, setting validate_ssl to true has no effect.
     * 
     */
    @Import(name="validateSsl", required=true)
      private final Boolean validateSsl;

    public Boolean validateSsl() {
        return this.validateSsl;
    }

    public HttpCheckResponse(
        BasicAuthenticationResponse authInfo,
        String body,
        String contentType,
        Map<String,String> headers,
        Boolean maskHeaders,
        String path,
        Integer port,
        String requestMethod,
        Boolean useSsl,
        Boolean validateSsl) {
        this.authInfo = Objects.requireNonNull(authInfo, "expected parameter 'authInfo' to be non-null");
        this.body = Objects.requireNonNull(body, "expected parameter 'body' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.headers = Objects.requireNonNull(headers, "expected parameter 'headers' to be non-null");
        this.maskHeaders = Objects.requireNonNull(maskHeaders, "expected parameter 'maskHeaders' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.requestMethod = Objects.requireNonNull(requestMethod, "expected parameter 'requestMethod' to be non-null");
        this.useSsl = Objects.requireNonNull(useSsl, "expected parameter 'useSsl' to be non-null");
        this.validateSsl = Objects.requireNonNull(validateSsl, "expected parameter 'validateSsl' to be non-null");
    }

    private HttpCheckResponse() {
        this.authInfo = null;
        this.body = null;
        this.contentType = null;
        this.headers = Map.of();
        this.maskHeaders = null;
        this.path = null;
        this.port = null;
        this.requestMethod = null;
        this.useSsl = null;
        this.validateSsl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAuthenticationResponse authInfo;
        private String body;
        private String contentType;
        private Map<String,String> headers;
        private Boolean maskHeaders;
        private String path;
        private Integer port;
        private String requestMethod;
        private Boolean useSsl;
        private Boolean validateSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authInfo = defaults.authInfo;
    	      this.body = defaults.body;
    	      this.contentType = defaults.contentType;
    	      this.headers = defaults.headers;
    	      this.maskHeaders = defaults.maskHeaders;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.requestMethod = defaults.requestMethod;
    	      this.useSsl = defaults.useSsl;
    	      this.validateSsl = defaults.validateSsl;
        }

        public Builder authInfo(BasicAuthenticationResponse authInfo) {
            this.authInfo = Objects.requireNonNull(authInfo);
            return this;
        }
        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder headers(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder maskHeaders(Boolean maskHeaders) {
            this.maskHeaders = Objects.requireNonNull(maskHeaders);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder requestMethod(String requestMethod) {
            this.requestMethod = Objects.requireNonNull(requestMethod);
            return this;
        }
        public Builder useSsl(Boolean useSsl) {
            this.useSsl = Objects.requireNonNull(useSsl);
            return this;
        }
        public Builder validateSsl(Boolean validateSsl) {
            this.validateSsl = Objects.requireNonNull(validateSsl);
            return this;
        }        public HttpCheckResponse build() {
            return new HttpCheckResponse(authInfo, body, contentType, headers, maskHeaders, path, port, requestMethod, useSsl, validateSsl);
        }
    }
}
