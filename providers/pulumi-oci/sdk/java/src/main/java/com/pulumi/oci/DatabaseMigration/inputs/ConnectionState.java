// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DatabaseMigration.inputs.ConnectionAdminCredentialsArgs;
import com.pulumi.oci.DatabaseMigration.inputs.ConnectionConnectDescriptorArgs;
import com.pulumi.oci.DatabaseMigration.inputs.ConnectionPrivateEndpointArgs;
import com.pulumi.oci.DatabaseMigration.inputs.ConnectionSshDetailsArgs;
import com.pulumi.oci.DatabaseMigration.inputs.ConnectionVaultDetailsArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * (Updatable) Database Administrator Credentials details.
     * 
     */
    @Import(name="adminCredentials")
    private @Nullable Output<ConnectionAdminCredentialsArgs> adminCredentials;

    /**
     * @return (Updatable) Database Administrator Credentials details.
     * 
     */
    public Optional<Output<ConnectionAdminCredentialsArgs>> adminCredentials() {
        return Optional.ofNullable(this.adminCredentials);
    }

    /**
     * (Updatable) This name is the distinguished name used while creating the certificate on target database. Requires a TLS wallet to be specified. Not required for source container database connections.
     * 
     */
    @Import(name="certificateTdn")
    private @Nullable Output<String> certificateTdn;

    /**
     * @return (Updatable) This name is the distinguished name used while creating the certificate on target database. Requires a TLS wallet to be specified. Not required for source container database connections.
     * 
     */
    public Optional<Output<String>> certificateTdn() {
        return Optional.ofNullable(this.certificateTdn);
    }

    /**
     * (Updatable) OCID of the compartment where the secret containing the credentials will be created.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) OCID of the compartment where the secret containing the credentials will be created.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) Connect Descriptor details. Required for Manual and UserManagerOci connection types. If a Private Endpoint was specified for the Connection, the host should contain a valid IP address.
     * 
     */
    @Import(name="connectDescriptor")
    private @Nullable Output<ConnectionConnectDescriptorArgs> connectDescriptor;

    /**
     * @return (Updatable) Connect Descriptor details. Required for Manual and UserManagerOci connection types. If a Private Endpoint was specified for the Connection, the host should contain a valid IP address.
     * 
     */
    public Optional<Output<ConnectionConnectDescriptorArgs>> connectDescriptor() {
        return Optional.ofNullable(this.connectDescriptor);
    }

    /**
     * OCID of the Secret in the Oracle Cloud Infrastructure vault containing the Database Connection credentials.
     * 
     */
    @Import(name="credentialsSecretId")
    private @Nullable Output<String> credentialsSecretId;

    /**
     * @return OCID of the Secret in the Oracle Cloud Infrastructure vault containing the Database Connection credentials.
     * 
     */
    public Optional<Output<String>> credentialsSecretId() {
        return Optional.ofNullable(this.credentialsSecretId);
    }

    /**
     * (Updatable) The OCID of the cloud database. Required if the database connection type is Autonomous.
     * 
     */
    @Import(name="databaseId")
    private @Nullable Output<String> databaseId;

    /**
     * @return (Updatable) The OCID of the cloud database. Required if the database connection type is Autonomous.
     * 
     */
    public Optional<Output<String>> databaseId() {
        return Optional.ofNullable(this.databaseId);
    }

    /**
     * Database connection type.
     * 
     */
    @Import(name="databaseType")
    private @Nullable Output<String> databaseType;

    /**
     * @return Database connection type.
     * 
     */
    public Optional<Output<String>> databaseType() {
        return Optional.ofNullable(this.databaseType);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) Database Connection display name identifier.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) Database Connection display name identifier.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * (Updatable) Oracle Cloud Infrastructure Private Endpoint configuration details. Not required for source container database connections, it will default to the specified Source Database Connection Private Endpoint.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable Output<ConnectionPrivateEndpointArgs> privateEndpoint;

    /**
     * @return (Updatable) Oracle Cloud Infrastructure Private Endpoint configuration details. Not required for source container database connections, it will default to the specified Source Database Connection Private Endpoint.
     * 
     */
    public Optional<Output<ConnectionPrivateEndpointArgs>> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * (Updatable) Details of the SSH key that will be used. Required for source database Manual and UserManagerOci connection types. Not required for source container database connections.
     * 
     */
    @Import(name="sshDetails")
    private @Nullable Output<ConnectionSshDetailsArgs> sshDetails;

    /**
     * @return (Updatable) Details of the SSH key that will be used. Required for source database Manual and UserManagerOci connection types. Not required for source container database connections.
     * 
     */
    public Optional<Output<ConnectionSshDetailsArgs>> sshDetails() {
        return Optional.ofNullable(this.sshDetails);
    }

    /**
     * The current state of the Connection resource.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the Connection resource.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Import(name="systemTags")
    private @Nullable Output<Map<String,Object>> systemTags;

    /**
     * @return Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> systemTags() {
        return Optional.ofNullable(this.systemTags);
    }

    /**
     * The time the Connection resource was created. An RFC3339 formatted datetime string.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The time the Connection resource was created. An RFC3339 formatted datetime string.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * The time of the last Connection resource details update. An RFC3339 formatted datetime string.
     * 
     */
    @Import(name="timeUpdated")
    private @Nullable Output<String> timeUpdated;

    /**
     * @return The time of the last Connection resource details update. An RFC3339 formatted datetime string.
     * 
     */
    public Optional<Output<String>> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    /**
     * (Updatable) keystore.jks file contents; base64 encoded String. Requires a TLS wallet to be specified. Not required for source container database connections.
     * 
     */
    @Import(name="tlsKeystore")
    private @Nullable Output<String> tlsKeystore;

    /**
     * @return (Updatable) keystore.jks file contents; base64 encoded String. Requires a TLS wallet to be specified. Not required for source container database connections.
     * 
     */
    public Optional<Output<String>> tlsKeystore() {
        return Optional.ofNullable(this.tlsKeystore);
    }

    /**
     * (Updatable) cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
     * 
     */
    @Import(name="tlsWallet")
    private @Nullable Output<String> tlsWallet;

    /**
     * @return (Updatable) cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
     * 
     */
    public Optional<Output<String>> tlsWallet() {
        return Optional.ofNullable(this.tlsWallet);
    }

    /**
     * (Updatable) Oracle Cloud Infrastructure Vault details to store migration and connection credentials secrets
     * 
     */
    @Import(name="vaultDetails")
    private @Nullable Output<ConnectionVaultDetailsArgs> vaultDetails;

    /**
     * @return (Updatable) Oracle Cloud Infrastructure Vault details to store migration and connection credentials secrets
     * 
     */
    public Optional<Output<ConnectionVaultDetailsArgs>> vaultDetails() {
        return Optional.ofNullable(this.vaultDetails);
    }

    private ConnectionState() {}

    private ConnectionState(ConnectionState $) {
        this.adminCredentials = $.adminCredentials;
        this.certificateTdn = $.certificateTdn;
        this.compartmentId = $.compartmentId;
        this.connectDescriptor = $.connectDescriptor;
        this.credentialsSecretId = $.credentialsSecretId;
        this.databaseId = $.databaseId;
        this.databaseType = $.databaseType;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.lifecycleDetails = $.lifecycleDetails;
        this.privateEndpoint = $.privateEndpoint;
        this.sshDetails = $.sshDetails;
        this.state = $.state;
        this.systemTags = $.systemTags;
        this.timeCreated = $.timeCreated;
        this.timeUpdated = $.timeUpdated;
        this.tlsKeystore = $.tlsKeystore;
        this.tlsWallet = $.tlsWallet;
        this.vaultDetails = $.vaultDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionState $;

        public Builder() {
            $ = new ConnectionState();
        }

        public Builder(ConnectionState defaults) {
            $ = new ConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminCredentials (Updatable) Database Administrator Credentials details.
         * 
         * @return builder
         * 
         */
        public Builder adminCredentials(@Nullable Output<ConnectionAdminCredentialsArgs> adminCredentials) {
            $.adminCredentials = adminCredentials;
            return this;
        }

        /**
         * @param adminCredentials (Updatable) Database Administrator Credentials details.
         * 
         * @return builder
         * 
         */
        public Builder adminCredentials(ConnectionAdminCredentialsArgs adminCredentials) {
            return adminCredentials(Output.of(adminCredentials));
        }

        /**
         * @param certificateTdn (Updatable) This name is the distinguished name used while creating the certificate on target database. Requires a TLS wallet to be specified. Not required for source container database connections.
         * 
         * @return builder
         * 
         */
        public Builder certificateTdn(@Nullable Output<String> certificateTdn) {
            $.certificateTdn = certificateTdn;
            return this;
        }

        /**
         * @param certificateTdn (Updatable) This name is the distinguished name used while creating the certificate on target database. Requires a TLS wallet to be specified. Not required for source container database connections.
         * 
         * @return builder
         * 
         */
        public Builder certificateTdn(String certificateTdn) {
            return certificateTdn(Output.of(certificateTdn));
        }

        /**
         * @param compartmentId (Updatable) OCID of the compartment where the secret containing the credentials will be created.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) OCID of the compartment where the secret containing the credentials will be created.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param connectDescriptor (Updatable) Connect Descriptor details. Required for Manual and UserManagerOci connection types. If a Private Endpoint was specified for the Connection, the host should contain a valid IP address.
         * 
         * @return builder
         * 
         */
        public Builder connectDescriptor(@Nullable Output<ConnectionConnectDescriptorArgs> connectDescriptor) {
            $.connectDescriptor = connectDescriptor;
            return this;
        }

        /**
         * @param connectDescriptor (Updatable) Connect Descriptor details. Required for Manual and UserManagerOci connection types. If a Private Endpoint was specified for the Connection, the host should contain a valid IP address.
         * 
         * @return builder
         * 
         */
        public Builder connectDescriptor(ConnectionConnectDescriptorArgs connectDescriptor) {
            return connectDescriptor(Output.of(connectDescriptor));
        }

        /**
         * @param credentialsSecretId OCID of the Secret in the Oracle Cloud Infrastructure vault containing the Database Connection credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentialsSecretId(@Nullable Output<String> credentialsSecretId) {
            $.credentialsSecretId = credentialsSecretId;
            return this;
        }

        /**
         * @param credentialsSecretId OCID of the Secret in the Oracle Cloud Infrastructure vault containing the Database Connection credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentialsSecretId(String credentialsSecretId) {
            return credentialsSecretId(Output.of(credentialsSecretId));
        }

        /**
         * @param databaseId (Updatable) The OCID of the cloud database. Required if the database connection type is Autonomous.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(@Nullable Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId (Updatable) The OCID of the cloud database. Required if the database connection type is Autonomous.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param databaseType Database connection type.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(@Nullable Output<String> databaseType) {
            $.databaseType = databaseType;
            return this;
        }

        /**
         * @param databaseType Database connection type.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(String databaseType) {
            return databaseType(Output.of(databaseType));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) Database Connection display name identifier.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) Database Connection display name identifier.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param lifecycleDetails A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param privateEndpoint (Updatable) Oracle Cloud Infrastructure Private Endpoint configuration details. Not required for source container database connections, it will default to the specified Source Database Connection Private Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable Output<ConnectionPrivateEndpointArgs> privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateEndpoint (Updatable) Oracle Cloud Infrastructure Private Endpoint configuration details. Not required for source container database connections, it will default to the specified Source Database Connection Private Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(ConnectionPrivateEndpointArgs privateEndpoint) {
            return privateEndpoint(Output.of(privateEndpoint));
        }

        /**
         * @param sshDetails (Updatable) Details of the SSH key that will be used. Required for source database Manual and UserManagerOci connection types. Not required for source container database connections.
         * 
         * @return builder
         * 
         */
        public Builder sshDetails(@Nullable Output<ConnectionSshDetailsArgs> sshDetails) {
            $.sshDetails = sshDetails;
            return this;
        }

        /**
         * @param sshDetails (Updatable) Details of the SSH key that will be used. Required for source database Manual and UserManagerOci connection types. Not required for source container database connections.
         * 
         * @return builder
         * 
         */
        public Builder sshDetails(ConnectionSshDetailsArgs sshDetails) {
            return sshDetails(Output.of(sshDetails));
        }

        /**
         * @param state The current state of the Connection resource.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the Connection resource.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param systemTags Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(@Nullable Output<Map<String,Object>> systemTags) {
            $.systemTags = systemTags;
            return this;
        }

        /**
         * @param systemTags Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(Map<String,Object> systemTags) {
            return systemTags(Output.of(systemTags));
        }

        /**
         * @param timeCreated The time the Connection resource was created. An RFC3339 formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The time the Connection resource was created. An RFC3339 formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeUpdated The time of the last Connection resource details update. An RFC3339 formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(@Nullable Output<String> timeUpdated) {
            $.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * @param timeUpdated The time of the last Connection resource details update. An RFC3339 formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(String timeUpdated) {
            return timeUpdated(Output.of(timeUpdated));
        }

        /**
         * @param tlsKeystore (Updatable) keystore.jks file contents; base64 encoded String. Requires a TLS wallet to be specified. Not required for source container database connections.
         * 
         * @return builder
         * 
         */
        public Builder tlsKeystore(@Nullable Output<String> tlsKeystore) {
            $.tlsKeystore = tlsKeystore;
            return this;
        }

        /**
         * @param tlsKeystore (Updatable) keystore.jks file contents; base64 encoded String. Requires a TLS wallet to be specified. Not required for source container database connections.
         * 
         * @return builder
         * 
         */
        public Builder tlsKeystore(String tlsKeystore) {
            return tlsKeystore(Output.of(tlsKeystore));
        }

        /**
         * @param tlsWallet (Updatable) cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
         * 
         * @return builder
         * 
         */
        public Builder tlsWallet(@Nullable Output<String> tlsWallet) {
            $.tlsWallet = tlsWallet;
            return this;
        }

        /**
         * @param tlsWallet (Updatable) cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
         * 
         * @return builder
         * 
         */
        public Builder tlsWallet(String tlsWallet) {
            return tlsWallet(Output.of(tlsWallet));
        }

        /**
         * @param vaultDetails (Updatable) Oracle Cloud Infrastructure Vault details to store migration and connection credentials secrets
         * 
         * @return builder
         * 
         */
        public Builder vaultDetails(@Nullable Output<ConnectionVaultDetailsArgs> vaultDetails) {
            $.vaultDetails = vaultDetails;
            return this;
        }

        /**
         * @param vaultDetails (Updatable) Oracle Cloud Infrastructure Vault details to store migration and connection credentials secrets
         * 
         * @return builder
         * 
         */
        public Builder vaultDetails(ConnectionVaultDetailsArgs vaultDetails) {
            return vaultDetails(Output.of(vaultDetails));
        }

        public ConnectionState build() {
            return $;
        }
    }

}
