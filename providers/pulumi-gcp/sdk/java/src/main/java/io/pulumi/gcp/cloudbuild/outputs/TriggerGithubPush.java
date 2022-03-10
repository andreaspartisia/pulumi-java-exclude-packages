// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerGithubPush {
    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    private final @Nullable String branch;
    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    private final @Nullable Boolean invertRegex;
    /**
     * Regex of tags to match.  Specify only one of branch or tag.
     * 
     */
    private final @Nullable String tag;

    @OutputCustomType.Constructor
    private TriggerGithubPush(
        @OutputCustomType.Parameter("branch") @Nullable String branch,
        @OutputCustomType.Parameter("invertRegex") @Nullable Boolean invertRegex,
        @OutputCustomType.Parameter("tag") @Nullable String tag) {
        this.branch = branch;
        this.invertRegex = invertRegex;
        this.tag = tag;
    }

    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
    */
    public Optional<String> getBranch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
    */
    public Optional<Boolean> getInvertRegex() {
        return Optional.ofNullable(this.invertRegex);
    }
    /**
     * Regex of tags to match.  Specify only one of branch or tag.
     * 
    */
    public Optional<String> getTag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerGithubPush defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private @Nullable Boolean invertRegex;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerGithubPush defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.invertRegex = defaults.invertRegex;
    	      this.tag = defaults.tag;
        }

        public Builder setBranch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setInvertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public TriggerGithubPush build() {
            return new TriggerGithubPush(branch, invertRegex, tag);
        }
    }
}
