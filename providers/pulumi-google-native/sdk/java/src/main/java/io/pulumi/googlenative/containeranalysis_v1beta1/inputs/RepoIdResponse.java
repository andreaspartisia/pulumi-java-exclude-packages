// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.ProjectRepoIdResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A unique identifier for a Cloud Repo.
 * 
 */
public final class RepoIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final RepoIdResponse Empty = new RepoIdResponse();

    /**
     * A combination of a project ID and a repo name.
     * 
     */
    @Import(name="projectRepoId", required=true)
      private final ProjectRepoIdResponse projectRepoId;

    public ProjectRepoIdResponse projectRepoId() {
        return this.projectRepoId;
    }

    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    @Import(name="uid", required=true)
      private final String uid;

    public String uid() {
        return this.uid;
    }

    public RepoIdResponse(
        ProjectRepoIdResponse projectRepoId,
        String uid) {
        this.projectRepoId = Objects.requireNonNull(projectRepoId, "expected parameter 'projectRepoId' to be non-null");
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
    }

    private RepoIdResponse() {
        this.projectRepoId = null;
        this.uid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectRepoIdResponse projectRepoId;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectRepoId = defaults.projectRepoId;
    	      this.uid = defaults.uid;
        }

        public Builder projectRepoId(ProjectRepoIdResponse projectRepoId) {
            this.projectRepoId = Objects.requireNonNull(projectRepoId);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public RepoIdResponse build() {
            return new RepoIdResponse(projectRepoId, uid);
        }
    }
}
