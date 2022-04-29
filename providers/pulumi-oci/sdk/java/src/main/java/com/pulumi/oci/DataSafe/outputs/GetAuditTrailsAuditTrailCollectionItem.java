// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAuditTrailsAuditTrailCollectionItem {
    /**
     * @return The date from which the audit trail must start collecting data, in the format defined by RFC3339.
     * 
     */
    private final String auditCollectionStartTime;
    /**
     * @return The OCID of the  parent audit.
     * 
     */
    private final String auditProfileId;
    /**
     * @return A optional filter to return only resources that match the specified id.
     * 
     */
    private final String auditTrailId;
    /**
     * @return A filter to return only resources that match the specified compartment OCID.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The description of the audit trail.
     * 
     */
    private final String description;
    /**
     * @return A filter to return only resources that match the specified display name.
     * 
     */
    private final String displayName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the audit trail.
     * 
     */
    private final String id;
    /**
     * @return Indicates if auto purge is enabled on the target database, which helps delete audit data in the target database every seven days so that the database&#39;s audit trail does not become too large.
     * 
     */
    private final Boolean isAutoPurgeEnabled;
    /**
     * @return Details about the current state of the audit trail in Data Safe.
     * 
     */
    private final String lifecycleDetails;
    private final Integer resumeTrigger;
    /**
     * @return A optional filter to return only resources that match the specified lifecycle state.
     * 
     */
    private final String state;
    /**
     * @return A optional filter to return only resources that match the specified sub-state of audit trail.
     * 
     */
    private final String status;
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    private final Map<String,Object> systemTags;
    /**
     * @return A filter to return only items related to a specific target OCID.
     * 
     */
    private final String targetId;
    /**
     * @return The date and time the audit trail was created, in the format defined by RFC3339.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the audit trail was updated, in the format defined by RFC3339.
     * 
     */
    private final String timeUpdated;
    /**
     * @return An audit trail location represents the source of audit records that provides documentary evidence of the sequence of activities in the target database.
     * 
     */
    private final String trailLocation;
    /**
     * @return The OCID of the workrequest for audit trail which collects audit records.
     * 
     */
    private final String workRequestId;

    @CustomType.Constructor
    private GetAuditTrailsAuditTrailCollectionItem(
        @CustomType.Parameter("auditCollectionStartTime") String auditCollectionStartTime,
        @CustomType.Parameter("auditProfileId") String auditProfileId,
        @CustomType.Parameter("auditTrailId") String auditTrailId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isAutoPurgeEnabled") Boolean isAutoPurgeEnabled,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("resumeTrigger") Integer resumeTrigger,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("systemTags") Map<String,Object> systemTags,
        @CustomType.Parameter("targetId") String targetId,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("trailLocation") String trailLocation,
        @CustomType.Parameter("workRequestId") String workRequestId) {
        this.auditCollectionStartTime = auditCollectionStartTime;
        this.auditProfileId = auditProfileId;
        this.auditTrailId = auditTrailId;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isAutoPurgeEnabled = isAutoPurgeEnabled;
        this.lifecycleDetails = lifecycleDetails;
        this.resumeTrigger = resumeTrigger;
        this.state = state;
        this.status = status;
        this.systemTags = systemTags;
        this.targetId = targetId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.trailLocation = trailLocation;
        this.workRequestId = workRequestId;
    }

    /**
     * @return The date from which the audit trail must start collecting data, in the format defined by RFC3339.
     * 
     */
    public String auditCollectionStartTime() {
        return this.auditCollectionStartTime;
    }
    /**
     * @return The OCID of the  parent audit.
     * 
     */
    public String auditProfileId() {
        return this.auditProfileId;
    }
    /**
     * @return A optional filter to return only resources that match the specified id.
     * 
     */
    public String auditTrailId() {
        return this.auditTrailId;
    }
    /**
     * @return A filter to return only resources that match the specified compartment OCID.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The description of the audit trail.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A filter to return only resources that match the specified display name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the audit trail.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates if auto purge is enabled on the target database, which helps delete audit data in the target database every seven days so that the database&#39;s audit trail does not become too large.
     * 
     */
    public Boolean isAutoPurgeEnabled() {
        return this.isAutoPurgeEnabled;
    }
    /**
     * @return Details about the current state of the audit trail in Data Safe.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    public Integer resumeTrigger() {
        return this.resumeTrigger;
    }
    /**
     * @return A optional filter to return only resources that match the specified lifecycle state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return A optional filter to return only resources that match the specified sub-state of audit trail.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Map<String,Object> systemTags() {
        return this.systemTags;
    }
    /**
     * @return A filter to return only items related to a specific target OCID.
     * 
     */
    public String targetId() {
        return this.targetId;
    }
    /**
     * @return The date and time the audit trail was created, in the format defined by RFC3339.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the audit trail was updated, in the format defined by RFC3339.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return An audit trail location represents the source of audit records that provides documentary evidence of the sequence of activities in the target database.
     * 
     */
    public String trailLocation() {
        return this.trailLocation;
    }
    /**
     * @return The OCID of the workrequest for audit trail which collects audit records.
     * 
     */
    public String workRequestId() {
        return this.workRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuditTrailsAuditTrailCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String auditCollectionStartTime;
        private String auditProfileId;
        private String auditTrailId;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isAutoPurgeEnabled;
        private String lifecycleDetails;
        private Integer resumeTrigger;
        private String state;
        private String status;
        private Map<String,Object> systemTags;
        private String targetId;
        private String timeCreated;
        private String timeUpdated;
        private String trailLocation;
        private String workRequestId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuditTrailsAuditTrailCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditCollectionStartTime = defaults.auditCollectionStartTime;
    	      this.auditProfileId = defaults.auditProfileId;
    	      this.auditTrailId = defaults.auditTrailId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isAutoPurgeEnabled = defaults.isAutoPurgeEnabled;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.resumeTrigger = defaults.resumeTrigger;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.systemTags = defaults.systemTags;
    	      this.targetId = defaults.targetId;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.trailLocation = defaults.trailLocation;
    	      this.workRequestId = defaults.workRequestId;
        }

        public Builder auditCollectionStartTime(String auditCollectionStartTime) {
            this.auditCollectionStartTime = Objects.requireNonNull(auditCollectionStartTime);
            return this;
        }
        public Builder auditProfileId(String auditProfileId) {
            this.auditProfileId = Objects.requireNonNull(auditProfileId);
            return this;
        }
        public Builder auditTrailId(String auditTrailId) {
            this.auditTrailId = Objects.requireNonNull(auditTrailId);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
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
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isAutoPurgeEnabled(Boolean isAutoPurgeEnabled) {
            this.isAutoPurgeEnabled = Objects.requireNonNull(isAutoPurgeEnabled);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder resumeTrigger(Integer resumeTrigger) {
            this.resumeTrigger = Objects.requireNonNull(resumeTrigger);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder systemTags(Map<String,Object> systemTags) {
            this.systemTags = Objects.requireNonNull(systemTags);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }
        public Builder trailLocation(String trailLocation) {
            this.trailLocation = Objects.requireNonNull(trailLocation);
            return this;
        }
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = Objects.requireNonNull(workRequestId);
            return this;
        }        public GetAuditTrailsAuditTrailCollectionItem build() {
            return new GetAuditTrailsAuditTrailCollectionItem(auditCollectionStartTime, auditProfileId, auditTrailId, compartmentId, definedTags, description, displayName, freeformTags, id, isAutoPurgeEnabled, lifecycleDetails, resumeTrigger, state, status, systemTags, targetId, timeCreated, timeUpdated, trailLocation, workRequestId);
        }
    }
}
