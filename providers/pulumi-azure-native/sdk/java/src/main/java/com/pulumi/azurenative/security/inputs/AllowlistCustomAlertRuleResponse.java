// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A custom alert rule that checks if a value (depends on the custom alert type) is allowed.
 * 
 */
public final class AllowlistCustomAlertRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final AllowlistCustomAlertRuleResponse Empty = new AllowlistCustomAlertRuleResponse();

    /**
     * The values to allow. The format of the values depends on the rule type.
     * 
     */
    @Import(name="allowlistValues", required=true)
      private final List<String> allowlistValues;

    public List<String> allowlistValues() {
        return this.allowlistValues;
    }

    /**
     * The description of the custom alert.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * The display name of the custom alert.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * Status of the custom alert.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * The type of the custom alert rule.
     * Expected value is 'AllowlistCustomAlertRule'.
     * 
     */
    @Import(name="ruleType", required=true)
      private final String ruleType;

    public String ruleType() {
        return this.ruleType;
    }

    /**
     * The value type of the items in the list.
     * 
     */
    @Import(name="valueType", required=true)
      private final String valueType;

    public String valueType() {
        return this.valueType;
    }

    public AllowlistCustomAlertRuleResponse(
        List<String> allowlistValues,
        String description,
        String displayName,
        Boolean isEnabled,
        String ruleType,
        String valueType) {
        this.allowlistValues = Objects.requireNonNull(allowlistValues, "expected parameter 'allowlistValues' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.ruleType = Codegen.stringProp("ruleType").arg(ruleType).require();
        this.valueType = Objects.requireNonNull(valueType, "expected parameter 'valueType' to be non-null");
    }

    private AllowlistCustomAlertRuleResponse() {
        this.allowlistValues = List.of();
        this.description = null;
        this.displayName = null;
        this.isEnabled = null;
        this.ruleType = null;
        this.valueType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowlistCustomAlertRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowlistValues;
        private String description;
        private String displayName;
        private Boolean isEnabled;
        private String ruleType;
        private String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowlistCustomAlertRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlistValues = defaults.allowlistValues;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isEnabled = defaults.isEnabled;
    	      this.ruleType = defaults.ruleType;
    	      this.valueType = defaults.valueType;
        }

        public Builder allowlistValues(List<String> allowlistValues) {
            this.allowlistValues = Objects.requireNonNull(allowlistValues);
            return this;
        }
        public Builder allowlistValues(String... allowlistValues) {
            return allowlistValues(List.of(allowlistValues));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder valueType(String valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }        public AllowlistCustomAlertRuleResponse build() {
            return new AllowlistCustomAlertRuleResponse(allowlistValues, description, displayName, isEnabled, ruleType, valueType);
        }
    }
}
