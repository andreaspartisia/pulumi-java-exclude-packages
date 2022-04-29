// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetManagedDatabaseSqlTuningAdvisorTaskItem {
    /**
     * @return The number of days left before the task expires. If the value equals -1, then the task has no expiration time (UNLIMITED).
     * 
     */
    private final Integer daysToExpire;
    /**
     * @return The description of the SQL Tuning Advisor task.
     * 
     */
    private final String description;
    /**
     * @return The instance ID of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final Integer instanceId;
    /**
     * @return The optional query parameter to filter the SQL Tuning Advisor task list by name.
     * 
     */
    private final String name;
    /**
     * @return The owner of the SQL Tuning Advisor task.
     * 
     */
    private final String owner;
    /**
     * @return The number of recommendations provided for the SQL Tuning Advisor task.
     * 
     */
    private final Integer recommendationCount;
    /**
     * @return The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String sqlTuningAdvisorTaskId;
    /**
     * @return The status of the SQL Tuning Advisor task.
     * 
     */
    private final String taskStatus;
    /**
     * @return The Creation date of the SQL Tuning Advisor task.
     * 
     */
    private final String timeCreated;
    /**
     * @return The end time of the task execution.
     * 
     */
    private final String timeExecutionEnded;
    /**
     * @return The start time of the task execution.
     * 
     */
    private final String timeExecutionStarted;
    /**
     * @return The total number of SQL statements related to the SQL Tuning Advisor task.
     * 
     */
    private final Integer totalSqlStatements;

    @CustomType.Constructor
    private GetManagedDatabaseSqlTuningAdvisorTaskItem(
        @CustomType.Parameter("daysToExpire") Integer daysToExpire,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("instanceId") Integer instanceId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("recommendationCount") Integer recommendationCount,
        @CustomType.Parameter("sqlTuningAdvisorTaskId") String sqlTuningAdvisorTaskId,
        @CustomType.Parameter("taskStatus") String taskStatus,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeExecutionEnded") String timeExecutionEnded,
        @CustomType.Parameter("timeExecutionStarted") String timeExecutionStarted,
        @CustomType.Parameter("totalSqlStatements") Integer totalSqlStatements) {
        this.daysToExpire = daysToExpire;
        this.description = description;
        this.instanceId = instanceId;
        this.name = name;
        this.owner = owner;
        this.recommendationCount = recommendationCount;
        this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
        this.taskStatus = taskStatus;
        this.timeCreated = timeCreated;
        this.timeExecutionEnded = timeExecutionEnded;
        this.timeExecutionStarted = timeExecutionStarted;
        this.totalSqlStatements = totalSqlStatements;
    }

    /**
     * @return The number of days left before the task expires. If the value equals -1, then the task has no expiration time (UNLIMITED).
     * 
     */
    public Integer daysToExpire() {
        return this.daysToExpire;
    }
    /**
     * @return The description of the SQL Tuning Advisor task.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The instance ID of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Integer instanceId() {
        return this.instanceId;
    }
    /**
     * @return The optional query parameter to filter the SQL Tuning Advisor task list by name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The owner of the SQL Tuning Advisor task.
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return The number of recommendations provided for the SQL Tuning Advisor task.
     * 
     */
    public Integer recommendationCount() {
        return this.recommendationCount;
    }
    /**
     * @return The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String sqlTuningAdvisorTaskId() {
        return this.sqlTuningAdvisorTaskId;
    }
    /**
     * @return The status of the SQL Tuning Advisor task.
     * 
     */
    public String taskStatus() {
        return this.taskStatus;
    }
    /**
     * @return The Creation date of the SQL Tuning Advisor task.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The end time of the task execution.
     * 
     */
    public String timeExecutionEnded() {
        return this.timeExecutionEnded;
    }
    /**
     * @return The start time of the task execution.
     * 
     */
    public String timeExecutionStarted() {
        return this.timeExecutionStarted;
    }
    /**
     * @return The total number of SQL statements related to the SQL Tuning Advisor task.
     * 
     */
    public Integer totalSqlStatements() {
        return this.totalSqlStatements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseSqlTuningAdvisorTaskItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer daysToExpire;
        private String description;
        private Integer instanceId;
        private String name;
        private String owner;
        private Integer recommendationCount;
        private String sqlTuningAdvisorTaskId;
        private String taskStatus;
        private String timeCreated;
        private String timeExecutionEnded;
        private String timeExecutionStarted;
        private Integer totalSqlStatements;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseSqlTuningAdvisorTaskItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysToExpire = defaults.daysToExpire;
    	      this.description = defaults.description;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.recommendationCount = defaults.recommendationCount;
    	      this.sqlTuningAdvisorTaskId = defaults.sqlTuningAdvisorTaskId;
    	      this.taskStatus = defaults.taskStatus;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeExecutionEnded = defaults.timeExecutionEnded;
    	      this.timeExecutionStarted = defaults.timeExecutionStarted;
    	      this.totalSqlStatements = defaults.totalSqlStatements;
        }

        public Builder daysToExpire(Integer daysToExpire) {
            this.daysToExpire = Objects.requireNonNull(daysToExpire);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder instanceId(Integer instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder recommendationCount(Integer recommendationCount) {
            this.recommendationCount = Objects.requireNonNull(recommendationCount);
            return this;
        }
        public Builder sqlTuningAdvisorTaskId(String sqlTuningAdvisorTaskId) {
            this.sqlTuningAdvisorTaskId = Objects.requireNonNull(sqlTuningAdvisorTaskId);
            return this;
        }
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = Objects.requireNonNull(taskStatus);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeExecutionEnded(String timeExecutionEnded) {
            this.timeExecutionEnded = Objects.requireNonNull(timeExecutionEnded);
            return this;
        }
        public Builder timeExecutionStarted(String timeExecutionStarted) {
            this.timeExecutionStarted = Objects.requireNonNull(timeExecutionStarted);
            return this;
        }
        public Builder totalSqlStatements(Integer totalSqlStatements) {
            this.totalSqlStatements = Objects.requireNonNull(totalSqlStatements);
            return this;
        }        public GetManagedDatabaseSqlTuningAdvisorTaskItem build() {
            return new GetManagedDatabaseSqlTuningAdvisorTaskItem(daysToExpire, description, instanceId, name, owner, recommendationCount, sqlTuningAdvisorTaskId, taskStatus, timeCreated, timeExecutionEnded, timeExecutionStarted, totalSqlStatements);
        }
    }
}
