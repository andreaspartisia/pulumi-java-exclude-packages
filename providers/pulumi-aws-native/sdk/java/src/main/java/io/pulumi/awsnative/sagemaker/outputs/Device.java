// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Device {
    /**
     * Description of the device
     * 
     */
    private final @Nullable String description;
    /**
     * The name of the device
     * 
     */
    private final String deviceName;
    /**
     * AWS Internet of Things (IoT) object name.
     * 
     */
    private final @Nullable String iotThingName;

    @OutputCustomType.Constructor({"description","deviceName","iotThingName"})
    private Device(
        @Nullable String description,
        String deviceName,
        @Nullable String iotThingName) {
        this.description = description;
        this.deviceName = Objects.requireNonNull(deviceName);
        this.iotThingName = iotThingName;
    }

    /**
     * Description of the device
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The name of the device
     * 
     */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * AWS Internet of Things (IoT) object name.
     * 
     */
    public Optional<String> getIotThingName() {
        return Optional.ofNullable(this.iotThingName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Device defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String deviceName;
        private @Nullable String iotThingName;

        public Builder() {
    	      // Empty
        }

        public Builder(Device defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceName = defaults.deviceName;
    	      this.iotThingName = defaults.iotThingName;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setIotThingName(@Nullable String iotThingName) {
            this.iotThingName = iotThingName;
            return this;
        }

        public Device build() {
            return new Device(description, deviceName, iotThingName);
        }
    }
}