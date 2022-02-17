// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectDefaultNetworkTierArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectDefaultNetworkTierArgs Empty = new ProjectDefaultNetworkTierArgs();

    /**
     * The default network tier to be configured for the project.
     * This field can take the following values: `PREMIUM` or `STANDARD`.
     * 
     */
    @InputImport(name="networkTier", required=true)
    private final Input<String> networkTier;

    public Input<String> getNetworkTier() {
        return this.networkTier;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ProjectDefaultNetworkTierArgs(
        Input<String> networkTier,
        @Nullable Input<String> project) {
        this.networkTier = Objects.requireNonNull(networkTier, "expected parameter 'networkTier' to be non-null");
        this.project = project;
    }

    private ProjectDefaultNetworkTierArgs() {
        this.networkTier = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectDefaultNetworkTierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> networkTier;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectDefaultNetworkTierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkTier = defaults.networkTier;
    	      this.project = defaults.project;
        }

        public Builder setNetworkTier(Input<String> networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Input.of(Objects.requireNonNull(networkTier));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public ProjectDefaultNetworkTierArgs build() {
            return new ProjectDefaultNetworkTierArgs(networkTier, project);
        }
    }
}