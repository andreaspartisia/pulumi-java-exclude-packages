// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.vmmigration_v1.inputs.AppliedLicenseResponse;
import io.pulumi.googlenative.vmmigration_v1.inputs.ComputeSchedulingResponse;
import io.pulumi.googlenative.vmmigration_v1.inputs.NetworkInterfaceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * ComputeEngineTargetDefaults is a collection of details for creating a VM in a target Compute Engine project.
 * 
 */
public final class ComputeEngineTargetDefaultsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeEngineTargetDefaultsResponse Empty = new ComputeEngineTargetDefaultsResponse();

    /**
     * Additional licenses to assign to the VM.
     * 
     */
    @Import(name="additionalLicenses", required=true)
      private final List<String> additionalLicenses;

    public List<String> additionalLicenses() {
        return this.additionalLicenses;
    }

    /**
     * The OS license returned from the adaptation module report.
     * 
     */
    @Import(name="appliedLicense", required=true)
      private final AppliedLicenseResponse appliedLicense;

    public AppliedLicenseResponse appliedLicense() {
        return this.appliedLicense;
    }

    /**
     * The VM Boot Option, as set in the source vm.
     * 
     */
    @Import(name="bootOption", required=true)
      private final String bootOption;

    public String bootOption() {
        return this.bootOption;
    }

    /**
     * Compute instance scheduling information (if empty default is used).
     * 
     */
    @Import(name="computeScheduling", required=true)
      private final ComputeSchedulingResponse computeScheduling;

    public ComputeSchedulingResponse computeScheduling() {
        return this.computeScheduling;
    }

    /**
     * The disk type to use in the VM.
     * 
     */
    @Import(name="diskType", required=true)
      private final String diskType;

    public String diskType() {
        return this.diskType;
    }

    /**
     * A map of labels to associate with the VM.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The license type to use in OS adaptation.
     * 
     */
    @Import(name="licenseType", required=true)
      private final String licenseType;

    public String licenseType() {
        return this.licenseType;
    }

    /**
     * The machine type to create the VM with.
     * 
     */
    @Import(name="machineType", required=true)
      private final String machineType;

    public String machineType() {
        return this.machineType;
    }

    /**
     * The machine type series to create the VM with.
     * 
     */
    @Import(name="machineTypeSeries", required=true)
      private final String machineTypeSeries;

    public String machineTypeSeries() {
        return this.machineTypeSeries;
    }

    /**
     * The metadata key/value pairs to assign to the VM.
     * 
     */
    @Import(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> metadata() {
        return this.metadata;
    }

    /**
     * List of NICs connected to this VM.
     * 
     */
    @Import(name="networkInterfaces", required=true)
      private final List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * A map of network tags to associate with the VM.
     * 
     */
    @Import(name="networkTags", required=true)
      private final List<String> networkTags;

    public List<String> networkTags() {
        return this.networkTags;
    }

    /**
     * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
     * 
     */
    @Import(name="secureBoot", required=true)
      private final Boolean secureBoot;

    public Boolean secureBoot() {
        return this.secureBoot;
    }

    /**
     * The service account to associate the VM with.
     * 
     */
    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
     * 
     */
    @Import(name="targetProject", required=true)
      private final String targetProject;

    public String targetProject() {
        return this.targetProject;
    }

    /**
     * The name of the VM to create.
     * 
     */
    @Import(name="vmName", required=true)
      private final String vmName;

    public String vmName() {
        return this.vmName;
    }

    /**
     * The zone in which to create the VM.
     * 
     */
    @Import(name="zone", required=true)
      private final String zone;

    public String zone() {
        return this.zone;
    }

    public ComputeEngineTargetDefaultsResponse(
        List<String> additionalLicenses,
        AppliedLicenseResponse appliedLicense,
        String bootOption,
        ComputeSchedulingResponse computeScheduling,
        String diskType,
        Map<String,String> labels,
        String licenseType,
        String machineType,
        String machineTypeSeries,
        Map<String,String> metadata,
        List<NetworkInterfaceResponse> networkInterfaces,
        List<String> networkTags,
        Boolean secureBoot,
        String serviceAccount,
        String targetProject,
        String vmName,
        String zone) {
        this.additionalLicenses = Objects.requireNonNull(additionalLicenses, "expected parameter 'additionalLicenses' to be non-null");
        this.appliedLicense = Objects.requireNonNull(appliedLicense, "expected parameter 'appliedLicense' to be non-null");
        this.bootOption = Objects.requireNonNull(bootOption, "expected parameter 'bootOption' to be non-null");
        this.computeScheduling = Objects.requireNonNull(computeScheduling, "expected parameter 'computeScheduling' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.licenseType = Objects.requireNonNull(licenseType, "expected parameter 'licenseType' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.machineTypeSeries = Objects.requireNonNull(machineTypeSeries, "expected parameter 'machineTypeSeries' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.networkInterfaces = Objects.requireNonNull(networkInterfaces, "expected parameter 'networkInterfaces' to be non-null");
        this.networkTags = Objects.requireNonNull(networkTags, "expected parameter 'networkTags' to be non-null");
        this.secureBoot = Objects.requireNonNull(secureBoot, "expected parameter 'secureBoot' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.targetProject = Objects.requireNonNull(targetProject, "expected parameter 'targetProject' to be non-null");
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private ComputeEngineTargetDefaultsResponse() {
        this.additionalLicenses = List.of();
        this.appliedLicense = null;
        this.bootOption = null;
        this.computeScheduling = null;
        this.diskType = null;
        this.labels = Map.of();
        this.licenseType = null;
        this.machineType = null;
        this.machineTypeSeries = null;
        this.metadata = Map.of();
        this.networkInterfaces = List.of();
        this.networkTags = List.of();
        this.secureBoot = null;
        this.serviceAccount = null;
        this.targetProject = null;
        this.vmName = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEngineTargetDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> additionalLicenses;
        private AppliedLicenseResponse appliedLicense;
        private String bootOption;
        private ComputeSchedulingResponse computeScheduling;
        private String diskType;
        private Map<String,String> labels;
        private String licenseType;
        private String machineType;
        private String machineTypeSeries;
        private Map<String,String> metadata;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private List<String> networkTags;
        private Boolean secureBoot;
        private String serviceAccount;
        private String targetProject;
        private String vmName;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEngineTargetDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLicenses = defaults.additionalLicenses;
    	      this.appliedLicense = defaults.appliedLicense;
    	      this.bootOption = defaults.bootOption;
    	      this.computeScheduling = defaults.computeScheduling;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
    	      this.licenseType = defaults.licenseType;
    	      this.machineType = defaults.machineType;
    	      this.machineTypeSeries = defaults.machineTypeSeries;
    	      this.metadata = defaults.metadata;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkTags = defaults.networkTags;
    	      this.secureBoot = defaults.secureBoot;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.targetProject = defaults.targetProject;
    	      this.vmName = defaults.vmName;
    	      this.zone = defaults.zone;
        }

        public Builder additionalLicenses(List<String> additionalLicenses) {
            this.additionalLicenses = Objects.requireNonNull(additionalLicenses);
            return this;
        }
        public Builder additionalLicenses(String... additionalLicenses) {
            return additionalLicenses(List.of(additionalLicenses));
        }
        public Builder appliedLicense(AppliedLicenseResponse appliedLicense) {
            this.appliedLicense = Objects.requireNonNull(appliedLicense);
            return this;
        }
        public Builder bootOption(String bootOption) {
            this.bootOption = Objects.requireNonNull(bootOption);
            return this;
        }
        public Builder computeScheduling(ComputeSchedulingResponse computeScheduling) {
            this.computeScheduling = Objects.requireNonNull(computeScheduling);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder licenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder machineTypeSeries(String machineTypeSeries) {
            this.machineTypeSeries = Objects.requireNonNull(machineTypeSeries);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder networkTags(List<String> networkTags) {
            this.networkTags = Objects.requireNonNull(networkTags);
            return this;
        }
        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }
        public Builder secureBoot(Boolean secureBoot) {
            this.secureBoot = Objects.requireNonNull(secureBoot);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder targetProject(String targetProject) {
            this.targetProject = Objects.requireNonNull(targetProject);
            return this;
        }
        public Builder vmName(String vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public ComputeEngineTargetDefaultsResponse build() {
            return new ComputeEngineTargetDefaultsResponse(additionalLicenses, appliedLicense, bootOption, computeScheduling, diskType, labels, licenseType, machineType, machineTypeSeries, metadata, networkInterfaces, networkTags, secureBoot, serviceAccount, targetProject, vmName, zone);
        }
    }
}
