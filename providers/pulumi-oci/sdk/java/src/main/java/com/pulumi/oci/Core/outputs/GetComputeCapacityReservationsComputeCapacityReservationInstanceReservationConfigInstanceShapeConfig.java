// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig {
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
    private GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig(
        @CustomType.Parameter("memoryInGbs") Double memoryInGbs,
        @CustomType.Parameter("ocpus") Double ocpus) {
        this.memoryInGbs = memoryInGbs;
        this.ocpus = ocpus;
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

    public static Builder builder(GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double memoryInGbs;
        private Double ocpus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryInGbs = defaults.memoryInGbs;
    	      this.ocpus = defaults.ocpus;
        }

        public Builder memoryInGbs(Double memoryInGbs) {
            this.memoryInGbs = Objects.requireNonNull(memoryInGbs);
            return this;
        }
        public Builder ocpus(Double ocpus) {
            this.ocpus = Objects.requireNonNull(ocpus);
            return this;
        }        public GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig build() {
            return new GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig(memoryInGbs, ocpus);
        }
    }
}
