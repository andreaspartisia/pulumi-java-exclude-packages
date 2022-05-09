// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticFrontendRequestDataMaskingHeader;
import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticFrontendRequestDataMaskingQueryParam;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApiDiagnosticFrontendRequestDataMasking {
    /**
     * @return A `headers` block as defined below.
     * 
     */
    private final @Nullable List<ApiDiagnosticFrontendRequestDataMaskingHeader> headers;
    /**
     * @return A `query_params` block as defined below.
     * 
     */
    private final @Nullable List<ApiDiagnosticFrontendRequestDataMaskingQueryParam> queryParams;

    @CustomType.Constructor
    private ApiDiagnosticFrontendRequestDataMasking(
        @CustomType.Parameter("headers") @Nullable List<ApiDiagnosticFrontendRequestDataMaskingHeader> headers,
        @CustomType.Parameter("queryParams") @Nullable List<ApiDiagnosticFrontendRequestDataMaskingQueryParam> queryParams) {
        this.headers = headers;
        this.queryParams = queryParams;
    }

    /**
     * @return A `headers` block as defined below.
     * 
     */
    public List<ApiDiagnosticFrontendRequestDataMaskingHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return A `query_params` block as defined below.
     * 
     */
    public List<ApiDiagnosticFrontendRequestDataMaskingQueryParam> queryParams() {
        return this.queryParams == null ? List.of() : this.queryParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDiagnosticFrontendRequestDataMasking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApiDiagnosticFrontendRequestDataMaskingHeader> headers;
        private @Nullable List<ApiDiagnosticFrontendRequestDataMaskingQueryParam> queryParams;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDiagnosticFrontendRequestDataMasking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.queryParams = defaults.queryParams;
        }

        public Builder headers(@Nullable List<ApiDiagnosticFrontendRequestDataMaskingHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(ApiDiagnosticFrontendRequestDataMaskingHeader... headers) {
            return headers(List.of(headers));
        }
        public Builder queryParams(@Nullable List<ApiDiagnosticFrontendRequestDataMaskingQueryParam> queryParams) {
            this.queryParams = queryParams;
            return this;
        }
        public Builder queryParams(ApiDiagnosticFrontendRequestDataMaskingQueryParam... queryParams) {
            return queryParams(List.of(queryParams));
        }        public ApiDiagnosticFrontendRequestDataMasking build() {
            return new ApiDiagnosticFrontendRequestDataMasking(headers, queryParams);
        }
    }
}
