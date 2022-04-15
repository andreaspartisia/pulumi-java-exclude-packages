// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPageArgs Empty = new GetPageArgs();

    @Import(name="agentId", required=true)
      private final String agentId;

    public String agentId() {
        return this.agentId;
    }

    @Import(name="flowId", required=true)
      private final String flowId;

    public String flowId() {
        return this.flowId;
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

    @Import(name="pageId", required=true)
      private final String pageId;

    public String pageId() {
        return this.pageId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetPageArgs(
        String agentId,
        String flowId,
        @Nullable String languageCode,
        String location,
        String pageId,
        @Nullable String project) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.flowId = Objects.requireNonNull(flowId, "expected parameter 'flowId' to be non-null");
        this.languageCode = languageCode;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.pageId = Objects.requireNonNull(pageId, "expected parameter 'pageId' to be non-null");
        this.project = project;
    }

    private GetPageArgs() {
        this.agentId = null;
        this.flowId = null;
        this.languageCode = null;
        this.location = null;
        this.pageId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String flowId;
        private @Nullable String languageCode;
        private String location;
        private String pageId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.flowId = defaults.flowId;
    	      this.languageCode = defaults.languageCode;
    	      this.location = defaults.location;
    	      this.pageId = defaults.pageId;
    	      this.project = defaults.project;
        }

        public Builder agentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }
        public Builder flowId(String flowId) {
            this.flowId = Objects.requireNonNull(flowId);
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
        public Builder pageId(String pageId) {
            this.pageId = Objects.requireNonNull(pageId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetPageArgs build() {
            return new GetPageArgs(agentId, flowId, languageCode, location, pageId, project);
        }
    }
}
