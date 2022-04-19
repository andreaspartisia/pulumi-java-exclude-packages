// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelResponse Empty = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelResponse();

    /**
     * Number of applied changes
     * 
     */
    @Import(name="appliedChanges", required=true)
      private final Double appliedChanges;

    public Double appliedChanges() {
        return this.appliedChanges;
    }

    /**
     * Number of cdc deletes
     * 
     */
    @Import(name="cdcDeleteCounter", required=true)
      private final Double cdcDeleteCounter;

    public Double cdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }

    /**
     * Number of cdc inserts
     * 
     */
    @Import(name="cdcInsertCounter", required=true)
      private final Double cdcInsertCounter;

    public Double cdcInsertCounter() {
        return this.cdcInsertCounter;
    }

    /**
     * Number of cdc updates
     * 
     */
    @Import(name="cdcUpdateCounter", required=true)
      private final Double cdcUpdateCounter;

    public Double cdcUpdateCounter() {
        return this.cdcUpdateCounter;
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
     * Migration end time
     * 
     */
    @Import(name="endedOn", required=true)
      private final String endedOn;

    public String endedOn() {
        return this.endedOn;
    }

    /**
     * Number of tables completed in full load
     * 
     */
    @Import(name="fullLoadCompletedTables", required=true)
      private final Double fullLoadCompletedTables;

    public Double fullLoadCompletedTables() {
        return this.fullLoadCompletedTables;
    }

    /**
     * Number of tables errored in full load
     * 
     */
    @Import(name="fullLoadErroredTables", required=true)
      private final Double fullLoadErroredTables;

    public Double fullLoadErroredTables() {
        return this.fullLoadErroredTables;
    }

    /**
     * Number of tables loading in full load
     * 
     */
    @Import(name="fullLoadLoadingTables", required=true)
      private final Double fullLoadLoadingTables;

    public Double fullLoadLoadingTables() {
        return this.fullLoadLoadingTables;
    }

    /**
     * Number of tables queued in full load
     * 
     */
    @Import(name="fullLoadQueuedTables", required=true)
      private final Double fullLoadQueuedTables;

    public Double fullLoadQueuedTables() {
        return this.fullLoadQueuedTables;
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
     * Number of incoming changes
     * 
     */
    @Import(name="incomingChanges", required=true)
      private final Double incomingChanges;

    public Double incomingChanges() {
        return this.incomingChanges;
    }

    /**
     * Indicates if initial load (full load) has been completed
     * 
     */
    @Import(name="initializationCompleted", required=true)
      private final Boolean initializationCompleted;

    public Boolean initializationCompleted() {
        return this.initializationCompleted;
    }

    /**
     * CDC apply latency
     * 
     */
    @Import(name="latency", required=true)
      private final Double latency;

    public Double latency() {
        return this.latency;
    }

    /**
     * Migration state that this database is in
     * 
     */
    @Import(name="migrationState", required=true)
      private final String migrationState;

    public String migrationState() {
        return this.migrationState;
    }

    /**
     * Result type
     * Expected value is 'DatabaseLevelOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String resultType() {
        return this.resultType;
    }

    /**
     * Migration start time
     * 
     */
    @Import(name="startedOn", required=true)
      private final String startedOn;

    public String startedOn() {
        return this.startedOn;
    }

    public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelResponse(
        Double appliedChanges,
        Double cdcDeleteCounter,
        Double cdcInsertCounter,
        Double cdcUpdateCounter,
        String databaseName,
        String endedOn,
        Double fullLoadCompletedTables,
        Double fullLoadErroredTables,
        Double fullLoadLoadingTables,
        Double fullLoadQueuedTables,
        String id,
        Double incomingChanges,
        Boolean initializationCompleted,
        Double latency,
        String migrationState,
        String resultType,
        String startedOn) {
        this.appliedChanges = Objects.requireNonNull(appliedChanges, "expected parameter 'appliedChanges' to be non-null");
        this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter, "expected parameter 'cdcDeleteCounter' to be non-null");
        this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter, "expected parameter 'cdcInsertCounter' to be non-null");
        this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter, "expected parameter 'cdcUpdateCounter' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.fullLoadCompletedTables = Objects.requireNonNull(fullLoadCompletedTables, "expected parameter 'fullLoadCompletedTables' to be non-null");
        this.fullLoadErroredTables = Objects.requireNonNull(fullLoadErroredTables, "expected parameter 'fullLoadErroredTables' to be non-null");
        this.fullLoadLoadingTables = Objects.requireNonNull(fullLoadLoadingTables, "expected parameter 'fullLoadLoadingTables' to be non-null");
        this.fullLoadQueuedTables = Objects.requireNonNull(fullLoadQueuedTables, "expected parameter 'fullLoadQueuedTables' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.incomingChanges = Objects.requireNonNull(incomingChanges, "expected parameter 'incomingChanges' to be non-null");
        this.initializationCompleted = Objects.requireNonNull(initializationCompleted, "expected parameter 'initializationCompleted' to be non-null");
        this.latency = Objects.requireNonNull(latency, "expected parameter 'latency' to be non-null");
        this.migrationState = Objects.requireNonNull(migrationState, "expected parameter 'migrationState' to be non-null");
        this.resultType = Codegen.stringProp("resultType").arg(resultType).require();
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
    }

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelResponse() {
        this.appliedChanges = null;
        this.cdcDeleteCounter = null;
        this.cdcInsertCounter = null;
        this.cdcUpdateCounter = null;
        this.databaseName = null;
        this.endedOn = null;
        this.fullLoadCompletedTables = null;
        this.fullLoadErroredTables = null;
        this.fullLoadLoadingTables = null;
        this.fullLoadQueuedTables = null;
        this.id = null;
        this.incomingChanges = null;
        this.initializationCompleted = null;
        this.latency = null;
        this.migrationState = null;
        this.resultType = null;
        this.startedOn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double appliedChanges;
        private Double cdcDeleteCounter;
        private Double cdcInsertCounter;
        private Double cdcUpdateCounter;
        private String databaseName;
        private String endedOn;
        private Double fullLoadCompletedTables;
        private Double fullLoadErroredTables;
        private Double fullLoadLoadingTables;
        private Double fullLoadQueuedTables;
        private String id;
        private Double incomingChanges;
        private Boolean initializationCompleted;
        private Double latency;
        private String migrationState;
        private String resultType;
        private String startedOn;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliedChanges = defaults.appliedChanges;
    	      this.cdcDeleteCounter = defaults.cdcDeleteCounter;
    	      this.cdcInsertCounter = defaults.cdcInsertCounter;
    	      this.cdcUpdateCounter = defaults.cdcUpdateCounter;
    	      this.databaseName = defaults.databaseName;
    	      this.endedOn = defaults.endedOn;
    	      this.fullLoadCompletedTables = defaults.fullLoadCompletedTables;
    	      this.fullLoadErroredTables = defaults.fullLoadErroredTables;
    	      this.fullLoadLoadingTables = defaults.fullLoadLoadingTables;
    	      this.fullLoadQueuedTables = defaults.fullLoadQueuedTables;
    	      this.id = defaults.id;
    	      this.incomingChanges = defaults.incomingChanges;
    	      this.initializationCompleted = defaults.initializationCompleted;
    	      this.latency = defaults.latency;
    	      this.migrationState = defaults.migrationState;
    	      this.resultType = defaults.resultType;
    	      this.startedOn = defaults.startedOn;
        }

        public Builder appliedChanges(Double appliedChanges) {
            this.appliedChanges = Objects.requireNonNull(appliedChanges);
            return this;
        }
        public Builder cdcDeleteCounter(Double cdcDeleteCounter) {
            this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter);
            return this;
        }
        public Builder cdcInsertCounter(Double cdcInsertCounter) {
            this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter);
            return this;
        }
        public Builder cdcUpdateCounter(Double cdcUpdateCounter) {
            this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder fullLoadCompletedTables(Double fullLoadCompletedTables) {
            this.fullLoadCompletedTables = Objects.requireNonNull(fullLoadCompletedTables);
            return this;
        }
        public Builder fullLoadErroredTables(Double fullLoadErroredTables) {
            this.fullLoadErroredTables = Objects.requireNonNull(fullLoadErroredTables);
            return this;
        }
        public Builder fullLoadLoadingTables(Double fullLoadLoadingTables) {
            this.fullLoadLoadingTables = Objects.requireNonNull(fullLoadLoadingTables);
            return this;
        }
        public Builder fullLoadQueuedTables(Double fullLoadQueuedTables) {
            this.fullLoadQueuedTables = Objects.requireNonNull(fullLoadQueuedTables);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder incomingChanges(Double incomingChanges) {
            this.incomingChanges = Objects.requireNonNull(incomingChanges);
            return this;
        }
        public Builder initializationCompleted(Boolean initializationCompleted) {
            this.initializationCompleted = Objects.requireNonNull(initializationCompleted);
            return this;
        }
        public Builder latency(Double latency) {
            this.latency = Objects.requireNonNull(latency);
            return this;
        }
        public Builder migrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelResponse build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelResponse(appliedChanges, cdcDeleteCounter, cdcInsertCounter, cdcUpdateCounter, databaseName, endedOn, fullLoadCompletedTables, fullLoadErroredTables, fullLoadLoadingTables, fullLoadQueuedTables, id, incomingChanges, initializationCompleted, latency, migrationState, resultType, startedOn);
        }
    }
}
