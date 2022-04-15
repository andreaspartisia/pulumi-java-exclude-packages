// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Settings that determine how to filter recent conversation context when generating suggestions.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse();

    /**
     * If set to true, the last message from virtual agent (hand off message) and the message before it (trigger message of hand off) are dropped.
     * 
     */
    @Import(name="dropHandoffMessages", required=true)
      private final Boolean dropHandoffMessages;

    public Boolean dropHandoffMessages() {
        return this.dropHandoffMessages;
    }

    /**
     * If set to true, all messages from ivr stage are dropped.
     * 
     */
    @Import(name="dropIvrMessages", required=true)
      private final Boolean dropIvrMessages;

    public Boolean dropIvrMessages() {
        return this.dropIvrMessages;
    }

    /**
     * If set to true, all messages from virtual agent are dropped.
     * 
     */
    @Import(name="dropVirtualAgentMessages", required=true)
      private final Boolean dropVirtualAgentMessages;

    public Boolean dropVirtualAgentMessages() {
        return this.dropVirtualAgentMessages;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse(
        Boolean dropHandoffMessages,
        Boolean dropIvrMessages,
        Boolean dropVirtualAgentMessages) {
        this.dropHandoffMessages = Objects.requireNonNull(dropHandoffMessages, "expected parameter 'dropHandoffMessages' to be non-null");
        this.dropIvrMessages = Objects.requireNonNull(dropIvrMessages, "expected parameter 'dropIvrMessages' to be non-null");
        this.dropVirtualAgentMessages = Objects.requireNonNull(dropVirtualAgentMessages, "expected parameter 'dropVirtualAgentMessages' to be non-null");
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse() {
        this.dropHandoffMessages = null;
        this.dropIvrMessages = null;
        this.dropVirtualAgentMessages = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean dropHandoffMessages;
        private Boolean dropIvrMessages;
        private Boolean dropVirtualAgentMessages;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dropHandoffMessages = defaults.dropHandoffMessages;
    	      this.dropIvrMessages = defaults.dropIvrMessages;
    	      this.dropVirtualAgentMessages = defaults.dropVirtualAgentMessages;
        }

        public Builder dropHandoffMessages(Boolean dropHandoffMessages) {
            this.dropHandoffMessages = Objects.requireNonNull(dropHandoffMessages);
            return this;
        }
        public Builder dropIvrMessages(Boolean dropIvrMessages) {
            this.dropIvrMessages = Objects.requireNonNull(dropIvrMessages);
            return this;
        }
        public Builder dropVirtualAgentMessages(Boolean dropVirtualAgentMessages) {
            this.dropVirtualAgentMessages = Objects.requireNonNull(dropVirtualAgentMessages);
            return this;
        }        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsResponse(dropHandoffMessages, dropIvrMessages, dropVirtualAgentMessages);
        }
    }
}
