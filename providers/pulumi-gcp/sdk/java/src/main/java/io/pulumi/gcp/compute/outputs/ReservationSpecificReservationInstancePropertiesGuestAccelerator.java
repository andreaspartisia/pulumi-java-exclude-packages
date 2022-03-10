// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReservationSpecificReservationInstancePropertiesGuestAccelerator {
    /**
     * The number of the guest accelerator cards exposed to
     * this instance.
     * 
     */
    private final Integer acceleratorCount;
    /**
     * The full or partial URL of the accelerator type to
     * attach to this instance. For example:
     * `projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100`
     * If you are creating an instance template, specify only the accelerator name.
     * 
     */
    private final String acceleratorType;

    @OutputCustomType.Constructor
    private ReservationSpecificReservationInstancePropertiesGuestAccelerator(
        @OutputCustomType.Parameter("acceleratorCount") Integer acceleratorCount,
        @OutputCustomType.Parameter("acceleratorType") String acceleratorType) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
    }

    /**
     * The number of the guest accelerator cards exposed to
     * this instance.
     * 
    */
    public Integer getAcceleratorCount() {
        return this.acceleratorCount;
    }
    /**
     * The full or partial URL of the accelerator type to
     * attach to this instance. For example:
     * `projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100`
     * If you are creating an instance template, specify only the accelerator name.
     * 
    */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationInstancePropertiesGuestAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer acceleratorCount;
        private String acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationInstancePropertiesGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorCount(Integer acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public ReservationSpecificReservationInstancePropertiesGuestAccelerator build() {
            return new ReservationSpecificReservationInstancePropertiesGuestAccelerator(acceleratorCount, acceleratorType);
        }
    }
}
