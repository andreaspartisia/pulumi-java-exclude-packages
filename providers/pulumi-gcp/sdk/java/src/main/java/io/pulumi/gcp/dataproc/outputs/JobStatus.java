// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobStatus {
    private final @Nullable String details;
    private final @Nullable String state;
    private final @Nullable String stateStartTime;
    private final @Nullable String substate;

    @OutputCustomType.Constructor
    private JobStatus(
        @OutputCustomType.Parameter("details") @Nullable String details,
        @OutputCustomType.Parameter("state") @Nullable String state,
        @OutputCustomType.Parameter("stateStartTime") @Nullable String stateStartTime,
        @OutputCustomType.Parameter("substate") @Nullable String substate) {
        this.details = details;
        this.state = state;
        this.stateStartTime = stateStartTime;
        this.substate = substate;
    }

    public Optional<String> getDetails() {
        return Optional.ofNullable(this.details);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    public Optional<String> getStateStartTime() {
        return Optional.ofNullable(this.stateStartTime);
    }
    public Optional<String> getSubstate() {
        return Optional.ofNullable(this.substate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String details;
        private @Nullable String state;
        private @Nullable String stateStartTime;
        private @Nullable String substate;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.state = defaults.state;
    	      this.stateStartTime = defaults.stateStartTime;
    	      this.substate = defaults.substate;
        }

        public Builder setDetails(@Nullable String details) {
            this.details = details;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setStateStartTime(@Nullable String stateStartTime) {
            this.stateStartTime = stateStartTime;
            return this;
        }

        public Builder setSubstate(@Nullable String substate) {
            this.substate = substate;
            return this;
        }
        public JobStatus build() {
            return new JobStatus(details, state, stateStartTime, substate);
        }
    }
}
