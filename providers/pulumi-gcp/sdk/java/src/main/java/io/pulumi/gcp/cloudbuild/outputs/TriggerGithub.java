// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudbuild.outputs.TriggerGithubPullRequest;
import io.pulumi.gcp.cloudbuild.outputs.TriggerGithubPush;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerGithub {
    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    private final @Nullable String name;
    /**
     * Owner of the repository. For example: The owner for
     * https://github.com/googlecloudplatform/cloud-builders is "googlecloudplatform".
     * 
     */
    private final @Nullable String owner;
    /**
     * filter to match changes in pull requests. Specify only one of `pull_request` or `push`.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerGithubPullRequest pullRequest;
    /**
     * filter to match changes in refs, like branches or tags. Specify only one of `pull_request` or `push`.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerGithubPush push;

    @OutputCustomType.Constructor
    private TriggerGithub(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("owner") @Nullable String owner,
        @OutputCustomType.Parameter("pullRequest") @Nullable TriggerGithubPullRequest pullRequest,
        @OutputCustomType.Parameter("push") @Nullable TriggerGithubPush push) {
        this.name = name;
        this.owner = owner;
        this.pullRequest = pullRequest;
        this.push = push;
    }

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Owner of the repository. For example: The owner for
     * https://github.com/googlecloudplatform/cloud-builders is "googlecloudplatform".
     * 
    */
    public Optional<String> getOwner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * filter to match changes in pull requests. Specify only one of `pull_request` or `push`.
     * Structure is documented below.
     * 
    */
    public Optional<TriggerGithubPullRequest> getPullRequest() {
        return Optional.ofNullable(this.pullRequest);
    }
    /**
     * filter to match changes in refs, like branches or tags. Specify only one of `pull_request` or `push`.
     * Structure is documented below.
     * 
    */
    public Optional<TriggerGithubPush> getPush() {
        return Optional.ofNullable(this.push);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerGithub defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String owner;
        private @Nullable TriggerGithubPullRequest pullRequest;
        private @Nullable TriggerGithubPush push;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerGithub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.pullRequest = defaults.pullRequest;
    	      this.push = defaults.push;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setPullRequest(@Nullable TriggerGithubPullRequest pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        public Builder setPush(@Nullable TriggerGithubPush push) {
            this.push = push;
            return this;
        }
        public TriggerGithub build() {
            return new TriggerGithub(name, owner, pullRequest, push);
        }
    }
}
