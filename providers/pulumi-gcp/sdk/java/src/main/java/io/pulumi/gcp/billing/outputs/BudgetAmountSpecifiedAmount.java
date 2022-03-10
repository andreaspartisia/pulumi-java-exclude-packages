// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BudgetAmountSpecifiedAmount {
    /**
     * The 3-letter currency code defined in ISO 4217.
     * 
     */
    private final @Nullable String currencyCode;
    /**
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999
     * inclusive. If units is positive, nanos must be positive or
     * zero. If units is zero, nanos can be positive, zero, or
     * negative. If units is negative, nanos must be negative or
     * zero. For example $-1.75 is represented as units=-1 and
     * nanos=-750,000,000.
     * 
     */
    private final @Nullable Integer nanos;
    /**
     * The whole units of the amount. For example if currencyCode
     * is "USD", then 1 unit is one US dollar.
     * 
     */
    private final @Nullable String units;

    @OutputCustomType.Constructor
    private BudgetAmountSpecifiedAmount(
        @OutputCustomType.Parameter("currencyCode") @Nullable String currencyCode,
        @OutputCustomType.Parameter("nanos") @Nullable Integer nanos,
        @OutputCustomType.Parameter("units") @Nullable String units) {
        this.currencyCode = currencyCode;
        this.nanos = nanos;
        this.units = units;
    }

    /**
     * The 3-letter currency code defined in ISO 4217.
     * 
    */
    public Optional<String> getCurrencyCode() {
        return Optional.ofNullable(this.currencyCode);
    }
    /**
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999
     * inclusive. If units is positive, nanos must be positive or
     * zero. If units is zero, nanos can be positive, zero, or
     * negative. If units is negative, nanos must be negative or
     * zero. For example $-1.75 is represented as units=-1 and
     * nanos=-750,000,000.
     * 
    */
    public Optional<Integer> getNanos() {
        return Optional.ofNullable(this.nanos);
    }
    /**
     * The whole units of the amount. For example if currencyCode
     * is "USD", then 1 unit is one US dollar.
     * 
    */
    public Optional<String> getUnits() {
        return Optional.ofNullable(this.units);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAmountSpecifiedAmount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String currencyCode;
        private @Nullable Integer nanos;
        private @Nullable String units;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAmountSpecifiedAmount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencyCode = defaults.currencyCode;
    	      this.nanos = defaults.nanos;
    	      this.units = defaults.units;
        }

        public Builder setCurrencyCode(@Nullable String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setNanos(@Nullable Integer nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder setUnits(@Nullable String units) {
            this.units = units;
            return this;
        }
        public BudgetAmountSpecifiedAmount build() {
            return new BudgetAmountSpecifiedAmount(currencyCode, nanos, units);
        }
    }
}
