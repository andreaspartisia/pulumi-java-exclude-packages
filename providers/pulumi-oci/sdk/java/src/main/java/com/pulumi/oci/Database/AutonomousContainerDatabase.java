// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Database.AutonomousContainerDatabaseArgs;
import com.pulumi.oci.Database.inputs.AutonomousContainerDatabaseState;
import com.pulumi.oci.Database.outputs.AutonomousContainerDatabaseBackupConfig;
import com.pulumi.oci.Database.outputs.AutonomousContainerDatabaseKeyHistoryEntry;
import com.pulumi.oci.Database.outputs.AutonomousContainerDatabaseMaintenanceWindow;
import com.pulumi.oci.Database.outputs.AutonomousContainerDatabaseMaintenanceWindowDetails;
import com.pulumi.oci.Database.outputs.AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfig;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Autonomous Container Database resource in Oracle Cloud Infrastructure Database service.
 * 
 * Creates an Autonomous Container Database in the specified Autonomous Exadata Infrastructure.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AutonomousContainerDatabases can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Database/autonomousContainerDatabase:AutonomousContainerDatabase test_autonomous_container_database &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Database/autonomousContainerDatabase:AutonomousContainerDatabase")
public class AutonomousContainerDatabase extends com.pulumi.resources.CustomResource {
    /**
     * The OCID of the Autonomous Exadata Infrastructure. Please use cloud_autonomous_vm_cluster_id instead.
     * 
     */
    @Export(name="autonomousExadataInfrastructureId", type=String.class, parameters={})
    private Output<String> autonomousExadataInfrastructureId;

    /**
     * @return The OCID of the Autonomous Exadata Infrastructure. Please use cloud_autonomous_vm_cluster_id instead.
     * 
     */
    public Output<String> autonomousExadataInfrastructureId() {
        return this.autonomousExadataInfrastructureId;
    }
    /**
     * The OCID of the Autonomous VM Cluster.
     * 
     */
    @Export(name="autonomousVmClusterId", type=String.class, parameters={})
    private Output<String> autonomousVmClusterId;

    /**
     * @return The OCID of the Autonomous VM Cluster.
     * 
     */
    public Output<String> autonomousVmClusterId() {
        return this.autonomousVmClusterId;
    }
    /**
     * The availability domain of the Autonomous Container Database.
     * 
     */
    @Export(name="availabilityDomain", type=String.class, parameters={})
    private Output<String> availabilityDomain;

    /**
     * @return The availability domain of the Autonomous Container Database.
     * 
     */
    public Output<String> availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * (Updatable) Backup options for the Autonomous Container Database.
     * 
     */
    @Export(name="backupConfig", type=AutonomousContainerDatabaseBackupConfig.class, parameters={})
    private Output<AutonomousContainerDatabaseBackupConfig> backupConfig;

    /**
     * @return (Updatable) Backup options for the Autonomous Container Database.
     * 
     */
    public Output<AutonomousContainerDatabaseBackupConfig> backupConfig() {
        return this.backupConfig;
    }
    /**
     * The OCID of the Cloud Autonomous VM Cluster.
     * 
     */
    @Export(name="cloudAutonomousVmClusterId", type=String.class, parameters={})
    private Output<String> cloudAutonomousVmClusterId;

    /**
     * @return The OCID of the Cloud Autonomous VM Cluster.
     * 
     */
    public Output<String> cloudAutonomousVmClusterId() {
        return this.cloudAutonomousVmClusterId;
    }
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the Autonomous Container Database.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the Autonomous Container Database.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    @Export(name="dbUniqueName", type=String.class, parameters={})
    private Output<String> dbUniqueName;

    public Output<String> dbUniqueName() {
        return this.dbUniqueName;
    }
    /**
     * Oracle Database version of the Autonomous Container Database.
     * 
     */
    @Export(name="dbVersion", type=String.class, parameters={})
    private Output<String> dbVersion;

    /**
     * @return Oracle Database version of the Autonomous Container Database.
     * 
     */
    public Output<String> dbVersion() {
        return this.dbVersion;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) The display name for the Autonomous Container Database.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) The display name for the Autonomous Container Database.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * The infrastructure type this resource belongs to.
     * 
     */
    @Export(name="infrastructureType", type=String.class, parameters={})
    private Output<String> infrastructureType;

    /**
     * @return The infrastructure type this resource belongs to.
     * 
     */
    public Output<String> infrastructureType() {
        return this.infrastructureType;
    }
    /**
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     * 
     */
    @Export(name="isAutomaticFailoverEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isAutomaticFailoverEnabled;

    /**
     * @return Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     * 
     */
    public Output<Boolean> isAutomaticFailoverEnabled() {
        return this.isAutomaticFailoverEnabled;
    }
    /**
     * Key History Entry.
     * 
     */
    @Export(name="keyHistoryEntries", type=List.class, parameters={AutonomousContainerDatabaseKeyHistoryEntry.class})
    private Output<List<AutonomousContainerDatabaseKeyHistoryEntry>> keyHistoryEntries;

    /**
     * @return Key History Entry.
     * 
     */
    public Output<List<AutonomousContainerDatabaseKeyHistoryEntry>> keyHistoryEntries() {
        return this.keyHistoryEntries;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key store.
     * 
     */
    @Export(name="keyStoreId", type=String.class, parameters={})
    private Output<String> keyStoreId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key store.
     * 
     */
    public Output<String> keyStoreId() {
        return this.keyStoreId;
    }
    /**
     * The wallet name for Oracle Key Vault.
     * 
     */
    @Export(name="keyStoreWalletName", type=String.class, parameters={})
    private Output<String> keyStoreWalletName;

    /**
     * @return The wallet name for Oracle Key Vault.
     * 
     */
    public Output<String> keyStoreWalletName() {
        return this.keyStoreWalletName;
    }
    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * 
     */
    @Export(name="lastMaintenanceRunId", type=String.class, parameters={})
    private Output<String> lastMaintenanceRunId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * 
     */
    public Output<String> lastMaintenanceRunId() {
        return this.lastMaintenanceRunId;
    }
    /**
     * Additional information about the current lifecycle state.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * (Updatable) The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    @Export(name="maintenanceWindowDetails", type=AutonomousContainerDatabaseMaintenanceWindowDetails.class, parameters={})
    private Output</* @Nullable */ AutonomousContainerDatabaseMaintenanceWindowDetails> maintenanceWindowDetails;

    /**
     * @return (Updatable) The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    public Output<Optional<AutonomousContainerDatabaseMaintenanceWindowDetails>> maintenanceWindowDetails() {
        return Codegen.optional(this.maintenanceWindowDetails);
    }
    /**
     * The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    @Export(name="maintenanceWindows", type=List.class, parameters={AutonomousContainerDatabaseMaintenanceWindow.class})
    private Output<List<AutonomousContainerDatabaseMaintenanceWindow>> maintenanceWindows;

    /**
     * @return The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    public Output<List<AutonomousContainerDatabaseMaintenanceWindow>> maintenanceWindows() {
        return this.maintenanceWindows;
    }
    /**
     * The amount of memory (in GBs) enabled per each OCPU core in Autonomous VM Cluster.
     * 
     */
    @Export(name="memoryPerOracleComputeUnitInGbs", type=Integer.class, parameters={})
    private Output<Integer> memoryPerOracleComputeUnitInGbs;

    /**
     * @return The amount of memory (in GBs) enabled per each OCPU core in Autonomous VM Cluster.
     * 
     */
    public Output<Integer> memoryPerOracleComputeUnitInGbs() {
        return this.memoryPerOracleComputeUnitInGbs;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * 
     */
    @Export(name="nextMaintenanceRunId", type=String.class, parameters={})
    private Output<String> nextMaintenanceRunId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * 
     */
    public Output<String> nextMaintenanceRunId() {
        return this.nextMaintenanceRunId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last patch applied on the system.
     * 
     */
    @Export(name="patchId", type=String.class, parameters={})
    private Output<String> patchId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last patch applied on the system.
     * 
     */
    public Output<String> patchId() {
        return this.patchId;
    }
    /**
     * (Updatable) Database Patch model preference.
     * 
     */
    @Export(name="patchModel", type=String.class, parameters={})
    private Output<String> patchModel;

    /**
     * @return (Updatable) Database Patch model preference.
     * 
     */
    public Output<String> patchModel() {
        return this.patchModel;
    }
    @Export(name="peerAutonomousContainerDatabaseBackupConfig", type=AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfig.class, parameters={})
    private Output<AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfig> peerAutonomousContainerDatabaseBackupConfig;

    public Output<AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfig> peerAutonomousContainerDatabaseBackupConfig() {
        return this.peerAutonomousContainerDatabaseBackupConfig;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the standby Autonomous Container Database will be created.
     * 
     */
    @Export(name="peerAutonomousContainerDatabaseCompartmentId", type=String.class, parameters={})
    private Output<String> peerAutonomousContainerDatabaseCompartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the standby Autonomous Container Database will be created.
     * 
     */
    public Output<String> peerAutonomousContainerDatabaseCompartmentId() {
        return this.peerAutonomousContainerDatabaseCompartmentId;
    }
    /**
     * The display name for the peer Autonomous Container Database.
     * 
     */
    @Export(name="peerAutonomousContainerDatabaseDisplayName", type=String.class, parameters={})
    private Output<String> peerAutonomousContainerDatabaseDisplayName;

    /**
     * @return The display name for the peer Autonomous Container Database.
     * 
     */
    public Output<String> peerAutonomousContainerDatabaseDisplayName() {
        return this.peerAutonomousContainerDatabaseDisplayName;
    }
    /**
     * The OCID of the peer Autonomous Exadata Infrastructure for autonomous dataguard. Please use peer_cloud_autonomous_vm_cluster_id instead.
     * 
     */
    @Export(name="peerAutonomousExadataInfrastructureId", type=String.class, parameters={})
    private Output<String> peerAutonomousExadataInfrastructureId;

    /**
     * @return The OCID of the peer Autonomous Exadata Infrastructure for autonomous dataguard. Please use peer_cloud_autonomous_vm_cluster_id instead.
     * 
     */
    public Output<String> peerAutonomousExadataInfrastructureId() {
        return this.peerAutonomousExadataInfrastructureId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer Autonomous VM cluster for Autonomous Data Guard. Required to enable Data Guard.
     * 
     */
    @Export(name="peerAutonomousVmClusterId", type=String.class, parameters={})
    private Output<String> peerAutonomousVmClusterId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer Autonomous VM cluster for Autonomous Data Guard. Required to enable Data Guard.
     * 
     */
    public Output<String> peerAutonomousVmClusterId() {
        return this.peerAutonomousVmClusterId;
    }
    /**
     * The OCID of the peer Autonomous Cloud VM Cluster for autonomous dataguard.
     * 
     */
    @Export(name="peerCloudAutonomousVmClusterId", type=String.class, parameters={})
    private Output<String> peerCloudAutonomousVmClusterId;

    /**
     * @return The OCID of the peer Autonomous Cloud VM Cluster for autonomous dataguard.
     * 
     */
    public Output<String> peerCloudAutonomousVmClusterId() {
        return this.peerCloudAutonomousVmClusterId;
    }
    @Export(name="peerDbUniqueName", type=String.class, parameters={})
    private Output<String> peerDbUniqueName;

    public Output<String> peerDbUniqueName() {
        return this.peerDbUniqueName;
    }
    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000) in the Oracle Data Guard documentation.
     * 
     */
    @Export(name="protectionMode", type=String.class, parameters={})
    private Output<String> protectionMode;

    /**
     * @return The protection mode of this Autonomous Data Guard association. For more information, see [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000) in the Oracle Data Guard documentation.
     * 
     */
    public Output<String> protectionMode() {
        return this.protectionMode;
    }
    /**
     * The role of the dataguard enabled Autonomous Container Database.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role of the dataguard enabled Autonomous Container Database.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * (Updatable) An optional property when flipped triggers rotation of KMS key. It is only applicable on dedicated container databases i.e. where `cloud_autonomous_vm_cluster_id` is set.
     * 
     */
    @Export(name="rotateKeyTrigger", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> rotateKeyTrigger;

    /**
     * @return (Updatable) An optional property when flipped triggers rotation of KMS key. It is only applicable on dedicated container databases i.e. where `cloud_autonomous_vm_cluster_id` is set.
     * 
     */
    public Output<Optional<Boolean>> rotateKeyTrigger() {
        return Codegen.optional(this.rotateKeyTrigger);
    }
    /**
     * The service level agreement type of the Autonomous Container Database. The default is STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     * 
     */
    @Export(name="serviceLevelAgreementType", type=String.class, parameters={})
    private Output<String> serviceLevelAgreementType;

    /**
     * @return The service level agreement type of the Autonomous Container Database. The default is STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     * 
     */
    public Output<String> serviceLevelAgreementType() {
        return this.serviceLevelAgreementType;
    }
    /**
     * (Updatable) The scheduling detail for the quarterly maintenance window of standby Autonomous Container Database. This value represents the number of days before the primary database maintenance schedule.
     * 
     */
    @Export(name="standbyMaintenanceBufferInDays", type=Integer.class, parameters={})
    private Output<Integer> standbyMaintenanceBufferInDays;

    /**
     * @return (Updatable) The scheduling detail for the quarterly maintenance window of standby Autonomous Container Database. This value represents the number of days before the primary database maintenance schedule.
     * 
     */
    public Output<Integer> standbyMaintenanceBufferInDays() {
        return this.standbyMaintenanceBufferInDays;
    }
    /**
     * The current state of the Autonomous Container Database.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the Autonomous Container Database.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The date and time the Autonomous Container Database was created.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the Autonomous Container Database was created.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * 
     */
    @Export(name="vaultId", type=String.class, parameters={})
    private Output<String> vaultId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * 
     */
    public Output<String> vaultId() {
        return this.vaultId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutonomousContainerDatabase(String name) {
        this(name, AutonomousContainerDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutonomousContainerDatabase(String name, AutonomousContainerDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutonomousContainerDatabase(String name, AutonomousContainerDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/autonomousContainerDatabase:AutonomousContainerDatabase", name, args == null ? AutonomousContainerDatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutonomousContainerDatabase(String name, Output<String> id, @Nullable AutonomousContainerDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/autonomousContainerDatabase:AutonomousContainerDatabase", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AutonomousContainerDatabase get(String name, Output<String> id, @Nullable AutonomousContainerDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutonomousContainerDatabase(name, id, state, options);
    }
}
