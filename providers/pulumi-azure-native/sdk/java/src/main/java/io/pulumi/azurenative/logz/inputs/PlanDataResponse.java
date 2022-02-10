// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlanDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final PlanDataResponse Empty = new PlanDataResponse();

    @InputImport(name="billingCycle")
    private final @Nullable String billingCycle;

    public Optional<String> getBillingCycle() {
        return this.billingCycle == null ? Optional.empty() : Optional.ofNullable(this.billingCycle);
    }

    @InputImport(name="effectiveDate")
    private final @Nullable String effectiveDate;

    public Optional<String> getEffectiveDate() {
        return this.effectiveDate == null ? Optional.empty() : Optional.ofNullable(this.effectiveDate);
    }

    @InputImport(name="planDetails")
    private final @Nullable String planDetails;

    public Optional<String> getPlanDetails() {
        return this.planDetails == null ? Optional.empty() : Optional.ofNullable(this.planDetails);
    }

    @InputImport(name="usageType")
    private final @Nullable String usageType;

    public Optional<String> getUsageType() {
        return this.usageType == null ? Optional.empty() : Optional.ofNullable(this.usageType);
    }

    public PlanDataResponse(
        @Nullable String billingCycle,
        @Nullable String effectiveDate,
        @Nullable String planDetails,
        @Nullable String usageType) {
        this.billingCycle = billingCycle;
        this.effectiveDate = effectiveDate;
        this.planDetails = planDetails;
        this.usageType = usageType;
    }

    private PlanDataResponse() {
        this.billingCycle = null;
        this.effectiveDate = null;
        this.planDetails = null;
        this.usageType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String billingCycle;
        private @Nullable String effectiveDate;
        private @Nullable String planDetails;
        private @Nullable String usageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingCycle = defaults.billingCycle;
    	      this.effectiveDate = defaults.effectiveDate;
    	      this.planDetails = defaults.planDetails;
    	      this.usageType = defaults.usageType;
        }

        public Builder setBillingCycle(@Nullable String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }

        public Builder setEffectiveDate(@Nullable String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }

        public Builder setPlanDetails(@Nullable String planDetails) {
            this.planDetails = planDetails;
            return this;
        }

        public Builder setUsageType(@Nullable String usageType) {
            this.usageType = usageType;
            return this;
        }

        public PlanDataResponse build() {
            return new PlanDataResponse(billingCycle, effectiveDate, planDetails, usageType);
        }
    }
}