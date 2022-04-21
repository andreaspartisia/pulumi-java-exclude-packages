// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.ServiceNowAuthenticationType;
import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
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
 * ServiceNow server linked service.
 * 
 */
public final class ServiceNowLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNowLinkedServiceArgs Empty = new ServiceNowLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The authentication type to use.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<Either<String,ServiceNowAuthenticationType>> authenticationType;

    public Output<Either<String,ServiceNowAuthenticationType>> authenticationType() {
        return this.authenticationType;
    }

    /**
     * The client id for OAuth2 authentication.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<Object> clientId;

    public Optional<Output<Object>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret for OAuth2 authentication.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The endpoint of the ServiceNow server. (i.e. &lt;instance&gt;.service-now.com)
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<Object> endpoint;

    public Output<Object> endpoint() {
        return this.endpoint;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The password corresponding to the user name for Basic and OAuth2 authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;ServiceNow&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
    private @Nullable Output<Object> useEncryptedEndpoints;

    public Optional<Output<Object>> useEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="useHostVerification")
    private @Nullable Output<Object> useHostVerification;

    public Optional<Output<Object>> useHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="usePeerVerification")
    private @Nullable Output<Object> usePeerVerification;

    public Optional<Output<Object>> usePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    /**
     * The user name used to connect to the ServiceNow server for Basic and OAuth2 authentication.
     * 
     */
    @Import(name="username")
    private @Nullable Output<Object> username;

    public Optional<Output<Object>> username() {
        return Optional.ofNullable(this.username);
    }

    private ServiceNowLinkedServiceArgs() {}

    private ServiceNowLinkedServiceArgs(ServiceNowLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.endpoint = $.endpoint;
        this.parameters = $.parameters;
        this.password = $.password;
        this.type = $.type;
        this.useEncryptedEndpoints = $.useEncryptedEndpoints;
        this.useHostVerification = $.useHostVerification;
        this.usePeerVerification = $.usePeerVerification;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNowLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNowLinkedServiceArgs $;

        public Builder() {
            $ = new ServiceNowLinkedServiceArgs();
        }

        public Builder(ServiceNowLinkedServiceArgs defaults) {
            $ = new ServiceNowLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder authenticationType(Output<Either<String,ServiceNowAuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(Either<String,ServiceNowAuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder authenticationType(String authenticationType) {
            return authenticationType(Either.ofLeft(authenticationType));
        }

        public Builder authenticationType(ServiceNowAuthenticationType authenticationType) {
            return authenticationType(Either.ofRight(authenticationType));
        }

        public Builder clientId(@Nullable Output<Object> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(Object clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder clientSecret(AzureKeyVaultSecretReferenceArgs clientSecret) {
            return clientSecret(Either.ofLeft(clientSecret));
        }

        public Builder clientSecret(SecureStringArgs clientSecret) {
            return clientSecret(Either.ofRight(clientSecret));
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        public Builder endpoint(Output<Object> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(Object endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder useEncryptedEndpoints(@Nullable Output<Object> useEncryptedEndpoints) {
            $.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder useEncryptedEndpoints(Object useEncryptedEndpoints) {
            return useEncryptedEndpoints(Output.of(useEncryptedEndpoints));
        }

        public Builder useHostVerification(@Nullable Output<Object> useHostVerification) {
            $.useHostVerification = useHostVerification;
            return this;
        }

        public Builder useHostVerification(Object useHostVerification) {
            return useHostVerification(Output.of(useHostVerification));
        }

        public Builder usePeerVerification(@Nullable Output<Object> usePeerVerification) {
            $.usePeerVerification = usePeerVerification;
            return this;
        }

        public Builder usePeerVerification(Object usePeerVerification) {
            return usePeerVerification(Output.of(usePeerVerification));
        }

        public Builder username(@Nullable Output<Object> username) {
            $.username = username;
            return this;
        }

        public Builder username(Object username) {
            return username(Output.of(username));
        }

        public ServiceNowLinkedServiceArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
