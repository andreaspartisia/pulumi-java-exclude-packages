// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1.inputs.AliasContextArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.RepoIdArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CloudRepoSourceContext denotes a particular revision in a Google Cloud Source Repo.
 * 
 */
public final class CloudRepoSourceContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudRepoSourceContextArgs Empty = new CloudRepoSourceContextArgs();

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    @Import(name="aliasContext")
      private final @Nullable Output<AliasContextArgs> aliasContext;

    public Output<AliasContextArgs> aliasContext() {
        return this.aliasContext == null ? Codegen.empty() : this.aliasContext;
    }

    /**
     * The ID of the repo.
     * 
     */
    @Import(name="repoId")
      private final @Nullable Output<RepoIdArgs> repoId;

    public Output<RepoIdArgs> repoId() {
        return this.repoId == null ? Codegen.empty() : this.repoId;
    }

    /**
     * A revision ID.
     * 
     */
    @Import(name="revisionId")
      private final @Nullable Output<String> revisionId;

    public Output<String> revisionId() {
        return this.revisionId == null ? Codegen.empty() : this.revisionId;
    }

    public CloudRepoSourceContextArgs(
        @Nullable Output<AliasContextArgs> aliasContext,
        @Nullable Output<RepoIdArgs> repoId,
        @Nullable Output<String> revisionId) {
        this.aliasContext = aliasContext;
        this.repoId = repoId;
        this.revisionId = revisionId;
    }

    private CloudRepoSourceContextArgs() {
        this.aliasContext = Codegen.empty();
        this.repoId = Codegen.empty();
        this.revisionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRepoSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AliasContextArgs> aliasContext;
        private @Nullable Output<RepoIdArgs> repoId;
        private @Nullable Output<String> revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudRepoSourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasContext = defaults.aliasContext;
    	      this.repoId = defaults.repoId;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder aliasContext(@Nullable Output<AliasContextArgs> aliasContext) {
            this.aliasContext = aliasContext;
            return this;
        }
        public Builder aliasContext(@Nullable AliasContextArgs aliasContext) {
            this.aliasContext = Codegen.ofNullable(aliasContext);
            return this;
        }
        public Builder repoId(@Nullable Output<RepoIdArgs> repoId) {
            this.repoId = repoId;
            return this;
        }
        public Builder repoId(@Nullable RepoIdArgs repoId) {
            this.repoId = Codegen.ofNullable(repoId);
            return this;
        }
        public Builder revisionId(@Nullable Output<String> revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public Builder revisionId(@Nullable String revisionId) {
            this.revisionId = Codegen.ofNullable(revisionId);
            return this;
        }        public CloudRepoSourceContextArgs build() {
            return new CloudRepoSourceContextArgs(aliasContext, repoId, revisionId);
        }
    }
}
