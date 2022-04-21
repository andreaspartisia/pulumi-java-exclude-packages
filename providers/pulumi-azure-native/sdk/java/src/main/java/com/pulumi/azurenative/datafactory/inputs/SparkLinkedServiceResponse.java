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
 * Spark Server linked service.
 * 
 */
public final class SparkLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SparkLinkedServiceResponse Empty = new SparkLinkedServiceResponse();

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    @Import(name="allowHostNameCNMismatch")
    private @Nullable Object allowHostNameCNMismatch;

    public Optional<Object> allowHostNameCNMismatch() {
        return Optional.ofNullable(this.allowHostNameCNMismatch);
    }

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    @Import(name="allowSelfSignedServerCert")
    private @Nullable Object allowSelfSignedServerCert;

    public Optional<Object> allowSelfSignedServerCert() {
        return Optional.ofNullable(this.allowSelfSignedServerCert);
    }

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
     * The authentication method used to access the Spark server.
     * 
     */
    @Import(name="authenticationType", required=true)
    private String authenticationType;

    public String authenticationType() {
        return this.authenticationType;
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
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    @Import(name="enableSsl")
    private @Nullable Object enableSsl;

    public Optional<Object> enableSsl() {
        return Optional.ofNullable(this.enableSsl);
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
     * IP address or host name of the Spark server
     * 
     */
    @Import(name="host", required=true)
    private Object host;

    public Object host() {
        return this.host;
    }

    /**
     * The partial URL corresponding to the Spark server.
     * 
     */
    @Import(name="httpPath")
    private @Nullable Object httpPath;

    public Optional<Object> httpPath() {
        return Optional.ofNullable(this.httpPath);
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
     * The password corresponding to the user name that you provided in the Username field
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The TCP port that the Spark server uses to listen for client connections.
     * 
     */
    @Import(name="port", required=true)
    private Object port;

    public Object port() {
        return this.port;
    }

    /**
     * The type of Spark server.
     * 
     */
    @Import(name="serverType")
    private @Nullable String serverType;

    public Optional<String> serverType() {
        return Optional.ofNullable(this.serverType);
    }

    /**
     * The transport protocol to use in the Thrift layer.
     * 
     */
    @Import(name="thriftTransportProtocol")
    private @Nullable String thriftTransportProtocol;

    public Optional<String> thriftTransportProtocol() {
        return Optional.ofNullable(this.thriftTransportProtocol);
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @Import(name="trustedCertPath")
    private @Nullable Object trustedCertPath;

    public Optional<Object> trustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Spark&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    @Import(name="useSystemTrustStore")
    private @Nullable Object useSystemTrustStore;

    public Optional<Object> useSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }

    /**
     * The user name that you use to access Spark Server.
     * 
     */
    @Import(name="username")
    private @Nullable Object username;

    public Optional<Object> username() {
        return Optional.ofNullable(this.username);
    }

    private SparkLinkedServiceResponse() {}

    private SparkLinkedServiceResponse(SparkLinkedServiceResponse $) {
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
        this.thriftTransportProtocol = $.thriftTransportProtocol;
        this.trustedCertPath = $.trustedCertPath;
        this.type = $.type;
        this.useSystemTrustStore = $.useSystemTrustStore;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkLinkedServiceResponse $;

        public Builder() {
            $ = new SparkLinkedServiceResponse();
        }

        public Builder(SparkLinkedServiceResponse defaults) {
            $ = new SparkLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder allowHostNameCNMismatch(@Nullable Object allowHostNameCNMismatch) {
            $.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }

        public Builder allowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            $.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder authenticationType(String authenticationType) {
            $.authenticationType = authenticationType;
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

        public Builder enableSsl(@Nullable Object enableSsl) {
            $.enableSsl = enableSsl;
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

        public Builder httpPath(@Nullable Object httpPath) {
            $.httpPath = httpPath;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            $.password = password;
            return this;
        }

        public Builder password(AzureKeyVaultSecretReferenceResponse password) {
            return password(Either.ofLeft(password));
        }

        public Builder password(SecureStringResponse password) {
            return password(Either.ofRight(password));
        }

        public Builder port(Object port) {
            $.port = port;
            return this;
        }

        public Builder serverType(@Nullable String serverType) {
            $.serverType = serverType;
            return this;
        }

        public Builder thriftTransportProtocol(@Nullable String thriftTransportProtocol) {
            $.thriftTransportProtocol = thriftTransportProtocol;
            return this;
        }

        public Builder trustedCertPath(@Nullable Object trustedCertPath) {
            $.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder useSystemTrustStore(@Nullable Object useSystemTrustStore) {
            $.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder username(@Nullable Object username) {
            $.username = username;
            return this;
        }

        public SparkLinkedServiceResponse build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
