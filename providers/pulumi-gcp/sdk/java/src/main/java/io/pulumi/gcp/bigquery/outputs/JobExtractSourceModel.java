// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobExtractSourceModel {
    /**
     * The ID of the dataset containing this model.
     * 
     */
    private final String datasetId;
    /**
     * The ID of the model.
     * 
     */
    private final String modelId;
    /**
     * The ID of the project containing this model.
     * 
     */
    private final String projectId;

    @OutputCustomType.Constructor({"datasetId","modelId","projectId"})
    private JobExtractSourceModel(
        String datasetId,
        String modelId,
        String projectId) {
        this.datasetId = Objects.requireNonNull(datasetId);
        this.modelId = Objects.requireNonNull(modelId);
        this.projectId = Objects.requireNonNull(projectId);
    }

    /**
     * The ID of the dataset containing this model.
     * 
     */
    public String getDatasetId() {
        return this.datasetId;
    }
    /**
     * The ID of the model.
     * 
     */
    public String getModelId() {
        return this.modelId;
    }
    /**
     * The ID of the project containing this model.
     * 
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExtractSourceModel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String modelId;
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExtractSourceModel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.modelId = defaults.modelId;
    	      this.projectId = defaults.projectId;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setModelId(String modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public JobExtractSourceModel build() {
            return new JobExtractSourceModel(datasetId, modelId, projectId);
        }
    }
}