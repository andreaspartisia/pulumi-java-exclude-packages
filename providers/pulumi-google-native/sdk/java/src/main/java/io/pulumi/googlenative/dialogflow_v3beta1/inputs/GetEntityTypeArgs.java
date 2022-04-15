// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntityTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEntityTypeArgs Empty = new GetEntityTypeArgs();

    @Import(name="agentId", required=true)
      private final String agentId;

    public String agentId() {
        return this.agentId;
    }

    @Import(name="entityTypeId", required=true)
      private final String entityTypeId;

    public String entityTypeId() {
        return this.entityTypeId;
    }

    @Import(name="languageCode")
      private final @Nullable String languageCode;

    public Optional<String> languageCode() {
        return this.languageCode == null ? Optional.empty() : Optional.ofNullable(this.languageCode);
    }

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetEntityTypeArgs(
        String agentId,
        String entityTypeId,
        @Nullable String languageCode,
        String location,
        @Nullable String project) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.entityTypeId = Objects.requireNonNull(entityTypeId, "expected parameter 'entityTypeId' to be non-null");
        this.languageCode = languageCode;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetEntityTypeArgs() {
        this.agentId = null;
        this.entityTypeId = null;
        this.languageCode = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String entityTypeId;
        private @Nullable String languageCode;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.entityTypeId = defaults.entityTypeId;
    	      this.languageCode = defaults.languageCode;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder agentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }
        public Builder entityTypeId(String entityTypeId) {
            this.entityTypeId = Objects.requireNonNull(entityTypeId);
            return this;
        }
        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetEntityTypeArgs build() {
            return new GetEntityTypeArgs(agentId, entityTypeId, languageCode, location, project);
        }
    }
}
