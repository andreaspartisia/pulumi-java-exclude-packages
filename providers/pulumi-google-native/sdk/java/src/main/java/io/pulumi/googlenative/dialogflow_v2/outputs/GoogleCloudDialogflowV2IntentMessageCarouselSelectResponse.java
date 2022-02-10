// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse {
    private final List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items;

    @OutputCustomType.Constructor({"items"})
    private GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse(List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items) {
        this.items = Objects.requireNonNull(items);
    }

    public List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> getItems() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse(items);
        }
    }
}