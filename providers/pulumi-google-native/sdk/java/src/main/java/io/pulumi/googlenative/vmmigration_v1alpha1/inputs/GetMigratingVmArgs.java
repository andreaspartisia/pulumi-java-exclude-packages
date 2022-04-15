// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMigratingVmArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMigratingVmArgs Empty = new GetMigratingVmArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="migratingVmId", required=true)
      private final String migratingVmId;

    public String migratingVmId() {
        return this.migratingVmId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="sourceId", required=true)
      private final String sourceId;

    public String sourceId() {
        return this.sourceId;
    }

    @Import(name="view")
      private final @Nullable String view;

    public Optional<String> view() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetMigratingVmArgs(
        String location,
        String migratingVmId,
        @Nullable String project,
        String sourceId,
        @Nullable String view) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.migratingVmId = Objects.requireNonNull(migratingVmId, "expected parameter 'migratingVmId' to be non-null");
        this.project = project;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
        this.view = view;
    }

    private GetMigratingVmArgs() {
        this.location = null;
        this.migratingVmId = null;
        this.project = null;
        this.sourceId = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigratingVmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String migratingVmId;
        private @Nullable String project;
        private String sourceId;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigratingVmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.migratingVmId = defaults.migratingVmId;
    	      this.project = defaults.project;
    	      this.sourceId = defaults.sourceId;
    	      this.view = defaults.view;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder migratingVmId(String migratingVmId) {
            this.migratingVmId = Objects.requireNonNull(migratingVmId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder view(@Nullable String view) {
            this.view = view;
            return this;
        }        public GetMigratingVmArgs build() {
            return new GetMigratingVmArgs(location, migratingVmId, project, sourceId, view);
        }
    }
}
