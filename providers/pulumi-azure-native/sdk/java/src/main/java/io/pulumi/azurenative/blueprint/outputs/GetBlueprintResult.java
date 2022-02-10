// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.azurenative.blueprint.outputs.BlueprintStatusResponse;
import io.pulumi.azurenative.blueprint.outputs.ParameterDefinitionResponse;
import io.pulumi.azurenative.blueprint.outputs.ResourceGroupDefinitionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBlueprintResult {
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final String id;
    private final Object layout;
    private final String name;
    private final @Nullable Map<String,ParameterDefinitionResponse> parameters;
    private final @Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups;
    private final BlueprintStatusResponse status;
    private final String targetScope;
    private final String type;
    private final @Nullable Object versions;

    @OutputCustomType.Constructor({"description","displayName","id","layout","name","parameters","resourceGroups","status","targetScope","type","versions"})
    private GetBlueprintResult(
        @Nullable String description,
        @Nullable String displayName,
        String id,
        Object layout,
        String name,
        @Nullable Map<String,ParameterDefinitionResponse> parameters,
        @Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups,
        BlueprintStatusResponse status,
        String targetScope,
        String type,
        @Nullable Object versions) {
        this.description = description;
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.layout = Objects.requireNonNull(layout);
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.resourceGroups = resourceGroups;
        this.status = Objects.requireNonNull(status);
        this.targetScope = Objects.requireNonNull(targetScope);
        this.type = Objects.requireNonNull(type);
        this.versions = versions;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public String getId() {
        return this.id;
    }
    public Object getLayout() {
        return this.layout;
    }
    public String getName() {
        return this.name;
    }
    public Map<String,ParameterDefinitionResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Map<String,ResourceGroupDefinitionResponse> getResourceGroups() {
        return this.resourceGroups == null ? Map.of() : this.resourceGroups;
    }
    public BlueprintStatusResponse getStatus() {
        return this.status;
    }
    public String getTargetScope() {
        return this.targetScope;
    }
    public String getType() {
        return this.type;
    }
    public Optional<Object> getVersions() {
        return Optional.ofNullable(this.versions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlueprintResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private Object layout;
        private String name;
        private @Nullable Map<String,ParameterDefinitionResponse> parameters;
        private @Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups;
        private BlueprintStatusResponse status;
        private String targetScope;
        private String type;
        private @Nullable Object versions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlueprintResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.layout = defaults.layout;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.status = defaults.status;
    	      this.targetScope = defaults.targetScope;
    	      this.type = defaults.type;
    	      this.versions = defaults.versions;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLayout(Object layout) {
            this.layout = Objects.requireNonNull(layout);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterDefinitionResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setResourceGroups(@Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        public Builder setStatus(BlueprintStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTargetScope(String targetScope) {
            this.targetScope = Objects.requireNonNull(targetScope);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersions(@Nullable Object versions) {
            this.versions = versions;
            return this;
        }

        public GetBlueprintResult build() {
            return new GetBlueprintResult(description, displayName, id, layout, name, parameters, resourceGroups, status, targetScope, type, versions);
        }
    }
}