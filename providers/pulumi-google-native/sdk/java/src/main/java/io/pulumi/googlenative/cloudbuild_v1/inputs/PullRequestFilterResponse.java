// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * PullRequestFilter contains filter properties for matching GitHub Pull Requests.
 * 
 */
public final class PullRequestFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final PullRequestFilterResponse Empty = new PullRequestFilterResponse();

    /**
     * Regex of branches to match. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="branch", required=true)
      private final String branch;

    public String branch() {
        return this.branch;
    }

    /**
     * Configure builds to run whether a repository owner or collaborator need to comment `/gcbrun`.
     * 
     */
    @Import(name="commentControl", required=true)
      private final String commentControl;

    public String commentControl() {
        return this.commentControl;
    }

    /**
     * If true, branches that do NOT match the git_ref will trigger a build.
     * 
     */
    @Import(name="invertRegex", required=true)
      private final Boolean invertRegex;

    public Boolean invertRegex() {
        return this.invertRegex;
    }

    public PullRequestFilterResponse(
        String branch,
        String commentControl,
        Boolean invertRegex) {
        this.branch = Objects.requireNonNull(branch, "expected parameter 'branch' to be non-null");
        this.commentControl = Objects.requireNonNull(commentControl, "expected parameter 'commentControl' to be non-null");
        this.invertRegex = Objects.requireNonNull(invertRegex, "expected parameter 'invertRegex' to be non-null");
    }

    private PullRequestFilterResponse() {
        this.branch = null;
        this.commentControl = null;
        this.invertRegex = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PullRequestFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branch;
        private String commentControl;
        private Boolean invertRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(PullRequestFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commentControl = defaults.commentControl;
    	      this.invertRegex = defaults.invertRegex;
        }

        public Builder branch(String branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }
        public Builder commentControl(String commentControl) {
            this.commentControl = Objects.requireNonNull(commentControl);
            return this;
        }
        public Builder invertRegex(Boolean invertRegex) {
            this.invertRegex = Objects.requireNonNull(invertRegex);
            return this;
        }        public PullRequestFilterResponse build() {
            return new PullRequestFilterResponse(branch, commentControl, invertRegex);
        }
    }
}
