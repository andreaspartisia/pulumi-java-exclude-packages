// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.docker.inputs.VolumeLabelArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * Driver type for the volume. Defaults to `local`.
     * 
     */
    @InputImport(name="driver")
      private final @Nullable Input<String> driver;

    public Input<String> getDriver() {
        return this.driver == null ? Input.empty() : this.driver;
    }

    /**
     * Options specific to the driver.
     * 
     */
    @InputImport(name="driverOpts")
      private final @Nullable Input<Map<String,Object>> driverOpts;

    public Input<Map<String,Object>> getDriverOpts() {
        return this.driverOpts == null ? Input.empty() : this.driverOpts;
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<List<VolumeLabelArgs>> labels;

    public Input<List<VolumeLabelArgs>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The name of the Docker volume (will be generated if not provided).
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public VolumeArgs(
        @Nullable Input<String> driver,
        @Nullable Input<Map<String,Object>> driverOpts,
        @Nullable Input<List<VolumeLabelArgs>> labels,
        @Nullable Input<String> name) {
        this.driver = driver;
        this.driverOpts = driverOpts;
        this.labels = labels;
        this.name = name;
    }

    private VolumeArgs() {
        this.driver = Input.empty();
        this.driverOpts = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> driver;
        private @Nullable Input<Map<String,Object>> driverOpts;
        private @Nullable Input<List<VolumeLabelArgs>> labels;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.driverOpts = defaults.driverOpts;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder setDriver(@Nullable Input<String> driver) {
            this.driver = driver;
            return this;
        }

        public Builder setDriver(@Nullable String driver) {
            this.driver = Input.ofNullable(driver);
            return this;
        }

        public Builder setDriverOpts(@Nullable Input<Map<String,Object>> driverOpts) {
            this.driverOpts = driverOpts;
            return this;
        }

        public Builder setDriverOpts(@Nullable Map<String,Object> driverOpts) {
            this.driverOpts = Input.ofNullable(driverOpts);
            return this;
        }

        public Builder setLabels(@Nullable Input<List<VolumeLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable List<VolumeLabelArgs> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public VolumeArgs build() {
            return new VolumeArgs(driver, driverOpts, labels, name);
        }
    }
}
