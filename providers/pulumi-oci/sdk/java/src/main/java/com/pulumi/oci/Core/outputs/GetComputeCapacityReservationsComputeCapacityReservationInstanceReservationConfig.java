// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfig {
    /**
     * @return The fault domain of this reservation configuration.  If a value is not supplied, this reservation configuration is applicable to all fault domains in the specified availability domain. For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm).
     * 
     */
    private final String faultDomain;
    /**
     * @return The shape to use when launching instances using compute capacity reservations. The shape determines the number of CPUs, the amount of memory, and other resources allocated to the instance. You can list all available shapes by calling [ListComputeCapacityReservationInstanceShapes](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/computeCapacityReservationInstanceShapes/ListComputeCapacityReservationInstanceShapes).
     * 
     */
    private final String instanceShape;
    /**
     * @return The shape configuration requested when launching instances in a compute capacity reservation.
     * 
     */
    private final List<GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig> instanceShapeConfigs;
    /**
     * @return The total number of instances that can be launched from the capacity configuration.
     * 
     */
    private final String reservedCount;
    /**
     * @return The amount of capacity in use out of the total capacity reserved in this capacity configuration.
     * 
     */
    private final String usedCount;

    @CustomType.Constructor
    private GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfig(
        @CustomType.Parameter("faultDomain") String faultDomain,
        @CustomType.Parameter("instanceShape") String instanceShape,
        @CustomType.Parameter("instanceShapeConfigs") List<GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig> instanceShapeConfigs,
        @CustomType.Parameter("reservedCount") String reservedCount,
        @CustomType.Parameter("usedCount") String usedCount) {
        this.faultDomain = faultDomain;
        this.instanceShape = instanceShape;
        this.instanceShapeConfigs = instanceShapeConfigs;
        this.reservedCount = reservedCount;
        this.usedCount = usedCount;
    }

    /**
     * @return The fault domain of this reservation configuration.  If a value is not supplied, this reservation configuration is applicable to all fault domains in the specified availability domain. For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm).
     * 
     */
    public String faultDomain() {
        return this.faultDomain;
    }
    /**
     * @return The shape to use when launching instances using compute capacity reservations. The shape determines the number of CPUs, the amount of memory, and other resources allocated to the instance. You can list all available shapes by calling [ListComputeCapacityReservationInstanceShapes](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/computeCapacityReservationInstanceShapes/ListComputeCapacityReservationInstanceShapes).
     * 
     */
    public String instanceShape() {
        return this.instanceShape;
    }
    /**
     * @return The shape configuration requested when launching instances in a compute capacity reservation.
     * 
     */
    public List<GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig> instanceShapeConfigs() {
        return this.instanceShapeConfigs;
    }
    /**
     * @return The total number of instances that can be launched from the capacity configuration.
     * 
     */
    public String reservedCount() {
        return this.reservedCount;
    }
    /**
     * @return The amount of capacity in use out of the total capacity reserved in this capacity configuration.
     * 
     */
    public String usedCount() {
        return this.usedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String faultDomain;
        private String instanceShape;
        private List<GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig> instanceShapeConfigs;
        private String reservedCount;
        private String usedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.faultDomain = defaults.faultDomain;
    	      this.instanceShape = defaults.instanceShape;
    	      this.instanceShapeConfigs = defaults.instanceShapeConfigs;
    	      this.reservedCount = defaults.reservedCount;
    	      this.usedCount = defaults.usedCount;
        }

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = Objects.requireNonNull(faultDomain);
            return this;
        }
        public Builder instanceShape(String instanceShape) {
            this.instanceShape = Objects.requireNonNull(instanceShape);
            return this;
        }
        public Builder instanceShapeConfigs(List<GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig> instanceShapeConfigs) {
            this.instanceShapeConfigs = Objects.requireNonNull(instanceShapeConfigs);
            return this;
        }
        public Builder instanceShapeConfigs(GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfigInstanceShapeConfig... instanceShapeConfigs) {
            return instanceShapeConfigs(List.of(instanceShapeConfigs));
        }
        public Builder reservedCount(String reservedCount) {
            this.reservedCount = Objects.requireNonNull(reservedCount);
            return this;
        }
        public Builder usedCount(String usedCount) {
            this.usedCount = Objects.requireNonNull(usedCount);
            return this;
        }        public GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfig build() {
            return new GetComputeCapacityReservationsComputeCapacityReservationInstanceReservationConfig(faultDomain, instanceShape, instanceShapeConfigs, reservedCount, usedCount);
        }
    }
}
