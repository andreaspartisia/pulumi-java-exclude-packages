// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPropertyRuleFormatsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ruleFormats;

    private GetPropertyRuleFormatsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ruleFormats() {
        return this.ruleFormats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRuleFormatsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ruleFormats;
        public Builder() {}
        public Builder(GetPropertyRuleFormatsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ruleFormats = defaults.ruleFormats;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPropertyRuleFormatsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ruleFormats(List<String> ruleFormats) {
            if (ruleFormats == null) {
              throw new MissingRequiredPropertyException("GetPropertyRuleFormatsResult", "ruleFormats");
            }
            this.ruleFormats = ruleFormats;
            return this;
        }
        public Builder ruleFormats(String... ruleFormats) {
            return ruleFormats(List.of(ruleFormats));
        }
        public GetPropertyRuleFormatsResult build() {
            final var _resultValue = new GetPropertyRuleFormatsResult();
            _resultValue.id = id;
            _resultValue.ruleFormats = ruleFormats;
            return _resultValue;
        }
    }
}
