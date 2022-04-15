// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse;
import java.util.Objects;


/**
 * Contains output only fields. Use this sub-message for all output fields set on ResourcePolicy. The internal structure of this "status" field should mimic the structure of ResourcePolicy proto specification.
 * 
 */
public final class ResourcePolicyResourceStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyResourceStatusResponse Empty = new ResourcePolicyResourceStatusResponse();

    /**
     * Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * 
     */
    @Import(name="instanceSchedulePolicy", required=true)
      private final ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy;

    public ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy() {
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

        public Builder instanceSchedulePolicy(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Objects.requireNonNull(instanceSchedulePolicy);
            return this;
        }        public ResourcePolicyResourceStatusResponse build() {
            return new ResourcePolicyResourceStatusResponse(instanceSchedulePolicy);
        }
    }
}
