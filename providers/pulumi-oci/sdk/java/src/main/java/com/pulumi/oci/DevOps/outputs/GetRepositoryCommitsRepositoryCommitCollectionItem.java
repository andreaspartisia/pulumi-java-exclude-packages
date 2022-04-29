// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRepositoryCommitsRepositoryCommitCollectionItem {
    /**
     * @return Email of the author of the repository.
     * 
     */
    private final String authorEmail;
    /**
     * @return A filter to return any commits that are pushed by the requested author.
     * 
     */
    private final String authorName;
    /**
     * @return Commit hash pointed to by reference name.
     * 
     */
    private final String commitId;
    /**
     * @return A filter to return any commits that contains the given message.
     * 
     */
    private final String commitMessage;
    /**
     * @return Email of who creates the commit.
     * 
     */
    private final String committerEmail;
    /**
     * @return Name of who creates the commit.
     * 
     */
    private final String committerName;
    private final Map<String,Object> definedTags;
    private final Map<String,Object> freeformTags;
    /**
     * @return An array of parent commit IDs of created commit.
     * 
     */
    private final List<String> parentCommitIds;
    /**
     * @return The time at which commit was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return Tree information for the specified commit.
     * 
     */
    private final String treeId;

    @CustomType.Constructor
    private GetRepositoryCommitsRepositoryCommitCollectionItem(
        @CustomType.Parameter("authorEmail") String authorEmail,
        @CustomType.Parameter("authorName") String authorName,
        @CustomType.Parameter("commitId") String commitId,
        @CustomType.Parameter("commitMessage") String commitMessage,
        @CustomType.Parameter("committerEmail") String committerEmail,
        @CustomType.Parameter("committerName") String committerName,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("parentCommitIds") List<String> parentCommitIds,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("treeId") String treeId) {
        this.authorEmail = authorEmail;
        this.authorName = authorName;
        this.commitId = commitId;
        this.commitMessage = commitMessage;
        this.committerEmail = committerEmail;
        this.committerName = committerName;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.parentCommitIds = parentCommitIds;
        this.timeCreated = timeCreated;
        this.treeId = treeId;
    }

    /**
     * @return Email of the author of the repository.
     * 
     */
    public String authorEmail() {
        return this.authorEmail;
    }
    /**
     * @return A filter to return any commits that are pushed by the requested author.
     * 
     */
    public String authorName() {
        return this.authorName;
    }
    /**
     * @return Commit hash pointed to by reference name.
     * 
     */
    public String commitId() {
        return this.commitId;
    }
    /**
     * @return A filter to return any commits that contains the given message.
     * 
     */
    public String commitMessage() {
        return this.commitMessage;
    }
    /**
     * @return Email of who creates the commit.
     * 
     */
    public String committerEmail() {
        return this.committerEmail;
    }
    /**
     * @return Name of who creates the commit.
     * 
     */
    public String committerName() {
        return this.committerName;
    }
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return An array of parent commit IDs of created commit.
     * 
     */
    public List<String> parentCommitIds() {
        return this.parentCommitIds;
    }
    /**
     * @return The time at which commit was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return Tree information for the specified commit.
     * 
     */
    public String treeId() {
        return this.treeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryCommitsRepositoryCommitCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorEmail;
        private String authorName;
        private String commitId;
        private String commitMessage;
        private String committerEmail;
        private String committerName;
        private Map<String,Object> definedTags;
        private Map<String,Object> freeformTags;
        private List<String> parentCommitIds;
        private String timeCreated;
        private String treeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryCommitsRepositoryCommitCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorEmail = defaults.authorEmail;
    	      this.authorName = defaults.authorName;
    	      this.commitId = defaults.commitId;
    	      this.commitMessage = defaults.commitMessage;
    	      this.committerEmail = defaults.committerEmail;
    	      this.committerName = defaults.committerName;
    	      this.definedTags = defaults.definedTags;
    	      this.freeformTags = defaults.freeformTags;
    	      this.parentCommitIds = defaults.parentCommitIds;
    	      this.timeCreated = defaults.timeCreated;
    	      this.treeId = defaults.treeId;
        }

        public Builder authorEmail(String authorEmail) {
            this.authorEmail = Objects.requireNonNull(authorEmail);
            return this;
        }
        public Builder authorName(String authorName) {
            this.authorName = Objects.requireNonNull(authorName);
            return this;
        }
        public Builder commitId(String commitId) {
            this.commitId = Objects.requireNonNull(commitId);
            return this;
        }
        public Builder commitMessage(String commitMessage) {
            this.commitMessage = Objects.requireNonNull(commitMessage);
            return this;
        }
        public Builder committerEmail(String committerEmail) {
            this.committerEmail = Objects.requireNonNull(committerEmail);
            return this;
        }
        public Builder committerName(String committerName) {
            this.committerName = Objects.requireNonNull(committerName);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder parentCommitIds(List<String> parentCommitIds) {
            this.parentCommitIds = Objects.requireNonNull(parentCommitIds);
            return this;
        }
        public Builder parentCommitIds(String... parentCommitIds) {
            return parentCommitIds(List.of(parentCommitIds));
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder treeId(String treeId) {
            this.treeId = Objects.requireNonNull(treeId);
            return this;
        }        public GetRepositoryCommitsRepositoryCommitCollectionItem build() {
            return new GetRepositoryCommitsRepositoryCommitCollectionItem(authorEmail, authorName, commitId, commitMessage, committerEmail, committerName, definedTags, freeformTags, parentCommitIds, timeCreated, treeId);
        }
    }
}
