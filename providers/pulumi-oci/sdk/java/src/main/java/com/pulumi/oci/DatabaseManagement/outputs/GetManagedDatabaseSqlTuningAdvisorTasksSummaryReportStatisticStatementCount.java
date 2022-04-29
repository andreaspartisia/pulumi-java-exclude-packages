// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetManagedDatabaseSqlTuningAdvisorTasksSummaryReportStatisticStatementCount {
    /**
     * @return The number of distinct SQL statements.
     * 
     */
    private final Integer distinctSql;
    /**
     * @return The number of distinct SQL statements with errors.
     * 
     */
    private final Integer errorCount;
    /**
     * @return The number of distinct SQL statements with findings.
     * 
     */
    private final Integer findingCount;
    /**
     * @return The total number of SQL statements.
     * 
     */
    private final Integer totalSql;

    @CustomType.Constructor
    private GetManagedDatabaseSqlTuningAdvisorTasksSummaryReportStatisticStatementCount(
        @CustomType.Parameter("distinctSql") Integer distinctSql,
        @CustomType.Parameter("errorCount") Integer errorCount,
        @CustomType.Parameter("findingCount") Integer findingCount,
        @CustomType.Parameter("totalSql") Integer totalSql) {
        this.distinctSql = distinctSql;
        this.errorCount = errorCount;
        this.findingCount = findingCount;
        this.totalSql = totalSql;
    }

    /**
     * @return The number of distinct SQL statements.
     * 
     */
    public Integer distinctSql() {
        return this.distinctSql;
    }
    /**
     * @return The number of distinct SQL statements with errors.
     * 
     */
    public Integer errorCount() {
        return this.errorCount;
    }
    /**
     * @return The number of distinct SQL statements with findings.
     * 
     */
    public Integer findingCount() {
        return this.findingCount;
    }
    /**
     * @return The total number of SQL statements.
     * 
     */
    public Integer totalSql() {
        return this.totalSql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseSqlTuningAdvisorTasksSummaryReportStatisticStatementCount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer distinctSql;
        private Integer errorCount;
        private Integer findingCount;
        private Integer totalSql;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseSqlTuningAdvisorTasksSummaryReportStatisticStatementCount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distinctSql = defaults.distinctSql;
    	      this.errorCount = defaults.errorCount;
    	      this.findingCount = defaults.findingCount;
    	      this.totalSql = defaults.totalSql;
        }

        public Builder distinctSql(Integer distinctSql) {
            this.distinctSql = Objects.requireNonNull(distinctSql);
            return this;
        }
        public Builder errorCount(Integer errorCount) {
            this.errorCount = Objects.requireNonNull(errorCount);
            return this;
        }
        public Builder findingCount(Integer findingCount) {
            this.findingCount = Objects.requireNonNull(findingCount);
            return this;
        }
        public Builder totalSql(Integer totalSql) {
            this.totalSql = Objects.requireNonNull(totalSql);
            return this;
        }        public GetManagedDatabaseSqlTuningAdvisorTasksSummaryReportStatisticStatementCount build() {
            return new GetManagedDatabaseSqlTuningAdvisorTasksSummaryReportStatisticStatementCount(distinctSql, errorCount, findingCount, totalSql);
        }
    }
}
