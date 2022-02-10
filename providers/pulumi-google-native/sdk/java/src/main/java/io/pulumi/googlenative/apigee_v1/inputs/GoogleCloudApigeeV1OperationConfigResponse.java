// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AttributeResponse;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1OperationResponse;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1QuotaResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudApigeeV1OperationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1OperationConfigResponse Empty = new GoogleCloudApigeeV1OperationConfigResponse();

    @InputImport(name="apiSource", required=true)
    private final String apiSource;

    public String getApiSource() {
        return this.apiSource;
    }

    @InputImport(name="attributes", required=true)
    private final List<GoogleCloudApigeeV1AttributeResponse> attributes;

    public List<GoogleCloudApigeeV1AttributeResponse> getAttributes() {
        return this.attributes;
    }

    @InputImport(name="operations", required=true)
    private final List<GoogleCloudApigeeV1OperationResponse> operations;

    public List<GoogleCloudApigeeV1OperationResponse> getOperations() {
        return this.operations;
    }

    @InputImport(name="quota", required=true)
    private final GoogleCloudApigeeV1QuotaResponse quota;

    public GoogleCloudApigeeV1QuotaResponse getQuota() {
        return this.quota;
    }

    public GoogleCloudApigeeV1OperationConfigResponse(
        String apiSource,
        List<GoogleCloudApigeeV1AttributeResponse> attributes,
        List<GoogleCloudApigeeV1OperationResponse> operations,
        GoogleCloudApigeeV1QuotaResponse quota) {
        this.apiSource = Objects.requireNonNull(apiSource, "expected parameter 'apiSource' to be non-null");
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.operations = Objects.requireNonNull(operations, "expected parameter 'operations' to be non-null");
        this.quota = Objects.requireNonNull(quota, "expected parameter 'quota' to be non-null");
    }

    private GoogleCloudApigeeV1OperationConfigResponse() {
        this.apiSource = null;
        this.attributes = List.of();
        this.operations = List.of();
        this.quota = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1OperationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiSource;
        private List<GoogleCloudApigeeV1AttributeResponse> attributes;
        private List<GoogleCloudApigeeV1OperationResponse> operations;
        private GoogleCloudApigeeV1QuotaResponse quota;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1OperationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiSource = defaults.apiSource;
    	      this.attributes = defaults.attributes;
    	      this.operations = defaults.operations;
    	      this.quota = defaults.quota;
        }

        public Builder setApiSource(String apiSource) {
            this.apiSource = Objects.requireNonNull(apiSource);
            return this;
        }

        public Builder setAttributes(List<GoogleCloudApigeeV1AttributeResponse> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setOperations(List<GoogleCloudApigeeV1OperationResponse> operations) {
            this.operations = Objects.requireNonNull(operations);
            return this;
        }

        public Builder setQuota(GoogleCloudApigeeV1QuotaResponse quota) {
            this.quota = Objects.requireNonNull(quota);
            return this;
        }

        public GoogleCloudApigeeV1OperationConfigResponse build() {
            return new GoogleCloudApigeeV1OperationConfigResponse(apiSource, attributes, operations, quota);
        }
    }
}