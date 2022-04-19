// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse Empty = new MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse();

    /**
     * Number of applied deletes
     * 
     */
    @Import(name="cdcDeleteCounter", required=true)
      private final String cdcDeleteCounter;

    public String cdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }

    /**
     * Number of applied inserts
     * 
     */
    @Import(name="cdcInsertCounter", required=true)
      private final String cdcInsertCounter;

    public String cdcInsertCounter() {
        return this.cdcInsertCounter;
    }

    /**
     * Number of applied updates
     * 
     */
    @Import(name="cdcUpdateCounter", required=true)
      private final String cdcUpdateCounter;

    public String cdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }

    /**
     * Number of data errors occurred
     * 
     */
    @Import(name="dataErrorsCounter", required=true)
      private final Double dataErrorsCounter;

    public Double dataErrorsCounter() {
        return this.dataErrorsCounter;
    }

    /**
     * Name of the database
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Full load end time
     * 
     */
    @Import(name="fullLoadEndedOn", required=true)
      private final String fullLoadEndedOn;

    public String fullLoadEndedOn() {
        return this.fullLoadEndedOn;
    }

    /**
     * Estimate to finish full load
     * 
     */
    @Import(name="fullLoadEstFinishTime", required=true)
      private final String fullLoadEstFinishTime;

    public String fullLoadEstFinishTime() {
        return this.fullLoadEstFinishTime;
    }

    /**
     * Full load start time
     * 
     */
    @Import(name="fullLoadStartedOn", required=true)
      private final String fullLoadStartedOn;

    public String fullLoadStartedOn() {
        return this.fullLoadStartedOn;
    }

    /**
     * Number of rows applied in full load
     * 
     */
    @Import(name="fullLoadTotalRows", required=true)
      private final Double fullLoadTotalRows;

    public Double fullLoadTotalRows() {
        return this.fullLoadTotalRows;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Last modified time on target
     * 
     */
    @Import(name="lastModifiedTime", required=true)
      private final String lastModifiedTime;

    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Result type
     * Expected value is 'TableLevelOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String resultType() {
        return this.resultType;
    }

    /**
     * Current state of the table migration
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * Name of the table
     * 
     */
    @Import(name="tableName", required=true)
      private final String tableName;

    public String tableName() {
        return this.tableName;
    }

    /**
     * Total number of applied changes
     * 
     */
    @Import(name="totalChangesApplied", required=true)
      private final Double totalChangesApplied;

    public Double totalChangesApplied() {
        return this.totalChangesApplied;
    }

    public MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse(
        String cdcDeleteCounter,
        String cdcInsertCounter,
        String cdcUpdateCounter,
        Double dataErrorsCounter,
        String databaseName,
        String fullLoadEndedOn,
        String fullLoadEstFinishTime,
        String fullLoadStartedOn,
        Double fullLoadTotalRows,
        String id,
        String lastModifiedTime,
        String resultType,
        String state,
        String tableName,
        Double totalChangesApplied) {
        this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter, "expected parameter 'cdcDeleteCounter' to be non-null");
        this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter, "expected parameter 'cdcInsertCounter' to be non-null");
        this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter, "expected parameter 'cdcUpdateCounter' to be non-null");
        this.dataErrorsCounter = Objects.requireNonNull(dataErrorsCounter, "expected parameter 'dataErrorsCounter' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.fullLoadEndedOn = Objects.requireNonNull(fullLoadEndedOn, "expected parameter 'fullLoadEndedOn' to be non-null");
        this.fullLoadEstFinishTime = Objects.requireNonNull(fullLoadEstFinishTime, "expected parameter 'fullLoadEstFinishTime' to be non-null");
        this.fullLoadStartedOn = Objects.requireNonNull(fullLoadStartedOn, "expected parameter 'fullLoadStartedOn' to be non-null");
        this.fullLoadTotalRows = Objects.requireNonNull(fullLoadTotalRows, "expected parameter 'fullLoadTotalRows' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime, "expected parameter 'lastModifiedTime' to be non-null");
        this.resultType = Codegen.stringProp("resultType").arg(resultType).require();
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.totalChangesApplied = Objects.requireNonNull(totalChangesApplied, "expected parameter 'totalChangesApplied' to be non-null");
    }

    private MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse() {
        this.cdcDeleteCounter = null;
        this.cdcInsertCounter = null;
        this.cdcUpdateCounter = null;
        this.dataErrorsCounter = null;
        this.databaseName = null;
        this.fullLoadEndedOn = null;
        this.fullLoadEstFinishTime = null;
        this.fullLoadStartedOn = null;
        this.fullLoadTotalRows = null;
        this.id = null;
        this.lastModifiedTime = null;
        this.resultType = null;
        this.state = null;
        this.tableName = null;
        this.totalChangesApplied = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cdcDeleteCounter;
        private String cdcInsertCounter;
        private String cdcUpdateCounter;
        private Double dataErrorsCounter;
        private String databaseName;
        private String fullLoadEndedOn;
        private String fullLoadEstFinishTime;
        private String fullLoadStartedOn;
        private Double fullLoadTotalRows;
        private String id;
        private String lastModifiedTime;
        private String resultType;
        private String state;
        private String tableName;
        private Double totalChangesApplied;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdcDeleteCounter = defaults.cdcDeleteCounter;
    	      this.cdcInsertCounter = defaults.cdcInsertCounter;
    	      this.cdcUpdateCounter = defaults.cdcUpdateCounter;
    	      this.dataErrorsCounter = defaults.dataErrorsCounter;
    	      this.databaseName = defaults.databaseName;
    	      this.fullLoadEndedOn = defaults.fullLoadEndedOn;
    	      this.fullLoadEstFinishTime = defaults.fullLoadEstFinishTime;
    	      this.fullLoadStartedOn = defaults.fullLoadStartedOn;
    	      this.fullLoadTotalRows = defaults.fullLoadTotalRows;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.resultType = defaults.resultType;
    	      this.state = defaults.state;
    	      this.tableName = defaults.tableName;
    	      this.totalChangesApplied = defaults.totalChangesApplied;
        }

        public Builder cdcDeleteCounter(String cdcDeleteCounter) {
            this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter);
            return this;
        }
        public Builder cdcInsertCounter(String cdcInsertCounter) {
            this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter);
            return this;
        }
        public Builder cdcUpdateCounter(String cdcUpdateCounter) {
            this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter);
            return this;
        }
        public Builder dataErrorsCounter(Double dataErrorsCounter) {
            this.dataErrorsCounter = Objects.requireNonNull(dataErrorsCounter);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder fullLoadEndedOn(String fullLoadEndedOn) {
            this.fullLoadEndedOn = Objects.requireNonNull(fullLoadEndedOn);
            return this;
        }
        public Builder fullLoadEstFinishTime(String fullLoadEstFinishTime) {
            this.fullLoadEstFinishTime = Objects.requireNonNull(fullLoadEstFinishTime);
            return this;
        }
        public Builder fullLoadStartedOn(String fullLoadStartedOn) {
            this.fullLoadStartedOn = Objects.requireNonNull(fullLoadStartedOn);
            return this;
        }
        public Builder fullLoadTotalRows(Double fullLoadTotalRows) {
            this.fullLoadTotalRows = Objects.requireNonNull(fullLoadTotalRows);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder totalChangesApplied(Double totalChangesApplied) {
            this.totalChangesApplied = Objects.requireNonNull(totalChangesApplied);
            return this;
        }        public MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse build() {
            return new MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse(cdcDeleteCounter, cdcInsertCounter, cdcUpdateCounter, dataErrorsCounter, databaseName, fullLoadEndedOn, fullLoadEstFinishTime, fullLoadStartedOn, fullLoadTotalRows, id, lastModifiedTime, resultType, state, tableName, totalChangesApplied);
        }
    }
}
