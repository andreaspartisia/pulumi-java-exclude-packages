// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A boost action to apply to results matching condition specified above.
 * 
 */
public final class GoogleCloudRetailV2alphaRuleBoostActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleBoostActionArgs Empty = new GoogleCloudRetailV2alphaRuleBoostActionArgs();

    /**
     * Strength of the condition boost, which must be in [-1, 1]. Negative boost means demotion. Default is 0.0. Setting to 1.0 gives the item a big promotion. However, it does not necessarily mean that the boosted item will be the top result at all times, nor that other items will be excluded. Results could still be shown even when none of them matches the condition. And results that are significantly more relevant to the search query can still trump your heavily favored but irrelevant items. Setting to -1.0 gives the item a big demotion. However, results that are deeply relevant might still be shown. The item will have an upstream battle to get a fairly high ranking, but it is not blocked out completely. Setting to 0.0 means no boost applied. The boosting condition is ignored.
     * 
     */
    @Import(name="boost")
      private final @Nullable Output<Double> boost;

    public Output<Double> boost() {
        return this.boost == null ? Codegen.empty() : this.boost;
    }

    /**
     * The filter can have a max size of 5000 characters. An expression which specifies which products to apply an action to. The syntax and supported fields are the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Examples: * To boost products with product ID "product_1" or "product_2", and color "Red" or "Blue": *(id: ANY("product_1", "product_2")) * *AND * *(colorFamilies: ANY("Red", "Blue")) *
     * 
     */
    @Import(name="productsFilter")
      private final @Nullable Output<String> productsFilter;

    public Output<String> productsFilter() {
        return this.productsFilter == null ? Codegen.empty() : this.productsFilter;
    }

    public GoogleCloudRetailV2alphaRuleBoostActionArgs(
        @Nullable Output<Double> boost,
        @Nullable Output<String> productsFilter) {
        this.boost = boost;
        this.productsFilter = productsFilter;
    }

    private GoogleCloudRetailV2alphaRuleBoostActionArgs() {
        this.boost = Codegen.empty();
        this.productsFilter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleBoostActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> boost;
        private @Nullable Output<String> productsFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleBoostActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boost = defaults.boost;
    	      this.productsFilter = defaults.productsFilter;
        }

        public Builder boost(@Nullable Output<Double> boost) {
            this.boost = boost;
            return this;
        }
        public Builder boost(@Nullable Double boost) {
            this.boost = Codegen.ofNullable(boost);
            return this;
        }
        public Builder productsFilter(@Nullable Output<String> productsFilter) {
            this.productsFilter = productsFilter;
            return this;
        }
        public Builder productsFilter(@Nullable String productsFilter) {
            this.productsFilter = Codegen.ofNullable(productsFilter);
            return this;
        }        public GoogleCloudRetailV2alphaRuleBoostActionArgs build() {
            return new GoogleCloudRetailV2alphaRuleBoostActionArgs(boost, productsFilter);
        }
    }
}
