// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.notebooks_v1.inputs.ContainerImageArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.VmImageArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Use a container image to start the notebook instance.
     * 
     */
    @Import(name="containerImage")
      private final @Nullable Output<ContainerImageArgs> containerImage;

    public Output<ContainerImageArgs> containerImage() {
        return this.containerImage == null ? Codegen.empty() : this.containerImage;
    }

    /**
     * A brief description of this environment.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Display name of this environment for the UI.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    @Import(name="environmentId", required=true)
      private final Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `"gs://path-to-file/file-name"`
     * 
     */
    @Import(name="postStartupScript")
      private final @Nullable Output<String> postStartupScript;

    public Output<String> postStartupScript() {
        return this.postStartupScript == null ? Codegen.empty() : this.postStartupScript;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * 
     */
    @Import(name="vmImage")
      private final @Nullable Output<VmImageArgs> vmImage;

    public Output<VmImageArgs> vmImage() {
        return this.vmImage == null ? Codegen.empty() : this.vmImage;
    }

    public EnvironmentArgs(
        @Nullable Output<ContainerImageArgs> containerImage,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        Output<String> environmentId,
        @Nullable Output<String> location,
        @Nullable Output<String> postStartupScript,
        @Nullable Output<String> project,
        @Nullable Output<VmImageArgs> vmImage) {
        this.containerImage = containerImage;
        this.description = description;
        this.displayName = displayName;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.location = location;
        this.postStartupScript = postStartupScript;
        this.project = project;
        this.vmImage = vmImage;
    }

    private EnvironmentArgs() {
        this.containerImage = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.environmentId = Codegen.empty();
        this.location = Codegen.empty();
        this.postStartupScript = Codegen.empty();
        this.project = Codegen.empty();
        this.vmImage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ContainerImageArgs> containerImage;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private Output<String> environmentId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> postStartupScript;
        private @Nullable Output<String> project;
        private @Nullable Output<VmImageArgs> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerImage = defaults.containerImage;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.environmentId = defaults.environmentId;
    	      this.location = defaults.location;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.project = defaults.project;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder containerImage(@Nullable Output<ContainerImageArgs> containerImage) {
            this.containerImage = containerImage;
            return this;
        }
        public Builder containerImage(@Nullable ContainerImageArgs containerImage) {
            this.containerImage = Codegen.ofNullable(containerImage);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder environmentId(Output<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Output.of(Objects.requireNonNull(environmentId));
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
        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }
        public Builder postStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = Codegen.ofNullable(postStartupScript);
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
        public Builder vmImage(@Nullable Output<VmImageArgs> vmImage) {
            this.vmImage = vmImage;
            return this;
        }
        public Builder vmImage(@Nullable VmImageArgs vmImage) {
            this.vmImage = Codegen.ofNullable(vmImage);
            return this;
        }        public EnvironmentArgs build() {
            return new EnvironmentArgs(containerImage, description, displayName, environmentId, location, postStartupScript, project, vmImage);
        }
    }
}
