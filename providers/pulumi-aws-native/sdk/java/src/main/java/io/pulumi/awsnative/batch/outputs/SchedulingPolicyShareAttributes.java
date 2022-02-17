// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.batch.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SchedulingPolicyShareAttributes {
    private final @Nullable String shareIdentifier;
    private final @Nullable Double weightFactor;

    @OutputCustomType.Constructor({"shareIdentifier","weightFactor"})
    private SchedulingPolicyShareAttributes(
        @Nullable String shareIdentifier,
        @Nullable Double weightFactor) {
        this.shareIdentifier = shareIdentifier;
        this.weightFactor = weightFactor;
    }

    public Optional<String> getShareIdentifier() {
        return Optional.ofNullable(this.shareIdentifier);
    }
    public Optional<Double> getWeightFactor() {
        return Optional.ofNullable(this.weightFactor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyShareAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String shareIdentifier;
        private @Nullable Double weightFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyShareAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareIdentifier = defaults.shareIdentifier;
    	      this.weightFactor = defaults.weightFactor;
        }

        public Builder setShareIdentifier(@Nullable String shareIdentifier) {
            this.shareIdentifier = shareIdentifier;
            return this;
        }

        public Builder setWeightFactor(@Nullable Double weightFactor) {
            this.weightFactor = weightFactor;
            return this;
        }

        public SchedulingPolicyShareAttributes build() {
            return new SchedulingPolicyShareAttributes(shareIdentifier, weightFactor);
        }
    }
}