// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.runtimeconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConfigResult {
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final @Nullable String project;

    @OutputCustomType.Constructor
    private GetConfigResult(
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("project") @Nullable String project) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.project = project;
    }

    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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
        public GetConfigResult build() {
            return new GetConfigResult(description, id, name, project);
        }
    }
}
