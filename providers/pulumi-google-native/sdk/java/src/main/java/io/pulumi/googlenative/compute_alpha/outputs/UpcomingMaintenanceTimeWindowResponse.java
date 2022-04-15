// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UpcomingMaintenanceTimeWindowResponse {
    private final String earliest;
    private final String latest;

    @CustomType.Constructor
    private UpcomingMaintenanceTimeWindowResponse(
        @CustomType.Parameter("earliest") String earliest,
        @CustomType.Parameter("latest") String latest) {
        this.earliest = earliest;
        this.latest = latest;
    }

    public String earliest() {
        return this.earliest;
    }
    public String latest() {
        return this.latest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpcomingMaintenanceTimeWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String earliest;
        private String latest;

        public Builder() {
    	      // Empty
        }

        public Builder(UpcomingMaintenanceTimeWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.earliest = defaults.earliest;
    	      this.latest = defaults.latest;
        }

        public Builder earliest(String earliest) {
            this.earliest = Objects.requireNonNull(earliest);
            return this;
        }
        public Builder latest(String latest) {
            this.latest = Objects.requireNonNull(latest);
            return this;
        }        public UpcomingMaintenanceTimeWindowResponse build() {
            return new UpcomingMaintenanceTimeWindowResponse(earliest, latest);
        }
    }
}
