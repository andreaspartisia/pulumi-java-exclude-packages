// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetRepositoryDiffsDiffCollection;
import com.pulumi.oci.DevOps.outputs.GetRepositoryDiffsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRepositoryDiffsResult {
    private final String baseVersion;
    /**
     * @return The list of diff_collection.
     * 
     */
    private final List<GetRepositoryDiffsDiffCollection> diffCollections;
    private final @Nullable List<GetRepositoryDiffsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean isComparisonFromMergeBase;
    private final String repositoryId;
    private final String targetVersion;

    @CustomType.Constructor
    private GetRepositoryDiffsResult(
        @CustomType.Parameter("baseVersion") String baseVersion,
        @CustomType.Parameter("diffCollections") List<GetRepositoryDiffsDiffCollection> diffCollections,
        @CustomType.Parameter("filters") @Nullable List<GetRepositoryDiffsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isComparisonFromMergeBase") @Nullable Boolean isComparisonFromMergeBase,
        @CustomType.Parameter("repositoryId") String repositoryId,
        @CustomType.Parameter("targetVersion") String targetVersion) {
        this.baseVersion = baseVersion;
        this.diffCollections = diffCollections;
        this.filters = filters;
        this.id = id;
        this.isComparisonFromMergeBase = isComparisonFromMergeBase;
        this.repositoryId = repositoryId;
        this.targetVersion = targetVersion;
    }

    public String baseVersion() {
        return this.baseVersion;
    }
    /**
     * @return The list of diff_collection.
     * 
     */
    public List<GetRepositoryDiffsDiffCollection> diffCollections() {
        return this.diffCollections;
    }
    public List<GetRepositoryDiffsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> isComparisonFromMergeBase() {
        return Optional.ofNullable(this.isComparisonFromMergeBase);
    }
    public String repositoryId() {
        return this.repositoryId;
    }
    public String targetVersion() {
        return this.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryDiffsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseVersion;
        private List<GetRepositoryDiffsDiffCollection> diffCollections;
        private @Nullable List<GetRepositoryDiffsFilter> filters;
        private String id;
        private @Nullable Boolean isComparisonFromMergeBase;
        private String repositoryId;
        private String targetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryDiffsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseVersion = defaults.baseVersion;
    	      this.diffCollections = defaults.diffCollections;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.isComparisonFromMergeBase = defaults.isComparisonFromMergeBase;
    	      this.repositoryId = defaults.repositoryId;
    	      this.targetVersion = defaults.targetVersion;
        }

        public Builder baseVersion(String baseVersion) {
            this.baseVersion = Objects.requireNonNull(baseVersion);
            return this;
        }
        public Builder diffCollections(List<GetRepositoryDiffsDiffCollection> diffCollections) {
            this.diffCollections = Objects.requireNonNull(diffCollections);
            return this;
        }
        public Builder diffCollections(GetRepositoryDiffsDiffCollection... diffCollections) {
            return diffCollections(List.of(diffCollections));
        }
        public Builder filters(@Nullable List<GetRepositoryDiffsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetRepositoryDiffsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isComparisonFromMergeBase(@Nullable Boolean isComparisonFromMergeBase) {
            this.isComparisonFromMergeBase = isComparisonFromMergeBase;
            return this;
        }
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = Objects.requireNonNull(targetVersion);
            return this;
        }        public GetRepositoryDiffsResult build() {
            return new GetRepositoryDiffsResult(baseVersion, diffCollections, filters, id, isComparisonFromMergeBase, repositoryId, targetVersion);
        }
    }
}
