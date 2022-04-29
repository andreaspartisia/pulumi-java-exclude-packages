// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetCloudVmClustersCloudVmClusterIormConfigCach;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCloudVmClustersCloudVmCluster {
    /**
     * @return The name of the availability domain that the cloud Exadata infrastructure resource is located in.
     * 
     */
    private final String availabilityDomain;
    /**
     * @return A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     * 
     */
    private final List<String> backupNetworkNsgIds;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the cloud VM cluster.
     * 
     */
    private final String backupSubnetId;
    /**
     * @return If provided, filters the results for the specified cloud Exadata infrastructure.
     * 
     */
    private final String cloudExadataInfrastructureId;
    /**
     * @return The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     * 
     */
    private final String clusterName;
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String compartmentId;
    /**
     * @return The number of CPU cores enabled on the cloud VM cluster.
     * 
     */
    private final Integer cpuCoreCount;
    private final Boolean createAsync;
    /**
     * @return The percentage assigned to DATA storage (user data and database files). The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent assigned to DATA storage. See [Storage Configuration](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaoverview.htm#Exadata) in the Exadata documentation for details on the impact of the configuration settings on storage.
     * 
     */
    private final Integer dataStoragePercentage;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The type of redundancy configured for the cloud Vm cluster. NORMAL is 2-way redundancy. HIGH is 3-way redundancy.
     * 
     */
    private final String diskRedundancy;
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    private final String displayName;
    /**
     * @return The domain name for the cloud VM cluster.
     * 
     */
    private final String domain;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return A valid Oracle Grid Infrastructure (GI) software version.
     * 
     */
    private final String giVersion;
    /**
     * @return The hostname for the cloud VM cluster.
     * 
     */
    private final String hostname;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud VM cluster.
     * 
     */
    private final String id;
    private final List<GetCloudVmClustersCloudVmClusterIormConfigCach> iormConfigCaches;
    /**
     * @return If true, database backup on local Exadata storage is configured for the cloud VM cluster. If false, database backup on local Exadata storage is not available in the cloud VM cluster.
     * 
     */
    private final Boolean isLocalBackupEnabled;
    /**
     * @return If true, sparse disk group is configured for the cloud VM cluster. If false, sparse disk group is not created.
     * 
     */
    private final Boolean isSparseDiskgroupEnabled;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance update history entry. This value is updated when a maintenance update starts.
     * 
     */
    private final String lastUpdateHistoryEntryId;
    /**
     * @return The Oracle license model that applies to the cloud VM cluster. The default is LICENSE_INCLUDED.
     * 
     */
    private final String licenseModel;
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The port number configured for the listener on the cloud VM cluster.
     * 
     */
    private final String listenerPort;
    /**
     * @return The number of nodes in the cloud VM cluster.
     * 
     */
    private final Integer nodeCount;
    /**
     * @return A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds restrictions:**
     * * Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
     * 
     */
    private final List<String> nsgIds;
    /**
     * @return The number of OCPU cores to enable on the cloud VM cluster. Only 1 decimal place is allowed for the fractional part.
     * 
     */
    private final Double ocpuCount;
    /**
     * @return The FQDN of the DNS record for the SCAN IP addresses that are associated with the cloud VM cluster.
     * 
     */
    private final String scanDnsName;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DNS record for the SCAN IP addresses that are associated with the cloud VM cluster.
     * 
     */
    private final String scanDnsRecordId;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Single Client Access Name (SCAN) IP addresses associated with the cloud VM cluster. SCAN IP addresses are typically used for load balancing and are not assigned to any interface. Oracle Clusterware directs the requests to the appropriate nodes in the cluster.
     * 
     */
    private final List<String> scanIpIds;
    /**
     * @return The TCP Single Client Access Name (SCAN) port. The default port is 1521.
     * 
     */
    private final Integer scanListenerPortTcp;
    /**
     * @return The TCPS Single Client Access Name (SCAN) port. The default port is 2484.
     * 
     */
    private final Integer scanListenerPortTcpSsl;
    /**
     * @return The model name of the Exadata hardware running the cloud VM cluster.
     * 
     */
    private final String shape;
    /**
     * @return The public key portion of one or more key pairs used for SSH access to the cloud VM cluster.
     * 
     */
    private final List<String> sshPublicKeys;
    /**
     * @return A filter to return only cloud VM clusters that match the given lifecycle state exactly.
     * 
     */
    private final String state;
    /**
     * @return The storage allocation for the disk group, in gigabytes (GB).
     * 
     */
    private final Integer storageSizeInGbs;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the cloud VM cluster.
     * 
     */
    private final String subnetId;
    /**
     * @return Operating system version of the image.
     * 
     */
    private final String systemVersion;
    /**
     * @return The date and time that the cloud VM cluster was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The time zone of the cloud VM cluster. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/iaas/Content/Database/References/timezones.htm).
     * 
     */
    private final String timeZone;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the virtual IP (VIP) addresses associated with the cloud VM cluster. The Cluster Ready Services (CRS) creates and maintains one VIP address for each node in the Exadata Cloud Service instance to enable failover. If one node fails, the VIP is reassigned to another active node in the cluster.
     * 
     */
    private final List<String> vipIds;
    /**
     * @return The OCID of the zone the cloud VM cluster is associated with.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetCloudVmClustersCloudVmCluster(
        @CustomType.Parameter("availabilityDomain") String availabilityDomain,
        @CustomType.Parameter("backupNetworkNsgIds") List<String> backupNetworkNsgIds,
        @CustomType.Parameter("backupSubnetId") String backupSubnetId,
        @CustomType.Parameter("cloudExadataInfrastructureId") String cloudExadataInfrastructureId,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("cpuCoreCount") Integer cpuCoreCount,
        @CustomType.Parameter("createAsync") Boolean createAsync,
        @CustomType.Parameter("dataStoragePercentage") Integer dataStoragePercentage,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("diskRedundancy") String diskRedundancy,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("giVersion") String giVersion,
        @CustomType.Parameter("hostname") String hostname,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("iormConfigCaches") List<GetCloudVmClustersCloudVmClusterIormConfigCach> iormConfigCaches,
        @CustomType.Parameter("isLocalBackupEnabled") Boolean isLocalBackupEnabled,
        @CustomType.Parameter("isSparseDiskgroupEnabled") Boolean isSparseDiskgroupEnabled,
        @CustomType.Parameter("lastUpdateHistoryEntryId") String lastUpdateHistoryEntryId,
        @CustomType.Parameter("licenseModel") String licenseModel,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("listenerPort") String listenerPort,
        @CustomType.Parameter("nodeCount") Integer nodeCount,
        @CustomType.Parameter("nsgIds") List<String> nsgIds,
        @CustomType.Parameter("ocpuCount") Double ocpuCount,
        @CustomType.Parameter("scanDnsName") String scanDnsName,
        @CustomType.Parameter("scanDnsRecordId") String scanDnsRecordId,
        @CustomType.Parameter("scanIpIds") List<String> scanIpIds,
        @CustomType.Parameter("scanListenerPortTcp") Integer scanListenerPortTcp,
        @CustomType.Parameter("scanListenerPortTcpSsl") Integer scanListenerPortTcpSsl,
        @CustomType.Parameter("shape") String shape,
        @CustomType.Parameter("sshPublicKeys") List<String> sshPublicKeys,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("storageSizeInGbs") Integer storageSizeInGbs,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("systemVersion") String systemVersion,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeZone") String timeZone,
        @CustomType.Parameter("vipIds") List<String> vipIds,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.availabilityDomain = availabilityDomain;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.backupSubnetId = backupSubnetId;
        this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
        this.clusterName = clusterName;
        this.compartmentId = compartmentId;
        this.cpuCoreCount = cpuCoreCount;
        this.createAsync = createAsync;
        this.dataStoragePercentage = dataStoragePercentage;
        this.definedTags = definedTags;
        this.diskRedundancy = diskRedundancy;
        this.displayName = displayName;
        this.domain = domain;
        this.freeformTags = freeformTags;
        this.giVersion = giVersion;
        this.hostname = hostname;
        this.id = id;
        this.iormConfigCaches = iormConfigCaches;
        this.isLocalBackupEnabled = isLocalBackupEnabled;
        this.isSparseDiskgroupEnabled = isSparseDiskgroupEnabled;
        this.lastUpdateHistoryEntryId = lastUpdateHistoryEntryId;
        this.licenseModel = licenseModel;
        this.lifecycleDetails = lifecycleDetails;
        this.listenerPort = listenerPort;
        this.nodeCount = nodeCount;
        this.nsgIds = nsgIds;
        this.ocpuCount = ocpuCount;
        this.scanDnsName = scanDnsName;
        this.scanDnsRecordId = scanDnsRecordId;
        this.scanIpIds = scanIpIds;
        this.scanListenerPortTcp = scanListenerPortTcp;
        this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
        this.shape = shape;
        this.sshPublicKeys = sshPublicKeys;
        this.state = state;
        this.storageSizeInGbs = storageSizeInGbs;
        this.subnetId = subnetId;
        this.systemVersion = systemVersion;
        this.timeCreated = timeCreated;
        this.timeZone = timeZone;
        this.vipIds = vipIds;
        this.zoneId = zoneId;
    }

    /**
     * @return The name of the availability domain that the cloud Exadata infrastructure resource is located in.
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     * 
     */
    public List<String> backupNetworkNsgIds() {
        return this.backupNetworkNsgIds;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the cloud VM cluster.
     * 
     */
    public String backupSubnetId() {
        return this.backupSubnetId;
    }
    /**
     * @return If provided, filters the results for the specified cloud Exadata infrastructure.
     * 
     */
    public String cloudExadataInfrastructureId() {
        return this.cloudExadataInfrastructureId;
    }
    /**
     * @return The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The number of CPU cores enabled on the cloud VM cluster.
     * 
     */
    public Integer cpuCoreCount() {
        return this.cpuCoreCount;
    }
    public Boolean createAsync() {
        return this.createAsync;
    }
    /**
     * @return The percentage assigned to DATA storage (user data and database files). The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent assigned to DATA storage. See [Storage Configuration](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaoverview.htm#Exadata) in the Exadata documentation for details on the impact of the configuration settings on storage.
     * 
     */
    public Integer dataStoragePercentage() {
        return this.dataStoragePercentage;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The type of redundancy configured for the cloud Vm cluster. NORMAL is 2-way redundancy. HIGH is 3-way redundancy.
     * 
     */
    public String diskRedundancy() {
        return this.diskRedundancy;
    }
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The domain name for the cloud VM cluster.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return A valid Oracle Grid Infrastructure (GI) software version.
     * 
     */
    public String giVersion() {
        return this.giVersion;
    }
    /**
     * @return The hostname for the cloud VM cluster.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud VM cluster.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetCloudVmClustersCloudVmClusterIormConfigCach> iormConfigCaches() {
        return this.iormConfigCaches;
    }
    /**
     * @return If true, database backup on local Exadata storage is configured for the cloud VM cluster. If false, database backup on local Exadata storage is not available in the cloud VM cluster.
     * 
     */
    public Boolean isLocalBackupEnabled() {
        return this.isLocalBackupEnabled;
    }
    /**
     * @return If true, sparse disk group is configured for the cloud VM cluster. If false, sparse disk group is not created.
     * 
     */
    public Boolean isSparseDiskgroupEnabled() {
        return this.isSparseDiskgroupEnabled;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance update history entry. This value is updated when a maintenance update starts.
     * 
     */
    public String lastUpdateHistoryEntryId() {
        return this.lastUpdateHistoryEntryId;
    }
    /**
     * @return The Oracle license model that applies to the cloud VM cluster. The default is LICENSE_INCLUDED.
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
    /**
     * @return The port number configured for the listener on the cloud VM cluster.
     * 
     */
    public String listenerPort() {
        return this.listenerPort;
    }
    /**
     * @return The number of nodes in the cloud VM cluster.
     * 
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }
    /**
     * @return A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds restrictions:**
     * * Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
     * 
     */
    public List<String> nsgIds() {
        return this.nsgIds;
    }
    /**
     * @return The number of OCPU cores to enable on the cloud VM cluster. Only 1 decimal place is allowed for the fractional part.
     * 
     */
    public Double ocpuCount() {
        return this.ocpuCount;
    }
    /**
     * @return The FQDN of the DNS record for the SCAN IP addresses that are associated with the cloud VM cluster.
     * 
     */
    public String scanDnsName() {
        return this.scanDnsName;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DNS record for the SCAN IP addresses that are associated with the cloud VM cluster.
     * 
     */
    public String scanDnsRecordId() {
        return this.scanDnsRecordId;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Single Client Access Name (SCAN) IP addresses associated with the cloud VM cluster. SCAN IP addresses are typically used for load balancing and are not assigned to any interface. Oracle Clusterware directs the requests to the appropriate nodes in the cluster.
     * 
     */
    public List<String> scanIpIds() {
        return this.scanIpIds;
    }
    /**
     * @return The TCP Single Client Access Name (SCAN) port. The default port is 1521.
     * 
     */
    public Integer scanListenerPortTcp() {
        return this.scanListenerPortTcp;
    }
    /**
     * @return The TCPS Single Client Access Name (SCAN) port. The default port is 2484.
     * 
     */
    public Integer scanListenerPortTcpSsl() {
        return this.scanListenerPortTcpSsl;
    }
    /**
     * @return The model name of the Exadata hardware running the cloud VM cluster.
     * 
     */
    public String shape() {
        return this.shape;
    }
    /**
     * @return The public key portion of one or more key pairs used for SSH access to the cloud VM cluster.
     * 
     */
    public List<String> sshPublicKeys() {
        return this.sshPublicKeys;
    }
    /**
     * @return A filter to return only cloud VM clusters that match the given lifecycle state exactly.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The storage allocation for the disk group, in gigabytes (GB).
     * 
     */
    public Integer storageSizeInGbs() {
        return this.storageSizeInGbs;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the cloud VM cluster.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return Operating system version of the image.
     * 
     */
    public String systemVersion() {
        return this.systemVersion;
    }
    /**
     * @return The date and time that the cloud VM cluster was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time zone of the cloud VM cluster. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/iaas/Content/Database/References/timezones.htm).
     * 
     */
    public String timeZone() {
        return this.timeZone;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the virtual IP (VIP) addresses associated with the cloud VM cluster. The Cluster Ready Services (CRS) creates and maintains one VIP address for each node in the Exadata Cloud Service instance to enable failover. If one node fails, the VIP is reassigned to another active node in the cluster.
     * 
     */
    public List<String> vipIds() {
        return this.vipIds;
    }
    /**
     * @return The OCID of the zone the cloud VM cluster is associated with.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudVmClustersCloudVmCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityDomain;
        private List<String> backupNetworkNsgIds;
        private String backupSubnetId;
        private String cloudExadataInfrastructureId;
        private String clusterName;
        private String compartmentId;
        private Integer cpuCoreCount;
        private Boolean createAsync;
        private Integer dataStoragePercentage;
        private Map<String,Object> definedTags;
        private String diskRedundancy;
        private String displayName;
        private String domain;
        private Map<String,Object> freeformTags;
        private String giVersion;
        private String hostname;
        private String id;
        private List<GetCloudVmClustersCloudVmClusterIormConfigCach> iormConfigCaches;
        private Boolean isLocalBackupEnabled;
        private Boolean isSparseDiskgroupEnabled;
        private String lastUpdateHistoryEntryId;
        private String licenseModel;
        private String lifecycleDetails;
        private String listenerPort;
        private Integer nodeCount;
        private List<String> nsgIds;
        private Double ocpuCount;
        private String scanDnsName;
        private String scanDnsRecordId;
        private List<String> scanIpIds;
        private Integer scanListenerPortTcp;
        private Integer scanListenerPortTcpSsl;
        private String shape;
        private List<String> sshPublicKeys;
        private String state;
        private Integer storageSizeInGbs;
        private String subnetId;
        private String systemVersion;
        private String timeCreated;
        private String timeZone;
        private List<String> vipIds;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudVmClustersCloudVmCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.backupNetworkNsgIds = defaults.backupNetworkNsgIds;
    	      this.backupSubnetId = defaults.backupSubnetId;
    	      this.cloudExadataInfrastructureId = defaults.cloudExadataInfrastructureId;
    	      this.clusterName = defaults.clusterName;
    	      this.compartmentId = defaults.compartmentId;
    	      this.cpuCoreCount = defaults.cpuCoreCount;
    	      this.createAsync = defaults.createAsync;
    	      this.dataStoragePercentage = defaults.dataStoragePercentage;
    	      this.definedTags = defaults.definedTags;
    	      this.diskRedundancy = defaults.diskRedundancy;
    	      this.displayName = defaults.displayName;
    	      this.domain = defaults.domain;
    	      this.freeformTags = defaults.freeformTags;
    	      this.giVersion = defaults.giVersion;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.iormConfigCaches = defaults.iormConfigCaches;
    	      this.isLocalBackupEnabled = defaults.isLocalBackupEnabled;
    	      this.isSparseDiskgroupEnabled = defaults.isSparseDiskgroupEnabled;
    	      this.lastUpdateHistoryEntryId = defaults.lastUpdateHistoryEntryId;
    	      this.licenseModel = defaults.licenseModel;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.listenerPort = defaults.listenerPort;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nsgIds = defaults.nsgIds;
    	      this.ocpuCount = defaults.ocpuCount;
    	      this.scanDnsName = defaults.scanDnsName;
    	      this.scanDnsRecordId = defaults.scanDnsRecordId;
    	      this.scanIpIds = defaults.scanIpIds;
    	      this.scanListenerPortTcp = defaults.scanListenerPortTcp;
    	      this.scanListenerPortTcpSsl = defaults.scanListenerPortTcpSsl;
    	      this.shape = defaults.shape;
    	      this.sshPublicKeys = defaults.sshPublicKeys;
    	      this.state = defaults.state;
    	      this.storageSizeInGbs = defaults.storageSizeInGbs;
    	      this.subnetId = defaults.subnetId;
    	      this.systemVersion = defaults.systemVersion;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeZone = defaults.timeZone;
    	      this.vipIds = defaults.vipIds;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder backupNetworkNsgIds(List<String> backupNetworkNsgIds) {
            this.backupNetworkNsgIds = Objects.requireNonNull(backupNetworkNsgIds);
            return this;
        }
        public Builder backupNetworkNsgIds(String... backupNetworkNsgIds) {
            return backupNetworkNsgIds(List.of(backupNetworkNsgIds));
        }
        public Builder backupSubnetId(String backupSubnetId) {
            this.backupSubnetId = Objects.requireNonNull(backupSubnetId);
            return this;
        }
        public Builder cloudExadataInfrastructureId(String cloudExadataInfrastructureId) {
            this.cloudExadataInfrastructureId = Objects.requireNonNull(cloudExadataInfrastructureId);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = Objects.requireNonNull(cpuCoreCount);
            return this;
        }
        public Builder createAsync(Boolean createAsync) {
            this.createAsync = Objects.requireNonNull(createAsync);
            return this;
        }
        public Builder dataStoragePercentage(Integer dataStoragePercentage) {
            this.dataStoragePercentage = Objects.requireNonNull(dataStoragePercentage);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder diskRedundancy(String diskRedundancy) {
            this.diskRedundancy = Objects.requireNonNull(diskRedundancy);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder giVersion(String giVersion) {
            this.giVersion = Objects.requireNonNull(giVersion);
            return this;
        }
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder iormConfigCaches(List<GetCloudVmClustersCloudVmClusterIormConfigCach> iormConfigCaches) {
            this.iormConfigCaches = Objects.requireNonNull(iormConfigCaches);
            return this;
        }
        public Builder iormConfigCaches(GetCloudVmClustersCloudVmClusterIormConfigCach... iormConfigCaches) {
            return iormConfigCaches(List.of(iormConfigCaches));
        }
        public Builder isLocalBackupEnabled(Boolean isLocalBackupEnabled) {
            this.isLocalBackupEnabled = Objects.requireNonNull(isLocalBackupEnabled);
            return this;
        }
        public Builder isSparseDiskgroupEnabled(Boolean isSparseDiskgroupEnabled) {
            this.isSparseDiskgroupEnabled = Objects.requireNonNull(isSparseDiskgroupEnabled);
            return this;
        }
        public Builder lastUpdateHistoryEntryId(String lastUpdateHistoryEntryId) {
            this.lastUpdateHistoryEntryId = Objects.requireNonNull(lastUpdateHistoryEntryId);
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
        public Builder listenerPort(String listenerPort) {
            this.listenerPort = Objects.requireNonNull(listenerPort);
            return this;
        }
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        public Builder nsgIds(List<String> nsgIds) {
            this.nsgIds = Objects.requireNonNull(nsgIds);
            return this;
        }
        public Builder nsgIds(String... nsgIds) {
            return nsgIds(List.of(nsgIds));
        }
        public Builder ocpuCount(Double ocpuCount) {
            this.ocpuCount = Objects.requireNonNull(ocpuCount);
            return this;
        }
        public Builder scanDnsName(String scanDnsName) {
            this.scanDnsName = Objects.requireNonNull(scanDnsName);
            return this;
        }
        public Builder scanDnsRecordId(String scanDnsRecordId) {
            this.scanDnsRecordId = Objects.requireNonNull(scanDnsRecordId);
            return this;
        }
        public Builder scanIpIds(List<String> scanIpIds) {
            this.scanIpIds = Objects.requireNonNull(scanIpIds);
            return this;
        }
        public Builder scanIpIds(String... scanIpIds) {
            return scanIpIds(List.of(scanIpIds));
        }
        public Builder scanListenerPortTcp(Integer scanListenerPortTcp) {
            this.scanListenerPortTcp = Objects.requireNonNull(scanListenerPortTcp);
            return this;
        }
        public Builder scanListenerPortTcpSsl(Integer scanListenerPortTcpSsl) {
            this.scanListenerPortTcpSsl = Objects.requireNonNull(scanListenerPortTcpSsl);
            return this;
        }
        public Builder shape(String shape) {
            this.shape = Objects.requireNonNull(shape);
            return this;
        }
        public Builder sshPublicKeys(List<String> sshPublicKeys) {
            this.sshPublicKeys = Objects.requireNonNull(sshPublicKeys);
            return this;
        }
        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder storageSizeInGbs(Integer storageSizeInGbs) {
            this.storageSizeInGbs = Objects.requireNonNull(storageSizeInGbs);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder systemVersion(String systemVersion) {
            this.systemVersion = Objects.requireNonNull(systemVersion);
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
        public Builder vipIds(List<String> vipIds) {
            this.vipIds = Objects.requireNonNull(vipIds);
            return this;
        }
        public Builder vipIds(String... vipIds) {
            return vipIds(List.of(vipIds));
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetCloudVmClustersCloudVmCluster build() {
            return new GetCloudVmClustersCloudVmCluster(availabilityDomain, backupNetworkNsgIds, backupSubnetId, cloudExadataInfrastructureId, clusterName, compartmentId, cpuCoreCount, createAsync, dataStoragePercentage, definedTags, diskRedundancy, displayName, domain, freeformTags, giVersion, hostname, id, iormConfigCaches, isLocalBackupEnabled, isSparseDiskgroupEnabled, lastUpdateHistoryEntryId, licenseModel, lifecycleDetails, listenerPort, nodeCount, nsgIds, ocpuCount, scanDnsName, scanDnsRecordId, scanIpIds, scanListenerPortTcp, scanListenerPortTcpSsl, shape, sshPublicKeys, state, storageSizeInGbs, subnetId, systemVersion, timeCreated, timeZone, vipIds, zoneId);
        }
    }
}
