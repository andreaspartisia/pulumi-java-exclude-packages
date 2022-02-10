// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse Empty = new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse();

    @InputImport(name="allowedValues", required=true)
    private final List<String> allowedValues;

    public List<String> getAllowedValues() {
        return this.allowedValues;
    }

    @InputImport(name="deniedValues", required=true)
    private final List<String> deniedValues;

    public List<String> getDeniedValues() {
        return this.deniedValues;
    }

    public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse(
        List<String> allowedValues,
        List<String> deniedValues) {
        this.allowedValues = Objects.requireNonNull(allowedValues, "expected parameter 'allowedValues' to be non-null");
        this.deniedValues = Objects.requireNonNull(deniedValues, "expected parameter 'deniedValues' to be non-null");
    }

    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse() {
        this.allowedValues = List.of();
        this.deniedValues = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedValues;
        private List<String> deniedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.deniedValues = defaults.deniedValues;
        }

        public Builder setAllowedValues(List<String> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }

        public Builder setDeniedValues(List<String> deniedValues) {
            this.deniedValues = Objects.requireNonNull(deniedValues);
            return this;
        }

        public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse build() {
            return new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse(allowedValues, deniedValues);
        }
    }
}