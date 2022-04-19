// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ConnectToTargetAzureDbForMySqlTaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to Azure Database for MySQL and target server requirements
 * 
 */
public final class ConnectToTargetAzureDbForMySqlTaskPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetAzureDbForMySqlTaskPropertiesArgs Empty = new ConnectToTargetAzureDbForMySqlTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable Output<ConnectToTargetAzureDbForMySqlTaskInputArgs> input;

    public Output<ConnectToTargetAzureDbForMySqlTaskInputArgs> input() {
        return this.input == null ? Codegen.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ConnectToTarget.AzureDbForMySql'.
     * 
     */
    @Import(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    public ConnectToTargetAzureDbForMySqlTaskPropertiesArgs(
        @Nullable Output<ConnectToTargetAzureDbForMySqlTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Codegen.stringProp("taskType").output().arg(taskType).require();
    }

    private ConnectToTargetAzureDbForMySqlTaskPropertiesArgs() {
        this.input = Codegen.empty();
        this.taskType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForMySqlTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConnectToTargetAzureDbForMySqlTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForMySqlTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<ConnectToTargetAzureDbForMySqlTaskInputArgs> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable ConnectToTargetAzureDbForMySqlTaskInputArgs input) {
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
        }        public ConnectToTargetAzureDbForMySqlTaskPropertiesArgs build() {
            return new ConnectToTargetAzureDbForMySqlTaskPropertiesArgs(input, taskType);
        }
    }
}
