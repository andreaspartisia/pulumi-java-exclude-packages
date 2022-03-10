// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.apigateway.inputs.RestApiEndpointConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestApiArgs Empty = new RestApiArgs();

    /**
     * Source of the API key for requests. Valid values are `HEADER` (default) and `AUTHORIZER`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-api-key-source` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-api-key-source.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     * 
     */
    @InputImport(name="apiKeySource")
      private final @Nullable Input<String> apiKeySource;

    public Input<String> getApiKeySource() {
        return this.apiKeySource == null ? Input.empty() : this.apiKeySource;
    }

    /**
     * List of binary media types supported by the REST API. By default, the REST API supports only UTF-8-encoded text payloads. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-binary-media-types` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-binary-media-types.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     * 
     */
    @InputImport(name="binaryMediaTypes")
      private final @Nullable Input<List<String>> binaryMediaTypes;

    public Input<List<String>> getBinaryMediaTypes() {
        return this.binaryMediaTypes == null ? Input.empty() : this.binaryMediaTypes;
    }

    /**
     * OpenAPI specification that defines the set of routes and integrations to create as part of the REST API. This configuration, and any updates to it, will replace all REST API configuration except values overridden in this resource configuration and other resource updates applied after this resource but before any `aws.apigateway.Deployment` creation. More information about REST API OpenAPI support can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html).
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Description of the REST API. If importing an OpenAPI specification via the `body` argument, this corresponds to the `info.description` field. If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint. Defaults to `false`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-endpoint-configuration` extension `disableExecuteApiEndpoint` property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-endpoint-configuration.html). If the argument value is `true` and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     * 
     */
    @InputImport(name="disableExecuteApiEndpoint")
      private final @Nullable Input<Boolean> disableExecuteApiEndpoint;

    public Input<Boolean> getDisableExecuteApiEndpoint() {
        return this.disableExecuteApiEndpoint == null ? Input.empty() : this.disableExecuteApiEndpoint;
    }

    /**
     * Configuration block defining API endpoint configuration including endpoint type. Defined below.
     * 
     */
    @InputImport(name="endpointConfiguration")
      private final @Nullable Input<RestApiEndpointConfigurationArgs> endpointConfiguration;

    public Input<RestApiEndpointConfigurationArgs> getEndpointConfiguration() {
        return this.endpointConfiguration == null ? Input.empty() : this.endpointConfiguration;
    }

    /**
     * Minimum response size to compress for the REST API. Integer between `-1` and `10485760` (10MB). Setting a value greater than `-1` will enable compression, `-1` disables compression (default). If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-minimum-compression-size` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-openapi-minimum-compression-size.html). If the argument value (_except_ `-1`) is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     * 
     */
    @InputImport(name="minimumCompressionSize")
      private final @Nullable Input<Integer> minimumCompressionSize;

    public Input<Integer> getMinimumCompressionSize() {
        return this.minimumCompressionSize == null ? Input.empty() : this.minimumCompressionSize;
    }

    /**
     * Name of the REST API. If importing an OpenAPI specification via the `body` argument, this corresponds to the `info.title` field. If the argument value is different than the OpenAPI value, the argument value will override the OpenAPI value.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Map of customizations for importing the specification in the `body` argument. For example, to exclude DocumentationParts from an imported API, set `ignore` equal to `documentation`. Additional documentation, including other parameters such as `basepath`, can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html).
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,String>> parameters;

    public Input<Map<String,String>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * JSON formatted policy document that controls access to the API Gateway. This provider will only perform drift detection of its value when present in a configuration. It is recommended to use the `aws.apigateway.RestApiPolicy` resource instead. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-policy` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/openapi-extensions-policy.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RestApiArgs(
        @Nullable Input<String> apiKeySource,
        @Nullable Input<List<String>> binaryMediaTypes,
        @Nullable Input<String> body,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disableExecuteApiEndpoint,
        @Nullable Input<RestApiEndpointConfigurationArgs> endpointConfiguration,
        @Nullable Input<Integer> minimumCompressionSize,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> parameters,
        @Nullable Input<String> policy,
        @Nullable Input<Map<String,String>> tags) {
        this.apiKeySource = apiKeySource;
        this.binaryMediaTypes = binaryMediaTypes;
        this.body = body;
        this.description = description;
        this.disableExecuteApiEndpoint = disableExecuteApiEndpoint;
        this.endpointConfiguration = endpointConfiguration;
        this.minimumCompressionSize = minimumCompressionSize;
        this.name = name;
        this.parameters = parameters;
        this.policy = policy;
        this.tags = tags;
    }

    private RestApiArgs() {
        this.apiKeySource = Input.empty();
        this.binaryMediaTypes = Input.empty();
        this.body = Input.empty();
        this.description = Input.empty();
        this.disableExecuteApiEndpoint = Input.empty();
        this.endpointConfiguration = Input.empty();
        this.minimumCompressionSize = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.policy = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiKeySource;
        private @Nullable Input<List<String>> binaryMediaTypes;
        private @Nullable Input<String> body;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disableExecuteApiEndpoint;
        private @Nullable Input<RestApiEndpointConfigurationArgs> endpointConfiguration;
        private @Nullable Input<Integer> minimumCompressionSize;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> parameters;
        private @Nullable Input<String> policy;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RestApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeySource = defaults.apiKeySource;
    	      this.binaryMediaTypes = defaults.binaryMediaTypes;
    	      this.body = defaults.body;
    	      this.description = defaults.description;
    	      this.disableExecuteApiEndpoint = defaults.disableExecuteApiEndpoint;
    	      this.endpointConfiguration = defaults.endpointConfiguration;
    	      this.minimumCompressionSize = defaults.minimumCompressionSize;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policy = defaults.policy;
    	      this.tags = defaults.tags;
        }

        public Builder setApiKeySource(@Nullable Input<String> apiKeySource) {
            this.apiKeySource = apiKeySource;
            return this;
        }

        public Builder setApiKeySource(@Nullable String apiKeySource) {
            this.apiKeySource = Input.ofNullable(apiKeySource);
            return this;
        }

        public Builder setBinaryMediaTypes(@Nullable Input<List<String>> binaryMediaTypes) {
            this.binaryMediaTypes = binaryMediaTypes;
            return this;
        }

        public Builder setBinaryMediaTypes(@Nullable List<String> binaryMediaTypes) {
            this.binaryMediaTypes = Input.ofNullable(binaryMediaTypes);
            return this;
        }

        public Builder setBody(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisableExecuteApiEndpoint(@Nullable Input<Boolean> disableExecuteApiEndpoint) {
            this.disableExecuteApiEndpoint = disableExecuteApiEndpoint;
            return this;
        }

        public Builder setDisableExecuteApiEndpoint(@Nullable Boolean disableExecuteApiEndpoint) {
            this.disableExecuteApiEndpoint = Input.ofNullable(disableExecuteApiEndpoint);
            return this;
        }

        public Builder setEndpointConfiguration(@Nullable Input<RestApiEndpointConfigurationArgs> endpointConfiguration) {
            this.endpointConfiguration = endpointConfiguration;
            return this;
        }

        public Builder setEndpointConfiguration(@Nullable RestApiEndpointConfigurationArgs endpointConfiguration) {
            this.endpointConfiguration = Input.ofNullable(endpointConfiguration);
            return this;
        }

        public Builder setMinimumCompressionSize(@Nullable Input<Integer> minimumCompressionSize) {
            this.minimumCompressionSize = minimumCompressionSize;
            return this;
        }

        public Builder setMinimumCompressionSize(@Nullable Integer minimumCompressionSize) {
            this.minimumCompressionSize = Input.ofNullable(minimumCompressionSize);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPolicy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public RestApiArgs build() {
            return new RestApiArgs(apiKeySource, binaryMediaTypes, body, description, disableExecuteApiEndpoint, endpointConfiguration, minimumCompressionSize, name, parameters, policy, tags);
        }
    }
}