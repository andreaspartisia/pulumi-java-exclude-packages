// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpriteSheetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpriteSheetArgs Empty = new SpriteSheetArgs();

    @InputImport(name="columnCount")
    private final @Nullable Input<Integer> columnCount;

    public Input<Integer> getColumnCount() {
        return this.columnCount == null ? Input.empty() : this.columnCount;
    }

    @InputImport(name="endTimeOffset")
    private final @Nullable Input<String> endTimeOffset;

    public Input<String> getEndTimeOffset() {
        return this.endTimeOffset == null ? Input.empty() : this.endTimeOffset;
    }

    @InputImport(name="filePrefix", required=true)
    private final Input<String> filePrefix;

    public Input<String> getFilePrefix() {
        return this.filePrefix;
    }

    @InputImport(name="format")
    private final @Nullable Input<String> format;

    public Input<String> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    @InputImport(name="interval")
    private final @Nullable Input<String> interval;

    public Input<String> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    @InputImport(name="quality")
    private final @Nullable Input<Integer> quality;

    public Input<Integer> getQuality() {
        return this.quality == null ? Input.empty() : this.quality;
    }

    @InputImport(name="rowCount")
    private final @Nullable Input<Integer> rowCount;

    public Input<Integer> getRowCount() {
        return this.rowCount == null ? Input.empty() : this.rowCount;
    }

    @InputImport(name="spriteHeightPixels", required=true)
    private final Input<Integer> spriteHeightPixels;

    public Input<Integer> getSpriteHeightPixels() {
        return this.spriteHeightPixels;
    }

    @InputImport(name="spriteWidthPixels", required=true)
    private final Input<Integer> spriteWidthPixels;

    public Input<Integer> getSpriteWidthPixels() {
        return this.spriteWidthPixels;
    }

    @InputImport(name="startTimeOffset")
    private final @Nullable Input<String> startTimeOffset;

    public Input<String> getStartTimeOffset() {
        return this.startTimeOffset == null ? Input.empty() : this.startTimeOffset;
    }

    @InputImport(name="totalCount")
    private final @Nullable Input<Integer> totalCount;

    public Input<Integer> getTotalCount() {
        return this.totalCount == null ? Input.empty() : this.totalCount;
    }

    public SpriteSheetArgs(
        @Nullable Input<Integer> columnCount,
        @Nullable Input<String> endTimeOffset,
        Input<String> filePrefix,
        @Nullable Input<String> format,
        @Nullable Input<String> interval,
        @Nullable Input<Integer> quality,
        @Nullable Input<Integer> rowCount,
        Input<Integer> spriteHeightPixels,
        Input<Integer> spriteWidthPixels,
        @Nullable Input<String> startTimeOffset,
        @Nullable Input<Integer> totalCount) {
        this.columnCount = columnCount;
        this.endTimeOffset = endTimeOffset;
        this.filePrefix = Objects.requireNonNull(filePrefix, "expected parameter 'filePrefix' to be non-null");
        this.format = format;
        this.interval = interval;
        this.quality = quality;
        this.rowCount = rowCount;
        this.spriteHeightPixels = Objects.requireNonNull(spriteHeightPixels, "expected parameter 'spriteHeightPixels' to be non-null");
        this.spriteWidthPixels = Objects.requireNonNull(spriteWidthPixels, "expected parameter 'spriteWidthPixels' to be non-null");
        this.startTimeOffset = startTimeOffset;
        this.totalCount = totalCount;
    }

    private SpriteSheetArgs() {
        this.columnCount = Input.empty();
        this.endTimeOffset = Input.empty();
        this.filePrefix = Input.empty();
        this.format = Input.empty();
        this.interval = Input.empty();
        this.quality = Input.empty();
        this.rowCount = Input.empty();
        this.spriteHeightPixels = Input.empty();
        this.spriteWidthPixels = Input.empty();
        this.startTimeOffset = Input.empty();
        this.totalCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpriteSheetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> columnCount;
        private @Nullable Input<String> endTimeOffset;
        private Input<String> filePrefix;
        private @Nullable Input<String> format;
        private @Nullable Input<String> interval;
        private @Nullable Input<Integer> quality;
        private @Nullable Input<Integer> rowCount;
        private Input<Integer> spriteHeightPixels;
        private Input<Integer> spriteWidthPixels;
        private @Nullable Input<String> startTimeOffset;
        private @Nullable Input<Integer> totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SpriteSheetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnCount = defaults.columnCount;
    	      this.endTimeOffset = defaults.endTimeOffset;
    	      this.filePrefix = defaults.filePrefix;
    	      this.format = defaults.format;
    	      this.interval = defaults.interval;
    	      this.quality = defaults.quality;
    	      this.rowCount = defaults.rowCount;
    	      this.spriteHeightPixels = defaults.spriteHeightPixels;
    	      this.spriteWidthPixels = defaults.spriteWidthPixels;
    	      this.startTimeOffset = defaults.startTimeOffset;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder setColumnCount(@Nullable Input<Integer> columnCount) {
            this.columnCount = columnCount;
            return this;
        }

        public Builder setColumnCount(@Nullable Integer columnCount) {
            this.columnCount = Input.ofNullable(columnCount);
            return this;
        }

        public Builder setEndTimeOffset(@Nullable Input<String> endTimeOffset) {
            this.endTimeOffset = endTimeOffset;
            return this;
        }

        public Builder setEndTimeOffset(@Nullable String endTimeOffset) {
            this.endTimeOffset = Input.ofNullable(endTimeOffset);
            return this;
        }

        public Builder setFilePrefix(Input<String> filePrefix) {
            this.filePrefix = Objects.requireNonNull(filePrefix);
            return this;
        }

        public Builder setFilePrefix(String filePrefix) {
            this.filePrefix = Input.of(Objects.requireNonNull(filePrefix));
            return this;
        }

        public Builder setFormat(@Nullable Input<String> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setInterval(@Nullable Input<String> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable String interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setQuality(@Nullable Input<Integer> quality) {
            this.quality = quality;
            return this;
        }

        public Builder setQuality(@Nullable Integer quality) {
            this.quality = Input.ofNullable(quality);
            return this;
        }

        public Builder setRowCount(@Nullable Input<Integer> rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        public Builder setRowCount(@Nullable Integer rowCount) {
            this.rowCount = Input.ofNullable(rowCount);
            return this;
        }

        public Builder setSpriteHeightPixels(Input<Integer> spriteHeightPixels) {
            this.spriteHeightPixels = Objects.requireNonNull(spriteHeightPixels);
            return this;
        }

        public Builder setSpriteHeightPixels(Integer spriteHeightPixels) {
            this.spriteHeightPixels = Input.of(Objects.requireNonNull(spriteHeightPixels));
            return this;
        }

        public Builder setSpriteWidthPixels(Input<Integer> spriteWidthPixels) {
            this.spriteWidthPixels = Objects.requireNonNull(spriteWidthPixels);
            return this;
        }

        public Builder setSpriteWidthPixels(Integer spriteWidthPixels) {
            this.spriteWidthPixels = Input.of(Objects.requireNonNull(spriteWidthPixels));
            return this;
        }

        public Builder setStartTimeOffset(@Nullable Input<String> startTimeOffset) {
            this.startTimeOffset = startTimeOffset;
            return this;
        }

        public Builder setStartTimeOffset(@Nullable String startTimeOffset) {
            this.startTimeOffset = Input.ofNullable(startTimeOffset);
            return this;
        }

        public Builder setTotalCount(@Nullable Input<Integer> totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Builder setTotalCount(@Nullable Integer totalCount) {
            this.totalCount = Input.ofNullable(totalCount);
            return this;
        }

        public SpriteSheetArgs build() {
            return new SpriteSheetArgs(columnCount, endTimeOffset, filePrefix, format, interval, quality, rowCount, spriteHeightPixels, spriteWidthPixels, startTimeOffset, totalCount);
        }
    }
}