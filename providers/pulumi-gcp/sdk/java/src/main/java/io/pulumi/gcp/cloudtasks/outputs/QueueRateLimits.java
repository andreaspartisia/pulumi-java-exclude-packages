// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudtasks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class QueueRateLimits {
    /**
     * - 
     * The max burst size.
     * Max burst size limits how fast tasks in queue are processed when many tasks are
     * in the queue and the rate is high. This field allows the queue to have a high
     * rate so processing starts shortly after a task is enqueued, but still limits
     * resource usage when many tasks are enqueued in a short period of time.
     * 
     */
    private final @Nullable Integer maxBurstSize;
    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to
     * be dispatched for this queue. After this threshold has been
     * reached, Cloud Tasks stops dispatching tasks until the number of
     * concurrent requests decreases.
     * 
     */
    private final @Nullable Integer maxConcurrentDispatches;
    /**
     * The maximum rate at which tasks are dispatched from this queue.
     * If unspecified when the queue is created, Cloud Tasks will pick the default.
     * 
     */
    private final @Nullable Double maxDispatchesPerSecond;

    @OutputCustomType.Constructor
    private QueueRateLimits(
        @OutputCustomType.Parameter("maxBurstSize") @Nullable Integer maxBurstSize,
        @OutputCustomType.Parameter("maxConcurrentDispatches") @Nullable Integer maxConcurrentDispatches,
        @OutputCustomType.Parameter("maxDispatchesPerSecond") @Nullable Double maxDispatchesPerSecond) {
        this.maxBurstSize = maxBurstSize;
        this.maxConcurrentDispatches = maxConcurrentDispatches;
        this.maxDispatchesPerSecond = maxDispatchesPerSecond;
    }

    /**
     * - 
     * The max burst size.
     * Max burst size limits how fast tasks in queue are processed when many tasks are
     * in the queue and the rate is high. This field allows the queue to have a high
     * rate so processing starts shortly after a task is enqueued, but still limits
     * resource usage when many tasks are enqueued in a short period of time.
     * 
    */
    public Optional<Integer> getMaxBurstSize() {
        return Optional.ofNullable(this.maxBurstSize);
    }
    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to
     * be dispatched for this queue. After this threshold has been
     * reached, Cloud Tasks stops dispatching tasks until the number of
     * concurrent requests decreases.
     * 
    */
    public Optional<Integer> getMaxConcurrentDispatches() {
        return Optional.ofNullable(this.maxConcurrentDispatches);
    }
    /**
     * The maximum rate at which tasks are dispatched from this queue.
     * If unspecified when the queue is created, Cloud Tasks will pick the default.
     * 
    */
    public Optional<Double> getMaxDispatchesPerSecond() {
        return Optional.ofNullable(this.maxDispatchesPerSecond);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueRateLimits defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxBurstSize;
        private @Nullable Integer maxConcurrentDispatches;
        private @Nullable Double maxDispatchesPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueRateLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBurstSize = defaults.maxBurstSize;
    	      this.maxConcurrentDispatches = defaults.maxConcurrentDispatches;
    	      this.maxDispatchesPerSecond = defaults.maxDispatchesPerSecond;
        }

        public Builder setMaxBurstSize(@Nullable Integer maxBurstSize) {
            this.maxBurstSize = maxBurstSize;
            return this;
        }

        public Builder setMaxConcurrentDispatches(@Nullable Integer maxConcurrentDispatches) {
            this.maxConcurrentDispatches = maxConcurrentDispatches;
            return this;
        }

        public Builder setMaxDispatchesPerSecond(@Nullable Double maxDispatchesPerSecond) {
            this.maxDispatchesPerSecond = maxDispatchesPerSecond;
            return this;
        }
        public QueueRateLimits build() {
            return new QueueRateLimits(maxBurstSize, maxConcurrentDispatches, maxDispatchesPerSecond);
        }
    }
}
