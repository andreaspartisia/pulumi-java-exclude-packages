// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.outputs;

import io.pulumi.aws.autoscalingplans.outputs.ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification;
import io.pulumi.aws.autoscalingplans.outputs.ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScalingPlanScalingInstructionTargetTrackingConfiguration {
    /**
     * A customized metric. You can specify either `customized_scaling_metric_specification` or `predefined_scaling_metric_specification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedScalingMetricSpecification.html).
     * 
     */
    private final @Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification customizedScalingMetricSpecification;
    /**
     * Boolean indicating whether scale in by the target tracking scaling policy is disabled. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean disableScaleIn;
    /**
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     * This value is used only if the resource is an Auto Scaling group.
     * 
     */
    private final @Nullable Integer estimatedInstanceWarmup;
    /**
     * A predefined metric. You can specify either `predefined_scaling_metric_specification` or `customized_scaling_metric_specification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html).
     * 
     */
    private final @Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification;
    /**
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * This value is not used if the scalable resource is an Auto Scaling group.
     * 
     */
    private final @Nullable Integer scaleInCooldown;
    /**
     * The amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start.
     * This value is not used if the scalable resource is an Auto Scaling group.
     * 
     */
    private final @Nullable Integer scaleOutCooldown;
    /**
     * The target value for the metric.
     * 
     */
    private final Double targetValue;

    @OutputCustomType.Constructor
    private ScalingPlanScalingInstructionTargetTrackingConfiguration(
        @OutputCustomType.Parameter("customizedScalingMetricSpecification") @Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification customizedScalingMetricSpecification,
        @OutputCustomType.Parameter("disableScaleIn") @Nullable Boolean disableScaleIn,
        @OutputCustomType.Parameter("estimatedInstanceWarmup") @Nullable Integer estimatedInstanceWarmup,
        @OutputCustomType.Parameter("predefinedScalingMetricSpecification") @Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification,
        @OutputCustomType.Parameter("scaleInCooldown") @Nullable Integer scaleInCooldown,
        @OutputCustomType.Parameter("scaleOutCooldown") @Nullable Integer scaleOutCooldown,
        @OutputCustomType.Parameter("targetValue") Double targetValue) {
        this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
        this.disableScaleIn = disableScaleIn;
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
        this.scaleInCooldown = scaleInCooldown;
        this.scaleOutCooldown = scaleOutCooldown;
        this.targetValue = targetValue;
    }

    /**
     * A customized metric. You can specify either `customized_scaling_metric_specification` or `predefined_scaling_metric_specification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedScalingMetricSpecification.html).
     * 
    */
    public Optional<ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification> getCustomizedScalingMetricSpecification() {
        return Optional.ofNullable(this.customizedScalingMetricSpecification);
    }
    /**
     * Boolean indicating whether scale in by the target tracking scaling policy is disabled. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getDisableScaleIn() {
        return Optional.ofNullable(this.disableScaleIn);
    }
    /**
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     * This value is used only if the resource is an Auto Scaling group.
     * 
    */
    public Optional<Integer> getEstimatedInstanceWarmup() {
        return Optional.ofNullable(this.estimatedInstanceWarmup);
    }
    /**
     * A predefined metric. You can specify either `predefined_scaling_metric_specification` or `customized_scaling_metric_specification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html).
     * 
    */
    public Optional<ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification> getPredefinedScalingMetricSpecification() {
        return Optional.ofNullable(this.predefinedScalingMetricSpecification);
    }
    /**
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * This value is not used if the scalable resource is an Auto Scaling group.
     * 
    */
    public Optional<Integer> getScaleInCooldown() {
        return Optional.ofNullable(this.scaleInCooldown);
    }
    /**
     * The amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start.
     * This value is not used if the scalable resource is an Auto Scaling group.
     * 
    */
    public Optional<Integer> getScaleOutCooldown() {
        return Optional.ofNullable(this.scaleOutCooldown);
    }
    /**
     * The target value for the metric.
     * 
    */
    public Double getTargetValue() {
        return this.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionTargetTrackingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification customizedScalingMetricSpecification;
        private @Nullable Boolean disableScaleIn;
        private @Nullable Integer estimatedInstanceWarmup;
        private @Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification;
        private @Nullable Integer scaleInCooldown;
        private @Nullable Integer scaleOutCooldown;
        private Double targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionTargetTrackingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customizedScalingMetricSpecification = defaults.customizedScalingMetricSpecification;
    	      this.disableScaleIn = defaults.disableScaleIn;
    	      this.estimatedInstanceWarmup = defaults.estimatedInstanceWarmup;
    	      this.predefinedScalingMetricSpecification = defaults.predefinedScalingMetricSpecification;
    	      this.scaleInCooldown = defaults.scaleInCooldown;
    	      this.scaleOutCooldown = defaults.scaleOutCooldown;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder setCustomizedScalingMetricSpecification(@Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification customizedScalingMetricSpecification) {
            this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
            return this;
        }

        public Builder setDisableScaleIn(@Nullable Boolean disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        public Builder setEstimatedInstanceWarmup(@Nullable Integer estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        public Builder setPredefinedScalingMetricSpecification(@Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
            this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
            return this;
        }

        public Builder setScaleInCooldown(@Nullable Integer scaleInCooldown) {
            this.scaleInCooldown = scaleInCooldown;
            return this;
        }

        public Builder setScaleOutCooldown(@Nullable Integer scaleOutCooldown) {
            this.scaleOutCooldown = scaleOutCooldown;
            return this;
        }

        public Builder setTargetValue(Double targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }
        public ScalingPlanScalingInstructionTargetTrackingConfiguration build() {
            return new ScalingPlanScalingInstructionTargetTrackingConfiguration(customizedScalingMetricSpecification, disableScaleIn, estimatedInstanceWarmup, predefinedScalingMetricSpecification, scaleInCooldown, scaleOutCooldown, targetValue);
        }
    }
}