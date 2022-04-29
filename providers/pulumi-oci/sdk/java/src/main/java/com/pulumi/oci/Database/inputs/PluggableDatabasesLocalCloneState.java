// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.PluggableDatabasesLocalCloneConnectionStringArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PluggableDatabasesLocalCloneState extends com.pulumi.resources.ResourceArgs {

    public static final PluggableDatabasesLocalCloneState Empty = new PluggableDatabasesLocalCloneState();

    /**
     * The name for the pluggable database (PDB). The name is unique in the context of a [container database](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/Database/). The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
     * 
     */
    @Import(name="clonedPdbName")
    private @Nullable Output<String> clonedPdbName;

    /**
     * @return The name for the pluggable database (PDB). The name is unique in the context of a [container database](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/Database/). The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
     * 
     */
    public Optional<Output<String>> clonedPdbName() {
        return Optional.ofNullable(this.clonedPdbName);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * Connection strings to connect to an Oracle Pluggable Database.
     * 
     */
    @Import(name="connectionStrings")
    private @Nullable Output<List<PluggableDatabasesLocalCloneConnectionStringArgs>> connectionStrings;

    /**
     * @return Connection strings to connect to an Oracle Pluggable Database.
     * 
     */
    public Optional<Output<List<PluggableDatabasesLocalCloneConnectionStringArgs>>> connectionStrings() {
        return Optional.ofNullable(this.connectionStrings);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the CDB.
     * 
     */
    @Import(name="containerDatabaseId")
    private @Nullable Output<String> containerDatabaseId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the CDB.
     * 
     */
    public Optional<Output<String>> containerDatabaseId() {
        return Optional.ofNullable(this.containerDatabaseId);
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * The restricted mode of the pluggable database. If a pluggable database is opened in restricted mode, the user needs both create a session and have restricted session privileges to connect to it.
     * 
     */
    @Import(name="isRestricted")
    private @Nullable Output<Boolean> isRestricted;

    /**
     * @return The restricted mode of the pluggable database. If a pluggable database is opened in restricted mode, the user needs both create a session and have restricted session privileges to connect to it.
     * 
     */
    public Optional<Output<Boolean>> isRestricted() {
        return Optional.ofNullable(this.isRestricted);
    }

    /**
     * Detailed message for the lifecycle state.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return Detailed message for the lifecycle state.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
     * 
     */
    @Import(name="openMode")
    private @Nullable Output<String> openMode;

    /**
     * @return The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
     * 
     */
    public Optional<Output<String>> openMode() {
        return Optional.ofNullable(this.openMode);
    }

    /**
     * A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numbers, and two special characters. The special characters must be _, \#, or -.
     * 
     */
    @Import(name="pdbAdminPassword")
    private @Nullable Output<String> pdbAdminPassword;

    /**
     * @return A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numbers, and two special characters. The special characters must be _, \#, or -.
     * 
     */
    public Optional<Output<String>> pdbAdminPassword() {
        return Optional.ofNullable(this.pdbAdminPassword);
    }

    /**
     * The name for the pluggable database (PDB). The name is unique in the context of a [container database](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/Database/). The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
     * 
     */
    @Import(name="pdbName")
    private @Nullable Output<String> pdbName;

    /**
     * @return The name for the pluggable database (PDB). The name is unique in the context of a [container database](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/Database/). The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
     * 
     */
    public Optional<Output<String>> pdbName() {
        return Optional.ofNullable(this.pdbName);
    }

    /**
     * The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="pluggableDatabaseId")
    private @Nullable Output<String> pluggableDatabaseId;

    /**
     * @return The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<Output<String>> pluggableDatabaseId() {
        return Optional.ofNullable(this.pluggableDatabaseId);
    }

    /**
     * The locked mode of the pluggable database admin account. If false, the user needs to provide the PDB Admin Password to connect to it. If true, the pluggable database will be locked and user cannot login to it.
     * 
     */
    @Import(name="shouldPdbAdminAccountBeLocked")
    private @Nullable Output<Boolean> shouldPdbAdminAccountBeLocked;

    /**
     * @return The locked mode of the pluggable database admin account. If false, the user needs to provide the PDB Admin Password to connect to it. If true, the pluggable database will be locked and user cannot login to it.
     * 
     */
    public Optional<Output<Boolean>> shouldPdbAdminAccountBeLocked() {
        return Optional.ofNullable(this.shouldPdbAdminAccountBeLocked);
    }

    /**
     * The current state of the pluggable database.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the pluggable database.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The existing TDE wallet password of the target CDB.
     * 
     */
    @Import(name="targetTdeWalletPassword")
    private @Nullable Output<String> targetTdeWalletPassword;

    /**
     * @return The existing TDE wallet password of the target CDB.
     * 
     */
    public Optional<Output<String>> targetTdeWalletPassword() {
        return Optional.ofNullable(this.targetTdeWalletPassword);
    }

    /**
     * The date and time the pluggable database was created.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the pluggable database was created.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    private PluggableDatabasesLocalCloneState() {}

    private PluggableDatabasesLocalCloneState(PluggableDatabasesLocalCloneState $) {
        this.clonedPdbName = $.clonedPdbName;
        this.compartmentId = $.compartmentId;
        this.connectionStrings = $.connectionStrings;
        this.containerDatabaseId = $.containerDatabaseId;
        this.definedTags = $.definedTags;
        this.freeformTags = $.freeformTags;
        this.isRestricted = $.isRestricted;
        this.lifecycleDetails = $.lifecycleDetails;
        this.openMode = $.openMode;
        this.pdbAdminPassword = $.pdbAdminPassword;
        this.pdbName = $.pdbName;
        this.pluggableDatabaseId = $.pluggableDatabaseId;
        this.shouldPdbAdminAccountBeLocked = $.shouldPdbAdminAccountBeLocked;
        this.state = $.state;
        this.targetTdeWalletPassword = $.targetTdeWalletPassword;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PluggableDatabasesLocalCloneState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PluggableDatabasesLocalCloneState $;

        public Builder() {
            $ = new PluggableDatabasesLocalCloneState();
        }

        public Builder(PluggableDatabasesLocalCloneState defaults) {
            $ = new PluggableDatabasesLocalCloneState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clonedPdbName The name for the pluggable database (PDB). The name is unique in the context of a [container database](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/Database/). The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
         * 
         * @return builder
         * 
         */
        public Builder clonedPdbName(@Nullable Output<String> clonedPdbName) {
            $.clonedPdbName = clonedPdbName;
            return this;
        }

        /**
         * @param clonedPdbName The name for the pluggable database (PDB). The name is unique in the context of a [container database](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/Database/). The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
         * 
         * @return builder
         * 
         */
        public Builder clonedPdbName(String clonedPdbName) {
            return clonedPdbName(Output.of(clonedPdbName));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param connectionStrings Connection strings to connect to an Oracle Pluggable Database.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(@Nullable Output<List<PluggableDatabasesLocalCloneConnectionStringArgs>> connectionStrings) {
            $.connectionStrings = connectionStrings;
            return this;
        }

        /**
         * @param connectionStrings Connection strings to connect to an Oracle Pluggable Database.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(List<PluggableDatabasesLocalCloneConnectionStringArgs> connectionStrings) {
            return connectionStrings(Output.of(connectionStrings));
        }

        /**
         * @param connectionStrings Connection strings to connect to an Oracle Pluggable Database.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(PluggableDatabasesLocalCloneConnectionStringArgs... connectionStrings) {
            return connectionStrings(List.of(connectionStrings));
        }

        /**
         * @param containerDatabaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the CDB.
         * 
         * @return builder
         * 
         */
        public Builder containerDatabaseId(@Nullable Output<String> containerDatabaseId) {
            $.containerDatabaseId = containerDatabaseId;
            return this;
        }

        /**
         * @param containerDatabaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the CDB.
         * 
         * @return builder
         * 
         */
        public Builder containerDatabaseId(String containerDatabaseId) {
            return containerDatabaseId(Output.of(containerDatabaseId));
        }

        /**
         * @param definedTags Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param freeformTags Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param isRestricted The restricted mode of the pluggable database. If a pluggable database is opened in restricted mode, the user needs both create a session and have restricted session privileges to connect to it.
         * 
         * @return builder
         * 
         */
        public Builder isRestricted(@Nullable Output<Boolean> isRestricted) {
            $.isRestricted = isRestricted;
            return this;
        }

        /**
         * @param isRestricted The restricted mode of the pluggable database. If a pluggable database is opened in restricted mode, the user needs both create a session and have restricted session privileges to connect to it.
         * 
         * @return builder
         * 
         */
        public Builder isRestricted(Boolean isRestricted) {
            return isRestricted(Output.of(isRestricted));
        }

        /**
         * @param lifecycleDetails Detailed message for the lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails Detailed message for the lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param openMode The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
         * 
         * @return builder
         * 
         */
        public Builder openMode(@Nullable Output<String> openMode) {
            $.openMode = openMode;
            return this;
        }

        /**
         * @param openMode The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
         * 
         * @return builder
         * 
         */
        public Builder openMode(String openMode) {
            return openMode(Output.of(openMode));
        }

        /**
         * @param pdbAdminPassword A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numbers, and two special characters. The special characters must be _, \#, or -.
         * 
         * @return builder
         * 
         */
        public Builder pdbAdminPassword(@Nullable Output<String> pdbAdminPassword) {
            $.pdbAdminPassword = pdbAdminPassword;
            return this;
        }

        /**
         * @param pdbAdminPassword A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numbers, and two special characters. The special characters must be _, \#, or -.
         * 
         * @return builder
         * 
         */
        public Builder pdbAdminPassword(String pdbAdminPassword) {
            return pdbAdminPassword(Output.of(pdbAdminPassword));
        }

        /**
         * @param pdbName The name for the pluggable database (PDB). The name is unique in the context of a [container database](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/Database/). The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
         * 
         * @return builder
         * 
         */
        public Builder pdbName(@Nullable Output<String> pdbName) {
            $.pdbName = pdbName;
            return this;
        }

        /**
         * @param pdbName The name for the pluggable database (PDB). The name is unique in the context of a [container database](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/Database/). The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
         * 
         * @return builder
         * 
         */
        public Builder pdbName(String pdbName) {
            return pdbName(Output.of(pdbName));
        }

        /**
         * @param pluggableDatabaseId The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder pluggableDatabaseId(@Nullable Output<String> pluggableDatabaseId) {
            $.pluggableDatabaseId = pluggableDatabaseId;
            return this;
        }

        /**
         * @param pluggableDatabaseId The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder pluggableDatabaseId(String pluggableDatabaseId) {
            return pluggableDatabaseId(Output.of(pluggableDatabaseId));
        }

        /**
         * @param shouldPdbAdminAccountBeLocked The locked mode of the pluggable database admin account. If false, the user needs to provide the PDB Admin Password to connect to it. If true, the pluggable database will be locked and user cannot login to it.
         * 
         * @return builder
         * 
         */
        public Builder shouldPdbAdminAccountBeLocked(@Nullable Output<Boolean> shouldPdbAdminAccountBeLocked) {
            $.shouldPdbAdminAccountBeLocked = shouldPdbAdminAccountBeLocked;
            return this;
        }

        /**
         * @param shouldPdbAdminAccountBeLocked The locked mode of the pluggable database admin account. If false, the user needs to provide the PDB Admin Password to connect to it. If true, the pluggable database will be locked and user cannot login to it.
         * 
         * @return builder
         * 
         */
        public Builder shouldPdbAdminAccountBeLocked(Boolean shouldPdbAdminAccountBeLocked) {
            return shouldPdbAdminAccountBeLocked(Output.of(shouldPdbAdminAccountBeLocked));
        }

        /**
         * @param state The current state of the pluggable database.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the pluggable database.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param targetTdeWalletPassword The existing TDE wallet password of the target CDB.
         * 
         * @return builder
         * 
         */
        public Builder targetTdeWalletPassword(@Nullable Output<String> targetTdeWalletPassword) {
            $.targetTdeWalletPassword = targetTdeWalletPassword;
            return this;
        }

        /**
         * @param targetTdeWalletPassword The existing TDE wallet password of the target CDB.
         * 
         * @return builder
         * 
         */
        public Builder targetTdeWalletPassword(String targetTdeWalletPassword) {
            return targetTdeWalletPassword(Output.of(targetTdeWalletPassword));
        }

        /**
         * @param timeCreated The date and time the pluggable database was created.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the pluggable database was created.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        public PluggableDatabasesLocalCloneState build() {
            return $;
        }
    }

}
