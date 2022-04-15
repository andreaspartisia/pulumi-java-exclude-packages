// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.DiskEncryptionConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.DiskEncryptionStatusResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.InstanceFailoverReplicaResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.IpMappingResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.OnPremisesConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.ReplicaConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.SettingsResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.SqlOutOfDiskReportResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.SqlScheduledMaintenanceResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.SslCertResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    /**
     * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    private final String backendType;
    /**
     * Connection name of the Cloud SQL instance used in connection strings.
     * 
     */
    private final String connectionName;
    /**
     * The time when the instance was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String createTime;
    /**
     * The current disk usage of the instance in bytes. This property has been deprecated. Use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
     */
    private final String currentDiskSize;
    /**
     * Stores the current database version running on the instance including minor version such as `MYSQL_8_0_18`.
     * 
     */
    private final String databaseInstalledVersion;
    /**
     * The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
     */
    private final String databaseVersion;
    /**
     * Disk encryption configuration specific to an instance.
     * 
     */
    private final DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
    /**
     * Disk encryption status specific to an instance.
     * 
     */
    private final DiskEncryptionStatusResponse diskEncryptionStatus;
    /**
     * The name and status of the failover replica.
     * 
     */
    private final InstanceFailoverReplicaResponse failoverReplica;
    /**
     * The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
     */
    private final String gceZone;
    /**
     * The instance type.
     * 
     */
    private final String instanceType;
    /**
     * The assigned IP addresses for the instance.
     * 
     */
    private final List<IpMappingResponse> ipAddresses;
    /**
     * This is always `sql#instance`.
     * 
     */
    private final String kind;
    /**
     * The name of the instance which will act as primary in the replication setup.
     * 
     */
    private final String masterInstanceName;
    /**
     * The maximum disk size of the instance in bytes.
     * 
     */
    private final String maxDiskSize;
    /**
     * Name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    private final String name;
    /**
     * Configuration specific to on-premises instances.
     * 
     */
    private final OnPremisesConfigurationResponse onPremisesConfiguration;
    /**
     * This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    private final SqlOutOfDiskReportResponse outOfDiskReport;
    /**
     * The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
     */
    private final String project;
    /**
     * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
     */
    private final String region;
    /**
     * Configuration specific to failover replicas and read replicas.
     * 
     */
    private final ReplicaConfigurationResponse replicaConfiguration;
    /**
     * The replicas of the instance.
     * 
     */
    private final List<String> replicaNames;
    /**
     * Initial root password. Use only on creation.
     * 
     */
    private final String rootPassword;
    /**
     * The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    private final SqlScheduledMaintenanceResponse scheduledMaintenance;
    /**
     * The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
     */
    private final String secondaryGceZone;
    /**
     * The URI of this resource.
     * 
     */
    private final String selfLink;
    /**
     * SSL configuration.
     * 
     */
    private final SslCertResponse serverCaCert;
    /**
     * The service account email address assigned to the instance. \This property is read-only.
     * 
     */
    private final String serviceAccountEmailAddress;
    /**
     * The user settings.
     * 
     */
    private final SettingsResponse settings;
    /**
     * The current serving state of the Cloud SQL instance.
     * 
     */
    private final String state;
    /**
     * If the instance state is SUSPENDED, the reason for the suspension.
     * 
     */
    private final List<String> suspensionReason;

    @CustomType.Constructor
    private GetInstanceResult(
        @CustomType.Parameter("backendType") String backendType,
        @CustomType.Parameter("connectionName") String connectionName,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("currentDiskSize") String currentDiskSize,
        @CustomType.Parameter("databaseInstalledVersion") String databaseInstalledVersion,
        @CustomType.Parameter("databaseVersion") String databaseVersion,
        @CustomType.Parameter("diskEncryptionConfiguration") DiskEncryptionConfigurationResponse diskEncryptionConfiguration,
        @CustomType.Parameter("diskEncryptionStatus") DiskEncryptionStatusResponse diskEncryptionStatus,
        @CustomType.Parameter("failoverReplica") InstanceFailoverReplicaResponse failoverReplica,
        @CustomType.Parameter("gceZone") String gceZone,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("ipAddresses") List<IpMappingResponse> ipAddresses,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("masterInstanceName") String masterInstanceName,
        @CustomType.Parameter("maxDiskSize") String maxDiskSize,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("onPremisesConfiguration") OnPremisesConfigurationResponse onPremisesConfiguration,
        @CustomType.Parameter("outOfDiskReport") SqlOutOfDiskReportResponse outOfDiskReport,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("replicaConfiguration") ReplicaConfigurationResponse replicaConfiguration,
        @CustomType.Parameter("replicaNames") List<String> replicaNames,
        @CustomType.Parameter("rootPassword") String rootPassword,
        @CustomType.Parameter("satisfiesPzs") Boolean satisfiesPzs,
        @CustomType.Parameter("scheduledMaintenance") SqlScheduledMaintenanceResponse scheduledMaintenance,
        @CustomType.Parameter("secondaryGceZone") String secondaryGceZone,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("serverCaCert") SslCertResponse serverCaCert,
        @CustomType.Parameter("serviceAccountEmailAddress") String serviceAccountEmailAddress,
        @CustomType.Parameter("settings") SettingsResponse settings,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("suspensionReason") List<String> suspensionReason) {
        this.backendType = backendType;
        this.connectionName = connectionName;
        this.createTime = createTime;
        this.currentDiskSize = currentDiskSize;
        this.databaseInstalledVersion = databaseInstalledVersion;
        this.databaseVersion = databaseVersion;
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        this.diskEncryptionStatus = diskEncryptionStatus;
        this.failoverReplica = failoverReplica;
        this.gceZone = gceZone;
        this.instanceType = instanceType;
        this.ipAddresses = ipAddresses;
        this.kind = kind;
        this.masterInstanceName = masterInstanceName;
        this.maxDiskSize = maxDiskSize;
        this.name = name;
        this.onPremisesConfiguration = onPremisesConfiguration;
        this.outOfDiskReport = outOfDiskReport;
        this.project = project;
        this.region = region;
        this.replicaConfiguration = replicaConfiguration;
        this.replicaNames = replicaNames;
        this.rootPassword = rootPassword;
        this.satisfiesPzs = satisfiesPzs;
        this.scheduledMaintenance = scheduledMaintenance;
        this.secondaryGceZone = secondaryGceZone;
        this.selfLink = selfLink;
        this.serverCaCert = serverCaCert;
        this.serviceAccountEmailAddress = serviceAccountEmailAddress;
        this.settings = settings;
        this.state = state;
        this.suspensionReason = suspensionReason;
    }

    /**
     * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
    */
    public String backendType() {
        return this.backendType;
    }
    /**
     * Connection name of the Cloud SQL instance used in connection strings.
     * 
    */
    public String connectionName() {
        return this.connectionName;
    }
    /**
     * The time when the instance was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The current disk usage of the instance in bytes. This property has been deprecated. Use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
    */
    public String currentDiskSize() {
        return this.currentDiskSize;
    }
    /**
     * Stores the current database version running on the instance including minor version such as `MYSQL_8_0_18`.
     * 
    */
    public String databaseInstalledVersion() {
        return this.databaseInstalledVersion;
    }
    /**
     * The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
    */
    public String databaseVersion() {
        return this.databaseVersion;
    }
    /**
     * Disk encryption configuration specific to an instance.
     * 
    */
    public DiskEncryptionConfigurationResponse diskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }
    /**
     * Disk encryption status specific to an instance.
     * 
    */
    public DiskEncryptionStatusResponse diskEncryptionStatus() {
        return this.diskEncryptionStatus;
    }
    /**
     * The name and status of the failover replica.
     * 
    */
    public InstanceFailoverReplicaResponse failoverReplica() {
        return this.failoverReplica;
    }
    /**
     * The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
    */
    public String gceZone() {
        return this.gceZone;
    }
    /**
     * The instance type.
     * 
    */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * The assigned IP addresses for the instance.
     * 
    */
    public List<IpMappingResponse> ipAddresses() {
        return this.ipAddresses;
    }
    /**
     * This is always `sql#instance`.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * The name of the instance which will act as primary in the replication setup.
     * 
    */
    public String masterInstanceName() {
        return this.masterInstanceName;
    }
    /**
     * The maximum disk size of the instance in bytes.
     * 
    */
    public String maxDiskSize() {
        return this.maxDiskSize;
    }
    /**
     * Name of the Cloud SQL instance. This does not include the project ID.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Configuration specific to on-premises instances.
     * 
    */
    public OnPremisesConfigurationResponse onPremisesConfiguration() {
        return this.onPremisesConfiguration;
    }
    /**
     * This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
    */
    public SqlOutOfDiskReportResponse outOfDiskReport() {
        return this.outOfDiskReport;
    }
    /**
     * The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
    */
    public String project() {
        return this.project;
    }
    /**
     * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
    */
    public String region() {
        return this.region;
    }
    /**
     * Configuration specific to failover replicas and read replicas.
     * 
    */
    public ReplicaConfigurationResponse replicaConfiguration() {
        return this.replicaConfiguration;
    }
    /**
     * The replicas of the instance.
     * 
    */
    public List<String> replicaNames() {
        return this.replicaNames;
    }
    /**
     * Initial root password. Use only on creation.
     * 
    */
    public String rootPassword() {
        return this.rootPassword;
    }
    /**
     * The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
    */
    public Boolean satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
    */
    public SqlScheduledMaintenanceResponse scheduledMaintenance() {
        return this.scheduledMaintenance;
    }
    /**
     * The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
    */
    public String secondaryGceZone() {
        return this.secondaryGceZone;
    }
    /**
     * The URI of this resource.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * SSL configuration.
     * 
    */
    public SslCertResponse serverCaCert() {
        return this.serverCaCert;
    }
    /**
     * The service account email address assigned to the instance. \This property is read-only.
     * 
    */
    public String serviceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }
    /**
     * The user settings.
     * 
    */
    public SettingsResponse settings() {
        return this.settings;
    }
    /**
     * The current serving state of the Cloud SQL instance.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * If the instance state is SUSPENDED, the reason for the suspension.
     * 
    */
    public List<String> suspensionReason() {
        return this.suspensionReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendType;
        private String connectionName;
        private String createTime;
        private String currentDiskSize;
        private String databaseInstalledVersion;
        private String databaseVersion;
        private DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
        private DiskEncryptionStatusResponse diskEncryptionStatus;
        private InstanceFailoverReplicaResponse failoverReplica;
        private String gceZone;
        private String instanceType;
        private List<IpMappingResponse> ipAddresses;
        private String kind;
        private String masterInstanceName;
        private String maxDiskSize;
        private String name;
        private OnPremisesConfigurationResponse onPremisesConfiguration;
        private SqlOutOfDiskReportResponse outOfDiskReport;
        private String project;
        private String region;
        private ReplicaConfigurationResponse replicaConfiguration;
        private List<String> replicaNames;
        private String rootPassword;
        private Boolean satisfiesPzs;
        private SqlScheduledMaintenanceResponse scheduledMaintenance;
        private String secondaryGceZone;
        private String selfLink;
        private SslCertResponse serverCaCert;
        private String serviceAccountEmailAddress;
        private SettingsResponse settings;
        private String state;
        private List<String> suspensionReason;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendType = defaults.backendType;
    	      this.connectionName = defaults.connectionName;
    	      this.createTime = defaults.createTime;
    	      this.currentDiskSize = defaults.currentDiskSize;
    	      this.databaseInstalledVersion = defaults.databaseInstalledVersion;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.diskEncryptionConfiguration = defaults.diskEncryptionConfiguration;
    	      this.diskEncryptionStatus = defaults.diskEncryptionStatus;
    	      this.failoverReplica = defaults.failoverReplica;
    	      this.gceZone = defaults.gceZone;
    	      this.instanceType = defaults.instanceType;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.kind = defaults.kind;
    	      this.masterInstanceName = defaults.masterInstanceName;
    	      this.maxDiskSize = defaults.maxDiskSize;
    	      this.name = defaults.name;
    	      this.onPremisesConfiguration = defaults.onPremisesConfiguration;
    	      this.outOfDiskReport = defaults.outOfDiskReport;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.replicaConfiguration = defaults.replicaConfiguration;
    	      this.replicaNames = defaults.replicaNames;
    	      this.rootPassword = defaults.rootPassword;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.scheduledMaintenance = defaults.scheduledMaintenance;
    	      this.secondaryGceZone = defaults.secondaryGceZone;
    	      this.selfLink = defaults.selfLink;
    	      this.serverCaCert = defaults.serverCaCert;
    	      this.serviceAccountEmailAddress = defaults.serviceAccountEmailAddress;
    	      this.settings = defaults.settings;
    	      this.state = defaults.state;
    	      this.suspensionReason = defaults.suspensionReason;
        }

        public Builder backendType(String backendType) {
            this.backendType = Objects.requireNonNull(backendType);
            return this;
        }
        public Builder connectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder currentDiskSize(String currentDiskSize) {
            this.currentDiskSize = Objects.requireNonNull(currentDiskSize);
            return this;
        }
        public Builder databaseInstalledVersion(String databaseInstalledVersion) {
            this.databaseInstalledVersion = Objects.requireNonNull(databaseInstalledVersion);
            return this;
        }
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = Objects.requireNonNull(databaseVersion);
            return this;
        }
        public Builder diskEncryptionConfiguration(DiskEncryptionConfigurationResponse diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = Objects.requireNonNull(diskEncryptionConfiguration);
            return this;
        }
        public Builder diskEncryptionStatus(DiskEncryptionStatusResponse diskEncryptionStatus) {
            this.diskEncryptionStatus = Objects.requireNonNull(diskEncryptionStatus);
            return this;
        }
        public Builder failoverReplica(InstanceFailoverReplicaResponse failoverReplica) {
            this.failoverReplica = Objects.requireNonNull(failoverReplica);
            return this;
        }
        public Builder gceZone(String gceZone) {
            this.gceZone = Objects.requireNonNull(gceZone);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder ipAddresses(List<IpMappingResponse> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }
        public Builder ipAddresses(IpMappingResponse... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder masterInstanceName(String masterInstanceName) {
            this.masterInstanceName = Objects.requireNonNull(masterInstanceName);
            return this;
        }
        public Builder maxDiskSize(String maxDiskSize) {
            this.maxDiskSize = Objects.requireNonNull(maxDiskSize);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder onPremisesConfiguration(OnPremisesConfigurationResponse onPremisesConfiguration) {
            this.onPremisesConfiguration = Objects.requireNonNull(onPremisesConfiguration);
            return this;
        }
        public Builder outOfDiskReport(SqlOutOfDiskReportResponse outOfDiskReport) {
            this.outOfDiskReport = Objects.requireNonNull(outOfDiskReport);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder replicaConfiguration(ReplicaConfigurationResponse replicaConfiguration) {
            this.replicaConfiguration = Objects.requireNonNull(replicaConfiguration);
            return this;
        }
        public Builder replicaNames(List<String> replicaNames) {
            this.replicaNames = Objects.requireNonNull(replicaNames);
            return this;
        }
        public Builder replicaNames(String... replicaNames) {
            return replicaNames(List.of(replicaNames));
        }
        public Builder rootPassword(String rootPassword) {
            this.rootPassword = Objects.requireNonNull(rootPassword);
            return this;
        }
        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }
        public Builder scheduledMaintenance(SqlScheduledMaintenanceResponse scheduledMaintenance) {
            this.scheduledMaintenance = Objects.requireNonNull(scheduledMaintenance);
            return this;
        }
        public Builder secondaryGceZone(String secondaryGceZone) {
            this.secondaryGceZone = Objects.requireNonNull(secondaryGceZone);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder serverCaCert(SslCertResponse serverCaCert) {
            this.serverCaCert = Objects.requireNonNull(serverCaCert);
            return this;
        }
        public Builder serviceAccountEmailAddress(String serviceAccountEmailAddress) {
            this.serviceAccountEmailAddress = Objects.requireNonNull(serviceAccountEmailAddress);
            return this;
        }
        public Builder settings(SettingsResponse settings) {
            this.settings = Objects.requireNonNull(settings);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder suspensionReason(List<String> suspensionReason) {
            this.suspensionReason = Objects.requireNonNull(suspensionReason);
            return this;
        }
        public Builder suspensionReason(String... suspensionReason) {
            return suspensionReason(List.of(suspensionReason));
        }        public GetInstanceResult build() {
            return new GetInstanceResult(backendType, connectionName, createTime, currentDiskSize, databaseInstalledVersion, databaseVersion, diskEncryptionConfiguration, diskEncryptionStatus, failoverReplica, gceZone, instanceType, ipAddresses, kind, masterInstanceName, maxDiskSize, name, onPremisesConfiguration, outOfDiskReport, project, region, replicaConfiguration, replicaNames, rootPassword, satisfiesPzs, scheduledMaintenance, secondaryGceZone, selfLink, serverCaCert, serviceAccountEmailAddress, settings, state, suspensionReason);
        }
    }
}
