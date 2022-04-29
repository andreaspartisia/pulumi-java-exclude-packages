// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OspGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.OspGateway.outputs.GetSubscriptionSubscriptionBillingAddress;
import com.pulumi.oci.OspGateway.outputs.GetSubscriptionSubscriptionPaymentGateway;
import com.pulumi.oci.OspGateway.outputs.GetSubscriptionSubscriptionPaymentOption;
import com.pulumi.oci.OspGateway.outputs.GetSubscriptionSubscriptionTaxInfo;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubscriptionSubscription {
    /**
     * @return Bill to customer Account id.
     * 
     */
    private final String billToCustAccountId;
    /**
     * @return Billing address details model.
     * 
     */
    private final List<GetSubscriptionSubscriptionBillingAddress> billingAddresses;
    /**
     * @return Currency code
     * 
     */
    private final String currencyCode;
    /**
     * @return GSI Subscription external code.
     * 
     */
    private final String gsiOrgCode;
    /**
     * @return Subscription id identifier (OCID).
     * 
     */
    private final String id;
    /**
     * @return Payment intension.
     * 
     */
    private final Boolean isIntentToPay;
    /**
     * @return Language short code (en, de, hu, etc)
     * 
     */
    private final String languageCode;
    /**
     * @return GSI organization external identifier.
     * 
     */
    private final String organizationId;
    /**
     * @return Payment gateway details.
     * 
     */
    private final List<GetSubscriptionSubscriptionPaymentGateway> paymentGateways;
    /**
     * @return Payment option list of a subscription.
     * 
     */
    private final List<GetSubscriptionSubscriptionPaymentOption> paymentOptions;
    /**
     * @return Subscription plan type.
     * 
     */
    private final String planType;
    /**
     * @return Ship to customer account role.
     * 
     */
    private final String shipToCustAcctRoleId;
    /**
     * @return Ship to customer account site address id.
     * 
     */
    private final String shipToCustAcctSiteId;
    /**
     * @return Subscription plan number.
     * 
     */
    private final String subscriptionPlanNumber;
    /**
     * @return Tax details.
     * 
     */
    private final List<GetSubscriptionSubscriptionTaxInfo> taxInfos;
    /**
     * @return Date of upgrade/conversion when planType changed from FREE_TIER to PAYG
     * 
     */
    private final String timePlanUpgrade;
    /**
     * @return Start date of the subscription.
     * 
     */
    private final String timeStart;
    /**
     * @return Status of the upgrade.
     * 
     */
    private final String upgradeState;
    /**
     * @return This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure caused by interfacing Tax details- TaxError)
     * 
     */
    private final String upgradeStateDetails;

    @CustomType.Constructor
    private GetSubscriptionSubscription(
        @CustomType.Parameter("billToCustAccountId") String billToCustAccountId,
        @CustomType.Parameter("billingAddresses") List<GetSubscriptionSubscriptionBillingAddress> billingAddresses,
        @CustomType.Parameter("currencyCode") String currencyCode,
        @CustomType.Parameter("gsiOrgCode") String gsiOrgCode,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isIntentToPay") Boolean isIntentToPay,
        @CustomType.Parameter("languageCode") String languageCode,
        @CustomType.Parameter("organizationId") String organizationId,
        @CustomType.Parameter("paymentGateways") List<GetSubscriptionSubscriptionPaymentGateway> paymentGateways,
        @CustomType.Parameter("paymentOptions") List<GetSubscriptionSubscriptionPaymentOption> paymentOptions,
        @CustomType.Parameter("planType") String planType,
        @CustomType.Parameter("shipToCustAcctRoleId") String shipToCustAcctRoleId,
        @CustomType.Parameter("shipToCustAcctSiteId") String shipToCustAcctSiteId,
        @CustomType.Parameter("subscriptionPlanNumber") String subscriptionPlanNumber,
        @CustomType.Parameter("taxInfos") List<GetSubscriptionSubscriptionTaxInfo> taxInfos,
        @CustomType.Parameter("timePlanUpgrade") String timePlanUpgrade,
        @CustomType.Parameter("timeStart") String timeStart,
        @CustomType.Parameter("upgradeState") String upgradeState,
        @CustomType.Parameter("upgradeStateDetails") String upgradeStateDetails) {
        this.billToCustAccountId = billToCustAccountId;
        this.billingAddresses = billingAddresses;
        this.currencyCode = currencyCode;
        this.gsiOrgCode = gsiOrgCode;
        this.id = id;
        this.isIntentToPay = isIntentToPay;
        this.languageCode = languageCode;
        this.organizationId = organizationId;
        this.paymentGateways = paymentGateways;
        this.paymentOptions = paymentOptions;
        this.planType = planType;
        this.shipToCustAcctRoleId = shipToCustAcctRoleId;
        this.shipToCustAcctSiteId = shipToCustAcctSiteId;
        this.subscriptionPlanNumber = subscriptionPlanNumber;
        this.taxInfos = taxInfos;
        this.timePlanUpgrade = timePlanUpgrade;
        this.timeStart = timeStart;
        this.upgradeState = upgradeState;
        this.upgradeStateDetails = upgradeStateDetails;
    }

    /**
     * @return Bill to customer Account id.
     * 
     */
    public String billToCustAccountId() {
        return this.billToCustAccountId;
    }
    /**
     * @return Billing address details model.
     * 
     */
    public List<GetSubscriptionSubscriptionBillingAddress> billingAddresses() {
        return this.billingAddresses;
    }
    /**
     * @return Currency code
     * 
     */
    public String currencyCode() {
        return this.currencyCode;
    }
    /**
     * @return GSI Subscription external code.
     * 
     */
    public String gsiOrgCode() {
        return this.gsiOrgCode;
    }
    /**
     * @return Subscription id identifier (OCID).
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Payment intension.
     * 
     */
    public Boolean isIntentToPay() {
        return this.isIntentToPay;
    }
    /**
     * @return Language short code (en, de, hu, etc)
     * 
     */
    public String languageCode() {
        return this.languageCode;
    }
    /**
     * @return GSI organization external identifier.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return Payment gateway details.
     * 
     */
    public List<GetSubscriptionSubscriptionPaymentGateway> paymentGateways() {
        return this.paymentGateways;
    }
    /**
     * @return Payment option list of a subscription.
     * 
     */
    public List<GetSubscriptionSubscriptionPaymentOption> paymentOptions() {
        return this.paymentOptions;
    }
    /**
     * @return Subscription plan type.
     * 
     */
    public String planType() {
        return this.planType;
    }
    /**
     * @return Ship to customer account role.
     * 
     */
    public String shipToCustAcctRoleId() {
        return this.shipToCustAcctRoleId;
    }
    /**
     * @return Ship to customer account site address id.
     * 
     */
    public String shipToCustAcctSiteId() {
        return this.shipToCustAcctSiteId;
    }
    /**
     * @return Subscription plan number.
     * 
     */
    public String subscriptionPlanNumber() {
        return this.subscriptionPlanNumber;
    }
    /**
     * @return Tax details.
     * 
     */
    public List<GetSubscriptionSubscriptionTaxInfo> taxInfos() {
        return this.taxInfos;
    }
    /**
     * @return Date of upgrade/conversion when planType changed from FREE_TIER to PAYG
     * 
     */
    public String timePlanUpgrade() {
        return this.timePlanUpgrade;
    }
    /**
     * @return Start date of the subscription.
     * 
     */
    public String timeStart() {
        return this.timeStart;
    }
    /**
     * @return Status of the upgrade.
     * 
     */
    public String upgradeState() {
        return this.upgradeState;
    }
    /**
     * @return This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure caused by interfacing Tax details- TaxError)
     * 
     */
    public String upgradeStateDetails() {
        return this.upgradeStateDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionSubscription defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billToCustAccountId;
        private List<GetSubscriptionSubscriptionBillingAddress> billingAddresses;
        private String currencyCode;
        private String gsiOrgCode;
        private String id;
        private Boolean isIntentToPay;
        private String languageCode;
        private String organizationId;
        private List<GetSubscriptionSubscriptionPaymentGateway> paymentGateways;
        private List<GetSubscriptionSubscriptionPaymentOption> paymentOptions;
        private String planType;
        private String shipToCustAcctRoleId;
        private String shipToCustAcctSiteId;
        private String subscriptionPlanNumber;
        private List<GetSubscriptionSubscriptionTaxInfo> taxInfos;
        private String timePlanUpgrade;
        private String timeStart;
        private String upgradeState;
        private String upgradeStateDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billToCustAccountId = defaults.billToCustAccountId;
    	      this.billingAddresses = defaults.billingAddresses;
    	      this.currencyCode = defaults.currencyCode;
    	      this.gsiOrgCode = defaults.gsiOrgCode;
    	      this.id = defaults.id;
    	      this.isIntentToPay = defaults.isIntentToPay;
    	      this.languageCode = defaults.languageCode;
    	      this.organizationId = defaults.organizationId;
    	      this.paymentGateways = defaults.paymentGateways;
    	      this.paymentOptions = defaults.paymentOptions;
    	      this.planType = defaults.planType;
    	      this.shipToCustAcctRoleId = defaults.shipToCustAcctRoleId;
    	      this.shipToCustAcctSiteId = defaults.shipToCustAcctSiteId;
    	      this.subscriptionPlanNumber = defaults.subscriptionPlanNumber;
    	      this.taxInfos = defaults.taxInfos;
    	      this.timePlanUpgrade = defaults.timePlanUpgrade;
    	      this.timeStart = defaults.timeStart;
    	      this.upgradeState = defaults.upgradeState;
    	      this.upgradeStateDetails = defaults.upgradeStateDetails;
        }

        public Builder billToCustAccountId(String billToCustAccountId) {
            this.billToCustAccountId = Objects.requireNonNull(billToCustAccountId);
            return this;
        }
        public Builder billingAddresses(List<GetSubscriptionSubscriptionBillingAddress> billingAddresses) {
            this.billingAddresses = Objects.requireNonNull(billingAddresses);
            return this;
        }
        public Builder billingAddresses(GetSubscriptionSubscriptionBillingAddress... billingAddresses) {
            return billingAddresses(List.of(billingAddresses));
        }
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }
        public Builder gsiOrgCode(String gsiOrgCode) {
            this.gsiOrgCode = Objects.requireNonNull(gsiOrgCode);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isIntentToPay(Boolean isIntentToPay) {
            this.isIntentToPay = Objects.requireNonNull(isIntentToPay);
            return this;
        }
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder paymentGateways(List<GetSubscriptionSubscriptionPaymentGateway> paymentGateways) {
            this.paymentGateways = Objects.requireNonNull(paymentGateways);
            return this;
        }
        public Builder paymentGateways(GetSubscriptionSubscriptionPaymentGateway... paymentGateways) {
            return paymentGateways(List.of(paymentGateways));
        }
        public Builder paymentOptions(List<GetSubscriptionSubscriptionPaymentOption> paymentOptions) {
            this.paymentOptions = Objects.requireNonNull(paymentOptions);
            return this;
        }
        public Builder paymentOptions(GetSubscriptionSubscriptionPaymentOption... paymentOptions) {
            return paymentOptions(List.of(paymentOptions));
        }
        public Builder planType(String planType) {
            this.planType = Objects.requireNonNull(planType);
            return this;
        }
        public Builder shipToCustAcctRoleId(String shipToCustAcctRoleId) {
            this.shipToCustAcctRoleId = Objects.requireNonNull(shipToCustAcctRoleId);
            return this;
        }
        public Builder shipToCustAcctSiteId(String shipToCustAcctSiteId) {
            this.shipToCustAcctSiteId = Objects.requireNonNull(shipToCustAcctSiteId);
            return this;
        }
        public Builder subscriptionPlanNumber(String subscriptionPlanNumber) {
            this.subscriptionPlanNumber = Objects.requireNonNull(subscriptionPlanNumber);
            return this;
        }
        public Builder taxInfos(List<GetSubscriptionSubscriptionTaxInfo> taxInfos) {
            this.taxInfos = Objects.requireNonNull(taxInfos);
            return this;
        }
        public Builder taxInfos(GetSubscriptionSubscriptionTaxInfo... taxInfos) {
            return taxInfos(List.of(taxInfos));
        }
        public Builder timePlanUpgrade(String timePlanUpgrade) {
            this.timePlanUpgrade = Objects.requireNonNull(timePlanUpgrade);
            return this;
        }
        public Builder timeStart(String timeStart) {
            this.timeStart = Objects.requireNonNull(timeStart);
            return this;
        }
        public Builder upgradeState(String upgradeState) {
            this.upgradeState = Objects.requireNonNull(upgradeState);
            return this;
        }
        public Builder upgradeStateDetails(String upgradeStateDetails) {
            this.upgradeStateDetails = Objects.requireNonNull(upgradeStateDetails);
            return this;
        }        public GetSubscriptionSubscription build() {
            return new GetSubscriptionSubscription(billToCustAccountId, billingAddresses, currencyCode, gsiOrgCode, id, isIntentToPay, languageCode, organizationId, paymentGateways, paymentOptions, planType, shipToCustAcctRoleId, shipToCustAcctSiteId, subscriptionPlanNumber, taxInfos, timePlanUpgrade, timeStart, upgradeState, upgradeStateDetails);
        }
    }
}
