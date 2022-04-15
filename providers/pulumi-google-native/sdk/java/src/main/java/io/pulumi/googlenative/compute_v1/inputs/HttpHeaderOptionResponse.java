// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Specification determining how headers are added to requests or responses.
 * 
 */
public final class HttpHeaderOptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpHeaderOptionResponse Empty = new HttpHeaderOptionResponse();

    /**
     * The name of the header.
     * 
     */
    @Import(name="headerName", required=true)
      private final String headerName;

    public String headerName() {
        return this.headerName;
    }

    /**
     * The value of the header to add.
     * 
     */
    @Import(name="headerValue", required=true)
      private final String headerValue;

    public String headerValue() {
        return this.headerValue;
    }

    /**
     * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
     * 
     */
    @Import(name="replace", required=true)
      private final Boolean replace;

    public Boolean replace() {
        return this.replace;
    }

    public HttpHeaderOptionResponse(
        String headerName,
        String headerValue,
        Boolean replace) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.headerValue = Objects.requireNonNull(headerValue, "expected parameter 'headerValue' to be non-null");
        this.replace = Objects.requireNonNull(replace, "expected parameter 'replace' to be non-null");
    }

    private HttpHeaderOptionResponse() {
        this.headerName = null;
        this.headerValue = null;
        this.replace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;
        private String headerValue;
        private Boolean replace;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }
        public Builder replace(Boolean replace) {
            this.replace = Objects.requireNonNull(replace);
            return this;
        }        public HttpHeaderOptionResponse build() {
            return new HttpHeaderOptionResponse(headerName, headerValue, replace);
        }
    }
}
