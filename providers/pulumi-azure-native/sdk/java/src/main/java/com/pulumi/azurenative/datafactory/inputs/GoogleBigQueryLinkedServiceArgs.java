// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.GoogleBigQueryAuthenticationType;
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
 * Google BigQuery service linked service.
 * 
 */
public final class GoogleBigQueryLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleBigQueryLinkedServiceArgs Empty = new GoogleBigQueryLinkedServiceArgs();

    /**
     * A comma-separated list of public BigQuery projects to access.
     * 
     */
    @Import(name="additionalProjects")
    private @Nullable Output<Object> additionalProjects;

    public Optional<Output<Object>> additionalProjects() {
        return Optional.ofNullable(this.additionalProjects);
    }

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
     * The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<Either<String,GoogleBigQueryAuthenticationType>> authenticationType;

    public Output<Either<String,GoogleBigQueryAuthenticationType>> authenticationType() {
        return this.authenticationType;
    }

    /**
     * The client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<Object> clientId;

    public Optional<Output<Object>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret of the google application used to acquire the refresh token.
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
     * The service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     * 
     */
    @Import(name="email")
    private @Nullable Output<Object> email;

    public Optional<Output<Object>> email() {
        return Optional.ofNullable(this.email);
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
     * The full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     * 
     */
    @Import(name="keyFilePath")
    private @Nullable Output<Object> keyFilePath;

    public Optional<Output<Object>> keyFilePath() {
        return Optional.ofNullable(this.keyFilePath);
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
     * The default BigQuery project to query against.
     * 
     */
    @Import(name="project", required=true)
    private Output<Object> project;

    public Output<Object> project() {
        return this.project;
    }

    /**
     * The refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     * 
     */
    @Import(name="refreshToken")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    /**
     * Whether to request access to Google Drive. Allowing Google Drive access enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is false.
     * 
     */
    @Import(name="requestGoogleDriveScope")
    private @Nullable Output<Object> requestGoogleDriveScope;

    public Optional<Output<Object>> requestGoogleDriveScope() {
        return Optional.ofNullable(this.requestGoogleDriveScope);
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @Import(name="trustedCertPath")
    private @Nullable Output<Object> trustedCertPath;

    public Optional<Output<Object>> trustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;GoogleBigQuery&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    @Import(name="useSystemTrustStore")
    private @Nullable Output<Object> useSystemTrustStore;

    public Optional<Output<Object>> useSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }

    private GoogleBigQueryLinkedServiceArgs() {}

    private GoogleBigQueryLinkedServiceArgs(GoogleBigQueryLinkedServiceArgs $) {
        this.additionalProjects = $.additionalProjects;
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.email = $.email;
        this.encryptedCredential = $.encryptedCredential;
        this.keyFilePath = $.keyFilePath;
        this.parameters = $.parameters;
        this.project = $.project;
        this.refreshToken = $.refreshToken;
        this.requestGoogleDriveScope = $.requestGoogleDriveScope;
        this.trustedCertPath = $.trustedCertPath;
        this.type = $.type;
        this.useSystemTrustStore = $.useSystemTrustStore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleBigQueryLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleBigQueryLinkedServiceArgs $;

        public Builder() {
            $ = new GoogleBigQueryLinkedServiceArgs();
        }

        public Builder(GoogleBigQueryLinkedServiceArgs defaults) {
            $ = new GoogleBigQueryLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalProjects(@Nullable Output<Object> additionalProjects) {
            $.additionalProjects = additionalProjects;
            return this;
        }

        public Builder additionalProjects(Object additionalProjects) {
            return additionalProjects(Output.of(additionalProjects));
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

        public Builder authenticationType(Output<Either<String,GoogleBigQueryAuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(Either<String,GoogleBigQueryAuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder authenticationType(String authenticationType) {
            return authenticationType(Either.ofLeft(authenticationType));
        }

        public Builder authenticationType(GoogleBigQueryAuthenticationType authenticationType) {
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

        public Builder email(@Nullable Output<Object> email) {
            $.email = email;
            return this;
        }

        public Builder email(Object email) {
            return email(Output.of(email));
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        public Builder keyFilePath(@Nullable Output<Object> keyFilePath) {
            $.keyFilePath = keyFilePath;
            return this;
        }

        public Builder keyFilePath(Object keyFilePath) {
            return keyFilePath(Output.of(keyFilePath));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder project(Output<Object> project) {
            $.project = project;
            return this;
        }

        public Builder project(Object project) {
            return project(Output.of(project));
        }

        public Builder refreshToken(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken) {
            $.refreshToken = refreshToken;
            return this;
        }

        public Builder refreshToken(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> refreshToken) {
            return refreshToken(Output.of(refreshToken));
        }

        public Builder refreshToken(AzureKeyVaultSecretReferenceArgs refreshToken) {
            return refreshToken(Either.ofLeft(refreshToken));
        }

        public Builder refreshToken(SecureStringArgs refreshToken) {
            return refreshToken(Either.ofRight(refreshToken));
        }

        public Builder requestGoogleDriveScope(@Nullable Output<Object> requestGoogleDriveScope) {
            $.requestGoogleDriveScope = requestGoogleDriveScope;
            return this;
        }

        public Builder requestGoogleDriveScope(Object requestGoogleDriveScope) {
            return requestGoogleDriveScope(Output.of(requestGoogleDriveScope));
        }

        public Builder trustedCertPath(@Nullable Output<Object> trustedCertPath) {
            $.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder trustedCertPath(Object trustedCertPath) {
            return trustedCertPath(Output.of(trustedCertPath));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder useSystemTrustStore(@Nullable Output<Object> useSystemTrustStore) {
            $.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder useSystemTrustStore(Object useSystemTrustStore) {
            return useSystemTrustStore(Output.of(useSystemTrustStore));
        }

        public GoogleBigQueryLinkedServiceArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
