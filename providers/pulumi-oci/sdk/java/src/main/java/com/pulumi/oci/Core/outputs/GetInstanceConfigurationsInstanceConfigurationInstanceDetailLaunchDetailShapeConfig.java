// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailShapeConfig {
    /**
     * @return The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank for a non-burstable instance, or explicitly specify non-burstable with `BASELINE_1_1`.
     * 
     */
    private final String baselineOcpuUtilization;
    /**
     * @return The total amount of memory available to the instance, in gigabytes.
     * 
     */
    private final Double memoryInGbs;
    /**
     * @return The total number of OCPUs available to the instance.
     * 
     */
    private final Double ocpus;

    @CustomType.Constructor
    private GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailShapeConfig(
        @CustomType.Parameter("baselineOcpuUtilization") String baselineOcpuUtilization,
        @CustomType.Parameter("memoryInGbs") Double memoryInGbs,
        @CustomType.Parameter("ocpus") Double ocpus) {
        this.baselineOcpuUtilization = baselineOcpuUtilization;
        this.memoryInGbs = memoryInGbs;
        this.ocpus = ocpus;
    }

    /**
     * @return The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank for a non-burstable instance, or explicitly specify non-burstable with `BASELINE_1_1`.
     * 
     */
    public String baselineOcpuUtilization() {
        return this.baselineOcpuUtilization;
    }
    /**
     * @return The total amount of memory available to the instance, in gigabytes.
     * 
     */
    public Double memoryInGbs() {
        return this.memoryInGbs;
    }
    /**
     * @return The total number of OCPUs available to the instance.
     * 
     */
    public Double ocpus() {
        return this.ocpus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailShapeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baselineOcpuUtilization;
        private Double memoryInGbs;
        private Double ocpus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailShapeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baselineOcpuUtilization = defaults.baselineOcpuUtilization;
    	      this.memoryInGbs = defaults.memoryInGbs;
    	      this.ocpus = defaults.ocpus;
        }

        public Builder baselineOcpuUtilization(String baselineOcpuUtilization) {
            this.baselineOcpuUtilization = Objects.requireNonNull(baselineOcpuUtilization);
            return this;
        }
        public Builder memoryInGbs(Double memoryInGbs) {
            this.memoryInGbs = Objects.requireNonNull(memoryInGbs);
            return this;
        }
        public Builder ocpus(Double ocpus) {
            this.ocpus = Objects.requireNonNull(ocpus);
            return this;
        }        public GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailShapeConfig build() {
            return new GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailShapeConfig(baselineOcpuUtilization, memoryInGbs, ocpus);
        }
    }
}
