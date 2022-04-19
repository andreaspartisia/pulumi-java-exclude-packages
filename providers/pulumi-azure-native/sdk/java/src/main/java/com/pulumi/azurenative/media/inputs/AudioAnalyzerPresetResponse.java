// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Audio Analyzer preset applies a pre-defined set of AI-based analysis operations, including speech transcription. Currently, the preset supports processing of content with a single audio track.
 * 
 */
public final class AudioAnalyzerPresetResponse extends com.pulumi.resources.InvokeArgs {

    public static final AudioAnalyzerPresetResponse Empty = new AudioAnalyzerPresetResponse();

    /**
     * The language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US').  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn't specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to 'en-US'." The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
     * 
     */
    @Import(name="audioLanguage")
      private final @Nullable String audioLanguage;

    public Optional<String> audioLanguage() {
        return this.audioLanguage == null ? Optional.empty() : Optional.ofNullable(this.audioLanguage);
    }

    /**
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    @Import(name="experimentalOptions")
      private final @Nullable Map<String,String> experimentalOptions;

    public Map<String,String> experimentalOptions() {
        return this.experimentalOptions == null ? Map.of() : this.experimentalOptions;
    }

    /**
     * Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
     */
    @Import(name="mode")
      private final @Nullable String mode;

    public Optional<String> mode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AudioAnalyzerPreset'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    public AudioAnalyzerPresetResponse(
        @Nullable String audioLanguage,
        @Nullable Map<String,String> experimentalOptions,
        @Nullable String mode,
        String odataType) {
        this.audioLanguage = audioLanguage;
        this.experimentalOptions = experimentalOptions;
        this.mode = mode;
        this.odataType = Codegen.stringProp("odataType").arg(odataType).require();
    }

    private AudioAnalyzerPresetResponse() {
        this.audioLanguage = null;
        this.experimentalOptions = Map.of();
        this.mode = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioAnalyzerPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audioLanguage;
        private @Nullable Map<String,String> experimentalOptions;
        private @Nullable String mode;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioAnalyzerPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioLanguage = defaults.audioLanguage;
    	      this.experimentalOptions = defaults.experimentalOptions;
    	      this.mode = defaults.mode;
    	      this.odataType = defaults.odataType;
        }

        public Builder audioLanguage(@Nullable String audioLanguage) {
            this.audioLanguage = audioLanguage;
            return this;
        }
        public Builder experimentalOptions(@Nullable Map<String,String> experimentalOptions) {
            this.experimentalOptions = experimentalOptions;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public AudioAnalyzerPresetResponse build() {
            return new AudioAnalyzerPresetResponse(audioLanguage, experimentalOptions, mode, odataType);
        }
    }
}
