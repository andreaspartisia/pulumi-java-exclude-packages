// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies an audio clip to be played by the client as part of the response.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse();

    /**
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    @Import(name="allowPlaybackInterruption", required=true)
      private final Boolean allowPlaybackInterruption;

    public Boolean allowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }

    /**
     * URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
     * 
     */
    @Import(name="audioUri", required=true)
      private final String audioUri;

    public String audioUri() {
        return this.audioUri;
    }

    public GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse(
        Boolean allowPlaybackInterruption,
        String audioUri) {
        this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption, "expected parameter 'allowPlaybackInterruption' to be non-null");
        this.audioUri = Objects.requireNonNull(audioUri, "expected parameter 'audioUri' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse() {
        this.allowPlaybackInterruption = null;
        this.audioUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowPlaybackInterruption;
        private String audioUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.audioUri = defaults.audioUri;
        }

        public Builder allowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption);
            return this;
        }
        public Builder audioUri(String audioUri) {
            this.audioUri = Objects.requireNonNull(audioUri);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse(allowPlaybackInterruption, audioUri);
        }
    }
}
