// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Guest OS features for boot disk.
 * 
 */
public final class GuestOsFeatureResponse extends io.pulumi.resources.InvokeArgs {

    public static final GuestOsFeatureResponse Empty = new GuestOsFeatureResponse();

    /**
     * The ID of a supported feature. Read Enabling guest operating system features to see a list of available options. Valid values: * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GuestOsFeatureResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GuestOsFeatureResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestOsFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestOsFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GuestOsFeatureResponse build() {
            return new GuestOsFeatureResponse(type);
        }
    }
}
