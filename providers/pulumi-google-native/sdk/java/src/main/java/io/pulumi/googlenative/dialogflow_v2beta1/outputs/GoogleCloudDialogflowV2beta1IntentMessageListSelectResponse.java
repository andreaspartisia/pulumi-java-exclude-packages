// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse {
    /**
     * List items.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse> items;
    /**
     * Optional. Subtitle of the list.
     * 
     */
    private final String subtitle;
    /**
     * Optional. The overall title of the list.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse(
        @CustomType.Parameter("items") List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse> items,
        @CustomType.Parameter("subtitle") String subtitle,
        @CustomType.Parameter("title") String title) {
        this.items = items;
        this.subtitle = subtitle;
        this.title = title;
    }

    /**
     * List items.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse> items() {
        return this.items;
    }
    /**
     * Optional. Subtitle of the list.
     * 
    */
    public String subtitle() {
        return this.subtitle;
    }
    /**
     * Optional. The overall title of the list.
     * 
    */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse> items;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder items(List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse... items) {
            return items(List.of(items));
        }
        public Builder subtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse(items, subtitle, title);
        }
    }
}
