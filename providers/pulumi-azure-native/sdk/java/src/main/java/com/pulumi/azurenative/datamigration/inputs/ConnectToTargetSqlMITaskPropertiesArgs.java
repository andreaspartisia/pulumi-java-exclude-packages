// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ConnectToTargetSqlMITaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to Azure SQL Database Managed Instance
 * 
 */
public final class ConnectToTargetSqlMITaskPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetSqlMITaskPropertiesArgs Empty = new ConnectToTargetSqlMITaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable Output<ConnectToTargetSqlMITaskInputArgs> input;

    public Output<ConnectToTargetSqlMITaskInputArgs> input() {
        return this.input == null ? Codegen.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ConnectToTarget.AzureSqlDbMI'.
     * 
     */
    @Import(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    public ConnectToTargetSqlMITaskPropertiesArgs(
        @Nullable Output<ConnectToTargetSqlMITaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Codegen.stringProp("taskType").output().arg(taskType).require();
    }

    private ConnectToTargetSqlMITaskPropertiesArgs() {
        this.input = Codegen.empty();
        this.taskType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMITaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConnectToTargetSqlMITaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMITaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<ConnectToTargetSqlMITaskInputArgs> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable ConnectToTargetSqlMITaskInputArgs input) {
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
        }        public ConnectToTargetSqlMITaskPropertiesArgs build() {
            return new ConnectToTargetSqlMITaskPropertiesArgs(input, taskType);
        }
    }
}
