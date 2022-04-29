// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetMaintenanceRunsMaintenanceRunEstimatedPatchingTime;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMaintenanceRunsMaintenanceRun {
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String compartmentId;
    /**
     * @return Extend current custom action timeout between the current database servers during waiting state, from 0 (zero) to 30 minutes.
     * 
     */
    private final Integer currentCustomActionTimeoutInMins;
    /**
     * @return The name of the current infrastruture component that is getting patched.
     * 
     */
    private final String currentPatchingComponent;
    /**
     * @return Determines the amount of time the system will wait before the start of each database server patching operation. Specify a number of minutes, from 15 to 120.
     * 
     */
    private final Integer customActionTimeoutInMins;
    /**
     * @return Description of the maintenance run.
     * 
     */
    private final String description;
    /**
     * @return The user-friendly name for the maintenance run.
     * 
     */
    private final String displayName;
    /**
     * @return The estimated start time of the next infrastruture component patching operation.
     * 
     */
    private final String estimatedComponentPatchingStartTime;
    /**
     * @return The estimated total time required in minutes for all patching operations (database server, storage server, and network switch patching).
     * 
     */
    private final List<GetMaintenanceRunsMaintenanceRunEstimatedPatchingTime> estimatedPatchingTimes;
    /**
     * @return The OCID of the maintenance run.
     * 
     */
    private final String id;
    /**
     * @return If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
     * 
     */
    private final Boolean isCustomActionTimeoutEnabled;
    private final Boolean isEnabled;
    private final Boolean isPatchNowEnabled;
    private final Boolean isResumePatching;
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    private final String lifecycleDetails;
    private final String maintenanceRunId;
    /**
     * @return Maintenance sub-type.
     * 
     */
    private final String maintenanceSubtype;
    /**
     * @return The maintenance type.
     * 
     */
    private final String maintenanceType;
    /**
     * @return Contain the patch failure count.
     * 
     */
    private final Integer patchFailureCount;
    /**
     * @return The unique identifier of the patch. The identifier string includes the patch type, the Oracle Database version, and the patch creation date (using the format YYMMDD). For example, the identifier `ru_patch_19.9.0.0_201030` is used for an RU patch for Oracle Database 19.9.0.0 that was released October 30, 2020.
     * 
     */
    private final String patchId;
    /**
     * @return The time when the patching operation ended.
     * 
     */
    private final String patchingEndTime;
    /**
     * @return Cloud Exadata infrastructure node patching method, either &#34;ROLLING&#34; or &#34;NONROLLING&#34;. Default value is ROLLING.
     * 
     */
    private final String patchingMode;
    /**
     * @return The time when the patching operation started.
     * 
     */
    private final String patchingStartTime;
    /**
     * @return The status of the patching operation.
     * 
     */
    private final String patchingStatus;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association&#39;s peer container database.
     * 
     */
    private final String peerMaintenanceRunId;
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    private final String state;
    /**
     * @return The target software version for the database server patching operation.
     * 
     */
    private final String targetDbServerVersion;
    /**
     * @return The target resource ID.
     * 
     */
    private final String targetResourceId;
    /**
     * @return The type of the target resource. Accepted values are: AUTONOMOUS_CONTAINER_DATABASE, AUTONOMOUS_EXADATA_INFRASTRUCTURE, EXADATA_DB_SYSTEM
     * 
     */
    private final String targetResourceType;
    /**
     * @return The target Cell version that is to be patched to.
     * 
     */
    private final String targetStorageServerVersion;
    /**
     * @return The date and time the maintenance run was completed.
     * 
     */
    private final String timeEnded;
    /**
     * @return The date and time the maintenance run is scheduled to occur.
     * 
     */
    private final String timeScheduled;
    /**
     * @return The date and time the maintenance run starts.
     * 
     */
    private final String timeStarted;

    @CustomType.Constructor
    private GetMaintenanceRunsMaintenanceRun(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("currentCustomActionTimeoutInMins") Integer currentCustomActionTimeoutInMins,
        @CustomType.Parameter("currentPatchingComponent") String currentPatchingComponent,
        @CustomType.Parameter("customActionTimeoutInMins") Integer customActionTimeoutInMins,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("estimatedComponentPatchingStartTime") String estimatedComponentPatchingStartTime,
        @CustomType.Parameter("estimatedPatchingTimes") List<GetMaintenanceRunsMaintenanceRunEstimatedPatchingTime> estimatedPatchingTimes,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isCustomActionTimeoutEnabled") Boolean isCustomActionTimeoutEnabled,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("isPatchNowEnabled") Boolean isPatchNowEnabled,
        @CustomType.Parameter("isResumePatching") Boolean isResumePatching,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("maintenanceRunId") String maintenanceRunId,
        @CustomType.Parameter("maintenanceSubtype") String maintenanceSubtype,
        @CustomType.Parameter("maintenanceType") String maintenanceType,
        @CustomType.Parameter("patchFailureCount") Integer patchFailureCount,
        @CustomType.Parameter("patchId") String patchId,
        @CustomType.Parameter("patchingEndTime") String patchingEndTime,
        @CustomType.Parameter("patchingMode") String patchingMode,
        @CustomType.Parameter("patchingStartTime") String patchingStartTime,
        @CustomType.Parameter("patchingStatus") String patchingStatus,
        @CustomType.Parameter("peerMaintenanceRunId") String peerMaintenanceRunId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("targetDbServerVersion") String targetDbServerVersion,
        @CustomType.Parameter("targetResourceId") String targetResourceId,
        @CustomType.Parameter("targetResourceType") String targetResourceType,
        @CustomType.Parameter("targetStorageServerVersion") String targetStorageServerVersion,
        @CustomType.Parameter("timeEnded") String timeEnded,
        @CustomType.Parameter("timeScheduled") String timeScheduled,
        @CustomType.Parameter("timeStarted") String timeStarted) {
        this.compartmentId = compartmentId;
        this.currentCustomActionTimeoutInMins = currentCustomActionTimeoutInMins;
        this.currentPatchingComponent = currentPatchingComponent;
        this.customActionTimeoutInMins = customActionTimeoutInMins;
        this.description = description;
        this.displayName = displayName;
        this.estimatedComponentPatchingStartTime = estimatedComponentPatchingStartTime;
        this.estimatedPatchingTimes = estimatedPatchingTimes;
        this.id = id;
        this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
        this.isEnabled = isEnabled;
        this.isPatchNowEnabled = isPatchNowEnabled;
        this.isResumePatching = isResumePatching;
        this.lifecycleDetails = lifecycleDetails;
        this.maintenanceRunId = maintenanceRunId;
        this.maintenanceSubtype = maintenanceSubtype;
        this.maintenanceType = maintenanceType;
        this.patchFailureCount = patchFailureCount;
        this.patchId = patchId;
        this.patchingEndTime = patchingEndTime;
        this.patchingMode = patchingMode;
        this.patchingStartTime = patchingStartTime;
        this.patchingStatus = patchingStatus;
        this.peerMaintenanceRunId = peerMaintenanceRunId;
        this.state = state;
        this.targetDbServerVersion = targetDbServerVersion;
        this.targetResourceId = targetResourceId;
        this.targetResourceType = targetResourceType;
        this.targetStorageServerVersion = targetStorageServerVersion;
        this.timeEnded = timeEnded;
        this.timeScheduled = timeScheduled;
        this.timeStarted = timeStarted;
    }

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Extend current custom action timeout between the current database servers during waiting state, from 0 (zero) to 30 minutes.
     * 
     */
    public Integer currentCustomActionTimeoutInMins() {
        return this.currentCustomActionTimeoutInMins;
    }
    /**
     * @return The name of the current infrastruture component that is getting patched.
     * 
     */
    public String currentPatchingComponent() {
        return this.currentPatchingComponent;
    }
    /**
     * @return Determines the amount of time the system will wait before the start of each database server patching operation. Specify a number of minutes, from 15 to 120.
     * 
     */
    public Integer customActionTimeoutInMins() {
        return this.customActionTimeoutInMins;
    }
    /**
     * @return Description of the maintenance run.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The user-friendly name for the maintenance run.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The estimated start time of the next infrastruture component patching operation.
     * 
     */
    public String estimatedComponentPatchingStartTime() {
        return this.estimatedComponentPatchingStartTime;
    }
    /**
     * @return The estimated total time required in minutes for all patching operations (database server, storage server, and network switch patching).
     * 
     */
    public List<GetMaintenanceRunsMaintenanceRunEstimatedPatchingTime> estimatedPatchingTimes() {
        return this.estimatedPatchingTimes;
    }
    /**
     * @return The OCID of the maintenance run.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
     * 
     */
    public Boolean isCustomActionTimeoutEnabled() {
        return this.isCustomActionTimeoutEnabled;
    }
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    public Boolean isPatchNowEnabled() {
        return this.isPatchNowEnabled;
    }
    public Boolean isResumePatching() {
        return this.isResumePatching;
    }
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    public String maintenanceRunId() {
        return this.maintenanceRunId;
    }
    /**
     * @return Maintenance sub-type.
     * 
     */
    public String maintenanceSubtype() {
        return this.maintenanceSubtype;
    }
    /**
     * @return The maintenance type.
     * 
     */
    public String maintenanceType() {
        return this.maintenanceType;
    }
    /**
     * @return Contain the patch failure count.
     * 
     */
    public Integer patchFailureCount() {
        return this.patchFailureCount;
    }
    /**
     * @return The unique identifier of the patch. The identifier string includes the patch type, the Oracle Database version, and the patch creation date (using the format YYMMDD). For example, the identifier `ru_patch_19.9.0.0_201030` is used for an RU patch for Oracle Database 19.9.0.0 that was released October 30, 2020.
     * 
     */
    public String patchId() {
        return this.patchId;
    }
    /**
     * @return The time when the patching operation ended.
     * 
     */
    public String patchingEndTime() {
        return this.patchingEndTime;
    }
    /**
     * @return Cloud Exadata infrastructure node patching method, either &#34;ROLLING&#34; or &#34;NONROLLING&#34;. Default value is ROLLING.
     * 
     */
    public String patchingMode() {
        return this.patchingMode;
    }
    /**
     * @return The time when the patching operation started.
     * 
     */
    public String patchingStartTime() {
        return this.patchingStartTime;
    }
    /**
     * @return The status of the patching operation.
     * 
     */
    public String patchingStatus() {
        return this.patchingStatus;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association&#39;s peer container database.
     * 
     */
    public String peerMaintenanceRunId() {
        return this.peerMaintenanceRunId;
    }
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The target software version for the database server patching operation.
     * 
     */
    public String targetDbServerVersion() {
        return this.targetDbServerVersion;
    }
    /**
     * @return The target resource ID.
     * 
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }
    /**
     * @return The type of the target resource. Accepted values are: AUTONOMOUS_CONTAINER_DATABASE, AUTONOMOUS_EXADATA_INFRASTRUCTURE, EXADATA_DB_SYSTEM
     * 
     */
    public String targetResourceType() {
        return this.targetResourceType;
    }
    /**
     * @return The target Cell version that is to be patched to.
     * 
     */
    public String targetStorageServerVersion() {
        return this.targetStorageServerVersion;
    }
    /**
     * @return The date and time the maintenance run was completed.
     * 
     */
    public String timeEnded() {
        return this.timeEnded;
    }
    /**
     * @return The date and time the maintenance run is scheduled to occur.
     * 
     */
    public String timeScheduled() {
        return this.timeScheduled;
    }
    /**
     * @return The date and time the maintenance run starts.
     * 
     */
    public String timeStarted() {
        return this.timeStarted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaintenanceRunsMaintenanceRun defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Integer currentCustomActionTimeoutInMins;
        private String currentPatchingComponent;
        private Integer customActionTimeoutInMins;
        private String description;
        private String displayName;
        private String estimatedComponentPatchingStartTime;
        private List<GetMaintenanceRunsMaintenanceRunEstimatedPatchingTime> estimatedPatchingTimes;
        private String id;
        private Boolean isCustomActionTimeoutEnabled;
        private Boolean isEnabled;
        private Boolean isPatchNowEnabled;
        private Boolean isResumePatching;
        private String lifecycleDetails;
        private String maintenanceRunId;
        private String maintenanceSubtype;
        private String maintenanceType;
        private Integer patchFailureCount;
        private String patchId;
        private String patchingEndTime;
        private String patchingMode;
        private String patchingStartTime;
        private String patchingStatus;
        private String peerMaintenanceRunId;
        private String state;
        private String targetDbServerVersion;
        private String targetResourceId;
        private String targetResourceType;
        private String targetStorageServerVersion;
        private String timeEnded;
        private String timeScheduled;
        private String timeStarted;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaintenanceRunsMaintenanceRun defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.currentCustomActionTimeoutInMins = defaults.currentCustomActionTimeoutInMins;
    	      this.currentPatchingComponent = defaults.currentPatchingComponent;
    	      this.customActionTimeoutInMins = defaults.customActionTimeoutInMins;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.estimatedComponentPatchingStartTime = defaults.estimatedComponentPatchingStartTime;
    	      this.estimatedPatchingTimes = defaults.estimatedPatchingTimes;
    	      this.id = defaults.id;
    	      this.isCustomActionTimeoutEnabled = defaults.isCustomActionTimeoutEnabled;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isPatchNowEnabled = defaults.isPatchNowEnabled;
    	      this.isResumePatching = defaults.isResumePatching;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.maintenanceRunId = defaults.maintenanceRunId;
    	      this.maintenanceSubtype = defaults.maintenanceSubtype;
    	      this.maintenanceType = defaults.maintenanceType;
    	      this.patchFailureCount = defaults.patchFailureCount;
    	      this.patchId = defaults.patchId;
    	      this.patchingEndTime = defaults.patchingEndTime;
    	      this.patchingMode = defaults.patchingMode;
    	      this.patchingStartTime = defaults.patchingStartTime;
    	      this.patchingStatus = defaults.patchingStatus;
    	      this.peerMaintenanceRunId = defaults.peerMaintenanceRunId;
    	      this.state = defaults.state;
    	      this.targetDbServerVersion = defaults.targetDbServerVersion;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.targetResourceType = defaults.targetResourceType;
    	      this.targetStorageServerVersion = defaults.targetStorageServerVersion;
    	      this.timeEnded = defaults.timeEnded;
    	      this.timeScheduled = defaults.timeScheduled;
    	      this.timeStarted = defaults.timeStarted;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder currentCustomActionTimeoutInMins(Integer currentCustomActionTimeoutInMins) {
            this.currentCustomActionTimeoutInMins = Objects.requireNonNull(currentCustomActionTimeoutInMins);
            return this;
        }
        public Builder currentPatchingComponent(String currentPatchingComponent) {
            this.currentPatchingComponent = Objects.requireNonNull(currentPatchingComponent);
            return this;
        }
        public Builder customActionTimeoutInMins(Integer customActionTimeoutInMins) {
            this.customActionTimeoutInMins = Objects.requireNonNull(customActionTimeoutInMins);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder estimatedComponentPatchingStartTime(String estimatedComponentPatchingStartTime) {
            this.estimatedComponentPatchingStartTime = Objects.requireNonNull(estimatedComponentPatchingStartTime);
            return this;
        }
        public Builder estimatedPatchingTimes(List<GetMaintenanceRunsMaintenanceRunEstimatedPatchingTime> estimatedPatchingTimes) {
            this.estimatedPatchingTimes = Objects.requireNonNull(estimatedPatchingTimes);
            return this;
        }
        public Builder estimatedPatchingTimes(GetMaintenanceRunsMaintenanceRunEstimatedPatchingTime... estimatedPatchingTimes) {
            return estimatedPatchingTimes(List.of(estimatedPatchingTimes));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
            this.isCustomActionTimeoutEnabled = Objects.requireNonNull(isCustomActionTimeoutEnabled);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isPatchNowEnabled(Boolean isPatchNowEnabled) {
            this.isPatchNowEnabled = Objects.requireNonNull(isPatchNowEnabled);
            return this;
        }
        public Builder isResumePatching(Boolean isResumePatching) {
            this.isResumePatching = Objects.requireNonNull(isResumePatching);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder maintenanceRunId(String maintenanceRunId) {
            this.maintenanceRunId = Objects.requireNonNull(maintenanceRunId);
            return this;
        }
        public Builder maintenanceSubtype(String maintenanceSubtype) {
            this.maintenanceSubtype = Objects.requireNonNull(maintenanceSubtype);
            return this;
        }
        public Builder maintenanceType(String maintenanceType) {
            this.maintenanceType = Objects.requireNonNull(maintenanceType);
            return this;
        }
        public Builder patchFailureCount(Integer patchFailureCount) {
            this.patchFailureCount = Objects.requireNonNull(patchFailureCount);
            return this;
        }
        public Builder patchId(String patchId) {
            this.patchId = Objects.requireNonNull(patchId);
            return this;
        }
        public Builder patchingEndTime(String patchingEndTime) {
            this.patchingEndTime = Objects.requireNonNull(patchingEndTime);
            return this;
        }
        public Builder patchingMode(String patchingMode) {
            this.patchingMode = Objects.requireNonNull(patchingMode);
            return this;
        }
        public Builder patchingStartTime(String patchingStartTime) {
            this.patchingStartTime = Objects.requireNonNull(patchingStartTime);
            return this;
        }
        public Builder patchingStatus(String patchingStatus) {
            this.patchingStatus = Objects.requireNonNull(patchingStatus);
            return this;
        }
        public Builder peerMaintenanceRunId(String peerMaintenanceRunId) {
            this.peerMaintenanceRunId = Objects.requireNonNull(peerMaintenanceRunId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder targetDbServerVersion(String targetDbServerVersion) {
            this.targetDbServerVersion = Objects.requireNonNull(targetDbServerVersion);
            return this;
        }
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = Objects.requireNonNull(targetResourceId);
            return this;
        }
        public Builder targetResourceType(String targetResourceType) {
            this.targetResourceType = Objects.requireNonNull(targetResourceType);
            return this;
        }
        public Builder targetStorageServerVersion(String targetStorageServerVersion) {
            this.targetStorageServerVersion = Objects.requireNonNull(targetStorageServerVersion);
            return this;
        }
        public Builder timeEnded(String timeEnded) {
            this.timeEnded = Objects.requireNonNull(timeEnded);
            return this;
        }
        public Builder timeScheduled(String timeScheduled) {
            this.timeScheduled = Objects.requireNonNull(timeScheduled);
            return this;
        }
        public Builder timeStarted(String timeStarted) {
            this.timeStarted = Objects.requireNonNull(timeStarted);
            return this;
        }        public GetMaintenanceRunsMaintenanceRun build() {
            return new GetMaintenanceRunsMaintenanceRun(compartmentId, currentCustomActionTimeoutInMins, currentPatchingComponent, customActionTimeoutInMins, description, displayName, estimatedComponentPatchingStartTime, estimatedPatchingTimes, id, isCustomActionTimeoutEnabled, isEnabled, isPatchNowEnabled, isResumePatching, lifecycleDetails, maintenanceRunId, maintenanceSubtype, maintenanceType, patchFailureCount, patchId, patchingEndTime, patchingMode, patchingStartTime, patchingStatus, peerMaintenanceRunId, state, targetDbServerVersion, targetResourceId, targetResourceType, targetStorageServerVersion, timeEnded, timeScheduled, timeStarted);
        }
    }
}
