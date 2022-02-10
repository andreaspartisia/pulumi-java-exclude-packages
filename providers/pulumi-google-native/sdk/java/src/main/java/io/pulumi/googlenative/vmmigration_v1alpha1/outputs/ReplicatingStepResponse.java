// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReplicatingStepResponse {
    private final String lastThirtyMinutesAverageBytesPerSecond;
    private final String lastTwoMinutesAverageBytesPerSecond;
    private final String replicatedBytes;
    private final String totalBytes;

    @OutputCustomType.Constructor({"lastThirtyMinutesAverageBytesPerSecond","lastTwoMinutesAverageBytesPerSecond","replicatedBytes","totalBytes"})
    private ReplicatingStepResponse(
        String lastThirtyMinutesAverageBytesPerSecond,
        String lastTwoMinutesAverageBytesPerSecond,
        String replicatedBytes,
        String totalBytes) {
        this.lastThirtyMinutesAverageBytesPerSecond = Objects.requireNonNull(lastThirtyMinutesAverageBytesPerSecond);
        this.lastTwoMinutesAverageBytesPerSecond = Objects.requireNonNull(lastTwoMinutesAverageBytesPerSecond);
        this.replicatedBytes = Objects.requireNonNull(replicatedBytes);
        this.totalBytes = Objects.requireNonNull(totalBytes);
    }

    public String getLastThirtyMinutesAverageBytesPerSecond() {
        return this.lastThirtyMinutesAverageBytesPerSecond;
    }
    public String getLastTwoMinutesAverageBytesPerSecond() {
        return this.lastTwoMinutesAverageBytesPerSecond;
    }
    public String getReplicatedBytes() {
        return this.replicatedBytes;
    }
    public String getTotalBytes() {
        return this.totalBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicatingStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastThirtyMinutesAverageBytesPerSecond;
        private String lastTwoMinutesAverageBytesPerSecond;
        private String replicatedBytes;
        private String totalBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicatingStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastThirtyMinutesAverageBytesPerSecond = defaults.lastThirtyMinutesAverageBytesPerSecond;
    	      this.lastTwoMinutesAverageBytesPerSecond = defaults.lastTwoMinutesAverageBytesPerSecond;
    	      this.replicatedBytes = defaults.replicatedBytes;
    	      this.totalBytes = defaults.totalBytes;
        }

        public Builder setLastThirtyMinutesAverageBytesPerSecond(String lastThirtyMinutesAverageBytesPerSecond) {
            this.lastThirtyMinutesAverageBytesPerSecond = Objects.requireNonNull(lastThirtyMinutesAverageBytesPerSecond);
            return this;
        }

        public Builder setLastTwoMinutesAverageBytesPerSecond(String lastTwoMinutesAverageBytesPerSecond) {
            this.lastTwoMinutesAverageBytesPerSecond = Objects.requireNonNull(lastTwoMinutesAverageBytesPerSecond);
            return this;
        }

        public Builder setReplicatedBytes(String replicatedBytes) {
            this.replicatedBytes = Objects.requireNonNull(replicatedBytes);
            return this;
        }

        public Builder setTotalBytes(String totalBytes) {
            this.totalBytes = Objects.requireNonNull(totalBytes);
            return this;
        }

        public ReplicatingStepResponse build() {
            return new ReplicatingStepResponse(lastThirtyMinutesAverageBytesPerSecond, lastTwoMinutesAverageBytesPerSecond, replicatedBytes, totalBytes);
        }
    }
}