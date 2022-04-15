// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1.inputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.dataproc_v1.inputs.DiskConfigResponse;
import io.pulumi.googlenative.dataproc_v1.inputs.InstanceReferenceResponse;
import io.pulumi.googlenative.dataproc_v1.inputs.ManagedGroupConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The config settings for Compute Engine resources in an instance group, such as a master or worker group.
 * 
 */
public final class InstanceGroupConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupConfigResponse Empty = new InstanceGroupConfigResponse();

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    @Import(name="accelerators", required=true)
      private final List<AcceleratorConfigResponse> accelerators;

    public List<AcceleratorConfigResponse> accelerators() {
        return this.accelerators;
    }

    /**
     * Optional. Disk option config settings.
     * 
     */
    @Import(name="diskConfig", required=true)
      private final DiskConfigResponse diskConfig;

    public DiskConfigResponse diskConfig() {
        return this.diskConfig;
    }

    /**
     * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
     * 
     */
    @Import(name="imageUri", required=true)
      private final String imageUri;

    public String imageUri() {
        return this.imageUri;
    }

    /**
     * The list of instance names. Dataproc derives the names from cluster_name, num_instances, and the instance group.
     * 
     */
    @Import(name="instanceNames", required=true)
      private final List<String> instanceNames;

    public List<String> instanceNames() {
        return this.instanceNames;
    }

    /**
     * List of references to Compute Engine instances.
     * 
     */
    @Import(name="instanceReferences", required=true)
      private final List<InstanceReferenceResponse> instanceReferences;

    public List<InstanceReferenceResponse> instanceReferences() {
        return this.instanceReferences;
    }

    /**
     * Specifies that this instance group contains preemptible instances.
     * 
     */
    @Import(name="isPreemptible", required=true)
      private final Boolean isPreemptible;

    public Boolean isPreemptible() {
        return this.isPreemptible;
    }

    /**
     * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example, n1-standard-2.
     * 
     */
    @Import(name="machineTypeUri", required=true)
      private final String machineTypeUri;

    public String machineTypeUri() {
        return this.machineTypeUri;
    }

    /**
     * The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    @Import(name="managedGroupConfig", required=true)
      private final ManagedGroupConfigResponse managedGroupConfig;

    public ManagedGroupConfigResponse managedGroupConfig() {
        return this.managedGroupConfig;
    }

    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    @Import(name="minCpuPlatform", required=true)
      private final String minCpuPlatform;

    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }

    /**
     * Optional. The number of VM instances in the instance group. For HA cluster master_config groups, must be set to 3. For standard cluster master_config groups, must be set to 1.
     * 
     */
    @Import(name="numInstances", required=true)
      private final Integer numInstances;

    public Integer numInstances() {
        return this.numInstances;
    }

    /**
     * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
     * 
     */
    @Import(name="preemptibility", required=true)
      private final String preemptibility;

    public String preemptibility() {
        return this.preemptibility;
    }

    public InstanceGroupConfigResponse(
        List<AcceleratorConfigResponse> accelerators,
        DiskConfigResponse diskConfig,
        String imageUri,
        List<String> instanceNames,
        List<InstanceReferenceResponse> instanceReferences,
        Boolean isPreemptible,
        String machineTypeUri,
        ManagedGroupConfigResponse managedGroupConfig,
        String minCpuPlatform,
        Integer numInstances,
        String preemptibility) {
        this.accelerators = Objects.requireNonNull(accelerators, "expected parameter 'accelerators' to be non-null");
        this.diskConfig = Objects.requireNonNull(diskConfig, "expected parameter 'diskConfig' to be non-null");
        this.imageUri = Objects.requireNonNull(imageUri, "expected parameter 'imageUri' to be non-null");
        this.instanceNames = Objects.requireNonNull(instanceNames, "expected parameter 'instanceNames' to be non-null");
        this.instanceReferences = Objects.requireNonNull(instanceReferences, "expected parameter 'instanceReferences' to be non-null");
        this.isPreemptible = Objects.requireNonNull(isPreemptible, "expected parameter 'isPreemptible' to be non-null");
        this.machineTypeUri = Objects.requireNonNull(machineTypeUri, "expected parameter 'machineTypeUri' to be non-null");
        this.managedGroupConfig = Objects.requireNonNull(managedGroupConfig, "expected parameter 'managedGroupConfig' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
        this.numInstances = Objects.requireNonNull(numInstances, "expected parameter 'numInstances' to be non-null");
        this.preemptibility = Objects.requireNonNull(preemptibility, "expected parameter 'preemptibility' to be non-null");
    }

    private InstanceGroupConfigResponse() {
        this.accelerators = List.of();
        this.diskConfig = null;
        this.imageUri = null;
        this.instanceNames = List.of();
        this.instanceReferences = List.of();
        this.isPreemptible = null;
        this.machineTypeUri = null;
        this.managedGroupConfig = null;
        this.minCpuPlatform = null;
        this.numInstances = null;
        this.preemptibility = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorConfigResponse> accelerators;
        private DiskConfigResponse diskConfig;
        private String imageUri;
        private List<String> instanceNames;
        private List<InstanceReferenceResponse> instanceReferences;
        private Boolean isPreemptible;
        private String machineTypeUri;
        private ManagedGroupConfigResponse managedGroupConfig;
        private String minCpuPlatform;
        private Integer numInstances;
        private String preemptibility;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.instanceNames = defaults.instanceNames;
    	      this.instanceReferences = defaults.instanceReferences;
    	      this.isPreemptible = defaults.isPreemptible;
    	      this.machineTypeUri = defaults.machineTypeUri;
    	      this.managedGroupConfig = defaults.managedGroupConfig;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
    	      this.preemptibility = defaults.preemptibility;
        }

        public Builder accelerators(List<AcceleratorConfigResponse> accelerators) {
            this.accelerators = Objects.requireNonNull(accelerators);
            return this;
        }
        public Builder accelerators(AcceleratorConfigResponse... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder diskConfig(DiskConfigResponse diskConfig) {
            this.diskConfig = Objects.requireNonNull(diskConfig);
            return this;
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }
        public Builder instanceNames(List<String> instanceNames) {
            this.instanceNames = Objects.requireNonNull(instanceNames);
            return this;
        }
        public Builder instanceNames(String... instanceNames) {
            return instanceNames(List.of(instanceNames));
        }
        public Builder instanceReferences(List<InstanceReferenceResponse> instanceReferences) {
            this.instanceReferences = Objects.requireNonNull(instanceReferences);
            return this;
        }
        public Builder instanceReferences(InstanceReferenceResponse... instanceReferences) {
            return instanceReferences(List.of(instanceReferences));
        }
        public Builder isPreemptible(Boolean isPreemptible) {
            this.isPreemptible = Objects.requireNonNull(isPreemptible);
            return this;
        }
        public Builder machineTypeUri(String machineTypeUri) {
            this.machineTypeUri = Objects.requireNonNull(machineTypeUri);
            return this;
        }
        public Builder managedGroupConfig(ManagedGroupConfigResponse managedGroupConfig) {
            this.managedGroupConfig = Objects.requireNonNull(managedGroupConfig);
            return this;
        }
        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }
        public Builder numInstances(Integer numInstances) {
            this.numInstances = Objects.requireNonNull(numInstances);
            return this;
        }
        public Builder preemptibility(String preemptibility) {
            this.preemptibility = Objects.requireNonNull(preemptibility);
            return this;
        }        public InstanceGroupConfigResponse build() {
            return new InstanceGroupConfigResponse(accelerators, diskConfig, imageUri, instanceNames, instanceReferences, isPreemptible, machineTypeUri, managedGroupConfig, minCpuPlatform, numInstances, preemptibility);
        }
    }
}
