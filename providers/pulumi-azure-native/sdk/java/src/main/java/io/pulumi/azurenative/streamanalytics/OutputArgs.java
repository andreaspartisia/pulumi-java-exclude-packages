// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.streamanalytics.inputs.AvroSerializationArgs;
import io.pulumi.azurenative.streamanalytics.inputs.AzureDataLakeStoreOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.AzureSqlDatabaseOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.AzureTableOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.BlobOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.CsvSerializationArgs;
import io.pulumi.azurenative.streamanalytics.inputs.DocumentDbOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.EventHubOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.JsonSerializationArgs;
import io.pulumi.azurenative.streamanalytics.inputs.PowerBIOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.ServiceBusQueueOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.ServiceBusTopicOutputDataSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final OutputArgs Empty = new OutputArgs();

    @InputImport(name="datasource")
    private final @Nullable Input<Object> datasource;

    public Input<Object> getDatasource() {
        return this.datasource == null ? Input.empty() : this.datasource;
    }

    @InputImport(name="jobName", required=true)
    private final Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="outputName")
    private final @Nullable Input<String> outputName;

    public Input<String> getOutputName() {
        return this.outputName == null ? Input.empty() : this.outputName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serialization")
    private final @Nullable Input<Object> serialization;

    public Input<Object> getSerialization() {
        return this.serialization == null ? Input.empty() : this.serialization;
    }

    public OutputArgs(
        @Nullable Input<Object> datasource,
        Input<String> jobName,
        @Nullable Input<String> name,
        @Nullable Input<String> outputName,
        Input<String> resourceGroupName,
        @Nullable Input<Object> serialization) {
        this.datasource = datasource;
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.name = name;
        this.outputName = outputName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serialization = serialization;
    }

    private OutputArgs() {
        this.datasource = Input.empty();
        this.jobName = Input.empty();
        this.name = Input.empty();
        this.outputName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serialization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> datasource;
        private Input<String> jobName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> outputName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Object> serialization;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.jobName = defaults.jobName;
    	      this.name = defaults.name;
    	      this.outputName = defaults.outputName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serialization = defaults.serialization;
        }

        public Builder setDatasource(@Nullable Input<Object> datasource) {
            this.datasource = datasource;
            return this;
        }

        public Builder setDatasource(@Nullable Object datasource) {
            this.datasource = Input.ofNullable(datasource);
            return this;
        }

        public Builder setJobName(Input<String> jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Input.of(Objects.requireNonNull(jobName));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOutputName(@Nullable Input<String> outputName) {
            this.outputName = outputName;
            return this;
        }

        public Builder setOutputName(@Nullable String outputName) {
            this.outputName = Input.ofNullable(outputName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSerialization(@Nullable Input<Object> serialization) {
            this.serialization = serialization;
            return this;
        }

        public Builder setSerialization(@Nullable Object serialization) {
            this.serialization = Input.ofNullable(serialization);
            return this;
        }

        public OutputArgs build() {
            return new OutputArgs(datasource, jobName, name, outputName, resourceGroupName, serialization);
        }
    }
}