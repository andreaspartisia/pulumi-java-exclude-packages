// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsubSubscription.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCommitmentResult {
    /**
     * @return Commitment available amount
     * 
     */
    private final String availableAmount;
    private final String commitmentId;
    /**
     * @return Funded Allocation line value example: 12000.00
     * 
     */
    private final String fundedAllocationValue;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Commitment quantity
     * 
     */
    private final String quantity;
    /**
     * @return Commitment end date
     * 
     */
    private final String timeEnd;
    /**
     * @return Commitment start date
     * 
     */
    private final String timeStart;
    /**
     * @return Commitment used amount
     * 
     */
    private final String usedAmount;
    private final @Nullable String xOneGatewaySubscriptionId;
    private final @Nullable String xOneOriginRegion;

    @CustomType.Constructor
    private GetCommitmentResult(
        @CustomType.Parameter("availableAmount") String availableAmount,
        @CustomType.Parameter("commitmentId") String commitmentId,
        @CustomType.Parameter("fundedAllocationValue") String fundedAllocationValue,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("quantity") String quantity,
        @CustomType.Parameter("timeEnd") String timeEnd,
        @CustomType.Parameter("timeStart") String timeStart,
        @CustomType.Parameter("usedAmount") String usedAmount,
        @CustomType.Parameter("xOneGatewaySubscriptionId") @Nullable String xOneGatewaySubscriptionId,
        @CustomType.Parameter("xOneOriginRegion") @Nullable String xOneOriginRegion) {
        this.availableAmount = availableAmount;
        this.commitmentId = commitmentId;
        this.fundedAllocationValue = fundedAllocationValue;
        this.id = id;
        this.quantity = quantity;
        this.timeEnd = timeEnd;
        this.timeStart = timeStart;
        this.usedAmount = usedAmount;
        this.xOneGatewaySubscriptionId = xOneGatewaySubscriptionId;
        this.xOneOriginRegion = xOneOriginRegion;
    }

    /**
     * @return Commitment available amount
     * 
     */
    public String availableAmount() {
        return this.availableAmount;
    }
    public String commitmentId() {
        return this.commitmentId;
    }
    /**
     * @return Funded Allocation line value example: 12000.00
     * 
     */
    public String fundedAllocationValue() {
        return this.fundedAllocationValue;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Commitment quantity
     * 
     */
    public String quantity() {
        return this.quantity;
    }
    /**
     * @return Commitment end date
     * 
     */
    public String timeEnd() {
        return this.timeEnd;
    }
    /**
     * @return Commitment start date
     * 
     */
    public String timeStart() {
        return this.timeStart;
    }
    /**
     * @return Commitment used amount
     * 
     */
    public String usedAmount() {
        return this.usedAmount;
    }
    public Optional<String> xOneGatewaySubscriptionId() {
        return Optional.ofNullable(this.xOneGatewaySubscriptionId);
    }
    public Optional<String> xOneOriginRegion() {
        return Optional.ofNullable(this.xOneOriginRegion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCommitmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availableAmount;
        private String commitmentId;
        private String fundedAllocationValue;
        private String id;
        private String quantity;
        private String timeEnd;
        private String timeStart;
        private String usedAmount;
        private @Nullable String xOneGatewaySubscriptionId;
        private @Nullable String xOneOriginRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCommitmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableAmount = defaults.availableAmount;
    	      this.commitmentId = defaults.commitmentId;
    	      this.fundedAllocationValue = defaults.fundedAllocationValue;
    	      this.id = defaults.id;
    	      this.quantity = defaults.quantity;
    	      this.timeEnd = defaults.timeEnd;
    	      this.timeStart = defaults.timeStart;
    	      this.usedAmount = defaults.usedAmount;
    	      this.xOneGatewaySubscriptionId = defaults.xOneGatewaySubscriptionId;
    	      this.xOneOriginRegion = defaults.xOneOriginRegion;
        }

        public Builder availableAmount(String availableAmount) {
            this.availableAmount = Objects.requireNonNull(availableAmount);
            return this;
        }
        public Builder commitmentId(String commitmentId) {
            this.commitmentId = Objects.requireNonNull(commitmentId);
            return this;
        }
        public Builder fundedAllocationValue(String fundedAllocationValue) {
            this.fundedAllocationValue = Objects.requireNonNull(fundedAllocationValue);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder quantity(String quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }
        public Builder timeEnd(String timeEnd) {
            this.timeEnd = Objects.requireNonNull(timeEnd);
            return this;
        }
        public Builder timeStart(String timeStart) {
            this.timeStart = Objects.requireNonNull(timeStart);
            return this;
        }
        public Builder usedAmount(String usedAmount) {
            this.usedAmount = Objects.requireNonNull(usedAmount);
            return this;
        }
        public Builder xOneGatewaySubscriptionId(@Nullable String xOneGatewaySubscriptionId) {
            this.xOneGatewaySubscriptionId = xOneGatewaySubscriptionId;
            return this;
        }
        public Builder xOneOriginRegion(@Nullable String xOneOriginRegion) {
            this.xOneOriginRegion = xOneOriginRegion;
            return this;
        }        public GetCommitmentResult build() {
            return new GetCommitmentResult(availableAmount, commitmentId, fundedAllocationValue, id, quantity, timeEnd, timeStart, usedAmount, xOneGatewaySubscriptionId, xOneOriginRegion);
        }
    }
}
