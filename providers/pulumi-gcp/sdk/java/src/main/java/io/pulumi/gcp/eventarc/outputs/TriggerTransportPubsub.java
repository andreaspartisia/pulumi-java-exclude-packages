// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerTransportPubsub {
    /**
     * - 
     * Output only. The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
     */
    private final @Nullable String subscription;
    /**
     * Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME You may set an existing topic for triggers of the type google.cloud.pubsub.topic.v1.messagePublished` only. The topic you provide here will not be deleted by Eventarc at trigger deletion.
     * 
     */
    private final @Nullable String topic;

    @OutputCustomType.Constructor
    private TriggerTransportPubsub(
        @OutputCustomType.Parameter("subscription") @Nullable String subscription,
        @OutputCustomType.Parameter("topic") @Nullable String topic) {
        this.subscription = subscription;
        this.topic = topic;
    }

    /**
     * - 
     * Output only. The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
    */
    public Optional<String> getSubscription() {
        return Optional.ofNullable(this.subscription);
    }
    /**
     * Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME You may set an existing topic for triggers of the type google.cloud.pubsub.topic.v1.messagePublished` only. The topic you provide here will not be deleted by Eventarc at trigger deletion.
     * 
    */
    public Optional<String> getTopic() {
        return Optional.ofNullable(this.topic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTransportPubsub defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subscription;
        private @Nullable String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerTransportPubsub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        public Builder setSubscription(@Nullable String subscription) {
            this.subscription = subscription;
            return this;
        }

        public Builder setTopic(@Nullable String topic) {
            this.topic = topic;
            return this;
        }
        public TriggerTransportPubsub build() {
            return new TriggerTransportPubsub(subscription, topic);
        }
    }
}
