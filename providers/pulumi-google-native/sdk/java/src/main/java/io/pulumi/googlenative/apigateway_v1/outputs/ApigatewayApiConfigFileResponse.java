// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApigatewayApiConfigFileResponse {
    /**
     * The bytes that constitute the file.
     * 
     */
    private final String contents;
    /**
     * The file path (full or relative path). This is typically the path of the file when it is uploaded.
     * 
     */
    private final String path;

    @CustomType.Constructor
    private ApigatewayApiConfigFileResponse(
        @CustomType.Parameter("contents") String contents,
        @CustomType.Parameter("path") String path) {
        this.contents = contents;
        this.path = path;
    }

    /**
     * The bytes that constitute the file.
     * 
    */
    public String contents() {
        return this.contents;
    }
    /**
     * The file path (full or relative path). This is typically the path of the file when it is uploaded.
     * 
    */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contents;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.path = defaults.path;
        }

        public Builder contents(String contents) {
            this.contents = Objects.requireNonNull(contents);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public ApigatewayApiConfigFileResponse build() {
            return new ApigatewayApiConfigFileResponse(contents, path);
        }
    }
}
