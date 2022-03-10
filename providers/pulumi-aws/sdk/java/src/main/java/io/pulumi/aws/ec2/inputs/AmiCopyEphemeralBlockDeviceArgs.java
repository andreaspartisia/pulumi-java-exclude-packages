// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AmiCopyEphemeralBlockDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmiCopyEphemeralBlockDeviceArgs Empty = new AmiCopyEphemeralBlockDeviceArgs();

    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    @InputImport(name="deviceName")
      private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * A name for the ephemeral device, of the form "ephemeralN" where
     * *N* is a volume number starting from zero.
     * 
     */
    @InputImport(name="virtualName")
      private final @Nullable Input<String> virtualName;

    public Input<String> getVirtualName() {
        return this.virtualName == null ? Input.empty() : this.virtualName;
    }

    public AmiCopyEphemeralBlockDeviceArgs(
        @Nullable Input<String> deviceName,
        @Nullable Input<String> virtualName) {
        this.deviceName = deviceName;
        this.virtualName = virtualName;
    }

    private AmiCopyEphemeralBlockDeviceArgs() {
        this.deviceName = Input.empty();
        this.virtualName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiCopyEphemeralBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deviceName;
        private @Nullable Input<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiCopyEphemeralBlockDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setVirtualName(@Nullable Input<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = Input.ofNullable(virtualName);
            return this;
        }
        public AmiCopyEphemeralBlockDeviceArgs build() {
            return new AmiCopyEphemeralBlockDeviceArgs(deviceName, virtualName);
        }
    }
}