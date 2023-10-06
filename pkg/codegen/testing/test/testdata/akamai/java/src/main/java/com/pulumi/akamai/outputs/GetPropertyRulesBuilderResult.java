// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230530;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;
    private String ruleFormat;
    private @Nullable GetPropertyRulesBuilderRulesV20230105 rulesV20230105;
    private @Nullable GetPropertyRulesBuilderRulesV20230530 rulesV20230530;

    private GetPropertyRulesBuilderResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String json() {
        return this.json;
    }
    public String ruleFormat() {
        return this.ruleFormat;
    }
    public Optional<GetPropertyRulesBuilderRulesV20230105> rulesV20230105() {
        return Optional.ofNullable(this.rulesV20230105);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230530> rulesV20230530() {
        return Optional.ofNullable(this.rulesV20230530);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String json;
        private String ruleFormat;
        private @Nullable GetPropertyRulesBuilderRulesV20230105 rulesV20230105;
        private @Nullable GetPropertyRulesBuilderRulesV20230530 rulesV20230530;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.ruleFormat = defaults.ruleFormat;
    	      this.rulesV20230105 = defaults.rulesV20230105;
    	      this.rulesV20230530 = defaults.rulesV20230530;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPropertyRulesBuilderResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetPropertyRulesBuilderResult", "json");
            }
            this.json = json;
            return this;
        }
        @CustomType.Setter
        public Builder ruleFormat(String ruleFormat) {
            if (ruleFormat == null) {
              throw new MissingRequiredPropertyException("GetPropertyRulesBuilderResult", "ruleFormat");
            }
            this.ruleFormat = ruleFormat;
            return this;
        }
        @CustomType.Setter
        public Builder rulesV20230105(@Nullable GetPropertyRulesBuilderRulesV20230105 rulesV20230105) {

            this.rulesV20230105 = rulesV20230105;
            return this;
        }
        @CustomType.Setter
        public Builder rulesV20230530(@Nullable GetPropertyRulesBuilderRulesV20230530 rulesV20230530) {

            this.rulesV20230530 = rulesV20230530;
            return this;
        }
        public GetPropertyRulesBuilderResult build() {
            final var _resultValue = new GetPropertyRulesBuilderResult();
            _resultValue.id = id;
            _resultValue.json = json;
            _resultValue.ruleFormat = ruleFormat;
            _resultValue.rulesV20230105 = rulesV20230105;
            _resultValue.rulesV20230530 = rulesV20230530;
            return _resultValue;
        }
    }
}
