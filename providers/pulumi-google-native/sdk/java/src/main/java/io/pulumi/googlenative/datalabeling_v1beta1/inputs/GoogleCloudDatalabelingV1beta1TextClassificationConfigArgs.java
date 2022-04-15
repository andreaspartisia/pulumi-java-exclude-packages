// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1SentimentConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Config for text classification human labeling task.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs Empty = new GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs();

    /**
     * Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one text segment.
     * 
     */
    @Import(name="allowMultiLabel")
      private final @Nullable Output<Boolean> allowMultiLabel;

    public Output<Boolean> allowMultiLabel() {
        return this.allowMultiLabel == null ? Codegen.empty() : this.allowMultiLabel;
    }

    /**
     * Annotation spec set resource name.
     * 
     */
    @Import(name="annotationSpecSet", required=true)
      private final Output<String> annotationSpecSet;

    public Output<String> annotationSpecSet() {
        return this.annotationSpecSet;
    }

    /**
     * Optional. Configs for sentiment selection. We deprecate sentiment analysis in data labeling side as it is incompatible with uCAIP.
     * 
     */
    @Import(name="sentimentConfig")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> sentimentConfig;

    public Output<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> sentimentConfig() {
        return this.sentimentConfig == null ? Codegen.empty() : this.sentimentConfig;
    }

    public GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs(
        @Nullable Output<Boolean> allowMultiLabel,
        Output<String> annotationSpecSet,
        @Nullable Output<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> sentimentConfig) {
        this.allowMultiLabel = allowMultiLabel;
        this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet, "expected parameter 'annotationSpecSet' to be non-null");
        this.sentimentConfig = sentimentConfig;
    }

    private GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs() {
        this.allowMultiLabel = Codegen.empty();
        this.annotationSpecSet = Codegen.empty();
        this.sentimentConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowMultiLabel;
        private Output<String> annotationSpecSet;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> sentimentConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowMultiLabel = defaults.allowMultiLabel;
    	      this.annotationSpecSet = defaults.annotationSpecSet;
    	      this.sentimentConfig = defaults.sentimentConfig;
        }

        public Builder allowMultiLabel(@Nullable Output<Boolean> allowMultiLabel) {
            this.allowMultiLabel = allowMultiLabel;
            return this;
        }
        public Builder allowMultiLabel(@Nullable Boolean allowMultiLabel) {
            this.allowMultiLabel = Codegen.ofNullable(allowMultiLabel);
            return this;
        }
        public Builder annotationSpecSet(Output<String> annotationSpecSet) {
            this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet);
            return this;
        }
        public Builder annotationSpecSet(String annotationSpecSet) {
            this.annotationSpecSet = Output.of(Objects.requireNonNull(annotationSpecSet));
            return this;
        }
        public Builder sentimentConfig(@Nullable Output<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> sentimentConfig) {
            this.sentimentConfig = sentimentConfig;
            return this;
        }
        public Builder sentimentConfig(@Nullable GoogleCloudDatalabelingV1beta1SentimentConfigArgs sentimentConfig) {
            this.sentimentConfig = Codegen.ofNullable(sentimentConfig);
            return this;
        }        public GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs build() {
            return new GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs(allowMultiLabel, annotationSpecSet, sentimentConfig);
        }
    }
}
