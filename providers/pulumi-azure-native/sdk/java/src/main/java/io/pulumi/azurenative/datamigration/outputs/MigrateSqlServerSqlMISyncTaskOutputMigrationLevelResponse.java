// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse {
    private final Integer databaseCount;
    private final Integer databaseErrorCount;
    private final String endedOn;
    private final String id;
    private final String resultType;
    private final String sourceServerBrandVersion;
    private final String sourceServerName;
    private final String sourceServerVersion;
    private final String startedOn;
    private final String state;
    private final String targetServerBrandVersion;
    private final String targetServerName;
    private final String targetServerVersion;

    @OutputCustomType.Constructor({"databaseCount","databaseErrorCount","endedOn","id","resultType","sourceServerBrandVersion","sourceServerName","sourceServerVersion","startedOn","state","targetServerBrandVersion","targetServerName","targetServerVersion"})
    private MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse(
        Integer databaseCount,
        Integer databaseErrorCount,
        String endedOn,
        String id,
        String resultType,
        String sourceServerBrandVersion,
        String sourceServerName,
        String sourceServerVersion,
        String startedOn,
        String state,
        String targetServerBrandVersion,
        String targetServerName,
        String targetServerVersion) {
        this.databaseCount = Objects.requireNonNull(databaseCount);
        this.databaseErrorCount = Objects.requireNonNull(databaseErrorCount);
        this.endedOn = Objects.requireNonNull(endedOn);
        this.id = Objects.requireNonNull(id);
        this.resultType = Objects.requireNonNull(resultType);
        this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
        this.sourceServerName = Objects.requireNonNull(sourceServerName);
        this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
        this.startedOn = Objects.requireNonNull(startedOn);
        this.state = Objects.requireNonNull(state);
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
        this.targetServerName = Objects.requireNonNull(targetServerName);
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
    }

    public Integer getDatabaseCount() {
        return this.databaseCount;
    }
    public Integer getDatabaseErrorCount() {
        return this.databaseErrorCount;
    }
    public String getEndedOn() {
        return this.endedOn;
    }
    public String getId() {
        return this.id;
    }
    public String getResultType() {
        return this.resultType;
    }
    public String getSourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }
    public String getSourceServerName() {
        return this.sourceServerName;
    }
    public String getSourceServerVersion() {
        return this.sourceServerVersion;
    }
    public String getStartedOn() {
        return this.startedOn;
    }
    public String getState() {
        return this.state;
    }
    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }
    public String getTargetServerName() {
        return this.targetServerName;
    }
    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer databaseCount;
        private Integer databaseErrorCount;
        private String endedOn;
        private String id;
        private String resultType;
        private String sourceServerBrandVersion;
        private String sourceServerName;
        private String sourceServerVersion;
        private String startedOn;
        private String state;
        private String targetServerBrandVersion;
        private String targetServerName;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseCount = defaults.databaseCount;
    	      this.databaseErrorCount = defaults.databaseErrorCount;
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
    	      this.sourceServerBrandVersion = defaults.sourceServerBrandVersion;
    	      this.sourceServerName = defaults.sourceServerName;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerName = defaults.targetServerName;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder setDatabaseCount(Integer databaseCount) {
            this.databaseCount = Objects.requireNonNull(databaseCount);
            return this;
        }

        public Builder setDatabaseErrorCount(Integer databaseErrorCount) {
            this.databaseErrorCount = Objects.requireNonNull(databaseErrorCount);
            return this;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setSourceServerBrandVersion(String sourceServerBrandVersion) {
            this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
            return this;
        }

        public Builder setSourceServerName(String sourceServerName) {
            this.sourceServerName = Objects.requireNonNull(sourceServerName);
            return this;
        }

        public Builder setSourceServerVersion(String sourceServerVersion) {
            this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTargetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder setTargetServerName(String targetServerName) {
            this.targetServerName = Objects.requireNonNull(targetServerName);
            return this;
        }

        public Builder setTargetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }

        public MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse build() {
            return new MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse(databaseCount, databaseErrorCount, endedOn, id, resultType, sourceServerBrandVersion, sourceServerName, sourceServerVersion, startedOn, state, targetServerBrandVersion, targetServerName, targetServerVersion);
        }
    }
}