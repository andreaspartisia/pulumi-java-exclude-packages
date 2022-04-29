// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.MeteringComputation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QueryQueryDefinitionCostAnalysisUi {
    /**
     * @return (Updatable) The graph type.
     * 
     */
    private final @Nullable String graph;
    /**
     * @return (Updatable) A cumulative graph.
     * 
     */
    private final @Nullable Boolean isCumulativeGraph;

    @CustomType.Constructor
    private QueryQueryDefinitionCostAnalysisUi(
        @CustomType.Parameter("graph") @Nullable String graph,
        @CustomType.Parameter("isCumulativeGraph") @Nullable Boolean isCumulativeGraph) {
        this.graph = graph;
        this.isCumulativeGraph = isCumulativeGraph;
    }

    /**
     * @return (Updatable) The graph type.
     * 
     */
    public Optional<String> graph() {
        return Optional.ofNullable(this.graph);
    }
    /**
     * @return (Updatable) A cumulative graph.
     * 
     */
    public Optional<Boolean> isCumulativeGraph() {
        return Optional.ofNullable(this.isCumulativeGraph);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryQueryDefinitionCostAnalysisUi defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String graph;
        private @Nullable Boolean isCumulativeGraph;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryQueryDefinitionCostAnalysisUi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.graph = defaults.graph;
    	      this.isCumulativeGraph = defaults.isCumulativeGraph;
        }

        public Builder graph(@Nullable String graph) {
            this.graph = graph;
            return this;
        }
        public Builder isCumulativeGraph(@Nullable Boolean isCumulativeGraph) {
            this.isCumulativeGraph = isCumulativeGraph;
            return this;
        }        public QueryQueryDefinitionCostAnalysisUi build() {
            return new QueryQueryDefinitionCostAnalysisUi(graph, isCumulativeGraph);
        }
    }
}
