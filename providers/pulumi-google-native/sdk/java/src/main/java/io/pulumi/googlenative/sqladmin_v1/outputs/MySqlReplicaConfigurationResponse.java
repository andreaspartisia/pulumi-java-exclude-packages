// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MySqlReplicaConfigurationResponse {
    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
     */
    private final String caCertificate;
    /**
     * PEM representation of the replica's x509 certificate.
     * 
     */
    private final String clientCertificate;
    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
     */
    private final String clientKey;
    /**
     * Seconds to wait between connect retries. MySQL's default is 60 seconds.
     * 
     */
    private final Integer connectRetryInterval;
    /**
     * Path to a SQL dump file in Google Cloud Storage from which the replica instance is to be created. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are also supported. Dumps have the binlog co-ordinates from which replication begins. This can be accomplished by setting --master-data to 1 when using mysqldump.
     * 
     */
    private final String dumpFilePath;
    /**
     * This is always `sql#mysqlReplicaConfiguration`.
     * 
     */
    private final String kind;
    /**
     * Interval in milliseconds between replication heartbeats.
     * 
     */
    private final String masterHeartbeatPeriod;
    /**
     * The password for the replication connection.
     * 
     */
    private final String password;
    /**
     * A list of permissible ciphers to use for SSL encryption.
     * 
     */
    private final String sslCipher;
    /**
     * The username for the replication connection.
     * 
     */
    private final String username;
    /**
     * Whether or not to check the primary instance's Common Name value in the certificate that it sends during the SSL handshake.
     * 
     */
    private final Boolean verifyServerCertificate;

    @CustomType.Constructor
    private MySqlReplicaConfigurationResponse(
        @CustomType.Parameter("caCertificate") String caCertificate,
        @CustomType.Parameter("clientCertificate") String clientCertificate,
        @CustomType.Parameter("clientKey") String clientKey,
        @CustomType.Parameter("connectRetryInterval") Integer connectRetryInterval,
        @CustomType.Parameter("dumpFilePath") String dumpFilePath,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("masterHeartbeatPeriod") String masterHeartbeatPeriod,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("sslCipher") String sslCipher,
        @CustomType.Parameter("username") String username,
        @CustomType.Parameter("verifyServerCertificate") Boolean verifyServerCertificate) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.connectRetryInterval = connectRetryInterval;
        this.dumpFilePath = dumpFilePath;
        this.kind = kind;
        this.masterHeartbeatPeriod = masterHeartbeatPeriod;
        this.password = password;
        this.sslCipher = sslCipher;
        this.username = username;
        this.verifyServerCertificate = verifyServerCertificate;
    }

    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
    */
    public String caCertificate() {
        return this.caCertificate;
    }
    /**
     * PEM representation of the replica's x509 certificate.
     * 
    */
    public String clientCertificate() {
        return this.clientCertificate;
    }
    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
    */
    public String clientKey() {
        return this.clientKey;
    }
    /**
     * Seconds to wait between connect retries. MySQL's default is 60 seconds.
     * 
    */
    public Integer connectRetryInterval() {
        return this.connectRetryInterval;
    }
    /**
     * Path to a SQL dump file in Google Cloud Storage from which the replica instance is to be created. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are also supported. Dumps have the binlog co-ordinates from which replication begins. This can be accomplished by setting --master-data to 1 when using mysqldump.
     * 
    */
    public String dumpFilePath() {
        return this.dumpFilePath;
    }
    /**
     * This is always `sql#mysqlReplicaConfiguration`.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Interval in milliseconds between replication heartbeats.
     * 
    */
    public String masterHeartbeatPeriod() {
        return this.masterHeartbeatPeriod;
    }
    /**
     * The password for the replication connection.
     * 
    */
    public String password() {
        return this.password;
    }
    /**
     * A list of permissible ciphers to use for SSL encryption.
     * 
    */
    public String sslCipher() {
        return this.sslCipher;
    }
    /**
     * The username for the replication connection.
     * 
    */
    public String username() {
        return this.username;
    }
    /**
     * Whether or not to check the primary instance's Common Name value in the certificate that it sends during the SSL handshake.
     * 
    */
    public Boolean verifyServerCertificate() {
        return this.verifyServerCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlReplicaConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificate;
        private String clientCertificate;
        private String clientKey;
        private Integer connectRetryInterval;
        private String dumpFilePath;
        private String kind;
        private String masterHeartbeatPeriod;
        private String password;
        private String sslCipher;
        private String username;
        private Boolean verifyServerCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(MySqlReplicaConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.connectRetryInterval = defaults.connectRetryInterval;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.kind = defaults.kind;
    	      this.masterHeartbeatPeriod = defaults.masterHeartbeatPeriod;
    	      this.password = defaults.password;
    	      this.sslCipher = defaults.sslCipher;
    	      this.username = defaults.username;
    	      this.verifyServerCertificate = defaults.verifyServerCertificate;
        }

        public Builder caCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }
        public Builder clientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }
        public Builder clientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }
        public Builder connectRetryInterval(Integer connectRetryInterval) {
            this.connectRetryInterval = Objects.requireNonNull(connectRetryInterval);
            return this;
        }
        public Builder dumpFilePath(String dumpFilePath) {
            this.dumpFilePath = Objects.requireNonNull(dumpFilePath);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder masterHeartbeatPeriod(String masterHeartbeatPeriod) {
            this.masterHeartbeatPeriod = Objects.requireNonNull(masterHeartbeatPeriod);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder sslCipher(String sslCipher) {
            this.sslCipher = Objects.requireNonNull(sslCipher);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder verifyServerCertificate(Boolean verifyServerCertificate) {
            this.verifyServerCertificate = Objects.requireNonNull(verifyServerCertificate);
            return this;
        }        public MySqlReplicaConfigurationResponse build() {
            return new MySqlReplicaConfigurationResponse(caCertificate, clientCertificate, clientKey, connectRetryInterval, dumpFilePath, kind, masterHeartbeatPeriod, password, sslCipher, username, verifyServerCertificate);
        }
    }
}
