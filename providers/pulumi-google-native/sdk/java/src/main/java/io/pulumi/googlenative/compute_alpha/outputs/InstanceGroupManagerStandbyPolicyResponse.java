// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerStandbyPolicyResponse {
    private final Integer initialDelaySec;

    @CustomType.Constructor
    private InstanceGroupManagerStandbyPolicyResponse(@CustomType.Parameter("initialDelaySec") Integer initialDelaySec) {
        this.initialDelaySec = initialDelaySec;
    }

    public Integer initialDelaySec() {
        return this.initialDelaySec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStandbyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer initialDelaySec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStandbyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialDelaySec = defaults.initialDelaySec;
        }

        public Builder initialDelaySec(Integer initialDelaySec) {
            this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
            return this;
        }        public InstanceGroupManagerStandbyPolicyResponse build() {
            return new InstanceGroupManagerStandbyPolicyResponse(initialDelaySec);
        }
    }
}
