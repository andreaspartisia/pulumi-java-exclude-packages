// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MembershipRoleRestrictionEvaluationResponse {
    /**
     * The current state of the restriction
     * 
     */
    private final String state;

    @CustomType.Constructor
    private MembershipRoleRestrictionEvaluationResponse(@CustomType.Parameter("state") String state) {
        this.state = state;
    }

    /**
     * The current state of the restriction
     * 
    */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipRoleRestrictionEvaluationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipRoleRestrictionEvaluationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public MembershipRoleRestrictionEvaluationResponse build() {
            return new MembershipRoleRestrictionEvaluationResponse(state);
        }
    }
}
