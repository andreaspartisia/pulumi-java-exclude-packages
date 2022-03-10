// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.logging.outputs.MetricBucketOptionsExplicitBuckets;
import io.pulumi.gcp.logging.outputs.MetricBucketOptionsExponentialBuckets;
import io.pulumi.gcp.logging.outputs.MetricBucketOptionsLinearBuckets;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricBucketOptions {
    /**
     * Specifies a set of buckets with arbitrary widths.
     * Structure is documented below.
     * 
     */
    private final @Nullable MetricBucketOptionsExplicitBuckets explicitBuckets;
    /**
     * Specifies an exponential sequence of buckets that have a width that is proportional to the value of
     * the lower bound. Each bucket represents a constant relative uncertainty on a specific value in the bucket.
     * Structure is documented below.
     * 
     */
    private final @Nullable MetricBucketOptionsExponentialBuckets exponentialBuckets;
    /**
     * Specifies a linear sequence of buckets that all have the same width (except overflow and underflow).
     * Each bucket represents a constant absolute uncertainty on the specific value in the bucket.
     * Structure is documented below.
     * 
     */
    private final @Nullable MetricBucketOptionsLinearBuckets linearBuckets;

    @OutputCustomType.Constructor
    private MetricBucketOptions(
        @OutputCustomType.Parameter("explicitBuckets") @Nullable MetricBucketOptionsExplicitBuckets explicitBuckets,
        @OutputCustomType.Parameter("exponentialBuckets") @Nullable MetricBucketOptionsExponentialBuckets exponentialBuckets,
        @OutputCustomType.Parameter("linearBuckets") @Nullable MetricBucketOptionsLinearBuckets linearBuckets) {
        this.explicitBuckets = explicitBuckets;
        this.exponentialBuckets = exponentialBuckets;
        this.linearBuckets = linearBuckets;
    }

    /**
     * Specifies a set of buckets with arbitrary widths.
     * Structure is documented below.
     * 
    */
    public Optional<MetricBucketOptionsExplicitBuckets> getExplicitBuckets() {
        return Optional.ofNullable(this.explicitBuckets);
    }
    /**
     * Specifies an exponential sequence of buckets that have a width that is proportional to the value of
     * the lower bound. Each bucket represents a constant relative uncertainty on a specific value in the bucket.
     * Structure is documented below.
     * 
    */
    public Optional<MetricBucketOptionsExponentialBuckets> getExponentialBuckets() {
        return Optional.ofNullable(this.exponentialBuckets);
    }
    /**
     * Specifies a linear sequence of buckets that all have the same width (except overflow and underflow).
     * Each bucket represents a constant absolute uncertainty on the specific value in the bucket.
     * Structure is documented below.
     * 
    */
    public Optional<MetricBucketOptionsLinearBuckets> getLinearBuckets() {
        return Optional.ofNullable(this.linearBuckets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MetricBucketOptionsExplicitBuckets explicitBuckets;
        private @Nullable MetricBucketOptionsExponentialBuckets exponentialBuckets;
        private @Nullable MetricBucketOptionsLinearBuckets linearBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.explicitBuckets = defaults.explicitBuckets;
    	      this.exponentialBuckets = defaults.exponentialBuckets;
    	      this.linearBuckets = defaults.linearBuckets;
        }

        public Builder setExplicitBuckets(@Nullable MetricBucketOptionsExplicitBuckets explicitBuckets) {
            this.explicitBuckets = explicitBuckets;
            return this;
        }

        public Builder setExponentialBuckets(@Nullable MetricBucketOptionsExponentialBuckets exponentialBuckets) {
            this.exponentialBuckets = exponentialBuckets;
            return this;
        }

        public Builder setLinearBuckets(@Nullable MetricBucketOptionsLinearBuckets linearBuckets) {
            this.linearBuckets = linearBuckets;
            return this;
        }
        public MetricBucketOptions build() {
            return new MetricBucketOptions(explicitBuckets, exponentialBuckets, linearBuckets);
        }
    }
}
