// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.awsnative.dynamodb.outputs.GlobalTableCapacityAutoScalingSettings;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalTableWriteProvisionedThroughputSettings {
    private final @Nullable GlobalTableCapacityAutoScalingSettings writeCapacityAutoScalingSettings;

    @OutputCustomType.Constructor({"writeCapacityAutoScalingSettings"})
    private GlobalTableWriteProvisionedThroughputSettings(@Nullable GlobalTableCapacityAutoScalingSettings writeCapacityAutoScalingSettings) {
        this.writeCapacityAutoScalingSettings = writeCapacityAutoScalingSettings;
    }

    public Optional<GlobalTableCapacityAutoScalingSettings> getWriteCapacityAutoScalingSettings() {
        return Optional.ofNullable(this.writeCapacityAutoScalingSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableWriteProvisionedThroughputSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GlobalTableCapacityAutoScalingSettings writeCapacityAutoScalingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableWriteProvisionedThroughputSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.writeCapacityAutoScalingSettings = defaults.writeCapacityAutoScalingSettings;
        }

        public Builder setWriteCapacityAutoScalingSettings(@Nullable GlobalTableCapacityAutoScalingSettings writeCapacityAutoScalingSettings) {
            this.writeCapacityAutoScalingSettings = writeCapacityAutoScalingSettings;
            return this;
        }

        public GlobalTableWriteProvisionedThroughputSettings build() {
            return new GlobalTableWriteProvisionedThroughputSettings(writeCapacityAutoScalingSettings);
        }
    }
}