// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.BoundingPolyArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Image annotation.
 * 
 */
public final class ImageAnnotationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageAnnotationArgs Empty = new ImageAnnotationArgs();

    /**
     * The list of polygons outlining the sensitive regions in the image.
     * 
     */
    @Import(name="boundingPolys")
      private final @Nullable Output<List<BoundingPolyArgs>> boundingPolys;

    public Output<List<BoundingPolyArgs>> boundingPolys() {
        return this.boundingPolys == null ? Codegen.empty() : this.boundingPolys;
    }

    /**
     * 0-based index of the image frame. For example, an image frame in a DICOM instance.
     * 
     */
    @Import(name="frameIndex")
      private final @Nullable Output<Integer> frameIndex;

    public Output<Integer> frameIndex() {
        return this.frameIndex == null ? Codegen.empty() : this.frameIndex;
    }

    public ImageAnnotationArgs(
        @Nullable Output<List<BoundingPolyArgs>> boundingPolys,
        @Nullable Output<Integer> frameIndex) {
        this.boundingPolys = boundingPolys;
        this.frameIndex = frameIndex;
    }

    private ImageAnnotationArgs() {
        this.boundingPolys = Codegen.empty();
        this.frameIndex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageAnnotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BoundingPolyArgs>> boundingPolys;
        private @Nullable Output<Integer> frameIndex;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageAnnotationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boundingPolys = defaults.boundingPolys;
    	      this.frameIndex = defaults.frameIndex;
        }

        public Builder boundingPolys(@Nullable Output<List<BoundingPolyArgs>> boundingPolys) {
            this.boundingPolys = boundingPolys;
            return this;
        }
        public Builder boundingPolys(@Nullable List<BoundingPolyArgs> boundingPolys) {
            this.boundingPolys = Codegen.ofNullable(boundingPolys);
            return this;
        }
        public Builder boundingPolys(BoundingPolyArgs... boundingPolys) {
            return boundingPolys(List.of(boundingPolys));
        }
        public Builder frameIndex(@Nullable Output<Integer> frameIndex) {
            this.frameIndex = frameIndex;
            return this;
        }
        public Builder frameIndex(@Nullable Integer frameIndex) {
            this.frameIndex = Codegen.ofNullable(frameIndex);
            return this;
        }        public ImageAnnotationArgs build() {
            return new ImageAnnotationArgs(boundingPolys, frameIndex);
        }
    }
}
