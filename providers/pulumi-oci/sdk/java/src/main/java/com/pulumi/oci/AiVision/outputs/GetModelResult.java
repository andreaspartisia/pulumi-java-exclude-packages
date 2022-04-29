// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.AiVision.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.AiVision.outputs.GetModelTestingDataset;
import com.pulumi.oci.AiVision.outputs.GetModelTrainingDataset;
import com.pulumi.oci.AiVision.outputs.GetModelValidationDataset;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetModelResult {
    /**
     * @return Average precision of the trained model
     * 
     */
    private final Double averagePrecision;
    /**
     * @return Compartment Identifier
     * 
     */
    private final String compartmentId;
    /**
     * @return Confidence ratio of the calculation
     * 
     */
    private final Double confidenceThreshold;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A short description of the model.
     * 
     */
    private final String description;
    /**
     * @return Model Identifier, can be renamed
     * 
     */
    private final String displayName;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return Unique identifier that is immutable on creation
     * 
     */
    private final String id;
    /**
     * @return If It&#39;s true, Training is set for recommended epochs needed for quick training.
     * 
     */
    private final Boolean isQuickMode;
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The maximum duration in hours for which the training will run.
     * 
     */
    private final Double maxTrainingDurationInHours;
    /**
     * @return Complete Training Metrics for successful trained model
     * 
     */
    private final String metrics;
    private final String modelId;
    /**
     * @return Type of the Model.
     * 
     */
    private final String modelType;
    /**
     * @return The version of the model
     * 
     */
    private final String modelVersion;
    /**
     * @return Precision of the trained model
     * 
     */
    private final Double precision;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the model.
     * 
     */
    private final String projectId;
    /**
     * @return Recall of the trained model
     * 
     */
    private final Double recall;
    /**
     * @return The current state of the Model.
     * 
     */
    private final String state;
    /**
     * @return Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    private final Map<String,Object> systemTags;
    /**
     * @return Total number of testing Images
     * 
     */
    private final Integer testImageCount;
    /**
     * @return The base entity for a Dataset, which is the input for Model creation.
     * 
     */
    private final List<GetModelTestingDataset> testingDatasets;
    /**
     * @return The time the Model was created. An RFC3339 formatted datetime string
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the Model was updated. An RFC3339 formatted datetime string
     * 
     */
    private final String timeUpdated;
    /**
     * @return Total number of training Images
     * 
     */
    private final Integer totalImageCount;
    /**
     * @return Total hours actually used for training
     * 
     */
    private final Double trainedDurationInHours;
    /**
     * @return The base entity for a Dataset, which is the input for Model creation.
     * 
     */
    private final List<GetModelTrainingDataset> trainingDatasets;
    /**
     * @return The base entity for a Dataset, which is the input for Model creation.
     * 
     */
    private final List<GetModelValidationDataset> validationDatasets;

    @CustomType.Constructor
    private GetModelResult(
        @CustomType.Parameter("averagePrecision") Double averagePrecision,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("confidenceThreshold") Double confidenceThreshold,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isQuickMode") Boolean isQuickMode,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("maxTrainingDurationInHours") Double maxTrainingDurationInHours,
        @CustomType.Parameter("metrics") String metrics,
        @CustomType.Parameter("modelId") String modelId,
        @CustomType.Parameter("modelType") String modelType,
        @CustomType.Parameter("modelVersion") String modelVersion,
        @CustomType.Parameter("precision") Double precision,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("recall") Double recall,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemTags") Map<String,Object> systemTags,
        @CustomType.Parameter("testImageCount") Integer testImageCount,
        @CustomType.Parameter("testingDatasets") List<GetModelTestingDataset> testingDatasets,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("totalImageCount") Integer totalImageCount,
        @CustomType.Parameter("trainedDurationInHours") Double trainedDurationInHours,
        @CustomType.Parameter("trainingDatasets") List<GetModelTrainingDataset> trainingDatasets,
        @CustomType.Parameter("validationDatasets") List<GetModelValidationDataset> validationDatasets) {
        this.averagePrecision = averagePrecision;
        this.compartmentId = compartmentId;
        this.confidenceThreshold = confidenceThreshold;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isQuickMode = isQuickMode;
        this.lifecycleDetails = lifecycleDetails;
        this.maxTrainingDurationInHours = maxTrainingDurationInHours;
        this.metrics = metrics;
        this.modelId = modelId;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.precision = precision;
        this.projectId = projectId;
        this.recall = recall;
        this.state = state;
        this.systemTags = systemTags;
        this.testImageCount = testImageCount;
        this.testingDatasets = testingDatasets;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.totalImageCount = totalImageCount;
        this.trainedDurationInHours = trainedDurationInHours;
        this.trainingDatasets = trainingDatasets;
        this.validationDatasets = validationDatasets;
    }

    /**
     * @return Average precision of the trained model
     * 
     */
    public Double averagePrecision() {
        return this.averagePrecision;
    }
    /**
     * @return Compartment Identifier
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Confidence ratio of the calculation
     * 
     */
    public Double confidenceThreshold() {
        return this.confidenceThreshold;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A short description of the model.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Model Identifier, can be renamed
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return Unique identifier that is immutable on creation
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If It&#39;s true, Training is set for recommended epochs needed for quick training.
     * 
     */
    public Boolean isQuickMode() {
        return this.isQuickMode;
    }
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return The maximum duration in hours for which the training will run.
     * 
     */
    public Double maxTrainingDurationInHours() {
        return this.maxTrainingDurationInHours;
    }
    /**
     * @return Complete Training Metrics for successful trained model
     * 
     */
    public String metrics() {
        return this.metrics;
    }
    public String modelId() {
        return this.modelId;
    }
    /**
     * @return Type of the Model.
     * 
     */
    public String modelType() {
        return this.modelType;
    }
    /**
     * @return The version of the model
     * 
     */
    public String modelVersion() {
        return this.modelVersion;
    }
    /**
     * @return Precision of the trained model
     * 
     */
    public Double precision() {
        return this.precision;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the model.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Recall of the trained model
     * 
     */
    public Double recall() {
        return this.recall;
    }
    /**
     * @return The current state of the Model.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Map<String,Object> systemTags() {
        return this.systemTags;
    }
    /**
     * @return Total number of testing Images
     * 
     */
    public Integer testImageCount() {
        return this.testImageCount;
    }
    /**
     * @return The base entity for a Dataset, which is the input for Model creation.
     * 
     */
    public List<GetModelTestingDataset> testingDatasets() {
        return this.testingDatasets;
    }
    /**
     * @return The time the Model was created. An RFC3339 formatted datetime string
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the Model was updated. An RFC3339 formatted datetime string
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return Total number of training Images
     * 
     */
    public Integer totalImageCount() {
        return this.totalImageCount;
    }
    /**
     * @return Total hours actually used for training
     * 
     */
    public Double trainedDurationInHours() {
        return this.trainedDurationInHours;
    }
    /**
     * @return The base entity for a Dataset, which is the input for Model creation.
     * 
     */
    public List<GetModelTrainingDataset> trainingDatasets() {
        return this.trainingDatasets;
    }
    /**
     * @return The base entity for a Dataset, which is the input for Model creation.
     * 
     */
    public List<GetModelValidationDataset> validationDatasets() {
        return this.validationDatasets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double averagePrecision;
        private String compartmentId;
        private Double confidenceThreshold;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isQuickMode;
        private String lifecycleDetails;
        private Double maxTrainingDurationInHours;
        private String metrics;
        private String modelId;
        private String modelType;
        private String modelVersion;
        private Double precision;
        private String projectId;
        private Double recall;
        private String state;
        private Map<String,Object> systemTags;
        private Integer testImageCount;
        private List<GetModelTestingDataset> testingDatasets;
        private String timeCreated;
        private String timeUpdated;
        private Integer totalImageCount;
        private Double trainedDurationInHours;
        private List<GetModelTrainingDataset> trainingDatasets;
        private List<GetModelValidationDataset> validationDatasets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averagePrecision = defaults.averagePrecision;
    	      this.compartmentId = defaults.compartmentId;
    	      this.confidenceThreshold = defaults.confidenceThreshold;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isQuickMode = defaults.isQuickMode;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.maxTrainingDurationInHours = defaults.maxTrainingDurationInHours;
    	      this.metrics = defaults.metrics;
    	      this.modelId = defaults.modelId;
    	      this.modelType = defaults.modelType;
    	      this.modelVersion = defaults.modelVersion;
    	      this.precision = defaults.precision;
    	      this.projectId = defaults.projectId;
    	      this.recall = defaults.recall;
    	      this.state = defaults.state;
    	      this.systemTags = defaults.systemTags;
    	      this.testImageCount = defaults.testImageCount;
    	      this.testingDatasets = defaults.testingDatasets;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.totalImageCount = defaults.totalImageCount;
    	      this.trainedDurationInHours = defaults.trainedDurationInHours;
    	      this.trainingDatasets = defaults.trainingDatasets;
    	      this.validationDatasets = defaults.validationDatasets;
        }

        public Builder averagePrecision(Double averagePrecision) {
            this.averagePrecision = Objects.requireNonNull(averagePrecision);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder confidenceThreshold(Double confidenceThreshold) {
            this.confidenceThreshold = Objects.requireNonNull(confidenceThreshold);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isQuickMode(Boolean isQuickMode) {
            this.isQuickMode = Objects.requireNonNull(isQuickMode);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder maxTrainingDurationInHours(Double maxTrainingDurationInHours) {
            this.maxTrainingDurationInHours = Objects.requireNonNull(maxTrainingDurationInHours);
            return this;
        }
        public Builder metrics(String metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder modelId(String modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }
        public Builder modelType(String modelType) {
            this.modelType = Objects.requireNonNull(modelType);
            return this;
        }
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = Objects.requireNonNull(modelVersion);
            return this;
        }
        public Builder precision(Double precision) {
            this.precision = Objects.requireNonNull(precision);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder recall(Double recall) {
            this.recall = Objects.requireNonNull(recall);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemTags(Map<String,Object> systemTags) {
            this.systemTags = Objects.requireNonNull(systemTags);
            return this;
        }
        public Builder testImageCount(Integer testImageCount) {
            this.testImageCount = Objects.requireNonNull(testImageCount);
            return this;
        }
        public Builder testingDatasets(List<GetModelTestingDataset> testingDatasets) {
            this.testingDatasets = Objects.requireNonNull(testingDatasets);
            return this;
        }
        public Builder testingDatasets(GetModelTestingDataset... testingDatasets) {
            return testingDatasets(List.of(testingDatasets));
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }
        public Builder totalImageCount(Integer totalImageCount) {
            this.totalImageCount = Objects.requireNonNull(totalImageCount);
            return this;
        }
        public Builder trainedDurationInHours(Double trainedDurationInHours) {
            this.trainedDurationInHours = Objects.requireNonNull(trainedDurationInHours);
            return this;
        }
        public Builder trainingDatasets(List<GetModelTrainingDataset> trainingDatasets) {
            this.trainingDatasets = Objects.requireNonNull(trainingDatasets);
            return this;
        }
        public Builder trainingDatasets(GetModelTrainingDataset... trainingDatasets) {
            return trainingDatasets(List.of(trainingDatasets));
        }
        public Builder validationDatasets(List<GetModelValidationDataset> validationDatasets) {
            this.validationDatasets = Objects.requireNonNull(validationDatasets);
            return this;
        }
        public Builder validationDatasets(GetModelValidationDataset... validationDatasets) {
            return validationDatasets(List.of(validationDatasets));
        }        public GetModelResult build() {
            return new GetModelResult(averagePrecision, compartmentId, confidenceThreshold, definedTags, description, displayName, freeformTags, id, isQuickMode, lifecycleDetails, maxTrainingDurationInHours, metrics, modelId, modelType, modelVersion, precision, projectId, recall, state, systemTags, testImageCount, testingDatasets, timeCreated, timeUpdated, totalImageCount, trainedDurationInHours, trainingDatasets, validationDatasets);
        }
    }
}
