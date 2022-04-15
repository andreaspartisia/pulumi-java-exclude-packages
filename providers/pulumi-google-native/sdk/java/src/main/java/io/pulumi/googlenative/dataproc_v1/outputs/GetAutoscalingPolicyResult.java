// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.BasicAutoscalingAlgorithmResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.InstanceGroupAutoscalingPolicyConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAutoscalingPolicyResult {
    private final BasicAutoscalingAlgorithmResponse basicAlgorithm;
    /**
     * Optional. The labels to associate with this autoscaling policy. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with an autoscaling policy.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
     * 
     */
    private final String name;
    /**
     * Optional. Describes how the autoscaler will operate for secondary workers.
     * 
     */
    private final InstanceGroupAutoscalingPolicyConfigResponse secondaryWorkerConfig;
    /**
     * Describes how the autoscaler will operate for primary workers.
     * 
     */
    private final InstanceGroupAutoscalingPolicyConfigResponse workerConfig;

    @CustomType.Constructor
    private GetAutoscalingPolicyResult(
        @CustomType.Parameter("basicAlgorithm") BasicAutoscalingAlgorithmResponse basicAlgorithm,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("secondaryWorkerConfig") InstanceGroupAutoscalingPolicyConfigResponse secondaryWorkerConfig,
        @CustomType.Parameter("workerConfig") InstanceGroupAutoscalingPolicyConfigResponse workerConfig) {
        this.basicAlgorithm = basicAlgorithm;
        this.labels = labels;
        this.name = name;
        this.secondaryWorkerConfig = secondaryWorkerConfig;
        this.workerConfig = workerConfig;
    }

    public BasicAutoscalingAlgorithmResponse basicAlgorithm() {
        return this.basicAlgorithm;
    }
    /**
     * Optional. The labels to associate with this autoscaling policy. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with an autoscaling policy.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Optional. Describes how the autoscaler will operate for secondary workers.
     * 
    */
    public InstanceGroupAutoscalingPolicyConfigResponse secondaryWorkerConfig() {
        return this.secondaryWorkerConfig;
    }
    /**
     * Describes how the autoscaler will operate for primary workers.
     * 
    */
    public InstanceGroupAutoscalingPolicyConfigResponse workerConfig() {
        return this.workerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoscalingPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAutoscalingAlgorithmResponse basicAlgorithm;
        private Map<String,String> labels;
        private String name;
        private InstanceGroupAutoscalingPolicyConfigResponse secondaryWorkerConfig;
        private InstanceGroupAutoscalingPolicyConfigResponse workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutoscalingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAlgorithm = defaults.basicAlgorithm;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.secondaryWorkerConfig = defaults.secondaryWorkerConfig;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder basicAlgorithm(BasicAutoscalingAlgorithmResponse basicAlgorithm) {
            this.basicAlgorithm = Objects.requireNonNull(basicAlgorithm);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder secondaryWorkerConfig(InstanceGroupAutoscalingPolicyConfigResponse secondaryWorkerConfig) {
            this.secondaryWorkerConfig = Objects.requireNonNull(secondaryWorkerConfig);
            return this;
        }
        public Builder workerConfig(InstanceGroupAutoscalingPolicyConfigResponse workerConfig) {
            this.workerConfig = Objects.requireNonNull(workerConfig);
            return this;
        }        public GetAutoscalingPolicyResult build() {
            return new GetAutoscalingPolicyResult(basicAlgorithm, labels, name, secondaryWorkerConfig, workerConfig);
        }
    }
}
