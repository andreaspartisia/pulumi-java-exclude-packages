// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.notebooks.inputs.InstanceAcceleratorConfigGetArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceContainerImageGetArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceReservationAffinityGetArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceShieldedInstanceConfigGetArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceVmImageGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The hardware accelerator used on this instance. If you use accelerators,
     * make sure that your configuration has enough vCPUs and memory to support the
     * machineType you have selected.
     * Structure is documented below.
     * 
     */
    @InputImport(name="acceleratorConfig")
    private final @Nullable Input<InstanceAcceleratorConfigGetArgs> acceleratorConfig;

    public Input<InstanceAcceleratorConfigGetArgs> getAcceleratorConfig() {
        return this.acceleratorConfig == null ? Input.empty() : this.acceleratorConfig;
    }

    /**
     * The size of the boot disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB.
     * If not specified, this defaults to 100.
     * 
     */
    @InputImport(name="bootDiskSizeGb")
    private final @Nullable Input<Integer> bootDiskSizeGb;

    public Input<Integer> getBootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Input.empty() : this.bootDiskSizeGb;
    }

    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @InputImport(name="bootDiskType")
    private final @Nullable Input<String> bootDiskType;

    public Input<String> getBootDiskType() {
        return this.bootDiskType == null ? Input.empty() : this.bootDiskType;
    }

    /**
     * Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="containerImage")
    private final @Nullable Input<InstanceContainerImageGetArgs> containerImage;

    public Input<InstanceContainerImageGetArgs> getContainerImage() {
        return this.containerImage == null ? Input.empty() : this.containerImage;
    }

    /**
     * Instance creation time
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    @InputImport(name="customGpuDriverPath")
    private final @Nullable Input<String> customGpuDriverPath;

    public Input<String> getCustomGpuDriverPath() {
        return this.customGpuDriverPath == null ? Input.empty() : this.customGpuDriverPath;
    }

    /**
     * The size of the data disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB).
     * You can choose the size of the data disk based on how big your notebooks and data are.
     * If not specified, this defaults to 100.
     * 
     */
    @InputImport(name="dataDiskSizeGb")
    private final @Nullable Input<Integer> dataDiskSizeGb;

    public Input<Integer> getDataDiskSizeGb() {
        return this.dataDiskSizeGb == null ? Input.empty() : this.dataDiskSizeGb;
    }

    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @InputImport(name="dataDiskType")
    private final @Nullable Input<String> dataDiskType;

    public Input<String> getDataDiskType() {
        return this.dataDiskType == null ? Input.empty() : this.dataDiskType;
    }

    /**
     * Disk encryption method used on the boot and data disks, defaults to GMEK.
     * Possible values are `DISK_ENCRYPTION_UNSPECIFIED`, `GMEK`, and `CMEK`.
     * 
     */
    @InputImport(name="diskEncryption")
    private final @Nullable Input<String> diskEncryption;

    public Input<String> getDiskEncryption() {
        return this.diskEncryption == null ? Input.empty() : this.diskEncryption;
    }

    /**
     * Whether the end user authorizes Google Cloud to install GPU driver
     * on this instance. If this field is empty or set to false, the GPU driver
     * won't be installed. Only applicable to instances with GPUs.
     * 
     */
    @InputImport(name="installGpuDriver")
    private final @Nullable Input<Boolean> installGpuDriver;

    public Input<Boolean> getInstallGpuDriver() {
        return this.installGpuDriver == null ? Input.empty() : this.installGpuDriver;
    }

    /**
     * The list of owners of this instance after creation.
     * Format: alias@example.com.
     * Currently supports one owner only.
     * If not specified, all of the service account users of
     * your VM instance's service account can use the instance.
     * 
     */
    @InputImport(name="instanceOwners")
    private final @Nullable Input<List<String>> instanceOwners;

    public Input<List<String>> getInstanceOwners() {
        return this.instanceOwners == null ? Input.empty() : this.instanceOwners;
    }

    /**
     * The KMS key used to encrypt the disks, only applicable if diskEncryption is CMEK.
     * Format: projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}
     * 
     */
    @InputImport(name="kmsKey")
    private final @Nullable Input<String> kmsKey;

    public Input<String> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
    }

    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * A reference to a machine type which defines VM kind.
     * 
     */
    @InputImport(name="machineType")
    private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * Custom metadata to apply to this instance.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The name specified for the Notebook instance.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the VPC that this instance is in.
     * Format: projects/{project_id}/global/networks/{network_id}
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * The type of vNIC driver.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    @InputImport(name="nicType")
    private final @Nullable Input<String> nicType;

    public Input<String> getNicType() {
        return this.nicType == null ? Input.empty() : this.nicType;
    }

    /**
     * The notebook instance will not register with the proxy..
     * 
     */
    @InputImport(name="noProxyAccess")
    private final @Nullable Input<Boolean> noProxyAccess;

    public Input<Boolean> getNoProxyAccess() {
        return this.noProxyAccess == null ? Input.empty() : this.noProxyAccess;
    }

    /**
     * No public IP will be assigned to this instance.
     * 
     */
    @InputImport(name="noPublicIp")
    private final @Nullable Input<Boolean> noPublicIp;

    public Input<Boolean> getNoPublicIp() {
        return this.noPublicIp == null ? Input.empty() : this.noPublicIp;
    }

    /**
     * If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    @InputImport(name="noRemoveDataDisk")
    private final @Nullable Input<Boolean> noRemoveDataDisk;

    public Input<Boolean> getNoRemoveDataDisk() {
        return this.noRemoveDataDisk == null ? Input.empty() : this.noRemoveDataDisk;
    }

    /**
     * Path to a Bash script that automatically runs after a
     * notebook instance fully boots up. The path must be a URL
     * or Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    @InputImport(name="postStartupScript")
    private final @Nullable Input<String> postStartupScript;

    public Input<String> getPostStartupScript() {
        return this.postStartupScript == null ? Input.empty() : this.postStartupScript;
    }

    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    @InputImport(name="proxyUri")
    private final @Nullable Input<String> proxyUri;

    public Input<String> getProxyUri() {
        return this.proxyUri == null ? Input.empty() : this.proxyUri;
    }

    /**
     * Reservation Affinity for consuming Zonal reservation.
     * Structure is documented below.
     * 
     */
    @InputImport(name="reservationAffinity")
    private final @Nullable Input<InstanceReservationAffinityGetArgs> reservationAffinity;

    public Input<InstanceReservationAffinityGetArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Input.empty() : this.reservationAffinity;
    }

    /**
     * The service account on this instance, giving access to other
     * Google Cloud services. You can use any service account within
     * the same project, but you must have the service account user
     * permission to use the instance. If not specified,
     * the Compute Engine default service account is used.
     * 
     */
    @InputImport(name="serviceAccount")
    private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances.
     * If not specified, the following scopes are defined:
     * - https://www.googleapis.com/auth/cloud-platform
     * - https://www.googleapis.com/auth/userinfo.email
     * 
     */
    @InputImport(name="serviceAccountScopes")
    private final @Nullable Input<List<String>> serviceAccountScopes;

    public Input<List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? Input.empty() : this.serviceAccountScopes;
    }

    /**
     * A set of Shielded Instance options. Check [Images using supported Shielded VM features]
     * Not all combinations are valid
     * Structure is documented below.
     * 
     */
    @InputImport(name="shieldedInstanceConfig")
    private final @Nullable Input<InstanceShieldedInstanceConfigGetArgs> shieldedInstanceConfig;

    public Input<InstanceShieldedInstanceConfigGetArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Input.empty() : this.shieldedInstanceConfig;
    }

    /**
     * The state of this instance.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * The name of the subnet that this instance is in.
     * Format: projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}
     * 
     */
    @InputImport(name="subnet")
    private final @Nullable Input<String> subnet;

    public Input<String> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    /**
     * The Compute Engine tags to add to instance.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Instance update time.
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="vmImage")
    private final @Nullable Input<InstanceVmImageGetArgs> vmImage;

    public Input<InstanceVmImageGetArgs> getVmImage() {
        return this.vmImage == null ? Input.empty() : this.vmImage;
    }

    public InstanceState(
        @Nullable Input<InstanceAcceleratorConfigGetArgs> acceleratorConfig,
        @Nullable Input<Integer> bootDiskSizeGb,
        @Nullable Input<String> bootDiskType,
        @Nullable Input<InstanceContainerImageGetArgs> containerImage,
        @Nullable Input<String> createTime,
        @Nullable Input<String> customGpuDriverPath,
        @Nullable Input<Integer> dataDiskSizeGb,
        @Nullable Input<String> dataDiskType,
        @Nullable Input<String> diskEncryption,
        @Nullable Input<Boolean> installGpuDriver,
        @Nullable Input<List<String>> instanceOwners,
        @Nullable Input<String> kmsKey,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> machineType,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> nicType,
        @Nullable Input<Boolean> noProxyAccess,
        @Nullable Input<Boolean> noPublicIp,
        @Nullable Input<Boolean> noRemoveDataDisk,
        @Nullable Input<String> postStartupScript,
        @Nullable Input<String> project,
        @Nullable Input<String> proxyUri,
        @Nullable Input<InstanceReservationAffinityGetArgs> reservationAffinity,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<List<String>> serviceAccountScopes,
        @Nullable Input<InstanceShieldedInstanceConfigGetArgs> shieldedInstanceConfig,
        @Nullable Input<String> state,
        @Nullable Input<String> subnet,
        @Nullable Input<List<String>> tags,
        @Nullable Input<String> updateTime,
        @Nullable Input<InstanceVmImageGetArgs> vmImage) {
        this.acceleratorConfig = acceleratorConfig;
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.customGpuDriverPath = customGpuDriverPath;
        this.dataDiskSizeGb = dataDiskSizeGb;
        this.dataDiskType = dataDiskType;
        this.diskEncryption = diskEncryption;
        this.installGpuDriver = installGpuDriver;
        this.instanceOwners = instanceOwners;
        this.kmsKey = kmsKey;
        this.labels = labels;
        this.location = location;
        this.machineType = machineType;
        this.metadata = metadata;
        this.name = name;
        this.network = network;
        this.nicType = nicType;
        this.noProxyAccess = noProxyAccess;
        this.noPublicIp = noPublicIp;
        this.noRemoveDataDisk = noRemoveDataDisk;
        this.postStartupScript = postStartupScript;
        this.project = project;
        this.proxyUri = proxyUri;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.state = state;
        this.subnet = subnet;
        this.tags = tags;
        this.updateTime = updateTime;
        this.vmImage = vmImage;
    }

    private InstanceState() {
        this.acceleratorConfig = Input.empty();
        this.bootDiskSizeGb = Input.empty();
        this.bootDiskType = Input.empty();
        this.containerImage = Input.empty();
        this.createTime = Input.empty();
        this.customGpuDriverPath = Input.empty();
        this.dataDiskSizeGb = Input.empty();
        this.dataDiskType = Input.empty();
        this.diskEncryption = Input.empty();
        this.installGpuDriver = Input.empty();
        this.instanceOwners = Input.empty();
        this.kmsKey = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.machineType = Input.empty();
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.nicType = Input.empty();
        this.noProxyAccess = Input.empty();
        this.noPublicIp = Input.empty();
        this.noRemoveDataDisk = Input.empty();
        this.postStartupScript = Input.empty();
        this.project = Input.empty();
        this.proxyUri = Input.empty();
        this.reservationAffinity = Input.empty();
        this.serviceAccount = Input.empty();
        this.serviceAccountScopes = Input.empty();
        this.shieldedInstanceConfig = Input.empty();
        this.state = Input.empty();
        this.subnet = Input.empty();
        this.tags = Input.empty();
        this.updateTime = Input.empty();
        this.vmImage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceAcceleratorConfigGetArgs> acceleratorConfig;
        private @Nullable Input<Integer> bootDiskSizeGb;
        private @Nullable Input<String> bootDiskType;
        private @Nullable Input<InstanceContainerImageGetArgs> containerImage;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> customGpuDriverPath;
        private @Nullable Input<Integer> dataDiskSizeGb;
        private @Nullable Input<String> dataDiskType;
        private @Nullable Input<String> diskEncryption;
        private @Nullable Input<Boolean> installGpuDriver;
        private @Nullable Input<List<String>> instanceOwners;
        private @Nullable Input<String> kmsKey;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> machineType;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> nicType;
        private @Nullable Input<Boolean> noProxyAccess;
        private @Nullable Input<Boolean> noPublicIp;
        private @Nullable Input<Boolean> noRemoveDataDisk;
        private @Nullable Input<String> postStartupScript;
        private @Nullable Input<String> project;
        private @Nullable Input<String> proxyUri;
        private @Nullable Input<InstanceReservationAffinityGetArgs> reservationAffinity;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<List<String>> serviceAccountScopes;
        private @Nullable Input<InstanceShieldedInstanceConfigGetArgs> shieldedInstanceConfig;
        private @Nullable Input<String> state;
        private @Nullable Input<String> subnet;
        private @Nullable Input<List<String>> tags;
        private @Nullable Input<String> updateTime;
        private @Nullable Input<InstanceVmImageGetArgs> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.diskEncryption = defaults.diskEncryption;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.instanceOwners = defaults.instanceOwners;
    	      this.kmsKey = defaults.kmsKey;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.noProxyAccess = defaults.noProxyAccess;
    	      this.noPublicIp = defaults.noPublicIp;
    	      this.noRemoveDataDisk = defaults.noRemoveDataDisk;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.project = defaults.project;
    	      this.proxyUri = defaults.proxyUri;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.state = defaults.state;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.updateTime = defaults.updateTime;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder setAcceleratorConfig(@Nullable Input<InstanceAcceleratorConfigGetArgs> acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }

        public Builder setAcceleratorConfig(@Nullable InstanceAcceleratorConfigGetArgs acceleratorConfig) {
            this.acceleratorConfig = Input.ofNullable(acceleratorConfig);
            return this;
        }

        public Builder setBootDiskSizeGb(@Nullable Input<Integer> bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        public Builder setBootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Input.ofNullable(bootDiskSizeGb);
            return this;
        }

        public Builder setBootDiskType(@Nullable Input<String> bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }

        public Builder setBootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = Input.ofNullable(bootDiskType);
            return this;
        }

        public Builder setContainerImage(@Nullable Input<InstanceContainerImageGetArgs> containerImage) {
            this.containerImage = containerImage;
            return this;
        }

        public Builder setContainerImage(@Nullable InstanceContainerImageGetArgs containerImage) {
            this.containerImage = Input.ofNullable(containerImage);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setCustomGpuDriverPath(@Nullable Input<String> customGpuDriverPath) {
            this.customGpuDriverPath = customGpuDriverPath;
            return this;
        }

        public Builder setCustomGpuDriverPath(@Nullable String customGpuDriverPath) {
            this.customGpuDriverPath = Input.ofNullable(customGpuDriverPath);
            return this;
        }

        public Builder setDataDiskSizeGb(@Nullable Input<Integer> dataDiskSizeGb) {
            this.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        public Builder setDataDiskSizeGb(@Nullable Integer dataDiskSizeGb) {
            this.dataDiskSizeGb = Input.ofNullable(dataDiskSizeGb);
            return this;
        }

        public Builder setDataDiskType(@Nullable Input<String> dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }

        public Builder setDataDiskType(@Nullable String dataDiskType) {
            this.dataDiskType = Input.ofNullable(dataDiskType);
            return this;
        }

        public Builder setDiskEncryption(@Nullable Input<String> diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }

        public Builder setDiskEncryption(@Nullable String diskEncryption) {
            this.diskEncryption = Input.ofNullable(diskEncryption);
            return this;
        }

        public Builder setInstallGpuDriver(@Nullable Input<Boolean> installGpuDriver) {
            this.installGpuDriver = installGpuDriver;
            return this;
        }

        public Builder setInstallGpuDriver(@Nullable Boolean installGpuDriver) {
            this.installGpuDriver = Input.ofNullable(installGpuDriver);
            return this;
        }

        public Builder setInstanceOwners(@Nullable Input<List<String>> instanceOwners) {
            this.instanceOwners = instanceOwners;
            return this;
        }

        public Builder setInstanceOwners(@Nullable List<String> instanceOwners) {
            this.instanceOwners = Input.ofNullable(instanceOwners);
            return this;
        }

        public Builder setKmsKey(@Nullable Input<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder setKmsKey(@Nullable String kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNicType(@Nullable Input<String> nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder setNicType(@Nullable String nicType) {
            this.nicType = Input.ofNullable(nicType);
            return this;
        }

        public Builder setNoProxyAccess(@Nullable Input<Boolean> noProxyAccess) {
            this.noProxyAccess = noProxyAccess;
            return this;
        }

        public Builder setNoProxyAccess(@Nullable Boolean noProxyAccess) {
            this.noProxyAccess = Input.ofNullable(noProxyAccess);
            return this;
        }

        public Builder setNoPublicIp(@Nullable Input<Boolean> noPublicIp) {
            this.noPublicIp = noPublicIp;
            return this;
        }

        public Builder setNoPublicIp(@Nullable Boolean noPublicIp) {
            this.noPublicIp = Input.ofNullable(noPublicIp);
            return this;
        }

        public Builder setNoRemoveDataDisk(@Nullable Input<Boolean> noRemoveDataDisk) {
            this.noRemoveDataDisk = noRemoveDataDisk;
            return this;
        }

        public Builder setNoRemoveDataDisk(@Nullable Boolean noRemoveDataDisk) {
            this.noRemoveDataDisk = Input.ofNullable(noRemoveDataDisk);
            return this;
        }

        public Builder setPostStartupScript(@Nullable Input<String> postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }

        public Builder setPostStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = Input.ofNullable(postStartupScript);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setProxyUri(@Nullable Input<String> proxyUri) {
            this.proxyUri = proxyUri;
            return this;
        }

        public Builder setProxyUri(@Nullable String proxyUri) {
            this.proxyUri = Input.ofNullable(proxyUri);
            return this;
        }

        public Builder setReservationAffinity(@Nullable Input<InstanceReservationAffinityGetArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder setReservationAffinity(@Nullable InstanceReservationAffinityGetArgs reservationAffinity) {
            this.reservationAffinity = Input.ofNullable(reservationAffinity);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setServiceAccountScopes(@Nullable Input<List<String>> serviceAccountScopes) {
            this.serviceAccountScopes = serviceAccountScopes;
            return this;
        }

        public Builder setServiceAccountScopes(@Nullable List<String> serviceAccountScopes) {
            this.serviceAccountScopes = Input.ofNullable(serviceAccountScopes);
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable Input<InstanceShieldedInstanceConfigGetArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable InstanceShieldedInstanceConfigGetArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Input.ofNullable(shieldedInstanceConfig);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setSubnet(@Nullable Input<String> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable String subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public Builder setVmImage(@Nullable Input<InstanceVmImageGetArgs> vmImage) {
            this.vmImage = vmImage;
            return this;
        }

        public Builder setVmImage(@Nullable InstanceVmImageGetArgs vmImage) {
            this.vmImage = Input.ofNullable(vmImage);
            return this;
        }

        public InstanceState build() {
            return new InstanceState(acceleratorConfig, bootDiskSizeGb, bootDiskType, containerImage, createTime, customGpuDriverPath, dataDiskSizeGb, dataDiskType, diskEncryption, installGpuDriver, instanceOwners, kmsKey, labels, location, machineType, metadata, name, network, nicType, noProxyAccess, noPublicIp, noRemoveDataDisk, postStartupScript, project, proxyUri, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, state, subnet, tags, updateTime, vmImage);
        }
    }
}