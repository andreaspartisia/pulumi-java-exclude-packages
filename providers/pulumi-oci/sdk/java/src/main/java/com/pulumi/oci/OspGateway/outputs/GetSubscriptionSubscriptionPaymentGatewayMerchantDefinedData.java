// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OspGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSubscriptionSubscriptionPaymentGatewayMerchantDefinedData {
    /**
     * @return Cloud account name.
     * 
     */
    private final String cloudAccountName;
    /**
     * @return Promotion type code.
     * 
     */
    private final String promoType;

    @CustomType.Constructor
    private GetSubscriptionSubscriptionPaymentGatewayMerchantDefinedData(
        @CustomType.Parameter("cloudAccountName") String cloudAccountName,
        @CustomType.Parameter("promoType") String promoType) {
        this.cloudAccountName = cloudAccountName;
        this.promoType = promoType;
    }

    /**
     * @return Cloud account name.
     * 
     */
    public String cloudAccountName() {
        return this.cloudAccountName;
    }
    /**
     * @return Promotion type code.
     * 
     */
    public String promoType() {
        return this.promoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionSubscriptionPaymentGatewayMerchantDefinedData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudAccountName;
        private String promoType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionSubscriptionPaymentGatewayMerchantDefinedData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudAccountName = defaults.cloudAccountName;
    	      this.promoType = defaults.promoType;
        }

        public Builder cloudAccountName(String cloudAccountName) {
            this.cloudAccountName = Objects.requireNonNull(cloudAccountName);
            return this;
        }
        public Builder promoType(String promoType) {
            this.promoType = Objects.requireNonNull(promoType);
            return this;
        }        public GetSubscriptionSubscriptionPaymentGatewayMerchantDefinedData build() {
            return new GetSubscriptionSubscriptionPaymentGatewayMerchantDefinedData(cloudAccountName, promoType);
        }
    }
}
