// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CachePatchSchedule {
    private final String dayOfWeek;
    private final @Nullable String maintenanceWindow;
    private final @Nullable Integer startHourUtc;

    @CustomType.Constructor
    private CachePatchSchedule(
        @CustomType.Parameter("dayOfWeek") String dayOfWeek,
        @CustomType.Parameter("maintenanceWindow") @Nullable String maintenanceWindow,
        @CustomType.Parameter("startHourUtc") @Nullable Integer startHourUtc) {
        this.dayOfWeek = dayOfWeek;
        this.maintenanceWindow = maintenanceWindow;
        this.startHourUtc = startHourUtc;
    }

    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    public Optional<String> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }
    public Optional<Integer> startHourUtc() {
        return Optional.ofNullable(this.startHourUtc);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePatchSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private @Nullable String maintenanceWindow;
        private @Nullable Integer startHourUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePatchSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.startHourUtc = defaults.startHourUtc;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        public Builder maintenanceWindow(@Nullable String maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public Builder startHourUtc(@Nullable Integer startHourUtc) {
            this.startHourUtc = startHourUtc;
            return this;
        }        public CachePatchSchedule build() {
            return new CachePatchSchedule(dayOfWeek, maintenanceWindow, startHourUtc);
        }
    }
}
