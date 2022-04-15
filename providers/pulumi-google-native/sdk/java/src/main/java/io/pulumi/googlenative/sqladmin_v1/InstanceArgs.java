// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.sqladmin_v1.enums.InstanceBackendType;
import io.pulumi.googlenative.sqladmin_v1.enums.InstanceDatabaseVersion;
import io.pulumi.googlenative.sqladmin_v1.enums.InstanceInstanceType;
import io.pulumi.googlenative.sqladmin_v1.enums.InstanceState;
import io.pulumi.googlenative.sqladmin_v1.enums.InstanceSuspensionReasonItem;
import io.pulumi.googlenative.sqladmin_v1.inputs.DiskEncryptionConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.DiskEncryptionStatusArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.InstanceFailoverReplicaArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.IpMappingArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.OnPremisesConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.ReplicaConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.SettingsArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.SqlOutOfDiskReportArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.SqlScheduledMaintenanceArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.SslCertArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    @Import(name="backendType")
      private final @Nullable Output<InstanceBackendType> backendType;

    public Output<InstanceBackendType> backendType() {
        return this.backendType == null ? Codegen.empty() : this.backendType;
    }

    /**
     * Connection name of the Cloud SQL instance used in connection strings.
     * 
     */
    @Import(name="connectionName")
      private final @Nullable Output<String> connectionName;

    public Output<String> connectionName() {
        return this.connectionName == null ? Codegen.empty() : this.connectionName;
    }

    /**
     * The current disk usage of the instance in bytes. This property has been deprecated. Use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
     */
    @Import(name="currentDiskSize")
      private final @Nullable Output<String> currentDiskSize;

    public Output<String> currentDiskSize() {
        return this.currentDiskSize == null ? Codegen.empty() : this.currentDiskSize;
    }

    /**
     * The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
     */
    @Import(name="databaseVersion")
      private final @Nullable Output<InstanceDatabaseVersion> databaseVersion;

    public Output<InstanceDatabaseVersion> databaseVersion() {
        return this.databaseVersion == null ? Codegen.empty() : this.databaseVersion;
    }

    /**
     * Disk encryption configuration specific to an instance.
     * 
     */
    @Import(name="diskEncryptionConfiguration")
      private final @Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;

    public Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration == null ? Codegen.empty() : this.diskEncryptionConfiguration;
    }

    /**
     * Disk encryption status specific to an instance.
     * 
     */
    @Import(name="diskEncryptionStatus")
      private final @Nullable Output<DiskEncryptionStatusArgs> diskEncryptionStatus;

    public Output<DiskEncryptionStatusArgs> diskEncryptionStatus() {
        return this.diskEncryptionStatus == null ? Codegen.empty() : this.diskEncryptionStatus;
    }

    /**
     * The name and status of the failover replica.
     * 
     */
    @Import(name="failoverReplica")
      private final @Nullable Output<InstanceFailoverReplicaArgs> failoverReplica;

    public Output<InstanceFailoverReplicaArgs> failoverReplica() {
        return this.failoverReplica == null ? Codegen.empty() : this.failoverReplica;
    }

    /**
     * The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
     */
    @Import(name="gceZone")
      private final @Nullable Output<String> gceZone;

    public Output<String> gceZone() {
        return this.gceZone == null ? Codegen.empty() : this.gceZone;
    }

    /**
     * The instance type.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<InstanceInstanceType> instanceType;

    public Output<InstanceInstanceType> instanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * The assigned IP addresses for the instance.
     * 
     */
    @Import(name="ipAddresses")
      private final @Nullable Output<List<IpMappingArgs>> ipAddresses;

    public Output<List<IpMappingArgs>> ipAddresses() {
        return this.ipAddresses == null ? Codegen.empty() : this.ipAddresses;
    }

    /**
     * This is always `sql#instance`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The name of the instance which will act as primary in the replication setup.
     * 
     */
    @Import(name="masterInstanceName")
      private final @Nullable Output<String> masterInstanceName;

    public Output<String> masterInstanceName() {
        return this.masterInstanceName == null ? Codegen.empty() : this.masterInstanceName;
    }

    /**
     * The maximum disk size of the instance in bytes.
     * 
     */
    @Import(name="maxDiskSize")
      private final @Nullable Output<String> maxDiskSize;

    public Output<String> maxDiskSize() {
        return this.maxDiskSize == null ? Codegen.empty() : this.maxDiskSize;
    }

    /**
     * Name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Configuration specific to on-premises instances.
     * 
     */
    @Import(name="onPremisesConfiguration")
      private final @Nullable Output<OnPremisesConfigurationArgs> onPremisesConfiguration;

    public Output<OnPremisesConfigurationArgs> onPremisesConfiguration() {
        return this.onPremisesConfiguration == null ? Codegen.empty() : this.onPremisesConfiguration;
    }

    /**
     * This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    @Import(name="outOfDiskReport")
      private final @Nullable Output<SqlOutOfDiskReportArgs> outOfDiskReport;

    public Output<SqlOutOfDiskReportArgs> outOfDiskReport() {
        return this.outOfDiskReport == null ? Codegen.empty() : this.outOfDiskReport;
    }

    /**
     * The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * Configuration specific to failover replicas and read replicas.
     * 
     */
    @Import(name="replicaConfiguration")
      private final @Nullable Output<ReplicaConfigurationArgs> replicaConfiguration;

    public Output<ReplicaConfigurationArgs> replicaConfiguration() {
        return this.replicaConfiguration == null ? Codegen.empty() : this.replicaConfiguration;
    }

    /**
     * The replicas of the instance.
     * 
     */
    @Import(name="replicaNames")
      private final @Nullable Output<List<String>> replicaNames;

    public Output<List<String>> replicaNames() {
        return this.replicaNames == null ? Codegen.empty() : this.replicaNames;
    }

    /**
     * Initial root password. Use only on creation.
     * 
     */
    @Import(name="rootPassword")
      private final @Nullable Output<String> rootPassword;

    public Output<String> rootPassword() {
        return this.rootPassword == null ? Codegen.empty() : this.rootPassword;
    }

    /**
     * The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
     */
    @Import(name="satisfiesPzs")
      private final @Nullable Output<Boolean> satisfiesPzs;

    public Output<Boolean> satisfiesPzs() {
        return this.satisfiesPzs == null ? Codegen.empty() : this.satisfiesPzs;
    }

    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    @Import(name="scheduledMaintenance")
      private final @Nullable Output<SqlScheduledMaintenanceArgs> scheduledMaintenance;

    public Output<SqlScheduledMaintenanceArgs> scheduledMaintenance() {
        return this.scheduledMaintenance == null ? Codegen.empty() : this.scheduledMaintenance;
    }

    /**
     * The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
     */
    @Import(name="secondaryGceZone")
      private final @Nullable Output<String> secondaryGceZone;

    public Output<String> secondaryGceZone() {
        return this.secondaryGceZone == null ? Codegen.empty() : this.secondaryGceZone;
    }

    /**
     * The URI of this resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> selfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * SSL configuration.
     * 
     */
    @Import(name="serverCaCert")
      private final @Nullable Output<SslCertArgs> serverCaCert;

    public Output<SslCertArgs> serverCaCert() {
        return this.serverCaCert == null ? Codegen.empty() : this.serverCaCert;
    }

    /**
     * The service account email address assigned to the instance.\This property is read-only.
     * 
     */
    @Import(name="serviceAccountEmailAddress")
      private final @Nullable Output<String> serviceAccountEmailAddress;

    public Output<String> serviceAccountEmailAddress() {
        return this.serviceAccountEmailAddress == null ? Codegen.empty() : this.serviceAccountEmailAddress;
    }

    /**
     * The user settings.
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<SettingsArgs> settings;

    public Output<SettingsArgs> settings() {
        return this.settings == null ? Codegen.empty() : this.settings;
    }

    /**
     * The current serving state of the Cloud SQL instance.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<InstanceState> state;

    public Output<InstanceState> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * If the instance state is SUSPENDED, the reason for the suspension.
     * 
     */
    @Import(name="suspensionReason")
      private final @Nullable Output<List<InstanceSuspensionReasonItem>> suspensionReason;

    public Output<List<InstanceSuspensionReasonItem>> suspensionReason() {
        return this.suspensionReason == null ? Codegen.empty() : this.suspensionReason;
    }

    public InstanceArgs(
        @Nullable Output<InstanceBackendType> backendType,
        @Nullable Output<String> connectionName,
        @Nullable Output<String> currentDiskSize,
        @Nullable Output<InstanceDatabaseVersion> databaseVersion,
        @Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration,
        @Nullable Output<DiskEncryptionStatusArgs> diskEncryptionStatus,
        @Nullable Output<InstanceFailoverReplicaArgs> failoverReplica,
        @Nullable Output<String> gceZone,
        @Nullable Output<InstanceInstanceType> instanceType,
        @Nullable Output<List<IpMappingArgs>> ipAddresses,
        @Nullable Output<String> kind,
        @Nullable Output<String> masterInstanceName,
        @Nullable Output<String> maxDiskSize,
        @Nullable Output<String> name,
        @Nullable Output<OnPremisesConfigurationArgs> onPremisesConfiguration,
        @Nullable Output<SqlOutOfDiskReportArgs> outOfDiskReport,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<ReplicaConfigurationArgs> replicaConfiguration,
        @Nullable Output<List<String>> replicaNames,
        @Nullable Output<String> rootPassword,
        @Nullable Output<Boolean> satisfiesPzs,
        @Nullable Output<SqlScheduledMaintenanceArgs> scheduledMaintenance,
        @Nullable Output<String> secondaryGceZone,
        @Nullable Output<String> selfLink,
        @Nullable Output<SslCertArgs> serverCaCert,
        @Nullable Output<String> serviceAccountEmailAddress,
        @Nullable Output<SettingsArgs> settings,
        @Nullable Output<InstanceState> state,
        @Nullable Output<List<InstanceSuspensionReasonItem>> suspensionReason) {
        this.backendType = backendType;
        this.connectionName = connectionName;
        this.currentDiskSize = currentDiskSize;
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

    private InstanceArgs() {
        this.backendType = Codegen.empty();
        this.connectionName = Codegen.empty();
        this.currentDiskSize = Codegen.empty();
        this.databaseVersion = Codegen.empty();
        this.diskEncryptionConfiguration = Codegen.empty();
        this.diskEncryptionStatus = Codegen.empty();
        this.failoverReplica = Codegen.empty();
        this.gceZone = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.ipAddresses = Codegen.empty();
        this.kind = Codegen.empty();
        this.masterInstanceName = Codegen.empty();
        this.maxDiskSize = Codegen.empty();
        this.name = Codegen.empty();
        this.onPremisesConfiguration = Codegen.empty();
        this.outOfDiskReport = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.replicaConfiguration = Codegen.empty();
        this.replicaNames = Codegen.empty();
        this.rootPassword = Codegen.empty();
        this.satisfiesPzs = Codegen.empty();
        this.scheduledMaintenance = Codegen.empty();
        this.secondaryGceZone = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.serverCaCert = Codegen.empty();
        this.serviceAccountEmailAddress = Codegen.empty();
        this.settings = Codegen.empty();
        this.state = Codegen.empty();
        this.suspensionReason = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceBackendType> backendType;
        private @Nullable Output<String> connectionName;
        private @Nullable Output<String> currentDiskSize;
        private @Nullable Output<InstanceDatabaseVersion> databaseVersion;
        private @Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;
        private @Nullable Output<DiskEncryptionStatusArgs> diskEncryptionStatus;
        private @Nullable Output<InstanceFailoverReplicaArgs> failoverReplica;
        private @Nullable Output<String> gceZone;
        private @Nullable Output<InstanceInstanceType> instanceType;
        private @Nullable Output<List<IpMappingArgs>> ipAddresses;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> masterInstanceName;
        private @Nullable Output<String> maxDiskSize;
        private @Nullable Output<String> name;
        private @Nullable Output<OnPremisesConfigurationArgs> onPremisesConfiguration;
        private @Nullable Output<SqlOutOfDiskReportArgs> outOfDiskReport;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<ReplicaConfigurationArgs> replicaConfiguration;
        private @Nullable Output<List<String>> replicaNames;
        private @Nullable Output<String> rootPassword;
        private @Nullable Output<Boolean> satisfiesPzs;
        private @Nullable Output<SqlScheduledMaintenanceArgs> scheduledMaintenance;
        private @Nullable Output<String> secondaryGceZone;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<SslCertArgs> serverCaCert;
        private @Nullable Output<String> serviceAccountEmailAddress;
        private @Nullable Output<SettingsArgs> settings;
        private @Nullable Output<InstanceState> state;
        private @Nullable Output<List<InstanceSuspensionReasonItem>> suspensionReason;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendType = defaults.backendType;
    	      this.connectionName = defaults.connectionName;
    	      this.currentDiskSize = defaults.currentDiskSize;
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

        public Builder backendType(@Nullable Output<InstanceBackendType> backendType) {
            this.backendType = backendType;
            return this;
        }
        public Builder backendType(@Nullable InstanceBackendType backendType) {
            this.backendType = Codegen.ofNullable(backendType);
            return this;
        }
        public Builder connectionName(@Nullable Output<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = Codegen.ofNullable(connectionName);
            return this;
        }
        public Builder currentDiskSize(@Nullable Output<String> currentDiskSize) {
            this.currentDiskSize = currentDiskSize;
            return this;
        }
        public Builder currentDiskSize(@Nullable String currentDiskSize) {
            this.currentDiskSize = Codegen.ofNullable(currentDiskSize);
            return this;
        }
        public Builder databaseVersion(@Nullable Output<InstanceDatabaseVersion> databaseVersion) {
            this.databaseVersion = databaseVersion;
            return this;
        }
        public Builder databaseVersion(@Nullable InstanceDatabaseVersion databaseVersion) {
            this.databaseVersion = Codegen.ofNullable(databaseVersion);
            return this;
        }
        public Builder diskEncryptionConfiguration(@Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }
        public Builder diskEncryptionConfiguration(@Nullable DiskEncryptionConfigurationArgs diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = Codegen.ofNullable(diskEncryptionConfiguration);
            return this;
        }
        public Builder diskEncryptionStatus(@Nullable Output<DiskEncryptionStatusArgs> diskEncryptionStatus) {
            this.diskEncryptionStatus = diskEncryptionStatus;
            return this;
        }
        public Builder diskEncryptionStatus(@Nullable DiskEncryptionStatusArgs diskEncryptionStatus) {
            this.diskEncryptionStatus = Codegen.ofNullable(diskEncryptionStatus);
            return this;
        }
        public Builder failoverReplica(@Nullable Output<InstanceFailoverReplicaArgs> failoverReplica) {
            this.failoverReplica = failoverReplica;
            return this;
        }
        public Builder failoverReplica(@Nullable InstanceFailoverReplicaArgs failoverReplica) {
            this.failoverReplica = Codegen.ofNullable(failoverReplica);
            return this;
        }
        public Builder gceZone(@Nullable Output<String> gceZone) {
            this.gceZone = gceZone;
            return this;
        }
        public Builder gceZone(@Nullable String gceZone) {
            this.gceZone = Codegen.ofNullable(gceZone);
            return this;
        }
        public Builder instanceType(@Nullable Output<InstanceInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable InstanceInstanceType instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder ipAddresses(@Nullable Output<List<IpMappingArgs>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(@Nullable List<IpMappingArgs> ipAddresses) {
            this.ipAddresses = Codegen.ofNullable(ipAddresses);
            return this;
        }
        public Builder ipAddresses(IpMappingArgs... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder masterInstanceName(@Nullable Output<String> masterInstanceName) {
            this.masterInstanceName = masterInstanceName;
            return this;
        }
        public Builder masterInstanceName(@Nullable String masterInstanceName) {
            this.masterInstanceName = Codegen.ofNullable(masterInstanceName);
            return this;
        }
        public Builder maxDiskSize(@Nullable Output<String> maxDiskSize) {
            this.maxDiskSize = maxDiskSize;
            return this;
        }
        public Builder maxDiskSize(@Nullable String maxDiskSize) {
            this.maxDiskSize = Codegen.ofNullable(maxDiskSize);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder onPremisesConfiguration(@Nullable Output<OnPremisesConfigurationArgs> onPremisesConfiguration) {
            this.onPremisesConfiguration = onPremisesConfiguration;
            return this;
        }
        public Builder onPremisesConfiguration(@Nullable OnPremisesConfigurationArgs onPremisesConfiguration) {
            this.onPremisesConfiguration = Codegen.ofNullable(onPremisesConfiguration);
            return this;
        }
        public Builder outOfDiskReport(@Nullable Output<SqlOutOfDiskReportArgs> outOfDiskReport) {
            this.outOfDiskReport = outOfDiskReport;
            return this;
        }
        public Builder outOfDiskReport(@Nullable SqlOutOfDiskReportArgs outOfDiskReport) {
            this.outOfDiskReport = Codegen.ofNullable(outOfDiskReport);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder replicaConfiguration(@Nullable Output<ReplicaConfigurationArgs> replicaConfiguration) {
            this.replicaConfiguration = replicaConfiguration;
            return this;
        }
        public Builder replicaConfiguration(@Nullable ReplicaConfigurationArgs replicaConfiguration) {
            this.replicaConfiguration = Codegen.ofNullable(replicaConfiguration);
            return this;
        }
        public Builder replicaNames(@Nullable Output<List<String>> replicaNames) {
            this.replicaNames = replicaNames;
            return this;
        }
        public Builder replicaNames(@Nullable List<String> replicaNames) {
            this.replicaNames = Codegen.ofNullable(replicaNames);
            return this;
        }
        public Builder replicaNames(String... replicaNames) {
            return replicaNames(List.of(replicaNames));
        }
        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }
        public Builder rootPassword(@Nullable String rootPassword) {
            this.rootPassword = Codegen.ofNullable(rootPassword);
            return this;
        }
        public Builder satisfiesPzs(@Nullable Output<Boolean> satisfiesPzs) {
            this.satisfiesPzs = satisfiesPzs;
            return this;
        }
        public Builder satisfiesPzs(@Nullable Boolean satisfiesPzs) {
            this.satisfiesPzs = Codegen.ofNullable(satisfiesPzs);
            return this;
        }
        public Builder scheduledMaintenance(@Nullable Output<SqlScheduledMaintenanceArgs> scheduledMaintenance) {
            this.scheduledMaintenance = scheduledMaintenance;
            return this;
        }
        public Builder scheduledMaintenance(@Nullable SqlScheduledMaintenanceArgs scheduledMaintenance) {
            this.scheduledMaintenance = Codegen.ofNullable(scheduledMaintenance);
            return this;
        }
        public Builder secondaryGceZone(@Nullable Output<String> secondaryGceZone) {
            this.secondaryGceZone = secondaryGceZone;
            return this;
        }
        public Builder secondaryGceZone(@Nullable String secondaryGceZone) {
            this.secondaryGceZone = Codegen.ofNullable(secondaryGceZone);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder serverCaCert(@Nullable Output<SslCertArgs> serverCaCert) {
            this.serverCaCert = serverCaCert;
            return this;
        }
        public Builder serverCaCert(@Nullable SslCertArgs serverCaCert) {
            this.serverCaCert = Codegen.ofNullable(serverCaCert);
            return this;
        }
        public Builder serviceAccountEmailAddress(@Nullable Output<String> serviceAccountEmailAddress) {
            this.serviceAccountEmailAddress = serviceAccountEmailAddress;
            return this;
        }
        public Builder serviceAccountEmailAddress(@Nullable String serviceAccountEmailAddress) {
            this.serviceAccountEmailAddress = Codegen.ofNullable(serviceAccountEmailAddress);
            return this;
        }
        public Builder settings(@Nullable Output<SettingsArgs> settings) {
            this.settings = settings;
            return this;
        }
        public Builder settings(@Nullable SettingsArgs settings) {
            this.settings = Codegen.ofNullable(settings);
            return this;
        }
        public Builder state(@Nullable Output<InstanceState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable InstanceState state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder suspensionReason(@Nullable Output<List<InstanceSuspensionReasonItem>> suspensionReason) {
            this.suspensionReason = suspensionReason;
            return this;
        }
        public Builder suspensionReason(@Nullable List<InstanceSuspensionReasonItem> suspensionReason) {
            this.suspensionReason = Codegen.ofNullable(suspensionReason);
            return this;
        }
        public Builder suspensionReason(InstanceSuspensionReasonItem... suspensionReason) {
            return suspensionReason(List.of(suspensionReason));
        }        public InstanceArgs build() {
            return new InstanceArgs(backendType, connectionName, currentDiskSize, databaseVersion, diskEncryptionConfiguration, diskEncryptionStatus, failoverReplica, gceZone, instanceType, ipAddresses, kind, masterInstanceName, maxDiskSize, name, onPremisesConfiguration, outOfDiskReport, project, region, replicaConfiguration, replicaNames, rootPassword, satisfiesPzs, scheduledMaintenance, secondaryGceZone, selfLink, serverCaCert, serviceAccountEmailAddress, settings, state, suspensionReason);
        }
    }
}
