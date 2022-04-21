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
 * Paypal Service linked service.
 * 
 */
public final class PaypalLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final PaypalLinkedServiceResponse Empty = new PaypalLinkedServiceResponse();

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
     * The client ID associated with your PayPal application.
     * 
     */
    @Import(name="clientId", required=true)
    private Object clientId;

    public Object clientId() {
        return this.clientId;
    }

    /**
     * The client secret associated with your PayPal application.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
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
     * The URL of the PayPal instance. (i.e. api.sandbox.paypal.com)
     * 
     */
    @Import(name="host", required=true)
    private Object host;

    public Object host() {
        return this.host;
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
     * Expected value is &#39;Paypal&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
    private @Nullable Object useEncryptedEndpoints;

    public Optional<Object> useEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="useHostVerification")
    private @Nullable Object useHostVerification;

    public Optional<Object> useHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="usePeerVerification")
    private @Nullable Object usePeerVerification;

    public Optional<Object> usePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    private PaypalLinkedServiceResponse() {}

    private PaypalLinkedServiceResponse(PaypalLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.host = $.host;
        this.parameters = $.parameters;
        this.type = $.type;
        this.useEncryptedEndpoints = $.useEncryptedEndpoints;
        this.useHostVerification = $.useHostVerification;
        this.usePeerVerification = $.usePeerVerification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PaypalLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PaypalLinkedServiceResponse $;

        public Builder() {
            $ = new PaypalLinkedServiceResponse();
        }

        public Builder(PaypalLinkedServiceResponse defaults) {
            $ = new PaypalLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder clientId(Object clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(AzureKeyVaultSecretReferenceResponse clientSecret) {
            return clientSecret(Either.ofLeft(clientSecret));
        }

        public Builder clientSecret(SecureStringResponse clientSecret) {
            return clientSecret(Either.ofRight(clientSecret));
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

        public Builder host(Object host) {
            $.host = host;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            $.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder useHostVerification(@Nullable Object useHostVerification) {
            $.useHostVerification = useHostVerification;
            return this;
        }

        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            $.usePeerVerification = usePeerVerification;
            return this;
        }

        public PaypalLinkedServiceResponse build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
