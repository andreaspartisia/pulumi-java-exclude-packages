// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dataflow_v1b3.outputs.EnvironmentResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.ExecutionStageStateResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.JobMetadataResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.PipelineDescriptionResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.StepResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetJobResult {
    private final String clientRequestId;
    private final String createTime;
    private final String createdFromSnapshotId;
    private final String currentState;
    private final String currentStateTime;
    private final EnvironmentResponse environment;
    private final JobMetadataResponse jobMetadata;
    private final Map<String,String> labels;
    private final String location;
    private final String name;
    private final PipelineDescriptionResponse pipelineDescription;
    private final String project;
    private final String replaceJobId;
    private final String replacedByJobId;
    private final String requestedState;
    private final Boolean satisfiesPzs;
    private final List<ExecutionStageStateResponse> stageStates;
    private final String startTime;
    private final List<StepResponse> steps;
    private final String stepsLocation;
    private final List<String> tempFiles;
    private final Map<String,String> transformNameMapping;
    private final String type;

    @OutputCustomType.Constructor({"clientRequestId","createTime","createdFromSnapshotId","currentState","currentStateTime","environment","jobMetadata","labels","location","name","pipelineDescription","project","replaceJobId","replacedByJobId","requestedState","satisfiesPzs","stageStates","startTime","steps","stepsLocation","tempFiles","transformNameMapping","type"})
    private GetJobResult(
        String clientRequestId,
        String createTime,
        String createdFromSnapshotId,
        String currentState,
        String currentStateTime,
        EnvironmentResponse environment,
        JobMetadataResponse jobMetadata,
        Map<String,String> labels,
        String location,
        String name,
        PipelineDescriptionResponse pipelineDescription,
        String project,
        String replaceJobId,
        String replacedByJobId,
        String requestedState,
        Boolean satisfiesPzs,
        List<ExecutionStageStateResponse> stageStates,
        String startTime,
        List<StepResponse> steps,
        String stepsLocation,
        List<String> tempFiles,
        Map<String,String> transformNameMapping,
        String type) {
        this.clientRequestId = Objects.requireNonNull(clientRequestId);
        this.createTime = Objects.requireNonNull(createTime);
        this.createdFromSnapshotId = Objects.requireNonNull(createdFromSnapshotId);
        this.currentState = Objects.requireNonNull(currentState);
        this.currentStateTime = Objects.requireNonNull(currentStateTime);
        this.environment = Objects.requireNonNull(environment);
        this.jobMetadata = Objects.requireNonNull(jobMetadata);
        this.labels = Objects.requireNonNull(labels);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.pipelineDescription = Objects.requireNonNull(pipelineDescription);
        this.project = Objects.requireNonNull(project);
        this.replaceJobId = Objects.requireNonNull(replaceJobId);
        this.replacedByJobId = Objects.requireNonNull(replacedByJobId);
        this.requestedState = Objects.requireNonNull(requestedState);
        this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
        this.stageStates = Objects.requireNonNull(stageStates);
        this.startTime = Objects.requireNonNull(startTime);
        this.steps = Objects.requireNonNull(steps);
        this.stepsLocation = Objects.requireNonNull(stepsLocation);
        this.tempFiles = Objects.requireNonNull(tempFiles);
        this.transformNameMapping = Objects.requireNonNull(transformNameMapping);
        this.type = Objects.requireNonNull(type);
    }

    public String getClientRequestId() {
        return this.clientRequestId;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public String getCreatedFromSnapshotId() {
        return this.createdFromSnapshotId;
    }
    public String getCurrentState() {
        return this.currentState;
    }
    public String getCurrentStateTime() {
        return this.currentStateTime;
    }
    public EnvironmentResponse getEnvironment() {
        return this.environment;
    }
    public JobMetadataResponse getJobMetadata() {
        return this.jobMetadata;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public PipelineDescriptionResponse getPipelineDescription() {
        return this.pipelineDescription;
    }
    public String getProject() {
        return this.project;
    }
    public String getReplaceJobId() {
        return this.replaceJobId;
    }
    public String getReplacedByJobId() {
        return this.replacedByJobId;
    }
    public String getRequestedState() {
        return this.requestedState;
    }
    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    public List<ExecutionStageStateResponse> getStageStates() {
        return this.stageStates;
    }
    public String getStartTime() {
        return this.startTime;
    }
    public List<StepResponse> getSteps() {
        return this.steps;
    }
    public String getStepsLocation() {
        return this.stepsLocation;
    }
    public List<String> getTempFiles() {
        return this.tempFiles;
    }
    public Map<String,String> getTransformNameMapping() {
        return this.transformNameMapping;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientRequestId;
        private String createTime;
        private String createdFromSnapshotId;
        private String currentState;
        private String currentStateTime;
        private EnvironmentResponse environment;
        private JobMetadataResponse jobMetadata;
        private Map<String,String> labels;
        private String location;
        private String name;
        private PipelineDescriptionResponse pipelineDescription;
        private String project;
        private String replaceJobId;
        private String replacedByJobId;
        private String requestedState;
        private Boolean satisfiesPzs;
        private List<ExecutionStageStateResponse> stageStates;
        private String startTime;
        private List<StepResponse> steps;
        private String stepsLocation;
        private List<String> tempFiles;
        private Map<String,String> transformNameMapping;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientRequestId = defaults.clientRequestId;
    	      this.createTime = defaults.createTime;
    	      this.createdFromSnapshotId = defaults.createdFromSnapshotId;
    	      this.currentState = defaults.currentState;
    	      this.currentStateTime = defaults.currentStateTime;
    	      this.environment = defaults.environment;
    	      this.jobMetadata = defaults.jobMetadata;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.pipelineDescription = defaults.pipelineDescription;
    	      this.project = defaults.project;
    	      this.replaceJobId = defaults.replaceJobId;
    	      this.replacedByJobId = defaults.replacedByJobId;
    	      this.requestedState = defaults.requestedState;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.stageStates = defaults.stageStates;
    	      this.startTime = defaults.startTime;
    	      this.steps = defaults.steps;
    	      this.stepsLocation = defaults.stepsLocation;
    	      this.tempFiles = defaults.tempFiles;
    	      this.transformNameMapping = defaults.transformNameMapping;
    	      this.type = defaults.type;
        }

        public Builder setClientRequestId(String clientRequestId) {
            this.clientRequestId = Objects.requireNonNull(clientRequestId);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setCreatedFromSnapshotId(String createdFromSnapshotId) {
            this.createdFromSnapshotId = Objects.requireNonNull(createdFromSnapshotId);
            return this;
        }

        public Builder setCurrentState(String currentState) {
            this.currentState = Objects.requireNonNull(currentState);
            return this;
        }

        public Builder setCurrentStateTime(String currentStateTime) {
            this.currentStateTime = Objects.requireNonNull(currentStateTime);
            return this;
        }

        public Builder setEnvironment(EnvironmentResponse environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setJobMetadata(JobMetadataResponse jobMetadata) {
            this.jobMetadata = Objects.requireNonNull(jobMetadata);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPipelineDescription(PipelineDescriptionResponse pipelineDescription) {
            this.pipelineDescription = Objects.requireNonNull(pipelineDescription);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setReplaceJobId(String replaceJobId) {
            this.replaceJobId = Objects.requireNonNull(replaceJobId);
            return this;
        }

        public Builder setReplacedByJobId(String replacedByJobId) {
            this.replacedByJobId = Objects.requireNonNull(replacedByJobId);
            return this;
        }

        public Builder setRequestedState(String requestedState) {
            this.requestedState = Objects.requireNonNull(requestedState);
            return this;
        }

        public Builder setSatisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder setStageStates(List<ExecutionStageStateResponse> stageStates) {
            this.stageStates = Objects.requireNonNull(stageStates);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setSteps(List<StepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }

        public Builder setStepsLocation(String stepsLocation) {
            this.stepsLocation = Objects.requireNonNull(stepsLocation);
            return this;
        }

        public Builder setTempFiles(List<String> tempFiles) {
            this.tempFiles = Objects.requireNonNull(tempFiles);
            return this;
        }

        public Builder setTransformNameMapping(Map<String,String> transformNameMapping) {
            this.transformNameMapping = Objects.requireNonNull(transformNameMapping);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetJobResult build() {
            return new GetJobResult(clientRequestId, createTime, createdFromSnapshotId, currentState, currentStateTime, environment, jobMetadata, labels, location, name, pipelineDescription, project, replaceJobId, replacedByJobId, requestedState, satisfiesPzs, stageStates, startTime, steps, stepsLocation, tempFiles, transformNameMapping, type);
        }
    }
}