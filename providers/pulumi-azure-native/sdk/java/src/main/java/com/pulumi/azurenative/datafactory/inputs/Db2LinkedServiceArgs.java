// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.Db2AuthenticationType;
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
 * Linked service for DB2 data source.
 * 
 */
public final class Db2LinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final Db2LinkedServiceArgs Empty = new Db2LinkedServiceArgs();

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
     * AuthenticationType to be used for connection. It is mutually exclusive with connectionString property.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<Either<String,Db2AuthenticationType>> authenticationType;

    public Optional<Output<Either<String,Db2AuthenticationType>>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Certificate Common Name when TLS is enabled. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="certificateCommonName")
    private @Nullable Output<Object> certificateCommonName;

    public Optional<Output<Object>> certificateCommonName() {
        return Optional.ofNullable(this.certificateCommonName);
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
     * The connection string. It is mutually exclusive with server, database, authenticationType, userName, packageCollection and certificateCommonName property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<Object> connectionString;

    public Optional<Output<Object>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * Database name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="database")
    private @Nullable Output<Object> database;

    public Optional<Output<Object>> database() {
        return Optional.ofNullable(this.database);
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Under where packages are created when querying database. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="packageCollection")
    private @Nullable Output<Object> packageCollection;

    public Optional<Output<Object>> packageCollection() {
        return Optional.ofNullable(this.packageCollection);
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
     * Password for authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Server name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server")
    private @Nullable Output<Object> server;

    public Optional<Output<Object>> server() {
        return Optional.ofNullable(this.server);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Db2&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Username for authentication. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
    private @Nullable Output<Object> username;

    public Optional<Output<Object>> username() {
        return Optional.ofNullable(this.username);
    }

    private Db2LinkedServiceArgs() {}

    private Db2LinkedServiceArgs(Db2LinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.certificateCommonName = $.certificateCommonName;
        this.connectVia = $.connectVia;
        this.connectionString = $.connectionString;
        this.database = $.database;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.packageCollection = $.packageCollection;
        this.parameters = $.parameters;
        this.password = $.password;
        this.server = $.server;
        this.type = $.type;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Db2LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Db2LinkedServiceArgs $;

        public Builder() {
            $ = new Db2LinkedServiceArgs();
        }

        public Builder(Db2LinkedServiceArgs defaults) {
            $ = new Db2LinkedServiceArgs(Objects.requireNonNull(defaults));
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

        public Builder authenticationType(@Nullable Output<Either<String,Db2AuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(Either<String,Db2AuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder authenticationType(String authenticationType) {
            return authenticationType(Either.ofLeft(authenticationType));
        }

        public Builder authenticationType(Db2AuthenticationType authenticationType) {
            return authenticationType(Either.ofRight(authenticationType));
        }

        public Builder certificateCommonName(@Nullable Output<Object> certificateCommonName) {
            $.certificateCommonName = certificateCommonName;
            return this;
        }

        public Builder certificateCommonName(Object certificateCommonName) {
            return certificateCommonName(Output.of(certificateCommonName));
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder connectionString(@Nullable Output<Object> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        public Builder connectionString(Object connectionString) {
            return connectionString(Output.of(connectionString));
        }

        public Builder database(@Nullable Output<Object> database) {
            $.database = database;
            return this;
        }

        public Builder database(Object database) {
            return database(Output.of(database));
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

        public Builder packageCollection(@Nullable Output<Object> packageCollection) {
            $.packageCollection = packageCollection;
            return this;
        }

        public Builder packageCollection(Object packageCollection) {
            return packageCollection(Output.of(packageCollection));
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

        public Builder server(@Nullable Output<Object> server) {
            $.server = server;
            return this;
        }

        public Builder server(Object server) {
            return server(Output.of(server));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder username(@Nullable Output<Object> username) {
            $.username = username;
            return this;
        }

        public Builder username(Object username) {
            return username(Output.of(username));
        }

        public Db2LinkedServiceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
