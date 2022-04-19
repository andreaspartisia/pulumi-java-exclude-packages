// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for task that validates migration input for SQL to Azure SQL Database Managed Instance sync scenario
 * 
 */
public final class ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesArgs Empty = new ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable Output<ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs> input;

    public Output<ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs> input() {
        return this.input == null ? Codegen.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ValidateMigrationInput.SqlServer.AzureSqlDbMI.Sync.LRS'.
     * 
     */
    @Import(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    public ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesArgs(
        @Nullable Output<ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Codegen.stringProp("taskType").output().arg(taskType).require();
    }

    private ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesArgs() {
        this.input = Codegen.empty();
        this.taskType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs input) {
            this.input = Codegen.ofNullable(input);
            return this;
        }
        public Builder taskType(Output<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }
        public Builder taskType(String taskType) {
            this.taskType = Output.of(Objects.requireNonNull(taskType));
            return this;
        }        public ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesArgs build() {
            return new ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesArgs(input, taskType);
        }
    }
}
