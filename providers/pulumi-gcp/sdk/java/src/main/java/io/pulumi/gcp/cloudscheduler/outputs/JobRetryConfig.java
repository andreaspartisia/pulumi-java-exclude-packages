// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobRetryConfig {
    /**
     * The maximum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
     */
    private final @Nullable String maxBackoffDuration;
    /**
     * The time between retries will double maxDoublings times.
     * A job's retry interval starts at minBackoffDuration,
     * then doubles maxDoublings times, then increases linearly,
     * and finally retries retries at intervals of maxBackoffDuration up to retryCount times.
     * 
     */
    private final @Nullable Integer maxDoublings;
    /**
     * The time limit for retrying a failed job, measured from time when an execution was first attempted.
     * If specified with retryCount, the job will be retried until both limits are reached.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
     */
    private final @Nullable String maxRetryDuration;
    /**
     * The minimum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
     */
    private final @Nullable String minBackoffDuration;
    /**
     * The number of attempts that the system will make to run a
     * job using the exponential backoff procedure described by maxDoublings.
     * Values greater than 5 and negative values are not allowed.
     * 
     */
    private final @Nullable Integer retryCount;

    @OutputCustomType.Constructor
    private JobRetryConfig(
        @OutputCustomType.Parameter("maxBackoffDuration") @Nullable String maxBackoffDuration,
        @OutputCustomType.Parameter("maxDoublings") @Nullable Integer maxDoublings,
        @OutputCustomType.Parameter("maxRetryDuration") @Nullable String maxRetryDuration,
        @OutputCustomType.Parameter("minBackoffDuration") @Nullable String minBackoffDuration,
        @OutputCustomType.Parameter("retryCount") @Nullable Integer retryCount) {
        this.maxBackoffDuration = maxBackoffDuration;
        this.maxDoublings = maxDoublings;
        this.maxRetryDuration = maxRetryDuration;
        this.minBackoffDuration = minBackoffDuration;
        this.retryCount = retryCount;
    }

    /**
     * The maximum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
    */
    public Optional<String> getMaxBackoffDuration() {
        return Optional.ofNullable(this.maxBackoffDuration);
    }
    /**
     * The time between retries will double maxDoublings times.
     * A job's retry interval starts at minBackoffDuration,
     * then doubles maxDoublings times, then increases linearly,
     * and finally retries retries at intervals of maxBackoffDuration up to retryCount times.
     * 
    */
    public Optional<Integer> getMaxDoublings() {
        return Optional.ofNullable(this.maxDoublings);
    }
    /**
     * The time limit for retrying a failed job, measured from time when an execution was first attempted.
     * If specified with retryCount, the job will be retried until both limits are reached.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
    */
    public Optional<String> getMaxRetryDuration() {
        return Optional.ofNullable(this.maxRetryDuration);
    }
    /**
     * The minimum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
    */
    public Optional<String> getMinBackoffDuration() {
        return Optional.ofNullable(this.minBackoffDuration);
    }
    /**
     * The number of attempts that the system will make to run a
     * job using the exponential backoff procedure described by maxDoublings.
     * Values greater than 5 and negative values are not allowed.
     * 
    */
    public Optional<Integer> getRetryCount() {
        return Optional.ofNullable(this.retryCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRetryConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String maxBackoffDuration;
        private @Nullable Integer maxDoublings;
        private @Nullable String maxRetryDuration;
        private @Nullable String minBackoffDuration;
        private @Nullable Integer retryCount;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRetryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBackoffDuration = defaults.maxBackoffDuration;
    	      this.maxDoublings = defaults.maxDoublings;
    	      this.maxRetryDuration = defaults.maxRetryDuration;
    	      this.minBackoffDuration = defaults.minBackoffDuration;
    	      this.retryCount = defaults.retryCount;
        }

        public Builder setMaxBackoffDuration(@Nullable String maxBackoffDuration) {
            this.maxBackoffDuration = maxBackoffDuration;
            return this;
        }

        public Builder setMaxDoublings(@Nullable Integer maxDoublings) {
            this.maxDoublings = maxDoublings;
            return this;
        }

        public Builder setMaxRetryDuration(@Nullable String maxRetryDuration) {
            this.maxRetryDuration = maxRetryDuration;
            return this;
        }

        public Builder setMinBackoffDuration(@Nullable String minBackoffDuration) {
            this.minBackoffDuration = minBackoffDuration;
            return this;
        }

        public Builder setRetryCount(@Nullable Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public JobRetryConfig build() {
            return new JobRetryConfig(maxBackoffDuration, maxDoublings, maxRetryDuration, minBackoffDuration, retryCount);
        }
    }
}
