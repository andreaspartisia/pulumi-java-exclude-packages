// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class EventSubscriptionRetryPolicy {
    /**
     * @return Specifies the time to live (in minutes) for events. Supported range is `1` to `1440`. Defaults to `1440`. See [official documentation](https://docs.microsoft.com/en-us/azure/event-grid/manage-event-delivery#set-retry-policy) for more details.
     * 
     */
    private final Integer eventTimeToLive;
    /**
     * @return Specifies the maximum number of delivery retry attempts for events.
     * 
     */
    private final Integer maxDeliveryAttempts;

    @CustomType.Constructor
    private EventSubscriptionRetryPolicy(
        @CustomType.Parameter("eventTimeToLive") Integer eventTimeToLive,
        @CustomType.Parameter("maxDeliveryAttempts") Integer maxDeliveryAttempts) {
        this.eventTimeToLive = eventTimeToLive;
        this.maxDeliveryAttempts = maxDeliveryAttempts;
    }

    /**
     * @return Specifies the time to live (in minutes) for events. Supported range is `1` to `1440`. Defaults to `1440`. See [official documentation](https://docs.microsoft.com/en-us/azure/event-grid/manage-event-delivery#set-retry-policy) for more details.
     * 
     */
    public Integer eventTimeToLive() {
        return this.eventTimeToLive;
    }
    /**
     * @return Specifies the maximum number of delivery retry attempts for events.
     * 
     */
    public Integer maxDeliveryAttempts() {
        return this.maxDeliveryAttempts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionRetryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer eventTimeToLive;
        private Integer maxDeliveryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTimeToLive = defaults.eventTimeToLive;
    	      this.maxDeliveryAttempts = defaults.maxDeliveryAttempts;
        }

        public Builder eventTimeToLive(Integer eventTimeToLive) {
            this.eventTimeToLive = Objects.requireNonNull(eventTimeToLive);
            return this;
        }
        public Builder maxDeliveryAttempts(Integer maxDeliveryAttempts) {
            this.maxDeliveryAttempts = Objects.requireNonNull(maxDeliveryAttempts);
            return this;
        }        public EventSubscriptionRetryPolicy build() {
            return new EventSubscriptionRetryPolicy(eventTimeToLive, maxDeliveryAttempts);
        }
    }
}
