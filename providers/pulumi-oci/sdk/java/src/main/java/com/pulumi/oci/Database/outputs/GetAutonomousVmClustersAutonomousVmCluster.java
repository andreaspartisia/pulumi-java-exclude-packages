// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindow;
import com.pulumi.oci.Database.outputs.GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindowDetail;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAutonomousVmClustersAutonomousVmCluster {
    /**
     * @return The data disk group size allocated for Autonomous Databases, in TBs.
     * 
     */
    private final Double autonomousDataStorageSizeInTbs;
    /**
     * @return The numnber of CPU cores available.
     * 
     */
    private final Integer availableCpus;
    /**
     * @return The data storage available in TBs
     * 
     */
    private final Double availableDataStorageSizeInTbs;
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String compartmentId;
    /**
     * @return The number of OCPU cores enabled per VM cluster node.
     * 
     */
    private final Integer cpuCoreCountPerNode;
    /**
     * @return The number of enabled CPU cores.
     * 
     */
    private final Integer cpusEnabled;
    /**
     * @return The total data storage allocated in GBs.
     * 
     */
    private final Double dataStorageSizeInGb;
    /**
     * @return The total data storage allocated in TBs
     * 
     */
    private final Double dataStorageSizeInTbs;
    /**
     * @return The local node storage allocated in GBs.
     * 
     */
    private final Integer dbNodeStorageSizeInGbs;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    private final String displayName;
    /**
     * @return If provided, filters the results for the given Exadata Infrastructure.
     * 
     */
    private final String exadataInfrastructureId;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Autonomous VM cluster.
     * 
     */
    private final String id;
    /**
     * @return If true, database backup on local Exadata storage is configured for the Autonomous VM cluster. If false, database backup on local Exadata storage is not available in the Autonomous VM cluster.
     * 
     */
    private final Boolean isLocalBackupEnabled;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * 
     */
    private final String lastMaintenanceRunId;
    /**
     * @return The Oracle license model that applies to the Autonomous VM cluster. The default is LICENSE_INCLUDED.
     * 
     */
    private final String licenseModel;
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    private final String lifecycleDetails;
    private final List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindowDetail> maintenanceWindowDetails;
    /**
     * @return The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    private final List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindow> maintenanceWindows;
    /**
     * @return The amount of memory (in GBs) enabled per each OCPU core.
     * 
     */
    private final Integer memoryPerOracleComputeUnitInGbs;
    /**
     * @return The memory allocated in GBs.
     * 
     */
    private final Integer memorySizeInGbs;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * 
     */
    private final String nextMaintenanceRunId;
    /**
     * @return The number of enabled OCPU cores.
     * 
     */
    private final Double ocpusEnabled;
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    private final String state;
    /**
     * @return The date and time that the Autonomous VM cluster was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/iaas/Content/Database/References/timezones.htm).
     * 
     */
    private final String timeZone;
    /**
     * @return The total number of Autonomous Container Databases that can be created.
     * 
     */
    private final Integer totalContainerDatabases;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster network.
     * 
     */
    private final String vmClusterNetworkId;

    @CustomType.Constructor
    private GetAutonomousVmClustersAutonomousVmCluster(
        @CustomType.Parameter("autonomousDataStorageSizeInTbs") Double autonomousDataStorageSizeInTbs,
        @CustomType.Parameter("availableCpus") Integer availableCpus,
        @CustomType.Parameter("availableDataStorageSizeInTbs") Double availableDataStorageSizeInTbs,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("cpuCoreCountPerNode") Integer cpuCoreCountPerNode,
        @CustomType.Parameter("cpusEnabled") Integer cpusEnabled,
        @CustomType.Parameter("dataStorageSizeInGb") Double dataStorageSizeInGb,
        @CustomType.Parameter("dataStorageSizeInTbs") Double dataStorageSizeInTbs,
        @CustomType.Parameter("dbNodeStorageSizeInGbs") Integer dbNodeStorageSizeInGbs,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("exadataInfrastructureId") String exadataInfrastructureId,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isLocalBackupEnabled") Boolean isLocalBackupEnabled,
        @CustomType.Parameter("lastMaintenanceRunId") String lastMaintenanceRunId,
        @CustomType.Parameter("licenseModel") String licenseModel,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("maintenanceWindowDetails") List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindowDetail> maintenanceWindowDetails,
        @CustomType.Parameter("maintenanceWindows") List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindow> maintenanceWindows,
        @CustomType.Parameter("memoryPerOracleComputeUnitInGbs") Integer memoryPerOracleComputeUnitInGbs,
        @CustomType.Parameter("memorySizeInGbs") Integer memorySizeInGbs,
        @CustomType.Parameter("nextMaintenanceRunId") String nextMaintenanceRunId,
        @CustomType.Parameter("ocpusEnabled") Double ocpusEnabled,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeZone") String timeZone,
        @CustomType.Parameter("totalContainerDatabases") Integer totalContainerDatabases,
        @CustomType.Parameter("vmClusterNetworkId") String vmClusterNetworkId) {
        this.autonomousDataStorageSizeInTbs = autonomousDataStorageSizeInTbs;
        this.availableCpus = availableCpus;
        this.availableDataStorageSizeInTbs = availableDataStorageSizeInTbs;
        this.compartmentId = compartmentId;
        this.cpuCoreCountPerNode = cpuCoreCountPerNode;
        this.cpusEnabled = cpusEnabled;
        this.dataStorageSizeInGb = dataStorageSizeInGb;
        this.dataStorageSizeInTbs = dataStorageSizeInTbs;
        this.dbNodeStorageSizeInGbs = dbNodeStorageSizeInGbs;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isLocalBackupEnabled = isLocalBackupEnabled;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.licenseModel = licenseModel;
        this.lifecycleDetails = lifecycleDetails;
        this.maintenanceWindowDetails = maintenanceWindowDetails;
        this.maintenanceWindows = maintenanceWindows;
        this.memoryPerOracleComputeUnitInGbs = memoryPerOracleComputeUnitInGbs;
        this.memorySizeInGbs = memorySizeInGbs;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.ocpusEnabled = ocpusEnabled;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeZone = timeZone;
        this.totalContainerDatabases = totalContainerDatabases;
        this.vmClusterNetworkId = vmClusterNetworkId;
    }

    /**
     * @return The data disk group size allocated for Autonomous Databases, in TBs.
     * 
     */
    public Double autonomousDataStorageSizeInTbs() {
        return this.autonomousDataStorageSizeInTbs;
    }
    /**
     * @return The numnber of CPU cores available.
     * 
     */
    public Integer availableCpus() {
        return this.availableCpus;
    }
    /**
     * @return The data storage available in TBs
     * 
     */
    public Double availableDataStorageSizeInTbs() {
        return this.availableDataStorageSizeInTbs;
    }
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The number of OCPU cores enabled per VM cluster node.
     * 
     */
    public Integer cpuCoreCountPerNode() {
        return this.cpuCoreCountPerNode;
    }
    /**
     * @return The number of enabled CPU cores.
     * 
     */
    public Integer cpusEnabled() {
        return this.cpusEnabled;
    }
    /**
     * @return The total data storage allocated in GBs.
     * 
     */
    public Double dataStorageSizeInGb() {
        return this.dataStorageSizeInGb;
    }
    /**
     * @return The total data storage allocated in TBs
     * 
     */
    public Double dataStorageSizeInTbs() {
        return this.dataStorageSizeInTbs;
    }
    /**
     * @return The local node storage allocated in GBs.
     * 
     */
    public Integer dbNodeStorageSizeInGbs() {
        return this.dbNodeStorageSizeInGbs;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return If provided, filters the results for the given Exadata Infrastructure.
     * 
     */
    public String exadataInfrastructureId() {
        return this.exadataInfrastructureId;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Autonomous VM cluster.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If true, database backup on local Exadata storage is configured for the Autonomous VM cluster. If false, database backup on local Exadata storage is not available in the Autonomous VM cluster.
     * 
     */
    public Boolean isLocalBackupEnabled() {
        return this.isLocalBackupEnabled;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * 
     */
    public String lastMaintenanceRunId() {
        return this.lastMaintenanceRunId;
    }
    /**
     * @return The Oracle license model that applies to the Autonomous VM cluster. The default is LICENSE_INCLUDED.
     * 
     */
    public String licenseModel() {
        return this.licenseModel;
    }
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    public List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindowDetail> maintenanceWindowDetails() {
        return this.maintenanceWindowDetails;
    }
    /**
     * @return The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    public List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindow> maintenanceWindows() {
        return this.maintenanceWindows;
    }
    /**
     * @return The amount of memory (in GBs) enabled per each OCPU core.
     * 
     */
    public Integer memoryPerOracleComputeUnitInGbs() {
        return this.memoryPerOracleComputeUnitInGbs;
    }
    /**
     * @return The memory allocated in GBs.
     * 
     */
    public Integer memorySizeInGbs() {
        return this.memorySizeInGbs;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * 
     */
    public String nextMaintenanceRunId() {
        return this.nextMaintenanceRunId;
    }
    /**
     * @return The number of enabled OCPU cores.
     * 
     */
    public Double ocpusEnabled() {
        return this.ocpusEnabled;
    }
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time that the Autonomous VM cluster was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/iaas/Content/Database/References/timezones.htm).
     * 
     */
    public String timeZone() {
        return this.timeZone;
    }
    /**
     * @return The total number of Autonomous Container Databases that can be created.
     * 
     */
    public Integer totalContainerDatabases() {
        return this.totalContainerDatabases;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster network.
     * 
     */
    public String vmClusterNetworkId() {
        return this.vmClusterNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousVmClustersAutonomousVmCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double autonomousDataStorageSizeInTbs;
        private Integer availableCpus;
        private Double availableDataStorageSizeInTbs;
        private String compartmentId;
        private Integer cpuCoreCountPerNode;
        private Integer cpusEnabled;
        private Double dataStorageSizeInGb;
        private Double dataStorageSizeInTbs;
        private Integer dbNodeStorageSizeInGbs;
        private Map<String,Object> definedTags;
        private String displayName;
        private String exadataInfrastructureId;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isLocalBackupEnabled;
        private String lastMaintenanceRunId;
        private String licenseModel;
        private String lifecycleDetails;
        private List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindowDetail> maintenanceWindowDetails;
        private List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindow> maintenanceWindows;
        private Integer memoryPerOracleComputeUnitInGbs;
        private Integer memorySizeInGbs;
        private String nextMaintenanceRunId;
        private Double ocpusEnabled;
        private String state;
        private String timeCreated;
        private String timeZone;
        private Integer totalContainerDatabases;
        private String vmClusterNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutonomousVmClustersAutonomousVmCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autonomousDataStorageSizeInTbs = defaults.autonomousDataStorageSizeInTbs;
    	      this.availableCpus = defaults.availableCpus;
    	      this.availableDataStorageSizeInTbs = defaults.availableDataStorageSizeInTbs;
    	      this.compartmentId = defaults.compartmentId;
    	      this.cpuCoreCountPerNode = defaults.cpuCoreCountPerNode;
    	      this.cpusEnabled = defaults.cpusEnabled;
    	      this.dataStorageSizeInGb = defaults.dataStorageSizeInGb;
    	      this.dataStorageSizeInTbs = defaults.dataStorageSizeInTbs;
    	      this.dbNodeStorageSizeInGbs = defaults.dbNodeStorageSizeInGbs;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.exadataInfrastructureId = defaults.exadataInfrastructureId;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isLocalBackupEnabled = defaults.isLocalBackupEnabled;
    	      this.lastMaintenanceRunId = defaults.lastMaintenanceRunId;
    	      this.licenseModel = defaults.licenseModel;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.maintenanceWindowDetails = defaults.maintenanceWindowDetails;
    	      this.maintenanceWindows = defaults.maintenanceWindows;
    	      this.memoryPerOracleComputeUnitInGbs = defaults.memoryPerOracleComputeUnitInGbs;
    	      this.memorySizeInGbs = defaults.memorySizeInGbs;
    	      this.nextMaintenanceRunId = defaults.nextMaintenanceRunId;
    	      this.ocpusEnabled = defaults.ocpusEnabled;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeZone = defaults.timeZone;
    	      this.totalContainerDatabases = defaults.totalContainerDatabases;
    	      this.vmClusterNetworkId = defaults.vmClusterNetworkId;
        }

        public Builder autonomousDataStorageSizeInTbs(Double autonomousDataStorageSizeInTbs) {
            this.autonomousDataStorageSizeInTbs = Objects.requireNonNull(autonomousDataStorageSizeInTbs);
            return this;
        }
        public Builder availableCpus(Integer availableCpus) {
            this.availableCpus = Objects.requireNonNull(availableCpus);
            return this;
        }
        public Builder availableDataStorageSizeInTbs(Double availableDataStorageSizeInTbs) {
            this.availableDataStorageSizeInTbs = Objects.requireNonNull(availableDataStorageSizeInTbs);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder cpuCoreCountPerNode(Integer cpuCoreCountPerNode) {
            this.cpuCoreCountPerNode = Objects.requireNonNull(cpuCoreCountPerNode);
            return this;
        }
        public Builder cpusEnabled(Integer cpusEnabled) {
            this.cpusEnabled = Objects.requireNonNull(cpusEnabled);
            return this;
        }
        public Builder dataStorageSizeInGb(Double dataStorageSizeInGb) {
            this.dataStorageSizeInGb = Objects.requireNonNull(dataStorageSizeInGb);
            return this;
        }
        public Builder dataStorageSizeInTbs(Double dataStorageSizeInTbs) {
            this.dataStorageSizeInTbs = Objects.requireNonNull(dataStorageSizeInTbs);
            return this;
        }
        public Builder dbNodeStorageSizeInGbs(Integer dbNodeStorageSizeInGbs) {
            this.dbNodeStorageSizeInGbs = Objects.requireNonNull(dbNodeStorageSizeInGbs);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = Objects.requireNonNull(exadataInfrastructureId);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isLocalBackupEnabled(Boolean isLocalBackupEnabled) {
            this.isLocalBackupEnabled = Objects.requireNonNull(isLocalBackupEnabled);
            return this;
        }
        public Builder lastMaintenanceRunId(String lastMaintenanceRunId) {
            this.lastMaintenanceRunId = Objects.requireNonNull(lastMaintenanceRunId);
            return this;
        }
        public Builder licenseModel(String licenseModel) {
            this.licenseModel = Objects.requireNonNull(licenseModel);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder maintenanceWindowDetails(List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindowDetail> maintenanceWindowDetails) {
            this.maintenanceWindowDetails = Objects.requireNonNull(maintenanceWindowDetails);
            return this;
        }
        public Builder maintenanceWindowDetails(GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindowDetail... maintenanceWindowDetails) {
            return maintenanceWindowDetails(List.of(maintenanceWindowDetails));
        }
        public Builder maintenanceWindows(List<GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindow> maintenanceWindows) {
            this.maintenanceWindows = Objects.requireNonNull(maintenanceWindows);
            return this;
        }
        public Builder maintenanceWindows(GetAutonomousVmClustersAutonomousVmClusterMaintenanceWindow... maintenanceWindows) {
            return maintenanceWindows(List.of(maintenanceWindows));
        }
        public Builder memoryPerOracleComputeUnitInGbs(Integer memoryPerOracleComputeUnitInGbs) {
            this.memoryPerOracleComputeUnitInGbs = Objects.requireNonNull(memoryPerOracleComputeUnitInGbs);
            return this;
        }
        public Builder memorySizeInGbs(Integer memorySizeInGbs) {
            this.memorySizeInGbs = Objects.requireNonNull(memorySizeInGbs);
            return this;
        }
        public Builder nextMaintenanceRunId(String nextMaintenanceRunId) {
            this.nextMaintenanceRunId = Objects.requireNonNull(nextMaintenanceRunId);
            return this;
        }
        public Builder ocpusEnabled(Double ocpusEnabled) {
            this.ocpusEnabled = Objects.requireNonNull(ocpusEnabled);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder totalContainerDatabases(Integer totalContainerDatabases) {
            this.totalContainerDatabases = Objects.requireNonNull(totalContainerDatabases);
            return this;
        }
        public Builder vmClusterNetworkId(String vmClusterNetworkId) {
            this.vmClusterNetworkId = Objects.requireNonNull(vmClusterNetworkId);
            return this;
        }        public GetAutonomousVmClustersAutonomousVmCluster build() {
            return new GetAutonomousVmClustersAutonomousVmCluster(autonomousDataStorageSizeInTbs, availableCpus, availableDataStorageSizeInTbs, compartmentId, cpuCoreCountPerNode, cpusEnabled, dataStorageSizeInGb, dataStorageSizeInTbs, dbNodeStorageSizeInGbs, definedTags, displayName, exadataInfrastructureId, freeformTags, id, isLocalBackupEnabled, lastMaintenanceRunId, licenseModel, lifecycleDetails, maintenanceWindowDetails, maintenanceWindows, memoryPerOracleComputeUnitInGbs, memorySizeInGbs, nextMaintenanceRunId, ocpusEnabled, state, timeCreated, timeZone, totalContainerDatabases, vmClusterNetworkId);
        }
    }
}
