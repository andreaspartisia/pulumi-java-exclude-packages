// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionRuleCorrelationFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionRuleCorrelationFilterArgs Empty = new SubscriptionRuleCorrelationFilterArgs();

    /**
     * Content type of the message.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return Content type of the message.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * Identifier of the correlation.
     * 
     */
    @Import(name="correlationId")
    private @Nullable Output<String> correlationId;

    /**
     * @return Identifier of the correlation.
     * 
     */
    public Optional<Output<String>> correlationId() {
        return Optional.ofNullable(this.correlationId);
    }

    /**
     * Application specific label.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return Application specific label.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Identifier of the message.
     * 
     */
    @Import(name="messageId")
    private @Nullable Output<String> messageId;

    /**
     * @return Identifier of the message.
     * 
     */
    public Optional<Output<String>> messageId() {
        return Optional.ofNullable(this.messageId);
    }

    /**
     * A list of user defined properties to be included in the filter. Specified as a map of name/value pairs.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return A list of user defined properties to be included in the filter. Specified as a map of name/value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Address of the queue to reply to.
     * 
     */
    @Import(name="replyTo")
    private @Nullable Output<String> replyTo;

    /**
     * @return Address of the queue to reply to.
     * 
     */
    public Optional<Output<String>> replyTo() {
        return Optional.ofNullable(this.replyTo);
    }

    /**
     * Session identifier to reply to.
     * 
     */
    @Import(name="replyToSessionId")
    private @Nullable Output<String> replyToSessionId;

    /**
     * @return Session identifier to reply to.
     * 
     */
    public Optional<Output<String>> replyToSessionId() {
        return Optional.ofNullable(this.replyToSessionId);
    }

    /**
     * Session identifier.
     * 
     */
    @Import(name="sessionId")
    private @Nullable Output<String> sessionId;

    /**
     * @return Session identifier.
     * 
     */
    public Optional<Output<String>> sessionId() {
        return Optional.ofNullable(this.sessionId);
    }

    /**
     * Address to send to.
     * 
     */
    @Import(name="to")
    private @Nullable Output<String> to;

    /**
     * @return Address to send to.
     * 
     */
    public Optional<Output<String>> to() {
        return Optional.ofNullable(this.to);
    }

    private SubscriptionRuleCorrelationFilterArgs() {}

    private SubscriptionRuleCorrelationFilterArgs(SubscriptionRuleCorrelationFilterArgs $) {
        this.contentType = $.contentType;
        this.correlationId = $.correlationId;
        this.label = $.label;
        this.messageId = $.messageId;
        this.properties = $.properties;
        this.replyTo = $.replyTo;
        this.replyToSessionId = $.replyToSessionId;
        this.sessionId = $.sessionId;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionRuleCorrelationFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionRuleCorrelationFilterArgs $;

        public Builder() {
            $ = new SubscriptionRuleCorrelationFilterArgs();
        }

        public Builder(SubscriptionRuleCorrelationFilterArgs defaults) {
            $ = new SubscriptionRuleCorrelationFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType Content type of the message.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType Content type of the message.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param correlationId Identifier of the correlation.
         * 
         * @return builder
         * 
         */
        public Builder correlationId(@Nullable Output<String> correlationId) {
            $.correlationId = correlationId;
            return this;
        }

        /**
         * @param correlationId Identifier of the correlation.
         * 
         * @return builder
         * 
         */
        public Builder correlationId(String correlationId) {
            return correlationId(Output.of(correlationId));
        }

        /**
         * @param label Application specific label.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Application specific label.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param messageId Identifier of the message.
         * 
         * @return builder
         * 
         */
        public Builder messageId(@Nullable Output<String> messageId) {
            $.messageId = messageId;
            return this;
        }

        /**
         * @param messageId Identifier of the message.
         * 
         * @return builder
         * 
         */
        public Builder messageId(String messageId) {
            return messageId(Output.of(messageId));
        }

        /**
         * @param properties A list of user defined properties to be included in the filter. Specified as a map of name/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A list of user defined properties to be included in the filter. Specified as a map of name/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param replyTo Address of the queue to reply to.
         * 
         * @return builder
         * 
         */
        public Builder replyTo(@Nullable Output<String> replyTo) {
            $.replyTo = replyTo;
            return this;
        }

        /**
         * @param replyTo Address of the queue to reply to.
         * 
         * @return builder
         * 
         */
        public Builder replyTo(String replyTo) {
            return replyTo(Output.of(replyTo));
        }

        /**
         * @param replyToSessionId Session identifier to reply to.
         * 
         * @return builder
         * 
         */
        public Builder replyToSessionId(@Nullable Output<String> replyToSessionId) {
            $.replyToSessionId = replyToSessionId;
            return this;
        }

        /**
         * @param replyToSessionId Session identifier to reply to.
         * 
         * @return builder
         * 
         */
        public Builder replyToSessionId(String replyToSessionId) {
            return replyToSessionId(Output.of(replyToSessionId));
        }

        /**
         * @param sessionId Session identifier.
         * 
         * @return builder
         * 
         */
        public Builder sessionId(@Nullable Output<String> sessionId) {
            $.sessionId = sessionId;
            return this;
        }

        /**
         * @param sessionId Session identifier.
         * 
         * @return builder
         * 
         */
        public Builder sessionId(String sessionId) {
            return sessionId(Output.of(sessionId));
        }

        /**
         * @param to Address to send to.
         * 
         * @return builder
         * 
         */
        public Builder to(@Nullable Output<String> to) {
            $.to = to;
            return this;
        }

        /**
         * @param to Address to send to.
         * 
         * @return builder
         * 
         */
        public Builder to(String to) {
            return to(Output.of(to));
        }

        public SubscriptionRuleCorrelationFilterArgs build() {
            return $;
        }
    }

}
