// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecContainerSpecHealthcheck {
    private final @Nullable String interval;
    private final @Nullable Integer retries;
    private final @Nullable String startPeriod;
    private final List<String> tests;
    private final @Nullable String timeout;

    @CustomType.Constructor
    private ServiceTaskSpecContainerSpecHealthcheck(
        @CustomType.Parameter("interval") @Nullable String interval,
        @CustomType.Parameter("retries") @Nullable Integer retries,
        @CustomType.Parameter("startPeriod") @Nullable String startPeriod,
        @CustomType.Parameter("tests") List<String> tests,
        @CustomType.Parameter("timeout") @Nullable String timeout) {
        this.interval = interval;
        this.retries = retries;
        this.startPeriod = startPeriod;
        this.tests = tests;
        this.timeout = timeout;
    }

    public Optional<String> interval() {
        return Optional.ofNullable(this.interval);
    }
    public Optional<Integer> retries() {
        return Optional.ofNullable(this.retries);
    }
    public Optional<String> startPeriod() {
        return Optional.ofNullable(this.startPeriod);
    }
    public List<String> tests() {
        return this.tests;
    }
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecHealthcheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String interval;
        private @Nullable Integer retries;
        private @Nullable String startPeriod;
        private List<String> tests;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecHealthcheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.retries = defaults.retries;
    	      this.startPeriod = defaults.startPeriod;
    	      this.tests = defaults.tests;
    	      this.timeout = defaults.timeout;
        }

        public Builder interval(@Nullable String interval) {
            this.interval = interval;
            return this;
        }
        public Builder retries(@Nullable Integer retries) {
            this.retries = retries;
            return this;
        }
        public Builder startPeriod(@Nullable String startPeriod) {
            this.startPeriod = startPeriod;
            return this;
        }
        public Builder tests(List<String> tests) {
            this.tests = Objects.requireNonNull(tests);
            return this;
        }
        public Builder tests(String... tests) {
            return tests(List.of(tests));
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }        public ServiceTaskSpecContainerSpecHealthcheck build() {
            return new ServiceTaskSpecContainerSpecHealthcheck(interval, retries, startPeriod, tests, timeout);
        }
    }
}
