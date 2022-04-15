// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Document source settings. Supported features: SMART_REPLY, SMART_COMPOSE.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs();

    /**
     * Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, only one document is supported.
     * 
     */
    @Import(name="documents", required=true)
      private final Output<List<String>> documents;

    public Output<List<String>> documents() {
        return this.documents;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs(Output<List<String>> documents) {
        this.documents = Objects.requireNonNull(documents, "expected parameter 'documents' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs() {
        this.documents = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> documents;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documents = defaults.documents;
        }

        public Builder documents(Output<List<String>> documents) {
            this.documents = Objects.requireNonNull(documents);
            return this;
        }
        public Builder documents(List<String> documents) {
            this.documents = Output.of(Objects.requireNonNull(documents));
            return this;
        }
        public Builder documents(String... documents) {
            return documents(List.of(documents));
        }        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs(documents);
        }
    }
}
