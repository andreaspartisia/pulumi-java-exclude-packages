// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssetFilterPresentationTimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetFilterPresentationTimeRangeArgs Empty = new AssetFilterPresentationTimeRangeArgs();

    /**
     * The absolute end time boundary. Applies to Video on Demand (VoD).
     * For the Live Streaming presentation, it is silently ignored and applied when the presentation ends and the stream becomes VoD. This is a long value that represents an absolute end point of the presentation, rounded to the closest next GOP start. The unit is defined by `unit_timescale_in_miliseconds`, so an `end_in_units` of 180 would be for 3 minutes. Use `start_in_units` and `end_in_units` to trim the fragments that will be in the playlist (manifest). For example, `start_in_units` set to 20 and `end_in_units` set to 60 using `unit_timescale_in_miliseconds` in 1000 will generate a playlist that contains fragments from between 20 seconds and 60 seconds of the VoD presentation. If a fragment straddles the boundary, the entire fragment will be included in the manifest.
     * 
     */
    @Import(name="endInUnits")
    private @Nullable Output<Integer> endInUnits;

    /**
     * @return The absolute end time boundary. Applies to Video on Demand (VoD).
     * For the Live Streaming presentation, it is silently ignored and applied when the presentation ends and the stream becomes VoD. This is a long value that represents an absolute end point of the presentation, rounded to the closest next GOP start. The unit is defined by `unit_timescale_in_miliseconds`, so an `end_in_units` of 180 would be for 3 minutes. Use `start_in_units` and `end_in_units` to trim the fragments that will be in the playlist (manifest). For example, `start_in_units` set to 20 and `end_in_units` set to 60 using `unit_timescale_in_miliseconds` in 1000 will generate a playlist that contains fragments from between 20 seconds and 60 seconds of the VoD presentation. If a fragment straddles the boundary, the entire fragment will be included in the manifest.
     * 
     */
    public Optional<Output<Integer>> endInUnits() {
        return Optional.ofNullable(this.endInUnits);
    }

    /**
     * Indicates whether the `end_in_units` property must be present. If true, `end_in_units` must be specified or a bad request code is returned. Applies to Live Streaming only. Allowed values: false, true.
     * 
     */
    @Import(name="forceEnd")
    private @Nullable Output<Boolean> forceEnd;

    /**
     * @return Indicates whether the `end_in_units` property must be present. If true, `end_in_units` must be specified or a bad request code is returned. Applies to Live Streaming only. Allowed values: false, true.
     * 
     */
    public Optional<Output<Boolean>> forceEnd() {
        return Optional.ofNullable(this.forceEnd);
    }

    /**
     * The relative to end right edge. Applies to Live Streaming only.
     * This value defines the latest live position that a client can seek to. Using this property, you can delay live playback position and create a server-side buffer for players. The unit is defined by `unit_timescale_in_miliseconds`. The maximum live back off duration is 300 seconds. For example, a value of 20 means that the latest available content is 20 seconds delayed from the real live edge.
     * 
     */
    @Import(name="liveBackoffInUnits")
    private @Nullable Output<Integer> liveBackoffInUnits;

    /**
     * @return The relative to end right edge. Applies to Live Streaming only.
     * This value defines the latest live position that a client can seek to. Using this property, you can delay live playback position and create a server-side buffer for players. The unit is defined by `unit_timescale_in_miliseconds`. The maximum live back off duration is 300 seconds. For example, a value of 20 means that the latest available content is 20 seconds delayed from the real live edge.
     * 
     */
    public Optional<Output<Integer>> liveBackoffInUnits() {
        return Optional.ofNullable(this.liveBackoffInUnits);
    }

    /**
     * The relative to end sliding window. Applies to Live Streaming only. Use `presentation_window_in_units` to apply a sliding window of fragments to include in a playlist. The unit is defined by `unit_timescale_in_miliseconds`. For example, set  `presentation_window_in_units` to 120 to apply a two-minute sliding window. Media within 2 minutes of the live edge will be included in the playlist. If a fragment straddles the boundary, the entire fragment will be included in the playlist. The minimum presentation window duration is 60 seconds.
     * 
     */
    @Import(name="presentationWindowInUnits")
    private @Nullable Output<Integer> presentationWindowInUnits;

    /**
     * @return The relative to end sliding window. Applies to Live Streaming only. Use `presentation_window_in_units` to apply a sliding window of fragments to include in a playlist. The unit is defined by `unit_timescale_in_miliseconds`. For example, set  `presentation_window_in_units` to 120 to apply a two-minute sliding window. Media within 2 minutes of the live edge will be included in the playlist. If a fragment straddles the boundary, the entire fragment will be included in the playlist. The minimum presentation window duration is 60 seconds.
     * 
     */
    public Optional<Output<Integer>> presentationWindowInUnits() {
        return Optional.ofNullable(this.presentationWindowInUnits);
    }

    /**
     * The absolute start time boundary. Applies to Video on Demand (VoD) or Live Streaming. This is a long value that represents an absolute start point of the stream. The value gets rounded to the closest next GOP start. The unit is defined by `unit_timescale_in_miliseconds`, so a `start_in_units` of 15 would be for 15 seconds. Use `start_in_units` and `end_in_units` to trim the fragments that will be in the playlist (manifest). For example, `start_in_units` set to 20 and `end_in_units` set to 60 using `unit_timescale_in_miliseconds` in 1000 will generate a playlist that contains fragments from between 20 seconds and 60 seconds of the VoD presentation. If a fragment straddles the boundary, the entire fragment will be included in the manifest.
     * 
     */
    @Import(name="startInUnits")
    private @Nullable Output<Integer> startInUnits;

    /**
     * @return The absolute start time boundary. Applies to Video on Demand (VoD) or Live Streaming. This is a long value that represents an absolute start point of the stream. The value gets rounded to the closest next GOP start. The unit is defined by `unit_timescale_in_miliseconds`, so a `start_in_units` of 15 would be for 15 seconds. Use `start_in_units` and `end_in_units` to trim the fragments that will be in the playlist (manifest). For example, `start_in_units` set to 20 and `end_in_units` set to 60 using `unit_timescale_in_miliseconds` in 1000 will generate a playlist that contains fragments from between 20 seconds and 60 seconds of the VoD presentation. If a fragment straddles the boundary, the entire fragment will be included in the manifest.
     * 
     */
    public Optional<Output<Integer>> startInUnits() {
        return Optional.ofNullable(this.startInUnits);
    }

    /**
     * Specified as the number of miliseconds in one unit timescale. For example, if you want to set a `start_in_units` at 30 seconds, you would use a value of 30 when using the `unit_timescale_in_miliseconds` in 1000. Or if you want to set `start_in_units` in 30 miliseconds, you would use a value of 30 when using the `unit_timescale_in_miliseconds` in 1.  Applies timescale to `start_in_units`, `start_timescale` and `presentation_window_in_timescale` and `live_backoff_in_timescale`.
     * 
     */
    @Import(name="unitTimescaleInMiliseconds")
    private @Nullable Output<Integer> unitTimescaleInMiliseconds;

    /**
     * @return Specified as the number of miliseconds in one unit timescale. For example, if you want to set a `start_in_units` at 30 seconds, you would use a value of 30 when using the `unit_timescale_in_miliseconds` in 1000. Or if you want to set `start_in_units` in 30 miliseconds, you would use a value of 30 when using the `unit_timescale_in_miliseconds` in 1.  Applies timescale to `start_in_units`, `start_timescale` and `presentation_window_in_timescale` and `live_backoff_in_timescale`.
     * 
     */
    public Optional<Output<Integer>> unitTimescaleInMiliseconds() {
        return Optional.ofNullable(this.unitTimescaleInMiliseconds);
    }

    private AssetFilterPresentationTimeRangeArgs() {}

    private AssetFilterPresentationTimeRangeArgs(AssetFilterPresentationTimeRangeArgs $) {
        this.endInUnits = $.endInUnits;
        this.forceEnd = $.forceEnd;
        this.liveBackoffInUnits = $.liveBackoffInUnits;
        this.presentationWindowInUnits = $.presentationWindowInUnits;
        this.startInUnits = $.startInUnits;
        this.unitTimescaleInMiliseconds = $.unitTimescaleInMiliseconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetFilterPresentationTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetFilterPresentationTimeRangeArgs $;

        public Builder() {
            $ = new AssetFilterPresentationTimeRangeArgs();
        }

        public Builder(AssetFilterPresentationTimeRangeArgs defaults) {
            $ = new AssetFilterPresentationTimeRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endInUnits The absolute end time boundary. Applies to Video on Demand (VoD).
         * For the Live Streaming presentation, it is silently ignored and applied when the presentation ends and the stream becomes VoD. This is a long value that represents an absolute end point of the presentation, rounded to the closest next GOP start. The unit is defined by `unit_timescale_in_miliseconds`, so an `end_in_units` of 180 would be for 3 minutes. Use `start_in_units` and `end_in_units` to trim the fragments that will be in the playlist (manifest). For example, `start_in_units` set to 20 and `end_in_units` set to 60 using `unit_timescale_in_miliseconds` in 1000 will generate a playlist that contains fragments from between 20 seconds and 60 seconds of the VoD presentation. If a fragment straddles the boundary, the entire fragment will be included in the manifest.
         * 
         * @return builder
         * 
         */
        public Builder endInUnits(@Nullable Output<Integer> endInUnits) {
            $.endInUnits = endInUnits;
            return this;
        }

        /**
         * @param endInUnits The absolute end time boundary. Applies to Video on Demand (VoD).
         * For the Live Streaming presentation, it is silently ignored and applied when the presentation ends and the stream becomes VoD. This is a long value that represents an absolute end point of the presentation, rounded to the closest next GOP start. The unit is defined by `unit_timescale_in_miliseconds`, so an `end_in_units` of 180 would be for 3 minutes. Use `start_in_units` and `end_in_units` to trim the fragments that will be in the playlist (manifest). For example, `start_in_units` set to 20 and `end_in_units` set to 60 using `unit_timescale_in_miliseconds` in 1000 will generate a playlist that contains fragments from between 20 seconds and 60 seconds of the VoD presentation. If a fragment straddles the boundary, the entire fragment will be included in the manifest.
         * 
         * @return builder
         * 
         */
        public Builder endInUnits(Integer endInUnits) {
            return endInUnits(Output.of(endInUnits));
        }

        /**
         * @param forceEnd Indicates whether the `end_in_units` property must be present. If true, `end_in_units` must be specified or a bad request code is returned. Applies to Live Streaming only. Allowed values: false, true.
         * 
         * @return builder
         * 
         */
        public Builder forceEnd(@Nullable Output<Boolean> forceEnd) {
            $.forceEnd = forceEnd;
            return this;
        }

        /**
         * @param forceEnd Indicates whether the `end_in_units` property must be present. If true, `end_in_units` must be specified or a bad request code is returned. Applies to Live Streaming only. Allowed values: false, true.
         * 
         * @return builder
         * 
         */
        public Builder forceEnd(Boolean forceEnd) {
            return forceEnd(Output.of(forceEnd));
        }

        /**
         * @param liveBackoffInUnits The relative to end right edge. Applies to Live Streaming only.
         * This value defines the latest live position that a client can seek to. Using this property, you can delay live playback position and create a server-side buffer for players. The unit is defined by `unit_timescale_in_miliseconds`. The maximum live back off duration is 300 seconds. For example, a value of 20 means that the latest available content is 20 seconds delayed from the real live edge.
         * 
         * @return builder
         * 
         */
        public Builder liveBackoffInUnits(@Nullable Output<Integer> liveBackoffInUnits) {
            $.liveBackoffInUnits = liveBackoffInUnits;
            return this;
        }

        /**
         * @param liveBackoffInUnits The relative to end right edge. Applies to Live Streaming only.
         * This value defines the latest live position that a client can seek to. Using this property, you can delay live playback position and create a server-side buffer for players. The unit is defined by `unit_timescale_in_miliseconds`. The maximum live back off duration is 300 seconds. For example, a value of 20 means that the latest available content is 20 seconds delayed from the real live edge.
         * 
         * @return builder
         * 
         */
        public Builder liveBackoffInUnits(Integer liveBackoffInUnits) {
            return liveBackoffInUnits(Output.of(liveBackoffInUnits));
        }

        /**
         * @param presentationWindowInUnits The relative to end sliding window. Applies to Live Streaming only. Use `presentation_window_in_units` to apply a sliding window of fragments to include in a playlist. The unit is defined by `unit_timescale_in_miliseconds`. For example, set  `presentation_window_in_units` to 120 to apply a two-minute sliding window. Media within 2 minutes of the live edge will be included in the playlist. If a fragment straddles the boundary, the entire fragment will be included in the playlist. The minimum presentation window duration is 60 seconds.
         * 
         * @return builder
         * 
         */
        public Builder presentationWindowInUnits(@Nullable Output<Integer> presentationWindowInUnits) {
            $.presentationWindowInUnits = presentationWindowInUnits;
            return this;
        }

        /**
         * @param presentationWindowInUnits The relative to end sliding window. Applies to Live Streaming only. Use `presentation_window_in_units` to apply a sliding window of fragments to include in a playlist. The unit is defined by `unit_timescale_in_miliseconds`. For example, set  `presentation_window_in_units` to 120 to apply a two-minute sliding window. Media within 2 minutes of the live edge will be included in the playlist. If a fragment straddles the boundary, the entire fragment will be included in the playlist. The minimum presentation window duration is 60 seconds.
         * 
         * @return builder
         * 
         */
        public Builder presentationWindowInUnits(Integer presentationWindowInUnits) {
            return presentationWindowInUnits(Output.of(presentationWindowInUnits));
        }

        /**
         * @param startInUnits The absolute start time boundary. Applies to Video on Demand (VoD) or Live Streaming. This is a long value that represents an absolute start point of the stream. The value gets rounded to the closest next GOP start. The unit is defined by `unit_timescale_in_miliseconds`, so a `start_in_units` of 15 would be for 15 seconds. Use `start_in_units` and `end_in_units` to trim the fragments that will be in the playlist (manifest). For example, `start_in_units` set to 20 and `end_in_units` set to 60 using `unit_timescale_in_miliseconds` in 1000 will generate a playlist that contains fragments from between 20 seconds and 60 seconds of the VoD presentation. If a fragment straddles the boundary, the entire fragment will be included in the manifest.
         * 
         * @return builder
         * 
         */
        public Builder startInUnits(@Nullable Output<Integer> startInUnits) {
            $.startInUnits = startInUnits;
            return this;
        }

        /**
         * @param startInUnits The absolute start time boundary. Applies to Video on Demand (VoD) or Live Streaming. This is a long value that represents an absolute start point of the stream. The value gets rounded to the closest next GOP start. The unit is defined by `unit_timescale_in_miliseconds`, so a `start_in_units` of 15 would be for 15 seconds. Use `start_in_units` and `end_in_units` to trim the fragments that will be in the playlist (manifest). For example, `start_in_units` set to 20 and `end_in_units` set to 60 using `unit_timescale_in_miliseconds` in 1000 will generate a playlist that contains fragments from between 20 seconds and 60 seconds of the VoD presentation. If a fragment straddles the boundary, the entire fragment will be included in the manifest.
         * 
         * @return builder
         * 
         */
        public Builder startInUnits(Integer startInUnits) {
            return startInUnits(Output.of(startInUnits));
        }

        /**
         * @param unitTimescaleInMiliseconds Specified as the number of miliseconds in one unit timescale. For example, if you want to set a `start_in_units` at 30 seconds, you would use a value of 30 when using the `unit_timescale_in_miliseconds` in 1000. Or if you want to set `start_in_units` in 30 miliseconds, you would use a value of 30 when using the `unit_timescale_in_miliseconds` in 1.  Applies timescale to `start_in_units`, `start_timescale` and `presentation_window_in_timescale` and `live_backoff_in_timescale`.
         * 
         * @return builder
         * 
         */
        public Builder unitTimescaleInMiliseconds(@Nullable Output<Integer> unitTimescaleInMiliseconds) {
            $.unitTimescaleInMiliseconds = unitTimescaleInMiliseconds;
            return this;
        }

        /**
         * @param unitTimescaleInMiliseconds Specified as the number of miliseconds in one unit timescale. For example, if you want to set a `start_in_units` at 30 seconds, you would use a value of 30 when using the `unit_timescale_in_miliseconds` in 1000. Or if you want to set `start_in_units` in 30 miliseconds, you would use a value of 30 when using the `unit_timescale_in_miliseconds` in 1.  Applies timescale to `start_in_units`, `start_timescale` and `presentation_window_in_timescale` and `live_backoff_in_timescale`.
         * 
         * @return builder
         * 
         */
        public Builder unitTimescaleInMiliseconds(Integer unitTimescaleInMiliseconds) {
            return unitTimescaleInMiliseconds(Output.of(unitTimescaleInMiliseconds));
        }

        public AssetFilterPresentationTimeRangeArgs build() {
            return $;
        }
    }

}
