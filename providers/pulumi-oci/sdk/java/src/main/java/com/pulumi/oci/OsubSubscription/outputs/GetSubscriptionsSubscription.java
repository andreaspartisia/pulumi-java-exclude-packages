// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsubSubscription.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.OsubSubscription.outputs.GetSubscriptionsSubscriptionCurrency;
import com.pulumi.oci.OsubSubscription.outputs.GetSubscriptionsSubscriptionSubscribedService;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubscriptionsSubscription {
    /**
     * @return Currency details
     * 
     */
    private final List<GetSubscriptionsSubscriptionCurrency> currencies;
    /**
     * @return Customer friendly service name provided by PRG
     * 
     */
    private final String serviceName;
    /**
     * @return Subscribed service status
     * 
     */
    private final String status;
    /**
     * @return List of Subscribed Services of the plan
     * 
     */
    private final List<GetSubscriptionsSubscriptionSubscribedService> subscribedServices;
    /**
     * @return Represents the date when the last service of the subscription ends
     * 
     */
    private final String timeEnd;
    /**
     * @return Represents the date when the first service of the subscription was activated
     * 
     */
    private final String timeStart;

    @CustomType.Constructor
    private GetSubscriptionsSubscription(
        @CustomType.Parameter("currencies") List<GetSubscriptionsSubscriptionCurrency> currencies,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("subscribedServices") List<GetSubscriptionsSubscriptionSubscribedService> subscribedServices,
        @CustomType.Parameter("timeEnd") String timeEnd,
        @CustomType.Parameter("timeStart") String timeStart) {
        this.currencies = currencies;
        this.serviceName = serviceName;
        this.status = status;
        this.subscribedServices = subscribedServices;
        this.timeEnd = timeEnd;
        this.timeStart = timeStart;
    }

    /**
     * @return Currency details
     * 
     */
    public List<GetSubscriptionsSubscriptionCurrency> currencies() {
        return this.currencies;
    }
    /**
     * @return Customer friendly service name provided by PRG
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return Subscribed service status
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return List of Subscribed Services of the plan
     * 
     */
    public List<GetSubscriptionsSubscriptionSubscribedService> subscribedServices() {
        return this.subscribedServices;
    }
    /**
     * @return Represents the date when the last service of the subscription ends
     * 
     */
    public String timeEnd() {
        return this.timeEnd;
    }
    /**
     * @return Represents the date when the first service of the subscription was activated
     * 
     */
    public String timeStart() {
        return this.timeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionsSubscription defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSubscriptionsSubscriptionCurrency> currencies;
        private String serviceName;
        private String status;
        private List<GetSubscriptionsSubscriptionSubscribedService> subscribedServices;
        private String timeEnd;
        private String timeStart;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionsSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencies = defaults.currencies;
    	      this.serviceName = defaults.serviceName;
    	      this.status = defaults.status;
    	      this.subscribedServices = defaults.subscribedServices;
    	      this.timeEnd = defaults.timeEnd;
    	      this.timeStart = defaults.timeStart;
        }

        public Builder currencies(List<GetSubscriptionsSubscriptionCurrency> currencies) {
            this.currencies = Objects.requireNonNull(currencies);
            return this;
        }
        public Builder currencies(GetSubscriptionsSubscriptionCurrency... currencies) {
            return currencies(List.of(currencies));
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder subscribedServices(List<GetSubscriptionsSubscriptionSubscribedService> subscribedServices) {
            this.subscribedServices = Objects.requireNonNull(subscribedServices);
            return this;
        }
        public Builder subscribedServices(GetSubscriptionsSubscriptionSubscribedService... subscribedServices) {
            return subscribedServices(List.of(subscribedServices));
        }
        public Builder timeEnd(String timeEnd) {
            this.timeEnd = Objects.requireNonNull(timeEnd);
            return this;
        }
        public Builder timeStart(String timeStart) {
            this.timeStart = Objects.requireNonNull(timeStart);
            return this;
        }        public GetSubscriptionsSubscription build() {
            return new GetSubscriptionsSubscription(currencies, serviceName, status, subscribedServices, timeEnd, timeStart);
        }
    }
}
