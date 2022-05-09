// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSubscriptionDeliveryPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionDeliveryPropertyArgs Empty = new EventSubscriptionDeliveryPropertyArgs();

    /**
     * The name of the header to send on to the destination
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    /**
     * @return The name of the header to send on to the destination
     * 
     */
    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * True if the `value` is a secret and should be protected, otherwise false. If True, then this value won&#39;t be returned from Azure API calls
     * 
     */
    @Import(name="secret")
    private @Nullable Output<Boolean> secret;

    /**
     * @return True if the `value` is a secret and should be protected, otherwise false. If True, then this value won&#39;t be returned from Azure API calls
     * 
     */
    public Optional<Output<Boolean>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * If the `type` is `Dynamic`, then provide the payload field to be used as the value. Valid source fields differ by subscription type.
     * 
     */
    @Import(name="sourceField")
    private @Nullable Output<String> sourceField;

    /**
     * @return If the `type` is `Dynamic`, then provide the payload field to be used as the value. Valid source fields differ by subscription type.
     * 
     */
    public Optional<Output<String>> sourceField() {
        return Optional.ofNullable(this.sourceField);
    }

    /**
     * Either `Static` or `Dynamic`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Either `Static` or `Dynamic`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * If the `type` is `Static`, then provide the value to use
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return If the `type` is `Static`, then provide the value to use
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private EventSubscriptionDeliveryPropertyArgs() {}

    private EventSubscriptionDeliveryPropertyArgs(EventSubscriptionDeliveryPropertyArgs $) {
        this.headerName = $.headerName;
        this.secret = $.secret;
        this.sourceField = $.sourceField;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionDeliveryPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionDeliveryPropertyArgs $;

        public Builder() {
            $ = new EventSubscriptionDeliveryPropertyArgs();
        }

        public Builder(EventSubscriptionDeliveryPropertyArgs defaults) {
            $ = new EventSubscriptionDeliveryPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerName The name of the header to send on to the destination
         * 
         * @return builder
         * 
         */
        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName The name of the header to send on to the destination
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param secret True if the `value` is a secret and should be protected, otherwise false. If True, then this value won&#39;t be returned from Azure API calls
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<Boolean> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret True if the `value` is a secret and should be protected, otherwise false. If True, then this value won&#39;t be returned from Azure API calls
         * 
         * @return builder
         * 
         */
        public Builder secret(Boolean secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param sourceField If the `type` is `Dynamic`, then provide the payload field to be used as the value. Valid source fields differ by subscription type.
         * 
         * @return builder
         * 
         */
        public Builder sourceField(@Nullable Output<String> sourceField) {
            $.sourceField = sourceField;
            return this;
        }

        /**
         * @param sourceField If the `type` is `Dynamic`, then provide the payload field to be used as the value. Valid source fields differ by subscription type.
         * 
         * @return builder
         * 
         */
        public Builder sourceField(String sourceField) {
            return sourceField(Output.of(sourceField));
        }

        /**
         * @param type Either `Static` or `Dynamic`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Either `Static` or `Dynamic`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value If the `type` is `Static`, then provide the value to use
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value If the `type` is `Static`, then provide the value to use
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EventSubscriptionDeliveryPropertyArgs build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
