// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.HiveAuthenticationType;
import com.pulumi.azurenative.datafactory.enums.HiveServerType;
import com.pulumi.azurenative.datafactory.enums.HiveThriftTransportProtocol;
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
 * Hive Server linked service.
 * 
 */
public final class HiveLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final HiveLinkedServiceArgs Empty = new HiveLinkedServiceArgs();

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    @Import(name="allowHostNameCNMismatch")
    private @Nullable Output<Object> allowHostNameCNMismatch;

    public Optional<Output<Object>> allowHostNameCNMismatch() {
        return Optional.ofNullable(this.allowHostNameCNMismatch);
    }

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    @Import(name="allowSelfSignedServerCert")
    private @Nullable Output<Object> allowSelfSignedServerCert;

    public Optional<Output<Object>> allowSelfSignedServerCert() {
        return Optional.ofNullable(this.allowSelfSignedServerCert);
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
     * The authentication method used to access the Hive server.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<Either<String,HiveAuthenticationType>> authenticationType;

    public Output<Either<String,HiveAuthenticationType>> authenticationType() {
        return this.authenticationType;
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
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    @Import(name="enableSsl")
    private @Nullable Output<Object> enableSsl;

    public Optional<Output<Object>> enableSsl() {
        return Optional.ofNullable(this.enableSsl);
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
     * IP address or host name of the Hive server, separated by &#39;;&#39; for multiple hosts (only when serviceDiscoveryMode is enable).
     * 
     */
    @Import(name="host", required=true)
    private Output<Object> host;

    public Output<Object> host() {
        return this.host;
    }

    /**
     * The partial URL corresponding to the Hive server.
     * 
     */
    @Import(name="httpPath")
    private @Nullable Output<Object> httpPath;

    public Optional<Output<Object>> httpPath() {
        return Optional.ofNullable(this.httpPath);
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
     * The password corresponding to the user name that you provided in the Username field
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The TCP port that the Hive server uses to listen for client connections.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Object> port;

    public Optional<Output<Object>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The type of Hive server.
     * 
     */
    @Import(name="serverType")
    private @Nullable Output<Either<String,HiveServerType>> serverType;

    public Optional<Output<Either<String,HiveServerType>>> serverType() {
        return Optional.ofNullable(this.serverType);
    }

    /**
     * true to indicate using the ZooKeeper service, false not.
     * 
     */
    @Import(name="serviceDiscoveryMode")
    private @Nullable Output<Object> serviceDiscoveryMode;

    public Optional<Output<Object>> serviceDiscoveryMode() {
        return Optional.ofNullable(this.serviceDiscoveryMode);
    }

    /**
     * The transport protocol to use in the Thrift layer.
     * 
     */
    @Import(name="thriftTransportProtocol")
    private @Nullable Output<Either<String,HiveThriftTransportProtocol>> thriftTransportProtocol;

    public Optional<Output<Either<String,HiveThriftTransportProtocol>>> thriftTransportProtocol() {
        return Optional.ofNullable(this.thriftTransportProtocol);
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
     * Expected value is &#39;Hive&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether the driver uses native HiveQL queries,or converts them into an equivalent form in HiveQL.
     * 
     */
    @Import(name="useNativeQuery")
    private @Nullable Output<Object> useNativeQuery;

    public Optional<Output<Object>> useNativeQuery() {
        return Optional.ofNullable(this.useNativeQuery);
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

    /**
     * The user name that you use to access Hive Server.
     * 
     */
    @Import(name="username")
    private @Nullable Output<Object> username;

    public Optional<Output<Object>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * The namespace on ZooKeeper under which Hive Server 2 nodes are added.
     * 
     */
    @Import(name="zooKeeperNameSpace")
    private @Nullable Output<Object> zooKeeperNameSpace;

    public Optional<Output<Object>> zooKeeperNameSpace() {
        return Optional.ofNullable(this.zooKeeperNameSpace);
    }

    private HiveLinkedServiceArgs() {}

    private HiveLinkedServiceArgs(HiveLinkedServiceArgs $) {
        this.allowHostNameCNMismatch = $.allowHostNameCNMismatch;
        this.allowSelfSignedServerCert = $.allowSelfSignedServerCert;
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.enableSsl = $.enableSsl;
        this.encryptedCredential = $.encryptedCredential;
        this.host = $.host;
        this.httpPath = $.httpPath;
        this.parameters = $.parameters;
        this.password = $.password;
        this.port = $.port;
        this.serverType = $.serverType;
        this.serviceDiscoveryMode = $.serviceDiscoveryMode;
        this.thriftTransportProtocol = $.thriftTransportProtocol;
        this.trustedCertPath = $.trustedCertPath;
        this.type = $.type;
        this.useNativeQuery = $.useNativeQuery;
        this.useSystemTrustStore = $.useSystemTrustStore;
        this.username = $.username;
        this.zooKeeperNameSpace = $.zooKeeperNameSpace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HiveLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HiveLinkedServiceArgs $;

        public Builder() {
            $ = new HiveLinkedServiceArgs();
        }

        public Builder(HiveLinkedServiceArgs defaults) {
            $ = new HiveLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowHostNameCNMismatch(@Nullable Output<Object> allowHostNameCNMismatch) {
            $.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }

        public Builder allowHostNameCNMismatch(Object allowHostNameCNMismatch) {
            return allowHostNameCNMismatch(Output.of(allowHostNameCNMismatch));
        }

        public Builder allowSelfSignedServerCert(@Nullable Output<Object> allowSelfSignedServerCert) {
            $.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder allowSelfSignedServerCert(Object allowSelfSignedServerCert) {
            return allowSelfSignedServerCert(Output.of(allowSelfSignedServerCert));
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

        public Builder authenticationType(Output<Either<String,HiveAuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(Either<String,HiveAuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder authenticationType(String authenticationType) {
            return authenticationType(Either.ofLeft(authenticationType));
        }

        public Builder authenticationType(HiveAuthenticationType authenticationType) {
            return authenticationType(Either.ofRight(authenticationType));
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

        public Builder enableSsl(@Nullable Output<Object> enableSsl) {
            $.enableSsl = enableSsl;
            return this;
        }

        public Builder enableSsl(Object enableSsl) {
            return enableSsl(Output.of(enableSsl));
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        public Builder host(Output<Object> host) {
            $.host = host;
            return this;
        }

        public Builder host(Object host) {
            return host(Output.of(host));
        }

        public Builder httpPath(@Nullable Output<Object> httpPath) {
            $.httpPath = httpPath;
            return this;
        }

        public Builder httpPath(Object httpPath) {
            return httpPath(Output.of(httpPath));
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

        public Builder port(@Nullable Output<Object> port) {
            $.port = port;
            return this;
        }

        public Builder port(Object port) {
            return port(Output.of(port));
        }

        public Builder serverType(@Nullable Output<Either<String,HiveServerType>> serverType) {
            $.serverType = serverType;
            return this;
        }

        public Builder serverType(Either<String,HiveServerType> serverType) {
            return serverType(Output.of(serverType));
        }

        public Builder serverType(String serverType) {
            return serverType(Either.ofLeft(serverType));
        }

        public Builder serverType(HiveServerType serverType) {
            return serverType(Either.ofRight(serverType));
        }

        public Builder serviceDiscoveryMode(@Nullable Output<Object> serviceDiscoveryMode) {
            $.serviceDiscoveryMode = serviceDiscoveryMode;
            return this;
        }

        public Builder serviceDiscoveryMode(Object serviceDiscoveryMode) {
            return serviceDiscoveryMode(Output.of(serviceDiscoveryMode));
        }

        public Builder thriftTransportProtocol(@Nullable Output<Either<String,HiveThriftTransportProtocol>> thriftTransportProtocol) {
            $.thriftTransportProtocol = thriftTransportProtocol;
            return this;
        }

        public Builder thriftTransportProtocol(Either<String,HiveThriftTransportProtocol> thriftTransportProtocol) {
            return thriftTransportProtocol(Output.of(thriftTransportProtocol));
        }

        public Builder thriftTransportProtocol(String thriftTransportProtocol) {
            return thriftTransportProtocol(Either.ofLeft(thriftTransportProtocol));
        }

        public Builder thriftTransportProtocol(HiveThriftTransportProtocol thriftTransportProtocol) {
            return thriftTransportProtocol(Either.ofRight(thriftTransportProtocol));
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

        public Builder useNativeQuery(@Nullable Output<Object> useNativeQuery) {
            $.useNativeQuery = useNativeQuery;
            return this;
        }

        public Builder useNativeQuery(Object useNativeQuery) {
            return useNativeQuery(Output.of(useNativeQuery));
        }

        public Builder useSystemTrustStore(@Nullable Output<Object> useSystemTrustStore) {
            $.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder useSystemTrustStore(Object useSystemTrustStore) {
            return useSystemTrustStore(Output.of(useSystemTrustStore));
        }

        public Builder username(@Nullable Output<Object> username) {
            $.username = username;
            return this;
        }

        public Builder username(Object username) {
            return username(Output.of(username));
        }

        public Builder zooKeeperNameSpace(@Nullable Output<Object> zooKeeperNameSpace) {
            $.zooKeeperNameSpace = zooKeeperNameSpace;
            return this;
        }

        public Builder zooKeeperNameSpace(Object zooKeeperNameSpace) {
            return zooKeeperNameSpace(Output.of(zooKeeperNameSpace));
        }

        public HiveLinkedServiceArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
