// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBuildPipelineStageBuildSourceCollectionItem {
    /**
     * @return Branch name.
     * 
     */
    private final String branch;
    /**
     * @return Connection identifier pertinent to GitHub source provider.
     * 
     */
    private final String connectionId;
    /**
     * @return The type of source provider.
     * 
     */
    private final String connectionType;
    /**
     * @return Name of the build source. This must be unique within a build source collection. The name can be used by customers to locate the working directory pertinent to this repository.
     * 
     */
    private final String name;
    /**
     * @return The DevOps code repository ID.
     * 
     */
    private final String repositoryId;
    /**
     * @return URL for the repository.
     * 
     */
    private final String repositoryUrl;

    @CustomType.Constructor
    private GetBuildPipelineStageBuildSourceCollectionItem(
        @CustomType.Parameter("branch") String branch,
        @CustomType.Parameter("connectionId") String connectionId,
        @CustomType.Parameter("connectionType") String connectionType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("repositoryId") String repositoryId,
        @CustomType.Parameter("repositoryUrl") String repositoryUrl) {
        this.branch = branch;
        this.connectionId = connectionId;
        this.connectionType = connectionType;
        this.name = name;
        this.repositoryId = repositoryId;
        this.repositoryUrl = repositoryUrl;
    }

    /**
     * @return Branch name.
     * 
     */
    public String branch() {
        return this.branch;
    }
    /**
     * @return Connection identifier pertinent to GitHub source provider.
     * 
     */
    public String connectionId() {
        return this.connectionId;
    }
    /**
     * @return The type of source provider.
     * 
     */
    public String connectionType() {
        return this.connectionType;
    }
    /**
     * @return Name of the build source. This must be unique within a build source collection. The name can be used by customers to locate the working directory pertinent to this repository.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The DevOps code repository ID.
     * 
     */
    public String repositoryId() {
        return this.repositoryId;
    }
    /**
     * @return URL for the repository.
     * 
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildPipelineStageBuildSourceCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branch;
        private String connectionId;
        private String connectionType;
        private String name;
        private String repositoryId;
        private String repositoryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildPipelineStageBuildSourceCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionType = defaults.connectionType;
    	      this.name = defaults.name;
    	      this.repositoryId = defaults.repositoryId;
    	      this.repositoryUrl = defaults.repositoryUrl;
        }

        public Builder branch(String branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }
        public Builder connectionId(String connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }
        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }        public GetBuildPipelineStageBuildSourceCollectionItem build() {
            return new GetBuildPipelineStageBuildSourceCollectionItem(branch, connectionId, connectionType, name, repositoryId, repositoryUrl);
        }
    }
}
