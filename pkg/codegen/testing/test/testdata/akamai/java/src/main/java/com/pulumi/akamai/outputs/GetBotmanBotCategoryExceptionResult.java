// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBotmanBotCategoryExceptionResult {
    private Integer configId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;
    private String securityPolicyId;

    private GetBotmanBotCategoryExceptionResult() {}
    public Integer configId() {
        return this.configId;
    }
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
    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotmanBotCategoryExceptionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer configId;
        private String id;
        private String json;
        private String securityPolicyId;
        public Builder() {}
        public Builder(GetBotmanBotCategoryExceptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.securityPolicyId = defaults.securityPolicyId;
        }

        @CustomType.Setter
        public Builder configId(Integer configId) {
            if (configId == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotCategoryExceptionResult", "configId");
            }
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotCategoryExceptionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotCategoryExceptionResult", "json");
            }
            this.json = json;
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyId(String securityPolicyId) {
            if (securityPolicyId == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotCategoryExceptionResult", "securityPolicyId");
            }
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public GetBotmanBotCategoryExceptionResult build() {
            final var _resultValue = new GetBotmanBotCategoryExceptionResult();
            _resultValue.configId = configId;
            _resultValue.id = id;
            _resultValue.json = json;
            _resultValue.securityPolicyId = securityPolicyId;
            return _resultValue;
        }
    }
}
