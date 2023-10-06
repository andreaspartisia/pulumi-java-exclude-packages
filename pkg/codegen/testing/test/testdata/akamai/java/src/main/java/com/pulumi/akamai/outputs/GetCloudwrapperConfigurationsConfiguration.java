// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationsConfigurationLocation;
import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettings;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudwrapperConfigurationsConfiguration {
    private Integer capacityAlertsThreshold;
    private String comments;
    private String configName;
    private String contractId;
    private Integer id;
    private String lastActivatedBy;
    private String lastActivatedDate;
    private String lastUpdatedBy;
    private String lastUpdatedDate;
    private @Nullable List<GetCloudwrapperConfigurationsConfigurationLocation> locations;
    private @Nullable GetCloudwrapperConfigurationsConfigurationMultiCdnSettings multiCdnSettings;
    private List<String> notificationEmails;
    private List<String> propertyIds;
    private Boolean retainIdleObjects;
    private String status;

    private GetCloudwrapperConfigurationsConfiguration() {}
    public Integer capacityAlertsThreshold() {
        return this.capacityAlertsThreshold;
    }
    public String comments() {
        return this.comments;
    }
    public String configName() {
        return this.configName;
    }
    public String contractId() {
        return this.contractId;
    }
    public Integer id() {
        return this.id;
    }
    public String lastActivatedBy() {
        return this.lastActivatedBy;
    }
    public String lastActivatedDate() {
        return this.lastActivatedDate;
    }
    public String lastUpdatedBy() {
        return this.lastUpdatedBy;
    }
    public String lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    public List<GetCloudwrapperConfigurationsConfigurationLocation> locations() {
        return this.locations == null ? List.of() : this.locations;
    }
    public Optional<GetCloudwrapperConfigurationsConfigurationMultiCdnSettings> multiCdnSettings() {
        return Optional.ofNullable(this.multiCdnSettings);
    }
    public List<String> notificationEmails() {
        return this.notificationEmails;
    }
    public List<String> propertyIds() {
        return this.propertyIds;
    }
    public Boolean retainIdleObjects() {
        return this.retainIdleObjects;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperConfigurationsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer capacityAlertsThreshold;
        private String comments;
        private String configName;
        private String contractId;
        private Integer id;
        private String lastActivatedBy;
        private String lastActivatedDate;
        private String lastUpdatedBy;
        private String lastUpdatedDate;
        private @Nullable List<GetCloudwrapperConfigurationsConfigurationLocation> locations;
        private @Nullable GetCloudwrapperConfigurationsConfigurationMultiCdnSettings multiCdnSettings;
        private List<String> notificationEmails;
        private List<String> propertyIds;
        private Boolean retainIdleObjects;
        private String status;
        public Builder() {}
        public Builder(GetCloudwrapperConfigurationsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityAlertsThreshold = defaults.capacityAlertsThreshold;
    	      this.comments = defaults.comments;
    	      this.configName = defaults.configName;
    	      this.contractId = defaults.contractId;
    	      this.id = defaults.id;
    	      this.lastActivatedBy = defaults.lastActivatedBy;
    	      this.lastActivatedDate = defaults.lastActivatedDate;
    	      this.lastUpdatedBy = defaults.lastUpdatedBy;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.locations = defaults.locations;
    	      this.multiCdnSettings = defaults.multiCdnSettings;
    	      this.notificationEmails = defaults.notificationEmails;
    	      this.propertyIds = defaults.propertyIds;
    	      this.retainIdleObjects = defaults.retainIdleObjects;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder capacityAlertsThreshold(Integer capacityAlertsThreshold) {
            if (capacityAlertsThreshold == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "capacityAlertsThreshold");
            }
            this.capacityAlertsThreshold = capacityAlertsThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder comments(String comments) {
            if (comments == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "comments");
            }
            this.comments = comments;
            return this;
        }
        @CustomType.Setter
        public Builder configName(String configName) {
            if (configName == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "configName");
            }
            this.configName = configName;
            return this;
        }
        @CustomType.Setter
        public Builder contractId(String contractId) {
            if (contractId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "contractId");
            }
            this.contractId = contractId;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastActivatedBy(String lastActivatedBy) {
            if (lastActivatedBy == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "lastActivatedBy");
            }
            this.lastActivatedBy = lastActivatedBy;
            return this;
        }
        @CustomType.Setter
        public Builder lastActivatedDate(String lastActivatedDate) {
            if (lastActivatedDate == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "lastActivatedDate");
            }
            this.lastActivatedDate = lastActivatedDate;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdatedBy(String lastUpdatedBy) {
            if (lastUpdatedBy == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "lastUpdatedBy");
            }
            this.lastUpdatedBy = lastUpdatedBy;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdatedDate(String lastUpdatedDate) {
            if (lastUpdatedDate == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "lastUpdatedDate");
            }
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }
        @CustomType.Setter
        public Builder locations(@Nullable List<GetCloudwrapperConfigurationsConfigurationLocation> locations) {

            this.locations = locations;
            return this;
        }
        public Builder locations(GetCloudwrapperConfigurationsConfigurationLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder multiCdnSettings(@Nullable GetCloudwrapperConfigurationsConfigurationMultiCdnSettings multiCdnSettings) {

            this.multiCdnSettings = multiCdnSettings;
            return this;
        }
        @CustomType.Setter
        public Builder notificationEmails(List<String> notificationEmails) {
            if (notificationEmails == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "notificationEmails");
            }
            this.notificationEmails = notificationEmails;
            return this;
        }
        public Builder notificationEmails(String... notificationEmails) {
            return notificationEmails(List.of(notificationEmails));
        }
        @CustomType.Setter
        public Builder propertyIds(List<String> propertyIds) {
            if (propertyIds == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "propertyIds");
            }
            this.propertyIds = propertyIds;
            return this;
        }
        public Builder propertyIds(String... propertyIds) {
            return propertyIds(List.of(propertyIds));
        }
        @CustomType.Setter
        public Builder retainIdleObjects(Boolean retainIdleObjects) {
            if (retainIdleObjects == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "retainIdleObjects");
            }
            this.retainIdleObjects = retainIdleObjects;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfiguration", "status");
            }
            this.status = status;
            return this;
        }
        public GetCloudwrapperConfigurationsConfiguration build() {
            final var _resultValue = new GetCloudwrapperConfigurationsConfiguration();
            _resultValue.capacityAlertsThreshold = capacityAlertsThreshold;
            _resultValue.comments = comments;
            _resultValue.configName = configName;
            _resultValue.contractId = contractId;
            _resultValue.id = id;
            _resultValue.lastActivatedBy = lastActivatedBy;
            _resultValue.lastActivatedDate = lastActivatedDate;
            _resultValue.lastUpdatedBy = lastUpdatedBy;
            _resultValue.lastUpdatedDate = lastUpdatedDate;
            _resultValue.locations = locations;
            _resultValue.multiCdnSettings = multiCdnSettings;
            _resultValue.notificationEmails = notificationEmails;
            _resultValue.propertyIds = propertyIds;
            _resultValue.retainIdleObjects = retainIdleObjects;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
