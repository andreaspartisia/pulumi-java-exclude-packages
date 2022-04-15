// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquerydatatransfer_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.bigquerydatatransfer_v1.outputs.EmailPreferencesResponse;
import io.pulumi.googlenative.bigquerydatatransfer_v1.outputs.ScheduleOptionsResponse;
import io.pulumi.googlenative.bigquerydatatransfer_v1.outputs.UserInfoResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTransferConfigResult {
    /**
     * The number of days to look back to automatically refresh the data. For example, if `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10, today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports the feature. Set the value to 0 to use the default value.
     * 
     */
    private final Integer dataRefreshWindowDays;
    /**
     * Data source id. Cannot be changed once data transfer is created.
     * 
     */
    private final String dataSourceId;
    /**
     * Region in which BigQuery dataset is located.
     * 
     */
    private final String datasetRegion;
    /**
     * The BigQuery target dataset id.
     * 
     */
    private final String destinationDatasetId;
    /**
     * Is this config disabled. When set to true, no runs are scheduled for a given transfer.
     * 
     */
    private final Boolean disabled;
    /**
     * User specified display name for the data transfer.
     * 
     */
    private final String displayName;
    /**
     * Email notifications will be sent according to these preferences to the email address of the user who owns this transfer config.
     * 
     */
    private final EmailPreferencesResponse emailPreferences;
    /**
     * The resource name of the transfer config. Transfer config names have the form `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is usually a uuid, even though it is not guaranteed or required. The name is ignored when creating a transfer config.
     * 
     */
    private final String name;
    /**
     * Next time when data transfer will run.
     * 
     */
    private final String nextRunTime;
    /**
     * Pub/Sub topic where notifications will be sent after transfer runs associated with this transfer config finish. The format for specifying a pubsub topic is: `projects/{project}/topics/{topic}`
     * 
     */
    private final String notificationPubsubTopic;
    /**
     * Information about the user whose credentials are used to transfer data. Populated only for `transferConfigs.get` requests. In case the user information is not available, this field will not be populated.
     * 
     */
    private final UserInfoResponse ownerInfo;
    /**
     * Parameters specific to each data source. For more information see the bq tab in the 'Setting up a data transfer' section for each data source. For example the parameters for Cloud Storage transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    private final Map<String,String> params;
    /**
     * Data transfer schedule. If the data source does not support a custom schedule, this should be empty. If it is empty, the default value for the data source will be used. The specified times are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on the data source; refer to the documentation for your data source.
     * 
     */
    private final String schedule;
    /**
     * Options customizing the data transfer schedule.
     * 
     */
    private final ScheduleOptionsResponse scheduleOptions;
    /**
     * State of the most recently updated transfer run.
     * 
     */
    private final String state;
    /**
     * Data transfer modification time. Ignored by server on input.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetTransferConfigResult(
        @CustomType.Parameter("dataRefreshWindowDays") Integer dataRefreshWindowDays,
        @CustomType.Parameter("dataSourceId") String dataSourceId,
        @CustomType.Parameter("datasetRegion") String datasetRegion,
        @CustomType.Parameter("destinationDatasetId") String destinationDatasetId,
        @CustomType.Parameter("disabled") Boolean disabled,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("emailPreferences") EmailPreferencesResponse emailPreferences,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nextRunTime") String nextRunTime,
        @CustomType.Parameter("notificationPubsubTopic") String notificationPubsubTopic,
        @CustomType.Parameter("ownerInfo") UserInfoResponse ownerInfo,
        @CustomType.Parameter("params") Map<String,String> params,
        @CustomType.Parameter("schedule") String schedule,
        @CustomType.Parameter("scheduleOptions") ScheduleOptionsResponse scheduleOptions,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.dataRefreshWindowDays = dataRefreshWindowDays;
        this.dataSourceId = dataSourceId;
        this.datasetRegion = datasetRegion;
        this.destinationDatasetId = destinationDatasetId;
        this.disabled = disabled;
        this.displayName = displayName;
        this.emailPreferences = emailPreferences;
        this.name = name;
        this.nextRunTime = nextRunTime;
        this.notificationPubsubTopic = notificationPubsubTopic;
        this.ownerInfo = ownerInfo;
        this.params = params;
        this.schedule = schedule;
        this.scheduleOptions = scheduleOptions;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * The number of days to look back to automatically refresh the data. For example, if `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10, today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports the feature. Set the value to 0 to use the default value.
     * 
    */
    public Integer dataRefreshWindowDays() {
        return this.dataRefreshWindowDays;
    }
    /**
     * Data source id. Cannot be changed once data transfer is created.
     * 
    */
    public String dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Region in which BigQuery dataset is located.
     * 
    */
    public String datasetRegion() {
        return this.datasetRegion;
    }
    /**
     * The BigQuery target dataset id.
     * 
    */
    public String destinationDatasetId() {
        return this.destinationDatasetId;
    }
    /**
     * Is this config disabled. When set to true, no runs are scheduled for a given transfer.
     * 
    */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * User specified display name for the data transfer.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Email notifications will be sent according to these preferences to the email address of the user who owns this transfer config.
     * 
    */
    public EmailPreferencesResponse emailPreferences() {
        return this.emailPreferences;
    }
    /**
     * The resource name of the transfer config. Transfer config names have the form `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is usually a uuid, even though it is not guaranteed or required. The name is ignored when creating a transfer config.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Next time when data transfer will run.
     * 
    */
    public String nextRunTime() {
        return this.nextRunTime;
    }
    /**
     * Pub/Sub topic where notifications will be sent after transfer runs associated with this transfer config finish. The format for specifying a pubsub topic is: `projects/{project}/topics/{topic}`
     * 
    */
    public String notificationPubsubTopic() {
        return this.notificationPubsubTopic;
    }
    /**
     * Information about the user whose credentials are used to transfer data. Populated only for `transferConfigs.get` requests. In case the user information is not available, this field will not be populated.
     * 
    */
    public UserInfoResponse ownerInfo() {
        return this.ownerInfo;
    }
    /**
     * Parameters specific to each data source. For more information see the bq tab in the 'Setting up a data transfer' section for each data source. For example the parameters for Cloud Storage transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
    */
    public Map<String,String> params() {
        return this.params;
    }
    /**
     * Data transfer schedule. If the data source does not support a custom schedule, this should be empty. If it is empty, the default value for the data source will be used. The specified times are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on the data source; refer to the documentation for your data source.
     * 
    */
    public String schedule() {
        return this.schedule;
    }
    /**
     * Options customizing the data transfer schedule.
     * 
    */
    public ScheduleOptionsResponse scheduleOptions() {
        return this.scheduleOptions;
    }
    /**
     * State of the most recently updated transfer run.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Data transfer modification time. Ignored by server on input.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransferConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer dataRefreshWindowDays;
        private String dataSourceId;
        private String datasetRegion;
        private String destinationDatasetId;
        private Boolean disabled;
        private String displayName;
        private EmailPreferencesResponse emailPreferences;
        private String name;
        private String nextRunTime;
        private String notificationPubsubTopic;
        private UserInfoResponse ownerInfo;
        private Map<String,String> params;
        private String schedule;
        private ScheduleOptionsResponse scheduleOptions;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransferConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRefreshWindowDays = defaults.dataRefreshWindowDays;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.datasetRegion = defaults.datasetRegion;
    	      this.destinationDatasetId = defaults.destinationDatasetId;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.emailPreferences = defaults.emailPreferences;
    	      this.name = defaults.name;
    	      this.nextRunTime = defaults.nextRunTime;
    	      this.notificationPubsubTopic = defaults.notificationPubsubTopic;
    	      this.ownerInfo = defaults.ownerInfo;
    	      this.params = defaults.params;
    	      this.schedule = defaults.schedule;
    	      this.scheduleOptions = defaults.scheduleOptions;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder dataRefreshWindowDays(Integer dataRefreshWindowDays) {
            this.dataRefreshWindowDays = Objects.requireNonNull(dataRefreshWindowDays);
            return this;
        }
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = Objects.requireNonNull(dataSourceId);
            return this;
        }
        public Builder datasetRegion(String datasetRegion) {
            this.datasetRegion = Objects.requireNonNull(datasetRegion);
            return this;
        }
        public Builder destinationDatasetId(String destinationDatasetId) {
            this.destinationDatasetId = Objects.requireNonNull(destinationDatasetId);
            return this;
        }
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder emailPreferences(EmailPreferencesResponse emailPreferences) {
            this.emailPreferences = Objects.requireNonNull(emailPreferences);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nextRunTime(String nextRunTime) {
            this.nextRunTime = Objects.requireNonNull(nextRunTime);
            return this;
        }
        public Builder notificationPubsubTopic(String notificationPubsubTopic) {
            this.notificationPubsubTopic = Objects.requireNonNull(notificationPubsubTopic);
            return this;
        }
        public Builder ownerInfo(UserInfoResponse ownerInfo) {
            this.ownerInfo = Objects.requireNonNull(ownerInfo);
            return this;
        }
        public Builder params(Map<String,String> params) {
            this.params = Objects.requireNonNull(params);
            return this;
        }
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder scheduleOptions(ScheduleOptionsResponse scheduleOptions) {
            this.scheduleOptions = Objects.requireNonNull(scheduleOptions);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetTransferConfigResult build() {
            return new GetTransferConfigResult(dataRefreshWindowDays, dataSourceId, datasetRegion, destinationDatasetId, disabled, displayName, emailPreferences, name, nextRunTime, notificationPubsubTopic, ownerInfo, params, schedule, scheduleOptions, state, updateTime);
        }
    }
}
