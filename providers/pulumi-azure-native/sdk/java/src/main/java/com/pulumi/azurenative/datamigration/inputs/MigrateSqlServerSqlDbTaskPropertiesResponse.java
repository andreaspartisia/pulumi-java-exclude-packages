// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskInputResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskOutputDatabaseLevelResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskOutputDatabaseLevelValidationResultResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskOutputErrorResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskOutputMigrationLevelResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskOutputTableLevelResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskOutputValidationResultResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.inputs.ODataErrorResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that migrates on-prem SQL Server databases to Azure SQL Database
 * 
 */
public final class MigrateSqlServerSqlDbTaskPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbTaskPropertiesResponse Empty = new MigrateSqlServerSqlDbTaskPropertiesResponse();

    /**
     * Array of command properties.
     * 
     */
    @Import(name="commands", required=true)
      private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;

    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands() {
        return this.commands;
    }

    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    @Import(name="errors", required=true)
      private final List<ODataErrorResponse> errors;

    public List<ODataErrorResponse> errors() {
        return this.errors;
    }

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable MigrateSqlServerSqlDbTaskInputResponse input;

    public Optional<MigrateSqlServerSqlDbTaskInputResponse> input() {
        return this.input == null ? Optional.empty() : Optional.ofNullable(this.input);
    }

    /**
     * Task output. This is ignored if submitted.
     * 
     */
    @Import(name="output", required=true)
      private final List<Object> output;

    public List<Object> output() {
        return this.output;
    }

    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * Task type.
     * Expected value is 'Migrate.SqlServer.SqlDb'.
     * 
     */
    @Import(name="taskType", required=true)
      private final String taskType;

    public String taskType() {
        return this.taskType;
    }

    public MigrateSqlServerSqlDbTaskPropertiesResponse(
        List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        List<ODataErrorResponse> errors,
        @Nullable MigrateSqlServerSqlDbTaskInputResponse input,
        List<Object> output,
        String state,
        String taskType) {
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.input = input;
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.taskType = Codegen.stringProp("taskType").arg(taskType).require();
    }

    private MigrateSqlServerSqlDbTaskPropertiesResponse() {
        this.commands = List.of();
        this.errors = List.of();
        this.input = null;
        this.output = List.of();
        this.state = null;
        this.taskType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable MigrateSqlServerSqlDbTaskInputResponse input;
        private List<Object> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.errors = defaults.errors;
    	      this.input = defaults.input;
    	      this.output = defaults.output;
    	      this.state = defaults.state;
    	      this.taskType = defaults.taskType;
        }

        public Builder commands(List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }
        public Builder commands(Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>... commands) {
            return commands(List.of(commands));
        }
        public Builder errors(List<ODataErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(ODataErrorResponse... errors) {
            return errors(List.of(errors));
        }
        public Builder input(@Nullable MigrateSqlServerSqlDbTaskInputResponse input) {
            this.input = input;
            return this;
        }
        public Builder output(List<Object> output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }
        public Builder output(Object... output) {
            return output(List.of(output));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder taskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }        public MigrateSqlServerSqlDbTaskPropertiesResponse build() {
            return new MigrateSqlServerSqlDbTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
