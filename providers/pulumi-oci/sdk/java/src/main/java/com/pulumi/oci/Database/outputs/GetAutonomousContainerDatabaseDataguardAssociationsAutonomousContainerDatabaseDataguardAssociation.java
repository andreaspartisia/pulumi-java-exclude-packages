// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAutonomousContainerDatabaseDataguardAssociationsAutonomousContainerDatabaseDataguardAssociation {
    /**
     * @return The lag time between updates to the primary Autonomous Container Database and application of the redo data on the standby Autonomous Container Database, as computed by the reporting database.  Example: `9 seconds`
     * 
     */
    private final String applyLag;
    /**
     * @return The rate at which redo logs are synchronized between the associated Autonomous Container Databases.  Example: `180 Mb per second`
     * 
     */
    private final String applyRate;
    private final String autonomousContainerDatabaseDataguardAssociationId;
    /**
     * @return The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String autonomousContainerDatabaseId;
    /**
     * @return The OCID of the Autonomous Data Guard created for a given Autonomous Container Database.
     * 
     */
    private final String id;
    /**
     * @return Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     * 
     */
    private final Boolean isAutomaticFailoverEnabled;
    /**
     * @return Additional information about the current lifecycleState, if available.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The OCID of the peer Autonomous Container Database-Autonomous Data Guard association.
     * 
     */
    private final String peerAutonomousContainerDatabaseDataguardAssociationId;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer Autonomous Container Database.
     * 
     */
    private final String peerAutonomousContainerDatabaseId;
    /**
     * @return The current state of Autonomous Data Guard.
     * 
     */
    private final String peerLifecycleState;
    /**
     * @return The Data Guard role of the Autonomous Container Database or Autonomous Database, if Autonomous Data Guard is enabled.
     * 
     */
    private final String peerRole;
    /**
     * @return The protection mode of this Autonomous Data Guard association. For more information, see [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000) in the Oracle Data Guard documentation.
     * 
     */
    private final String protectionMode;
    /**
     * @return The Data Guard role of the Autonomous Container Database or Autonomous Database, if Autonomous Data Guard is enabled.
     * 
     */
    private final String role;
    /**
     * @return The current state of Autonomous Data Guard.
     * 
     */
    private final String state;
    /**
     * @return The date and time the Autonomous DataGuard association was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time when the last role change action happened.
     * 
     */
    private final String timeLastRoleChanged;
    /**
     * @return The date and time of the last update to the apply lag, apply rate, and transport lag values.
     * 
     */
    private final String timeLastSynced;
    /**
     * @return The approximate number of seconds of redo data not yet available on the standby Autonomous Container Database, as computed by the reporting database.  Example: `7 seconds`
     * 
     */
    private final String transportLag;

    @CustomType.Constructor
    private GetAutonomousContainerDatabaseDataguardAssociationsAutonomousContainerDatabaseDataguardAssociation(
        @CustomType.Parameter("applyLag") String applyLag,
        @CustomType.Parameter("applyRate") String applyRate,
        @CustomType.Parameter("autonomousContainerDatabaseDataguardAssociationId") String autonomousContainerDatabaseDataguardAssociationId,
        @CustomType.Parameter("autonomousContainerDatabaseId") String autonomousContainerDatabaseId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isAutomaticFailoverEnabled") Boolean isAutomaticFailoverEnabled,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("peerAutonomousContainerDatabaseDataguardAssociationId") String peerAutonomousContainerDatabaseDataguardAssociationId,
        @CustomType.Parameter("peerAutonomousContainerDatabaseId") String peerAutonomousContainerDatabaseId,
        @CustomType.Parameter("peerLifecycleState") String peerLifecycleState,
        @CustomType.Parameter("peerRole") String peerRole,
        @CustomType.Parameter("protectionMode") String protectionMode,
        @CustomType.Parameter("role") String role,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeLastRoleChanged") String timeLastRoleChanged,
        @CustomType.Parameter("timeLastSynced") String timeLastSynced,
        @CustomType.Parameter("transportLag") String transportLag) {
        this.applyLag = applyLag;
        this.applyRate = applyRate;
        this.autonomousContainerDatabaseDataguardAssociationId = autonomousContainerDatabaseDataguardAssociationId;
        this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
        this.id = id;
        this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
        this.lifecycleDetails = lifecycleDetails;
        this.peerAutonomousContainerDatabaseDataguardAssociationId = peerAutonomousContainerDatabaseDataguardAssociationId;
        this.peerAutonomousContainerDatabaseId = peerAutonomousContainerDatabaseId;
        this.peerLifecycleState = peerLifecycleState;
        this.peerRole = peerRole;
        this.protectionMode = protectionMode;
        this.role = role;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeLastRoleChanged = timeLastRoleChanged;
        this.timeLastSynced = timeLastSynced;
        this.transportLag = transportLag;
    }

    /**
     * @return The lag time between updates to the primary Autonomous Container Database and application of the redo data on the standby Autonomous Container Database, as computed by the reporting database.  Example: `9 seconds`
     * 
     */
    public String applyLag() {
        return this.applyLag;
    }
    /**
     * @return The rate at which redo logs are synchronized between the associated Autonomous Container Databases.  Example: `180 Mb per second`
     * 
     */
    public String applyRate() {
        return this.applyRate;
    }
    public String autonomousContainerDatabaseDataguardAssociationId() {
        return this.autonomousContainerDatabaseDataguardAssociationId;
    }
    /**
     * @return The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String autonomousContainerDatabaseId() {
        return this.autonomousContainerDatabaseId;
    }
    /**
     * @return The OCID of the Autonomous Data Guard created for a given Autonomous Container Database.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     * 
     */
    public Boolean isAutomaticFailoverEnabled() {
        return this.isAutomaticFailoverEnabled;
    }
    /**
     * @return Additional information about the current lifecycleState, if available.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return The OCID of the peer Autonomous Container Database-Autonomous Data Guard association.
     * 
     */
    public String peerAutonomousContainerDatabaseDataguardAssociationId() {
        return this.peerAutonomousContainerDatabaseDataguardAssociationId;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer Autonomous Container Database.
     * 
     */
    public String peerAutonomousContainerDatabaseId() {
        return this.peerAutonomousContainerDatabaseId;
    }
    /**
     * @return The current state of Autonomous Data Guard.
     * 
     */
    public String peerLifecycleState() {
        return this.peerLifecycleState;
    }
    /**
     * @return The Data Guard role of the Autonomous Container Database or Autonomous Database, if Autonomous Data Guard is enabled.
     * 
     */
    public String peerRole() {
        return this.peerRole;
    }
    /**
     * @return The protection mode of this Autonomous Data Guard association. For more information, see [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000) in the Oracle Data Guard documentation.
     * 
     */
    public String protectionMode() {
        return this.protectionMode;
    }
    /**
     * @return The Data Guard role of the Autonomous Container Database or Autonomous Database, if Autonomous Data Guard is enabled.
     * 
     */
    public String role() {
        return this.role;
    }
    /**
     * @return The current state of Autonomous Data Guard.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the Autonomous DataGuard association was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time when the last role change action happened.
     * 
     */
    public String timeLastRoleChanged() {
        return this.timeLastRoleChanged;
    }
    /**
     * @return The date and time of the last update to the apply lag, apply rate, and transport lag values.
     * 
     */
    public String timeLastSynced() {
        return this.timeLastSynced;
    }
    /**
     * @return The approximate number of seconds of redo data not yet available on the standby Autonomous Container Database, as computed by the reporting database.  Example: `7 seconds`
     * 
     */
    public String transportLag() {
        return this.transportLag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousContainerDatabaseDataguardAssociationsAutonomousContainerDatabaseDataguardAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applyLag;
        private String applyRate;
        private String autonomousContainerDatabaseDataguardAssociationId;
        private String autonomousContainerDatabaseId;
        private String id;
        private Boolean isAutomaticFailoverEnabled;
        private String lifecycleDetails;
        private String peerAutonomousContainerDatabaseDataguardAssociationId;
        private String peerAutonomousContainerDatabaseId;
        private String peerLifecycleState;
        private String peerRole;
        private String protectionMode;
        private String role;
        private String state;
        private String timeCreated;
        private String timeLastRoleChanged;
        private String timeLastSynced;
        private String transportLag;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutonomousContainerDatabaseDataguardAssociationsAutonomousContainerDatabaseDataguardAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyLag = defaults.applyLag;
    	      this.applyRate = defaults.applyRate;
    	      this.autonomousContainerDatabaseDataguardAssociationId = defaults.autonomousContainerDatabaseDataguardAssociationId;
    	      this.autonomousContainerDatabaseId = defaults.autonomousContainerDatabaseId;
    	      this.id = defaults.id;
    	      this.isAutomaticFailoverEnabled = defaults.isAutomaticFailoverEnabled;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.peerAutonomousContainerDatabaseDataguardAssociationId = defaults.peerAutonomousContainerDatabaseDataguardAssociationId;
    	      this.peerAutonomousContainerDatabaseId = defaults.peerAutonomousContainerDatabaseId;
    	      this.peerLifecycleState = defaults.peerLifecycleState;
    	      this.peerRole = defaults.peerRole;
    	      this.protectionMode = defaults.protectionMode;
    	      this.role = defaults.role;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeLastRoleChanged = defaults.timeLastRoleChanged;
    	      this.timeLastSynced = defaults.timeLastSynced;
    	      this.transportLag = defaults.transportLag;
        }

        public Builder applyLag(String applyLag) {
            this.applyLag = Objects.requireNonNull(applyLag);
            return this;
        }
        public Builder applyRate(String applyRate) {
            this.applyRate = Objects.requireNonNull(applyRate);
            return this;
        }
        public Builder autonomousContainerDatabaseDataguardAssociationId(String autonomousContainerDatabaseDataguardAssociationId) {
            this.autonomousContainerDatabaseDataguardAssociationId = Objects.requireNonNull(autonomousContainerDatabaseDataguardAssociationId);
            return this;
        }
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = Objects.requireNonNull(autonomousContainerDatabaseId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isAutomaticFailoverEnabled(Boolean isAutomaticFailoverEnabled) {
            this.isAutomaticFailoverEnabled = Objects.requireNonNull(isAutomaticFailoverEnabled);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder peerAutonomousContainerDatabaseDataguardAssociationId(String peerAutonomousContainerDatabaseDataguardAssociationId) {
            this.peerAutonomousContainerDatabaseDataguardAssociationId = Objects.requireNonNull(peerAutonomousContainerDatabaseDataguardAssociationId);
            return this;
        }
        public Builder peerAutonomousContainerDatabaseId(String peerAutonomousContainerDatabaseId) {
            this.peerAutonomousContainerDatabaseId = Objects.requireNonNull(peerAutonomousContainerDatabaseId);
            return this;
        }
        public Builder peerLifecycleState(String peerLifecycleState) {
            this.peerLifecycleState = Objects.requireNonNull(peerLifecycleState);
            return this;
        }
        public Builder peerRole(String peerRole) {
            this.peerRole = Objects.requireNonNull(peerRole);
            return this;
        }
        public Builder protectionMode(String protectionMode) {
            this.protectionMode = Objects.requireNonNull(protectionMode);
            return this;
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeLastRoleChanged(String timeLastRoleChanged) {
            this.timeLastRoleChanged = Objects.requireNonNull(timeLastRoleChanged);
            return this;
        }
        public Builder timeLastSynced(String timeLastSynced) {
            this.timeLastSynced = Objects.requireNonNull(timeLastSynced);
            return this;
        }
        public Builder transportLag(String transportLag) {
            this.transportLag = Objects.requireNonNull(transportLag);
            return this;
        }        public GetAutonomousContainerDatabaseDataguardAssociationsAutonomousContainerDatabaseDataguardAssociation build() {
            return new GetAutonomousContainerDatabaseDataguardAssociationsAutonomousContainerDatabaseDataguardAssociation(applyLag, applyRate, autonomousContainerDatabaseDataguardAssociationId, autonomousContainerDatabaseId, id, isAutomaticFailoverEnabled, lifecycleDetails, peerAutonomousContainerDatabaseDataguardAssociationId, peerAutonomousContainerDatabaseId, peerLifecycleState, peerRole, protectionMode, role, state, timeCreated, timeLastRoleChanged, timeLastSynced, transportLag);
        }
    }
}
