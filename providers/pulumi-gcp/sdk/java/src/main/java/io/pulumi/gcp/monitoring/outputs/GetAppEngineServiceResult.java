// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.GetAppEngineServiceTelemetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAppEngineServiceResult {
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String moduleId;
    private final String name;
    private final @Nullable String project;
    private final String serviceId;
    private final List<GetAppEngineServiceTelemetry> telemetries;

    @OutputCustomType.Constructor
    private GetAppEngineServiceResult(
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("moduleId") String moduleId,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("project") @Nullable String project,
        @OutputCustomType.Parameter("serviceId") String serviceId,
        @OutputCustomType.Parameter("telemetries") List<GetAppEngineServiceTelemetry> telemetries) {
        this.displayName = displayName;
        this.id = id;
        this.moduleId = moduleId;
        this.name = name;
        this.project = project;
        this.serviceId = serviceId;
        this.telemetries = telemetries;
    }

    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getModuleId() {
        return this.moduleId;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getServiceId() {
        return this.serviceId;
    }
    public List<GetAppEngineServiceTelemetry> getTelemetries() {
        return this.telemetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppEngineServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private String moduleId;
        private String name;
        private @Nullable String project;
        private String serviceId;
        private List<GetAppEngineServiceTelemetry> telemetries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppEngineServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.moduleId = defaults.moduleId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.telemetries = defaults.telemetries;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setModuleId(String moduleId) {
            this.moduleId = Objects.requireNonNull(moduleId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setTelemetries(List<GetAppEngineServiceTelemetry> telemetries) {
            this.telemetries = Objects.requireNonNull(telemetries);
            return this;
        }
        public GetAppEngineServiceResult build() {
            return new GetAppEngineServiceResult(displayName, id, moduleId, name, project, serviceId, telemetries);
        }
    }
}
