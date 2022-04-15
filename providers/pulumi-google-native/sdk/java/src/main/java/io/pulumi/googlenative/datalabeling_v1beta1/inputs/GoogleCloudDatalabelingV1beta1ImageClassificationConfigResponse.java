// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Config for image classification human labeling task.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse Empty = new GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse();

    /**
     * Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one image.
     * 
     */
    @Import(name="allowMultiLabel", required=true)
      private final Boolean allowMultiLabel;

    public Boolean allowMultiLabel() {
        return this.allowMultiLabel;
    }

    /**
     * Annotation spec set resource name.
     * 
     */
    @Import(name="annotationSpecSet", required=true)
      private final String annotationSpecSet;

    public String annotationSpecSet() {
        return this.annotationSpecSet;
    }

    /**
     * Optional. The type of how to aggregate answers.
     * 
     */
    @Import(name="answerAggregationType", required=true)
      private final String answerAggregationType;

    public String answerAggregationType() {
        return this.answerAggregationType;
    }

    public GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse(
        Boolean allowMultiLabel,
        String annotationSpecSet,
        String answerAggregationType) {
        this.allowMultiLabel = Objects.requireNonNull(allowMultiLabel, "expected parameter 'allowMultiLabel' to be non-null");
        this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet, "expected parameter 'annotationSpecSet' to be non-null");
        this.answerAggregationType = Objects.requireNonNull(answerAggregationType, "expected parameter 'answerAggregationType' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse() {
        this.allowMultiLabel = null;
        this.annotationSpecSet = null;
        this.answerAggregationType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowMultiLabel;
        private String annotationSpecSet;
        private String answerAggregationType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowMultiLabel = defaults.allowMultiLabel;
    	      this.annotationSpecSet = defaults.annotationSpecSet;
    	      this.answerAggregationType = defaults.answerAggregationType;
        }

        public Builder allowMultiLabel(Boolean allowMultiLabel) {
            this.allowMultiLabel = Objects.requireNonNull(allowMultiLabel);
            return this;
        }
        public Builder annotationSpecSet(String annotationSpecSet) {
            this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet);
            return this;
        }
        public Builder answerAggregationType(String answerAggregationType) {
            this.answerAggregationType = Objects.requireNonNull(answerAggregationType);
            return this;
        }        public GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse(allowMultiLabel, annotationSpecSet, answerAggregationType);
        }
    }
}
