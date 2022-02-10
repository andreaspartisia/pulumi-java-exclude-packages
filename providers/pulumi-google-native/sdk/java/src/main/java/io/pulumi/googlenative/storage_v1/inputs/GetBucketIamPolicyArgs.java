// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBucketIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBucketIamPolicyArgs Empty = new GetBucketIamPolicyArgs();

    @InputImport(name="bucket", required=true)
    private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    @InputImport(name="optionsRequestedPolicyVersion")
    private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @InputImport(name="provisionalUserProject")
    private final @Nullable String provisionalUserProject;

    public Optional<String> getProvisionalUserProject() {
        return this.provisionalUserProject == null ? Optional.empty() : Optional.ofNullable(this.provisionalUserProject);
    }

    @InputImport(name="userProject")
    private final @Nullable String userProject;

    public Optional<String> getUserProject() {
        return this.userProject == null ? Optional.empty() : Optional.ofNullable(this.userProject);
    }

    public GetBucketIamPolicyArgs(
        String bucket,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String provisionalUserProject,
        @Nullable String userProject) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.provisionalUserProject = provisionalUserProject;
        this.userProject = userProject;
    }

    private GetBucketIamPolicyArgs() {
        this.bucket = null;
        this.optionsRequestedPolicyVersion = null;
        this.provisionalUserProject = null;
        this.userProject = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String provisionalUserProject;
        private @Nullable String userProject;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.provisionalUserProject = defaults.provisionalUserProject;
    	      this.userProject = defaults.userProject;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setOptionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder setProvisionalUserProject(@Nullable String provisionalUserProject) {
            this.provisionalUserProject = provisionalUserProject;
            return this;
        }

        public Builder setUserProject(@Nullable String userProject) {
            this.userProject = userProject;
            return this;
        }

        public GetBucketIamPolicyArgs build() {
            return new GetBucketIamPolicyArgs(bucket, optionsRequestedPolicyVersion, provisionalUserProject, userProject);
        }
    }
}