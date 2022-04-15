// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an amount of money with its currency type.
 * 
 */
public final class GoogleTypeMoneyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleTypeMoneyArgs Empty = new GoogleTypeMoneyArgs();

    /**
     * The three-letter currency code defined in ISO 4217.
     * 
     */
    @Import(name="currencyCode")
      private final @Nullable Output<String> currencyCode;

    public Output<String> currencyCode() {
        return this.currencyCode == null ? Codegen.empty() : this.currencyCode;
    }

    /**
     * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * 
     */
    @Import(name="nanos")
      private final @Nullable Output<Integer> nanos;

    public Output<Integer> nanos() {
        return this.nanos == null ? Codegen.empty() : this.nanos;
    }

    /**
     * The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * 
     */
    @Import(name="units")
      private final @Nullable Output<String> units;

    public Output<String> units() {
        return this.units == null ? Codegen.empty() : this.units;
    }

    public GoogleTypeMoneyArgs(
        @Nullable Output<String> currencyCode,
        @Nullable Output<Integer> nanos,
        @Nullable Output<String> units) {
        this.currencyCode = currencyCode;
        this.nanos = nanos;
        this.units = units;
    }

    private GoogleTypeMoneyArgs() {
        this.currencyCode = Codegen.empty();
        this.nanos = Codegen.empty();
        this.units = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleTypeMoneyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> currencyCode;
        private @Nullable Output<Integer> nanos;
        private @Nullable Output<String> units;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleTypeMoneyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencyCode = defaults.currencyCode;
    	      this.nanos = defaults.nanos;
    	      this.units = defaults.units;
        }

        public Builder currencyCode(@Nullable Output<String> currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public Builder currencyCode(@Nullable String currencyCode) {
            this.currencyCode = Codegen.ofNullable(currencyCode);
            return this;
        }
        public Builder nanos(@Nullable Output<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = Codegen.ofNullable(nanos);
            return this;
        }
        public Builder units(@Nullable Output<String> units) {
            this.units = units;
            return this;
        }
        public Builder units(@Nullable String units) {
            this.units = Codegen.ofNullable(units);
            return this;
        }        public GoogleTypeMoneyArgs build() {
            return new GoogleTypeMoneyArgs(currencyCode, nanos, units);
        }
    }
}
