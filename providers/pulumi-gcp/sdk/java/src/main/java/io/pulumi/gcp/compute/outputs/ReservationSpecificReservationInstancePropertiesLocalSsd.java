// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReservationSpecificReservationInstancePropertiesLocalSsd {
    /**
     * The size of the disk in base-2 GB.
     * 
     */
    private final Integer diskSizeGb;
    /**
     * The disk interface to use for attaching this disk.
     * Default value is `SCSI`.
     * Possible values are `SCSI` and `NVME`.
     * 
     */
    private final @Nullable String $interface;

    @OutputCustomType.Constructor
    private ReservationSpecificReservationInstancePropertiesLocalSsd(
        @OutputCustomType.Parameter("diskSizeGb") Integer diskSizeGb,
        @OutputCustomType.Parameter("interface") @Nullable String $interface) {
        this.diskSizeGb = diskSizeGb;
        this.$interface = $interface;
    }

    /**
     * The size of the disk in base-2 GB.
     * 
    */
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * The disk interface to use for attaching this disk.
     * Default value is `SCSI`.
     * Possible values are `SCSI` and `NVME`.
     * 
    */
    public Optional<String> get$interface() {
        return Optional.ofNullable(this.$interface);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationInstancePropertiesLocalSsd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskSizeGb;
        private @Nullable String $interface;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationInstancePropertiesLocalSsd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.$interface = defaults.$interface;
        }

        public Builder setDiskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder set$interface(@Nullable String $interface) {
            this.$interface = $interface;
            return this;
        }
        public ReservationSpecificReservationInstancePropertiesLocalSsd build() {
            return new ReservationSpecificReservationInstancePropertiesLocalSsd(diskSizeGb, $interface);
        }
    }
}
