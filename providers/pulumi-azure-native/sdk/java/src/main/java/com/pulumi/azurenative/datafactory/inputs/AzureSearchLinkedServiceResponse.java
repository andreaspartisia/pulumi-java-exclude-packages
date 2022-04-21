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
 * Linked service for Windows Azure Search Service.
 * 
 */
public final class AzureSearchLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureSearchLinkedServiceResponse Empty = new AzureSearchLinkedServiceResponse();

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
     * Admin Key for Azure Search service
     * 
     */
    @Import(name="key")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> key;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> key() {
        return Optional.ofNullable(this.key);
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
     * Type of linked service.
     * Expected value is &#39;AzureSearch&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * URL for Azure Search service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
    private Object url;

    public Object url() {
        return this.url;
    }

    private AzureSearchLinkedServiceResponse() {}

    private AzureSearchLinkedServiceResponse(AzureSearchLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.key = $.key;
        this.parameters = $.parameters;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureSearchLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureSearchLinkedServiceResponse $;

        public Builder() {
            $ = new AzureSearchLinkedServiceResponse();
        }

        public Builder(AzureSearchLinkedServiceResponse defaults) {
            $ = new AzureSearchLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
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

        public Builder key(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> key) {
            $.key = key;
            return this;
        }

        public Builder key(AzureKeyVaultSecretReferenceResponse key) {
            return key(Either.ofLeft(key));
        }

        public Builder key(SecureStringResponse key) {
            return key(Either.ofRight(key));
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder url(Object url) {
            $.url = url;
            return this;
        }

        public AzureSearchLinkedServiceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
