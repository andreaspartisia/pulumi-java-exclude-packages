// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.enums.GitFileSourceRepoType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GitFileSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GitFileSourceArgs Empty = new GitFileSourceArgs();

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="repoType")
    private final @Nullable Input<GitFileSourceRepoType> repoType;

    public Input<GitFileSourceRepoType> getRepoType() {
        return this.repoType == null ? Input.empty() : this.repoType;
    }

    @InputImport(name="revision")
    private final @Nullable Input<String> revision;

    public Input<String> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public GitFileSourceArgs(
        @Nullable Input<String> path,
        @Nullable Input<GitFileSourceRepoType> repoType,
        @Nullable Input<String> revision,
        @Nullable Input<String> uri) {
        this.path = path;
        this.repoType = repoType;
        this.revision = revision;
        this.uri = uri;
    }

    private GitFileSourceArgs() {
        this.path = Input.empty();
        this.repoType = Input.empty();
        this.revision = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitFileSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> path;
        private @Nullable Input<GitFileSourceRepoType> repoType;
        private @Nullable Input<String> revision;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GitFileSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.repoType = defaults.repoType;
    	      this.revision = defaults.revision;
    	      this.uri = defaults.uri;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setRepoType(@Nullable Input<GitFileSourceRepoType> repoType) {
            this.repoType = repoType;
            return this;
        }

        public Builder setRepoType(@Nullable GitFileSourceRepoType repoType) {
            this.repoType = Input.ofNullable(repoType);
            return this;
        }

        public Builder setRevision(@Nullable Input<String> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable String revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public GitFileSourceArgs build() {
            return new GitFileSourceArgs(path, repoType, revision, uri);
        }
    }
}