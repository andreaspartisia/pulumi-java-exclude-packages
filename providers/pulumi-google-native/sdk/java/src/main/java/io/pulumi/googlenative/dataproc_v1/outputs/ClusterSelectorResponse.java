// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ClusterSelectorResponse {
    /**
     * The cluster labels. Cluster must have all labels to match.
     * 
     */
    private final Map<String,String> clusterLabels;
    /**
     * Optional. The zone where workflow process executes. This parameter does not affect the selection of the cluster.If unspecified, the zone of the first cluster matching the selector is used.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private ClusterSelectorResponse(
        @CustomType.Parameter("clusterLabels") Map<String,String> clusterLabels,
        @CustomType.Parameter("zone") String zone) {
        this.clusterLabels = clusterLabels;
        this.zone = zone;
    }

    /**
     * The cluster labels. Cluster must have all labels to match.
     * 
    */
    public Map<String,String> clusterLabels() {
        return this.clusterLabels;
    }
    /**
     * Optional. The zone where workflow process executes. This parameter does not affect the selection of the cluster.If unspecified, the zone of the first cluster matching the selector is used.
     * 
    */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> clusterLabels;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.zone = defaults.zone;
        }

        public Builder clusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public ClusterSelectorResponse build() {
            return new ClusterSelectorResponse(clusterLabels, zone);
        }
    }
}
