// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.BotClarificationPromptMessageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotClarificationPromptArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotClarificationPromptArgs Empty = new BotClarificationPromptArgs();

    /**
     * The number of times to prompt the user for information.
     * 
     */
    @InputImport(name="maxAttempts", required=true)
      private final Input<Integer> maxAttempts;

    public Input<Integer> getMaxAttempts() {
        return this.maxAttempts;
    }

    /**
     * A set of messages, each of which provides a message string and its type. You
     * can specify the message string in plain text or in Speech Synthesis Markup Language (SSML). Attributes
     * are documented under message.
     * 
     */
    @InputImport(name="messages", required=true)
      private final Input<List<BotClarificationPromptMessageArgs>> messages;

    public Input<List<BotClarificationPromptMessageArgs>> getMessages() {
        return this.messages;
    }

    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html).
     * 
     */
    @InputImport(name="responseCard")
      private final @Nullable Input<String> responseCard;

    public Input<String> getResponseCard() {
        return this.responseCard == null ? Input.empty() : this.responseCard;
    }

    public BotClarificationPromptArgs(
        Input<Integer> maxAttempts,
        Input<List<BotClarificationPromptMessageArgs>> messages,
        @Nullable Input<String> responseCard) {
        this.maxAttempts = Objects.requireNonNull(maxAttempts, "expected parameter 'maxAttempts' to be non-null");
        this.messages = Objects.requireNonNull(messages, "expected parameter 'messages' to be non-null");
        this.responseCard = responseCard;
    }

    private BotClarificationPromptArgs() {
        this.maxAttempts = Input.empty();
        this.messages = Input.empty();
        this.responseCard = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotClarificationPromptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxAttempts;
        private Input<List<BotClarificationPromptMessageArgs>> messages;
        private @Nullable Input<String> responseCard;

        public Builder() {
    	      // Empty
        }

        public Builder(BotClarificationPromptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        public Builder setMaxAttempts(Input<Integer> maxAttempts) {
            this.maxAttempts = Objects.requireNonNull(maxAttempts);
            return this;
        }

        public Builder setMaxAttempts(Integer maxAttempts) {
            this.maxAttempts = Input.of(Objects.requireNonNull(maxAttempts));
            return this;
        }

        public Builder setMessages(Input<List<BotClarificationPromptMessageArgs>> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder setMessages(List<BotClarificationPromptMessageArgs> messages) {
            this.messages = Input.of(Objects.requireNonNull(messages));
            return this;
        }

        public Builder setResponseCard(@Nullable Input<String> responseCard) {
            this.responseCard = responseCard;
            return this;
        }

        public Builder setResponseCard(@Nullable String responseCard) {
            this.responseCard = Input.ofNullable(responseCard);
            return this;
        }
        public BotClarificationPromptArgs build() {
            return new BotClarificationPromptArgs(maxAttempts, messages, responseCard);
        }
    }
}