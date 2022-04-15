// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Autoscaling Policy config associated with the cluster.
 * 
 */
public final class AutoscalingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscalingConfigResponse Empty = new AutoscalingConfigResponse();

    /**
     * Optional. The autoscaling policy used by the cluster.Only resource names including projectid and location (region) are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id] projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the policy must be in the same project and Dataproc region.
     * 
     */
    @Import(name="policyUri", required=true)
      private final String policyUri;

    public String policyUri() {
        return this.policyUri;
    }

    public AutoscalingConfigResponse(String policyUri) {
        this.policyUri = Objects.requireNonNull(policyUri, "expected parameter 'policyUri' to be non-null");
    }

    private AutoscalingConfigResponse() {
        this.policyUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyUri = defaults.policyUri;
        }

        public Builder policyUri(String policyUri) {
            this.policyUri = Objects.requireNonNull(policyUri);
            return this;
        }        public AutoscalingConfigResponse build() {
            return new AutoscalingConfigResponse(policyUri);
        }
    }
}
