// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.azurenative.machinelearningcompute.enums.Status;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AutoScale configuration properties.
 * 
 */
public final class AutoScaleConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoScaleConfigurationArgs Empty = new AutoScaleConfigurationArgs();

    /**
     * The maximum number of replicas for each service.
     * 
     */
    @Import(name="maxReplicas")
    private @Nullable Output<Integer> maxReplicas;

    public Optional<Output<Integer>> maxReplicas() {
        return Optional.ofNullable(this.maxReplicas);
    }

    /**
     * The minimum number of replicas for each service.
     * 
     */
    @Import(name="minReplicas")
    private @Nullable Output<Integer> minReplicas;

    public Optional<Output<Integer>> minReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }

    /**
     * Refresh period in seconds.
     * 
     */
    @Import(name="refreshPeriodInSeconds")
    private @Nullable Output<Integer> refreshPeriodInSeconds;

    public Optional<Output<Integer>> refreshPeriodInSeconds() {
        return Optional.ofNullable(this.refreshPeriodInSeconds);
    }

    /**
     * If auto-scale is enabled for all services. Each service can turn it off individually.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,Status>> status;

    public Optional<Output<Either<String,Status>>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The target utilization.
     * 
     */
    @Import(name="targetUtilization")
    private @Nullable Output<Double> targetUtilization;

    public Optional<Output<Double>> targetUtilization() {
        return Optional.ofNullable(this.targetUtilization);
    }

    private AutoScaleConfigurationArgs() {}

    private AutoScaleConfigurationArgs(AutoScaleConfigurationArgs $) {
        this.maxReplicas = $.maxReplicas;
        this.minReplicas = $.minReplicas;
        this.refreshPeriodInSeconds = $.refreshPeriodInSeconds;
        this.status = $.status;
        this.targetUtilization = $.targetUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoScaleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoScaleConfigurationArgs $;

        public Builder() {
            $ = new AutoScaleConfigurationArgs();
        }

        public Builder(AutoScaleConfigurationArgs defaults) {
            $ = new AutoScaleConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxReplicas(@Nullable Output<Integer> maxReplicas) {
            $.maxReplicas = maxReplicas;
            return this;
        }

        public Builder maxReplicas(Integer maxReplicas) {
            return maxReplicas(Output.of(maxReplicas));
        }

        public Builder minReplicas(@Nullable Output<Integer> minReplicas) {
            $.minReplicas = minReplicas;
            return this;
        }

        public Builder minReplicas(Integer minReplicas) {
            return minReplicas(Output.of(minReplicas));
        }

        public Builder refreshPeriodInSeconds(@Nullable Output<Integer> refreshPeriodInSeconds) {
            $.refreshPeriodInSeconds = refreshPeriodInSeconds;
            return this;
        }

        public Builder refreshPeriodInSeconds(Integer refreshPeriodInSeconds) {
            return refreshPeriodInSeconds(Output.of(refreshPeriodInSeconds));
        }

        public Builder status(@Nullable Output<Either<String,Status>> status) {
            $.status = status;
            return this;
        }

        public Builder status(Either<String,Status> status) {
            return status(Output.of(status));
        }

        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        public Builder status(Status status) {
            return status(Either.ofRight(status));
        }

        public Builder targetUtilization(@Nullable Output<Double> targetUtilization) {
            $.targetUtilization = targetUtilization;
            return this;
        }

        public Builder targetUtilization(Double targetUtilization) {
            return targetUtilization(Output.of(targetUtilization));
        }

        public AutoScaleConfigurationArgs build() {
            $.maxReplicas = Codegen.integerProp("maxReplicas").output().arg($.maxReplicas).def(100).getNullable();
            $.minReplicas = Codegen.integerProp("minReplicas").output().arg($.minReplicas).def(1).getNullable();
            $.status = Codegen.stringProp("status").left(Status.class).output().arg($.status).def("Disabled").getNullable();
            return $;
        }
    }

}
