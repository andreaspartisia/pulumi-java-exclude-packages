// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Opens the given URI.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse();

    /**
     * The HTTP or HTTPS scheme URI.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse(String uri) {
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse() {
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse(uri);
        }
    }
}
