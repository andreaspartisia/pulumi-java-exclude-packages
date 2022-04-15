// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Config to process conversation.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs();

    /**
     * Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
     * 
     */
    @Import(name="recentSentencesCount")
      private final @Nullable Output<Integer> recentSentencesCount;

    public Output<Integer> recentSentencesCount() {
        return this.recentSentencesCount == null ? Codegen.empty() : this.recentSentencesCount;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs(@Nullable Output<Integer> recentSentencesCount) {
        this.recentSentencesCount = recentSentencesCount;
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs() {
        this.recentSentencesCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> recentSentencesCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recentSentencesCount = defaults.recentSentencesCount;
        }

        public Builder recentSentencesCount(@Nullable Output<Integer> recentSentencesCount) {
            this.recentSentencesCount = recentSentencesCount;
            return this;
        }
        public Builder recentSentencesCount(@Nullable Integer recentSentencesCount) {
            this.recentSentencesCount = Codegen.ofNullable(recentSentencesCount);
            return this;
        }        public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs(recentSentencesCount);
        }
    }
}
