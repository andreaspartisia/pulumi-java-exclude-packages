// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigGetArgs;
import io.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFleetState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFleetState Empty = new InstanceFleetState();

    /**
     * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     * 
     */
    @InputImport(name="clusterId")
      private final @Nullable Input<String> clusterId;

    public Input<String> getClusterId() {
        return this.clusterId == null ? Input.empty() : this.clusterId;
    }

    /**
     * Configuration block for instance fleet
     * 
     */
    @InputImport(name="instanceTypeConfigs")
      private final @Nullable Input<List<InstanceFleetInstanceTypeConfigGetArgs>> instanceTypeConfigs;

    public Input<List<InstanceFleetInstanceTypeConfigGetArgs>> getInstanceTypeConfigs() {
        return this.instanceTypeConfigs == null ? Input.empty() : this.instanceTypeConfigs;
    }

    /**
     * Configuration block for launch specification
     * 
     */
    @InputImport(name="launchSpecifications")
      private final @Nullable Input<InstanceFleetLaunchSpecificationsGetArgs> launchSpecifications;

    public Input<InstanceFleetLaunchSpecificationsGetArgs> getLaunchSpecifications() {
        return this.launchSpecifications == null ? Input.empty() : this.launchSpecifications;
    }

    /**
     * Friendly name given to the instance fleet.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="provisionedOnDemandCapacity")
      private final @Nullable Input<Integer> provisionedOnDemandCapacity;

    public Input<Integer> getProvisionedOnDemandCapacity() {
        return this.provisionedOnDemandCapacity == null ? Input.empty() : this.provisionedOnDemandCapacity;
    }

    @InputImport(name="provisionedSpotCapacity")
      private final @Nullable Input<Integer> provisionedSpotCapacity;

    public Input<Integer> getProvisionedSpotCapacity() {
        return this.provisionedSpotCapacity == null ? Input.empty() : this.provisionedSpotCapacity;
    }

    /**
     * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
     * 
     */
    @InputImport(name="targetOnDemandCapacity")
      private final @Nullable Input<Integer> targetOnDemandCapacity;

    public Input<Integer> getTargetOnDemandCapacity() {
        return this.targetOnDemandCapacity == null ? Input.empty() : this.targetOnDemandCapacity;
    }

    /**
     * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * 
     */
    @InputImport(name="targetSpotCapacity")
      private final @Nullable Input<Integer> targetSpotCapacity;

    public Input<Integer> getTargetSpotCapacity() {
        return this.targetSpotCapacity == null ? Input.empty() : this.targetSpotCapacity;
    }

    public InstanceFleetState(
        @Nullable Input<String> clusterId,
        @Nullable Input<List<InstanceFleetInstanceTypeConfigGetArgs>> instanceTypeConfigs,
        @Nullable Input<InstanceFleetLaunchSpecificationsGetArgs> launchSpecifications,
        @Nullable Input<String> name,
        @Nullable Input<Integer> provisionedOnDemandCapacity,
        @Nullable Input<Integer> provisionedSpotCapacity,
        @Nullable Input<Integer> targetOnDemandCapacity,
        @Nullable Input<Integer> targetSpotCapacity) {
        this.clusterId = clusterId;
        this.instanceTypeConfigs = instanceTypeConfigs;
        this.launchSpecifications = launchSpecifications;
        this.name = name;
        this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
        this.provisionedSpotCapacity = provisionedSpotCapacity;
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        this.targetSpotCapacity = targetSpotCapacity;
    }

    private InstanceFleetState() {
        this.clusterId = Input.empty();
        this.instanceTypeConfigs = Input.empty();
        this.launchSpecifications = Input.empty();
        this.name = Input.empty();
        this.provisionedOnDemandCapacity = Input.empty();
        this.provisionedSpotCapacity = Input.empty();
        this.targetOnDemandCapacity = Input.empty();
        this.targetSpotCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterId;
        private @Nullable Input<List<InstanceFleetInstanceTypeConfigGetArgs>> instanceTypeConfigs;
        private @Nullable Input<InstanceFleetLaunchSpecificationsGetArgs> launchSpecifications;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> provisionedOnDemandCapacity;
        private @Nullable Input<Integer> provisionedSpotCapacity;
        private @Nullable Input<Integer> targetOnDemandCapacity;
        private @Nullable Input<Integer> targetSpotCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.instanceTypeConfigs = defaults.instanceTypeConfigs;
    	      this.launchSpecifications = defaults.launchSpecifications;
    	      this.name = defaults.name;
    	      this.provisionedOnDemandCapacity = defaults.provisionedOnDemandCapacity;
    	      this.provisionedSpotCapacity = defaults.provisionedSpotCapacity;
    	      this.targetOnDemandCapacity = defaults.targetOnDemandCapacity;
    	      this.targetSpotCapacity = defaults.targetSpotCapacity;
        }

        public Builder setClusterId(@Nullable Input<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder setClusterId(@Nullable String clusterId) {
            this.clusterId = Input.ofNullable(clusterId);
            return this;
        }

        public Builder setInstanceTypeConfigs(@Nullable Input<List<InstanceFleetInstanceTypeConfigGetArgs>> instanceTypeConfigs) {
            this.instanceTypeConfigs = instanceTypeConfigs;
            return this;
        }

        public Builder setInstanceTypeConfigs(@Nullable List<InstanceFleetInstanceTypeConfigGetArgs> instanceTypeConfigs) {
            this.instanceTypeConfigs = Input.ofNullable(instanceTypeConfigs);
            return this;
        }

        public Builder setLaunchSpecifications(@Nullable Input<InstanceFleetLaunchSpecificationsGetArgs> launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }

        public Builder setLaunchSpecifications(@Nullable InstanceFleetLaunchSpecificationsGetArgs launchSpecifications) {
            this.launchSpecifications = Input.ofNullable(launchSpecifications);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProvisionedOnDemandCapacity(@Nullable Input<Integer> provisionedOnDemandCapacity) {
            this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
            return this;
        }

        public Builder setProvisionedOnDemandCapacity(@Nullable Integer provisionedOnDemandCapacity) {
            this.provisionedOnDemandCapacity = Input.ofNullable(provisionedOnDemandCapacity);
            return this;
        }

        public Builder setProvisionedSpotCapacity(@Nullable Input<Integer> provisionedSpotCapacity) {
            this.provisionedSpotCapacity = provisionedSpotCapacity;
            return this;
        }

        public Builder setProvisionedSpotCapacity(@Nullable Integer provisionedSpotCapacity) {
            this.provisionedSpotCapacity = Input.ofNullable(provisionedSpotCapacity);
            return this;
        }

        public Builder setTargetOnDemandCapacity(@Nullable Input<Integer> targetOnDemandCapacity) {
            this.targetOnDemandCapacity = targetOnDemandCapacity;
            return this;
        }

        public Builder setTargetOnDemandCapacity(@Nullable Integer targetOnDemandCapacity) {
            this.targetOnDemandCapacity = Input.ofNullable(targetOnDemandCapacity);
            return this;
        }

        public Builder setTargetSpotCapacity(@Nullable Input<Integer> targetSpotCapacity) {
            this.targetSpotCapacity = targetSpotCapacity;
            return this;
        }

        public Builder setTargetSpotCapacity(@Nullable Integer targetSpotCapacity) {
            this.targetSpotCapacity = Input.ofNullable(targetSpotCapacity);
            return this;
        }
        public InstanceFleetState build() {
            return new InstanceFleetState(clusterId, instanceTypeConfigs, launchSpecifications, name, provisionedOnDemandCapacity, provisionedSpotCapacity, targetOnDemandCapacity, targetSpotCapacity);
        }
    }
}