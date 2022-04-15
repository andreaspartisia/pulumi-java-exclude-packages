// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.storagetransfer_v1.enums.NotificationConfigEventTypesItem;
import io.pulumi.googlenative.storagetransfer_v1.enums.NotificationConfigPayloadFormat;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification to configure notifications published to Pub/Sub. Notifications are published to the customer-provided topic using the following `PubsubMessage.attributes`: * `"eventType"`: one of the EventType values * `"payloadFormat"`: one of the PayloadFormat values * `"projectId"`: the project_id of the `TransferOperation` * `"transferJobName"`: the transfer_job_name of the `TransferOperation` * `"transferOperationName"`: the name of the `TransferOperation` The `PubsubMessage.data` contains a TransferOperation resource formatted according to the specified `PayloadFormat`.
 * 
 */
public final class NotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationConfigArgs Empty = new NotificationConfigArgs();

    /**
     * Event types for which a notification is desired. If empty, send notifications for all event types.
     * 
     */
    @Import(name="eventTypes")
      private final @Nullable Output<List<NotificationConfigEventTypesItem>> eventTypes;

    public Output<List<NotificationConfigEventTypesItem>> eventTypes() {
        return this.eventTypes == null ? Codegen.empty() : this.eventTypes;
    }

    /**
     * The desired format of the notification message payloads.
     * 
     */
    @Import(name="payloadFormat", required=true)
      private final Output<NotificationConfigPayloadFormat> payloadFormat;

    public Output<NotificationConfigPayloadFormat> payloadFormat() {
        return this.payloadFormat;
    }

    /**
     * The `Topic.name` of the Pub/Sub topic to which to publish notifications. Must be of the format: `projects/{project}/topics/{topic}`. Not matching this format results in an INVALID_ARGUMENT error.
     * 
     */
    @Import(name="pubsubTopic", required=true)
      private final Output<String> pubsubTopic;

    public Output<String> pubsubTopic() {
        return this.pubsubTopic;
    }

    public NotificationConfigArgs(
        @Nullable Output<List<NotificationConfigEventTypesItem>> eventTypes,
        Output<NotificationConfigPayloadFormat> payloadFormat,
        Output<String> pubsubTopic) {
        this.eventTypes = eventTypes;
        this.payloadFormat = Objects.requireNonNull(payloadFormat, "expected parameter 'payloadFormat' to be non-null");
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic, "expected parameter 'pubsubTopic' to be non-null");
    }

    private NotificationConfigArgs() {
        this.eventTypes = Codegen.empty();
        this.payloadFormat = Codegen.empty();
        this.pubsubTopic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NotificationConfigEventTypesItem>> eventTypes;
        private Output<NotificationConfigPayloadFormat> payloadFormat;
        private Output<String> pubsubTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTypes = defaults.eventTypes;
    	      this.payloadFormat = defaults.payloadFormat;
    	      this.pubsubTopic = defaults.pubsubTopic;
        }

        public Builder eventTypes(@Nullable Output<List<NotificationConfigEventTypesItem>> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }
        public Builder eventTypes(@Nullable List<NotificationConfigEventTypesItem> eventTypes) {
            this.eventTypes = Codegen.ofNullable(eventTypes);
            return this;
        }
        public Builder eventTypes(NotificationConfigEventTypesItem... eventTypes) {
            return eventTypes(List.of(eventTypes));
        }
        public Builder payloadFormat(Output<NotificationConfigPayloadFormat> payloadFormat) {
            this.payloadFormat = Objects.requireNonNull(payloadFormat);
            return this;
        }
        public Builder payloadFormat(NotificationConfigPayloadFormat payloadFormat) {
            this.payloadFormat = Output.of(Objects.requireNonNull(payloadFormat));
            return this;
        }
        public Builder pubsubTopic(Output<String> pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }
        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Output.of(Objects.requireNonNull(pubsubTopic));
            return this;
        }        public NotificationConfigArgs build() {
            return new NotificationConfigArgs(eventTypes, payloadFormat, pubsubTopic);
        }
    }
}
