// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaIntervalArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how a facet is computed.
 * 
 */
public final class GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs Empty = new GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs();

    /**
     * Only get facet values that contains the given strings. For example, suppose "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "contains" to "Shoe", the "categories" facet will give only "Women > Shoe" and "Men > Shoe". Only supported on textual fields. Maximum is 10.
     * 
     */
    @Import(name="contains")
      private final @Nullable Output<List<String>> contains;

    public Output<List<String>> contains() {
        return this.contains == null ? Codegen.empty() : this.contains;
    }

    /**
     * Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
     * 
     */
    @Import(name="intervals")
      private final @Nullable Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals;

    public Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals() {
        return this.intervals == null ? Codegen.empty() : this.intervals;
    }

    /**
     * Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * "brands" * "categories" * "genders" * "ageGroups" * "availability" * "colorFamilies" * "colors" * "sizes" * "materials" * "patterns" * "conditions" * "attributes.key" * "pickupInStore" * "shipToStore" * "sameDayDelivery" * "nextDayDelivery" * "customFulfillment1" * "customFulfillment2" * "customFulfillment3" * "customFulfillment4" * "customFulfillment5" * "inventory(place_id,attributes.key)" * numerical_field = * "price" * "discount" * "rating" * "ratingCount" * "attributes.key" * "inventory(place_id,price)" * "inventory(place_id,original_price)" * "inventory(place_id,attributes.key)"
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * The order in which Facet.values are returned. Allowed values are: * "count desc", which means order by Facet.FacetValue.count descending. * "value desc", which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
     * 
     */
    @Import(name="orderBy")
      private final @Nullable Output<String> orderBy;

    public Output<String> orderBy() {
        return this.orderBy == null ? Codegen.empty() : this.orderBy;
    }

    /**
     * Only get facet values that start with the given string prefix. For example, suppose "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "prefixes" to "Women", the "categories" facet will give only "Women > Shoe" and "Women > Dress". Only supported on textual fields. Maximum is 10.
     * 
     */
    @Import(name="prefixes")
      private final @Nullable Output<List<String>> prefixes;

    public Output<List<String>> prefixes() {
        return this.prefixes == null ? Codegen.empty() : this.prefixes;
    }

    /**
     * The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always "1" and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for "shipToStore", where FacetKey.key is "customizedShipToStore", and FacetKey.query is "availability: ANY(\"IN_STOCK\") AND shipToStore: ANY(\"123\")". Then the facet will count the products that are both in stock and ship to store "123".
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> query() {
        return this.query == null ? Codegen.empty() : this.query;
    }

    /**
     * Only get facet for the given restricted values. For example, when using "pickupInStore" as key and set restricted values to ["store123", "store456"], only facets for "store123" and "store456" are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
     * 
     */
    @Import(name="restrictedValues")
      private final @Nullable Output<List<String>> restrictedValues;

    public Output<List<String>> restrictedValues() {
        return this.restrictedValues == null ? Codegen.empty() : this.restrictedValues;
    }

    public GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs(
        @Nullable Output<List<String>> contains,
        @Nullable Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals,
        Output<String> key,
        @Nullable Output<String> orderBy,
        @Nullable Output<List<String>> prefixes,
        @Nullable Output<String> query,
        @Nullable Output<List<String>> restrictedValues) {
        this.contains = contains;
        this.intervals = intervals;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.orderBy = orderBy;
        this.prefixes = prefixes;
        this.query = query;
        this.restrictedValues = restrictedValues;
    }

    private GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs() {
        this.contains = Codegen.empty();
        this.intervals = Codegen.empty();
        this.key = Codegen.empty();
        this.orderBy = Codegen.empty();
        this.prefixes = Codegen.empty();
        this.query = Codegen.empty();
        this.restrictedValues = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> contains;
        private @Nullable Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals;
        private Output<String> key;
        private @Nullable Output<String> orderBy;
        private @Nullable Output<List<String>> prefixes;
        private @Nullable Output<String> query;
        private @Nullable Output<List<String>> restrictedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contains = defaults.contains;
    	      this.intervals = defaults.intervals;
    	      this.key = defaults.key;
    	      this.orderBy = defaults.orderBy;
    	      this.prefixes = defaults.prefixes;
    	      this.query = defaults.query;
    	      this.restrictedValues = defaults.restrictedValues;
        }

        public Builder contains(@Nullable Output<List<String>> contains) {
            this.contains = contains;
            return this;
        }
        public Builder contains(@Nullable List<String> contains) {
            this.contains = Codegen.ofNullable(contains);
            return this;
        }
        public Builder contains(String... contains) {
            return contains(List.of(contains));
        }
        public Builder intervals(@Nullable Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals) {
            this.intervals = intervals;
            return this;
        }
        public Builder intervals(@Nullable List<GoogleCloudRetailV2alphaIntervalArgs> intervals) {
            this.intervals = Codegen.ofNullable(intervals);
            return this;
        }
        public Builder intervals(GoogleCloudRetailV2alphaIntervalArgs... intervals) {
            return intervals(List.of(intervals));
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder orderBy(@Nullable Output<String> orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public Builder orderBy(@Nullable String orderBy) {
            this.orderBy = Codegen.ofNullable(orderBy);
            return this;
        }
        public Builder prefixes(@Nullable Output<List<String>> prefixes) {
            this.prefixes = prefixes;
            return this;
        }
        public Builder prefixes(@Nullable List<String> prefixes) {
            this.prefixes = Codegen.ofNullable(prefixes);
            return this;
        }
        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }
        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = Codegen.ofNullable(query);
            return this;
        }
        public Builder restrictedValues(@Nullable Output<List<String>> restrictedValues) {
            this.restrictedValues = restrictedValues;
            return this;
        }
        public Builder restrictedValues(@Nullable List<String> restrictedValues) {
            this.restrictedValues = Codegen.ofNullable(restrictedValues);
            return this;
        }
        public Builder restrictedValues(String... restrictedValues) {
            return restrictedValues(List.of(restrictedValues));
        }        public GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs build() {
            return new GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs(contains, intervals, key, orderBy, prefixes, query, restrictedValues);
        }
    }
}
