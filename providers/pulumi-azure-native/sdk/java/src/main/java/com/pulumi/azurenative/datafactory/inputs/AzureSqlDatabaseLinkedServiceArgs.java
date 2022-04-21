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
import java.util.Optional;
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
    private @Nullable Output<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings;

    public Optional<Output<SqlAlwaysEncryptedPropertiesArgs>> alwaysEncryptedSettings() {
        return Optional.ofNullable(this.alwaysEncryptedSettings);
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
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
    private @Nullable Output<Object> azureCloudType;

    public Optional<Output<Object>> azureCloudType() {
        return Optional.ofNullable(this.azureCloudType);
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
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString", required=true)
    private Output<Object> connectionString;

    public Output<Object> connectionString() {
        return this.connectionString;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable Output<CredentialReferenceArgs> credential;

    public Optional<Output<CredentialReferenceArgs>> credential() {
        return Optional.ofNullable(this.credential);
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
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The Azure key vault secret reference of password in connection string.
     * 
     */
    @Import(name="password")
    private @Nullable Output<AzureKeyVaultSecretReferenceArgs> password;

    public Optional<Output<AzureKeyVaultSecretReferenceArgs>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The ID of the service principal used to authenticate against Azure SQL Database. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<Object> servicePrincipalId;

    public Optional<Output<Object>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key of the service principal used to authenticate against Azure SQL Database.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
    private @Nullable Output<Object> tenant;

    public Optional<Output<Object>> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AzureSqlDatabase&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private AzureSqlDatabaseLinkedServiceArgs() {}

    private AzureSqlDatabaseLinkedServiceArgs(AzureSqlDatabaseLinkedServiceArgs $) {
        this.alwaysEncryptedSettings = $.alwaysEncryptedSettings;
        this.annotations = $.annotations;
        this.azureCloudType = $.azureCloudType;
        this.connectVia = $.connectVia;
        this.connectionString = $.connectionString;
        this.credential = $.credential;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.tenant = $.tenant;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureSqlDatabaseLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureSqlDatabaseLinkedServiceArgs $;

        public Builder() {
            $ = new AzureSqlDatabaseLinkedServiceArgs();
        }

        public Builder(AzureSqlDatabaseLinkedServiceArgs defaults) {
            $ = new AzureSqlDatabaseLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder alwaysEncryptedSettings(@Nullable Output<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings) {
            $.alwaysEncryptedSettings = alwaysEncryptedSettings;
            return this;
        }

        public Builder alwaysEncryptedSettings(SqlAlwaysEncryptedPropertiesArgs alwaysEncryptedSettings) {
            return alwaysEncryptedSettings(Output.of(alwaysEncryptedSettings));
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

        public Builder azureCloudType(@Nullable Output<Object> azureCloudType) {
            $.azureCloudType = azureCloudType;
            return this;
        }

        public Builder azureCloudType(Object azureCloudType) {
            return azureCloudType(Output.of(azureCloudType));
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder connectionString(Output<Object> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        public Builder connectionString(Object connectionString) {
            return connectionString(Output.of(connectionString));
        }

        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            $.credential = credential;
            return this;
        }

        public Builder credential(CredentialReferenceArgs credential) {
            return credential(Output.of(credential));
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

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder password(@Nullable Output<AzureKeyVaultSecretReferenceArgs> password) {
            $.password = password;
            return this;
        }

        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Output.of(password));
        }

        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalId(Object servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        public Builder servicePrincipalKey(AzureKeyVaultSecretReferenceArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofLeft(servicePrincipalKey));
        }

        public Builder servicePrincipalKey(SecureStringArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofRight(servicePrincipalKey));
        }

        public Builder tenant(@Nullable Output<Object> tenant) {
            $.tenant = tenant;
            return this;
        }

        public Builder tenant(Object tenant) {
            return tenant(Output.of(tenant));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureSqlDatabaseLinkedServiceArgs build() {
            $.connectionString = Objects.requireNonNull($.connectionString, "expected parameter 'connectionString' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
