// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.vmmigration_v1alpha1.enums.ComputeSchedulingOnHostMaintenance;
import io.pulumi.googlenative.vmmigration_v1alpha1.enums.ComputeSchedulingRestartType;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.SchedulingNodeAffinityArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scheduling information for VM on maintenance/restart behaviour and node allocation in sole tenant nodes.
 * 
 */
public final class ComputeSchedulingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeSchedulingArgs Empty = new ComputeSchedulingArgs();

    @Import(name="automaticRestart")
      private final @Nullable Output<Boolean> automaticRestart;

    public Output<Boolean> automaticRestart() {
        return this.automaticRestart == null ? Codegen.empty() : this.automaticRestart;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node. Ignored if no node_affinites are configured.
     * 
     */
    @Import(name="minNodeCpus")
      private final @Nullable Output<Integer> minNodeCpus;

    public Output<Integer> minNodeCpus() {
        return this.minNodeCpus == null ? Codegen.empty() : this.minNodeCpus;
    }

    /**
     * A set of node affinity and anti-affinity configurations for sole tenant nodes.
     * 
     */
    @Import(name="nodeAffinities")
      private final @Nullable Output<List<SchedulingNodeAffinityArgs>> nodeAffinities;

    public Output<List<SchedulingNodeAffinityArgs>> nodeAffinities() {
        return this.nodeAffinities == null ? Codegen.empty() : this.nodeAffinities;
    }

    /**
     * How the instance should behave when the host machine undergoes maintenance that may temporarily impact instance performance.
     * 
     */
    @Import(name="onHostMaintenance")
      private final @Nullable Output<ComputeSchedulingOnHostMaintenance> onHostMaintenance;

    public Output<ComputeSchedulingOnHostMaintenance> onHostMaintenance() {
        return this.onHostMaintenance == null ? Codegen.empty() : this.onHostMaintenance;
    }

    /**
     * Whether the Instance should be automatically restarted whenever it is terminated by Compute Engine (not terminated by user). This configuration is identical to `automaticRestart` field in Compute Engine create instance under scheduling. It was changed to an enum (instead of a boolean) to match the default value in Compute Engine which is automatic restart.
     * 
     */
    @Import(name="restartType")
      private final @Nullable Output<ComputeSchedulingRestartType> restartType;

    public Output<ComputeSchedulingRestartType> restartType() {
        return this.restartType == null ? Codegen.empty() : this.restartType;
    }

    public ComputeSchedulingArgs(
        @Nullable Output<Boolean> automaticRestart,
        @Nullable Output<Integer> minNodeCpus,
        @Nullable Output<List<SchedulingNodeAffinityArgs>> nodeAffinities,
        @Nullable Output<ComputeSchedulingOnHostMaintenance> onHostMaintenance,
        @Nullable Output<ComputeSchedulingRestartType> restartType) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.restartType = restartType;
    }

    private ComputeSchedulingArgs() {
        this.automaticRestart = Codegen.empty();
        this.minNodeCpus = Codegen.empty();
        this.nodeAffinities = Codegen.empty();
        this.onHostMaintenance = Codegen.empty();
        this.restartType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> automaticRestart;
        private @Nullable Output<Integer> minNodeCpus;
        private @Nullable Output<List<SchedulingNodeAffinityArgs>> nodeAffinities;
        private @Nullable Output<ComputeSchedulingOnHostMaintenance> onHostMaintenance;
        private @Nullable Output<ComputeSchedulingRestartType> restartType;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeSchedulingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.restartType = defaults.restartType;
        }

        public Builder automaticRestart(@Nullable Output<Boolean> automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }
        public Builder automaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = Codegen.ofNullable(automaticRestart);
            return this;
        }
        public Builder minNodeCpus(@Nullable Output<Integer> minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }
        public Builder minNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = Codegen.ofNullable(minNodeCpus);
            return this;
        }
        public Builder nodeAffinities(@Nullable Output<List<SchedulingNodeAffinityArgs>> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }
        public Builder nodeAffinities(@Nullable List<SchedulingNodeAffinityArgs> nodeAffinities) {
            this.nodeAffinities = Codegen.ofNullable(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(SchedulingNodeAffinityArgs... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(@Nullable Output<ComputeSchedulingOnHostMaintenance> onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }
        public Builder onHostMaintenance(@Nullable ComputeSchedulingOnHostMaintenance onHostMaintenance) {
            this.onHostMaintenance = Codegen.ofNullable(onHostMaintenance);
            return this;
        }
        public Builder restartType(@Nullable Output<ComputeSchedulingRestartType> restartType) {
            this.restartType = restartType;
            return this;
        }
        public Builder restartType(@Nullable ComputeSchedulingRestartType restartType) {
            this.restartType = Codegen.ofNullable(restartType);
            return this;
        }        public ComputeSchedulingArgs build() {
            return new ComputeSchedulingArgs(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, restartType);
        }
    }
}
