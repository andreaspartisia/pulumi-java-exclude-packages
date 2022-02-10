// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse;
import java.util.Objects;


public final class ResourcePolicyResourceStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyResourceStatusResponse Empty = new ResourcePolicyResourceStatusResponse();

    @InputImport(name="instanceSchedulePolicy", required=true)
    private final ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy;

    public ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
    }

    public ResourcePolicyResourceStatusResponse(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy) {
        this.instanceSchedulePolicy = Objects.requireNonNull(instanceSchedulePolicy, "expected parameter 'instanceSchedulePolicy' to be non-null");
    }

    private ResourcePolicyResourceStatusResponse() {
        this.instanceSchedulePolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceSchedulePolicy = defaults.instanceSchedulePolicy;
        }

        public Builder setInstanceSchedulePolicy(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Objects.requireNonNull(instanceSchedulePolicy);
            return this;
        }

        public ResourcePolicyResourceStatusResponse build() {
            return new ResourcePolicyResourceStatusResponse(instanceSchedulePolicy);
        }
    }
}