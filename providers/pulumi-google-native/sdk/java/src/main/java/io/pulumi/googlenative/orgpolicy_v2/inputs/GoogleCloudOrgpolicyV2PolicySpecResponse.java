// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.orgpolicy_v2.inputs.GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines a Cloud Organization `PolicySpec` which is used to specify `Constraints` for configurations of Cloud Platform resources.
 * 
 */
public final class GoogleCloudOrgpolicyV2PolicySpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudOrgpolicyV2PolicySpecResponse Empty = new GoogleCloudOrgpolicyV2PolicySpecResponse();

    /**
     * An opaque tag indicating the current version of the `Policy`, used for concurrency control. This field is ignored if used in a `CreatePolicy` request. When the `Policy` is returned from either a `GetPolicy` or a `ListPolicies` request, this `etag` indicates the version of the current `Policy` to use when executing a read-modify-write loop. When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Determines the inheritance behavior for this `Policy`. If `inherit_from_parent` is true, PolicyRules set higher up in the hierarchy (up to the closest root) are inherited and present in the effective policy. If it is false, then no rules are inherited, and this Policy becomes the new root for evaluation. This field can be set only for Policies which configure list constraints.
     * 
     */
    @Import(name="inheritFromParent", required=true)
      private final Boolean inheritFromParent;

    public Boolean inheritFromParent() {
        return this.inheritFromParent;
    }

    /**
     * Ignores policies set above this resource and restores the `constraint_default` enforcement behavior of the specific `Constraint` at this resource. This field can be set in policies for either list or boolean constraints. If set, `rules` must be empty and `inherit_from_parent` must be set to false.
     * 
     */
    @Import(name="reset", required=true)
      private final Boolean reset;

    public Boolean reset() {
        return this.reset;
    }

    /**
     * Up to 10 PolicyRules are allowed. In Policies for boolean constraints, the following requirements apply: - There must be one and only one PolicyRule where condition is unset. - BooleanPolicyRules with conditions must set `enforced` to the opposite of the PolicyRule without a condition. - During policy evaluation, PolicyRules with conditions that are true for a target resource take precedence.
     * 
     */
    @Import(name="rules", required=true)
      private final List<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse> rules;

    public List<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse> rules() {
        return this.rules;
    }

    /**
     * The time stamp this was previously updated. This represents the last time a call to `CreatePolicy` or `UpdatePolicy` was made for that `Policy`.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String updateTime() {
        return this.updateTime;
    }

    public GoogleCloudOrgpolicyV2PolicySpecResponse(
        String etag,
        Boolean inheritFromParent,
        Boolean reset,
        List<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse> rules,
        String updateTime) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.inheritFromParent = Objects.requireNonNull(inheritFromParent, "expected parameter 'inheritFromParent' to be non-null");
        this.reset = Objects.requireNonNull(reset, "expected parameter 'reset' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private GoogleCloudOrgpolicyV2PolicySpecResponse() {
        this.etag = null;
        this.inheritFromParent = null;
        this.reset = null;
        this.rules = List.of();
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudOrgpolicyV2PolicySpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private Boolean inheritFromParent;
        private Boolean reset;
        private List<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse> rules;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudOrgpolicyV2PolicySpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.reset = defaults.reset;
    	      this.rules = defaults.rules;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder inheritFromParent(Boolean inheritFromParent) {
            this.inheritFromParent = Objects.requireNonNull(inheritFromParent);
            return this;
        }
        public Builder reset(Boolean reset) {
            this.reset = Objects.requireNonNull(reset);
            return this;
        }
        public Builder rules(List<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse... rules) {
            return rules(List.of(rules));
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GoogleCloudOrgpolicyV2PolicySpecResponse build() {
            return new GoogleCloudOrgpolicyV2PolicySpecResponse(etag, inheritFromParent, reset, rules, updateTime);
        }
    }
}
