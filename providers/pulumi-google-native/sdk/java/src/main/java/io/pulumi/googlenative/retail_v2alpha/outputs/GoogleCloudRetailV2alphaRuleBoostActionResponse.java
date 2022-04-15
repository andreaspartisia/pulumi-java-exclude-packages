// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2alphaRuleBoostActionResponse {
    /**
     * Strength of the condition boost, which must be in [-1, 1]. Negative boost means demotion. Default is 0.0. Setting to 1.0 gives the item a big promotion. However, it does not necessarily mean that the boosted item will be the top result at all times, nor that other items will be excluded. Results could still be shown even when none of them matches the condition. And results that are significantly more relevant to the search query can still trump your heavily favored but irrelevant items. Setting to -1.0 gives the item a big demotion. However, results that are deeply relevant might still be shown. The item will have an upstream battle to get a fairly high ranking, but it is not blocked out completely. Setting to 0.0 means no boost applied. The boosting condition is ignored.
     * 
     */
    private final Double boost;
    /**
     * The filter can have a max size of 5000 characters. An expression which specifies which products to apply an action to. The syntax and supported fields are the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Examples: * To boost products with product ID "product_1" or "product_2", and color "Red" or "Blue": *(id: ANY("product_1", "product_2")) * *AND * *(colorFamilies: ANY("Red", "Blue")) *
     * 
     */
    private final String productsFilter;

    @CustomType.Constructor
    private GoogleCloudRetailV2alphaRuleBoostActionResponse(
        @CustomType.Parameter("boost") Double boost,
        @CustomType.Parameter("productsFilter") String productsFilter) {
        this.boost = boost;
        this.productsFilter = productsFilter;
    }

    /**
     * Strength of the condition boost, which must be in [-1, 1]. Negative boost means demotion. Default is 0.0. Setting to 1.0 gives the item a big promotion. However, it does not necessarily mean that the boosted item will be the top result at all times, nor that other items will be excluded. Results could still be shown even when none of them matches the condition. And results that are significantly more relevant to the search query can still trump your heavily favored but irrelevant items. Setting to -1.0 gives the item a big demotion. However, results that are deeply relevant might still be shown. The item will have an upstream battle to get a fairly high ranking, but it is not blocked out completely. Setting to 0.0 means no boost applied. The boosting condition is ignored.
     * 
    */
    public Double boost() {
        return this.boost;
    }
    /**
     * The filter can have a max size of 5000 characters. An expression which specifies which products to apply an action to. The syntax and supported fields are the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Examples: * To boost products with product ID "product_1" or "product_2", and color "Red" or "Blue": *(id: ANY("product_1", "product_2")) * *AND * *(colorFamilies: ANY("Red", "Blue")) *
     * 
    */
    public String productsFilter() {
        return this.productsFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleBoostActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double boost;
        private String productsFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleBoostActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boost = defaults.boost;
    	      this.productsFilter = defaults.productsFilter;
        }

        public Builder boost(Double boost) {
            this.boost = Objects.requireNonNull(boost);
            return this;
        }
        public Builder productsFilter(String productsFilter) {
            this.productsFilter = Objects.requireNonNull(productsFilter);
            return this;
        }        public GoogleCloudRetailV2alphaRuleBoostActionResponse build() {
            return new GoogleCloudRetailV2alphaRuleBoostActionResponse(boost, productsFilter);
        }
    }
}
