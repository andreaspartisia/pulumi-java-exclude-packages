// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecRestartPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecRestartPolicyGetArgs Empty = new ServiceTaskSpecRestartPolicyGetArgs();

    @InputImport(name="condition")
      private final @Nullable Input<String> condition;

    public Input<String> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="delay")
      private final @Nullable Input<String> delay;

    public Input<String> getDelay() {
        return this.delay == null ? Input.empty() : this.delay;
    }

    @InputImport(name="maxAttempts")
      private final @Nullable Input<Integer> maxAttempts;

    public Input<Integer> getMaxAttempts() {
        return this.maxAttempts == null ? Input.empty() : this.maxAttempts;
    }

    @InputImport(name="window")
      private final @Nullable Input<String> window;

    public Input<String> getWindow() {
        return this.window == null ? Input.empty() : this.window;
    }

    public ServiceTaskSpecRestartPolicyGetArgs(
        @Nullable Input<String> condition,
        @Nullable Input<String> delay,
        @Nullable Input<Integer> maxAttempts,
        @Nullable Input<String> window) {
        this.condition = condition;
        this.delay = delay;
        this.maxAttempts = maxAttempts;
        this.window = window;
    }

    private ServiceTaskSpecRestartPolicyGetArgs() {
        this.condition = Input.empty();
        this.delay = Input.empty();
        this.maxAttempts = Input.empty();
        this.window = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecRestartPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> condition;
        private @Nullable Input<String> delay;
        private @Nullable Input<Integer> maxAttempts;
        private @Nullable Input<String> window;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecRestartPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.delay = defaults.delay;
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.window = defaults.window;
        }

        public Builder setCondition(@Nullable Input<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setDelay(@Nullable Input<String> delay) {
            this.delay = delay;
            return this;
        }

        public Builder setDelay(@Nullable String delay) {
            this.delay = Input.ofNullable(delay);
            return this;
        }

        public Builder setMaxAttempts(@Nullable Input<Integer> maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }

        public Builder setMaxAttempts(@Nullable Integer maxAttempts) {
            this.maxAttempts = Input.ofNullable(maxAttempts);
            return this;
        }

        public Builder setWindow(@Nullable Input<String> window) {
            this.window = window;
            return this;
        }

        public Builder setWindow(@Nullable String window) {
            this.window = Input.ofNullable(window);
            return this;
        }
        public ServiceTaskSpecRestartPolicyGetArgs build() {
            return new ServiceTaskSpecRestartPolicyGetArgs(condition, delay, maxAttempts, window);
        }
    }
}
