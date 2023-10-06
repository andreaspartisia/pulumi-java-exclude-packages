// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyPostBreakpointTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage {
    private @Nullable String color;
    private @Nullable String colorVar;
    private @Nullable String diameter;
    private @Nullable String diameterVar;
    private @Nullable GetImagingPolicyImagePolicyPostBreakpointTransformation transformation;
    private @Nullable String width;
    private @Nullable String widthVar;

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage() {}
    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }
    public Optional<String> colorVar() {
        return Optional.ofNullable(this.colorVar);
    }
    public Optional<String> diameter() {
        return Optional.ofNullable(this.diameter);
    }
    public Optional<String> diameterVar() {
        return Optional.ofNullable(this.diameterVar);
    }
    public Optional<GetImagingPolicyImagePolicyPostBreakpointTransformation> transformation() {
        return Optional.ofNullable(this.transformation);
    }
    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }
    public Optional<String> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String color;
        private @Nullable String colorVar;
        private @Nullable String diameter;
        private @Nullable String diameterVar;
        private @Nullable GetImagingPolicyImagePolicyPostBreakpointTransformation transformation;
        private @Nullable String width;
        private @Nullable String widthVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.colorVar = defaults.colorVar;
    	      this.diameter = defaults.diameter;
    	      this.diameterVar = defaults.diameterVar;
    	      this.transformation = defaults.transformation;
    	      this.width = defaults.width;
    	      this.widthVar = defaults.widthVar;
        }

        @CustomType.Setter
        public Builder color(@Nullable String color) {

            this.color = color;
            return this;
        }
        @CustomType.Setter
        public Builder colorVar(@Nullable String colorVar) {

            this.colorVar = colorVar;
            return this;
        }
        @CustomType.Setter
        public Builder diameter(@Nullable String diameter) {

            this.diameter = diameter;
            return this;
        }
        @CustomType.Setter
        public Builder diameterVar(@Nullable String diameterVar) {

            this.diameterVar = diameterVar;
            return this;
        }
        @CustomType.Setter
        public Builder transformation(@Nullable GetImagingPolicyImagePolicyPostBreakpointTransformation transformation) {

            this.transformation = transformation;
            return this;
        }
        @CustomType.Setter
        public Builder width(@Nullable String width) {

            this.width = width;
            return this;
        }
        @CustomType.Setter
        public Builder widthVar(@Nullable String widthVar) {

            this.widthVar = widthVar;
            return this;
        }
        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage build() {
            final var _resultValue = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage();
            _resultValue.color = color;
            _resultValue.colorVar = colorVar;
            _resultValue.diameter = diameter;
            _resultValue.diameterVar = diameterVar;
            _resultValue.transformation = transformation;
            _resultValue.width = width;
            _resultValue.widthVar = widthVar;
            return _resultValue;
        }
    }
}
