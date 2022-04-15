// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.transcoder_v1.inputs.AnimationEndArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.AnimationFadeArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.AnimationStaticArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Animation types.
 * 
 */
public final class AnimationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnimationArgs Empty = new AnimationArgs();

    /**
     * End previous animation.
     * 
     */
    @Import(name="animationEnd")
      private final @Nullable Output<AnimationEndArgs> animationEnd;

    public Output<AnimationEndArgs> animationEnd() {
        return this.animationEnd == null ? Codegen.empty() : this.animationEnd;
    }

    /**
     * Display overlay object with fade animation.
     * 
     */
    @Import(name="animationFade")
      private final @Nullable Output<AnimationFadeArgs> animationFade;

    public Output<AnimationFadeArgs> animationFade() {
        return this.animationFade == null ? Codegen.empty() : this.animationFade;
    }

    /**
     * Display static overlay object.
     * 
     */
    @Import(name="animationStatic")
      private final @Nullable Output<AnimationStaticArgs> animationStatic;

    public Output<AnimationStaticArgs> animationStatic() {
        return this.animationStatic == null ? Codegen.empty() : this.animationStatic;
    }

    public AnimationArgs(
        @Nullable Output<AnimationEndArgs> animationEnd,
        @Nullable Output<AnimationFadeArgs> animationFade,
        @Nullable Output<AnimationStaticArgs> animationStatic) {
        this.animationEnd = animationEnd;
        this.animationFade = animationFade;
        this.animationStatic = animationStatic;
    }

    private AnimationArgs() {
        this.animationEnd = Codegen.empty();
        this.animationFade = Codegen.empty();
        this.animationStatic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AnimationEndArgs> animationEnd;
        private @Nullable Output<AnimationFadeArgs> animationFade;
        private @Nullable Output<AnimationStaticArgs> animationStatic;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.animationEnd = defaults.animationEnd;
    	      this.animationFade = defaults.animationFade;
    	      this.animationStatic = defaults.animationStatic;
        }

        public Builder animationEnd(@Nullable Output<AnimationEndArgs> animationEnd) {
            this.animationEnd = animationEnd;
            return this;
        }
        public Builder animationEnd(@Nullable AnimationEndArgs animationEnd) {
            this.animationEnd = Codegen.ofNullable(animationEnd);
            return this;
        }
        public Builder animationFade(@Nullable Output<AnimationFadeArgs> animationFade) {
            this.animationFade = animationFade;
            return this;
        }
        public Builder animationFade(@Nullable AnimationFadeArgs animationFade) {
            this.animationFade = Codegen.ofNullable(animationFade);
            return this;
        }
        public Builder animationStatic(@Nullable Output<AnimationStaticArgs> animationStatic) {
            this.animationStatic = animationStatic;
            return this;
        }
        public Builder animationStatic(@Nullable AnimationStaticArgs animationStatic) {
            this.animationStatic = Codegen.ofNullable(animationStatic);
            return this;
        }        public AnimationArgs build() {
            return new AnimationArgs(animationEnd, animationFade, animationStatic);
        }
    }
}
