// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExperimentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExperimentArgs Empty = new GetExperimentArgs();

    @InputImport(name="agentId", required=true)
    private final String agentId;

    public String getAgentId() {
        return this.agentId;
    }

    @InputImport(name="environmentId", required=true)
    private final String environmentId;

    public String getEnvironmentId() {
        return this.environmentId;
    }

    @InputImport(name="experimentId", required=true)
    private final String experimentId;

    public String getExperimentId() {
        return this.experimentId;
    }

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetExperimentArgs(
        String agentId,
        String environmentId,
        String experimentId,
        String location,
        @Nullable String project) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.experimentId = Objects.requireNonNull(experimentId, "expected parameter 'experimentId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetExperimentArgs() {
        this.agentId = null;
        this.environmentId = null;
        this.experimentId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String environmentId;
        private String experimentId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperimentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.environmentId = defaults.environmentId;
    	      this.experimentId = defaults.experimentId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setEnvironmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder setExperimentId(String experimentId) {
            this.experimentId = Objects.requireNonNull(experimentId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetExperimentArgs build() {
            return new GetExperimentArgs(agentId, environmentId, experimentId, location, project);
        }
    }
}