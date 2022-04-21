// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure ML Studio Web Service linked service.
 * 
 */
public final class AzureMLLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureMLLinkedServiceResponse Empty = new AzureMLLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The API key for accessing the Azure ML model endpoint.
     * 
     */
    @Import(name="apiKey", required=true)
    private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey() {
        return this.apiKey;
    }

    /**
     * Type of authentication (Required to specify MSI) used to connect to AzureML. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authentication")
    private @Nullable Object authentication;

    public Optional<Object> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The Batch Execution REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlEndpoint", required=true)
    private Object mlEndpoint;

    public Object mlEndpoint() {
        return this.mlEndpoint;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Optional<Map<String,ParameterSpecificationResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The ID of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Object servicePrincipalId;

    public Optional<Object> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
    private @Nullable Object tenant;

    public Optional<Object> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AzureML&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * The Update Resource REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="updateResourceEndpoint")
    private @Nullable Object updateResourceEndpoint;

    public Optional<Object> updateResourceEndpoint() {
        return Optional.ofNullable(this.updateResourceEndpoint);
    }

    private AzureMLLinkedServiceResponse() {}

    private AzureMLLinkedServiceResponse(AzureMLLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.apiKey = $.apiKey;
        this.authentication = $.authentication;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.mlEndpoint = $.mlEndpoint;
        this.parameters = $.parameters;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.tenant = $.tenant;
        this.type = $.type;
        this.updateResourceEndpoint = $.updateResourceEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureMLLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureMLLinkedServiceResponse $;

        public Builder() {
            $ = new AzureMLLinkedServiceResponse();
        }

        public Builder(AzureMLLinkedServiceResponse defaults) {
            $ = new AzureMLLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder apiKey(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(AzureKeyVaultSecretReferenceResponse apiKey) {
            return apiKey(Either.ofLeft(apiKey));
        }

        public Builder apiKey(SecureStringResponse apiKey) {
            return apiKey(Either.ofRight(apiKey));
        }

        public Builder authentication(@Nullable Object authentication) {
            $.authentication = authentication;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder mlEndpoint(Object mlEndpoint) {
            $.mlEndpoint = mlEndpoint;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder servicePrincipalKey(AzureKeyVaultSecretReferenceResponse servicePrincipalKey) {
            return servicePrincipalKey(Either.ofLeft(servicePrincipalKey));
        }

        public Builder servicePrincipalKey(SecureStringResponse servicePrincipalKey) {
            return servicePrincipalKey(Either.ofRight(servicePrincipalKey));
        }

        public Builder tenant(@Nullable Object tenant) {
            $.tenant = tenant;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder updateResourceEndpoint(@Nullable Object updateResourceEndpoint) {
            $.updateResourceEndpoint = updateResourceEndpoint;
            return this;
        }

        public AzureMLLinkedServiceResponse build() {
            $.apiKey = Objects.requireNonNull($.apiKey, "expected parameter 'apiKey' to be non-null");
            $.mlEndpoint = Objects.requireNonNull($.mlEndpoint, "expected parameter 'mlEndpoint' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
