// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayApiConfigFileResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ApigatewayApiConfigGrpcServiceDefinitionResponse {
    private final ApigatewayApiConfigFileResponse fileDescriptorSet;
    private final List<ApigatewayApiConfigFileResponse> source;

    @OutputCustomType.Constructor({"fileDescriptorSet","source"})
    private ApigatewayApiConfigGrpcServiceDefinitionResponse(
        ApigatewayApiConfigFileResponse fileDescriptorSet,
        List<ApigatewayApiConfigFileResponse> source) {
        this.fileDescriptorSet = Objects.requireNonNull(fileDescriptorSet);
        this.source = Objects.requireNonNull(source);
    }

    public ApigatewayApiConfigFileResponse getFileDescriptorSet() {
        return this.fileDescriptorSet;
    }
    public List<ApigatewayApiConfigFileResponse> getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigGrpcServiceDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayApiConfigFileResponse fileDescriptorSet;
        private List<ApigatewayApiConfigFileResponse> source;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigGrpcServiceDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileDescriptorSet = defaults.fileDescriptorSet;
    	      this.source = defaults.source;
        }

        public Builder setFileDescriptorSet(ApigatewayApiConfigFileResponse fileDescriptorSet) {
            this.fileDescriptorSet = Objects.requireNonNull(fileDescriptorSet);
            return this;
        }

        public Builder setSource(List<ApigatewayApiConfigFileResponse> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public ApigatewayApiConfigGrpcServiceDefinitionResponse build() {
            return new ApigatewayApiConfigGrpcServiceDefinitionResponse(fileDescriptorSet, source);
        }
    }
}