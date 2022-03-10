// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ImageInformationResponse {
    /**
     * Type of the image
     * 
     */
    private final String imageType;
    /**
     * Url of the image
     * 
     */
    private final String imageUrl;

    @OutputCustomType.Constructor
    private ImageInformationResponse(
        @OutputCustomType.Parameter("imageType") String imageType,
        @OutputCustomType.Parameter("imageUrl") String imageUrl) {
        this.imageType = imageType;
        this.imageUrl = imageUrl;
    }

    /**
     * Type of the image
     * 
    */
    public String getImageType() {
        return this.imageType;
    }
    /**
     * Url of the image
     * 
    */
    public String getImageUrl() {
        return this.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageType;
        private String imageUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageType = defaults.imageType;
    	      this.imageUrl = defaults.imageUrl;
        }

        public Builder setImageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = Objects.requireNonNull(imageUrl);
            return this;
        }
        public ImageInformationResponse build() {
            return new ImageInformationResponse(imageType, imageUrl);
        }
    }
}
