// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.FixedOrPercentResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceGroupManagerAutoHealingPolicyResponse {
    private final InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers;
    private final String healthCheck;
    private final Integer initialDelaySec;
    private final FixedOrPercentResponse maxUnavailable;
    private final String updateInstances;

    @OutputCustomType.Constructor({"autoHealingTriggers","healthCheck","initialDelaySec","maxUnavailable","updateInstances"})
    private InstanceGroupManagerAutoHealingPolicyResponse(
        InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers,
        String healthCheck,
        Integer initialDelaySec,
        FixedOrPercentResponse maxUnavailable,
        String updateInstances) {
        this.autoHealingTriggers = Objects.requireNonNull(autoHealingTriggers);
        this.healthCheck = Objects.requireNonNull(healthCheck);
        this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
        this.updateInstances = Objects.requireNonNull(updateInstances);
    }

    public InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse getAutoHealingTriggers() {
        return this.autoHealingTriggers;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }
    public Integer getInitialDelaySec() {
        return this.initialDelaySec;
    }
    public FixedOrPercentResponse getMaxUnavailable() {
        return this.maxUnavailable;
    }
    public String getUpdateInstances() {
        return this.updateInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAutoHealingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers;
        private String healthCheck;
        private Integer initialDelaySec;
        private FixedOrPercentResponse maxUnavailable;
        private String updateInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealingTriggers = defaults.autoHealingTriggers;
    	      this.healthCheck = defaults.healthCheck;
    	      this.initialDelaySec = defaults.initialDelaySec;
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.updateInstances = defaults.updateInstances;
        }

        public Builder setAutoHealingTriggers(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers) {
            this.autoHealingTriggers = Objects.requireNonNull(autoHealingTriggers);
            return this;
        }

        public Builder setHealthCheck(String healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder setInitialDelaySec(Integer initialDelaySec) {
            this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
            return this;
        }

        public Builder setMaxUnavailable(FixedOrPercentResponse maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public Builder setUpdateInstances(String updateInstances) {
            this.updateInstances = Objects.requireNonNull(updateInstances);
            return this;
        }

        public InstanceGroupManagerAutoHealingPolicyResponse build() {
            return new InstanceGroupManagerAutoHealingPolicyResponse(autoHealingTriggers, healthCheck, initialDelaySec, maxUnavailable, updateInstances);
        }
    }
}