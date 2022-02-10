// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1PropertiesResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentResult {
    private final String apiProxyType;
    private final String createdAt;
    private final String deploymentType;
    private final String description;
    private final String displayName;
    private final String lastModifiedAt;
    private final String name;
    private final GoogleCloudApigeeV1PropertiesResponse properties;
    private final String state;

    @OutputCustomType.Constructor({"apiProxyType","createdAt","deploymentType","description","displayName","lastModifiedAt","name","properties","state"})
    private GetEnvironmentResult(
        String apiProxyType,
        String createdAt,
        String deploymentType,
        String description,
        String displayName,
        String lastModifiedAt,
        String name,
        GoogleCloudApigeeV1PropertiesResponse properties,
        String state) {
        this.apiProxyType = Objects.requireNonNull(apiProxyType);
        this.createdAt = Objects.requireNonNull(createdAt);
        this.deploymentType = Objects.requireNonNull(deploymentType);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.state = Objects.requireNonNull(state);
    }

    public String getApiProxyType() {
        return this.apiProxyType;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }
    public String getDescription() {
        return this.description;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    public String getName() {
        return this.name;
    }
    public GoogleCloudApigeeV1PropertiesResponse getProperties() {
        return this.properties;
    }
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiProxyType;
        private String createdAt;
        private String deploymentType;
        private String description;
        private String displayName;
        private String lastModifiedAt;
        private String name;
        private GoogleCloudApigeeV1PropertiesResponse properties;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProxyType = defaults.apiProxyType;
    	      this.createdAt = defaults.createdAt;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.state = defaults.state;
        }

        public Builder setApiProxyType(String apiProxyType) {
            this.apiProxyType = Objects.requireNonNull(apiProxyType);
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setDeploymentType(String deploymentType) {
            this.deploymentType = Objects.requireNonNull(deploymentType);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setLastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(GoogleCloudApigeeV1PropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(apiProxyType, createdAt, deploymentType, description, displayName, lastModifiedAt, name, properties, state);
        }
    }
}