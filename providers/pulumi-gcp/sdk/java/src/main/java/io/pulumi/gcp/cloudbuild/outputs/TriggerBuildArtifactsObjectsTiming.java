// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerBuildArtifactsObjectsTiming {
    /**
     * End of time span.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final @Nullable String endTime;
    /**
     * Start of time span.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final @Nullable String startTime;

    @OutputCustomType.Constructor({"endTime","startTime"})
    private TriggerBuildArtifactsObjectsTiming(
        @Nullable String endTime,
        @Nullable String startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    /**
     * End of time span.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Start of time span.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildArtifactsObjectsTiming defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTime;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildArtifactsObjectsTiming defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public TriggerBuildArtifactsObjectsTiming build() {
            return new TriggerBuildArtifactsObjectsTiming(endTime, startTime);
        }
    }
}