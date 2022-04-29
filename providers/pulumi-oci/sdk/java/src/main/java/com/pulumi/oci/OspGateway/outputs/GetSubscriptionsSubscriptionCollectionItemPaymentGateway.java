// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OspGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.OspGateway.outputs.GetSubscriptionsSubscriptionCollectionItemPaymentGatewayMerchantDefinedData;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubscriptionsSubscriptionCollectionItemPaymentGateway {
    /**
     * @return Merchant details.
     * 
     */
    private final List<GetSubscriptionsSubscriptionCollectionItemPaymentGatewayMerchantDefinedData> merchantDefinedDatas;

    @CustomType.Constructor
    private GetSubscriptionsSubscriptionCollectionItemPaymentGateway(@CustomType.Parameter("merchantDefinedDatas") List<GetSubscriptionsSubscriptionCollectionItemPaymentGatewayMerchantDefinedData> merchantDefinedDatas) {
        this.merchantDefinedDatas = merchantDefinedDatas;
    }

    /**
     * @return Merchant details.
     * 
     */
    public List<GetSubscriptionsSubscriptionCollectionItemPaymentGatewayMerchantDefinedData> merchantDefinedDatas() {
        return this.merchantDefinedDatas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionsSubscriptionCollectionItemPaymentGateway defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSubscriptionsSubscriptionCollectionItemPaymentGatewayMerchantDefinedData> merchantDefinedDatas;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionsSubscriptionCollectionItemPaymentGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.merchantDefinedDatas = defaults.merchantDefinedDatas;
        }

        public Builder merchantDefinedDatas(List<GetSubscriptionsSubscriptionCollectionItemPaymentGatewayMerchantDefinedData> merchantDefinedDatas) {
            this.merchantDefinedDatas = Objects.requireNonNull(merchantDefinedDatas);
            return this;
        }
        public Builder merchantDefinedDatas(GetSubscriptionsSubscriptionCollectionItemPaymentGatewayMerchantDefinedData... merchantDefinedDatas) {
            return merchantDefinedDatas(List.of(merchantDefinedDatas));
        }        public GetSubscriptionsSubscriptionCollectionItemPaymentGateway build() {
            return new GetSubscriptionsSubscriptionCollectionItemPaymentGateway(merchantDefinedDatas);
        }
    }
}
