// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.FixedOrPercentResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerUpdatePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerUpdatePolicyResponse Empty = new InstanceGroupManagerUpdatePolicyResponse();

    @InputImport(name="instanceRedistributionType", required=true)
    private final String instanceRedistributionType;

    public String getInstanceRedistributionType() {
        return this.instanceRedistributionType;
    }

    @InputImport(name="maxSurge", required=true)
    private final FixedOrPercentResponse maxSurge;

    public FixedOrPercentResponse getMaxSurge() {
        return this.maxSurge;
    }

    @InputImport(name="maxUnavailable", required=true)
    private final FixedOrPercentResponse maxUnavailable;

    public FixedOrPercentResponse getMaxUnavailable() {
        return this.maxUnavailable;
    }

    @InputImport(name="minReadySec", required=true)
    private final Integer minReadySec;

    public Integer getMinReadySec() {
        return this.minReadySec;
    }

    @InputImport(name="minimalAction", required=true)
    private final String minimalAction;

    public String getMinimalAction() {
        return this.minimalAction;
    }

    @InputImport(name="mostDisruptiveAllowedAction", required=true)
    private final String mostDisruptiveAllowedAction;

    public String getMostDisruptiveAllowedAction() {
        return this.mostDisruptiveAllowedAction;
    }

    @InputImport(name="replacementMethod", required=true)
    private final String replacementMethod;

    public String getReplacementMethod() {
        return this.replacementMethod;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public InstanceGroupManagerUpdatePolicyResponse(
        String instanceRedistributionType,
        FixedOrPercentResponse maxSurge,
        FixedOrPercentResponse maxUnavailable,
        Integer minReadySec,
        String minimalAction,
        String mostDisruptiveAllowedAction,
        String replacementMethod,
        String type) {
        this.instanceRedistributionType = Objects.requireNonNull(instanceRedistributionType, "expected parameter 'instanceRedistributionType' to be non-null");
        this.maxSurge = Objects.requireNonNull(maxSurge, "expected parameter 'maxSurge' to be non-null");
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
        this.minReadySec = Objects.requireNonNull(minReadySec, "expected parameter 'minReadySec' to be non-null");
        this.minimalAction = Objects.requireNonNull(minimalAction, "expected parameter 'minimalAction' to be non-null");
        this.mostDisruptiveAllowedAction = Objects.requireNonNull(mostDisruptiveAllowedAction, "expected parameter 'mostDisruptiveAllowedAction' to be non-null");
        this.replacementMethod = Objects.requireNonNull(replacementMethod, "expected parameter 'replacementMethod' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceGroupManagerUpdatePolicyResponse() {
        this.instanceRedistributionType = null;
        this.maxSurge = null;
        this.maxUnavailable = null;
        this.minReadySec = null;
        this.minimalAction = null;
        this.mostDisruptiveAllowedAction = null;
        this.replacementMethod = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerUpdatePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceRedistributionType;
        private FixedOrPercentResponse maxSurge;
        private FixedOrPercentResponse maxUnavailable;
        private Integer minReadySec;
        private String minimalAction;
        private String mostDisruptiveAllowedAction;
        private String replacementMethod;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerUpdatePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceRedistributionType = defaults.instanceRedistributionType;
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.minReadySec = defaults.minReadySec;
    	      this.minimalAction = defaults.minimalAction;
    	      this.mostDisruptiveAllowedAction = defaults.mostDisruptiveAllowedAction;
    	      this.replacementMethod = defaults.replacementMethod;
    	      this.type = defaults.type;
        }

        public Builder setInstanceRedistributionType(String instanceRedistributionType) {
            this.instanceRedistributionType = Objects.requireNonNull(instanceRedistributionType);
            return this;
        }

        public Builder setMaxSurge(FixedOrPercentResponse maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }

        public Builder setMaxUnavailable(FixedOrPercentResponse maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public Builder setMinReadySec(Integer minReadySec) {
            this.minReadySec = Objects.requireNonNull(minReadySec);
            return this;
        }

        public Builder setMinimalAction(String minimalAction) {
            this.minimalAction = Objects.requireNonNull(minimalAction);
            return this;
        }

        public Builder setMostDisruptiveAllowedAction(String mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = Objects.requireNonNull(mostDisruptiveAllowedAction);
            return this;
        }

        public Builder setReplacementMethod(String replacementMethod) {
            this.replacementMethod = Objects.requireNonNull(replacementMethod);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public InstanceGroupManagerUpdatePolicyResponse build() {
            return new InstanceGroupManagerUpdatePolicyResponse(instanceRedistributionType, maxSurge, maxUnavailable, minReadySec, minimalAction, mostDisruptiveAllowedAction, replacementMethod, type);
        }
    }
}