// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOrigin {
    private String hostname;
    private String originId;
    private Integer propertyId;

    private GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOrigin() {}
    public String hostname() {
        return this.hostname;
    }
    public String originId() {
        return this.originId;
    }
    public Integer propertyId() {
        return this.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOrigin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private String originId;
        private Integer propertyId;
        public Builder() {}
        public Builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.originId = defaults.originId;
    	      this.propertyId = defaults.propertyId;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOrigin", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder originId(String originId) {
            if (originId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOrigin", "originId");
            }
            this.originId = originId;
            return this;
        }
        @CustomType.Setter
        public Builder propertyId(Integer propertyId) {
            if (propertyId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOrigin", "propertyId");
            }
            this.propertyId = propertyId;
            return this;
        }
        public GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOrigin build() {
            final var _resultValue = new GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOrigin();
            _resultValue.hostname = hostname;
            _resultValue.originId = originId;
            _resultValue.propertyId = propertyId;
            return _resultValue;
        }
    }
}
