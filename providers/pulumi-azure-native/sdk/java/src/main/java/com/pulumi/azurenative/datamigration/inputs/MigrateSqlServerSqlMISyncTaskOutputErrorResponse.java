// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class MigrateSqlServerSqlMISyncTaskOutputErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMISyncTaskOutputErrorResponse Empty = new MigrateSqlServerSqlMISyncTaskOutputErrorResponse();

    /**
     * Migration error
     * 
     */
    @Import(name="error", required=true)
      private final ReportableExceptionResponse error;

    public ReportableExceptionResponse error() {
        return this.error;
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
     * Result type
     * Expected value is 'ErrorOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String resultType() {
        return this.resultType;
    }

    public MigrateSqlServerSqlMISyncTaskOutputErrorResponse(
        ReportableExceptionResponse error,
        String id,
        String resultType) {
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.resultType = Codegen.stringProp("resultType").arg(resultType).require();
    }

    private MigrateSqlServerSqlMISyncTaskOutputErrorResponse() {
        this.error = null;
        this.id = null;
        this.resultType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskOutputErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportableExceptionResponse error;
        private String id;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskOutputErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
        }

        public Builder error(ReportableExceptionResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }        public MigrateSqlServerSqlMISyncTaskOutputErrorResponse build() {
            return new MigrateSqlServerSqlMISyncTaskOutputErrorResponse(error, id, resultType);
        }
    }
}
