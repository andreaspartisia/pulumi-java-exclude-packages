// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


public final class AutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs Empty = new AutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs();

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @InputImport(name="target", required=true)
    private final Input<Double> target;

    public Input<Double> getTarget() {
        return this.target;
    }

    public AutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs(Input<Double> target) {
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private AutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs() {
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Double> target;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder setTarget(Input<Double> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTarget(Double target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }

        public AutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs build() {
            return new AutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs(target);
        }
    }
}