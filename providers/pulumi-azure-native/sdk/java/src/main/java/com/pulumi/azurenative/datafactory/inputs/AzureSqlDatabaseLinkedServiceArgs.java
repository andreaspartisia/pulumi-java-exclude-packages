// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.azurenative.datafactory.inputs.SqlAlwaysEncryptedPropertiesArgs;
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
 * Microsoft Azure SQL Database linked service.
 * 
 */
public final class AzureSqlDatabaseLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureSqlDatabaseLinkedServiceArgs Empty = new AzureSqlDatabaseLinkedServiceArgs();

    /**
     * Sql always encrypted properties.
     * 
     */
    @Import(name="alwaysEncryptedSettings")
      private final @Nullable Output<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings;

    public Output<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings() {
        return this.alwaysEncryptedSettings == null ? Codegen.empty() : this.alwaysEncryptedSettings;
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
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString", required=true)
      private final Output<Object> connectionString;

    public Output<Object> connectionString() {
        return this.connectionString;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<CredentialReferenceArgs> credential;

    public Output<CredentialReferenceArgs> credential() {
        return this.credential == null ? Codegen.empty() : this.credential;
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
     * The Azure key vault secret reference of password in connection string.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<AzureKeyVaultSecretReferenceArgs> password;

    public Output<AzureKeyVaultSecretReferenceArgs> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The ID of the service principal used to authenticate against Azure SQL Database. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Output<Object> servicePrincipalId;

    public Output<Object> servicePrincipalId() {
        return this.servicePrincipalId == null ? Codegen.empty() : this.servicePrincipalId;
    }

    /**
     * The key of the service principal used to authenticate against Azure SQL Database.
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey() {
        return this.servicePrincipalKey == null ? Codegen.empty() : this.servicePrincipalKey;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
      private final @Nullable Output<Object> tenant;

    public Output<Object> tenant() {
        return this.tenant == null ? Codegen.empty() : this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureSqlDatabase'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public AzureSqlDatabaseLinkedServiceArgs(
        @Nullable Output<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> azureCloudType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        Output<Object> connectionString,
        @Nullable Output<CredentialReferenceArgs> credential,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<AzureKeyVaultSecretReferenceArgs> password,
        @Nullable Output<Object> servicePrincipalId,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        @Nullable Output<Object> tenant,
        Output<String> type) {
        this.alwaysEncryptedSettings = alwaysEncryptedSettings;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private AzureSqlDatabaseLinkedServiceArgs() {
        this.alwaysEncryptedSettings = Codegen.empty();
        this.annotations = Codegen.empty();
        this.azureCloudType = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.connectionString = Codegen.empty();
        this.credential = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.servicePrincipalId = Codegen.empty();
        this.servicePrincipalKey = Codegen.empty();
        this.tenant = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlDatabaseLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> azureCloudType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private Output<Object> connectionString;
        private @Nullable Output<CredentialReferenceArgs> credential;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<AzureKeyVaultSecretReferenceArgs> password;
        private @Nullable Output<Object> servicePrincipalId;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private @Nullable Output<Object> tenant;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlDatabaseLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysEncryptedSettings = defaults.alwaysEncryptedSettings;
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder alwaysEncryptedSettings(@Nullable Output<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings) {
            this.alwaysEncryptedSettings = alwaysEncryptedSettings;
            return this;
        }
        public Builder alwaysEncryptedSettings(@Nullable SqlAlwaysEncryptedPropertiesArgs alwaysEncryptedSettings) {
            this.alwaysEncryptedSettings = Codegen.ofNullable(alwaysEncryptedSettings);
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
        public Builder connectionString(Output<Object> connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder connectionString(Object connectionString) {
            this.connectionString = Output.of(Objects.requireNonNull(connectionString));
            return this;
        }
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Codegen.ofNullable(credential);
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
        public Builder password(@Nullable Output<AzureKeyVaultSecretReferenceArgs> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable AzureKeyVaultSecretReferenceArgs password) {
            this.password = Codegen.ofNullable(password);
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
        }        public AzureSqlDatabaseLinkedServiceArgs build() {
            return new AzureSqlDatabaseLinkedServiceArgs(alwaysEncryptedSettings, annotations, azureCloudType, connectVia, connectionString, credential, description, encryptedCredential, parameters, password, servicePrincipalId, servicePrincipalKey, tenant, type);
        }
    }
}
