// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sourcerepo;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * Resource name of the repository, of the form `{{repo}}`.
     * The repo name may contain slashes. eg, `name/with/slash`
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * How this repository publishes a change in the repository through Cloud Pub/Sub.
     * Keyed by the topic names.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pubsubConfigs")
    private final @Nullable Input<List<RepositoryPubsubConfigArgs>> pubsubConfigs;

    public Input<List<RepositoryPubsubConfigArgs>> getPubsubConfigs() {
        return this.pubsubConfigs == null ? Input.empty() : this.pubsubConfigs;
    }

    public RepositoryArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<List<RepositoryPubsubConfigArgs>> pubsubConfigs) {
        this.name = name;
        this.project = project;
        this.pubsubConfigs = pubsubConfigs;
    }

    private RepositoryArgs() {
        this.name = Input.empty();
        this.project = Input.empty();
        this.pubsubConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<List<RepositoryPubsubConfigArgs>> pubsubConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pubsubConfigs = defaults.pubsubConfigs;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setPubsubConfigs(@Nullable Input<List<RepositoryPubsubConfigArgs>> pubsubConfigs) {
            this.pubsubConfigs = pubsubConfigs;
            return this;
        }

        public Builder setPubsubConfigs(@Nullable List<RepositoryPubsubConfigArgs> pubsubConfigs) {
            this.pubsubConfigs = Input.ofNullable(pubsubConfigs);
            return this;
        }

        public RepositoryArgs build() {
            return new RepositoryArgs(name, project, pubsubConfigs);
        }
    }
}