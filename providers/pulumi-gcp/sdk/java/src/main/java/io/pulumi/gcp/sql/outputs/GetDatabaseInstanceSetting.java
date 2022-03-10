// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingBackupConfiguration;
import io.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingDatabaseFlag;
import io.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingInsightsConfig;
import io.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingIpConfiguration;
import io.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingLocationPreference;
import io.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingMaintenanceWindow;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetDatabaseInstanceSetting {
    private final String activationPolicy;
    private final String availabilityType;
    private final List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations;
    private final String collation;
    private final List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags;
    private final Boolean diskAutoresize;
    private final Integer diskAutoresizeLimit;
    private final Integer diskSize;
    private final String diskType;
    private final List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs;
    private final List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations;
    private final List<GetDatabaseInstanceSettingLocationPreference> locationPreferences;
    private final List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows;
    private final String pricingPlan;
    private final String tier;
    private final Map<String,String> userLabels;
    private final Integer version;

    @OutputCustomType.Constructor
    private GetDatabaseInstanceSetting(
        @OutputCustomType.Parameter("activationPolicy") String activationPolicy,
        @OutputCustomType.Parameter("availabilityType") String availabilityType,
        @OutputCustomType.Parameter("backupConfigurations") List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations,
        @OutputCustomType.Parameter("collation") String collation,
        @OutputCustomType.Parameter("databaseFlags") List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags,
        @OutputCustomType.Parameter("diskAutoresize") Boolean diskAutoresize,
        @OutputCustomType.Parameter("diskAutoresizeLimit") Integer diskAutoresizeLimit,
        @OutputCustomType.Parameter("diskSize") Integer diskSize,
        @OutputCustomType.Parameter("diskType") String diskType,
        @OutputCustomType.Parameter("insightsConfigs") List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs,
        @OutputCustomType.Parameter("ipConfigurations") List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations,
        @OutputCustomType.Parameter("locationPreferences") List<GetDatabaseInstanceSettingLocationPreference> locationPreferences,
        @OutputCustomType.Parameter("maintenanceWindows") List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows,
        @OutputCustomType.Parameter("pricingPlan") String pricingPlan,
        @OutputCustomType.Parameter("tier") String tier,
        @OutputCustomType.Parameter("userLabels") Map<String,String> userLabels,
        @OutputCustomType.Parameter("version") Integer version) {
        this.activationPolicy = activationPolicy;
        this.availabilityType = availabilityType;
        this.backupConfigurations = backupConfigurations;
        this.collation = collation;
        this.databaseFlags = databaseFlags;
        this.diskAutoresize = diskAutoresize;
        this.diskAutoresizeLimit = diskAutoresizeLimit;
        this.diskSize = diskSize;
        this.diskType = diskType;
        this.insightsConfigs = insightsConfigs;
        this.ipConfigurations = ipConfigurations;
        this.locationPreferences = locationPreferences;
        this.maintenanceWindows = maintenanceWindows;
        this.pricingPlan = pricingPlan;
        this.tier = tier;
        this.userLabels = userLabels;
        this.version = version;
    }

    public String getActivationPolicy() {
        return this.activationPolicy;
    }
    public String getAvailabilityType() {
        return this.availabilityType;
    }
    public List<GetDatabaseInstanceSettingBackupConfiguration> getBackupConfigurations() {
        return this.backupConfigurations;
    }
    public String getCollation() {
        return this.collation;
    }
    public List<GetDatabaseInstanceSettingDatabaseFlag> getDatabaseFlags() {
        return this.databaseFlags;
    }
    public Boolean getDiskAutoresize() {
        return this.diskAutoresize;
    }
    public Integer getDiskAutoresizeLimit() {
        return this.diskAutoresizeLimit;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }
    public String getDiskType() {
        return this.diskType;
    }
    public List<GetDatabaseInstanceSettingInsightsConfig> getInsightsConfigs() {
        return this.insightsConfigs;
    }
    public List<GetDatabaseInstanceSettingIpConfiguration> getIpConfigurations() {
        return this.ipConfigurations;
    }
    public List<GetDatabaseInstanceSettingLocationPreference> getLocationPreferences() {
        return this.locationPreferences;
    }
    public List<GetDatabaseInstanceSettingMaintenanceWindow> getMaintenanceWindows() {
        return this.maintenanceWindows;
    }
    public String getPricingPlan() {
        return this.pricingPlan;
    }
    public String getTier() {
        return this.tier;
    }
    public Map<String,String> getUserLabels() {
        return this.userLabels;
    }
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activationPolicy;
        private String availabilityType;
        private List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations;
        private String collation;
        private List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags;
        private Boolean diskAutoresize;
        private Integer diskAutoresizeLimit;
        private Integer diskSize;
        private String diskType;
        private List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs;
        private List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations;
        private List<GetDatabaseInstanceSettingLocationPreference> locationPreferences;
        private List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows;
        private String pricingPlan;
        private String tier;
        private Map<String,String> userLabels;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.availabilityType = defaults.availabilityType;
    	      this.backupConfigurations = defaults.backupConfigurations;
    	      this.collation = defaults.collation;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.diskAutoresize = defaults.diskAutoresize;
    	      this.diskAutoresizeLimit = defaults.diskAutoresizeLimit;
    	      this.diskSize = defaults.diskSize;
    	      this.diskType = defaults.diskType;
    	      this.insightsConfigs = defaults.insightsConfigs;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.locationPreferences = defaults.locationPreferences;
    	      this.maintenanceWindows = defaults.maintenanceWindows;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
    	      this.version = defaults.version;
        }

        public Builder setActivationPolicy(String activationPolicy) {
            this.activationPolicy = Objects.requireNonNull(activationPolicy);
            return this;
        }

        public Builder setAvailabilityType(String availabilityType) {
            this.availabilityType = Objects.requireNonNull(availabilityType);
            return this;
        }

        public Builder setBackupConfigurations(List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations) {
            this.backupConfigurations = Objects.requireNonNull(backupConfigurations);
            return this;
        }

        public Builder setCollation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }

        public Builder setDatabaseFlags(List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags) {
            this.databaseFlags = Objects.requireNonNull(databaseFlags);
            return this;
        }

        public Builder setDiskAutoresize(Boolean diskAutoresize) {
            this.diskAutoresize = Objects.requireNonNull(diskAutoresize);
            return this;
        }

        public Builder setDiskAutoresizeLimit(Integer diskAutoresizeLimit) {
            this.diskAutoresizeLimit = Objects.requireNonNull(diskAutoresizeLimit);
            return this;
        }

        public Builder setDiskSize(Integer diskSize) {
            this.diskSize = Objects.requireNonNull(diskSize);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setInsightsConfigs(List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs) {
            this.insightsConfigs = Objects.requireNonNull(insightsConfigs);
            return this;
        }

        public Builder setIpConfigurations(List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }

        public Builder setLocationPreferences(List<GetDatabaseInstanceSettingLocationPreference> locationPreferences) {
            this.locationPreferences = Objects.requireNonNull(locationPreferences);
            return this;
        }

        public Builder setMaintenanceWindows(List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows) {
            this.maintenanceWindows = Objects.requireNonNull(maintenanceWindows);
            return this;
        }

        public Builder setPricingPlan(String pricingPlan) {
            this.pricingPlan = Objects.requireNonNull(pricingPlan);
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setUserLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetDatabaseInstanceSetting build() {
            return new GetDatabaseInstanceSetting(activationPolicy, availabilityType, backupConfigurations, collation, databaseFlags, diskAutoresize, diskAutoresizeLimit, diskSize, diskType, insightsConfigs, ipConfigurations, locationPreferences, maintenanceWindows, pricingPlan, tier, userLabels, version);
        }
    }
}
