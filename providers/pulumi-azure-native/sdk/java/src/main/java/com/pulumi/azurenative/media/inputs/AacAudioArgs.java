// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.AacAudioProfile;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes Advanced Audio Codec (AAC) audio encoding settings.
 * 
 */
public final class AacAudioArgs extends com.pulumi.resources.ResourceArgs {

    public static final AacAudioArgs Empty = new AacAudioArgs();

    /**
     * The bitrate, in bits per second, of the output encoded audio.
     * 
     */
    @Import(name="bitrate")
    private @Nullable Output<Integer> bitrate;

    public Optional<Output<Integer>> bitrate() {
        return Optional.ofNullable(this.bitrate);
    }

    /**
     * The number of channels in the audio.
     * 
     */
    @Import(name="channels")
    private @Nullable Output<Integer> channels;

    public Optional<Output<Integer>> channels() {
        return Optional.ofNullable(this.channels);
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.AacAudio&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The encoding profile to be used when encoding audio with AAC.
     * 
     */
    @Import(name="profile")
    private @Nullable Output<Either<String,AacAudioProfile>> profile;

    public Optional<Output<Either<String,AacAudioProfile>>> profile() {
        return Optional.ofNullable(this.profile);
    }

    /**
     * The sampling rate to use for encoding in hertz.
     * 
     */
    @Import(name="samplingRate")
    private @Nullable Output<Integer> samplingRate;

    public Optional<Output<Integer>> samplingRate() {
        return Optional.ofNullable(this.samplingRate);
    }

    private AacAudioArgs() {}

    private AacAudioArgs(AacAudioArgs $) {
        this.bitrate = $.bitrate;
        this.channels = $.channels;
        this.label = $.label;
        this.odataType = $.odataType;
        this.profile = $.profile;
        this.samplingRate = $.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AacAudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AacAudioArgs $;

        public Builder() {
            $ = new AacAudioArgs();
        }

        public Builder(AacAudioArgs defaults) {
            $ = new AacAudioArgs(Objects.requireNonNull(defaults));
        }

        public Builder bitrate(@Nullable Output<Integer> bitrate) {
            $.bitrate = bitrate;
            return this;
        }

        public Builder bitrate(Integer bitrate) {
            return bitrate(Output.of(bitrate));
        }

        public Builder channels(@Nullable Output<Integer> channels) {
            $.channels = channels;
            return this;
        }

        public Builder channels(Integer channels) {
            return channels(Output.of(channels));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public Builder profile(@Nullable Output<Either<String,AacAudioProfile>> profile) {
            $.profile = profile;
            return this;
        }

        public Builder profile(Either<String,AacAudioProfile> profile) {
            return profile(Output.of(profile));
        }

        public Builder profile(String profile) {
            return profile(Either.ofLeft(profile));
        }

        public Builder profile(AacAudioProfile profile) {
            return profile(Either.ofRight(profile));
        }

        public Builder samplingRate(@Nullable Output<Integer> samplingRate) {
            $.samplingRate = samplingRate;
            return this;
        }

        public Builder samplingRate(Integer samplingRate) {
            return samplingRate(Output.of(samplingRate));
        }

        public AacAudioArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
