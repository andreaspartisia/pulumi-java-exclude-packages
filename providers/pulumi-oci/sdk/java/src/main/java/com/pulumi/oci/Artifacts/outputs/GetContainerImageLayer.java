// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Artifacts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetContainerImageLayer {
    /**
     * @return The sha256 digest of the image layer.
     * 
     */
    private final String digest;
    /**
     * @return The size of the layer in bytes.
     * 
     */
    private final String sizeInBytes;
    /**
     * @return The creation time of the version.
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetContainerImageLayer(
        @CustomType.Parameter("digest") String digest,
        @CustomType.Parameter("sizeInBytes") String sizeInBytes,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.digest = digest;
        this.sizeInBytes = sizeInBytes;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The sha256 digest of the image layer.
     * 
     */
    public String digest() {
        return this.digest;
    }
    /**
     * @return The size of the layer in bytes.
     * 
     */
    public String sizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * @return The creation time of the version.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerImageLayer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String digest;
        private String sizeInBytes;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerImageLayer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder sizeInBytes(String sizeInBytes) {
            this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetContainerImageLayer build() {
            return new GetContainerImageLayer(digest, sizeInBytes, timeCreated);
        }
    }
}
