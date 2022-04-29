// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.OsManagement.outputs.GetManagedInstanceAutonomouse;
import com.pulumi.oci.OsManagement.outputs.GetManagedInstanceChildSoftwareSource;
import com.pulumi.oci.OsManagement.outputs.GetManagedInstanceManagedInstanceGroup;
import com.pulumi.oci.OsManagement.outputs.GetManagedInstanceParentSoftwareSource;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetManagedInstanceResult {
    /**
     * @return if present, indicates the Managed Instance is an autonomous instance. Holds all the Autonomous specific information
     * 
     */
    private final List<GetManagedInstanceAutonomouse> autonomouses;
    /**
     * @return Number of bug fix type updates available to be installed
     * 
     */
    private final Integer bugUpdatesAvailable;
    /**
     * @return list of child Software Sources attached to the Managed Instance
     * 
     */
    private final List<GetManagedInstanceChildSoftwareSource> childSoftwareSources;
    /**
     * @return OCID for the Compartment
     * 
     */
    private final String compartmentId;
    /**
     * @return Information specified by the user about the managed instance
     * 
     */
    private final String description;
    /**
     * @return User friendly name
     * 
     */
    private final String displayName;
    /**
     * @return Number of enhancement type updates available to be installed
     * 
     */
    private final Integer enhancementUpdatesAvailable;
    /**
     * @return software source identifier
     * 
     */
    private final String id;
    /**
     * @return True if user allow data collection for this instance
     * 
     */
    private final Boolean isDataCollectionAuthorized;
    /**
     * @return Indicates whether a reboot is required to complete installation of updates.
     * 
     */
    private final Boolean isRebootRequired;
    /**
     * @return The ksplice effective kernel version
     * 
     */
    private final String kspliceEffectiveKernelVersion;
    /**
     * @return Time at which the instance last booted
     * 
     */
    private final String lastBoot;
    /**
     * @return Time at which the instance last checked in
     * 
     */
    private final String lastCheckin;
    /**
     * @return The ids of the managed instance groups of which this instance is a member.
     * 
     */
    private final List<GetManagedInstanceManagedInstanceGroup> managedInstanceGroups;
    private final String managedInstanceId;
    /**
     * @return OCID of the ONS topic used to send notification to users
     * 
     */
    private final String notificationTopicId;
    /**
     * @return The Operating System type of the managed instance.
     * 
     */
    private final String osFamily;
    /**
     * @return Operating System Kernel Version
     * 
     */
    private final String osKernelVersion;
    /**
     * @return Operating System Name
     * 
     */
    private final String osName;
    /**
     * @return Operating System Version
     * 
     */
    private final String osVersion;
    /**
     * @return Number of non-classified updates available to be installed
     * 
     */
    private final Integer otherUpdatesAvailable;
    /**
     * @return the parent (base) Software Source attached to the Managed Instance
     * 
     */
    private final List<GetManagedInstanceParentSoftwareSource> parentSoftwareSources;
    /**
     * @return Number of scheduled jobs associated with this instance
     * 
     */
    private final Integer scheduledJobCount;
    /**
     * @return Number of security type updates available to be installed
     * 
     */
    private final Integer securityUpdatesAvailable;
    /**
     * @return status of the managed instance.
     * 
     */
    private final String status;
    /**
     * @return Number of updates available to be installed
     * 
     */
    private final Integer updatesAvailable;
    /**
     * @return Number of work requests associated with this instance
     * 
     */
    private final Integer workRequestCount;

    @CustomType.Constructor
    private GetManagedInstanceResult(
        @CustomType.Parameter("autonomouses") List<GetManagedInstanceAutonomouse> autonomouses,
        @CustomType.Parameter("bugUpdatesAvailable") Integer bugUpdatesAvailable,
        @CustomType.Parameter("childSoftwareSources") List<GetManagedInstanceChildSoftwareSource> childSoftwareSources,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("enhancementUpdatesAvailable") Integer enhancementUpdatesAvailable,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isDataCollectionAuthorized") Boolean isDataCollectionAuthorized,
        @CustomType.Parameter("isRebootRequired") Boolean isRebootRequired,
        @CustomType.Parameter("kspliceEffectiveKernelVersion") String kspliceEffectiveKernelVersion,
        @CustomType.Parameter("lastBoot") String lastBoot,
        @CustomType.Parameter("lastCheckin") String lastCheckin,
        @CustomType.Parameter("managedInstanceGroups") List<GetManagedInstanceManagedInstanceGroup> managedInstanceGroups,
        @CustomType.Parameter("managedInstanceId") String managedInstanceId,
        @CustomType.Parameter("notificationTopicId") String notificationTopicId,
        @CustomType.Parameter("osFamily") String osFamily,
        @CustomType.Parameter("osKernelVersion") String osKernelVersion,
        @CustomType.Parameter("osName") String osName,
        @CustomType.Parameter("osVersion") String osVersion,
        @CustomType.Parameter("otherUpdatesAvailable") Integer otherUpdatesAvailable,
        @CustomType.Parameter("parentSoftwareSources") List<GetManagedInstanceParentSoftwareSource> parentSoftwareSources,
        @CustomType.Parameter("scheduledJobCount") Integer scheduledJobCount,
        @CustomType.Parameter("securityUpdatesAvailable") Integer securityUpdatesAvailable,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("updatesAvailable") Integer updatesAvailable,
        @CustomType.Parameter("workRequestCount") Integer workRequestCount) {
        this.autonomouses = autonomouses;
        this.bugUpdatesAvailable = bugUpdatesAvailable;
        this.childSoftwareSources = childSoftwareSources;
        this.compartmentId = compartmentId;
        this.description = description;
        this.displayName = displayName;
        this.enhancementUpdatesAvailable = enhancementUpdatesAvailable;
        this.id = id;
        this.isDataCollectionAuthorized = isDataCollectionAuthorized;
        this.isRebootRequired = isRebootRequired;
        this.kspliceEffectiveKernelVersion = kspliceEffectiveKernelVersion;
        this.lastBoot = lastBoot;
        this.lastCheckin = lastCheckin;
        this.managedInstanceGroups = managedInstanceGroups;
        this.managedInstanceId = managedInstanceId;
        this.notificationTopicId = notificationTopicId;
        this.osFamily = osFamily;
        this.osKernelVersion = osKernelVersion;
        this.osName = osName;
        this.osVersion = osVersion;
        this.otherUpdatesAvailable = otherUpdatesAvailable;
        this.parentSoftwareSources = parentSoftwareSources;
        this.scheduledJobCount = scheduledJobCount;
        this.securityUpdatesAvailable = securityUpdatesAvailable;
        this.status = status;
        this.updatesAvailable = updatesAvailable;
        this.workRequestCount = workRequestCount;
    }

    /**
     * @return if present, indicates the Managed Instance is an autonomous instance. Holds all the Autonomous specific information
     * 
     */
    public List<GetManagedInstanceAutonomouse> autonomouses() {
        return this.autonomouses;
    }
    /**
     * @return Number of bug fix type updates available to be installed
     * 
     */
    public Integer bugUpdatesAvailable() {
        return this.bugUpdatesAvailable;
    }
    /**
     * @return list of child Software Sources attached to the Managed Instance
     * 
     */
    public List<GetManagedInstanceChildSoftwareSource> childSoftwareSources() {
        return this.childSoftwareSources;
    }
    /**
     * @return OCID for the Compartment
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Information specified by the user about the managed instance
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return User friendly name
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Number of enhancement type updates available to be installed
     * 
     */
    public Integer enhancementUpdatesAvailable() {
        return this.enhancementUpdatesAvailable;
    }
    /**
     * @return software source identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return True if user allow data collection for this instance
     * 
     */
    public Boolean isDataCollectionAuthorized() {
        return this.isDataCollectionAuthorized;
    }
    /**
     * @return Indicates whether a reboot is required to complete installation of updates.
     * 
     */
    public Boolean isRebootRequired() {
        return this.isRebootRequired;
    }
    /**
     * @return The ksplice effective kernel version
     * 
     */
    public String kspliceEffectiveKernelVersion() {
        return this.kspliceEffectiveKernelVersion;
    }
    /**
     * @return Time at which the instance last booted
     * 
     */
    public String lastBoot() {
        return this.lastBoot;
    }
    /**
     * @return Time at which the instance last checked in
     * 
     */
    public String lastCheckin() {
        return this.lastCheckin;
    }
    /**
     * @return The ids of the managed instance groups of which this instance is a member.
     * 
     */
    public List<GetManagedInstanceManagedInstanceGroup> managedInstanceGroups() {
        return this.managedInstanceGroups;
    }
    public String managedInstanceId() {
        return this.managedInstanceId;
    }
    /**
     * @return OCID of the ONS topic used to send notification to users
     * 
     */
    public String notificationTopicId() {
        return this.notificationTopicId;
    }
    /**
     * @return The Operating System type of the managed instance.
     * 
     */
    public String osFamily() {
        return this.osFamily;
    }
    /**
     * @return Operating System Kernel Version
     * 
     */
    public String osKernelVersion() {
        return this.osKernelVersion;
    }
    /**
     * @return Operating System Name
     * 
     */
    public String osName() {
        return this.osName;
    }
    /**
     * @return Operating System Version
     * 
     */
    public String osVersion() {
        return this.osVersion;
    }
    /**
     * @return Number of non-classified updates available to be installed
     * 
     */
    public Integer otherUpdatesAvailable() {
        return this.otherUpdatesAvailable;
    }
    /**
     * @return the parent (base) Software Source attached to the Managed Instance
     * 
     */
    public List<GetManagedInstanceParentSoftwareSource> parentSoftwareSources() {
        return this.parentSoftwareSources;
    }
    /**
     * @return Number of scheduled jobs associated with this instance
     * 
     */
    public Integer scheduledJobCount() {
        return this.scheduledJobCount;
    }
    /**
     * @return Number of security type updates available to be installed
     * 
     */
    public Integer securityUpdatesAvailable() {
        return this.securityUpdatesAvailable;
    }
    /**
     * @return status of the managed instance.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Number of updates available to be installed
     * 
     */
    public Integer updatesAvailable() {
        return this.updatesAvailable;
    }
    /**
     * @return Number of work requests associated with this instance
     * 
     */
    public Integer workRequestCount() {
        return this.workRequestCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetManagedInstanceAutonomouse> autonomouses;
        private Integer bugUpdatesAvailable;
        private List<GetManagedInstanceChildSoftwareSource> childSoftwareSources;
        private String compartmentId;
        private String description;
        private String displayName;
        private Integer enhancementUpdatesAvailable;
        private String id;
        private Boolean isDataCollectionAuthorized;
        private Boolean isRebootRequired;
        private String kspliceEffectiveKernelVersion;
        private String lastBoot;
        private String lastCheckin;
        private List<GetManagedInstanceManagedInstanceGroup> managedInstanceGroups;
        private String managedInstanceId;
        private String notificationTopicId;
        private String osFamily;
        private String osKernelVersion;
        private String osName;
        private String osVersion;
        private Integer otherUpdatesAvailable;
        private List<GetManagedInstanceParentSoftwareSource> parentSoftwareSources;
        private Integer scheduledJobCount;
        private Integer securityUpdatesAvailable;
        private String status;
        private Integer updatesAvailable;
        private Integer workRequestCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autonomouses = defaults.autonomouses;
    	      this.bugUpdatesAvailable = defaults.bugUpdatesAvailable;
    	      this.childSoftwareSources = defaults.childSoftwareSources;
    	      this.compartmentId = defaults.compartmentId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enhancementUpdatesAvailable = defaults.enhancementUpdatesAvailable;
    	      this.id = defaults.id;
    	      this.isDataCollectionAuthorized = defaults.isDataCollectionAuthorized;
    	      this.isRebootRequired = defaults.isRebootRequired;
    	      this.kspliceEffectiveKernelVersion = defaults.kspliceEffectiveKernelVersion;
    	      this.lastBoot = defaults.lastBoot;
    	      this.lastCheckin = defaults.lastCheckin;
    	      this.managedInstanceGroups = defaults.managedInstanceGroups;
    	      this.managedInstanceId = defaults.managedInstanceId;
    	      this.notificationTopicId = defaults.notificationTopicId;
    	      this.osFamily = defaults.osFamily;
    	      this.osKernelVersion = defaults.osKernelVersion;
    	      this.osName = defaults.osName;
    	      this.osVersion = defaults.osVersion;
    	      this.otherUpdatesAvailable = defaults.otherUpdatesAvailable;
    	      this.parentSoftwareSources = defaults.parentSoftwareSources;
    	      this.scheduledJobCount = defaults.scheduledJobCount;
    	      this.securityUpdatesAvailable = defaults.securityUpdatesAvailable;
    	      this.status = defaults.status;
    	      this.updatesAvailable = defaults.updatesAvailable;
    	      this.workRequestCount = defaults.workRequestCount;
        }

        public Builder autonomouses(List<GetManagedInstanceAutonomouse> autonomouses) {
            this.autonomouses = Objects.requireNonNull(autonomouses);
            return this;
        }
        public Builder autonomouses(GetManagedInstanceAutonomouse... autonomouses) {
            return autonomouses(List.of(autonomouses));
        }
        public Builder bugUpdatesAvailable(Integer bugUpdatesAvailable) {
            this.bugUpdatesAvailable = Objects.requireNonNull(bugUpdatesAvailable);
            return this;
        }
        public Builder childSoftwareSources(List<GetManagedInstanceChildSoftwareSource> childSoftwareSources) {
            this.childSoftwareSources = Objects.requireNonNull(childSoftwareSources);
            return this;
        }
        public Builder childSoftwareSources(GetManagedInstanceChildSoftwareSource... childSoftwareSources) {
            return childSoftwareSources(List.of(childSoftwareSources));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
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
        public Builder enhancementUpdatesAvailable(Integer enhancementUpdatesAvailable) {
            this.enhancementUpdatesAvailable = Objects.requireNonNull(enhancementUpdatesAvailable);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isDataCollectionAuthorized(Boolean isDataCollectionAuthorized) {
            this.isDataCollectionAuthorized = Objects.requireNonNull(isDataCollectionAuthorized);
            return this;
        }
        public Builder isRebootRequired(Boolean isRebootRequired) {
            this.isRebootRequired = Objects.requireNonNull(isRebootRequired);
            return this;
        }
        public Builder kspliceEffectiveKernelVersion(String kspliceEffectiveKernelVersion) {
            this.kspliceEffectiveKernelVersion = Objects.requireNonNull(kspliceEffectiveKernelVersion);
            return this;
        }
        public Builder lastBoot(String lastBoot) {
            this.lastBoot = Objects.requireNonNull(lastBoot);
            return this;
        }
        public Builder lastCheckin(String lastCheckin) {
            this.lastCheckin = Objects.requireNonNull(lastCheckin);
            return this;
        }
        public Builder managedInstanceGroups(List<GetManagedInstanceManagedInstanceGroup> managedInstanceGroups) {
            this.managedInstanceGroups = Objects.requireNonNull(managedInstanceGroups);
            return this;
        }
        public Builder managedInstanceGroups(GetManagedInstanceManagedInstanceGroup... managedInstanceGroups) {
            return managedInstanceGroups(List.of(managedInstanceGroups));
        }
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = Objects.requireNonNull(managedInstanceId);
            return this;
        }
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = Objects.requireNonNull(notificationTopicId);
            return this;
        }
        public Builder osFamily(String osFamily) {
            this.osFamily = Objects.requireNonNull(osFamily);
            return this;
        }
        public Builder osKernelVersion(String osKernelVersion) {
            this.osKernelVersion = Objects.requireNonNull(osKernelVersion);
            return this;
        }
        public Builder osName(String osName) {
            this.osName = Objects.requireNonNull(osName);
            return this;
        }
        public Builder osVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }
        public Builder otherUpdatesAvailable(Integer otherUpdatesAvailable) {
            this.otherUpdatesAvailable = Objects.requireNonNull(otherUpdatesAvailable);
            return this;
        }
        public Builder parentSoftwareSources(List<GetManagedInstanceParentSoftwareSource> parentSoftwareSources) {
            this.parentSoftwareSources = Objects.requireNonNull(parentSoftwareSources);
            return this;
        }
        public Builder parentSoftwareSources(GetManagedInstanceParentSoftwareSource... parentSoftwareSources) {
            return parentSoftwareSources(List.of(parentSoftwareSources));
        }
        public Builder scheduledJobCount(Integer scheduledJobCount) {
            this.scheduledJobCount = Objects.requireNonNull(scheduledJobCount);
            return this;
        }
        public Builder securityUpdatesAvailable(Integer securityUpdatesAvailable) {
            this.securityUpdatesAvailable = Objects.requireNonNull(securityUpdatesAvailable);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder updatesAvailable(Integer updatesAvailable) {
            this.updatesAvailable = Objects.requireNonNull(updatesAvailable);
            return this;
        }
        public Builder workRequestCount(Integer workRequestCount) {
            this.workRequestCount = Objects.requireNonNull(workRequestCount);
            return this;
        }        public GetManagedInstanceResult build() {
            return new GetManagedInstanceResult(autonomouses, bugUpdatesAvailable, childSoftwareSources, compartmentId, description, displayName, enhancementUpdatesAvailable, id, isDataCollectionAuthorized, isRebootRequired, kspliceEffectiveKernelVersion, lastBoot, lastCheckin, managedInstanceGroups, managedInstanceId, notificationTopicId, osFamily, osKernelVersion, osName, osVersion, otherUpdatesAvailable, parentSoftwareSources, scheduledJobCount, securityUpdatesAvailable, status, updatesAvailable, workRequestCount);
        }
    }
}
