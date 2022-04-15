// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1ImageResponse;
import io.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse;
import io.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * ProductCatalogItem captures item metadata specific to retail products.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse Empty = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse();

    /**
     * Optional. The available quantity of the item.
     * 
     */
    @Import(name="availableQuantity", required=true)
      private final String availableQuantity;

    public String availableQuantity() {
        return this.availableQuantity;
    }

    /**
     * Optional. Canonical URL directly linking to the item detail page with a length limit of 5 KiB..
     * 
     */
    @Import(name="canonicalProductUri", required=true)
      private final String canonicalProductUri;

    public String canonicalProductUri() {
        return this.canonicalProductUri;
    }

    /**
     * Optional. A map to pass the costs associated with the product. For example: {"manufacturing": 45.5} The profit of selling this item is computed like so: * If 'exactPrice' is provided, profit = displayPrice - sum(costs) * If 'priceRange' is provided, profit = minPrice - sum(costs)
     * 
     */
    @Import(name="costs", required=true)
      private final Map<String,String> costs;

    public Map<String,String> costs() {
        return this.costs;
    }

    /**
     * Optional. Only required if the price is set. Currency code for price/costs. Use three-character ISO-4217 code.
     * 
     */
    @Import(name="currencyCode", required=true)
      private final String currencyCode;

    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Optional. The exact product price.
     * 
     */
    @Import(name="exactPrice", required=true)
      private final GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice;

    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice() {
        return this.exactPrice;
    }

    /**
     * Optional. Product images for the catalog item.
     * 
     */
    @Import(name="images", required=true)
      private final List<GoogleCloudRecommendationengineV1beta1ImageResponse> images;

    public List<GoogleCloudRecommendationengineV1beta1ImageResponse> images() {
        return this.images;
    }

    /**
     * Optional. The product price range.
     * 
     */
    @Import(name="priceRange", required=true)
      private final GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange;

    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange() {
        return this.priceRange;
    }

    /**
     * Optional. Online stock state of the catalog item. Default is `IN_STOCK`.
     * 
     */
    @Import(name="stockState", required=true)
      private final String stockState;

    public String stockState() {
        return this.stockState;
    }

    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse(
        String availableQuantity,
        String canonicalProductUri,
        Map<String,String> costs,
        String currencyCode,
        GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice,
        List<GoogleCloudRecommendationengineV1beta1ImageResponse> images,
        GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange,
        String stockState) {
        this.availableQuantity = Objects.requireNonNull(availableQuantity, "expected parameter 'availableQuantity' to be non-null");
        this.canonicalProductUri = Objects.requireNonNull(canonicalProductUri, "expected parameter 'canonicalProductUri' to be non-null");
        this.costs = Objects.requireNonNull(costs, "expected parameter 'costs' to be non-null");
        this.currencyCode = Objects.requireNonNull(currencyCode, "expected parameter 'currencyCode' to be non-null");
        this.exactPrice = Objects.requireNonNull(exactPrice, "expected parameter 'exactPrice' to be non-null");
        this.images = Objects.requireNonNull(images, "expected parameter 'images' to be non-null");
        this.priceRange = Objects.requireNonNull(priceRange, "expected parameter 'priceRange' to be non-null");
        this.stockState = Objects.requireNonNull(stockState, "expected parameter 'stockState' to be non-null");
    }

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse() {
        this.availableQuantity = null;
        this.canonicalProductUri = null;
        this.costs = Map.of();
        this.currencyCode = null;
        this.exactPrice = null;
        this.images = List.of();
        this.priceRange = null;
        this.stockState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availableQuantity;
        private String canonicalProductUri;
        private Map<String,String> costs;
        private String currencyCode;
        private GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice;
        private List<GoogleCloudRecommendationengineV1beta1ImageResponse> images;
        private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange;
        private String stockState;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableQuantity = defaults.availableQuantity;
    	      this.canonicalProductUri = defaults.canonicalProductUri;
    	      this.costs = defaults.costs;
    	      this.currencyCode = defaults.currencyCode;
    	      this.exactPrice = defaults.exactPrice;
    	      this.images = defaults.images;
    	      this.priceRange = defaults.priceRange;
    	      this.stockState = defaults.stockState;
        }

        public Builder availableQuantity(String availableQuantity) {
            this.availableQuantity = Objects.requireNonNull(availableQuantity);
            return this;
        }
        public Builder canonicalProductUri(String canonicalProductUri) {
            this.canonicalProductUri = Objects.requireNonNull(canonicalProductUri);
            return this;
        }
        public Builder costs(Map<String,String> costs) {
            this.costs = Objects.requireNonNull(costs);
            return this;
        }
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }
        public Builder exactPrice(GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice) {
            this.exactPrice = Objects.requireNonNull(exactPrice);
            return this;
        }
        public Builder images(List<GoogleCloudRecommendationengineV1beta1ImageResponse> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }
        public Builder images(GoogleCloudRecommendationengineV1beta1ImageResponse... images) {
            return images(List.of(images));
        }
        public Builder priceRange(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange) {
            this.priceRange = Objects.requireNonNull(priceRange);
            return this;
        }
        public Builder stockState(String stockState) {
            this.stockState = Objects.requireNonNull(stockState);
            return this;
        }        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse build() {
            return new GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse(availableQuantity, canonicalProductUri, costs, currencyCode, exactPrice, images, priceRange, stockState);
        }
    }
}
