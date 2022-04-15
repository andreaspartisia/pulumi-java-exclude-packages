// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.PubSubResponse;
import java.util.Objects;

@CustomType
public final class NotificationConfigResponse {
    /**
     * Notification config for Pub/Sub.
     * 
     */
    private final PubSubResponse pubsub;

    @CustomType.Constructor
    private NotificationConfigResponse(@CustomType.Parameter("pubsub") PubSubResponse pubsub) {
        this.pubsub = pubsub;
    }

    /**
     * Notification config for Pub/Sub.
     * 
    */
    public PubSubResponse pubsub() {
        return this.pubsub;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PubSubResponse pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder pubsub(PubSubResponse pubsub) {
            this.pubsub = Objects.requireNonNull(pubsub);
            return this;
        }        public NotificationConfigResponse build() {
            return new NotificationConfigResponse(pubsub);
        }
    }
}
