// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticFrontendResponseDataMaskingHeader;
import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticFrontendResponseDataMaskingQueryParam;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApiDiagnosticFrontendResponseDataMasking {
    /**
     * @return A `headers` block as defined below.
     * 
     */
    private final @Nullable List<ApiDiagnosticFrontendResponseDataMaskingHeader> headers;
    /**
     * @return A `query_params` block as defined below.
     * 
     */
    private final @Nullable List<ApiDiagnosticFrontendResponseDataMaskingQueryParam> queryParams;

    @CustomType.Constructor
    private ApiDiagnosticFrontendResponseDataMasking(
        @CustomType.Parameter("headers") @Nullable List<ApiDiagnosticFrontendResponseDataMaskingHeader> headers,
        @CustomType.Parameter("queryParams") @Nullable List<ApiDiagnosticFrontendResponseDataMaskingQueryParam> queryParams) {
        this.headers = headers;
        this.queryParams = queryParams;
    }

    /**
     * @return A `headers` block as defined below.
     * 
     */
    public List<ApiDiagnosticFrontendResponseDataMaskingHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return A `query_params` block as defined below.
     * 
     */
    public List<ApiDiagnosticFrontendResponseDataMaskingQueryParam> queryParams() {
        return this.queryParams == null ? List.of() : this.queryParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDiagnosticFrontendResponseDataMasking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApiDiagnosticFrontendResponseDataMaskingHeader> headers;
        private @Nullable List<ApiDiagnosticFrontendResponseDataMaskingQueryParam> queryParams;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDiagnosticFrontendResponseDataMasking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.queryParams = defaults.queryParams;
        }

        public Builder headers(@Nullable List<ApiDiagnosticFrontendResponseDataMaskingHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(ApiDiagnosticFrontendResponseDataMaskingHeader... headers) {
            return headers(List.of(headers));
        }
        public Builder queryParams(@Nullable List<ApiDiagnosticFrontendResponseDataMaskingQueryParam> queryParams) {
            this.queryParams = queryParams;
            return this;
        }
        public Builder queryParams(ApiDiagnosticFrontendResponseDataMaskingQueryParam... queryParams) {
            return queryParams(List.of(queryParams));
        }        public ApiDiagnosticFrontendResponseDataMasking build() {
            return new ApiDiagnosticFrontendResponseDataMasking(headers, queryParams);
        }
    }
}
