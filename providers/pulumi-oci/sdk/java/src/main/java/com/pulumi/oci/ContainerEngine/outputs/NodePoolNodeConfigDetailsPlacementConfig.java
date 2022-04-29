// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolNodeConfigDetailsPlacementConfig {
    /**
     * @return (Updatable) The availability domain in which to place nodes. Example: `Uocm:PHX-AD-1`
     * 
     */
    private final String availabilityDomain;
    /**
     * @return (Updatable) The OCID of the compute capacity reservation in which to place the compute instance.
     * 
     */
    private final @Nullable String capacityReservationId;
    /**
     * @return (Updatable) The OCID of the subnet in which to place nodes.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private NodePoolNodeConfigDetailsPlacementConfig(
        @CustomType.Parameter("availabilityDomain") String availabilityDomain,
        @CustomType.Parameter("capacityReservationId") @Nullable String capacityReservationId,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.availabilityDomain = availabilityDomain;
        this.capacityReservationId = capacityReservationId;
        this.subnetId = subnetId;
    }

    /**
     * @return (Updatable) The availability domain in which to place nodes. Example: `Uocm:PHX-AD-1`
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return (Updatable) The OCID of the compute capacity reservation in which to place the compute instance.
     * 
     */
    public Optional<String> capacityReservationId() {
        return Optional.ofNullable(this.capacityReservationId);
    }
    /**
     * @return (Updatable) The OCID of the subnet in which to place nodes.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigDetailsPlacementConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityDomain;
        private @Nullable String capacityReservationId;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigDetailsPlacementConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.capacityReservationId = defaults.capacityReservationId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder capacityReservationId(@Nullable String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public NodePoolNodeConfigDetailsPlacementConfig build() {
            return new NodePoolNodeConfigDetailsPlacementConfig(availabilityDomain, capacityReservationId, subnetId);
        }
    }
}
