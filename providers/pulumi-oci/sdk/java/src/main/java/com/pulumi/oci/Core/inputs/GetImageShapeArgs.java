// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImageShapeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageShapeArgs Empty = new GetImageShapeArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
     * 
     */
    @Import(name="imageId", required=true)
    private String imageId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
     * 
     */
    public String imageId() {
        return this.imageId;
    }

    /**
     * Shape name.
     * 
     */
    @Import(name="shapeName", required=true)
    private String shapeName;

    /**
     * @return Shape name.
     * 
     */
    public String shapeName() {
        return this.shapeName;
    }

    private GetImageShapeArgs() {}

    private GetImageShapeArgs(GetImageShapeArgs $) {
        this.imageId = $.imageId;
        this.shapeName = $.shapeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageShapeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageShapeArgs $;

        public Builder() {
            $ = new GetImageShapeArgs();
        }

        public Builder(GetImageShapeArgs defaults) {
            $ = new GetImageShapeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param shapeName Shape name.
         * 
         * @return builder
         * 
         */
        public Builder shapeName(String shapeName) {
            $.shapeName = shapeName;
            return this;
        }

        public GetImageShapeArgs build() {
            $.imageId = Objects.requireNonNull($.imageId, "expected parameter 'imageId' to be non-null");
            $.shapeName = Objects.requireNonNull($.shapeName, "expected parameter 'shapeName' to be non-null");
            return $;
        }
    }

}
