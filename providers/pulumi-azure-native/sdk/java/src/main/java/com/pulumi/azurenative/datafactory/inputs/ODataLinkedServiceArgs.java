// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.ODataAadServicePrincipalCredentialType;
import com.pulumi.azurenative.datafactory.enums.ODataAuthenticationType;
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
import javax.annotation.Nullable;


/**
 * Open Data Protocol (OData) linked service.
 * 
 */
public final class ODataLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ODataLinkedServiceArgs Empty = new ODataLinkedServiceArgs();

    /**
     * Specify the resource you are requesting authorization to use Directory. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="aadResourceId")
      private final @Nullable Output<Object> aadResourceId;

    public Output<Object> aadResourceId() {
        return this.aadResourceId == null ? Codegen.empty() : this.aadResourceId;
    }

    /**
     * Specify the credential type (key or cert) is used for service principal.
     * 
     */
    @Import(name="aadServicePrincipalCredentialType")
      private final @Nullable Output<Either<String,ODataAadServicePrincipalCredentialType>> aadServicePrincipalCredentialType;

    public Output<Either<String,ODataAadServicePrincipalCredentialType>> aadServicePrincipalCredentialType() {
        return this.aadServicePrincipalCredentialType == null ? Codegen.empty() : this.aadServicePrincipalCredentialType;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    @Import(name="authHeaders")
      private final @Nullable Output<Object> authHeaders;

    public Output<Object> authHeaders() {
        return this.authHeaders == null ? Codegen.empty() : this.authHeaders;
    }

    /**
     * Type of authentication used to connect to the OData service.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Output<Either<String,ODataAuthenticationType>> authenticationType;

    public Output<Either<String,ODataAuthenticationType>> authenticationType() {
        return this.authenticationType == null ? Codegen.empty() : this.authenticationType;
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
      private final @Nullable Output<Object> azureCloudType;

    public Output<Object> azureCloudType() {
        return this.azureCloudType == null ? Codegen.empty() : this.azureCloudType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> connectVia() {
        return this.connectVia == null ? Codegen.empty() : this.connectVia;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Codegen.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Password of the OData service.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Specify the base64 encoded certificate of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalEmbeddedCert")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCert;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCert() {
        return this.servicePrincipalEmbeddedCert == null ? Codegen.empty() : this.servicePrincipalEmbeddedCert;
    }

    /**
     * Specify the password of your certificate if your certificate has a password and you are using AadServicePrincipal authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalEmbeddedCertPassword")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCertPassword;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCertPassword() {
        return this.servicePrincipalEmbeddedCertPassword == null ? Codegen.empty() : this.servicePrincipalEmbeddedCertPassword;
    }

    /**
     * Specify the application id of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Output<Object> servicePrincipalId;

    public Output<Object> servicePrincipalId() {
        return this.servicePrincipalId == null ? Codegen.empty() : this.servicePrincipalId;
    }

    /**
     * Specify the secret of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey() {
        return this.servicePrincipalKey == null ? Codegen.empty() : this.servicePrincipalKey;
    }

    /**
     * Specify the tenant information (domain name or tenant ID) under which your application resides. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
      private final @Nullable Output<Object> tenant;

    public Output<Object> tenant() {
        return this.tenant == null ? Codegen.empty() : this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'OData'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The URL of the OData service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
      private final Output<Object> url;

    public Output<Object> url() {
        return this.url;
    }

    /**
     * User name of the OData service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<Object> userName;

    public Output<Object> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public ODataLinkedServiceArgs(
        @Nullable Output<Object> aadResourceId,
        @Nullable Output<Either<String,ODataAadServicePrincipalCredentialType>> aadServicePrincipalCredentialType,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> authHeaders,
        @Nullable Output<Either<String,ODataAuthenticationType>> authenticationType,
        @Nullable Output<Object> azureCloudType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCert,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCertPassword,
        @Nullable Output<Object> servicePrincipalId,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        @Nullable Output<Object> tenant,
        Output<String> type,
        Output<Object> url,
        @Nullable Output<Object> userName) {
        this.aadResourceId = aadResourceId;
        this.aadServicePrincipalCredentialType = aadServicePrincipalCredentialType;
        this.annotations = annotations;
        this.authHeaders = authHeaders;
        this.authenticationType = authenticationType;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.servicePrincipalEmbeddedCert = servicePrincipalEmbeddedCert;
        this.servicePrincipalEmbeddedCertPassword = servicePrincipalEmbeddedCertPassword;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userName = userName;
    }

    private ODataLinkedServiceArgs() {
        this.aadResourceId = Codegen.empty();
        this.aadServicePrincipalCredentialType = Codegen.empty();
        this.annotations = Codegen.empty();
        this.authHeaders = Codegen.empty();
        this.authenticationType = Codegen.empty();
        this.azureCloudType = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.servicePrincipalEmbeddedCert = Codegen.empty();
        this.servicePrincipalEmbeddedCertPassword = Codegen.empty();
        this.servicePrincipalId = Codegen.empty();
        this.servicePrincipalKey = Codegen.empty();
        this.tenant = Codegen.empty();
        this.type = Codegen.empty();
        this.url = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ODataLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> aadResourceId;
        private @Nullable Output<Either<String,ODataAadServicePrincipalCredentialType>> aadServicePrincipalCredentialType;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> authHeaders;
        private @Nullable Output<Either<String,ODataAuthenticationType>> authenticationType;
        private @Nullable Output<Object> azureCloudType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCert;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCertPassword;
        private @Nullable Output<Object> servicePrincipalId;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private @Nullable Output<Object> tenant;
        private Output<String> type;
        private Output<Object> url;
        private @Nullable Output<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ODataLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadResourceId = defaults.aadResourceId;
    	      this.aadServicePrincipalCredentialType = defaults.aadServicePrincipalCredentialType;
    	      this.annotations = defaults.annotations;
    	      this.authHeaders = defaults.authHeaders;
    	      this.authenticationType = defaults.authenticationType;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.servicePrincipalEmbeddedCert = defaults.servicePrincipalEmbeddedCert;
    	      this.servicePrincipalEmbeddedCertPassword = defaults.servicePrincipalEmbeddedCertPassword;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userName = defaults.userName;
        }

        public Builder aadResourceId(@Nullable Output<Object> aadResourceId) {
            this.aadResourceId = aadResourceId;
            return this;
        }
        public Builder aadResourceId(@Nullable Object aadResourceId) {
            this.aadResourceId = Codegen.ofNullable(aadResourceId);
            return this;
        }
        public Builder aadServicePrincipalCredentialType(@Nullable Output<Either<String,ODataAadServicePrincipalCredentialType>> aadServicePrincipalCredentialType) {
            this.aadServicePrincipalCredentialType = aadServicePrincipalCredentialType;
            return this;
        }
        public Builder aadServicePrincipalCredentialType(@Nullable Either<String,ODataAadServicePrincipalCredentialType> aadServicePrincipalCredentialType) {
            this.aadServicePrincipalCredentialType = Codegen.ofNullable(aadServicePrincipalCredentialType);
            return this;
        }
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authHeaders(@Nullable Output<Object> authHeaders) {
            this.authHeaders = authHeaders;
            return this;
        }
        public Builder authHeaders(@Nullable Object authHeaders) {
            this.authHeaders = Codegen.ofNullable(authHeaders);
            return this;
        }
        public Builder authenticationType(@Nullable Output<Either<String,ODataAuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder authenticationType(@Nullable Either<String,ODataAuthenticationType> authenticationType) {
            this.authenticationType = Codegen.ofNullable(authenticationType);
            return this;
        }
        public Builder azureCloudType(@Nullable Output<Object> azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }
        public Builder azureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = Codegen.ofNullable(azureCloudType);
            return this;
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Codegen.ofNullable(connectVia);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Codegen.ofNullable(encryptedCredential);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder servicePrincipalEmbeddedCert(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCert) {
            this.servicePrincipalEmbeddedCert = servicePrincipalEmbeddedCert;
            return this;
        }
        public Builder servicePrincipalEmbeddedCert(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalEmbeddedCert) {
            this.servicePrincipalEmbeddedCert = Codegen.ofNullable(servicePrincipalEmbeddedCert);
            return this;
        }
        public Builder servicePrincipalEmbeddedCertPassword(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalEmbeddedCertPassword) {
            this.servicePrincipalEmbeddedCertPassword = servicePrincipalEmbeddedCertPassword;
            return this;
        }
        public Builder servicePrincipalEmbeddedCertPassword(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalEmbeddedCertPassword) {
            this.servicePrincipalEmbeddedCertPassword = Codegen.ofNullable(servicePrincipalEmbeddedCertPassword);
            return this;
        }
        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = Codegen.ofNullable(servicePrincipalId);
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Codegen.ofNullable(servicePrincipalKey);
            return this;
        }
        public Builder tenant(@Nullable Output<Object> tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder tenant(@Nullable Object tenant) {
            this.tenant = Codegen.ofNullable(tenant);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder url(Output<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(Object url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }
        public Builder userName(@Nullable Output<Object> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public ODataLinkedServiceArgs build() {
            return new ODataLinkedServiceArgs(aadResourceId, aadServicePrincipalCredentialType, annotations, authHeaders, authenticationType, azureCloudType, connectVia, description, encryptedCredential, parameters, password, servicePrincipalEmbeddedCert, servicePrincipalEmbeddedCertPassword, servicePrincipalId, servicePrincipalKey, tenant, type, url, userName);
        }
    }
}
