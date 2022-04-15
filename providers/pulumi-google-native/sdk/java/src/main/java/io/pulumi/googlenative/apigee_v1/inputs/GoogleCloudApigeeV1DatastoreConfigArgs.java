// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration detail for datastore
 * 
 */
public final class GoogleCloudApigeeV1DatastoreConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1DatastoreConfigArgs Empty = new GoogleCloudApigeeV1DatastoreConfigArgs();

    /**
     * Name of the Cloud Storage bucket. Required for `gcs` target_type.
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName == null ? Codegen.empty() : this.bucketName;
    }

    /**
     * BigQuery dataset name Required for `bigquery` target_type.
     * 
     */
    @Import(name="datasetName")
      private final @Nullable Output<String> datasetName;

    public Output<String> datasetName() {
        return this.datasetName == null ? Codegen.empty() : this.datasetName;
    }

    /**
     * Path of Cloud Storage bucket Required for `gcs` target_type.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * GCP project in which the datastore exists
     * 
     */
    @Import(name="project", required=true)
      private final Output<String> project;

    public Output<String> project() {
        return this.project;
    }

    /**
     * Prefix of BigQuery table Required for `bigquery` target_type.
     * 
     */
    @Import(name="tablePrefix")
      private final @Nullable Output<String> tablePrefix;

    public Output<String> tablePrefix() {
        return this.tablePrefix == null ? Codegen.empty() : this.tablePrefix;
    }

    public GoogleCloudApigeeV1DatastoreConfigArgs(
        @Nullable Output<String> bucketName,
        @Nullable Output<String> datasetName,
        @Nullable Output<String> path,
        Output<String> project,
        @Nullable Output<String> tablePrefix) {
        this.bucketName = bucketName;
        this.datasetName = datasetName;
        this.path = path;
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.tablePrefix = tablePrefix;
    }

    private GoogleCloudApigeeV1DatastoreConfigArgs() {
        this.bucketName = Codegen.empty();
        this.datasetName = Codegen.empty();
        this.path = Codegen.empty();
        this.project = Codegen.empty();
        this.tablePrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1DatastoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private @Nullable Output<String> datasetName;
        private @Nullable Output<String> path;
        private Output<String> project;
        private @Nullable Output<String> tablePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1DatastoreConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.datasetName = defaults.datasetName;
    	      this.path = defaults.path;
    	      this.project = defaults.project;
    	      this.tablePrefix = defaults.tablePrefix;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Codegen.ofNullable(bucketName);
            return this;
        }
        public Builder datasetName(@Nullable Output<String> datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public Builder datasetName(@Nullable String datasetName) {
            this.datasetName = Codegen.ofNullable(datasetName);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder project(Output<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder project(String project) {
            this.project = Output.of(Objects.requireNonNull(project));
            return this;
        }
        public Builder tablePrefix(@Nullable Output<String> tablePrefix) {
            this.tablePrefix = tablePrefix;
            return this;
        }
        public Builder tablePrefix(@Nullable String tablePrefix) {
            this.tablePrefix = Codegen.ofNullable(tablePrefix);
            return this;
        }        public GoogleCloudApigeeV1DatastoreConfigArgs build() {
            return new GoogleCloudApigeeV1DatastoreConfigArgs(bucketName, datasetName, path, project, tablePrefix);
        }
    }
}
