// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ImageInformationResponse {
    /**
     * @return Type of the image
     * 
     */
    private String imageType;
    /**
     * @return Url of the image
     * 
     */
    private String imageUrl;

    private ImageInformationResponse() {}
    /**
     * @return Type of the image
     * 
     */
    public String imageType() {
        return this.imageType;
    }
    /**
     * @return Url of the image
     * 
     */
    public String imageUrl() {
        return this.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageInformationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String imageType;
        private String imageUrl;
        public Builder() {}
        public Builder(ImageInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageType = defaults.imageType;
    	      this.imageUrl = defaults.imageUrl;
        }

        @CustomType.Setter
        public Builder imageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }
        @CustomType.Setter
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = Objects.requireNonNull(imageUrl);
            return this;
        }
        public ImageInformationResponse build() {
            final var o = new ImageInformationResponse();
            o.imageType = imageType;
            o.imageUrl = imageUrl;
            return o;
        }
    }
}
