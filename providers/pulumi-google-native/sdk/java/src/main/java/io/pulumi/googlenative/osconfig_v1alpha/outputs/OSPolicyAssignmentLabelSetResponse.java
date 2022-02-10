// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyAssignmentLabelSetResponse {
    private final Map<String,String> labels;

    @OutputCustomType.Constructor({"labels"})
    private OSPolicyAssignmentLabelSetResponse(Map<String,String> labels) {
        this.labels = Objects.requireNonNull(labels);
    }

    public Map<String,String> getLabels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentLabelSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentLabelSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public OSPolicyAssignmentLabelSetResponse build() {
            return new OSPolicyAssignmentLabelSetResponse(labels);
        }
    }
}