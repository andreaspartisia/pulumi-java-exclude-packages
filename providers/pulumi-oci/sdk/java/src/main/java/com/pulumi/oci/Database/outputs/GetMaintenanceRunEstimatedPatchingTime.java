// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetMaintenanceRunEstimatedPatchingTime {
    /**
     * @return The estimated time required in minutes for database server patching.
     * 
     */
    private final Integer estimatedDbServerPatchingTime;
    /**
     * @return The estimated time required in minutes for network switch patching.
     * 
     */
    private final Integer estimatedNetworkSwitchesPatchingTime;
    /**
     * @return The estimated time required in minutes for storage server patching.
     * 
     */
    private final Integer estimatedStorageServerPatchingTime;
    /**
     * @return The estimated total time required in minutes for all patching operations.
     * 
     */
    private final Integer totalEstimatedPatchingTime;

    @CustomType.Constructor
    private GetMaintenanceRunEstimatedPatchingTime(
        @CustomType.Parameter("estimatedDbServerPatchingTime") Integer estimatedDbServerPatchingTime,
        @CustomType.Parameter("estimatedNetworkSwitchesPatchingTime") Integer estimatedNetworkSwitchesPatchingTime,
        @CustomType.Parameter("estimatedStorageServerPatchingTime") Integer estimatedStorageServerPatchingTime,
        @CustomType.Parameter("totalEstimatedPatchingTime") Integer totalEstimatedPatchingTime) {
        this.estimatedDbServerPatchingTime = estimatedDbServerPatchingTime;
        this.estimatedNetworkSwitchesPatchingTime = estimatedNetworkSwitchesPatchingTime;
        this.estimatedStorageServerPatchingTime = estimatedStorageServerPatchingTime;
        this.totalEstimatedPatchingTime = totalEstimatedPatchingTime;
    }

    /**
     * @return The estimated time required in minutes for database server patching.
     * 
     */
    public Integer estimatedDbServerPatchingTime() {
        return this.estimatedDbServerPatchingTime;
    }
    /**
     * @return The estimated time required in minutes for network switch patching.
     * 
     */
    public Integer estimatedNetworkSwitchesPatchingTime() {
        return this.estimatedNetworkSwitchesPatchingTime;
    }
    /**
     * @return The estimated time required in minutes for storage server patching.
     * 
     */
    public Integer estimatedStorageServerPatchingTime() {
        return this.estimatedStorageServerPatchingTime;
    }
    /**
     * @return The estimated total time required in minutes for all patching operations.
     * 
     */
    public Integer totalEstimatedPatchingTime() {
        return this.totalEstimatedPatchingTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaintenanceRunEstimatedPatchingTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer estimatedDbServerPatchingTime;
        private Integer estimatedNetworkSwitchesPatchingTime;
        private Integer estimatedStorageServerPatchingTime;
        private Integer totalEstimatedPatchingTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaintenanceRunEstimatedPatchingTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.estimatedDbServerPatchingTime = defaults.estimatedDbServerPatchingTime;
    	      this.estimatedNetworkSwitchesPatchingTime = defaults.estimatedNetworkSwitchesPatchingTime;
    	      this.estimatedStorageServerPatchingTime = defaults.estimatedStorageServerPatchingTime;
    	      this.totalEstimatedPatchingTime = defaults.totalEstimatedPatchingTime;
        }

        public Builder estimatedDbServerPatchingTime(Integer estimatedDbServerPatchingTime) {
            this.estimatedDbServerPatchingTime = Objects.requireNonNull(estimatedDbServerPatchingTime);
            return this;
        }
        public Builder estimatedNetworkSwitchesPatchingTime(Integer estimatedNetworkSwitchesPatchingTime) {
            this.estimatedNetworkSwitchesPatchingTime = Objects.requireNonNull(estimatedNetworkSwitchesPatchingTime);
            return this;
        }
        public Builder estimatedStorageServerPatchingTime(Integer estimatedStorageServerPatchingTime) {
            this.estimatedStorageServerPatchingTime = Objects.requireNonNull(estimatedStorageServerPatchingTime);
            return this;
        }
        public Builder totalEstimatedPatchingTime(Integer totalEstimatedPatchingTime) {
            this.totalEstimatedPatchingTime = Objects.requireNonNull(totalEstimatedPatchingTime);
            return this;
        }        public GetMaintenanceRunEstimatedPatchingTime build() {
            return new GetMaintenanceRunEstimatedPatchingTime(estimatedDbServerPatchingTime, estimatedNetworkSwitchesPatchingTime, estimatedStorageServerPatchingTime, totalEstimatedPatchingTime);
        }
    }
}
