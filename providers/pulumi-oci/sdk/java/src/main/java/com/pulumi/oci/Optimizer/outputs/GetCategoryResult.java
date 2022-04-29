// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Optimizer.outputs.GetCategoryRecommendationCount;
import com.pulumi.oci.Optimizer.outputs.GetCategoryResourceCount;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCategoryResult {
    private final String categoryId;
    /**
     * @return The OCID of the tenancy. The tenancy is the root compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return Text describing the category.
     * 
     */
    private final String description;
    /**
     * @return The estimated cost savings, in dollars, for the category.
     * 
     */
    private final Double estimatedCostSaving;
    /**
     * @return Additional metadata key/value pairs for the category.
     * 
     */
    private final Map<String,Object> extendedMetadata;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The name assigned to the category.
     * 
     */
    private final String name;
    /**
     * @return An array of `RecommendationCount` objects grouped by the level of importance assigned to the recommendation.
     * 
     */
    private final List<GetCategoryRecommendationCount> recommendationCounts;
    /**
     * @return An array of `ResourceCount` objects grouped by the status of the recommendation.
     * 
     */
    private final List<GetCategoryResourceCount> resourceCounts;
    /**
     * @return The category&#39;s current state.
     * 
     */
    private final String state;
    /**
     * @return The date and time the category details were created, in the format defined by RFC3339.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the category details were last updated, in the format defined by RFC3339.
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetCategoryResult(
        @CustomType.Parameter("categoryId") String categoryId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("estimatedCostSaving") Double estimatedCostSaving,
        @CustomType.Parameter("extendedMetadata") Map<String,Object> extendedMetadata,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("recommendationCounts") List<GetCategoryRecommendationCount> recommendationCounts,
        @CustomType.Parameter("resourceCounts") List<GetCategoryResourceCount> resourceCounts,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.categoryId = categoryId;
        this.compartmentId = compartmentId;
        this.description = description;
        this.estimatedCostSaving = estimatedCostSaving;
        this.extendedMetadata = extendedMetadata;
        this.id = id;
        this.name = name;
        this.recommendationCounts = recommendationCounts;
        this.resourceCounts = resourceCounts;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    public String categoryId() {
        return this.categoryId;
    }
    /**
     * @return The OCID of the tenancy. The tenancy is the root compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Text describing the category.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The estimated cost savings, in dollars, for the category.
     * 
     */
    public Double estimatedCostSaving() {
        return this.estimatedCostSaving;
    }
    /**
     * @return Additional metadata key/value pairs for the category.
     * 
     */
    public Map<String,Object> extendedMetadata() {
        return this.extendedMetadata;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name assigned to the category.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An array of `RecommendationCount` objects grouped by the level of importance assigned to the recommendation.
     * 
     */
    public List<GetCategoryRecommendationCount> recommendationCounts() {
        return this.recommendationCounts;
    }
    /**
     * @return An array of `ResourceCount` objects grouped by the status of the recommendation.
     * 
     */
    public List<GetCategoryResourceCount> resourceCounts() {
        return this.resourceCounts;
    }
    /**
     * @return The category&#39;s current state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the category details were created, in the format defined by RFC3339.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the category details were last updated, in the format defined by RFC3339.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCategoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String categoryId;
        private String compartmentId;
        private String description;
        private Double estimatedCostSaving;
        private Map<String,Object> extendedMetadata;
        private String id;
        private String name;
        private List<GetCategoryRecommendationCount> recommendationCounts;
        private List<GetCategoryResourceCount> resourceCounts;
        private String state;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCategoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryId = defaults.categoryId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.description = defaults.description;
    	      this.estimatedCostSaving = defaults.estimatedCostSaving;
    	      this.extendedMetadata = defaults.extendedMetadata;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.recommendationCounts = defaults.recommendationCounts;
    	      this.resourceCounts = defaults.resourceCounts;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder categoryId(String categoryId) {
            this.categoryId = Objects.requireNonNull(categoryId);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder estimatedCostSaving(Double estimatedCostSaving) {
            this.estimatedCostSaving = Objects.requireNonNull(estimatedCostSaving);
            return this;
        }
        public Builder extendedMetadata(Map<String,Object> extendedMetadata) {
            this.extendedMetadata = Objects.requireNonNull(extendedMetadata);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder recommendationCounts(List<GetCategoryRecommendationCount> recommendationCounts) {
            this.recommendationCounts = Objects.requireNonNull(recommendationCounts);
            return this;
        }
        public Builder recommendationCounts(GetCategoryRecommendationCount... recommendationCounts) {
            return recommendationCounts(List.of(recommendationCounts));
        }
        public Builder resourceCounts(List<GetCategoryResourceCount> resourceCounts) {
            this.resourceCounts = Objects.requireNonNull(resourceCounts);
            return this;
        }
        public Builder resourceCounts(GetCategoryResourceCount... resourceCounts) {
            return resourceCounts(List.of(resourceCounts));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetCategoryResult build() {
            return new GetCategoryResult(categoryId, compartmentId, description, estimatedCostSaving, extendedMetadata, id, name, recommendationCounts, resourceCounts, state, timeCreated, timeUpdated);
        }
    }
}
