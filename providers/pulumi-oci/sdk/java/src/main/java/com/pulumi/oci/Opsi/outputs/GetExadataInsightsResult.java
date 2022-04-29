// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Opsi.outputs.GetExadataInsightsExadataInsightSummaryCollection;
import com.pulumi.oci.Opsi.outputs.GetExadataInsightsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExadataInsightsResult {
    /**
     * @return Compartment identifier of the Exadata insight resource
     * 
     */
    private final @Nullable String compartmentId;
    private final @Nullable Boolean compartmentIdInSubtree;
    /**
     * @return OPSI Enterprise Manager Bridge OCID
     * 
     */
    private final @Nullable String enterpriseManagerBridgeId;
    /**
     * @return The list of exadata_insight_summary_collection.
     * 
     */
    private final List<GetExadataInsightsExadataInsightSummaryCollection> exadataInsightSummaryCollections;
    /**
     * @return Operations Insights internal representation of the the Exadata system type.
     * 
     */
    private final @Nullable List<String> exadataTypes;
    private final @Nullable List<GetExadataInsightsFilter> filters;
    /**
     * @return Exadata insight identifier
     * 
     */
    private final @Nullable String id;
    /**
     * @return The current state of the Exadata insight.
     * 
     */
    private final @Nullable List<String> states;
    /**
     * @return Indicates the status of an Exadata insight in Operations Insights
     * 
     */
    private final @Nullable List<String> statuses;

    @CustomType.Constructor
    private GetExadataInsightsResult(
        @CustomType.Parameter("compartmentId") @Nullable String compartmentId,
        @CustomType.Parameter("compartmentIdInSubtree") @Nullable Boolean compartmentIdInSubtree,
        @CustomType.Parameter("enterpriseManagerBridgeId") @Nullable String enterpriseManagerBridgeId,
        @CustomType.Parameter("exadataInsightSummaryCollections") List<GetExadataInsightsExadataInsightSummaryCollection> exadataInsightSummaryCollections,
        @CustomType.Parameter("exadataTypes") @Nullable List<String> exadataTypes,
        @CustomType.Parameter("filters") @Nullable List<GetExadataInsightsFilter> filters,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("states") @Nullable List<String> states,
        @CustomType.Parameter("statuses") @Nullable List<String> statuses) {
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.exadataInsightSummaryCollections = exadataInsightSummaryCollections;
        this.exadataTypes = exadataTypes;
        this.filters = filters;
        this.id = id;
        this.states = states;
        this.statuses = statuses;
    }

    /**
     * @return Compartment identifier of the Exadata insight resource
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }
    /**
     * @return OPSI Enterprise Manager Bridge OCID
     * 
     */
    public Optional<String> enterpriseManagerBridgeId() {
        return Optional.ofNullable(this.enterpriseManagerBridgeId);
    }
    /**
     * @return The list of exadata_insight_summary_collection.
     * 
     */
    public List<GetExadataInsightsExadataInsightSummaryCollection> exadataInsightSummaryCollections() {
        return this.exadataInsightSummaryCollections;
    }
    /**
     * @return Operations Insights internal representation of the the Exadata system type.
     * 
     */
    public List<String> exadataTypes() {
        return this.exadataTypes == null ? List.of() : this.exadataTypes;
    }
    public List<GetExadataInsightsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Exadata insight identifier
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The current state of the Exadata insight.
     * 
     */
    public List<String> states() {
        return this.states == null ? List.of() : this.states;
    }
    /**
     * @return Indicates the status of an Exadata insight in Operations Insights
     * 
     */
    public List<String> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExadataInsightsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compartmentId;
        private @Nullable Boolean compartmentIdInSubtree;
        private @Nullable String enterpriseManagerBridgeId;
        private List<GetExadataInsightsExadataInsightSummaryCollection> exadataInsightSummaryCollections;
        private @Nullable List<String> exadataTypes;
        private @Nullable List<GetExadataInsightsFilter> filters;
        private @Nullable String id;
        private @Nullable List<String> states;
        private @Nullable List<String> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExadataInsightsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.compartmentIdInSubtree = defaults.compartmentIdInSubtree;
    	      this.enterpriseManagerBridgeId = defaults.enterpriseManagerBridgeId;
    	      this.exadataInsightSummaryCollections = defaults.exadataInsightSummaryCollections;
    	      this.exadataTypes = defaults.exadataTypes;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.states = defaults.states;
    	      this.statuses = defaults.statuses;
        }

        public Builder compartmentId(@Nullable String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }
        public Builder enterpriseManagerBridgeId(@Nullable String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            return this;
        }
        public Builder exadataInsightSummaryCollections(List<GetExadataInsightsExadataInsightSummaryCollection> exadataInsightSummaryCollections) {
            this.exadataInsightSummaryCollections = Objects.requireNonNull(exadataInsightSummaryCollections);
            return this;
        }
        public Builder exadataInsightSummaryCollections(GetExadataInsightsExadataInsightSummaryCollection... exadataInsightSummaryCollections) {
            return exadataInsightSummaryCollections(List.of(exadataInsightSummaryCollections));
        }
        public Builder exadataTypes(@Nullable List<String> exadataTypes) {
            this.exadataTypes = exadataTypes;
            return this;
        }
        public Builder exadataTypes(String... exadataTypes) {
            return exadataTypes(List.of(exadataTypes));
        }
        public Builder filters(@Nullable List<GetExadataInsightsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetExadataInsightsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder states(@Nullable List<String> states) {
            this.states = states;
            return this;
        }
        public Builder states(String... states) {
            return states(List.of(states));
        }
        public Builder statuses(@Nullable List<String> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }        public GetExadataInsightsResult build() {
            return new GetExadataInsightsResult(compartmentId, compartmentIdInSubtree, enterpriseManagerBridgeId, exadataInsightSummaryCollections, exadataTypes, filters, id, states, statuses);
        }
    }
}
