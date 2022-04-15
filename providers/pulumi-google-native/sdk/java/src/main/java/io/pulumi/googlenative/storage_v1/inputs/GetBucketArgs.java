// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBucketArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBucketArgs Empty = new GetBucketArgs();

    @Import(name="bucket", required=true)
      private final String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="ifMetagenerationMatch")
      private final @Nullable String ifMetagenerationMatch;

    public Optional<String> ifMetagenerationMatch() {
        return this.ifMetagenerationMatch == null ? Optional.empty() : Optional.ofNullable(this.ifMetagenerationMatch);
    }

    @Import(name="ifMetagenerationNotMatch")
      private final @Nullable String ifMetagenerationNotMatch;

    public Optional<String> ifMetagenerationNotMatch() {
        return this.ifMetagenerationNotMatch == null ? Optional.empty() : Optional.ofNullable(this.ifMetagenerationNotMatch);
    }

    @Import(name="projection")
      private final @Nullable String projection;

    public Optional<String> projection() {
        return this.projection == null ? Optional.empty() : Optional.ofNullable(this.projection);
    }

    @Import(name="provisionalUserProject")
      private final @Nullable String provisionalUserProject;

    public Optional<String> provisionalUserProject() {
        return this.provisionalUserProject == null ? Optional.empty() : Optional.ofNullable(this.provisionalUserProject);
    }

    @Import(name="userProject")
      private final @Nullable String userProject;

    public Optional<String> userProject() {
        return this.userProject == null ? Optional.empty() : Optional.ofNullable(this.userProject);
    }

    public GetBucketArgs(
        String bucket,
        @Nullable String ifMetagenerationMatch,
        @Nullable String ifMetagenerationNotMatch,
        @Nullable String projection,
        @Nullable String provisionalUserProject,
        @Nullable String userProject) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.ifMetagenerationMatch = ifMetagenerationMatch;
        this.ifMetagenerationNotMatch = ifMetagenerationNotMatch;
        this.projection = projection;
        this.provisionalUserProject = provisionalUserProject;
        this.userProject = userProject;
    }

    private GetBucketArgs() {
        this.bucket = null;
        this.ifMetagenerationMatch = null;
        this.ifMetagenerationNotMatch = null;
        this.projection = null;
        this.provisionalUserProject = null;
        this.userProject = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String ifMetagenerationMatch;
        private @Nullable String ifMetagenerationNotMatch;
        private @Nullable String projection;
        private @Nullable String provisionalUserProject;
        private @Nullable String userProject;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.ifMetagenerationMatch = defaults.ifMetagenerationMatch;
    	      this.ifMetagenerationNotMatch = defaults.ifMetagenerationNotMatch;
    	      this.projection = defaults.projection;
    	      this.provisionalUserProject = defaults.provisionalUserProject;
    	      this.userProject = defaults.userProject;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder ifMetagenerationMatch(@Nullable String ifMetagenerationMatch) {
            this.ifMetagenerationMatch = ifMetagenerationMatch;
            return this;
        }
        public Builder ifMetagenerationNotMatch(@Nullable String ifMetagenerationNotMatch) {
            this.ifMetagenerationNotMatch = ifMetagenerationNotMatch;
            return this;
        }
        public Builder projection(@Nullable String projection) {
            this.projection = projection;
            return this;
        }
        public Builder provisionalUserProject(@Nullable String provisionalUserProject) {
            this.provisionalUserProject = provisionalUserProject;
            return this;
        }
        public Builder userProject(@Nullable String userProject) {
            this.userProject = userProject;
            return this;
        }        public GetBucketArgs build() {
            return new GetBucketArgs(bucket, ifMetagenerationMatch, ifMetagenerationNotMatch, projection, provisionalUserProject, userProject);
        }
    }
}
