// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse {
    /**
     * Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, at most 5 knowledge bases are supported.
     * 
     */
    private final List<String> knowledgeBases;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse(@CustomType.Parameter("knowledgeBases") List<String> knowledgeBases) {
        this.knowledgeBases = knowledgeBases;
    }

    /**
     * Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, at most 5 knowledge bases are supported.
     * 
    */
    public List<String> knowledgeBases() {
        return this.knowledgeBases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> knowledgeBases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knowledgeBases = defaults.knowledgeBases;
        }

        public Builder knowledgeBases(List<String> knowledgeBases) {
            this.knowledgeBases = Objects.requireNonNull(knowledgeBases);
            return this;
        }
        public Builder knowledgeBases(String... knowledgeBases) {
            return knowledgeBases(List.of(knowledgeBases));
        }        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse(knowledgeBases);
        }
    }
}
