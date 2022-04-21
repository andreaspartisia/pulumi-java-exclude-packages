// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.StretchMode;
import com.pulumi.azurenative.media.enums.VideoSyncMode;
import com.pulumi.azurenative.media.inputs.JpgLayerArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties for producing a series of JPEG images from the input video.
 * 
 */
public final class JpgImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final JpgImageArgs Empty = new JpgImageArgs();

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    @Import(name="keyFrameInterval")
    private @Nullable Output<String> keyFrameInterval;

    public Optional<Output<String>> keyFrameInterval() {
        return Optional.ofNullable(this.keyFrameInterval);
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
     * A collection of output JPEG image layers to be produced by the encoder.
     * 
     */
    @Import(name="layers")
    private @Nullable Output<List<JpgLayerArgs>> layers;

    public Optional<Output<List<JpgLayerArgs>>> layers() {
        return Optional.ofNullable(this.layers);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JpgImage&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The position relative to transform preset start time in the input video at which to stop generating thumbnails. The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30 seconds from start time), or a frame count (For example, 300 to stop at the 300th frame from the frame at start time. If this value is 1, it means only producing one thumbnail at start time), or a relative value to the stream duration (For example, 50% to stop at half of stream duration from start time). The default value is 100%, which means to stop at the end of the stream.
     * 
     */
    @Import(name="range")
    private @Nullable Output<String> range;

    public Optional<Output<String>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * Sets the number of columns used in thumbnail sprite image.  The number of rows are automatically calculated and a VTT file is generated with the coordinate mappings for each thumbnail in the sprite. Note: this value should be a positive integer and a proper value is recommended so that the output image resolution will not go beyond JPEG maximum pixel resolution limit 65535x65535.
     * 
     */
    @Import(name="spriteColumn")
    private @Nullable Output<Integer> spriteColumn;

    public Optional<Output<Integer>> spriteColumn() {
        return Optional.ofNullable(this.spriteColumn);
    }

    /**
     * The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame), or a relative value to stream duration (For example, 10% to start at 10% of stream duration). Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video and will only produce one thumbnail, no matter what other settings are for Step and Range. The default value is macro {Best}.
     * 
     */
    @Import(name="start", required=true)
    private Output<String> start;

    public Output<String> start() {
        return this.start;
    }

    /**
     * The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, PT05S for one image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames), or a relative value to stream duration (For example, 10% for one image every 10% of stream duration). Note: Step value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step position from start time as the first output. As the default value is 10%, it means if stream has long duration, the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the first thumbnail is expected close to start time, or set Range value at 1 if only one thumbnail is needed at start time.
     * 
     */
    @Import(name="step")
    private @Nullable Output<String> step;

    public Optional<Output<String>> step() {
        return Optional.ofNullable(this.step);
    }

    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    @Import(name="stretchMode")
    private @Nullable Output<Either<String,StretchMode>> stretchMode;

    public Optional<Output<Either<String,StretchMode>>> stretchMode() {
        return Optional.ofNullable(this.stretchMode);
    }

    /**
     * The Video Sync Mode
     * 
     */
    @Import(name="syncMode")
    private @Nullable Output<Either<String,VideoSyncMode>> syncMode;

    public Optional<Output<Either<String,VideoSyncMode>>> syncMode() {
        return Optional.ofNullable(this.syncMode);
    }

    private JpgImageArgs() {}

    private JpgImageArgs(JpgImageArgs $) {
        this.keyFrameInterval = $.keyFrameInterval;
        this.label = $.label;
        this.layers = $.layers;
        this.odataType = $.odataType;
        this.range = $.range;
        this.spriteColumn = $.spriteColumn;
        this.start = $.start;
        this.step = $.step;
        this.stretchMode = $.stretchMode;
        this.syncMode = $.syncMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JpgImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JpgImageArgs $;

        public Builder() {
            $ = new JpgImageArgs();
        }

        public Builder(JpgImageArgs defaults) {
            $ = new JpgImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyFrameInterval(@Nullable Output<String> keyFrameInterval) {
            $.keyFrameInterval = keyFrameInterval;
            return this;
        }

        public Builder keyFrameInterval(String keyFrameInterval) {
            return keyFrameInterval(Output.of(keyFrameInterval));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder layers(@Nullable Output<List<JpgLayerArgs>> layers) {
            $.layers = layers;
            return this;
        }

        public Builder layers(List<JpgLayerArgs> layers) {
            return layers(Output.of(layers));
        }

        public Builder layers(JpgLayerArgs... layers) {
            return layers(List.of(layers));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public Builder range(@Nullable Output<String> range) {
            $.range = range;
            return this;
        }

        public Builder range(String range) {
            return range(Output.of(range));
        }

        public Builder spriteColumn(@Nullable Output<Integer> spriteColumn) {
            $.spriteColumn = spriteColumn;
            return this;
        }

        public Builder spriteColumn(Integer spriteColumn) {
            return spriteColumn(Output.of(spriteColumn));
        }

        public Builder start(Output<String> start) {
            $.start = start;
            return this;
        }

        public Builder start(String start) {
            return start(Output.of(start));
        }

        public Builder step(@Nullable Output<String> step) {
            $.step = step;
            return this;
        }

        public Builder step(String step) {
            return step(Output.of(step));
        }

        public Builder stretchMode(@Nullable Output<Either<String,StretchMode>> stretchMode) {
            $.stretchMode = stretchMode;
            return this;
        }

        public Builder stretchMode(Either<String,StretchMode> stretchMode) {
            return stretchMode(Output.of(stretchMode));
        }

        public Builder stretchMode(String stretchMode) {
            return stretchMode(Either.ofLeft(stretchMode));
        }

        public Builder stretchMode(StretchMode stretchMode) {
            return stretchMode(Either.ofRight(stretchMode));
        }

        public Builder syncMode(@Nullable Output<Either<String,VideoSyncMode>> syncMode) {
            $.syncMode = syncMode;
            return this;
        }

        public Builder syncMode(Either<String,VideoSyncMode> syncMode) {
            return syncMode(Output.of(syncMode));
        }

        public Builder syncMode(String syncMode) {
            return syncMode(Either.ofLeft(syncMode));
        }

        public Builder syncMode(VideoSyncMode syncMode) {
            return syncMode(Either.ofRight(syncMode));
        }

        public JpgImageArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            return $;
        }
    }

}
