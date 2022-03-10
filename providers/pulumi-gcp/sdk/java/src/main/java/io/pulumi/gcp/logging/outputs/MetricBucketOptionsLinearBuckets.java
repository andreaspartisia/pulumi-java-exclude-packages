// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricBucketOptionsLinearBuckets {
    /**
     * Must be greater than 0.
     * 
     */
    private final @Nullable Integer numFiniteBuckets;
    /**
     * Lower bound of the first bucket.
     * 
     */
    private final @Nullable Double offset;
    /**
     * Must be greater than 0.
     * 
     */
    private final @Nullable Double width;

    @OutputCustomType.Constructor
    private MetricBucketOptionsLinearBuckets(
        @OutputCustomType.Parameter("numFiniteBuckets") @Nullable Integer numFiniteBuckets,
        @OutputCustomType.Parameter("offset") @Nullable Double offset,
        @OutputCustomType.Parameter("width") @Nullable Double width) {
        this.numFiniteBuckets = numFiniteBuckets;
        this.offset = offset;
        this.width = width;
    }

    /**
     * Must be greater than 0.
     * 
    */
    public Optional<Integer> getNumFiniteBuckets() {
        return Optional.ofNullable(this.numFiniteBuckets);
    }
    /**
     * Lower bound of the first bucket.
     * 
    */
    public Optional<Double> getOffset() {
        return Optional.ofNullable(this.offset);
    }
    /**
     * Must be greater than 0.
     * 
    */
    public Optional<Double> getWidth() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptionsLinearBuckets defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer numFiniteBuckets;
        private @Nullable Double offset;
        private @Nullable Double width;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptionsLinearBuckets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numFiniteBuckets = defaults.numFiniteBuckets;
    	      this.offset = defaults.offset;
    	      this.width = defaults.width;
        }

        public Builder setNumFiniteBuckets(@Nullable Integer numFiniteBuckets) {
            this.numFiniteBuckets = numFiniteBuckets;
            return this;
        }

        public Builder setOffset(@Nullable Double offset) {
            this.offset = offset;
            return this;
        }

        public Builder setWidth(@Nullable Double width) {
            this.width = width;
            return this;
        }
        public MetricBucketOptionsLinearBuckets build() {
            return new MetricBucketOptionsLinearBuckets(numFiniteBuckets, offset, width);
        }
    }
}
