// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.LiveEventInputTrackSelectionResponse;
import io.pulumi.azurenative.media.inputs.LiveEventOutputTranscriptionTrackResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveEventTranscriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final LiveEventTranscriptionResponse Empty = new LiveEventTranscriptionResponse();

    @InputImport(name="inputTrackSelection")
    private final @Nullable List<LiveEventInputTrackSelectionResponse> inputTrackSelection;

    public List<LiveEventInputTrackSelectionResponse> getInputTrackSelection() {
        return this.inputTrackSelection == null ? List.of() : this.inputTrackSelection;
    }

    @InputImport(name="language")
    private final @Nullable String language;

    public Optional<String> getLanguage() {
        return this.language == null ? Optional.empty() : Optional.ofNullable(this.language);
    }

    @InputImport(name="outputTranscriptionTrack")
    private final @Nullable LiveEventOutputTranscriptionTrackResponse outputTranscriptionTrack;

    public Optional<LiveEventOutputTranscriptionTrackResponse> getOutputTranscriptionTrack() {
        return this.outputTranscriptionTrack == null ? Optional.empty() : Optional.ofNullable(this.outputTranscriptionTrack);
    }

    public LiveEventTranscriptionResponse(
        @Nullable List<LiveEventInputTrackSelectionResponse> inputTrackSelection,
        @Nullable String language,
        @Nullable LiveEventOutputTranscriptionTrackResponse outputTranscriptionTrack) {
        this.inputTrackSelection = inputTrackSelection;
        this.language = language;
        this.outputTranscriptionTrack = outputTranscriptionTrack;
    }

    private LiveEventTranscriptionResponse() {
        this.inputTrackSelection = List.of();
        this.language = null;
        this.outputTranscriptionTrack = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventTranscriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LiveEventInputTrackSelectionResponse> inputTrackSelection;
        private @Nullable String language;
        private @Nullable LiveEventOutputTranscriptionTrackResponse outputTranscriptionTrack;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventTranscriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputTrackSelection = defaults.inputTrackSelection;
    	      this.language = defaults.language;
    	      this.outputTranscriptionTrack = defaults.outputTranscriptionTrack;
        }

        public Builder setInputTrackSelection(@Nullable List<LiveEventInputTrackSelectionResponse> inputTrackSelection) {
            this.inputTrackSelection = inputTrackSelection;
            return this;
        }

        public Builder setLanguage(@Nullable String language) {
            this.language = language;
            return this;
        }

        public Builder setOutputTranscriptionTrack(@Nullable LiveEventOutputTranscriptionTrackResponse outputTranscriptionTrack) {
            this.outputTranscriptionTrack = outputTranscriptionTrack;
            return this;
        }

        public LiveEventTranscriptionResponse build() {
            return new LiveEventTranscriptionResponse(inputTrackSelection, language, outputTranscriptionTrack);
        }
    }
}