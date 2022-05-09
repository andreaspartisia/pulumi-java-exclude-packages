// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.mssql.inputs.ServerAzureadAdministratorArgs;
import com.pulumi.azure.mssql.inputs.ServerIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    /**
     * The administrator login name for the new server. Required unless `azuread_authentication_only` in the `azuread_administrator` block is `true`. When omitted, Azure will generate a default username which cannot be subsequently changed. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="administratorLogin")
    private @Nullable Output<String> administratorLogin;

    /**
     * @return The administrator login name for the new server. Required unless `azuread_authentication_only` in the `azuread_administrator` block is `true`. When omitted, Azure will generate a default username which cannot be subsequently changed. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> administratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }

    /**
     * The password associated with the `administrator_login` user. Needs to comply with Azure&#39;s [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx). Required unless `azuread_authentication_only` in the `azuread_administrator` block is `true`.
     * 
     */
    @Import(name="administratorLoginPassword")
    private @Nullable Output<String> administratorLoginPassword;

    /**
     * @return The password associated with the `administrator_login` user. Needs to comply with Azure&#39;s [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx). Required unless `azuread_authentication_only` in the `azuread_administrator` block is `true`.
     * 
     */
    public Optional<Output<String>> administratorLoginPassword() {
        return Optional.ofNullable(this.administratorLoginPassword);
    }

    /**
     * An `azuread_administrator` block as defined below.
     * 
     */
    @Import(name="azureadAdministrator")
    private @Nullable Output<ServerAzureadAdministratorArgs> azureadAdministrator;

    /**
     * @return An `azuread_administrator` block as defined below.
     * 
     */
    public Optional<Output<ServerAzureadAdministratorArgs>> azureadAdministrator() {
        return Optional.ofNullable(this.azureadAdministrator);
    }

    /**
     * The connection policy the server will use. Possible values are `Default`, `Proxy`, and `Redirect`. Defaults to `Default`.
     * 
     */
    @Import(name="connectionPolicy")
    private @Nullable Output<String> connectionPolicy;

    /**
     * @return The connection policy the server will use. Possible values are `Default`, `Proxy`, and `Redirect`. Defaults to `Default`.
     * 
     */
    public Optional<Output<String>> connectionPolicy() {
        return Optional.ofNullable(this.connectionPolicy);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ServerIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<ServerIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The Minimum TLS Version for all SQL Database and SQL Data Warehouse databases associated with the server. Valid values are: `1.0`, `1.1` and `1.2`.
     * 
     */
    @Import(name="minimumTlsVersion")
    private @Nullable Output<String> minimumTlsVersion;

    /**
     * @return The Minimum TLS Version for all SQL Database and SQL Data Warehouse databases associated with the server. Valid values are: `1.0`, `1.1` and `1.2`.
     * 
     */
    public Optional<Output<String>> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }

    /**
     * The name of the Microsoft SQL Server. This needs to be globally unique within Azure.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Microsoft SQL Server. This needs to be globally unique within Azure.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether outbound network traffic is restricted for this server. Defaults to `false`.
     * 
     */
    @Import(name="outboundNetworkRestrictionEnabled")
    private @Nullable Output<Boolean> outboundNetworkRestrictionEnabled;

    /**
     * @return Whether outbound network traffic is restricted for this server. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> outboundNetworkRestrictionEnabled() {
        return Optional.ofNullable(this.outboundNetworkRestrictionEnabled);
    }

    /**
     * Specifies the primary user managed identity id. Required if `type` is `UserAssigned` and should be combined with `user_assigned_identity_ids`.
     * 
     */
    @Import(name="primaryUserAssignedIdentityId")
    private @Nullable Output<String> primaryUserAssignedIdentityId;

    /**
     * @return Specifies the primary user managed identity id. Required if `type` is `UserAssigned` and should be combined with `user_assigned_identity_ids`.
     * 
     */
    public Optional<Output<String>> primaryUserAssignedIdentityId() {
        return Optional.ofNullable(this.primaryUserAssignedIdentityId);
    }

    /**
     * Whether public network access is allowed for this server. Defaults to `true`.
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether public network access is allowed for this server. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * The name of the resource group in which to create the Microsoft SQL Server.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Microsoft SQL Server.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The version for the new server. Valid values are: 2.0 (for v11 server) and 12.0 (for v12 server).
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The version for the new server. Valid values are: 2.0 (for v11 server) and 12.0 (for v12 server).
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private ServerArgs() {}

    private ServerArgs(ServerArgs $) {
        this.administratorLogin = $.administratorLogin;
        this.administratorLoginPassword = $.administratorLoginPassword;
        this.azureadAdministrator = $.azureadAdministrator;
        this.connectionPolicy = $.connectionPolicy;
        this.identity = $.identity;
        this.location = $.location;
        this.minimumTlsVersion = $.minimumTlsVersion;
        this.name = $.name;
        this.outboundNetworkRestrictionEnabled = $.outboundNetworkRestrictionEnabled;
        this.primaryUserAssignedIdentityId = $.primaryUserAssignedIdentityId;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerArgs $;

        public Builder() {
            $ = new ServerArgs();
        }

        public Builder(ServerArgs defaults) {
            $ = new ServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorLogin The administrator login name for the new server. Required unless `azuread_authentication_only` in the `azuread_administrator` block is `true`. When omitted, Azure will generate a default username which cannot be subsequently changed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(@Nullable Output<String> administratorLogin) {
            $.administratorLogin = administratorLogin;
            return this;
        }

        /**
         * @param administratorLogin The administrator login name for the new server. Required unless `azuread_authentication_only` in the `azuread_administrator` block is `true`. When omitted, Azure will generate a default username which cannot be subsequently changed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(String administratorLogin) {
            return administratorLogin(Output.of(administratorLogin));
        }

        /**
         * @param administratorLoginPassword The password associated with the `administrator_login` user. Needs to comply with Azure&#39;s [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx). Required unless `azuread_authentication_only` in the `azuread_administrator` block is `true`.
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(@Nullable Output<String> administratorLoginPassword) {
            $.administratorLoginPassword = administratorLoginPassword;
            return this;
        }

        /**
         * @param administratorLoginPassword The password associated with the `administrator_login` user. Needs to comply with Azure&#39;s [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx). Required unless `azuread_authentication_only` in the `azuread_administrator` block is `true`.
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(String administratorLoginPassword) {
            return administratorLoginPassword(Output.of(administratorLoginPassword));
        }

        /**
         * @param azureadAdministrator An `azuread_administrator` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureadAdministrator(@Nullable Output<ServerAzureadAdministratorArgs> azureadAdministrator) {
            $.azureadAdministrator = azureadAdministrator;
            return this;
        }

        /**
         * @param azureadAdministrator An `azuread_administrator` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureadAdministrator(ServerAzureadAdministratorArgs azureadAdministrator) {
            return azureadAdministrator(Output.of(azureadAdministrator));
        }

        /**
         * @param connectionPolicy The connection policy the server will use. Possible values are `Default`, `Proxy`, and `Redirect`. Defaults to `Default`.
         * 
         * @return builder
         * 
         */
        public Builder connectionPolicy(@Nullable Output<String> connectionPolicy) {
            $.connectionPolicy = connectionPolicy;
            return this;
        }

        /**
         * @param connectionPolicy The connection policy the server will use. Possible values are `Default`, `Proxy`, and `Redirect`. Defaults to `Default`.
         * 
         * @return builder
         * 
         */
        public Builder connectionPolicy(String connectionPolicy) {
            return connectionPolicy(Output.of(connectionPolicy));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ServerIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(ServerIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param minimumTlsVersion The Minimum TLS Version for all SQL Database and SQL Data Warehouse databases associated with the server. Valid values are: `1.0`, `1.1` and `1.2`.
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(@Nullable Output<String> minimumTlsVersion) {
            $.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        /**
         * @param minimumTlsVersion The Minimum TLS Version for all SQL Database and SQL Data Warehouse databases associated with the server. Valid values are: `1.0`, `1.1` and `1.2`.
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(String minimumTlsVersion) {
            return minimumTlsVersion(Output.of(minimumTlsVersion));
        }

        /**
         * @param name The name of the Microsoft SQL Server. This needs to be globally unique within Azure.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Microsoft SQL Server. This needs to be globally unique within Azure.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outboundNetworkRestrictionEnabled Whether outbound network traffic is restricted for this server. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder outboundNetworkRestrictionEnabled(@Nullable Output<Boolean> outboundNetworkRestrictionEnabled) {
            $.outboundNetworkRestrictionEnabled = outboundNetworkRestrictionEnabled;
            return this;
        }

        /**
         * @param outboundNetworkRestrictionEnabled Whether outbound network traffic is restricted for this server. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder outboundNetworkRestrictionEnabled(Boolean outboundNetworkRestrictionEnabled) {
            return outboundNetworkRestrictionEnabled(Output.of(outboundNetworkRestrictionEnabled));
        }

        /**
         * @param primaryUserAssignedIdentityId Specifies the primary user managed identity id. Required if `type` is `UserAssigned` and should be combined with `user_assigned_identity_ids`.
         * 
         * @return builder
         * 
         */
        public Builder primaryUserAssignedIdentityId(@Nullable Output<String> primaryUserAssignedIdentityId) {
            $.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }

        /**
         * @param primaryUserAssignedIdentityId Specifies the primary user managed identity id. Required if `type` is `UserAssigned` and should be combined with `user_assigned_identity_ids`.
         * 
         * @return builder
         * 
         */
        public Builder primaryUserAssignedIdentityId(String primaryUserAssignedIdentityId) {
            return primaryUserAssignedIdentityId(Output.of(primaryUserAssignedIdentityId));
        }

        /**
         * @param publicNetworkAccessEnabled Whether public network access is allowed for this server. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Whether public network access is allowed for this server. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Microsoft SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Microsoft SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param version The version for the new server. Valid values are: 2.0 (for v11 server) and 12.0 (for v12 server).
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version for the new server. Valid values are: 2.0 (for v11 server) and 12.0 (for v12 server).
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ServerArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
