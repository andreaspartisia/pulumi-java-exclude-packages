// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetRepositoryRefsFilter;
import com.pulumi.oci.DevOps.outputs.GetRepositoryRefsRepositoryRefCollection;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRepositoryRefsResult {
    /**
     * @return Commit ID pointed to by the new branch.
     * 
     */
    private final @Nullable String commitId;
    private final @Nullable List<GetRepositoryRefsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Unique reference name inside a repository.
     * 
     */
    private final @Nullable String refName;
    /**
     * @return The type of reference (BRANCH or TAG).
     * 
     */
    private final @Nullable String refType;
    /**
     * @return The OCID of the repository containing the reference.
     * 
     */
    private final String repositoryId;
    /**
     * @return The list of repository_ref_collection.
     * 
     */
    private final List<GetRepositoryRefsRepositoryRefCollection> repositoryRefCollections;

    @CustomType.Constructor
    private GetRepositoryRefsResult(
        @CustomType.Parameter("commitId") @Nullable String commitId,
        @CustomType.Parameter("filters") @Nullable List<GetRepositoryRefsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("refName") @Nullable String refName,
        @CustomType.Parameter("refType") @Nullable String refType,
        @CustomType.Parameter("repositoryId") String repositoryId,
        @CustomType.Parameter("repositoryRefCollections") List<GetRepositoryRefsRepositoryRefCollection> repositoryRefCollections) {
        this.commitId = commitId;
        this.filters = filters;
        this.id = id;
        this.refName = refName;
        this.refType = refType;
        this.repositoryId = repositoryId;
        this.repositoryRefCollections = repositoryRefCollections;
    }

    /**
     * @return Commit ID pointed to by the new branch.
     * 
     */
    public Optional<String> commitId() {
        return Optional.ofNullable(this.commitId);
    }
    public List<GetRepositoryRefsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique reference name inside a repository.
     * 
     */
    public Optional<String> refName() {
        return Optional.ofNullable(this.refName);
    }
    /**
     * @return The type of reference (BRANCH or TAG).
     * 
     */
    public Optional<String> refType() {
        return Optional.ofNullable(this.refType);
    }
    /**
     * @return The OCID of the repository containing the reference.
     * 
     */
    public String repositoryId() {
        return this.repositoryId;
    }
    /**
     * @return The list of repository_ref_collection.
     * 
     */
    public List<GetRepositoryRefsRepositoryRefCollection> repositoryRefCollections() {
        return this.repositoryRefCollections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryRefsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commitId;
        private @Nullable List<GetRepositoryRefsFilter> filters;
        private String id;
        private @Nullable String refName;
        private @Nullable String refType;
        private String repositoryId;
        private List<GetRepositoryRefsRepositoryRefCollection> repositoryRefCollections;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryRefsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitId = defaults.commitId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.refName = defaults.refName;
    	      this.refType = defaults.refType;
    	      this.repositoryId = defaults.repositoryId;
    	      this.repositoryRefCollections = defaults.repositoryRefCollections;
        }

        public Builder commitId(@Nullable String commitId) {
            this.commitId = commitId;
            return this;
        }
        public Builder filters(@Nullable List<GetRepositoryRefsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetRepositoryRefsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder refName(@Nullable String refName) {
            this.refName = refName;
            return this;
        }
        public Builder refType(@Nullable String refType) {
            this.refType = refType;
            return this;
        }
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }
        public Builder repositoryRefCollections(List<GetRepositoryRefsRepositoryRefCollection> repositoryRefCollections) {
            this.repositoryRefCollections = Objects.requireNonNull(repositoryRefCollections);
            return this;
        }
        public Builder repositoryRefCollections(GetRepositoryRefsRepositoryRefCollection... repositoryRefCollections) {
            return repositoryRefCollections(List.of(repositoryRefCollections));
        }        public GetRepositoryRefsResult build() {
            return new GetRepositoryRefsResult(commitId, filters, id, refName, refType, repositoryId, repositoryRefCollections);
        }
    }
}
