// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.InstanceTemplateReservationAffinitySpecificReservation;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceTemplateReservationAffinity {
    /**
     * Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * 
     */
    private final @Nullable InstanceTemplateReservationAffinitySpecificReservation specificReservation;
    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private InstanceTemplateReservationAffinity(
        @OutputCustomType.Parameter("specificReservation") @Nullable InstanceTemplateReservationAffinitySpecificReservation specificReservation,
        @OutputCustomType.Parameter("type") String type) {
        this.specificReservation = specificReservation;
        this.type = type;
    }

    /**
     * Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * 
    */
    public Optional<InstanceTemplateReservationAffinitySpecificReservation> getSpecificReservation() {
        return Optional.ofNullable(this.specificReservation);
    }
    /**
     * The type of reservation from which this instance can consume resources.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateReservationAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InstanceTemplateReservationAffinitySpecificReservation specificReservation;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateReservationAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservation = defaults.specificReservation;
    	      this.type = defaults.type;
        }

        public Builder setSpecificReservation(@Nullable InstanceTemplateReservationAffinitySpecificReservation specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public InstanceTemplateReservationAffinity build() {
            return new InstanceTemplateReservationAffinity(specificReservation, type);
        }
    }
}
