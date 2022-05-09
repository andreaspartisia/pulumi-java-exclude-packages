// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueState extends com.pulumi.resources.ResourceArgs {

    public static final QueueState Empty = new QueueState();

    /**
     * The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
     * 
     */
    @Import(name="autoDeleteOnIdle")
    private @Nullable Output<String> autoDeleteOnIdle;

    /**
     * @return The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
     * 
     */
    public Optional<Output<String>> autoDeleteOnIdle() {
        return Optional.ofNullable(this.autoDeleteOnIdle);
    }

    /**
     * Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
     * 
     */
    @Import(name="deadLetteringOnMessageExpiration")
    private @Nullable Output<Boolean> deadLetteringOnMessageExpiration;

    /**
     * @return Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> deadLetteringOnMessageExpiration() {
        return Optional.ofNullable(this.deadLetteringOnMessageExpiration);
    }

    /**
     * The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
     * 
     */
    @Import(name="defaultMessageTtl")
    private @Nullable Output<String> defaultMessageTtl;

    /**
     * @return The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
     * 
     */
    public Optional<Output<String>> defaultMessageTtl() {
        return Optional.ofNullable(this.defaultMessageTtl);
    }

    /**
     * The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
     * 
     */
    @Import(name="duplicateDetectionHistoryTimeWindow")
    private @Nullable Output<String> duplicateDetectionHistoryTimeWindow;

    /**
     * @return The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
     * 
     */
    public Optional<Output<String>> duplicateDetectionHistoryTimeWindow() {
        return Optional.ofNullable(this.duplicateDetectionHistoryTimeWindow);
    }

    /**
     * Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
     * 
     */
    @Import(name="enableBatchedOperations")
    private @Nullable Output<Boolean> enableBatchedOperations;

    /**
     * @return Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enableBatchedOperations() {
        return Optional.ofNullable(this.enableBatchedOperations);
    }

    /**
     * Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
     * 
     */
    @Import(name="enableExpress")
    private @Nullable Output<Boolean> enableExpress;

    /**
     * @return Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableExpress() {
        return Optional.ofNullable(this.enableExpress);
    }

    /**
     * Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `true`.
     * 
     */
    @Import(name="enablePartitioning")
    private @Nullable Output<Boolean> enablePartitioning;

    /**
     * @return Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `true`.
     * 
     */
    public Optional<Output<Boolean>> enablePartitioning() {
        return Optional.ofNullable(this.enablePartitioning);
    }

    /**
     * The name of a Queue or Topic to automatically forward dead lettered messages to.
     * 
     */
    @Import(name="forwardDeadLetteredMessagesTo")
    private @Nullable Output<String> forwardDeadLetteredMessagesTo;

    /**
     * @return The name of a Queue or Topic to automatically forward dead lettered messages to.
     * 
     */
    public Optional<Output<String>> forwardDeadLetteredMessagesTo() {
        return Optional.ofNullable(this.forwardDeadLetteredMessagesTo);
    }

    /**
     * The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
     * 
     */
    @Import(name="forwardTo")
    private @Nullable Output<String> forwardTo;

    /**
     * @return The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
     * 
     */
    public Optional<Output<String>> forwardTo() {
        return Optional.ofNullable(this.forwardTo);
    }

    /**
     * The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
     * 
     */
    @Import(name="lockDuration")
    private @Nullable Output<String> lockDuration;

    /**
     * @return The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
     * 
     */
    public Optional<Output<String>> lockDuration() {
        return Optional.ofNullable(this.lockDuration);
    }

    /**
     * Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
     * 
     */
    @Import(name="maxDeliveryCount")
    private @Nullable Output<Integer> maxDeliveryCount;

    /**
     * @return Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
     * 
     */
    public Optional<Output<Integer>> maxDeliveryCount() {
        return Optional.ofNullable(this.maxDeliveryCount);
    }

    /**
     * Integer value which controls the maximum size of
     * a message allowed on the queue for Premium SKU. For supported values see the &#34;Large messages support&#34;
     * section of [this document](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
     * 
     */
    @Import(name="maxMessageSizeInKilobytes")
    private @Nullable Output<Integer> maxMessageSizeInKilobytes;

    /**
     * @return Integer value which controls the maximum size of
     * a message allowed on the queue for Premium SKU. For supported values see the &#34;Large messages support&#34;
     * section of [this document](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
     * 
     */
    public Optional<Output<Integer>> maxMessageSizeInKilobytes() {
        return Optional.ofNullable(this.maxMessageSizeInKilobytes);
    }

    /**
     * Integer value which controls the size of memory allocated for the queue. For supported values see the &#34;Queue or topic size&#34; section of [Service Bus Quotas](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
     * 
     */
    @Import(name="maxSizeInMegabytes")
    private @Nullable Output<Integer> maxSizeInMegabytes;

    /**
     * @return Integer value which controls the size of memory allocated for the queue. For supported values see the &#34;Queue or topic size&#34; section of [Service Bus Quotas](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
     * 
     */
    public Optional<Output<Integer>> maxSizeInMegabytes() {
        return Optional.ofNullable(this.maxSizeInMegabytes);
    }

    /**
     * Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    public Optional<Output<String>> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    /**
     * Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    @Import(name="requiresDuplicateDetection")
    private @Nullable Output<Boolean> requiresDuplicateDetection;

    /**
     * @return Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> requiresDuplicateDetection() {
        return Optional.ofNullable(this.requiresDuplicateDetection);
    }

    /**
     * Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    @Import(name="requiresSession")
    private @Nullable Output<Boolean> requiresSession;

    /**
     * @return Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> requiresSession() {
        return Optional.ofNullable(this.requiresSession);
    }

    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private QueueState() {}

    private QueueState(QueueState $) {
        this.autoDeleteOnIdle = $.autoDeleteOnIdle;
        this.deadLetteringOnMessageExpiration = $.deadLetteringOnMessageExpiration;
        this.defaultMessageTtl = $.defaultMessageTtl;
        this.duplicateDetectionHistoryTimeWindow = $.duplicateDetectionHistoryTimeWindow;
        this.enableBatchedOperations = $.enableBatchedOperations;
        this.enableExpress = $.enableExpress;
        this.enablePartitioning = $.enablePartitioning;
        this.forwardDeadLetteredMessagesTo = $.forwardDeadLetteredMessagesTo;
        this.forwardTo = $.forwardTo;
        this.lockDuration = $.lockDuration;
        this.maxDeliveryCount = $.maxDeliveryCount;
        this.maxMessageSizeInKilobytes = $.maxMessageSizeInKilobytes;
        this.maxSizeInMegabytes = $.maxSizeInMegabytes;
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.namespaceName = $.namespaceName;
        this.requiresDuplicateDetection = $.requiresDuplicateDetection;
        this.requiresSession = $.requiresSession;
        this.resourceGroupName = $.resourceGroupName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueState $;

        public Builder() {
            $ = new QueueState();
        }

        public Builder(QueueState defaults) {
            $ = new QueueState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDeleteOnIdle The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteOnIdle(@Nullable Output<String> autoDeleteOnIdle) {
            $.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }

        /**
         * @param autoDeleteOnIdle The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteOnIdle(String autoDeleteOnIdle) {
            return autoDeleteOnIdle(Output.of(autoDeleteOnIdle));
        }

        /**
         * @param deadLetteringOnMessageExpiration Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder deadLetteringOnMessageExpiration(@Nullable Output<Boolean> deadLetteringOnMessageExpiration) {
            $.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
            return this;
        }

        /**
         * @param deadLetteringOnMessageExpiration Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder deadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
            return deadLetteringOnMessageExpiration(Output.of(deadLetteringOnMessageExpiration));
        }

        /**
         * @param defaultMessageTtl The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
         * 
         * @return builder
         * 
         */
        public Builder defaultMessageTtl(@Nullable Output<String> defaultMessageTtl) {
            $.defaultMessageTtl = defaultMessageTtl;
            return this;
        }

        /**
         * @param defaultMessageTtl The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
         * 
         * @return builder
         * 
         */
        public Builder defaultMessageTtl(String defaultMessageTtl) {
            return defaultMessageTtl(Output.of(defaultMessageTtl));
        }

        /**
         * @param duplicateDetectionHistoryTimeWindow The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
         * 
         * @return builder
         * 
         */
        public Builder duplicateDetectionHistoryTimeWindow(@Nullable Output<String> duplicateDetectionHistoryTimeWindow) {
            $.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }

        /**
         * @param duplicateDetectionHistoryTimeWindow The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
         * 
         * @return builder
         * 
         */
        public Builder duplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow) {
            return duplicateDetectionHistoryTimeWindow(Output.of(duplicateDetectionHistoryTimeWindow));
        }

        /**
         * @param enableBatchedOperations Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enableBatchedOperations(@Nullable Output<Boolean> enableBatchedOperations) {
            $.enableBatchedOperations = enableBatchedOperations;
            return this;
        }

        /**
         * @param enableBatchedOperations Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enableBatchedOperations(Boolean enableBatchedOperations) {
            return enableBatchedOperations(Output.of(enableBatchedOperations));
        }

        /**
         * @param enableExpress Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableExpress(@Nullable Output<Boolean> enableExpress) {
            $.enableExpress = enableExpress;
            return this;
        }

        /**
         * @param enableExpress Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableExpress(Boolean enableExpress) {
            return enableExpress(Output.of(enableExpress));
        }

        /**
         * @param enablePartitioning Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enablePartitioning(@Nullable Output<Boolean> enablePartitioning) {
            $.enablePartitioning = enablePartitioning;
            return this;
        }

        /**
         * @param enablePartitioning Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enablePartitioning(Boolean enablePartitioning) {
            return enablePartitioning(Output.of(enablePartitioning));
        }

        /**
         * @param forwardDeadLetteredMessagesTo The name of a Queue or Topic to automatically forward dead lettered messages to.
         * 
         * @return builder
         * 
         */
        public Builder forwardDeadLetteredMessagesTo(@Nullable Output<String> forwardDeadLetteredMessagesTo) {
            $.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
            return this;
        }

        /**
         * @param forwardDeadLetteredMessagesTo The name of a Queue or Topic to automatically forward dead lettered messages to.
         * 
         * @return builder
         * 
         */
        public Builder forwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo) {
            return forwardDeadLetteredMessagesTo(Output.of(forwardDeadLetteredMessagesTo));
        }

        /**
         * @param forwardTo The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
         * 
         * @return builder
         * 
         */
        public Builder forwardTo(@Nullable Output<String> forwardTo) {
            $.forwardTo = forwardTo;
            return this;
        }

        /**
         * @param forwardTo The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
         * 
         * @return builder
         * 
         */
        public Builder forwardTo(String forwardTo) {
            return forwardTo(Output.of(forwardTo));
        }

        /**
         * @param lockDuration The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
         * 
         * @return builder
         * 
         */
        public Builder lockDuration(@Nullable Output<String> lockDuration) {
            $.lockDuration = lockDuration;
            return this;
        }

        /**
         * @param lockDuration The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
         * 
         * @return builder
         * 
         */
        public Builder lockDuration(String lockDuration) {
            return lockDuration(Output.of(lockDuration));
        }

        /**
         * @param maxDeliveryCount Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
         * 
         * @return builder
         * 
         */
        public Builder maxDeliveryCount(@Nullable Output<Integer> maxDeliveryCount) {
            $.maxDeliveryCount = maxDeliveryCount;
            return this;
        }

        /**
         * @param maxDeliveryCount Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
         * 
         * @return builder
         * 
         */
        public Builder maxDeliveryCount(Integer maxDeliveryCount) {
            return maxDeliveryCount(Output.of(maxDeliveryCount));
        }

        /**
         * @param maxMessageSizeInKilobytes Integer value which controls the maximum size of
         * a message allowed on the queue for Premium SKU. For supported values see the &#34;Large messages support&#34;
         * section of [this document](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
         * 
         * @return builder
         * 
         */
        public Builder maxMessageSizeInKilobytes(@Nullable Output<Integer> maxMessageSizeInKilobytes) {
            $.maxMessageSizeInKilobytes = maxMessageSizeInKilobytes;
            return this;
        }

        /**
         * @param maxMessageSizeInKilobytes Integer value which controls the maximum size of
         * a message allowed on the queue for Premium SKU. For supported values see the &#34;Large messages support&#34;
         * section of [this document](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
         * 
         * @return builder
         * 
         */
        public Builder maxMessageSizeInKilobytes(Integer maxMessageSizeInKilobytes) {
            return maxMessageSizeInKilobytes(Output.of(maxMessageSizeInKilobytes));
        }

        /**
         * @param maxSizeInMegabytes Integer value which controls the size of memory allocated for the queue. For supported values see the &#34;Queue or topic size&#34; section of [Service Bus Quotas](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeInMegabytes(@Nullable Output<Integer> maxSizeInMegabytes) {
            $.maxSizeInMegabytes = maxSizeInMegabytes;
            return this;
        }

        /**
         * @param maxSizeInMegabytes Integer value which controls the size of memory allocated for the queue. For supported values see the &#34;Queue or topic size&#34; section of [Service Bus Quotas](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeInMegabytes(Integer maxSizeInMegabytes) {
            return maxSizeInMegabytes(Output.of(maxSizeInMegabytes));
        }

        /**
         * @param name Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceId The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param requiresDuplicateDetection Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requiresDuplicateDetection(@Nullable Output<Boolean> requiresDuplicateDetection) {
            $.requiresDuplicateDetection = requiresDuplicateDetection;
            return this;
        }

        /**
         * @param requiresDuplicateDetection Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requiresDuplicateDetection(Boolean requiresDuplicateDetection) {
            return requiresDuplicateDetection(Output.of(requiresDuplicateDetection));
        }

        /**
         * @param requiresSession Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requiresSession(@Nullable Output<Boolean> requiresSession) {
            $.requiresSession = requiresSession;
            return this;
        }

        /**
         * @param requiresSession Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requiresSession(Boolean requiresSession) {
            return requiresSession(Output.of(requiresSession));
        }

        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param status The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public QueueState build() {
            return $;
        }
    }

}
