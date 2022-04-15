// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse {
    /**
     * Additional experiment flags for the job.
     * 
     */
    private final List<String> additionalExperiments;
    /**
     * Additional user labels to be specified for the job. Keys and values should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page. An object containing a list of key/value pairs. Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
     * 
     */
    private final Map<String,String> additionalUserLabels;
    /**
     * Whether to bypass the safety checks for the job's temporary directory. Use with caution.
     * 
     */
    private final Boolean bypassTempDirValidation;
    /**
     * Whether to enable Streaming Engine for the job.
     * 
     */
    private final Boolean enableStreamingEngine;
    /**
     * Configuration for VM IPs.
     * 
     */
    private final String ipConfiguration;
    /**
     * Name for the Cloud KMS key for the job. The key format is: projects//locations//keyRings//cryptoKeys/
     * 
     */
    private final String kmsKeyName;
    /**
     * The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    private final String machineType;
    /**
     * The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    private final Integer maxWorkers;
    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
     * 
     */
    private final String network;
    /**
     * The initial number of Compute Engine instances for the job.
     * 
     */
    private final Integer numWorkers;
    /**
     * The email address of the service account to run the job as.
     * 
     */
    private final String serviceAccountEmail;
    /**
     * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    private final String subnetwork;
    /**
     * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    private final String tempLocation;
    /**
     * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane's region.
     * 
     */
    private final String workerRegion;
    /**
     * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane's region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
     */
    private final String workerZone;
    /**
     * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse(
        @CustomType.Parameter("additionalExperiments") List<String> additionalExperiments,
        @CustomType.Parameter("additionalUserLabels") Map<String,String> additionalUserLabels,
        @CustomType.Parameter("bypassTempDirValidation") Boolean bypassTempDirValidation,
        @CustomType.Parameter("enableStreamingEngine") Boolean enableStreamingEngine,
        @CustomType.Parameter("ipConfiguration") String ipConfiguration,
        @CustomType.Parameter("kmsKeyName") String kmsKeyName,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("maxWorkers") Integer maxWorkers,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("numWorkers") Integer numWorkers,
        @CustomType.Parameter("serviceAccountEmail") String serviceAccountEmail,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("tempLocation") String tempLocation,
        @CustomType.Parameter("workerRegion") String workerRegion,
        @CustomType.Parameter("workerZone") String workerZone,
        @CustomType.Parameter("zone") String zone) {
        this.additionalExperiments = additionalExperiments;
        this.additionalUserLabels = additionalUserLabels;
        this.bypassTempDirValidation = bypassTempDirValidation;
        this.enableStreamingEngine = enableStreamingEngine;
        this.ipConfiguration = ipConfiguration;
        this.kmsKeyName = kmsKeyName;
        this.machineType = machineType;
        this.maxWorkers = maxWorkers;
        this.network = network;
        this.numWorkers = numWorkers;
        this.serviceAccountEmail = serviceAccountEmail;
        this.subnetwork = subnetwork;
        this.tempLocation = tempLocation;
        this.workerRegion = workerRegion;
        this.workerZone = workerZone;
        this.zone = zone;
    }

    /**
     * Additional experiment flags for the job.
     * 
    */
    public List<String> additionalExperiments() {
        return this.additionalExperiments;
    }
    /**
     * Additional user labels to be specified for the job. Keys and values should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page. An object containing a list of key/value pairs. Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
     * 
    */
    public Map<String,String> additionalUserLabels() {
        return this.additionalUserLabels;
    }
    /**
     * Whether to bypass the safety checks for the job's temporary directory. Use with caution.
     * 
    */
    public Boolean bypassTempDirValidation() {
        return this.bypassTempDirValidation;
    }
    /**
     * Whether to enable Streaming Engine for the job.
     * 
    */
    public Boolean enableStreamingEngine() {
        return this.enableStreamingEngine;
    }
    /**
     * Configuration for VM IPs.
     * 
    */
    public String ipConfiguration() {
        return this.ipConfiguration;
    }
    /**
     * Name for the Cloud KMS key for the job. The key format is: projects//locations//keyRings//cryptoKeys/
     * 
    */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
    */
    public String machineType() {
        return this.machineType;
    }
    /**
     * The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
    */
    public Integer maxWorkers() {
        return this.maxWorkers;
    }
    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
     * 
    */
    public String network() {
        return this.network;
    }
    /**
     * The initial number of Compute Engine instances for the job.
     * 
    */
    public Integer numWorkers() {
        return this.numWorkers;
    }
    /**
     * The email address of the service account to run the job as.
     * 
    */
    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
    */
    public String subnetwork() {
        return this.subnetwork;
    }
    /**
     * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
    */
    public String tempLocation() {
        return this.tempLocation;
    }
    /**
     * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane's region.
     * 
    */
    public String workerRegion() {
        return this.workerRegion;
    }
    /**
     * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane's region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
    */
    public String workerZone() {
        return this.workerZone;
    }
    /**
     * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
    */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> additionalExperiments;
        private Map<String,String> additionalUserLabels;
        private Boolean bypassTempDirValidation;
        private Boolean enableStreamingEngine;
        private String ipConfiguration;
        private String kmsKeyName;
        private String machineType;
        private Integer maxWorkers;
        private String network;
        private Integer numWorkers;
        private String serviceAccountEmail;
        private String subnetwork;
        private String tempLocation;
        private String workerRegion;
        private String workerZone;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExperiments = defaults.additionalExperiments;
    	      this.additionalUserLabels = defaults.additionalUserLabels;
    	      this.bypassTempDirValidation = defaults.bypassTempDirValidation;
    	      this.enableStreamingEngine = defaults.enableStreamingEngine;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.machineType = defaults.machineType;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.network = defaults.network;
    	      this.numWorkers = defaults.numWorkers;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tempLocation = defaults.tempLocation;
    	      this.workerRegion = defaults.workerRegion;
    	      this.workerZone = defaults.workerZone;
    	      this.zone = defaults.zone;
        }

        public Builder additionalExperiments(List<String> additionalExperiments) {
            this.additionalExperiments = Objects.requireNonNull(additionalExperiments);
            return this;
        }
        public Builder additionalExperiments(String... additionalExperiments) {
            return additionalExperiments(List.of(additionalExperiments));
        }
        public Builder additionalUserLabels(Map<String,String> additionalUserLabels) {
            this.additionalUserLabels = Objects.requireNonNull(additionalUserLabels);
            return this;
        }
        public Builder bypassTempDirValidation(Boolean bypassTempDirValidation) {
            this.bypassTempDirValidation = Objects.requireNonNull(bypassTempDirValidation);
            return this;
        }
        public Builder enableStreamingEngine(Boolean enableStreamingEngine) {
            this.enableStreamingEngine = Objects.requireNonNull(enableStreamingEngine);
            return this;
        }
        public Builder ipConfiguration(String ipConfiguration) {
            this.ipConfiguration = Objects.requireNonNull(ipConfiguration);
            return this;
        }
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder maxWorkers(Integer maxWorkers) {
            this.maxWorkers = Objects.requireNonNull(maxWorkers);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder numWorkers(Integer numWorkers) {
            this.numWorkers = Objects.requireNonNull(numWorkers);
            return this;
        }
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder tempLocation(String tempLocation) {
            this.tempLocation = Objects.requireNonNull(tempLocation);
            return this;
        }
        public Builder workerRegion(String workerRegion) {
            this.workerRegion = Objects.requireNonNull(workerRegion);
            return this;
        }
        public Builder workerZone(String workerZone) {
            this.workerZone = Objects.requireNonNull(workerZone);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse build() {
            return new GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse(additionalExperiments, additionalUserLabels, bypassTempDirValidation, enableStreamingEngine, ipConfiguration, kmsKeyName, machineType, maxWorkers, network, numWorkers, serviceAccountEmail, subnetwork, tempLocation, workerRegion, workerZone, zone);
        }
    }
}
