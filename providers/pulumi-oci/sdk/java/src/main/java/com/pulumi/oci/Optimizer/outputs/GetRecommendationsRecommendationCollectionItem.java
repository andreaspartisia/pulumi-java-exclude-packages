// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Optimizer.outputs.GetRecommendationsRecommendationCollectionItemResourceCount;
import com.pulumi.oci.Optimizer.outputs.GetRecommendationsRecommendationCollectionItemSupportedLevel;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRecommendationsRecommendationCollectionItem {
    /**
     * @return The unique OCID associated with the category.
     * 
     */
    private final String categoryId;
    /**
     * @return The OCID of the compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return Text describing the recommendation.
     * 
     */
    private final String description;
    /**
     * @return The estimated cost savings, in dollars, for the recommendation.
     * 
     */
    private final Double estimatedCostSaving;
    /**
     * @return Additional metadata key/value pairs for the recommendation.
     * 
     */
    private final Map<String,Object> extendedMetadata;
    /**
     * @return The unique OCID associated with the recommendation.
     * 
     */
    private final String id;
    /**
     * @return The level of importance assigned to the recommendation.
     * 
     */
    private final String importance;
    /**
     * @return Optional. A filter that returns results that match the name specified.
     * 
     */
    private final String name;
    private final String recommendationId;
    /**
     * @return An array of `ResourceCount` objects grouped by the status of the resource actions.
     * 
     */
    private final List<GetRecommendationsRecommendationCollectionItemResourceCount> resourceCounts;
    /**
     * @return A filter that returns results that match the lifecycle state specified.
     * 
     */
    private final String state;
    /**
     * @return A filter that returns recommendations that match the status specified.
     * 
     */
    private final String status;
    /**
     * @return Optional. The profile levels supported by a recommendation. For example, profile level values could be `Low`, `Medium`, and `High`. Not all recommendations support this field.
     * 
     */
    private final List<GetRecommendationsRecommendationCollectionItemSupportedLevel> supportedLevels;
    /**
     * @return The date and time the recommendation details were created, in the format defined by RFC3339.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time that the recommendation entered its current status. The format is defined by RFC3339.
     * 
     */
    private final String timeStatusBegin;
    /**
     * @return The date and time the current status will change. The format is defined by RFC3339.
     * 
     */
    private final String timeStatusEnd;
    /**
     * @return The date and time the recommendation details were last updated, in the format defined by RFC3339.
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetRecommendationsRecommendationCollectionItem(
        @CustomType.Parameter("categoryId") String categoryId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("estimatedCostSaving") Double estimatedCostSaving,
        @CustomType.Parameter("extendedMetadata") Map<String,Object> extendedMetadata,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("importance") String importance,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("recommendationId") String recommendationId,
        @CustomType.Parameter("resourceCounts") List<GetRecommendationsRecommendationCollectionItemResourceCount> resourceCounts,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("supportedLevels") List<GetRecommendationsRecommendationCollectionItemSupportedLevel> supportedLevels,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeStatusBegin") String timeStatusBegin,
        @CustomType.Parameter("timeStatusEnd") String timeStatusEnd,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.categoryId = categoryId;
        this.compartmentId = compartmentId;
        this.description = description;
        this.estimatedCostSaving = estimatedCostSaving;
        this.extendedMetadata = extendedMetadata;
        this.id = id;
        this.importance = importance;
        this.name = name;
        this.recommendationId = recommendationId;
        this.resourceCounts = resourceCounts;
        this.state = state;
        this.status = status;
        this.supportedLevels = supportedLevels;
        this.timeCreated = timeCreated;
        this.timeStatusBegin = timeStatusBegin;
        this.timeStatusEnd = timeStatusEnd;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return The unique OCID associated with the category.
     * 
     */
    public String categoryId() {
        return this.categoryId;
    }
    /**
     * @return The OCID of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Text describing the recommendation.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The estimated cost savings, in dollars, for the recommendation.
     * 
     */
    public Double estimatedCostSaving() {
        return this.estimatedCostSaving;
    }
    /**
     * @return Additional metadata key/value pairs for the recommendation.
     * 
     */
    public Map<String,Object> extendedMetadata() {
        return this.extendedMetadata;
    }
    /**
     * @return The unique OCID associated with the recommendation.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The level of importance assigned to the recommendation.
     * 
     */
    public String importance() {
        return this.importance;
    }
    /**
     * @return Optional. A filter that returns results that match the name specified.
     * 
     */
    public String name() {
        return this.name;
    }
    public String recommendationId() {
        return this.recommendationId;
    }
    /**
     * @return An array of `ResourceCount` objects grouped by the status of the resource actions.
     * 
     */
    public List<GetRecommendationsRecommendationCollectionItemResourceCount> resourceCounts() {
        return this.resourceCounts;
    }
    /**
     * @return A filter that returns results that match the lifecycle state specified.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return A filter that returns recommendations that match the status specified.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Optional. The profile levels supported by a recommendation. For example, profile level values could be `Low`, `Medium`, and `High`. Not all recommendations support this field.
     * 
     */
    public List<GetRecommendationsRecommendationCollectionItemSupportedLevel> supportedLevels() {
        return this.supportedLevels;
    }
    /**
     * @return The date and time the recommendation details were created, in the format defined by RFC3339.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time that the recommendation entered its current status. The format is defined by RFC3339.
     * 
     */
    public String timeStatusBegin() {
        return this.timeStatusBegin;
    }
    /**
     * @return The date and time the current status will change. The format is defined by RFC3339.
     * 
     */
    public String timeStatusEnd() {
        return this.timeStatusEnd;
    }
    /**
     * @return The date and time the recommendation details were last updated, in the format defined by RFC3339.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecommendationsRecommendationCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String categoryId;
        private String compartmentId;
        private String description;
        private Double estimatedCostSaving;
        private Map<String,Object> extendedMetadata;
        private String id;
        private String importance;
        private String name;
        private String recommendationId;
        private List<GetRecommendationsRecommendationCollectionItemResourceCount> resourceCounts;
        private String state;
        private String status;
        private List<GetRecommendationsRecommendationCollectionItemSupportedLevel> supportedLevels;
        private String timeCreated;
        private String timeStatusBegin;
        private String timeStatusEnd;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecommendationsRecommendationCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryId = defaults.categoryId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.description = defaults.description;
    	      this.estimatedCostSaving = defaults.estimatedCostSaving;
    	      this.extendedMetadata = defaults.extendedMetadata;
    	      this.id = defaults.id;
    	      this.importance = defaults.importance;
    	      this.name = defaults.name;
    	      this.recommendationId = defaults.recommendationId;
    	      this.resourceCounts = defaults.resourceCounts;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.supportedLevels = defaults.supportedLevels;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeStatusBegin = defaults.timeStatusBegin;
    	      this.timeStatusEnd = defaults.timeStatusEnd;
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
        public Builder importance(String importance) {
            this.importance = Objects.requireNonNull(importance);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder recommendationId(String recommendationId) {
            this.recommendationId = Objects.requireNonNull(recommendationId);
            return this;
        }
        public Builder resourceCounts(List<GetRecommendationsRecommendationCollectionItemResourceCount> resourceCounts) {
            this.resourceCounts = Objects.requireNonNull(resourceCounts);
            return this;
        }
        public Builder resourceCounts(GetRecommendationsRecommendationCollectionItemResourceCount... resourceCounts) {
            return resourceCounts(List.of(resourceCounts));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder supportedLevels(List<GetRecommendationsRecommendationCollectionItemSupportedLevel> supportedLevels) {
            this.supportedLevels = Objects.requireNonNull(supportedLevels);
            return this;
        }
        public Builder supportedLevels(GetRecommendationsRecommendationCollectionItemSupportedLevel... supportedLevels) {
            return supportedLevels(List.of(supportedLevels));
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeStatusBegin(String timeStatusBegin) {
            this.timeStatusBegin = Objects.requireNonNull(timeStatusBegin);
            return this;
        }
        public Builder timeStatusEnd(String timeStatusEnd) {
            this.timeStatusEnd = Objects.requireNonNull(timeStatusEnd);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetRecommendationsRecommendationCollectionItem build() {
            return new GetRecommendationsRecommendationCollectionItem(categoryId, compartmentId, description, estimatedCostSaving, extendedMetadata, id, importance, name, recommendationId, resourceCounts, state, status, supportedLevels, timeCreated, timeStatusBegin, timeStatusEnd, timeUpdated);
        }
    }
}
