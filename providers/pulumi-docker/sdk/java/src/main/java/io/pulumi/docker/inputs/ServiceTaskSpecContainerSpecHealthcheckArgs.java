// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecHealthcheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecHealthcheckArgs Empty = new ServiceTaskSpecContainerSpecHealthcheckArgs();

    @InputImport(name="interval")
      private final @Nullable Input<String> interval;

    public Input<String> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    @InputImport(name="retries")
      private final @Nullable Input<Integer> retries;

    public Input<Integer> getRetries() {
        return this.retries == null ? Input.empty() : this.retries;
    }

    @InputImport(name="startPeriod")
      private final @Nullable Input<String> startPeriod;

    public Input<String> getStartPeriod() {
        return this.startPeriod == null ? Input.empty() : this.startPeriod;
    }

    @InputImport(name="tests", required=true)
      private final Input<List<String>> tests;

    public Input<List<String>> getTests() {
        return this.tests;
    }

    @InputImport(name="timeout")
      private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public ServiceTaskSpecContainerSpecHealthcheckArgs(
        @Nullable Input<String> interval,
        @Nullable Input<Integer> retries,
        @Nullable Input<String> startPeriod,
        Input<List<String>> tests,
        @Nullable Input<String> timeout) {
        this.interval = interval;
        this.retries = retries;
        this.startPeriod = startPeriod;
        this.tests = Objects.requireNonNull(tests, "expected parameter 'tests' to be non-null");
        this.timeout = timeout;
    }

    private ServiceTaskSpecContainerSpecHealthcheckArgs() {
        this.interval = Input.empty();
        this.retries = Input.empty();
        this.startPeriod = Input.empty();
        this.tests = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecHealthcheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> interval;
        private @Nullable Input<Integer> retries;
        private @Nullable Input<String> startPeriod;
        private Input<List<String>> tests;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecHealthcheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.retries = defaults.retries;
    	      this.startPeriod = defaults.startPeriod;
    	      this.tests = defaults.tests;
    	      this.timeout = defaults.timeout;
        }

        public Builder setInterval(@Nullable Input<String> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable String interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setRetries(@Nullable Input<Integer> retries) {
            this.retries = retries;
            return this;
        }

        public Builder setRetries(@Nullable Integer retries) {
            this.retries = Input.ofNullable(retries);
            return this;
        }

        public Builder setStartPeriod(@Nullable Input<String> startPeriod) {
            this.startPeriod = startPeriod;
            return this;
        }

        public Builder setStartPeriod(@Nullable String startPeriod) {
            this.startPeriod = Input.ofNullable(startPeriod);
            return this;
        }

        public Builder setTests(Input<List<String>> tests) {
            this.tests = Objects.requireNonNull(tests);
            return this;
        }

        public Builder setTests(List<String> tests) {
            this.tests = Input.of(Objects.requireNonNull(tests));
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }
        public ServiceTaskSpecContainerSpecHealthcheckArgs build() {
            return new ServiceTaskSpecContainerSpecHealthcheckArgs(interval, retries, startPeriod, tests, timeout);
        }
    }
}
