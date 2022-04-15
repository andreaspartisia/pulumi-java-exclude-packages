// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse {
    /**
     * The confidence of the match ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    private final Double confidence;
    /**
     * The Dialogflow intent resource path. Format: projects/{project}/agent/{agent}/intents/{intent}
     * 
     */
    private final String dialogflowIntentId;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse(
        @CustomType.Parameter("confidence") Double confidence,
        @CustomType.Parameter("dialogflowIntentId") String dialogflowIntentId) {
        this.confidence = confidence;
        this.dialogflowIntentId = dialogflowIntentId;
    }

    /**
     * The confidence of the match ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
    */
    public Double confidence() {
        return this.confidence;
    }
    /**
     * The Dialogflow intent resource path. Format: projects/{project}/agent/{agent}/intents/{intent}
     * 
    */
    public String dialogflowIntentId() {
        return this.dialogflowIntentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidence;
        private String dialogflowIntentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidence = defaults.confidence;
    	      this.dialogflowIntentId = defaults.dialogflowIntentId;
        }

        public Builder confidence(Double confidence) {
            this.confidence = Objects.requireNonNull(confidence);
            return this;
        }
        public Builder dialogflowIntentId(String dialogflowIntentId) {
            this.dialogflowIntentId = Objects.requireNonNull(dialogflowIntentId);
            return this;
        }        public GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse(confidence, dialogflowIntentId);
        }
    }
}
