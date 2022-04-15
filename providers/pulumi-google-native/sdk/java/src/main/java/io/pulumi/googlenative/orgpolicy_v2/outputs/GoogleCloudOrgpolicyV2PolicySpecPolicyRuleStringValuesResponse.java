// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse {
    /**
     * List of values allowed at this resource.
     * 
     */
    private final List<String> allowedValues;
    /**
     * List of values denied at this resource.
     * 
     */
    private final List<String> deniedValues;

    @CustomType.Constructor
    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse(
        @CustomType.Parameter("allowedValues") List<String> allowedValues,
        @CustomType.Parameter("deniedValues") List<String> deniedValues) {
        this.allowedValues = allowedValues;
        this.deniedValues = deniedValues;
    }

    /**
     * List of values allowed at this resource.
     * 
    */
    public List<String> allowedValues() {
        return this.allowedValues;
    }
    /**
     * List of values denied at this resource.
     * 
    */
    public List<String> deniedValues() {
        return this.deniedValues;
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

        public Builder allowedValues(List<String> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }
        public Builder allowedValues(String... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }
        public Builder deniedValues(List<String> deniedValues) {
            this.deniedValues = Objects.requireNonNull(deniedValues);
            return this;
        }
        public Builder deniedValues(String... deniedValues) {
            return deniedValues(List.of(deniedValues));
        }        public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse build() {
            return new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse(allowedValues, deniedValues);
        }
    }
}
