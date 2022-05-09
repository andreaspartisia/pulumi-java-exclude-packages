// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection;

import com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupVaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupVaultArgs Empty = new BackupVaultArgs();

    /**
     * Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`.
     * 
     */
    @Import(name="datastoreType", required=true)
    private Output<String> datastoreType;

    /**
     * @return Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`.
     * 
     */
    public Output<String> datastoreType() {
        return this.datastoreType;
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<BackupVaultIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<BackupVaultIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
     * 
     */
    @Import(name="redundancy", required=true)
    private Output<String> redundancy;

    /**
     * @return Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
     * 
     */
    public Output<String> redundancy() {
        return this.redundancy;
    }

    /**
     * The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags which should be assigned to the Backup Vault.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Backup Vault.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BackupVaultArgs() {}

    private BackupVaultArgs(BackupVaultArgs $) {
        this.datastoreType = $.datastoreType;
        this.identity = $.identity;
        this.location = $.location;
        this.name = $.name;
        this.redundancy = $.redundancy;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupVaultArgs $;

        public Builder() {
            $ = new BackupVaultArgs();
        }

        public Builder(BackupVaultArgs defaults) {
            $ = new BackupVaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datastoreType Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`.
         * 
         * @return builder
         * 
         */
        public Builder datastoreType(Output<String> datastoreType) {
            $.datastoreType = datastoreType;
            return this;
        }

        /**
         * @param datastoreType Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`.
         * 
         * @return builder
         * 
         */
        public Builder datastoreType(String datastoreType) {
            return datastoreType(Output.of(datastoreType));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<BackupVaultIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(BackupVaultIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redundancy Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
         * 
         * @return builder
         * 
         */
        public Builder redundancy(Output<String> redundancy) {
            $.redundancy = redundancy;
            return this;
        }

        /**
         * @param redundancy Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
         * 
         * @return builder
         * 
         */
        public Builder redundancy(String redundancy) {
            return redundancy(Output.of(redundancy));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Backup Vault.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Backup Vault.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public BackupVaultArgs build() {
            $.datastoreType = Objects.requireNonNull($.datastoreType, "expected parameter 'datastoreType' to be non-null");
            $.redundancy = Objects.requireNonNull($.redundancy, "expected parameter 'redundancy' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
