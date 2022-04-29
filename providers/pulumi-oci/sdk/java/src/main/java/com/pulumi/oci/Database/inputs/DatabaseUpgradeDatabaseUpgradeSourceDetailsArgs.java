// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs Empty = new DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs();

    /**
     * The database software image [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image to be used to upgrade a database.
     * 
     */
    @Import(name="databaseSoftwareImageId")
    private @Nullable Output<String> databaseSoftwareImageId;

    /**
     * @return The database software image [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image to be used to upgrade a database.
     * 
     */
    public Optional<Output<String>> databaseSoftwareImageId() {
        return Optional.ofNullable(this.databaseSoftwareImageId);
    }

    /**
     * A valid Oracle Database version. To get a list of supported versions, use the [ListDbVersions](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/DbVersionSummary/ListDbVersions) operation.
     * 
     */
    @Import(name="dbVersion")
    private @Nullable Output<String> dbVersion;

    /**
     * @return A valid Oracle Database version. To get a list of supported versions, use the [ListDbVersions](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/DbVersionSummary/ListDbVersions) operation.
     * 
     */
    public Optional<Output<String>> dbVersion() {
        return Optional.ofNullable(this.dbVersion);
    }

    /**
     * Additional upgrade options supported by DBUA(Database Upgrade Assistant). Example: &#34;-upgradeTimezone false -keepEvents&#34;
     * 
     */
    @Import(name="options")
    private @Nullable Output<String> options;

    /**
     * @return Additional upgrade options supported by DBUA(Database Upgrade Assistant). Example: &#34;-upgradeTimezone false -keepEvents&#34;
     * 
     */
    public Optional<Output<String>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * The source of the Oracle Database software to be used for the upgrade.
     * * Use `DB_VERSION` to specify a generally-available Oracle Database software version to upgrade the database.
     * * Use `DB_SOFTWARE_IMAGE` to specify a [database software image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm) to upgrade the database.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The source of the Oracle Database software to be used for the upgrade.
     * * Use `DB_VERSION` to specify a generally-available Oracle Database software version to upgrade the database.
     * * Use `DB_SOFTWARE_IMAGE` to specify a [database software image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm) to upgrade the database.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs() {}

    private DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs(DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs $) {
        this.databaseSoftwareImageId = $.databaseSoftwareImageId;
        this.dbVersion = $.dbVersion;
        this.options = $.options;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs $;

        public Builder() {
            $ = new DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs();
        }

        public Builder(DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs defaults) {
            $ = new DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseSoftwareImageId The database software image [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image to be used to upgrade a database.
         * 
         * @return builder
         * 
         */
        public Builder databaseSoftwareImageId(@Nullable Output<String> databaseSoftwareImageId) {
            $.databaseSoftwareImageId = databaseSoftwareImageId;
            return this;
        }

        /**
         * @param databaseSoftwareImageId The database software image [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image to be used to upgrade a database.
         * 
         * @return builder
         * 
         */
        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            return databaseSoftwareImageId(Output.of(databaseSoftwareImageId));
        }

        /**
         * @param dbVersion A valid Oracle Database version. To get a list of supported versions, use the [ListDbVersions](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/DbVersionSummary/ListDbVersions) operation.
         * 
         * @return builder
         * 
         */
        public Builder dbVersion(@Nullable Output<String> dbVersion) {
            $.dbVersion = dbVersion;
            return this;
        }

        /**
         * @param dbVersion A valid Oracle Database version. To get a list of supported versions, use the [ListDbVersions](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/DbVersionSummary/ListDbVersions) operation.
         * 
         * @return builder
         * 
         */
        public Builder dbVersion(String dbVersion) {
            return dbVersion(Output.of(dbVersion));
        }

        /**
         * @param options Additional upgrade options supported by DBUA(Database Upgrade Assistant). Example: &#34;-upgradeTimezone false -keepEvents&#34;
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<String> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Additional upgrade options supported by DBUA(Database Upgrade Assistant). Example: &#34;-upgradeTimezone false -keepEvents&#34;
         * 
         * @return builder
         * 
         */
        public Builder options(String options) {
            return options(Output.of(options));
        }

        /**
         * @param source The source of the Oracle Database software to be used for the upgrade.
         * * Use `DB_VERSION` to specify a generally-available Oracle Database software version to upgrade the database.
         * * Use `DB_SOFTWARE_IMAGE` to specify a [database software image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm) to upgrade the database.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The source of the Oracle Database software to be used for the upgrade.
         * * Use `DB_VERSION` to specify a generally-available Oracle Database software version to upgrade the database.
         * * Use `DB_SOFTWARE_IMAGE` to specify a [database software image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm) to upgrade the database.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public DatabaseUpgradeDatabaseUpgradeSourceDetailsArgs build() {
            return $;
        }
    }

}
