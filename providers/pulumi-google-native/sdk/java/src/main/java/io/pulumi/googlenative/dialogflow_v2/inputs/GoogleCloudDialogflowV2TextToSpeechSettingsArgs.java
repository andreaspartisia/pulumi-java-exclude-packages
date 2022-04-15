// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2TextToSpeechSettingsOutputAudioEncoding;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Instructs the speech synthesizer on how to generate the output audio content.
 * 
 */
public final class GoogleCloudDialogflowV2TextToSpeechSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2TextToSpeechSettingsArgs Empty = new GoogleCloudDialogflowV2TextToSpeechSettingsArgs();

    /**
     * Optional. Indicates whether text to speech is enabled. Even when this field is false, other settings in this proto are still retained.
     * 
     */
    @Import(name="enableTextToSpeech")
      private final @Nullable Output<Boolean> enableTextToSpeech;

    public Output<Boolean> enableTextToSpeech() {
        return this.enableTextToSpeech == null ? Codegen.empty() : this.enableTextToSpeech;
    }

    /**
     * Audio encoding of the synthesized audio content.
     * 
     */
    @Import(name="outputAudioEncoding", required=true)
      private final Output<GoogleCloudDialogflowV2TextToSpeechSettingsOutputAudioEncoding> outputAudioEncoding;

    public Output<GoogleCloudDialogflowV2TextToSpeechSettingsOutputAudioEncoding> outputAudioEncoding() {
        return this.outputAudioEncoding;
    }

    /**
     * Optional. The synthesis sample rate (in hertz) for this audio. If not provided, then the synthesizer will use the default sample rate based on the audio encoding. If this is different from the voice's natural sample rate, then the synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality).
     * 
     */
    @Import(name="sampleRateHertz")
      private final @Nullable Output<Integer> sampleRateHertz;

    public Output<Integer> sampleRateHertz() {
        return this.sampleRateHertz == null ? Codegen.empty() : this.sampleRateHertz;
    }

    /**
     * Optional. Configuration of how speech should be synthesized, mapping from language (https://cloud.google.com/dialogflow/docs/reference/language) to SynthesizeSpeechConfig.
     * 
     */
    @Import(name="synthesizeSpeechConfigs")
      private final @Nullable Output<Map<String,String>> synthesizeSpeechConfigs;

    public Output<Map<String,String>> synthesizeSpeechConfigs() {
        return this.synthesizeSpeechConfigs == null ? Codegen.empty() : this.synthesizeSpeechConfigs;
    }

    public GoogleCloudDialogflowV2TextToSpeechSettingsArgs(
        @Nullable Output<Boolean> enableTextToSpeech,
        Output<GoogleCloudDialogflowV2TextToSpeechSettingsOutputAudioEncoding> outputAudioEncoding,
        @Nullable Output<Integer> sampleRateHertz,
        @Nullable Output<Map<String,String>> synthesizeSpeechConfigs) {
        this.enableTextToSpeech = enableTextToSpeech;
        this.outputAudioEncoding = Objects.requireNonNull(outputAudioEncoding, "expected parameter 'outputAudioEncoding' to be non-null");
        this.sampleRateHertz = sampleRateHertz;
        this.synthesizeSpeechConfigs = synthesizeSpeechConfigs;
    }

    private GoogleCloudDialogflowV2TextToSpeechSettingsArgs() {
        this.enableTextToSpeech = Codegen.empty();
        this.outputAudioEncoding = Codegen.empty();
        this.sampleRateHertz = Codegen.empty();
        this.synthesizeSpeechConfigs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2TextToSpeechSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableTextToSpeech;
        private Output<GoogleCloudDialogflowV2TextToSpeechSettingsOutputAudioEncoding> outputAudioEncoding;
        private @Nullable Output<Integer> sampleRateHertz;
        private @Nullable Output<Map<String,String>> synthesizeSpeechConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2TextToSpeechSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableTextToSpeech = defaults.enableTextToSpeech;
    	      this.outputAudioEncoding = defaults.outputAudioEncoding;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
    	      this.synthesizeSpeechConfigs = defaults.synthesizeSpeechConfigs;
        }

        public Builder enableTextToSpeech(@Nullable Output<Boolean> enableTextToSpeech) {
            this.enableTextToSpeech = enableTextToSpeech;
            return this;
        }
        public Builder enableTextToSpeech(@Nullable Boolean enableTextToSpeech) {
            this.enableTextToSpeech = Codegen.ofNullable(enableTextToSpeech);
            return this;
        }
        public Builder outputAudioEncoding(Output<GoogleCloudDialogflowV2TextToSpeechSettingsOutputAudioEncoding> outputAudioEncoding) {
            this.outputAudioEncoding = Objects.requireNonNull(outputAudioEncoding);
            return this;
        }
        public Builder outputAudioEncoding(GoogleCloudDialogflowV2TextToSpeechSettingsOutputAudioEncoding outputAudioEncoding) {
            this.outputAudioEncoding = Output.of(Objects.requireNonNull(outputAudioEncoding));
            return this;
        }
        public Builder sampleRateHertz(@Nullable Output<Integer> sampleRateHertz) {
            this.sampleRateHertz = sampleRateHertz;
            return this;
        }
        public Builder sampleRateHertz(@Nullable Integer sampleRateHertz) {
            this.sampleRateHertz = Codegen.ofNullable(sampleRateHertz);
            return this;
        }
        public Builder synthesizeSpeechConfigs(@Nullable Output<Map<String,String>> synthesizeSpeechConfigs) {
            this.synthesizeSpeechConfigs = synthesizeSpeechConfigs;
            return this;
        }
        public Builder synthesizeSpeechConfigs(@Nullable Map<String,String> synthesizeSpeechConfigs) {
            this.synthesizeSpeechConfigs = Codegen.ofNullable(synthesizeSpeechConfigs);
            return this;
        }        public GoogleCloudDialogflowV2TextToSpeechSettingsArgs build() {
            return new GoogleCloudDialogflowV2TextToSpeechSettingsArgs(enableTextToSpeech, outputAudioEncoding, sampleRateHertz, synthesizeSpeechConfigs);
        }
    }
}
