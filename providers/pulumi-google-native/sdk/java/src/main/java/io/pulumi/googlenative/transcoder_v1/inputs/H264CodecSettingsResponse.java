// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * H264 codec settings.
 * 
 */
public final class H264CodecSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final H264CodecSettingsResponse Empty = new H264CodecSettingsResponse();

    /**
     * Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The default is `false`.
     * 
     */
    @Import(name="allowOpenGop", required=true)
      private final Boolean allowOpenGop;

    public Boolean allowOpenGop() {
        return this.allowOpenGop;
    }

    /**
     * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate but smoother image. The default is 0.
     * 
     */
    @Import(name="aqStrength", required=true)
      private final Double aqStrength;

    public Double aqStrength() {
        return this.aqStrength;
    }

    /**
     * The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than `VideoStream.gop_frame_count` if set. The default is 0.
     * 
     */
    @Import(name="bFrameCount", required=true)
      private final Integer bFrameCount;

    public Integer bFrameCount() {
        return this.bFrameCount;
    }

    /**
     * Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The default is `false`.
     * 
     */
    @Import(name="bPyramid", required=true)
      private final Boolean bPyramid;

    public Boolean bPyramid() {
        return this.bPyramid;
    }

    /**
     * The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 800,000,000.
     * 
     */
    @Import(name="bitrateBps", required=true)
      private final Integer bitrateBps;

    public Integer bitrateBps() {
        return this.bitrateBps;
    }

    /**
     * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21.
     * 
     */
    @Import(name="crfLevel", required=true)
      private final Integer crfLevel;

    public Integer crfLevel() {
        return this.crfLevel;
    }

    /**
     * Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode` must be `vbr`. The default is `false`.
     * 
     */
    @Import(name="enableTwoPass", required=true)
      private final Boolean enableTwoPass;

    public Boolean enableTwoPass() {
        return this.enableTwoPass;
    }

    /**
     * The entropy coder to use. The default is `cabac`. Supported entropy coders: - `cavlc` - `cabac`
     * 
     */
    @Import(name="entropyCoder", required=true)
      private final String entropyCoder;

    public String entropyCoder() {
        return this.entropyCoder;
    }

    /**
     * The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
     */
    @Import(name="frameRate", required=true)
      private final Double frameRate;

    public Double frameRate() {
        return this.frameRate;
    }

    /**
     * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
     */
    @Import(name="gopDuration", required=true)
      private final String gopDuration;

    public String gopDuration() {
        return this.gopDuration;
    }

    /**
     * Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
     */
    @Import(name="gopFrameCount", required=true)
      private final Integer gopFrameCount;

    public Integer gopFrameCount() {
        return this.gopFrameCount;
    }

    /**
     * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
     */
    @Import(name="heightPixels", required=true)
      private final Integer heightPixels;

    public Integer heightPixels() {
        return this.heightPixels;
    }

    /**
     * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
     */
    @Import(name="pixelFormat", required=true)
      private final String pixelFormat;

    public String pixelFormat() {
        return this.pixelFormat;
    }

    /**
     * Enforces the specified codec preset. The default is `veryfast`. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.264#Preset). Note that certain values for this field may cause the transcoder to override other fields you set in the `H264CodecSettings` message.
     * 
     */
    @Import(name="preset", required=true)
      private final String preset;

    public String preset() {
        return this.preset;
    }

    /**
     * Enforces the specified codec profile. The following profiles are supported: * `baseline` * `main` * `high` (default) The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.264#Tune). Note that certain values for this field may cause the transcoder to override other fields you set in the `H264CodecSettings` message.
     * 
     */
    @Import(name="profile", required=true)
      private final String profile;

    public String profile() {
        return this.profile;
    }

    /**
     * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate - `crf` - constant rate factor
     * 
     */
    @Import(name="rateControlMode", required=true)
      private final String rateControlMode;

    public String rateControlMode() {
        return this.rateControlMode;
    }

    /**
     * Enforces the specified codec tune. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.264#Tune). Note that certain values for this field may cause the transcoder to override other fields you set in the `H264CodecSettings` message.
     * 
     */
    @Import(name="tune", required=true)
      private final String tune;

    public String tune() {
        return this.tune;
    }

    /**
     * Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to 90% of `VideoStream.vbv_size_bits`.
     * 
     */
    @Import(name="vbvFullnessBits", required=true)
      private final Integer vbvFullnessBits;

    public Integer vbvFullnessBits() {
        return this.vbvFullnessBits;
    }

    /**
     * Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to `VideoStream.bitrate_bps`.
     * 
     */
    @Import(name="vbvSizeBits", required=true)
      private final Integer vbvSizeBits;

    public Integer vbvSizeBits() {
        return this.vbvSizeBits;
    }

    /**
     * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
     */
    @Import(name="widthPixels", required=true)
      private final Integer widthPixels;

    public Integer widthPixels() {
        return this.widthPixels;
    }

    public H264CodecSettingsResponse(
        Boolean allowOpenGop,
        Double aqStrength,
        Integer bFrameCount,
        Boolean bPyramid,
        Integer bitrateBps,
        Integer crfLevel,
        Boolean enableTwoPass,
        String entropyCoder,
        Double frameRate,
        String gopDuration,
        Integer gopFrameCount,
        Integer heightPixels,
        String pixelFormat,
        String preset,
        String profile,
        String rateControlMode,
        String tune,
        Integer vbvFullnessBits,
        Integer vbvSizeBits,
        Integer widthPixels) {
        this.allowOpenGop = Objects.requireNonNull(allowOpenGop, "expected parameter 'allowOpenGop' to be non-null");
        this.aqStrength = Objects.requireNonNull(aqStrength, "expected parameter 'aqStrength' to be non-null");
        this.bFrameCount = Objects.requireNonNull(bFrameCount, "expected parameter 'bFrameCount' to be non-null");
        this.bPyramid = Objects.requireNonNull(bPyramid, "expected parameter 'bPyramid' to be non-null");
        this.bitrateBps = Objects.requireNonNull(bitrateBps, "expected parameter 'bitrateBps' to be non-null");
        this.crfLevel = Objects.requireNonNull(crfLevel, "expected parameter 'crfLevel' to be non-null");
        this.enableTwoPass = Objects.requireNonNull(enableTwoPass, "expected parameter 'enableTwoPass' to be non-null");
        this.entropyCoder = Objects.requireNonNull(entropyCoder, "expected parameter 'entropyCoder' to be non-null");
        this.frameRate = Objects.requireNonNull(frameRate, "expected parameter 'frameRate' to be non-null");
        this.gopDuration = Objects.requireNonNull(gopDuration, "expected parameter 'gopDuration' to be non-null");
        this.gopFrameCount = Objects.requireNonNull(gopFrameCount, "expected parameter 'gopFrameCount' to be non-null");
        this.heightPixels = Objects.requireNonNull(heightPixels, "expected parameter 'heightPixels' to be non-null");
        this.pixelFormat = Objects.requireNonNull(pixelFormat, "expected parameter 'pixelFormat' to be non-null");
        this.preset = Objects.requireNonNull(preset, "expected parameter 'preset' to be non-null");
        this.profile = Objects.requireNonNull(profile, "expected parameter 'profile' to be non-null");
        this.rateControlMode = Objects.requireNonNull(rateControlMode, "expected parameter 'rateControlMode' to be non-null");
        this.tune = Objects.requireNonNull(tune, "expected parameter 'tune' to be non-null");
        this.vbvFullnessBits = Objects.requireNonNull(vbvFullnessBits, "expected parameter 'vbvFullnessBits' to be non-null");
        this.vbvSizeBits = Objects.requireNonNull(vbvSizeBits, "expected parameter 'vbvSizeBits' to be non-null");
        this.widthPixels = Objects.requireNonNull(widthPixels, "expected parameter 'widthPixels' to be non-null");
    }

    private H264CodecSettingsResponse() {
        this.allowOpenGop = null;
        this.aqStrength = null;
        this.bFrameCount = null;
        this.bPyramid = null;
        this.bitrateBps = null;
        this.crfLevel = null;
        this.enableTwoPass = null;
        this.entropyCoder = null;
        this.frameRate = null;
        this.gopDuration = null;
        this.gopFrameCount = null;
        this.heightPixels = null;
        this.pixelFormat = null;
        this.preset = null;
        this.profile = null;
        this.rateControlMode = null;
        this.tune = null;
        this.vbvFullnessBits = null;
        this.vbvSizeBits = null;
        this.widthPixels = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H264CodecSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowOpenGop;
        private Double aqStrength;
        private Integer bFrameCount;
        private Boolean bPyramid;
        private Integer bitrateBps;
        private Integer crfLevel;
        private Boolean enableTwoPass;
        private String entropyCoder;
        private Double frameRate;
        private String gopDuration;
        private Integer gopFrameCount;
        private Integer heightPixels;
        private String pixelFormat;
        private String preset;
        private String profile;
        private String rateControlMode;
        private String tune;
        private Integer vbvFullnessBits;
        private Integer vbvSizeBits;
        private Integer widthPixels;

        public Builder() {
    	      // Empty
        }

        public Builder(H264CodecSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOpenGop = defaults.allowOpenGop;
    	      this.aqStrength = defaults.aqStrength;
    	      this.bFrameCount = defaults.bFrameCount;
    	      this.bPyramid = defaults.bPyramid;
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.crfLevel = defaults.crfLevel;
    	      this.enableTwoPass = defaults.enableTwoPass;
    	      this.entropyCoder = defaults.entropyCoder;
    	      this.frameRate = defaults.frameRate;
    	      this.gopDuration = defaults.gopDuration;
    	      this.gopFrameCount = defaults.gopFrameCount;
    	      this.heightPixels = defaults.heightPixels;
    	      this.pixelFormat = defaults.pixelFormat;
    	      this.preset = defaults.preset;
    	      this.profile = defaults.profile;
    	      this.rateControlMode = defaults.rateControlMode;
    	      this.tune = defaults.tune;
    	      this.vbvFullnessBits = defaults.vbvFullnessBits;
    	      this.vbvSizeBits = defaults.vbvSizeBits;
    	      this.widthPixels = defaults.widthPixels;
        }

        public Builder allowOpenGop(Boolean allowOpenGop) {
            this.allowOpenGop = Objects.requireNonNull(allowOpenGop);
            return this;
        }
        public Builder aqStrength(Double aqStrength) {
            this.aqStrength = Objects.requireNonNull(aqStrength);
            return this;
        }
        public Builder bFrameCount(Integer bFrameCount) {
            this.bFrameCount = Objects.requireNonNull(bFrameCount);
            return this;
        }
        public Builder bPyramid(Boolean bPyramid) {
            this.bPyramid = Objects.requireNonNull(bPyramid);
            return this;
        }
        public Builder bitrateBps(Integer bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }
        public Builder crfLevel(Integer crfLevel) {
            this.crfLevel = Objects.requireNonNull(crfLevel);
            return this;
        }
        public Builder enableTwoPass(Boolean enableTwoPass) {
            this.enableTwoPass = Objects.requireNonNull(enableTwoPass);
            return this;
        }
        public Builder entropyCoder(String entropyCoder) {
            this.entropyCoder = Objects.requireNonNull(entropyCoder);
            return this;
        }
        public Builder frameRate(Double frameRate) {
            this.frameRate = Objects.requireNonNull(frameRate);
            return this;
        }
        public Builder gopDuration(String gopDuration) {
            this.gopDuration = Objects.requireNonNull(gopDuration);
            return this;
        }
        public Builder gopFrameCount(Integer gopFrameCount) {
            this.gopFrameCount = Objects.requireNonNull(gopFrameCount);
            return this;
        }
        public Builder heightPixels(Integer heightPixels) {
            this.heightPixels = Objects.requireNonNull(heightPixels);
            return this;
        }
        public Builder pixelFormat(String pixelFormat) {
            this.pixelFormat = Objects.requireNonNull(pixelFormat);
            return this;
        }
        public Builder preset(String preset) {
            this.preset = Objects.requireNonNull(preset);
            return this;
        }
        public Builder profile(String profile) {
            this.profile = Objects.requireNonNull(profile);
            return this;
        }
        public Builder rateControlMode(String rateControlMode) {
            this.rateControlMode = Objects.requireNonNull(rateControlMode);
            return this;
        }
        public Builder tune(String tune) {
            this.tune = Objects.requireNonNull(tune);
            return this;
        }
        public Builder vbvFullnessBits(Integer vbvFullnessBits) {
            this.vbvFullnessBits = Objects.requireNonNull(vbvFullnessBits);
            return this;
        }
        public Builder vbvSizeBits(Integer vbvSizeBits) {
            this.vbvSizeBits = Objects.requireNonNull(vbvSizeBits);
            return this;
        }
        public Builder widthPixels(Integer widthPixels) {
            this.widthPixels = Objects.requireNonNull(widthPixels);
            return this;
        }        public H264CodecSettingsResponse build() {
            return new H264CodecSettingsResponse(allowOpenGop, aqStrength, bFrameCount, bPyramid, bitrateBps, crfLevel, enableTwoPass, entropyCoder, frameRate, gopDuration, gopFrameCount, heightPixels, pixelFormat, preset, profile, rateControlMode, tune, vbvFullnessBits, vbvSizeBits, widthPixels);
        }
    }
}
