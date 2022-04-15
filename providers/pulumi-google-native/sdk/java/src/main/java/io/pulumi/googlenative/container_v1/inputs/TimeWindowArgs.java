// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.container_v1.inputs.MaintenanceExclusionOptionsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an arbitrary window of time.
 * 
 */
public final class TimeWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeWindowArgs Empty = new TimeWindowArgs();

    /**
     * The time that the window ends. The end time should take place after the start time.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> endTime() {
        return this.endTime == null ? Codegen.empty() : this.endTime;
    }

    /**
     * MaintenanceExclusionOptions provides maintenance exclusion related options.
     * 
     */
    @Import(name="maintenanceExclusionOptions")
      private final @Nullable Output<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions;

    public Output<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions() {
        return this.maintenanceExclusionOptions == null ? Codegen.empty() : this.maintenanceExclusionOptions;
    }

    /**
     * The time that the window first starts.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    public TimeWindowArgs(
        @Nullable Output<String> endTime,
        @Nullable Output<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions,
        @Nullable Output<String> startTime) {
        this.endTime = endTime;
        this.maintenanceExclusionOptions = maintenanceExclusionOptions;
        this.startTime = startTime;
    }

    private TimeWindowArgs() {
        this.endTime = Codegen.empty();
        this.maintenanceExclusionOptions = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endTime;
        private @Nullable Output<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.maintenanceExclusionOptions = defaults.maintenanceExclusionOptions;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Codegen.ofNullable(endTime);
            return this;
        }
        public Builder maintenanceExclusionOptions(@Nullable Output<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions) {
            this.maintenanceExclusionOptions = maintenanceExclusionOptions;
            return this;
        }
        public Builder maintenanceExclusionOptions(@Nullable MaintenanceExclusionOptionsArgs maintenanceExclusionOptions) {
            this.maintenanceExclusionOptions = Codegen.ofNullable(maintenanceExclusionOptions);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }        public TimeWindowArgs build() {
            return new TimeWindowArgs(endTime, maintenanceExclusionOptions, startTime);
        }
    }
}
