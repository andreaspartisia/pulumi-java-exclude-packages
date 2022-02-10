// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.HTTPHeaderResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class HTTPGetActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final HTTPGetActionResponse Empty = new HTTPGetActionResponse();

    @InputImport(name="host", required=true)
    private final String host;

    public String getHost() {
        return this.host;
    }

    @InputImport(name="httpHeaders", required=true)
    private final List<HTTPHeaderResponse> httpHeaders;

    public List<HTTPHeaderResponse> getHttpHeaders() {
        return this.httpHeaders;
    }

    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    @InputImport(name="scheme", required=true)
    private final String scheme;

    public String getScheme() {
        return this.scheme;
    }

    public HTTPGetActionResponse(
        String host,
        List<HTTPHeaderResponse> httpHeaders,
        String path,
        String scheme) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.httpHeaders = Objects.requireNonNull(httpHeaders, "expected parameter 'httpHeaders' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.scheme = Objects.requireNonNull(scheme, "expected parameter 'scheme' to be non-null");
    }

    private HTTPGetActionResponse() {
        this.host = null;
        this.httpHeaders = List.of();
        this.path = null;
        this.scheme = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPGetActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private List<HTTPHeaderResponse> httpHeaders;
        private String path;
        private String scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPGetActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
    	      this.scheme = defaults.scheme;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHttpHeaders(List<HTTPHeaderResponse> httpHeaders) {
            this.httpHeaders = Objects.requireNonNull(httpHeaders);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setScheme(String scheme) {
            this.scheme = Objects.requireNonNull(scheme);
            return this;
        }

        public HTTPGetActionResponse build() {
            return new HTTPGetActionResponse(host, httpHeaders, path, scheme);
        }
    }
}