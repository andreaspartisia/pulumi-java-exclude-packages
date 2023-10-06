// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyPostBreakpointTransformationOpacity {
    private @Nullable String opacity;
    private @Nullable String opacityVar;

    private GetImagingPolicyImagePolicyPostBreakpointTransformationOpacity() {}
    public Optional<String> opacity() {
        return Optional.ofNullable(this.opacity);
    }
    public Optional<String> opacityVar() {
        return Optional.ofNullable(this.opacityVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationOpacity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String opacity;
        private @Nullable String opacityVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationOpacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.opacity = defaults.opacity;
    	      this.opacityVar = defaults.opacityVar;
        }

        @CustomType.Setter
        public Builder opacity(@Nullable String opacity) {

            this.opacity = opacity;
            return this;
        }
        @CustomType.Setter
        public Builder opacityVar(@Nullable String opacityVar) {

            this.opacityVar = opacityVar;
            return this;
        }
        public GetImagingPolicyImagePolicyPostBreakpointTransformationOpacity build() {
            final var _resultValue = new GetImagingPolicyImagePolicyPostBreakpointTransformationOpacity();
            _resultValue.opacity = opacity;
            _resultValue.opacityVar = opacityVar;
            return _resultValue;
        }
    }
}
