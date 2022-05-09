// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.eventhub.inputs.EventSubscriptionAdvancedFilterArgs;
import com.pulumi.azure.eventhub.inputs.EventSubscriptionAzureFunctionEndpointArgs;
import com.pulumi.azure.eventhub.inputs.EventSubscriptionDeadLetterIdentityArgs;
import com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryIdentityArgs;
import com.pulumi.azure.eventhub.inputs.EventSubscriptionDeliveryPropertyArgs;
import com.pulumi.azure.eventhub.inputs.EventSubscriptionRetryPolicyArgs;
import com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageBlobDeadLetterDestinationArgs;
import com.pulumi.azure.eventhub.inputs.EventSubscriptionStorageQueueEndpointArgs;
import com.pulumi.azure.eventhub.inputs.EventSubscriptionSubjectFilterArgs;
import com.pulumi.azure.eventhub.inputs.EventSubscriptionWebhookEndpointArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionArgs Empty = new EventSubscriptionArgs();

    /**
     * A `advanced_filter` block as defined below.
     * 
     */
    @Import(name="advancedFilter")
    private @Nullable Output<EventSubscriptionAdvancedFilterArgs> advancedFilter;

    /**
     * @return A `advanced_filter` block as defined below.
     * 
     */
    public Optional<Output<EventSubscriptionAdvancedFilterArgs>> advancedFilter() {
        return Optional.ofNullable(this.advancedFilter);
    }

    /**
     * Specifies whether advanced filters should be evaluated against an array of values instead of expecting a singular value. Defaults to `false`.
     * 
     */
    @Import(name="advancedFilteringOnArraysEnabled")
    private @Nullable Output<Boolean> advancedFilteringOnArraysEnabled;

    /**
     * @return Specifies whether advanced filters should be evaluated against an array of values instead of expecting a singular value. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> advancedFilteringOnArraysEnabled() {
        return Optional.ofNullable(this.advancedFilteringOnArraysEnabled);
    }

    /**
     * An `azure_function_endpoint` block as defined below.
     * 
     */
    @Import(name="azureFunctionEndpoint")
    private @Nullable Output<EventSubscriptionAzureFunctionEndpointArgs> azureFunctionEndpoint;

    /**
     * @return An `azure_function_endpoint` block as defined below.
     * 
     */
    public Optional<Output<EventSubscriptionAzureFunctionEndpointArgs>> azureFunctionEndpoint() {
        return Optional.ofNullable(this.azureFunctionEndpoint);
    }

    /**
     * A `dead_letter_identity` block as defined below.
     * 
     */
    @Import(name="deadLetterIdentity")
    private @Nullable Output<EventSubscriptionDeadLetterIdentityArgs> deadLetterIdentity;

    /**
     * @return A `dead_letter_identity` block as defined below.
     * 
     */
    public Optional<Output<EventSubscriptionDeadLetterIdentityArgs>> deadLetterIdentity() {
        return Optional.ofNullable(this.deadLetterIdentity);
    }

    /**
     * A `delivery_identity` block as defined below.
     * 
     */
    @Import(name="deliveryIdentity")
    private @Nullable Output<EventSubscriptionDeliveryIdentityArgs> deliveryIdentity;

    /**
     * @return A `delivery_identity` block as defined below.
     * 
     */
    public Optional<Output<EventSubscriptionDeliveryIdentityArgs>> deliveryIdentity() {
        return Optional.ofNullable(this.deliveryIdentity);
    }

    /**
     * A `delivery_property` block as defined below.
     * 
     */
    @Import(name="deliveryProperties")
    private @Nullable Output<List<EventSubscriptionDeliveryPropertyArgs>> deliveryProperties;

    /**
     * @return A `delivery_property` block as defined below.
     * 
     */
    public Optional<Output<List<EventSubscriptionDeliveryPropertyArgs>>> deliveryProperties() {
        return Optional.ofNullable(this.deliveryProperties);
    }

    /**
     * Specifies the event delivery schema for the event subscription. Possible values include: `EventGridSchema`, `CloudEventSchemaV1_0`, `CustomInputSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="eventDeliverySchema")
    private @Nullable Output<String> eventDeliverySchema;

    /**
     * @return Specifies the event delivery schema for the event subscription. Possible values include: `EventGridSchema`, `CloudEventSchemaV1_0`, `CustomInputSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> eventDeliverySchema() {
        return Optional.ofNullable(this.eventDeliverySchema);
    }

    /**
     * Specifies the id where the Event Hub is located.
     * 
     */
    @Import(name="eventhubEndpointId")
    private @Nullable Output<String> eventhubEndpointId;

    /**
     * @return Specifies the id where the Event Hub is located.
     * 
     */
    public Optional<Output<String>> eventhubEndpointId() {
        return Optional.ofNullable(this.eventhubEndpointId);
    }

    /**
     * Specifies the expiration time of the event subscription (Datetime Format `RFC 3339`).
     * 
     */
    @Import(name="expirationTimeUtc")
    private @Nullable Output<String> expirationTimeUtc;

    /**
     * @return Specifies the expiration time of the event subscription (Datetime Format `RFC 3339`).
     * 
     */
    public Optional<Output<String>> expirationTimeUtc() {
        return Optional.ofNullable(this.expirationTimeUtc);
    }

    /**
     * Specifies the id where the Hybrid Connection is located.
     * 
     */
    @Import(name="hybridConnectionEndpointId")
    private @Nullable Output<String> hybridConnectionEndpointId;

    /**
     * @return Specifies the id where the Hybrid Connection is located.
     * 
     */
    public Optional<Output<String>> hybridConnectionEndpointId() {
        return Optional.ofNullable(this.hybridConnectionEndpointId);
    }

    /**
     * A list of applicable event types that need to be part of the event subscription.
     * 
     */
    @Import(name="includedEventTypes")
    private @Nullable Output<List<String>> includedEventTypes;

    /**
     * @return A list of applicable event types that need to be part of the event subscription.
     * 
     */
    public Optional<Output<List<String>>> includedEventTypes() {
        return Optional.ofNullable(this.includedEventTypes);
    }

    /**
     * A list of labels to assign to the event subscription.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return A list of labels to assign to the event subscription.
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Specifies the name of the EventGrid Event Subscription resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the EventGrid Event Subscription resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `retry_policy` block as defined below.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<EventSubscriptionRetryPolicyArgs> retryPolicy;

    /**
     * @return A `retry_policy` block as defined below.
     * 
     */
    public Optional<Output<EventSubscriptionRetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Specifies the scope at which the EventGrid Event Subscription should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return Specifies the scope at which the EventGrid Event Subscription should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * Specifies the id where the Service Bus Queue is located.
     * 
     */
    @Import(name="serviceBusQueueEndpointId")
    private @Nullable Output<String> serviceBusQueueEndpointId;

    /**
     * @return Specifies the id where the Service Bus Queue is located.
     * 
     */
    public Optional<Output<String>> serviceBusQueueEndpointId() {
        return Optional.ofNullable(this.serviceBusQueueEndpointId);
    }

    /**
     * Specifies the id where the Service Bus Topic is located.
     * 
     */
    @Import(name="serviceBusTopicEndpointId")
    private @Nullable Output<String> serviceBusTopicEndpointId;

    /**
     * @return Specifies the id where the Service Bus Topic is located.
     * 
     */
    public Optional<Output<String>> serviceBusTopicEndpointId() {
        return Optional.ofNullable(this.serviceBusTopicEndpointId);
    }

    /**
     * A `storage_blob_dead_letter_destination` block as defined below.
     * 
     */
    @Import(name="storageBlobDeadLetterDestination")
    private @Nullable Output<EventSubscriptionStorageBlobDeadLetterDestinationArgs> storageBlobDeadLetterDestination;

    /**
     * @return A `storage_blob_dead_letter_destination` block as defined below.
     * 
     */
    public Optional<Output<EventSubscriptionStorageBlobDeadLetterDestinationArgs>> storageBlobDeadLetterDestination() {
        return Optional.ofNullable(this.storageBlobDeadLetterDestination);
    }

    /**
     * A `storage_queue_endpoint` block as defined below.
     * 
     */
    @Import(name="storageQueueEndpoint")
    private @Nullable Output<EventSubscriptionStorageQueueEndpointArgs> storageQueueEndpoint;

    /**
     * @return A `storage_queue_endpoint` block as defined below.
     * 
     */
    public Optional<Output<EventSubscriptionStorageQueueEndpointArgs>> storageQueueEndpoint() {
        return Optional.ofNullable(this.storageQueueEndpoint);
    }

    /**
     * A `subject_filter` block as defined below.
     * 
     */
    @Import(name="subjectFilter")
    private @Nullable Output<EventSubscriptionSubjectFilterArgs> subjectFilter;

    /**
     * @return A `subject_filter` block as defined below.
     * 
     */
    public Optional<Output<EventSubscriptionSubjectFilterArgs>> subjectFilter() {
        return Optional.ofNullable(this.subjectFilter);
    }

    /**
     * A `webhook_endpoint` block as defined below.
     * 
     */
    @Import(name="webhookEndpoint")
    private @Nullable Output<EventSubscriptionWebhookEndpointArgs> webhookEndpoint;

    /**
     * @return A `webhook_endpoint` block as defined below.
     * 
     */
    public Optional<Output<EventSubscriptionWebhookEndpointArgs>> webhookEndpoint() {
        return Optional.ofNullable(this.webhookEndpoint);
    }

    private EventSubscriptionArgs() {}

    private EventSubscriptionArgs(EventSubscriptionArgs $) {
        this.advancedFilter = $.advancedFilter;
        this.advancedFilteringOnArraysEnabled = $.advancedFilteringOnArraysEnabled;
        this.azureFunctionEndpoint = $.azureFunctionEndpoint;
        this.deadLetterIdentity = $.deadLetterIdentity;
        this.deliveryIdentity = $.deliveryIdentity;
        this.deliveryProperties = $.deliveryProperties;
        this.eventDeliverySchema = $.eventDeliverySchema;
        this.eventhubEndpointId = $.eventhubEndpointId;
        this.expirationTimeUtc = $.expirationTimeUtc;
        this.hybridConnectionEndpointId = $.hybridConnectionEndpointId;
        this.includedEventTypes = $.includedEventTypes;
        this.labels = $.labels;
        this.name = $.name;
        this.retryPolicy = $.retryPolicy;
        this.scope = $.scope;
        this.serviceBusQueueEndpointId = $.serviceBusQueueEndpointId;
        this.serviceBusTopicEndpointId = $.serviceBusTopicEndpointId;
        this.storageBlobDeadLetterDestination = $.storageBlobDeadLetterDestination;
        this.storageQueueEndpoint = $.storageQueueEndpoint;
        this.subjectFilter = $.subjectFilter;
        this.webhookEndpoint = $.webhookEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionArgs $;

        public Builder() {
            $ = new EventSubscriptionArgs();
        }

        public Builder(EventSubscriptionArgs defaults) {
            $ = new EventSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedFilter A `advanced_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder advancedFilter(@Nullable Output<EventSubscriptionAdvancedFilterArgs> advancedFilter) {
            $.advancedFilter = advancedFilter;
            return this;
        }

        /**
         * @param advancedFilter A `advanced_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder advancedFilter(EventSubscriptionAdvancedFilterArgs advancedFilter) {
            return advancedFilter(Output.of(advancedFilter));
        }

        /**
         * @param advancedFilteringOnArraysEnabled Specifies whether advanced filters should be evaluated against an array of values instead of expecting a singular value. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder advancedFilteringOnArraysEnabled(@Nullable Output<Boolean> advancedFilteringOnArraysEnabled) {
            $.advancedFilteringOnArraysEnabled = advancedFilteringOnArraysEnabled;
            return this;
        }

        /**
         * @param advancedFilteringOnArraysEnabled Specifies whether advanced filters should be evaluated against an array of values instead of expecting a singular value. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder advancedFilteringOnArraysEnabled(Boolean advancedFilteringOnArraysEnabled) {
            return advancedFilteringOnArraysEnabled(Output.of(advancedFilteringOnArraysEnabled));
        }

        /**
         * @param azureFunctionEndpoint An `azure_function_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureFunctionEndpoint(@Nullable Output<EventSubscriptionAzureFunctionEndpointArgs> azureFunctionEndpoint) {
            $.azureFunctionEndpoint = azureFunctionEndpoint;
            return this;
        }

        /**
         * @param azureFunctionEndpoint An `azure_function_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureFunctionEndpoint(EventSubscriptionAzureFunctionEndpointArgs azureFunctionEndpoint) {
            return azureFunctionEndpoint(Output.of(azureFunctionEndpoint));
        }

        /**
         * @param deadLetterIdentity A `dead_letter_identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterIdentity(@Nullable Output<EventSubscriptionDeadLetterIdentityArgs> deadLetterIdentity) {
            $.deadLetterIdentity = deadLetterIdentity;
            return this;
        }

        /**
         * @param deadLetterIdentity A `dead_letter_identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterIdentity(EventSubscriptionDeadLetterIdentityArgs deadLetterIdentity) {
            return deadLetterIdentity(Output.of(deadLetterIdentity));
        }

        /**
         * @param deliveryIdentity A `delivery_identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryIdentity(@Nullable Output<EventSubscriptionDeliveryIdentityArgs> deliveryIdentity) {
            $.deliveryIdentity = deliveryIdentity;
            return this;
        }

        /**
         * @param deliveryIdentity A `delivery_identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryIdentity(EventSubscriptionDeliveryIdentityArgs deliveryIdentity) {
            return deliveryIdentity(Output.of(deliveryIdentity));
        }

        /**
         * @param deliveryProperties A `delivery_property` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryProperties(@Nullable Output<List<EventSubscriptionDeliveryPropertyArgs>> deliveryProperties) {
            $.deliveryProperties = deliveryProperties;
            return this;
        }

        /**
         * @param deliveryProperties A `delivery_property` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryProperties(List<EventSubscriptionDeliveryPropertyArgs> deliveryProperties) {
            return deliveryProperties(Output.of(deliveryProperties));
        }

        /**
         * @param deliveryProperties A `delivery_property` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryProperties(EventSubscriptionDeliveryPropertyArgs... deliveryProperties) {
            return deliveryProperties(List.of(deliveryProperties));
        }

        /**
         * @param eventDeliverySchema Specifies the event delivery schema for the event subscription. Possible values include: `EventGridSchema`, `CloudEventSchemaV1_0`, `CustomInputSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventDeliverySchema(@Nullable Output<String> eventDeliverySchema) {
            $.eventDeliverySchema = eventDeliverySchema;
            return this;
        }

        /**
         * @param eventDeliverySchema Specifies the event delivery schema for the event subscription. Possible values include: `EventGridSchema`, `CloudEventSchemaV1_0`, `CustomInputSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventDeliverySchema(String eventDeliverySchema) {
            return eventDeliverySchema(Output.of(eventDeliverySchema));
        }

        /**
         * @param eventhubEndpointId Specifies the id where the Event Hub is located.
         * 
         * @return builder
         * 
         */
        public Builder eventhubEndpointId(@Nullable Output<String> eventhubEndpointId) {
            $.eventhubEndpointId = eventhubEndpointId;
            return this;
        }

        /**
         * @param eventhubEndpointId Specifies the id where the Event Hub is located.
         * 
         * @return builder
         * 
         */
        public Builder eventhubEndpointId(String eventhubEndpointId) {
            return eventhubEndpointId(Output.of(eventhubEndpointId));
        }

        /**
         * @param expirationTimeUtc Specifies the expiration time of the event subscription (Datetime Format `RFC 3339`).
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUtc(@Nullable Output<String> expirationTimeUtc) {
            $.expirationTimeUtc = expirationTimeUtc;
            return this;
        }

        /**
         * @param expirationTimeUtc Specifies the expiration time of the event subscription (Datetime Format `RFC 3339`).
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUtc(String expirationTimeUtc) {
            return expirationTimeUtc(Output.of(expirationTimeUtc));
        }

        /**
         * @param hybridConnectionEndpointId Specifies the id where the Hybrid Connection is located.
         * 
         * @return builder
         * 
         */
        public Builder hybridConnectionEndpointId(@Nullable Output<String> hybridConnectionEndpointId) {
            $.hybridConnectionEndpointId = hybridConnectionEndpointId;
            return this;
        }

        /**
         * @param hybridConnectionEndpointId Specifies the id where the Hybrid Connection is located.
         * 
         * @return builder
         * 
         */
        public Builder hybridConnectionEndpointId(String hybridConnectionEndpointId) {
            return hybridConnectionEndpointId(Output.of(hybridConnectionEndpointId));
        }

        /**
         * @param includedEventTypes A list of applicable event types that need to be part of the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder includedEventTypes(@Nullable Output<List<String>> includedEventTypes) {
            $.includedEventTypes = includedEventTypes;
            return this;
        }

        /**
         * @param includedEventTypes A list of applicable event types that need to be part of the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder includedEventTypes(List<String> includedEventTypes) {
            return includedEventTypes(Output.of(includedEventTypes));
        }

        /**
         * @param includedEventTypes A list of applicable event types that need to be part of the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder includedEventTypes(String... includedEventTypes) {
            return includedEventTypes(List.of(includedEventTypes));
        }

        /**
         * @param labels A list of labels to assign to the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A list of labels to assign to the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels A list of labels to assign to the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param name Specifies the name of the EventGrid Event Subscription resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the EventGrid Event Subscription resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param retryPolicy A `retry_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<EventSubscriptionRetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy A `retry_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(EventSubscriptionRetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param scope Specifies the scope at which the EventGrid Event Subscription should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Specifies the scope at which the EventGrid Event Subscription should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param serviceBusQueueEndpointId Specifies the id where the Service Bus Queue is located.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusQueueEndpointId(@Nullable Output<String> serviceBusQueueEndpointId) {
            $.serviceBusQueueEndpointId = serviceBusQueueEndpointId;
            return this;
        }

        /**
         * @param serviceBusQueueEndpointId Specifies the id where the Service Bus Queue is located.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusQueueEndpointId(String serviceBusQueueEndpointId) {
            return serviceBusQueueEndpointId(Output.of(serviceBusQueueEndpointId));
        }

        /**
         * @param serviceBusTopicEndpointId Specifies the id where the Service Bus Topic is located.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusTopicEndpointId(@Nullable Output<String> serviceBusTopicEndpointId) {
            $.serviceBusTopicEndpointId = serviceBusTopicEndpointId;
            return this;
        }

        /**
         * @param serviceBusTopicEndpointId Specifies the id where the Service Bus Topic is located.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusTopicEndpointId(String serviceBusTopicEndpointId) {
            return serviceBusTopicEndpointId(Output.of(serviceBusTopicEndpointId));
        }

        /**
         * @param storageBlobDeadLetterDestination A `storage_blob_dead_letter_destination` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageBlobDeadLetterDestination(@Nullable Output<EventSubscriptionStorageBlobDeadLetterDestinationArgs> storageBlobDeadLetterDestination) {
            $.storageBlobDeadLetterDestination = storageBlobDeadLetterDestination;
            return this;
        }

        /**
         * @param storageBlobDeadLetterDestination A `storage_blob_dead_letter_destination` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageBlobDeadLetterDestination(EventSubscriptionStorageBlobDeadLetterDestinationArgs storageBlobDeadLetterDestination) {
            return storageBlobDeadLetterDestination(Output.of(storageBlobDeadLetterDestination));
        }

        /**
         * @param storageQueueEndpoint A `storage_queue_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageQueueEndpoint(@Nullable Output<EventSubscriptionStorageQueueEndpointArgs> storageQueueEndpoint) {
            $.storageQueueEndpoint = storageQueueEndpoint;
            return this;
        }

        /**
         * @param storageQueueEndpoint A `storage_queue_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageQueueEndpoint(EventSubscriptionStorageQueueEndpointArgs storageQueueEndpoint) {
            return storageQueueEndpoint(Output.of(storageQueueEndpoint));
        }

        /**
         * @param subjectFilter A `subject_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder subjectFilter(@Nullable Output<EventSubscriptionSubjectFilterArgs> subjectFilter) {
            $.subjectFilter = subjectFilter;
            return this;
        }

        /**
         * @param subjectFilter A `subject_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder subjectFilter(EventSubscriptionSubjectFilterArgs subjectFilter) {
            return subjectFilter(Output.of(subjectFilter));
        }

        /**
         * @param webhookEndpoint A `webhook_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder webhookEndpoint(@Nullable Output<EventSubscriptionWebhookEndpointArgs> webhookEndpoint) {
            $.webhookEndpoint = webhookEndpoint;
            return this;
        }

        /**
         * @param webhookEndpoint A `webhook_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder webhookEndpoint(EventSubscriptionWebhookEndpointArgs webhookEndpoint) {
            return webhookEndpoint(Output.of(webhookEndpoint));
        }

        public EventSubscriptionArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
