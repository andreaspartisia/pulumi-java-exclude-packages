// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.inputs;

import com.pulumi.azure.netapp.inputs.VolumeDataProtectionReplicationArgs;
import com.pulumi.azure.netapp.inputs.VolumeDataProtectionSnapshotPolicyArgs;
import com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeState extends com.pulumi.resources.ResourceArgs {

    public static final VolumeState Empty = new VolumeState();

    /**
     * The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * Creates volume from snapshot. Following properties must be the same as the original volume where the snapshot was taken from: `protocols`, `subnet_id`, `location`, `service_level`, `resource_group_name`, `account_name` and `pool_name`.
     * 
     */
    @Import(name="createFromSnapshotResourceId")
    private @Nullable Output<String> createFromSnapshotResourceId;

    /**
     * @return Creates volume from snapshot. Following properties must be the same as the original volume where the snapshot was taken from: `protocols`, `subnet_id`, `location`, `service_level`, `resource_group_name`, `account_name` and `pool_name`.
     * 
     */
    public Optional<Output<String>> createFromSnapshotResourceId() {
        return Optional.ofNullable(this.createFromSnapshotResourceId);
    }

    /**
     * A `data_protection_replication` block as defined below.
     * 
     */
    @Import(name="dataProtectionReplication")
    private @Nullable Output<VolumeDataProtectionReplicationArgs> dataProtectionReplication;

    /**
     * @return A `data_protection_replication` block as defined below.
     * 
     */
    public Optional<Output<VolumeDataProtectionReplicationArgs>> dataProtectionReplication() {
        return Optional.ofNullable(this.dataProtectionReplication);
    }

    /**
     * A `data_protection_snapshot_policy` block as defined below.
     * 
     */
    @Import(name="dataProtectionSnapshotPolicy")
    private @Nullable Output<VolumeDataProtectionSnapshotPolicyArgs> dataProtectionSnapshotPolicy;

    /**
     * @return A `data_protection_snapshot_policy` block as defined below.
     * 
     */
    public Optional<Output<VolumeDataProtectionSnapshotPolicyArgs>> dataProtectionSnapshotPolicy() {
        return Optional.ofNullable(this.dataProtectionSnapshotPolicy);
    }

    /**
     * One or more `export_policy_rule` block defined below.
     * 
     */
    @Import(name="exportPolicyRules")
    private @Nullable Output<List<VolumeExportPolicyRuleArgs>> exportPolicyRules;

    /**
     * @return One or more `export_policy_rule` block defined below.
     * 
     */
    public Optional<Output<List<VolumeExportPolicyRuleArgs>>> exportPolicyRules() {
        return Optional.ofNullable(this.exportPolicyRules);
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
     * A list of IPv4 Addresses which should be used to mount the volume.
     * 
     */
    @Import(name="mountIpAddresses")
    private @Nullable Output<List<String>> mountIpAddresses;

    /**
     * @return A list of IPv4 Addresses which should be used to mount the volume.
     * 
     */
    public Optional<Output<List<String>>> mountIpAddresses() {
        return Optional.ofNullable(this.mountIpAddresses);
    }

    /**
     * The name of the NetApp Volume. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the NetApp Volume. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="poolName")
    private @Nullable Output<String> poolName;

    /**
     * @return The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> poolName() {
        return Optional.ofNullable(this.poolName);
    }

    /**
     * The target volume protocol expressed as a list. Supported single value include `CIFS`, `NFSv3`, or `NFSv4.1`. If argument is not defined it will default to `NFSv3`. Changing this forces a new resource to be created and data will be lost. Dual protocol scenario is supported for CIFS and NFSv3, for more information, please refer to [Create a dual-protocol volume for Azure NetApp Files](https://docs.microsoft.com/en-us/azure/azure-netapp-files/create-volumes-dual-protocol) document.
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<String>> protocols;

    /**
     * @return The target volume protocol expressed as a list. Supported single value include `CIFS`, `NFSv3`, or `NFSv4.1`. If argument is not defined it will default to `NFSv3`. Changing this forces a new resource to be created and data will be lost. Dual protocol scenario is supported for CIFS and NFSv3, for more information, please refer to [Create a dual-protocol volume for Azure NetApp Files](https://docs.microsoft.com/en-us/azure/azure-netapp-files/create-volumes-dual-protocol) document.
     * 
     */
    public Optional<Output<List<String>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * The name of the resource group where the NetApp Volume should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the NetApp Volume should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * Volume security style, accepted values are `Unix` or `Ntfs`. If not provided, single-protocol volume is created defaulting to `Unix` if it is `NFSv3` or `NFSv4.1` volume, if `CIFS`, it will default to `Ntfs`. In a dual-protocol volume, if not provided, its value will be `Ntfs`.
     * 
     */
    @Import(name="securityStyle")
    private @Nullable Output<String> securityStyle;

    /**
     * @return Volume security style, accepted values are `Unix` or `Ntfs`. If not provided, single-protocol volume is created defaulting to `Unix` if it is `NFSv3` or `NFSv4.1` volume, if `CIFS`, it will default to `Ntfs`. In a dual-protocol volume, if not provided, its value will be `Ntfs`.
     * 
     */
    public Optional<Output<String>> securityStyle() {
        return Optional.ofNullable(this.securityStyle);
    }

    /**
     * The target performance of the file system. Valid values include `Premium`, `Standard`, or `Ultra`.
     * 
     */
    @Import(name="serviceLevel")
    private @Nullable Output<String> serviceLevel;

    /**
     * @return The target performance of the file system. Valid values include `Premium`, `Standard`, or `Ultra`.
     * 
     */
    public Optional<Output<String>> serviceLevel() {
        return Optional.ofNullable(this.serviceLevel);
    }

    /**
     * Specifies whether the .snapshot (NFS clients) or ~snapshot (SMB clients) path of a volume is visible, default value is true.
     * 
     */
    @Import(name="snapshotDirectoryVisible")
    private @Nullable Output<Boolean> snapshotDirectoryVisible;

    /**
     * @return Specifies whether the .snapshot (NFS clients) or ~snapshot (SMB clients) path of a volume is visible, default value is true.
     * 
     */
    public Optional<Output<Boolean>> snapshotDirectoryVisible() {
        return Optional.ofNullable(this.snapshotDirectoryVisible);
    }

    /**
     * The maximum Storage Quota allowed for a file system in Gigabytes.
     * 
     */
    @Import(name="storageQuotaInGb")
    private @Nullable Output<Integer> storageQuotaInGb;

    /**
     * @return The maximum Storage Quota allowed for a file system in Gigabytes.
     * 
     */
    public Optional<Output<Integer>> storageQuotaInGb() {
        return Optional.ofNullable(this.storageQuotaInGb);
    }

    /**
     * The ID of the Subnet the NetApp Volume resides in, which must have the `Microsoft.NetApp/volumes` delegation. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet the NetApp Volume resides in, which must have the `Microsoft.NetApp/volumes` delegation. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
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
     * Throughput of this volume in Mibps.
     * 
     */
    @Import(name="throughputInMibps")
    private @Nullable Output<Double> throughputInMibps;

    /**
     * @return Throughput of this volume in Mibps.
     * 
     */
    public Optional<Output<Double>> throughputInMibps() {
        return Optional.ofNullable(this.throughputInMibps);
    }

    /**
     * A unique file path for the volume. Used when creating mount targets. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="volumePath")
    private @Nullable Output<String> volumePath;

    /**
     * @return A unique file path for the volume. Used when creating mount targets. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> volumePath() {
        return Optional.ofNullable(this.volumePath);
    }

    private VolumeState() {}

    private VolumeState(VolumeState $) {
        this.accountName = $.accountName;
        this.createFromSnapshotResourceId = $.createFromSnapshotResourceId;
        this.dataProtectionReplication = $.dataProtectionReplication;
        this.dataProtectionSnapshotPolicy = $.dataProtectionSnapshotPolicy;
        this.exportPolicyRules = $.exportPolicyRules;
        this.location = $.location;
        this.mountIpAddresses = $.mountIpAddresses;
        this.name = $.name;
        this.poolName = $.poolName;
        this.protocols = $.protocols;
        this.resourceGroupName = $.resourceGroupName;
        this.securityStyle = $.securityStyle;
        this.serviceLevel = $.serviceLevel;
        this.snapshotDirectoryVisible = $.snapshotDirectoryVisible;
        this.storageQuotaInGb = $.storageQuotaInGb;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.throughputInMibps = $.throughputInMibps;
        this.volumePath = $.volumePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeState $;

        public Builder() {
            $ = new VolumeState();
        }

        public Builder(VolumeState defaults) {
            $ = new VolumeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param createFromSnapshotResourceId Creates volume from snapshot. Following properties must be the same as the original volume where the snapshot was taken from: `protocols`, `subnet_id`, `location`, `service_level`, `resource_group_name`, `account_name` and `pool_name`.
         * 
         * @return builder
         * 
         */
        public Builder createFromSnapshotResourceId(@Nullable Output<String> createFromSnapshotResourceId) {
            $.createFromSnapshotResourceId = createFromSnapshotResourceId;
            return this;
        }

        /**
         * @param createFromSnapshotResourceId Creates volume from snapshot. Following properties must be the same as the original volume where the snapshot was taken from: `protocols`, `subnet_id`, `location`, `service_level`, `resource_group_name`, `account_name` and `pool_name`.
         * 
         * @return builder
         * 
         */
        public Builder createFromSnapshotResourceId(String createFromSnapshotResourceId) {
            return createFromSnapshotResourceId(Output.of(createFromSnapshotResourceId));
        }

        /**
         * @param dataProtectionReplication A `data_protection_replication` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dataProtectionReplication(@Nullable Output<VolumeDataProtectionReplicationArgs> dataProtectionReplication) {
            $.dataProtectionReplication = dataProtectionReplication;
            return this;
        }

        /**
         * @param dataProtectionReplication A `data_protection_replication` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dataProtectionReplication(VolumeDataProtectionReplicationArgs dataProtectionReplication) {
            return dataProtectionReplication(Output.of(dataProtectionReplication));
        }

        /**
         * @param dataProtectionSnapshotPolicy A `data_protection_snapshot_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dataProtectionSnapshotPolicy(@Nullable Output<VolumeDataProtectionSnapshotPolicyArgs> dataProtectionSnapshotPolicy) {
            $.dataProtectionSnapshotPolicy = dataProtectionSnapshotPolicy;
            return this;
        }

        /**
         * @param dataProtectionSnapshotPolicy A `data_protection_snapshot_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dataProtectionSnapshotPolicy(VolumeDataProtectionSnapshotPolicyArgs dataProtectionSnapshotPolicy) {
            return dataProtectionSnapshotPolicy(Output.of(dataProtectionSnapshotPolicy));
        }

        /**
         * @param exportPolicyRules One or more `export_policy_rule` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder exportPolicyRules(@Nullable Output<List<VolumeExportPolicyRuleArgs>> exportPolicyRules) {
            $.exportPolicyRules = exportPolicyRules;
            return this;
        }

        /**
         * @param exportPolicyRules One or more `export_policy_rule` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder exportPolicyRules(List<VolumeExportPolicyRuleArgs> exportPolicyRules) {
            return exportPolicyRules(Output.of(exportPolicyRules));
        }

        /**
         * @param exportPolicyRules One or more `export_policy_rule` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder exportPolicyRules(VolumeExportPolicyRuleArgs... exportPolicyRules) {
            return exportPolicyRules(List.of(exportPolicyRules));
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
         * @param mountIpAddresses A list of IPv4 Addresses which should be used to mount the volume.
         * 
         * @return builder
         * 
         */
        public Builder mountIpAddresses(@Nullable Output<List<String>> mountIpAddresses) {
            $.mountIpAddresses = mountIpAddresses;
            return this;
        }

        /**
         * @param mountIpAddresses A list of IPv4 Addresses which should be used to mount the volume.
         * 
         * @return builder
         * 
         */
        public Builder mountIpAddresses(List<String> mountIpAddresses) {
            return mountIpAddresses(Output.of(mountIpAddresses));
        }

        /**
         * @param mountIpAddresses A list of IPv4 Addresses which should be used to mount the volume.
         * 
         * @return builder
         * 
         */
        public Builder mountIpAddresses(String... mountIpAddresses) {
            return mountIpAddresses(List.of(mountIpAddresses));
        }

        /**
         * @param name The name of the NetApp Volume. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the NetApp Volume. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param poolName The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder poolName(@Nullable Output<String> poolName) {
            $.poolName = poolName;
            return this;
        }

        /**
         * @param poolName The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder poolName(String poolName) {
            return poolName(Output.of(poolName));
        }

        /**
         * @param protocols The target volume protocol expressed as a list. Supported single value include `CIFS`, `NFSv3`, or `NFSv4.1`. If argument is not defined it will default to `NFSv3`. Changing this forces a new resource to be created and data will be lost. Dual protocol scenario is supported for CIFS and NFSv3, for more information, please refer to [Create a dual-protocol volume for Azure NetApp Files](https://docs.microsoft.com/en-us/azure/azure-netapp-files/create-volumes-dual-protocol) document.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable Output<List<String>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols The target volume protocol expressed as a list. Supported single value include `CIFS`, `NFSv3`, or `NFSv4.1`. If argument is not defined it will default to `NFSv3`. Changing this forces a new resource to be created and data will be lost. Dual protocol scenario is supported for CIFS and NFSv3, for more information, please refer to [Create a dual-protocol volume for Azure NetApp Files](https://docs.microsoft.com/en-us/azure/azure-netapp-files/create-volumes-dual-protocol) document.
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<String> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols The target volume protocol expressed as a list. Supported single value include `CIFS`, `NFSv3`, or `NFSv4.1`. If argument is not defined it will default to `NFSv3`. Changing this forces a new resource to be created and data will be lost. Dual protocol scenario is supported for CIFS and NFSv3, for more information, please refer to [Create a dual-protocol volume for Azure NetApp Files](https://docs.microsoft.com/en-us/azure/azure-netapp-files/create-volumes-dual-protocol) document.
         * 
         * @return builder
         * 
         */
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        /**
         * @param resourceGroupName The name of the resource group where the NetApp Volume should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the NetApp Volume should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param securityStyle Volume security style, accepted values are `Unix` or `Ntfs`. If not provided, single-protocol volume is created defaulting to `Unix` if it is `NFSv3` or `NFSv4.1` volume, if `CIFS`, it will default to `Ntfs`. In a dual-protocol volume, if not provided, its value will be `Ntfs`.
         * 
         * @return builder
         * 
         */
        public Builder securityStyle(@Nullable Output<String> securityStyle) {
            $.securityStyle = securityStyle;
            return this;
        }

        /**
         * @param securityStyle Volume security style, accepted values are `Unix` or `Ntfs`. If not provided, single-protocol volume is created defaulting to `Unix` if it is `NFSv3` or `NFSv4.1` volume, if `CIFS`, it will default to `Ntfs`. In a dual-protocol volume, if not provided, its value will be `Ntfs`.
         * 
         * @return builder
         * 
         */
        public Builder securityStyle(String securityStyle) {
            return securityStyle(Output.of(securityStyle));
        }

        /**
         * @param serviceLevel The target performance of the file system. Valid values include `Premium`, `Standard`, or `Ultra`.
         * 
         * @return builder
         * 
         */
        public Builder serviceLevel(@Nullable Output<String> serviceLevel) {
            $.serviceLevel = serviceLevel;
            return this;
        }

        /**
         * @param serviceLevel The target performance of the file system. Valid values include `Premium`, `Standard`, or `Ultra`.
         * 
         * @return builder
         * 
         */
        public Builder serviceLevel(String serviceLevel) {
            return serviceLevel(Output.of(serviceLevel));
        }

        /**
         * @param snapshotDirectoryVisible Specifies whether the .snapshot (NFS clients) or ~snapshot (SMB clients) path of a volume is visible, default value is true.
         * 
         * @return builder
         * 
         */
        public Builder snapshotDirectoryVisible(@Nullable Output<Boolean> snapshotDirectoryVisible) {
            $.snapshotDirectoryVisible = snapshotDirectoryVisible;
            return this;
        }

        /**
         * @param snapshotDirectoryVisible Specifies whether the .snapshot (NFS clients) or ~snapshot (SMB clients) path of a volume is visible, default value is true.
         * 
         * @return builder
         * 
         */
        public Builder snapshotDirectoryVisible(Boolean snapshotDirectoryVisible) {
            return snapshotDirectoryVisible(Output.of(snapshotDirectoryVisible));
        }

        /**
         * @param storageQuotaInGb The maximum Storage Quota allowed for a file system in Gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder storageQuotaInGb(@Nullable Output<Integer> storageQuotaInGb) {
            $.storageQuotaInGb = storageQuotaInGb;
            return this;
        }

        /**
         * @param storageQuotaInGb The maximum Storage Quota allowed for a file system in Gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder storageQuotaInGb(Integer storageQuotaInGb) {
            return storageQuotaInGb(Output.of(storageQuotaInGb));
        }

        /**
         * @param subnetId The ID of the Subnet the NetApp Volume resides in, which must have the `Microsoft.NetApp/volumes` delegation. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet the NetApp Volume resides in, which must have the `Microsoft.NetApp/volumes` delegation. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
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
         * @param throughputInMibps Throughput of this volume in Mibps.
         * 
         * @return builder
         * 
         */
        public Builder throughputInMibps(@Nullable Output<Double> throughputInMibps) {
            $.throughputInMibps = throughputInMibps;
            return this;
        }

        /**
         * @param throughputInMibps Throughput of this volume in Mibps.
         * 
         * @return builder
         * 
         */
        public Builder throughputInMibps(Double throughputInMibps) {
            return throughputInMibps(Output.of(throughputInMibps));
        }

        /**
         * @param volumePath A unique file path for the volume. Used when creating mount targets. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder volumePath(@Nullable Output<String> volumePath) {
            $.volumePath = volumePath;
            return this;
        }

        /**
         * @param volumePath A unique file path for the volume. Used when creating mount targets. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder volumePath(String volumePath) {
            return volumePath(Output.of(volumePath));
        }

        public VolumeState build() {
            return $;
        }
    }

}
