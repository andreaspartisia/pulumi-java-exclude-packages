// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.apigateway.outputs.ApiConfigOpenapiDocumentDocument;
import java.util.Objects;

@OutputCustomType
public final class ApiConfigOpenapiDocument {
    /**
     * The OpenAPI Specification document file.
     * Structure is documented below.
     * 
     */
    private final ApiConfigOpenapiDocumentDocument document;

    @OutputCustomType.Constructor
    private ApiConfigOpenapiDocument(@OutputCustomType.Parameter("document") ApiConfigOpenapiDocumentDocument document) {
        this.document = document;
    }

    /**
     * The OpenAPI Specification document file.
     * Structure is documented below.
     * 
    */
    public ApiConfigOpenapiDocumentDocument getDocument() {
        return this.document;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigOpenapiDocument defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigOpenapiDocumentDocument document;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigOpenapiDocument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.document = defaults.document;
        }

        public Builder setDocument(ApiConfigOpenapiDocumentDocument document) {
            this.document = Objects.requireNonNull(document);
            return this;
        }
        public ApiConfigOpenapiDocument build() {
            return new ApiConfigOpenapiDocument(document);
        }
    }
}
