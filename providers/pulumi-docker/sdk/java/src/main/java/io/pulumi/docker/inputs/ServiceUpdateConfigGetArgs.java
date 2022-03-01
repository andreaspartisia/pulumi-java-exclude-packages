// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceUpdateConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceUpdateConfigGetArgs Empty = new ServiceUpdateConfigGetArgs();

    @InputImport(name="delay")
      private final @Nullable Input<String> delay;

    public Input<String> getDelay() {
        return this.delay == null ? Input.empty() : this.delay;
    }

    @InputImport(name="failureAction")
      private final @Nullable Input<String> failureAction;

    public Input<String> getFailureAction() {
        return this.failureAction == null ? Input.empty() : this.failureAction;
    }

    @InputImport(name="maxFailureRatio")
      private final @Nullable Input<String> maxFailureRatio;

    public Input<String> getMaxFailureRatio() {
        return this.maxFailureRatio == null ? Input.empty() : this.maxFailureRatio;
    }

    @InputImport(name="monitor")
      private final @Nullable Input<String> monitor;

    public Input<String> getMonitor() {
        return this.monitor == null ? Input.empty() : this.monitor;
    }

    @InputImport(name="order")
      private final @Nullable Input<String> order;

    public Input<String> getOrder() {
        return this.order == null ? Input.empty() : this.order;
    }

    @InputImport(name="parallelism")
      private final @Nullable Input<Integer> parallelism;

    public Input<Integer> getParallelism() {
        return this.parallelism == null ? Input.empty() : this.parallelism;
    }

    public ServiceUpdateConfigGetArgs(
        @Nullable Input<String> delay,
        @Nullable Input<String> failureAction,
        @Nullable Input<String> maxFailureRatio,
        @Nullable Input<String> monitor,
        @Nullable Input<String> order,
        @Nullable Input<Integer> parallelism) {
        this.delay = delay;
        this.failureAction = failureAction;
        this.maxFailureRatio = maxFailureRatio;
        this.monitor = monitor;
        this.order = order;
        this.parallelism = parallelism;
    }

    private ServiceUpdateConfigGetArgs() {
        this.delay = Input.empty();
        this.failureAction = Input.empty();
        this.maxFailureRatio = Input.empty();
        this.monitor = Input.empty();
        this.order = Input.empty();
        this.parallelism = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUpdateConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> delay;
        private @Nullable Input<String> failureAction;
        private @Nullable Input<String> maxFailureRatio;
        private @Nullable Input<String> monitor;
        private @Nullable Input<String> order;
        private @Nullable Input<Integer> parallelism;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUpdateConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delay = defaults.delay;
    	      this.failureAction = defaults.failureAction;
    	      this.maxFailureRatio = defaults.maxFailureRatio;
    	      this.monitor = defaults.monitor;
    	      this.order = defaults.order;
    	      this.parallelism = defaults.parallelism;
        }

        public Builder setDelay(@Nullable Input<String> delay) {
            this.delay = delay;
            return this;
        }

        public Builder setDelay(@Nullable String delay) {
            this.delay = Input.ofNullable(delay);
            return this;
        }

        public Builder setFailureAction(@Nullable Input<String> failureAction) {
            this.failureAction = failureAction;
            return this;
        }

        public Builder setFailureAction(@Nullable String failureAction) {
            this.failureAction = Input.ofNullable(failureAction);
            return this;
        }

        public Builder setMaxFailureRatio(@Nullable Input<String> maxFailureRatio) {
            this.maxFailureRatio = maxFailureRatio;
            return this;
        }

        public Builder setMaxFailureRatio(@Nullable String maxFailureRatio) {
            this.maxFailureRatio = Input.ofNullable(maxFailureRatio);
            return this;
        }

        public Builder setMonitor(@Nullable Input<String> monitor) {
            this.monitor = monitor;
            return this;
        }

        public Builder setMonitor(@Nullable String monitor) {
            this.monitor = Input.ofNullable(monitor);
            return this;
        }

        public Builder setOrder(@Nullable Input<String> order) {
            this.order = order;
            return this;
        }

        public Builder setOrder(@Nullable String order) {
            this.order = Input.ofNullable(order);
            return this;
        }

        public Builder setParallelism(@Nullable Input<Integer> parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        public Builder setParallelism(@Nullable Integer parallelism) {
            this.parallelism = Input.ofNullable(parallelism);
            return this;
        }
        public ServiceUpdateConfigGetArgs build() {
            return new ServiceUpdateConfigGetArgs(delay, failureAction, maxFailureRatio, monitor, order, parallelism);
        }
    }
}
