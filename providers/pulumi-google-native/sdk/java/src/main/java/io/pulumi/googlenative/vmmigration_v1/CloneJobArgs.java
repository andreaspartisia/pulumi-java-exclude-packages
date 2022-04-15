// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloneJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloneJobArgs Empty = new CloneJobArgs();

    @Import(name="cloneJobId", required=true)
      private final Output<String> cloneJobId;

    public Output<String> cloneJobId() {
        return this.cloneJobId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="migratingVmId", required=true)
      private final Output<String> migratingVmId;

    public Output<String> migratingVmId() {
        return this.migratingVmId;
    }

    /**
     * The name of the clone.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    @Import(name="sourceId", required=true)
      private final Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    public CloneJobArgs(
        Output<String> cloneJobId,
        @Nullable Output<String> location,
        Output<String> migratingVmId,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        Output<String> sourceId) {
        this.cloneJobId = Objects.requireNonNull(cloneJobId, "expected parameter 'cloneJobId' to be non-null");
        this.location = location;
        this.migratingVmId = Objects.requireNonNull(migratingVmId, "expected parameter 'migratingVmId' to be non-null");
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
    }

    private CloneJobArgs() {
        this.cloneJobId = Codegen.empty();
        this.location = Codegen.empty();
        this.migratingVmId = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.sourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cloneJobId;
        private @Nullable Output<String> location;
        private Output<String> migratingVmId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private Output<String> sourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(CloneJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloneJobId = defaults.cloneJobId;
    	      this.location = defaults.location;
    	      this.migratingVmId = defaults.migratingVmId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.sourceId = defaults.sourceId;
        }

        public Builder cloneJobId(Output<String> cloneJobId) {
            this.cloneJobId = Objects.requireNonNull(cloneJobId);
            return this;
        }
        public Builder cloneJobId(String cloneJobId) {
            this.cloneJobId = Output.of(Objects.requireNonNull(cloneJobId));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder migratingVmId(Output<String> migratingVmId) {
            this.migratingVmId = Objects.requireNonNull(migratingVmId);
            return this;
        }
        public Builder migratingVmId(String migratingVmId) {
            this.migratingVmId = Output.of(Objects.requireNonNull(migratingVmId));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder sourceId(Output<String> sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Output.of(Objects.requireNonNull(sourceId));
            return this;
        }        public CloneJobArgs build() {
            return new CloneJobArgs(cloneJobId, location, migratingVmId, name, project, requestId, sourceId);
        }
    }
}
