// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration for the size bounds of an instance group, including its proportional size to other groups.
 * 
 */
public final class InstanceGroupAutoscalingPolicyConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupAutoscalingPolicyConfigResponse Empty = new InstanceGroupAutoscalingPolicyConfigResponse();

    /**
     * Maximum number of instances for this group. Required for primary workers. Note that by default, clusters will not use secondary workers. Required for secondary workers if the minimum secondary instances is set.Primary workers - Bounds: [min_instances, ). Secondary workers - Bounds: [min_instances, ). Default: 0.
     * 
     */
    @Import(name="maxInstances", required=true)
      private final Integer maxInstances;

    public Integer maxInstances() {
        return this.maxInstances;
    }

    /**
     * Optional. Minimum number of instances for this group.Primary workers - Bounds: 2, max_instances. Default: 2. Secondary workers - Bounds: 0, max_instances. Default: 0.
     * 
     */
    @Import(name="minInstances", required=true)
      private final Integer minInstances;

    public Integer minInstances() {
        return this.minInstances;
    }

    /**
     * Optional. Weight for the instance group, which is used to determine the fraction of total workers in the cluster from this instance group. For example, if primary workers have weight 2, and secondary workers have weight 1, the cluster will have approximately 2 primary workers for each secondary worker.The cluster may not reach the specified balance if constrained by min/max bounds or other autoscaling settings. For example, if max_instances for secondary workers is 0, then only primary workers will be added. The cluster can also be out of balance when created.If weight is not set on any instance group, the cluster will default to equal weight for all groups: the cluster will attempt to maintain an equal number of workers in each group within the configured size bounds for each group. If weight is set for one group only, the cluster will default to zero weight on the unset group. For example if weight is set only on primary workers, the cluster will use primary workers only and no secondary workers.
     * 
     */
    @Import(name="weight", required=true)
      private final Integer weight;

    public Integer weight() {
        return this.weight;
    }

    public InstanceGroupAutoscalingPolicyConfigResponse(
        Integer maxInstances,
        Integer minInstances,
        Integer weight) {
        this.maxInstances = Objects.requireNonNull(maxInstances, "expected parameter 'maxInstances' to be non-null");
        this.minInstances = Objects.requireNonNull(minInstances, "expected parameter 'minInstances' to be non-null");
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private InstanceGroupAutoscalingPolicyConfigResponse() {
        this.maxInstances = null;
        this.minInstances = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupAutoscalingPolicyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxInstances;
        private Integer minInstances;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupAutoscalingPolicyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.weight = defaults.weight;
        }

        public Builder maxInstances(Integer maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }
        public Builder minInstances(Integer minInstances) {
            this.minInstances = Objects.requireNonNull(minInstances);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public InstanceGroupAutoscalingPolicyConfigResponse build() {
            return new InstanceGroupAutoscalingPolicyConfigResponse(maxInstances, minInstances, weight);
        }
    }
}
