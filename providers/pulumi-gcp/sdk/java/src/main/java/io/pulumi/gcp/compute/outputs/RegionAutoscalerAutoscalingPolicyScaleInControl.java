// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionAutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionAutoscalerAutoscalingPolicyScaleInControl {
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionAutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas;
    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    private final @Nullable Integer timeWindowSec;

    @OutputCustomType.Constructor
    private RegionAutoscalerAutoscalingPolicyScaleInControl(
        @OutputCustomType.Parameter("maxScaledInReplicas") @Nullable RegionAutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas,
        @OutputCustomType.Parameter("timeWindowSec") @Nullable Integer timeWindowSec) {
        this.maxScaledInReplicas = maxScaledInReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
    */
    public Optional<RegionAutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas> getMaxScaledInReplicas() {
        return Optional.ofNullable(this.maxScaledInReplicas);
    }
    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
    */
    public Optional<Integer> getTimeWindowSec() {
        return Optional.ofNullable(this.timeWindowSec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionAutoscalerAutoscalingPolicyScaleInControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionAutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas;
        private @Nullable Integer timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionAutoscalerAutoscalingPolicyScaleInControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledInReplicas = defaults.maxScaledInReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder setMaxScaledInReplicas(@Nullable RegionAutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas) {
            this.maxScaledInReplicas = maxScaledInReplicas;
            return this;
        }

        public Builder setTimeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }
        public RegionAutoscalerAutoscalingPolicyScaleInControl build() {
            return new RegionAutoscalerAutoscalingPolicyScaleInControl(maxScaledInReplicas, timeWindowSec);
        }
    }
}
