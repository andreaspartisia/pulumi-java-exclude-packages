// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The price information of a Product.
 * 
 */
public final class GoogleCloudRetailV2PriceInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2PriceInfoArgs Empty = new GoogleCloudRetailV2PriceInfoArgs();

    /**
     * The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
     * 
     */
    @Import(name="cost")
      private final @Nullable Output<Double> cost;

    public Output<Double> cost() {
        return this.cost == null ? Codegen.empty() : this.cost;
    }

    /**
     * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
     * 
     */
    @Import(name="currencyCode")
      private final @Nullable Output<String> currencyCode;

    public Output<String> currencyCode() {
        return this.currencyCode == null ? Codegen.empty() : this.currencyCode;
    }

    /**
     * Price of the product without any discount. If zero, by default set to be the price.
     * 
     */
    @Import(name="originalPrice")
      private final @Nullable Output<Double> originalPrice;

    public Output<Double> originalPrice() {
        return this.originalPrice == null ? Codegen.empty() : this.originalPrice;
    }

    /**
     * Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
     * 
     */
    @Import(name="price")
      private final @Nullable Output<Double> price;

    public Output<Double> price() {
        return this.price == null ? Codegen.empty() : this.price;
    }

    /**
     * The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @Import(name="priceEffectiveTime")
      private final @Nullable Output<String> priceEffectiveTime;

    public Output<String> priceEffectiveTime() {
        return this.priceEffectiveTime == null ? Codegen.empty() : this.priceEffectiveTime;
    }

    /**
     * The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @Import(name="priceExpireTime")
      private final @Nullable Output<String> priceExpireTime;

    public Output<String> priceExpireTime() {
        return this.priceExpireTime == null ? Codegen.empty() : this.priceExpireTime;
    }

    public GoogleCloudRetailV2PriceInfoArgs(
        @Nullable Output<Double> cost,
        @Nullable Output<String> currencyCode,
        @Nullable Output<Double> originalPrice,
        @Nullable Output<Double> price,
        @Nullable Output<String> priceEffectiveTime,
        @Nullable Output<String> priceExpireTime) {
        this.cost = cost;
        this.currencyCode = currencyCode;
        this.originalPrice = originalPrice;
        this.price = price;
        this.priceEffectiveTime = priceEffectiveTime;
        this.priceExpireTime = priceExpireTime;
    }

    private GoogleCloudRetailV2PriceInfoArgs() {
        this.cost = Codegen.empty();
        this.currencyCode = Codegen.empty();
        this.originalPrice = Codegen.empty();
        this.price = Codegen.empty();
        this.priceEffectiveTime = Codegen.empty();
        this.priceExpireTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2PriceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cost;
        private @Nullable Output<String> currencyCode;
        private @Nullable Output<Double> originalPrice;
        private @Nullable Output<Double> price;
        private @Nullable Output<String> priceEffectiveTime;
        private @Nullable Output<String> priceExpireTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2PriceInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cost = defaults.cost;
    	      this.currencyCode = defaults.currencyCode;
    	      this.originalPrice = defaults.originalPrice;
    	      this.price = defaults.price;
    	      this.priceEffectiveTime = defaults.priceEffectiveTime;
    	      this.priceExpireTime = defaults.priceExpireTime;
        }

        public Builder cost(@Nullable Output<Double> cost) {
            this.cost = cost;
            return this;
        }
        public Builder cost(@Nullable Double cost) {
            this.cost = Codegen.ofNullable(cost);
            return this;
        }
        public Builder currencyCode(@Nullable Output<String> currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public Builder currencyCode(@Nullable String currencyCode) {
            this.currencyCode = Codegen.ofNullable(currencyCode);
            return this;
        }
        public Builder originalPrice(@Nullable Output<Double> originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Builder originalPrice(@Nullable Double originalPrice) {
            this.originalPrice = Codegen.ofNullable(originalPrice);
            return this;
        }
        public Builder price(@Nullable Output<Double> price) {
            this.price = price;
            return this;
        }
        public Builder price(@Nullable Double price) {
            this.price = Codegen.ofNullable(price);
            return this;
        }
        public Builder priceEffectiveTime(@Nullable Output<String> priceEffectiveTime) {
            this.priceEffectiveTime = priceEffectiveTime;
            return this;
        }
        public Builder priceEffectiveTime(@Nullable String priceEffectiveTime) {
            this.priceEffectiveTime = Codegen.ofNullable(priceEffectiveTime);
            return this;
        }
        public Builder priceExpireTime(@Nullable Output<String> priceExpireTime) {
            this.priceExpireTime = priceExpireTime;
            return this;
        }
        public Builder priceExpireTime(@Nullable String priceExpireTime) {
            this.priceExpireTime = Codegen.ofNullable(priceExpireTime);
            return this;
        }        public GoogleCloudRetailV2PriceInfoArgs build() {
            return new GoogleCloudRetailV2PriceInfoArgs(cost, currencyCode, originalPrice, price, priceEffectiveTime, priceExpireTime);
        }
    }
}
