// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DatabaseManagement.outputs.GetManagedDatabaseManagedDatabaseGroup;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetManagedDatabaseResult {
    /**
     * @return The additional details specific to a type of database defined in `{&#34;key&#34;: &#34;value&#34;}` format. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> additionalDetails;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the Managed Database Group resides.
     * 
     */
    private final String compartmentId;
    /**
     * @return The status of the Oracle Database. Indicates whether the status of the database is UP, DOWN, or UNKNOWN at the current time.
     * 
     */
    private final String databaseStatus;
    /**
     * @return The subtype of the Oracle Database. Indicates whether the database is a Container Database, Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
     * 
     */
    private final String databaseSubType;
    /**
     * @return The type of Oracle Database installation.
     * 
     */
    private final String databaseType;
    /**
     * @return The infrastructure used to deploy the Oracle Database.
     * 
     */
    private final String deploymentType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Indicates whether the Oracle Database is part of a cluster.
     * 
     */
    private final Boolean isCluster;
    /**
     * @return A list of Managed Database Groups that the Managed Database belongs to.
     * 
     */
    private final List<GetManagedDatabaseManagedDatabaseGroup> managedDatabaseGroups;
    private final String managedDatabaseId;
    /**
     * @return The management option used when enabling Database Management.
     * 
     */
    private final String managementOption;
    /**
     * @return The name of the Managed Database.
     * 
     */
    private final String name;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent Container Database if Managed Database is a Pluggable Database.
     * 
     */
    private final String parentContainerId;
    /**
     * @return The date and time the Managed Database was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The workload type of the Autonomous Database.
     * 
     */
    private final String workloadType;

    @CustomType.Constructor
    private GetManagedDatabaseResult(
        @CustomType.Parameter("additionalDetails") Map<String,Object> additionalDetails,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("databaseStatus") String databaseStatus,
        @CustomType.Parameter("databaseSubType") String databaseSubType,
        @CustomType.Parameter("databaseType") String databaseType,
        @CustomType.Parameter("deploymentType") String deploymentType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isCluster") Boolean isCluster,
        @CustomType.Parameter("managedDatabaseGroups") List<GetManagedDatabaseManagedDatabaseGroup> managedDatabaseGroups,
        @CustomType.Parameter("managedDatabaseId") String managedDatabaseId,
        @CustomType.Parameter("managementOption") String managementOption,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parentContainerId") String parentContainerId,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("workloadType") String workloadType) {
        this.additionalDetails = additionalDetails;
        this.compartmentId = compartmentId;
        this.databaseStatus = databaseStatus;
        this.databaseSubType = databaseSubType;
        this.databaseType = databaseType;
        this.deploymentType = deploymentType;
        this.id = id;
        this.isCluster = isCluster;
        this.managedDatabaseGroups = managedDatabaseGroups;
        this.managedDatabaseId = managedDatabaseId;
        this.managementOption = managementOption;
        this.name = name;
        this.parentContainerId = parentContainerId;
        this.timeCreated = timeCreated;
        this.workloadType = workloadType;
    }

    /**
     * @return The additional details specific to a type of database defined in `{&#34;key&#34;: &#34;value&#34;}` format. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> additionalDetails() {
        return this.additionalDetails;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the Managed Database Group resides.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The status of the Oracle Database. Indicates whether the status of the database is UP, DOWN, or UNKNOWN at the current time.
     * 
     */
    public String databaseStatus() {
        return this.databaseStatus;
    }
    /**
     * @return The subtype of the Oracle Database. Indicates whether the database is a Container Database, Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
     * 
     */
    public String databaseSubType() {
        return this.databaseSubType;
    }
    /**
     * @return The type of Oracle Database installation.
     * 
     */
    public String databaseType() {
        return this.databaseType;
    }
    /**
     * @return The infrastructure used to deploy the Oracle Database.
     * 
     */
    public String deploymentType() {
        return this.deploymentType;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether the Oracle Database is part of a cluster.
     * 
     */
    public Boolean isCluster() {
        return this.isCluster;
    }
    /**
     * @return A list of Managed Database Groups that the Managed Database belongs to.
     * 
     */
    public List<GetManagedDatabaseManagedDatabaseGroup> managedDatabaseGroups() {
        return this.managedDatabaseGroups;
    }
    public String managedDatabaseId() {
        return this.managedDatabaseId;
    }
    /**
     * @return The management option used when enabling Database Management.
     * 
     */
    public String managementOption() {
        return this.managementOption;
    }
    /**
     * @return The name of the Managed Database.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent Container Database if Managed Database is a Pluggable Database.
     * 
     */
    public String parentContainerId() {
        return this.parentContainerId;
    }
    /**
     * @return The date and time the Managed Database was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The workload type of the Autonomous Database.
     * 
     */
    public String workloadType() {
        return this.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> additionalDetails;
        private String compartmentId;
        private String databaseStatus;
        private String databaseSubType;
        private String databaseType;
        private String deploymentType;
        private String id;
        private Boolean isCluster;
        private List<GetManagedDatabaseManagedDatabaseGroup> managedDatabaseGroups;
        private String managedDatabaseId;
        private String managementOption;
        private String name;
        private String parentContainerId;
        private String timeCreated;
        private String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalDetails = defaults.additionalDetails;
    	      this.compartmentId = defaults.compartmentId;
    	      this.databaseStatus = defaults.databaseStatus;
    	      this.databaseSubType = defaults.databaseSubType;
    	      this.databaseType = defaults.databaseType;
    	      this.deploymentType = defaults.deploymentType;
    	      this.id = defaults.id;
    	      this.isCluster = defaults.isCluster;
    	      this.managedDatabaseGroups = defaults.managedDatabaseGroups;
    	      this.managedDatabaseId = defaults.managedDatabaseId;
    	      this.managementOption = defaults.managementOption;
    	      this.name = defaults.name;
    	      this.parentContainerId = defaults.parentContainerId;
    	      this.timeCreated = defaults.timeCreated;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder additionalDetails(Map<String,Object> additionalDetails) {
            this.additionalDetails = Objects.requireNonNull(additionalDetails);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder databaseStatus(String databaseStatus) {
            this.databaseStatus = Objects.requireNonNull(databaseStatus);
            return this;
        }
        public Builder databaseSubType(String databaseSubType) {
            this.databaseSubType = Objects.requireNonNull(databaseSubType);
            return this;
        }
        public Builder databaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }
        public Builder deploymentType(String deploymentType) {
            this.deploymentType = Objects.requireNonNull(deploymentType);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isCluster(Boolean isCluster) {
            this.isCluster = Objects.requireNonNull(isCluster);
            return this;
        }
        public Builder managedDatabaseGroups(List<GetManagedDatabaseManagedDatabaseGroup> managedDatabaseGroups) {
            this.managedDatabaseGroups = Objects.requireNonNull(managedDatabaseGroups);
            return this;
        }
        public Builder managedDatabaseGroups(GetManagedDatabaseManagedDatabaseGroup... managedDatabaseGroups) {
            return managedDatabaseGroups(List.of(managedDatabaseGroups));
        }
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = Objects.requireNonNull(managedDatabaseId);
            return this;
        }
        public Builder managementOption(String managementOption) {
            this.managementOption = Objects.requireNonNull(managementOption);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parentContainerId(String parentContainerId) {
            this.parentContainerId = Objects.requireNonNull(parentContainerId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder workloadType(String workloadType) {
            this.workloadType = Objects.requireNonNull(workloadType);
            return this;
        }        public GetManagedDatabaseResult build() {
            return new GetManagedDatabaseResult(additionalDetails, compartmentId, databaseStatus, databaseSubType, databaseType, deploymentType, id, isCluster, managedDatabaseGroups, managedDatabaseId, managementOption, name, parentContainerId, timeCreated, workloadType);
        }
    }
}
