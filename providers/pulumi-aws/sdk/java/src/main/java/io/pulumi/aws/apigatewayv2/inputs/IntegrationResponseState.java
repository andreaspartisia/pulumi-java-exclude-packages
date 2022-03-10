// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationResponseState extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationResponseState Empty = new IntegrationResponseState();

    /**
     * The API identifier.
     * 
     */
    @InputImport(name="apiId")
      private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
     * 
     */
    @InputImport(name="contentHandlingStrategy")
      private final @Nullable Input<String> contentHandlingStrategy;

    public Input<String> getContentHandlingStrategy() {
        return this.contentHandlingStrategy == null ? Input.empty() : this.contentHandlingStrategy;
    }

    /**
     * The identifier of the `aws.apigatewayv2.Integration`.
     * 
     */
    @InputImport(name="integrationId")
      private final @Nullable Input<String> integrationId;

    public Input<String> getIntegrationId() {
        return this.integrationId == null ? Input.empty() : this.integrationId;
    }

    /**
     * The integration response key.
     * 
     */
    @InputImport(name="integrationResponseKey")
      private final @Nullable Input<String> integrationResponseKey;

    public Input<String> getIntegrationResponseKey() {
        return this.integrationResponseKey == null ? Input.empty() : this.integrationResponseKey;
    }

    /**
     * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
     * 
     */
    @InputImport(name="responseTemplates")
      private final @Nullable Input<Map<String,String>> responseTemplates;

    public Input<Map<String,String>> getResponseTemplates() {
        return this.responseTemplates == null ? Input.empty() : this.responseTemplates;
    }

    /**
     * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
     * 
     */
    @InputImport(name="templateSelectionExpression")
      private final @Nullable Input<String> templateSelectionExpression;

    public Input<String> getTemplateSelectionExpression() {
        return this.templateSelectionExpression == null ? Input.empty() : this.templateSelectionExpression;
    }

    public IntegrationResponseState(
        @Nullable Input<String> apiId,
        @Nullable Input<String> contentHandlingStrategy,
        @Nullable Input<String> integrationId,
        @Nullable Input<String> integrationResponseKey,
        @Nullable Input<Map<String,String>> responseTemplates,
        @Nullable Input<String> templateSelectionExpression) {
        this.apiId = apiId;
        this.contentHandlingStrategy = contentHandlingStrategy;
        this.integrationId = integrationId;
        this.integrationResponseKey = integrationResponseKey;
        this.responseTemplates = responseTemplates;
        this.templateSelectionExpression = templateSelectionExpression;
    }

    private IntegrationResponseState() {
        this.apiId = Input.empty();
        this.contentHandlingStrategy = Input.empty();
        this.integrationId = Input.empty();
        this.integrationResponseKey = Input.empty();
        this.responseTemplates = Input.empty();
        this.templateSelectionExpression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationResponseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> contentHandlingStrategy;
        private @Nullable Input<String> integrationId;
        private @Nullable Input<String> integrationResponseKey;
        private @Nullable Input<Map<String,String>> responseTemplates;
        private @Nullable Input<String> templateSelectionExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationResponseState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.contentHandlingStrategy = defaults.contentHandlingStrategy;
    	      this.integrationId = defaults.integrationId;
    	      this.integrationResponseKey = defaults.integrationResponseKey;
    	      this.responseTemplates = defaults.responseTemplates;
    	      this.templateSelectionExpression = defaults.templateSelectionExpression;
        }

        public Builder setApiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder setApiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder setContentHandlingStrategy(@Nullable Input<String> contentHandlingStrategy) {
            this.contentHandlingStrategy = contentHandlingStrategy;
            return this;
        }

        public Builder setContentHandlingStrategy(@Nullable String contentHandlingStrategy) {
            this.contentHandlingStrategy = Input.ofNullable(contentHandlingStrategy);
            return this;
        }

        public Builder setIntegrationId(@Nullable Input<String> integrationId) {
            this.integrationId = integrationId;
            return this;
        }

        public Builder setIntegrationId(@Nullable String integrationId) {
            this.integrationId = Input.ofNullable(integrationId);
            return this;
        }

        public Builder setIntegrationResponseKey(@Nullable Input<String> integrationResponseKey) {
            this.integrationResponseKey = integrationResponseKey;
            return this;
        }

        public Builder setIntegrationResponseKey(@Nullable String integrationResponseKey) {
            this.integrationResponseKey = Input.ofNullable(integrationResponseKey);
            return this;
        }

        public Builder setResponseTemplates(@Nullable Input<Map<String,String>> responseTemplates) {
            this.responseTemplates = responseTemplates;
            return this;
        }

        public Builder setResponseTemplates(@Nullable Map<String,String> responseTemplates) {
            this.responseTemplates = Input.ofNullable(responseTemplates);
            return this;
        }

        public Builder setTemplateSelectionExpression(@Nullable Input<String> templateSelectionExpression) {
            this.templateSelectionExpression = templateSelectionExpression;
            return this;
        }

        public Builder setTemplateSelectionExpression(@Nullable String templateSelectionExpression) {
            this.templateSelectionExpression = Input.ofNullable(templateSelectionExpression);
            return this;
        }
        public IntegrationResponseState build() {
            return new IntegrationResponseState(apiId, contentHandlingStrategy, integrationId, integrationResponseKey, responseTemplates, templateSelectionExpression);
        }
    }
}