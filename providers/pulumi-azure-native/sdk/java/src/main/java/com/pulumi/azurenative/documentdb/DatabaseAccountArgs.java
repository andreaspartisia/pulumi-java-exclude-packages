// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.documentdb.enums.ConnectorOffer;
import com.pulumi.azurenative.documentdb.enums.DatabaseAccountKind;
import com.pulumi.azurenative.documentdb.enums.DatabaseAccountOfferType;
import com.pulumi.azurenative.documentdb.enums.NetworkAclBypass;
import com.pulumi.azurenative.documentdb.enums.PublicNetworkAccess;
import com.pulumi.azurenative.documentdb.inputs.ApiPropertiesArgs;
import com.pulumi.azurenative.documentdb.inputs.CapabilityArgs;
import com.pulumi.azurenative.documentdb.inputs.ConsistencyPolicyArgs;
import com.pulumi.azurenative.documentdb.inputs.ContinuousModeBackupPolicyArgs;
import com.pulumi.azurenative.documentdb.inputs.CorsPolicyArgs;
import com.pulumi.azurenative.documentdb.inputs.IpAddressOrRangeArgs;
import com.pulumi.azurenative.documentdb.inputs.LocationArgs;
import com.pulumi.azurenative.documentdb.inputs.ManagedServiceIdentityArgs;
import com.pulumi.azurenative.documentdb.inputs.PeriodicModeBackupPolicyArgs;
import com.pulumi.azurenative.documentdb.inputs.VirtualNetworkRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseAccountArgs Empty = new DatabaseAccountArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName == null ? Codegen.empty() : this.accountName;
    }

    /**
     * API specific properties. Currently, supported only for MongoDB API.
     * 
     */
    @Import(name="apiProperties")
      private final @Nullable Output<ApiPropertiesArgs> apiProperties;

    public Output<ApiPropertiesArgs> apiProperties() {
        return this.apiProperties == null ? Codegen.empty() : this.apiProperties;
    }

    /**
     * The object representing the policy for taking backups on an account.
     * 
     */
    @Import(name="backupPolicy")
      private final @Nullable Output<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> backupPolicy;

    public Output<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> backupPolicy() {
        return this.backupPolicy == null ? Codegen.empty() : this.backupPolicy;
    }

    /**
     * List of Cosmos DB capabilities for the account
     * 
     */
    @Import(name="capabilities")
      private final @Nullable Output<List<CapabilityArgs>> capabilities;

    public Output<List<CapabilityArgs>> capabilities() {
        return this.capabilities == null ? Codegen.empty() : this.capabilities;
    }

    /**
     * The cassandra connector offer type for the Cosmos DB database C* account.
     * 
     */
    @Import(name="connectorOffer")
      private final @Nullable Output<Either<String,ConnectorOffer>> connectorOffer;

    public Output<Either<String,ConnectorOffer>> connectorOffer() {
        return this.connectorOffer == null ? Codegen.empty() : this.connectorOffer;
    }

    /**
     * The consistency policy for the Cosmos DB account.
     * 
     */
    @Import(name="consistencyPolicy")
      private final @Nullable Output<ConsistencyPolicyArgs> consistencyPolicy;

    public Output<ConsistencyPolicyArgs> consistencyPolicy() {
        return this.consistencyPolicy == null ? Codegen.empty() : this.consistencyPolicy;
    }

    /**
     * The CORS policy for the Cosmos DB database account.
     * 
     */
    @Import(name="cors")
      private final @Nullable Output<List<CorsPolicyArgs>> cors;

    public Output<List<CorsPolicyArgs>> cors() {
        return this.cors == null ? Codegen.empty() : this.cors;
    }

    /**
     * The offer type for the database
     * 
     */
    @Import(name="databaseAccountOfferType", required=true)
      private final Output<DatabaseAccountOfferType> databaseAccountOfferType;

    public Output<DatabaseAccountOfferType> databaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }

    /**
     * The default identity for accessing key vault used in features like customer managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity" and more.
     * 
     */
    @Import(name="defaultIdentity")
      private final @Nullable Output<String> defaultIdentity;

    public Output<String> defaultIdentity() {
        return this.defaultIdentity == null ? Codegen.empty() : this.defaultIdentity;
    }

    /**
     * Disable write operations on metadata resources (databases, containers, throughput) via account keys
     * 
     */
    @Import(name="disableKeyBasedMetadataWriteAccess")
      private final @Nullable Output<Boolean> disableKeyBasedMetadataWriteAccess;

    public Output<Boolean> disableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess == null ? Codegen.empty() : this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Flag to indicate whether to enable storage analytics.
     * 
     */
    @Import(name="enableAnalyticalStorage")
      private final @Nullable Output<Boolean> enableAnalyticalStorage;

    public Output<Boolean> enableAnalyticalStorage() {
        return this.enableAnalyticalStorage == null ? Codegen.empty() : this.enableAnalyticalStorage;
    }

    /**
     * Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     * 
     */
    @Import(name="enableAutomaticFailover")
      private final @Nullable Output<Boolean> enableAutomaticFailover;

    public Output<Boolean> enableAutomaticFailover() {
        return this.enableAutomaticFailover == null ? Codegen.empty() : this.enableAutomaticFailover;
    }

    /**
     * Enables the cassandra connector on the Cosmos DB C* account
     * 
     */
    @Import(name="enableCassandraConnector")
      private final @Nullable Output<Boolean> enableCassandraConnector;

    public Output<Boolean> enableCassandraConnector() {
        return this.enableCassandraConnector == null ? Codegen.empty() : this.enableCassandraConnector;
    }

    /**
     * Flag to indicate whether Free Tier is enabled.
     * 
     */
    @Import(name="enableFreeTier")
      private final @Nullable Output<Boolean> enableFreeTier;

    public Output<Boolean> enableFreeTier() {
        return this.enableFreeTier == null ? Codegen.empty() : this.enableFreeTier;
    }

    /**
     * Enables the account to write in multiple locations
     * 
     */
    @Import(name="enableMultipleWriteLocations")
      private final @Nullable Output<Boolean> enableMultipleWriteLocations;

    public Output<Boolean> enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations == null ? Codegen.empty() : this.enableMultipleWriteLocations;
    }

    /**
     * Identity for the resource.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * List of IpRules.
     * 
     */
    @Import(name="ipRules")
      private final @Nullable Output<List<IpAddressOrRangeArgs>> ipRules;

    public Output<List<IpAddressOrRangeArgs>> ipRules() {
        return this.ipRules == null ? Codegen.empty() : this.ipRules;
    }

    /**
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     * 
     */
    @Import(name="isVirtualNetworkFilterEnabled")
      private final @Nullable Output<Boolean> isVirtualNetworkFilterEnabled;

    public Output<Boolean> isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled == null ? Codegen.empty() : this.isVirtualNetworkFilterEnabled;
    }

    /**
     * The URI of the key vault
     * 
     */
    @Import(name="keyVaultKeyUri")
      private final @Nullable Output<String> keyVaultKeyUri;

    public Output<String> keyVaultKeyUri() {
        return this.keyVaultKeyUri == null ? Codegen.empty() : this.keyVaultKeyUri;
    }

    /**
     * Indicates the type of database account. This can only be set at database account creation.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<Either<String,DatabaseAccountKind>> kind;

    public Output<Either<String,DatabaseAccountKind>> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * An array that contains the georeplication locations enabled for the Cosmos DB account.
     * 
     */
    @Import(name="locations", required=true)
      private final Output<List<LocationArgs>> locations;

    public Output<List<LocationArgs>> locations() {
        return this.locations;
    }

    /**
     * Indicates what services are allowed to bypass firewall checks.
     * 
     */
    @Import(name="networkAclBypass")
      private final @Nullable Output<NetworkAclBypass> networkAclBypass;

    public Output<NetworkAclBypass> networkAclBypass() {
        return this.networkAclBypass == null ? Codegen.empty() : this.networkAclBypass;
    }

    /**
     * An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     * 
     */
    @Import(name="networkAclBypassResourceIds")
      private final @Nullable Output<List<String>> networkAclBypassResourceIds;

    public Output<List<String>> networkAclBypassResourceIds() {
        return this.networkAclBypassResourceIds == null ? Codegen.empty() : this.networkAclBypassResourceIds;
    }

    /**
     * Whether requests from Public Network are allowed
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccess>> publicNetworkAccess() {
        return this.publicNetworkAccess == null ? Codegen.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
     */
    @Import(name="virtualNetworkRules")
      private final @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

    public Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules() {
        return this.virtualNetworkRules == null ? Codegen.empty() : this.virtualNetworkRules;
    }

    public DatabaseAccountArgs(
        @Nullable Output<String> accountName,
        @Nullable Output<ApiPropertiesArgs> apiProperties,
        @Nullable Output<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> backupPolicy,
        @Nullable Output<List<CapabilityArgs>> capabilities,
        @Nullable Output<Either<String,ConnectorOffer>> connectorOffer,
        @Nullable Output<ConsistencyPolicyArgs> consistencyPolicy,
        @Nullable Output<List<CorsPolicyArgs>> cors,
        Output<DatabaseAccountOfferType> databaseAccountOfferType,
        @Nullable Output<String> defaultIdentity,
        @Nullable Output<Boolean> disableKeyBasedMetadataWriteAccess,
        @Nullable Output<Boolean> enableAnalyticalStorage,
        @Nullable Output<Boolean> enableAutomaticFailover,
        @Nullable Output<Boolean> enableCassandraConnector,
        @Nullable Output<Boolean> enableFreeTier,
        @Nullable Output<Boolean> enableMultipleWriteLocations,
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        @Nullable Output<List<IpAddressOrRangeArgs>> ipRules,
        @Nullable Output<Boolean> isVirtualNetworkFilterEnabled,
        @Nullable Output<String> keyVaultKeyUri,
        @Nullable Output<Either<String,DatabaseAccountKind>> kind,
        @Nullable Output<String> location,
        Output<List<LocationArgs>> locations,
        @Nullable Output<NetworkAclBypass> networkAclBypass,
        @Nullable Output<List<String>> networkAclBypassResourceIds,
        @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
        this.accountName = accountName;
        this.apiProperties = apiProperties;
        this.backupPolicy = backupPolicy;
        this.capabilities = capabilities;
        this.connectorOffer = connectorOffer;
        this.consistencyPolicy = consistencyPolicy;
        this.cors = cors;
        this.databaseAccountOfferType = Objects.requireNonNull(databaseAccountOfferType, "expected parameter 'databaseAccountOfferType' to be non-null");
        this.defaultIdentity = defaultIdentity;
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        this.enableAnalyticalStorage = enableAnalyticalStorage;
        this.enableAutomaticFailover = enableAutomaticFailover;
        this.enableCassandraConnector = enableCassandraConnector;
        this.enableFreeTier = enableFreeTier;
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        this.identity = identity;
        this.ipRules = ipRules;
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        this.keyVaultKeyUri = keyVaultKeyUri;
        this.kind = Codegen.stringProp("kind").left(DatabaseAccountKind.class).output().arg(kind).def("GlobalDocumentDB").getNullable();
        this.location = location;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.networkAclBypass = networkAclBypass;
        this.networkAclBypassResourceIds = networkAclBypassResourceIds;
        this.publicNetworkAccess = publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private DatabaseAccountArgs() {
        this.accountName = Codegen.empty();
        this.apiProperties = Codegen.empty();
        this.backupPolicy = Codegen.empty();
        this.capabilities = Codegen.empty();
        this.connectorOffer = Codegen.empty();
        this.consistencyPolicy = Codegen.empty();
        this.cors = Codegen.empty();
        this.databaseAccountOfferType = Codegen.empty();
        this.defaultIdentity = Codegen.empty();
        this.disableKeyBasedMetadataWriteAccess = Codegen.empty();
        this.enableAnalyticalStorage = Codegen.empty();
        this.enableAutomaticFailover = Codegen.empty();
        this.enableCassandraConnector = Codegen.empty();
        this.enableFreeTier = Codegen.empty();
        this.enableMultipleWriteLocations = Codegen.empty();
        this.identity = Codegen.empty();
        this.ipRules = Codegen.empty();
        this.isVirtualNetworkFilterEnabled = Codegen.empty();
        this.keyVaultKeyUri = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.locations = Codegen.empty();
        this.networkAclBypass = Codegen.empty();
        this.networkAclBypassResourceIds = Codegen.empty();
        this.publicNetworkAccess = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.virtualNetworkRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountName;
        private @Nullable Output<ApiPropertiesArgs> apiProperties;
        private @Nullable Output<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> backupPolicy;
        private @Nullable Output<List<CapabilityArgs>> capabilities;
        private @Nullable Output<Either<String,ConnectorOffer>> connectorOffer;
        private @Nullable Output<ConsistencyPolicyArgs> consistencyPolicy;
        private @Nullable Output<List<CorsPolicyArgs>> cors;
        private Output<DatabaseAccountOfferType> databaseAccountOfferType;
        private @Nullable Output<String> defaultIdentity;
        private @Nullable Output<Boolean> disableKeyBasedMetadataWriteAccess;
        private @Nullable Output<Boolean> enableAnalyticalStorage;
        private @Nullable Output<Boolean> enableAutomaticFailover;
        private @Nullable Output<Boolean> enableCassandraConnector;
        private @Nullable Output<Boolean> enableFreeTier;
        private @Nullable Output<Boolean> enableMultipleWriteLocations;
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private @Nullable Output<List<IpAddressOrRangeArgs>> ipRules;
        private @Nullable Output<Boolean> isVirtualNetworkFilterEnabled;
        private @Nullable Output<String> keyVaultKeyUri;
        private @Nullable Output<Either<String,DatabaseAccountKind>> kind;
        private @Nullable Output<String> location;
        private Output<List<LocationArgs>> locations;
        private @Nullable Output<NetworkAclBypass> networkAclBypass;
        private @Nullable Output<List<String>> networkAclBypassResourceIds;
        private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.apiProperties = defaults.apiProperties;
    	      this.backupPolicy = defaults.backupPolicy;
    	      this.capabilities = defaults.capabilities;
    	      this.connectorOffer = defaults.connectorOffer;
    	      this.consistencyPolicy = defaults.consistencyPolicy;
    	      this.cors = defaults.cors;
    	      this.databaseAccountOfferType = defaults.databaseAccountOfferType;
    	      this.defaultIdentity = defaults.defaultIdentity;
    	      this.disableKeyBasedMetadataWriteAccess = defaults.disableKeyBasedMetadataWriteAccess;
    	      this.enableAnalyticalStorage = defaults.enableAnalyticalStorage;
    	      this.enableAutomaticFailover = defaults.enableAutomaticFailover;
    	      this.enableCassandraConnector = defaults.enableCassandraConnector;
    	      this.enableFreeTier = defaults.enableFreeTier;
    	      this.enableMultipleWriteLocations = defaults.enableMultipleWriteLocations;
    	      this.identity = defaults.identity;
    	      this.ipRules = defaults.ipRules;
    	      this.isVirtualNetworkFilterEnabled = defaults.isVirtualNetworkFilterEnabled;
    	      this.keyVaultKeyUri = defaults.keyVaultKeyUri;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.locations = defaults.locations;
    	      this.networkAclBypass = defaults.networkAclBypass;
    	      this.networkAclBypassResourceIds = defaults.networkAclBypassResourceIds;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = Codegen.ofNullable(accountName);
            return this;
        }
        public Builder apiProperties(@Nullable Output<ApiPropertiesArgs> apiProperties) {
            this.apiProperties = apiProperties;
            return this;
        }
        public Builder apiProperties(@Nullable ApiPropertiesArgs apiProperties) {
            this.apiProperties = Codegen.ofNullable(apiProperties);
            return this;
        }
        public Builder backupPolicy(@Nullable Output<Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs>> backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }
        public Builder backupPolicy(@Nullable Either<ContinuousModeBackupPolicyArgs,PeriodicModeBackupPolicyArgs> backupPolicy) {
            this.backupPolicy = Codegen.ofNullable(backupPolicy);
            return this;
        }
        public Builder capabilities(@Nullable Output<List<CapabilityArgs>> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(@Nullable List<CapabilityArgs> capabilities) {
            this.capabilities = Codegen.ofNullable(capabilities);
            return this;
        }
        public Builder capabilities(CapabilityArgs... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder connectorOffer(@Nullable Output<Either<String,ConnectorOffer>> connectorOffer) {
            this.connectorOffer = connectorOffer;
            return this;
        }
        public Builder connectorOffer(@Nullable Either<String,ConnectorOffer> connectorOffer) {
            this.connectorOffer = Codegen.ofNullable(connectorOffer);
            return this;
        }
        public Builder consistencyPolicy(@Nullable Output<ConsistencyPolicyArgs> consistencyPolicy) {
            this.consistencyPolicy = consistencyPolicy;
            return this;
        }
        public Builder consistencyPolicy(@Nullable ConsistencyPolicyArgs consistencyPolicy) {
            this.consistencyPolicy = Codegen.ofNullable(consistencyPolicy);
            return this;
        }
        public Builder cors(@Nullable Output<List<CorsPolicyArgs>> cors) {
            this.cors = cors;
            return this;
        }
        public Builder cors(@Nullable List<CorsPolicyArgs> cors) {
            this.cors = Codegen.ofNullable(cors);
            return this;
        }
        public Builder cors(CorsPolicyArgs... cors) {
            return cors(List.of(cors));
        }
        public Builder databaseAccountOfferType(Output<DatabaseAccountOfferType> databaseAccountOfferType) {
            this.databaseAccountOfferType = Objects.requireNonNull(databaseAccountOfferType);
            return this;
        }
        public Builder databaseAccountOfferType(DatabaseAccountOfferType databaseAccountOfferType) {
            this.databaseAccountOfferType = Output.of(Objects.requireNonNull(databaseAccountOfferType));
            return this;
        }
        public Builder defaultIdentity(@Nullable Output<String> defaultIdentity) {
            this.defaultIdentity = defaultIdentity;
            return this;
        }
        public Builder defaultIdentity(@Nullable String defaultIdentity) {
            this.defaultIdentity = Codegen.ofNullable(defaultIdentity);
            return this;
        }
        public Builder disableKeyBasedMetadataWriteAccess(@Nullable Output<Boolean> disableKeyBasedMetadataWriteAccess) {
            this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
            return this;
        }
        public Builder disableKeyBasedMetadataWriteAccess(@Nullable Boolean disableKeyBasedMetadataWriteAccess) {
            this.disableKeyBasedMetadataWriteAccess = Codegen.ofNullable(disableKeyBasedMetadataWriteAccess);
            return this;
        }
        public Builder enableAnalyticalStorage(@Nullable Output<Boolean> enableAnalyticalStorage) {
            this.enableAnalyticalStorage = enableAnalyticalStorage;
            return this;
        }
        public Builder enableAnalyticalStorage(@Nullable Boolean enableAnalyticalStorage) {
            this.enableAnalyticalStorage = Codegen.ofNullable(enableAnalyticalStorage);
            return this;
        }
        public Builder enableAutomaticFailover(@Nullable Output<Boolean> enableAutomaticFailover) {
            this.enableAutomaticFailover = enableAutomaticFailover;
            return this;
        }
        public Builder enableAutomaticFailover(@Nullable Boolean enableAutomaticFailover) {
            this.enableAutomaticFailover = Codegen.ofNullable(enableAutomaticFailover);
            return this;
        }
        public Builder enableCassandraConnector(@Nullable Output<Boolean> enableCassandraConnector) {
            this.enableCassandraConnector = enableCassandraConnector;
            return this;
        }
        public Builder enableCassandraConnector(@Nullable Boolean enableCassandraConnector) {
            this.enableCassandraConnector = Codegen.ofNullable(enableCassandraConnector);
            return this;
        }
        public Builder enableFreeTier(@Nullable Output<Boolean> enableFreeTier) {
            this.enableFreeTier = enableFreeTier;
            return this;
        }
        public Builder enableFreeTier(@Nullable Boolean enableFreeTier) {
            this.enableFreeTier = Codegen.ofNullable(enableFreeTier);
            return this;
        }
        public Builder enableMultipleWriteLocations(@Nullable Output<Boolean> enableMultipleWriteLocations) {
            this.enableMultipleWriteLocations = enableMultipleWriteLocations;
            return this;
        }
        public Builder enableMultipleWriteLocations(@Nullable Boolean enableMultipleWriteLocations) {
            this.enableMultipleWriteLocations = Codegen.ofNullable(enableMultipleWriteLocations);
            return this;
        }
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder ipRules(@Nullable Output<List<IpAddressOrRangeArgs>> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(@Nullable List<IpAddressOrRangeArgs> ipRules) {
            this.ipRules = Codegen.ofNullable(ipRules);
            return this;
        }
        public Builder ipRules(IpAddressOrRangeArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }
        public Builder isVirtualNetworkFilterEnabled(@Nullable Output<Boolean> isVirtualNetworkFilterEnabled) {
            this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
            return this;
        }
        public Builder isVirtualNetworkFilterEnabled(@Nullable Boolean isVirtualNetworkFilterEnabled) {
            this.isVirtualNetworkFilterEnabled = Codegen.ofNullable(isVirtualNetworkFilterEnabled);
            return this;
        }
        public Builder keyVaultKeyUri(@Nullable Output<String> keyVaultKeyUri) {
            this.keyVaultKeyUri = keyVaultKeyUri;
            return this;
        }
        public Builder keyVaultKeyUri(@Nullable String keyVaultKeyUri) {
            this.keyVaultKeyUri = Codegen.ofNullable(keyVaultKeyUri);
            return this;
        }
        public Builder kind(@Nullable Output<Either<String,DatabaseAccountKind>> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable Either<String,DatabaseAccountKind> kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder locations(Output<List<LocationArgs>> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(List<LocationArgs> locations) {
            this.locations = Output.of(Objects.requireNonNull(locations));
            return this;
        }
        public Builder locations(LocationArgs... locations) {
            return locations(List.of(locations));
        }
        public Builder networkAclBypass(@Nullable Output<NetworkAclBypass> networkAclBypass) {
            this.networkAclBypass = networkAclBypass;
            return this;
        }
        public Builder networkAclBypass(@Nullable NetworkAclBypass networkAclBypass) {
            this.networkAclBypass = Codegen.ofNullable(networkAclBypass);
            return this;
        }
        public Builder networkAclBypassResourceIds(@Nullable Output<List<String>> networkAclBypassResourceIds) {
            this.networkAclBypassResourceIds = networkAclBypassResourceIds;
            return this;
        }
        public Builder networkAclBypassResourceIds(@Nullable List<String> networkAclBypassResourceIds) {
            this.networkAclBypassResourceIds = Codegen.ofNullable(networkAclBypassResourceIds);
            return this;
        }
        public Builder networkAclBypassResourceIds(String... networkAclBypassResourceIds) {
            return networkAclBypassResourceIds(List.of(networkAclBypassResourceIds));
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Codegen.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder virtualNetworkRules(@Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Codegen.ofNullable(virtualNetworkRules);
            return this;
        }
        public Builder virtualNetworkRules(VirtualNetworkRuleArgs... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public DatabaseAccountArgs build() {
            return new DatabaseAccountArgs(accountName, apiProperties, backupPolicy, capabilities, connectorOffer, consistencyPolicy, cors, databaseAccountOfferType, defaultIdentity, disableKeyBasedMetadataWriteAccess, enableAnalyticalStorage, enableAutomaticFailover, enableCassandraConnector, enableFreeTier, enableMultipleWriteLocations, identity, ipRules, isVirtualNetworkFilterEnabled, keyVaultKeyUri, kind, location, locations, networkAclBypass, networkAclBypassResourceIds, publicNetworkAccess, resourceGroupName, tags, virtualNetworkRules);
        }
    }
}
