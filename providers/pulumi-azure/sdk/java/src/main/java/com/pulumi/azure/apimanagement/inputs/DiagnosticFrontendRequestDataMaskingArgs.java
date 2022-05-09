// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingHeaderArgs;
import com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestDataMaskingQueryParamArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiagnosticFrontendRequestDataMaskingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticFrontendRequestDataMaskingArgs Empty = new DiagnosticFrontendRequestDataMaskingArgs();

    @Import(name="headers")
    private @Nullable Output<List<DiagnosticFrontendRequestDataMaskingHeaderArgs>> headers;

    public Optional<Output<List<DiagnosticFrontendRequestDataMaskingHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    @Import(name="queryParams")
    private @Nullable Output<List<DiagnosticFrontendRequestDataMaskingQueryParamArgs>> queryParams;

    public Optional<Output<List<DiagnosticFrontendRequestDataMaskingQueryParamArgs>>> queryParams() {
        return Optional.ofNullable(this.queryParams);
    }

    private DiagnosticFrontendRequestDataMaskingArgs() {}

    private DiagnosticFrontendRequestDataMaskingArgs(DiagnosticFrontendRequestDataMaskingArgs $) {
        this.headers = $.headers;
        this.queryParams = $.queryParams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticFrontendRequestDataMaskingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticFrontendRequestDataMaskingArgs $;

        public Builder() {
            $ = new DiagnosticFrontendRequestDataMaskingArgs();
        }

        public Builder(DiagnosticFrontendRequestDataMaskingArgs defaults) {
            $ = new DiagnosticFrontendRequestDataMaskingArgs(Objects.requireNonNull(defaults));
        }

        public Builder headers(@Nullable Output<List<DiagnosticFrontendRequestDataMaskingHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<DiagnosticFrontendRequestDataMaskingHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(DiagnosticFrontendRequestDataMaskingHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        public Builder queryParams(@Nullable Output<List<DiagnosticFrontendRequestDataMaskingQueryParamArgs>> queryParams) {
            $.queryParams = queryParams;
            return this;
        }

        public Builder queryParams(List<DiagnosticFrontendRequestDataMaskingQueryParamArgs> queryParams) {
            return queryParams(Output.of(queryParams));
        }

        public Builder queryParams(DiagnosticFrontendRequestDataMaskingQueryParamArgs... queryParams) {
            return queryParams(List.of(queryParams));
        }

        public DiagnosticFrontendRequestDataMaskingArgs build() {
            return $;
        }
    }

}
