// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An item in the list.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageListSelectItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageListSelectItemArgs Empty = new GoogleCloudDialogflowV2IntentMessageListSelectItemArgs();

    /**
     * Optional. The main text describing the item.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. The image to display.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image;

    public Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image() {
        return this.image == null ? Codegen.empty() : this.image;
    }

    /**
     * Additional information about this option.
     * 
     */
    @Import(name="info", required=true)
      private final Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info;

    public Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info() {
        return this.info;
    }

    /**
     * The title of the list item.
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> title() {
        return this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageListSelectItemArgs(
        @Nullable Output<String> description,
        @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image,
        Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info,
        Output<String> title) {
        this.description = description;
        this.image = image;
        this.info = Objects.requireNonNull(info, "expected parameter 'info' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageListSelectItemArgs() {
        this.description = Codegen.empty();
        this.image = Codegen.empty();
        this.info = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageListSelectItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image;
        private Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info;
        private Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageListSelectItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.info = defaults.info;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder image(@Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable GoogleCloudDialogflowV2IntentMessageImageArgs image) {
            this.image = Codegen.ofNullable(image);
            return this;
        }
        public Builder info(Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }
        public Builder info(GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs info) {
            this.info = Output.of(Objects.requireNonNull(info));
            return this;
        }
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageListSelectItemArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageListSelectItemArgs(description, image, info, title);
        }
    }
}
