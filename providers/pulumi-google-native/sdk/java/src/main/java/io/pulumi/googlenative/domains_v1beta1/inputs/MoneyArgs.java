// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MoneyArgs extends io.pulumi.resources.ResourceArgs {

    public static final MoneyArgs Empty = new MoneyArgs();

    @InputImport(name="currencyCode")
    private final @Nullable Input<String> currencyCode;

    public Input<String> getCurrencyCode() {
        return this.currencyCode == null ? Input.empty() : this.currencyCode;
    }

    @InputImport(name="nanos")
    private final @Nullable Input<Integer> nanos;

    public Input<Integer> getNanos() {
        return this.nanos == null ? Input.empty() : this.nanos;
    }

    @InputImport(name="units")
    private final @Nullable Input<String> units;

    public Input<String> getUnits() {
        return this.units == null ? Input.empty() : this.units;
    }

    public MoneyArgs(
        @Nullable Input<String> currencyCode,
        @Nullable Input<Integer> nanos,
        @Nullable Input<String> units) {
        this.currencyCode = currencyCode;
        this.nanos = nanos;
        this.units = units;
    }

    private MoneyArgs() {
        this.currencyCode = Input.empty();
        this.nanos = Input.empty();
        this.units = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoneyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> currencyCode;
        private @Nullable Input<Integer> nanos;
        private @Nullable Input<String> units;

        public Builder() {
    	      // Empty
        }

        public Builder(MoneyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencyCode = defaults.currencyCode;
    	      this.nanos = defaults.nanos;
    	      this.units = defaults.units;
        }

        public Builder setCurrencyCode(@Nullable Input<String> currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setCurrencyCode(@Nullable String currencyCode) {
            this.currencyCode = Input.ofNullable(currencyCode);
            return this;
        }

        public Builder setNanos(@Nullable Input<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder setNanos(@Nullable Integer nanos) {
            this.nanos = Input.ofNullable(nanos);
            return this;
        }

        public Builder setUnits(@Nullable Input<String> units) {
            this.units = units;
            return this;
        }

        public Builder setUnits(@Nullable String units) {
            this.units = Input.ofNullable(units);
            return this;
        }

        public MoneyArgs build() {
            return new MoneyArgs(currencyCode, nanos, units);
        }
    }
}