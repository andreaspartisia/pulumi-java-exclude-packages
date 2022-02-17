// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ImageGuestOsFeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageGuestOsFeatureArgs Empty = new ImageGuestOsFeatureArgs();

    /**
     * The type of supported feature. Read [Enabling guest operating system features](https://cloud.google.com/compute/docs/images/create-delete-deprecate-private-images#guest-os-features) to see a list of available options.
     * Possible values are `MULTI_IP_SUBNET`, `SECURE_BOOT`, `SEV_CAPABLE`, `UEFI_COMPATIBLE`, `VIRTIO_SCSI_MULTIQUEUE`, `WINDOWS`, and `GVNIC`.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ImageGuestOsFeatureArgs(Input<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ImageGuestOsFeatureArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageGuestOsFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageGuestOsFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ImageGuestOsFeatureArgs build() {
            return new ImageGuestOsFeatureArgs(type);
        }
    }
}