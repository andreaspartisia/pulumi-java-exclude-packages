// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig {
    /**
     * @return (Updatable) The total amount of memory available to the instance, in gigabytes.
     * 
     */
    private final @Nullable Double memoryInGbs;
    /**
     * @return (Updatable) The total number of OCPUs available to the instance.
     * 
     */
    private final @Nullable Double ocpus;

    @CustomType.Constructor
    private ComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig(
        @CustomType.Parameter("memoryInGbs") @Nullable Double memoryInGbs,
        @CustomType.Parameter("ocpus") @Nullable Double ocpus) {
        this.memoryInGbs = memoryInGbs;
        this.ocpus = ocpus;
    }

    /**
     * @return (Updatable) The total amount of memory available to the instance, in gigabytes.
     * 
     */
    public Optional<Double> memoryInGbs() {
        return Optional.ofNullable(this.memoryInGbs);
    }
    /**
     * @return (Updatable) The total number of OCPUs available to the instance.
     * 
     */
    public Optional<Double> ocpus() {
        return Optional.ofNullable(this.ocpus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double memoryInGbs;
        private @Nullable Double ocpus;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryInGbs = defaults.memoryInGbs;
    	      this.ocpus = defaults.ocpus;
        }

        public Builder memoryInGbs(@Nullable Double memoryInGbs) {
            this.memoryInGbs = memoryInGbs;
            return this;
        }
        public Builder ocpus(@Nullable Double ocpus) {
            this.ocpus = ocpus;
            return this;
        }        public ComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig build() {
            return new ComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig(memoryInGbs, ocpus);
        }
    }
}
