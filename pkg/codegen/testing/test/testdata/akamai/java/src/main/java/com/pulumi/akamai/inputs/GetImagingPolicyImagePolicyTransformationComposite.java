// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationCompositeImage;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationComposite extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationComposite Empty = new GetImagingPolicyImagePolicyTransformationComposite();

    @Import(name="gravity")
    private @Nullable String gravity;

    public Optional<String> gravity() {
        return Optional.ofNullable(this.gravity);
    }

    @Import(name="gravityVar")
    private @Nullable String gravityVar;

    public Optional<String> gravityVar() {
        return Optional.ofNullable(this.gravityVar);
    }

    @Import(name="image", required=true)
    private GetImagingPolicyImagePolicyTransformationCompositeImage image;

    public GetImagingPolicyImagePolicyTransformationCompositeImage image() {
        return this.image;
    }

    @Import(name="placement")
    private @Nullable String placement;

    public Optional<String> placement() {
        return Optional.ofNullable(this.placement);
    }

    @Import(name="placementVar")
    private @Nullable String placementVar;

    public Optional<String> placementVar() {
        return Optional.ofNullable(this.placementVar);
    }

    @Import(name="scale")
    private @Nullable String scale;

    public Optional<String> scale() {
        return Optional.ofNullable(this.scale);
    }

    @Import(name="scaleDimension")
    private @Nullable String scaleDimension;

    public Optional<String> scaleDimension() {
        return Optional.ofNullable(this.scaleDimension);
    }

    @Import(name="scaleDimensionVar")
    private @Nullable String scaleDimensionVar;

    public Optional<String> scaleDimensionVar() {
        return Optional.ofNullable(this.scaleDimensionVar);
    }

    @Import(name="scaleVar")
    private @Nullable String scaleVar;

    public Optional<String> scaleVar() {
        return Optional.ofNullable(this.scaleVar);
    }

    @Import(name="xPosition")
    private @Nullable String xPosition;

    public Optional<String> xPosition() {
        return Optional.ofNullable(this.xPosition);
    }

    @Import(name="xPositionVar")
    private @Nullable String xPositionVar;

    public Optional<String> xPositionVar() {
        return Optional.ofNullable(this.xPositionVar);
    }

    @Import(name="yPosition")
    private @Nullable String yPosition;

    public Optional<String> yPosition() {
        return Optional.ofNullable(this.yPosition);
    }

    @Import(name="yPositionVar")
    private @Nullable String yPositionVar;

    public Optional<String> yPositionVar() {
        return Optional.ofNullable(this.yPositionVar);
    }

    private GetImagingPolicyImagePolicyTransformationComposite() {}

    private GetImagingPolicyImagePolicyTransformationComposite(GetImagingPolicyImagePolicyTransformationComposite $) {
        this.gravity = $.gravity;
        this.gravityVar = $.gravityVar;
        this.image = $.image;
        this.placement = $.placement;
        this.placementVar = $.placementVar;
        this.scale = $.scale;
        this.scaleDimension = $.scaleDimension;
        this.scaleDimensionVar = $.scaleDimensionVar;
        this.scaleVar = $.scaleVar;
        this.xPosition = $.xPosition;
        this.xPositionVar = $.xPositionVar;
        this.yPosition = $.yPosition;
        this.yPositionVar = $.yPositionVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationComposite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationComposite $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationComposite();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationComposite defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationComposite(Objects.requireNonNull(defaults));
        }

        public Builder gravity(@Nullable String gravity) {
            $.gravity = gravity;
            return this;
        }

        public Builder gravityVar(@Nullable String gravityVar) {
            $.gravityVar = gravityVar;
            return this;
        }

        public Builder image(GetImagingPolicyImagePolicyTransformationCompositeImage image) {
            $.image = image;
            return this;
        }

        public Builder placement(@Nullable String placement) {
            $.placement = placement;
            return this;
        }

        public Builder placementVar(@Nullable String placementVar) {
            $.placementVar = placementVar;
            return this;
        }

        public Builder scale(@Nullable String scale) {
            $.scale = scale;
            return this;
        }

        public Builder scaleDimension(@Nullable String scaleDimension) {
            $.scaleDimension = scaleDimension;
            return this;
        }

        public Builder scaleDimensionVar(@Nullable String scaleDimensionVar) {
            $.scaleDimensionVar = scaleDimensionVar;
            return this;
        }

        public Builder scaleVar(@Nullable String scaleVar) {
            $.scaleVar = scaleVar;
            return this;
        }

        public Builder xPosition(@Nullable String xPosition) {
            $.xPosition = xPosition;
            return this;
        }

        public Builder xPositionVar(@Nullable String xPositionVar) {
            $.xPositionVar = xPositionVar;
            return this;
        }

        public Builder yPosition(@Nullable String yPosition) {
            $.yPosition = yPosition;
            return this;
        }

        public Builder yPositionVar(@Nullable String yPositionVar) {
            $.yPositionVar = yPositionVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationComposite build() {
            if ($.image == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyImagePolicyTransformationComposite", "image");
            }
            return $;
        }
    }

}
