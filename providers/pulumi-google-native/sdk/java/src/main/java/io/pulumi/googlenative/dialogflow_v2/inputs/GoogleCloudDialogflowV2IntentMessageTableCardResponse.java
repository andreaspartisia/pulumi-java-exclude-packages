// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageTableCardRowResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Table card for Actions on Google.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageTableCardResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageTableCardResponse Empty = new GoogleCloudDialogflowV2IntentMessageTableCardResponse();

    /**
     * Optional. List of buttons for the card.
     * 
     */
    @Import(name="buttons", required=true)
      private final List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons;

    public List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons() {
        return this.buttons;
    }

    /**
     * Optional. Display properties for the columns in this table.
     * 
     */
    @Import(name="columnProperties", required=true)
      private final List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> columnProperties;

    public List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> columnProperties() {
        return this.columnProperties;
    }

    /**
     * Optional. Image which should be displayed on the card.
     * 
     */
    @Import(name="image", required=true)
      private final GoogleCloudDialogflowV2IntentMessageImageResponse image;

    public GoogleCloudDialogflowV2IntentMessageImageResponse image() {
        return this.image;
    }

    /**
     * Optional. Rows in this table of data.
     * 
     */
    @Import(name="rows", required=true)
      private final List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> rows;

    public List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> rows() {
        return this.rows;
    }

    /**
     * Optional. Subtitle to the title.
     * 
     */
    @Import(name="subtitle", required=true)
      private final String subtitle;

    public String subtitle() {
        return this.subtitle;
    }

    /**
     * Title of the card.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String title() {
        return this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageTableCardResponse(
        List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons,
        List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> columnProperties,
        GoogleCloudDialogflowV2IntentMessageImageResponse image,
        List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> rows,
        String subtitle,
        String title) {
        this.buttons = Objects.requireNonNull(buttons, "expected parameter 'buttons' to be non-null");
        this.columnProperties = Objects.requireNonNull(columnProperties, "expected parameter 'columnProperties' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.rows = Objects.requireNonNull(rows, "expected parameter 'rows' to be non-null");
        this.subtitle = Objects.requireNonNull(subtitle, "expected parameter 'subtitle' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageTableCardResponse() {
        this.buttons = List.of();
        this.columnProperties = List.of();
        this.image = null;
        this.rows = List.of();
        this.subtitle = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons;
        private List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> columnProperties;
        private GoogleCloudDialogflowV2IntentMessageImageResponse image;
        private List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> rows;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.columnProperties = defaults.columnProperties;
    	      this.image = defaults.image;
    	      this.rows = defaults.rows;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder buttons(List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons) {
            this.buttons = Objects.requireNonNull(buttons);
            return this;
        }
        public Builder buttons(GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse... buttons) {
            return buttons(List.of(buttons));
        }
        public Builder columnProperties(List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> columnProperties) {
            this.columnProperties = Objects.requireNonNull(columnProperties);
            return this;
        }
        public Builder columnProperties(GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse... columnProperties) {
            return columnProperties(List.of(columnProperties));
        }
        public Builder image(GoogleCloudDialogflowV2IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder rows(List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> rows) {
            this.rows = Objects.requireNonNull(rows);
            return this;
        }
        public Builder rows(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse... rows) {
            return rows(List.of(rows));
        }
        public Builder subtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageTableCardResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageTableCardResponse(buttons, columnProperties, image, rows, subtitle, title);
        }
    }
}
