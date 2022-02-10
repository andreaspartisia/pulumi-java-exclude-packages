// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse {
    private final List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments;

    @OutputCustomType.Constructor({"segments"})
    private GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse(List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments) {
        this.segments = Objects.requireNonNull(segments);
    }

    public List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> getSegments() {
        return this.segments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segments = defaults.segments;
        }

        public Builder setSegments(List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments) {
            this.segments = Objects.requireNonNull(segments);
            return this;
        }

        public GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse(segments);
        }
    }
}