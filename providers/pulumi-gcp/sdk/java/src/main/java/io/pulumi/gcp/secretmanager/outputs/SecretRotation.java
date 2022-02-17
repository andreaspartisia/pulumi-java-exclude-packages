// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecretRotation {
    /**
     * Timestamp in UTC at which the Secret is scheduled to rotate.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final @Nullable String nextRotationTime;
    /**
     * The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
     * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
     * 
     */
    private final @Nullable String rotationPeriod;

    @OutputCustomType.Constructor({"nextRotationTime","rotationPeriod"})
    private SecretRotation(
        @Nullable String nextRotationTime,
        @Nullable String rotationPeriod) {
        this.nextRotationTime = nextRotationTime;
        this.rotationPeriod = rotationPeriod;
    }

    /**
     * Timestamp in UTC at which the Secret is scheduled to rotate.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Optional<String> getNextRotationTime() {
        return Optional.ofNullable(this.nextRotationTime);
    }
    /**
     * The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
     * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
     * 
     */
    public Optional<String> getRotationPeriod() {
        return Optional.ofNullable(this.rotationPeriod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretRotation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextRotationTime;
        private @Nullable String rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretRotation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder setNextRotationTime(@Nullable String nextRotationTime) {
            this.nextRotationTime = nextRotationTime;
            return this;
        }

        public Builder setRotationPeriod(@Nullable String rotationPeriod) {
            this.rotationPeriod = rotationPeriod;
            return this;
        }

        public SecretRotation build() {
            return new SecretRotation(nextRotationTime, rotationPeriod);
        }
    }
}