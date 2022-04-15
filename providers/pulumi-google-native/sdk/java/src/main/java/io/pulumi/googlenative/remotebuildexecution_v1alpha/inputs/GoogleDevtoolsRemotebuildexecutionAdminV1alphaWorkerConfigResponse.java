// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Defines the configuration to be used for creating workers in the worker pool.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse();

    /**
     * The accelerator card attached to each VM.
     * 
     */
    @Import(name="accelerator", required=true)
      private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator() {
        return this.accelerator;
    }

    /**
     * Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/
     * 
     */
    @Import(name="diskSizeGb", required=true)
      private final String diskSizeGb;

    public String diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Disk Type to use for the worker. See [Storage options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-standard` and `pd-ssd` are supported.
     * 
     */
    @Import(name="diskType", required=true)
      private final String diskType;

    public String diskType() {
        return this.diskType;
    }

    /**
     * Labels associated with the workers. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International letters are permitted. Label keys must start with a letter. Label values are optional. There can not be more than 64 labels per resource.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * Machine type of the worker, such as `e2-standard-2`. See https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note that `f1-micro` and `g1-small` are not yet supported.
     * 
     */
    @Import(name="machineType", required=true)
      private final String machineType;

    public String machineType() {
        return this.machineType;
    }

    /**
     * The maximum number of actions a worker can execute concurrently.
     * 
     */
    @Import(name="maxConcurrentActions", required=true)
      private final String maxConcurrentActions;

    public String maxConcurrentActions() {
        return this.maxConcurrentActions;
    }

    /**
     * Minimum CPU platform to use when creating the worker. See [CPU Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
     * 
     */
    @Import(name="minCpuPlatform", required=true)
      private final String minCpuPlatform;

    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }

    /**
     * Determines the type of network access granted to workers. Possible values: - "public": Workers can connect to the public internet. - "private": Workers can only connect to Google APIs and services. - "restricted-private": Workers can only connect to Google APIs that are reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
     * 
     */
    @Import(name="networkAccess", required=true)
      private final String networkAccess;

    public String networkAccess() {
        return this.networkAccess;
    }

    /**
     * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and therefore won't be preempted). See [Preemptible VMs](https://cloud.google.com/preemptible-vms/) for more details.
     * 
     */
    @Import(name="reserved", required=true)
      private final Boolean reserved;

    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * The node type name to be used for sole-tenant nodes.
     * 
     */
    @Import(name="soleTenantNodeType", required=true)
      private final String soleTenantNodeType;

    public String soleTenantNodeType() {
        return this.soleTenantNodeType;
    }

    /**
     * The name of the image used by each VM.
     * 
     */
    @Import(name="vmImage", required=true)
      private final String vmImage;

    public String vmImage() {
        return this.vmImage;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse(
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator,
        String diskSizeGb,
        String diskType,
        Map<String,String> labels,
        String machineType,
        String maxConcurrentActions,
        String minCpuPlatform,
        String networkAccess,
        Boolean reserved,
        String soleTenantNodeType,
        String vmImage) {
        this.accelerator = Objects.requireNonNull(accelerator, "expected parameter 'accelerator' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.maxConcurrentActions = Objects.requireNonNull(maxConcurrentActions, "expected parameter 'maxConcurrentActions' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
        this.networkAccess = Objects.requireNonNull(networkAccess, "expected parameter 'networkAccess' to be non-null");
        this.reserved = Objects.requireNonNull(reserved, "expected parameter 'reserved' to be non-null");
        this.soleTenantNodeType = Objects.requireNonNull(soleTenantNodeType, "expected parameter 'soleTenantNodeType' to be non-null");
        this.vmImage = Objects.requireNonNull(vmImage, "expected parameter 'vmImage' to be non-null");
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse() {
        this.accelerator = null;
        this.diskSizeGb = null;
        this.diskType = null;
        this.labels = Map.of();
        this.machineType = null;
        this.maxConcurrentActions = null;
        this.minCpuPlatform = null;
        this.networkAccess = null;
        this.reserved = null;
        this.soleTenantNodeType = null;
        this.vmImage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator;
        private String diskSizeGb;
        private String diskType;
        private Map<String,String> labels;
        private String machineType;
        private String maxConcurrentActions;
        private String minCpuPlatform;
        private String networkAccess;
        private Boolean reserved;
        private String soleTenantNodeType;
        private String vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerator = defaults.accelerator;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.maxConcurrentActions = defaults.maxConcurrentActions;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.networkAccess = defaults.networkAccess;
    	      this.reserved = defaults.reserved;
    	      this.soleTenantNodeType = defaults.soleTenantNodeType;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder accelerator(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator) {
            this.accelerator = Objects.requireNonNull(accelerator);
            return this;
        }
        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
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
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder maxConcurrentActions(String maxConcurrentActions) {
            this.maxConcurrentActions = Objects.requireNonNull(maxConcurrentActions);
            return this;
        }
        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }
        public Builder networkAccess(String networkAccess) {
            this.networkAccess = Objects.requireNonNull(networkAccess);
            return this;
        }
        public Builder reserved(Boolean reserved) {
            this.reserved = Objects.requireNonNull(reserved);
            return this;
        }
        public Builder soleTenantNodeType(String soleTenantNodeType) {
            this.soleTenantNodeType = Objects.requireNonNull(soleTenantNodeType);
            return this;
        }
        public Builder vmImage(String vmImage) {
            this.vmImage = Objects.requireNonNull(vmImage);
            return this;
        }        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse(accelerator, diskSizeGb, diskType, labels, machineType, maxConcurrentActions, minCpuPlatform, networkAccess, reserved, soleTenantNodeType, vmImage);
        }
    }
}
