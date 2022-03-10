// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LiteSubscriptionDeliveryConfig {
    /**
     * When this subscription should send messages to subscribers relative to messages persistence in storage.
     * Possible values are `DELIVER_IMMEDIATELY`, `DELIVER_AFTER_STORED`, and `DELIVERY_REQUIREMENT_UNSPECIFIED`.
     * 
     */
    private final String deliveryRequirement;

    @OutputCustomType.Constructor
    private LiteSubscriptionDeliveryConfig(@OutputCustomType.Parameter("deliveryRequirement") String deliveryRequirement) {
        this.deliveryRequirement = deliveryRequirement;
    }

    /**
     * When this subscription should send messages to subscribers relative to messages persistence in storage.
     * Possible values are `DELIVER_IMMEDIATELY`, `DELIVER_AFTER_STORED`, and `DELIVERY_REQUIREMENT_UNSPECIFIED`.
     * 
    */
    public String getDeliveryRequirement() {
        return this.deliveryRequirement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteSubscriptionDeliveryConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deliveryRequirement;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteSubscriptionDeliveryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryRequirement = defaults.deliveryRequirement;
        }

        public Builder setDeliveryRequirement(String deliveryRequirement) {
            this.deliveryRequirement = Objects.requireNonNull(deliveryRequirement);
            return this;
        }
        public LiteSubscriptionDeliveryConfig build() {
            return new LiteSubscriptionDeliveryConfig(deliveryRequirement);
        }
    }
}
