// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.enums.ContentType;
import com.pulumi.azurenative.securityinsights.enums.CreatedByType;
import com.pulumi.azurenative.securityinsights.enums.RepoType;
import com.pulumi.azurenative.securityinsights.inputs.RepositoryArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SourceControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceControlArgs Empty = new SourceControlArgs();

    /**
     * Array of source control content types.
     * 
     */
    @Import(name="contentTypes", required=true)
    private Output<List<Either<String,ContentType>>> contentTypes;

    public Output<List<Either<String,ContentType>>> contentTypes() {
        return this.contentTypes;
    }

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The identity that created the resource.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @Import(name="createdByType")
    private @Nullable Output<Either<String,CreatedByType>> createdByType;

    public Optional<Output<Either<String,CreatedByType>>> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }

    /**
     * A description of the source control
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the source control
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The id (a Guid) of the source control
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Import(name="lastModifiedAt")
    private @Nullable Output<String> lastModifiedAt;

    public Optional<Output<String>> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedBy")
    private @Nullable Output<String> lastModifiedBy;

    public Optional<Output<String>> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedByType")
    private @Nullable Output<Either<String,CreatedByType>> lastModifiedByType;

    public Optional<Output<Either<String,CreatedByType>>> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private Output<String> operationalInsightsResourceProvider;

    public Output<String> operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The repository type of the source control
     * 
     */
    @Import(name="repoType", required=true)
    private Output<Either<String,RepoType>> repoType;

    public Output<Either<String,RepoType>> repoType() {
        return this.repoType;
    }

    /**
     * Repository metadata.
     * 
     */
    @Import(name="repository", required=true)
    private Output<RepositoryArgs> repository;

    public Output<RepositoryArgs> repository() {
        return this.repository;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Source control Id
     * 
     */
    @Import(name="sourceControlId")
    private @Nullable Output<String> sourceControlId;

    public Optional<Output<String>> sourceControlId() {
        return Optional.ofNullable(this.sourceControlId);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private SourceControlArgs() {}

    private SourceControlArgs(SourceControlArgs $) {
        this.contentTypes = $.contentTypes;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.createdByType = $.createdByType;
        this.description = $.description;
        this.displayName = $.displayName;
        this.id = $.id;
        this.lastModifiedAt = $.lastModifiedAt;
        this.lastModifiedBy = $.lastModifiedBy;
        this.lastModifiedByType = $.lastModifiedByType;
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.repoType = $.repoType;
        this.repository = $.repository;
        this.resourceGroupName = $.resourceGroupName;
        this.sourceControlId = $.sourceControlId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceControlArgs $;

        public Builder() {
            $ = new SourceControlArgs();
        }

        public Builder(SourceControlArgs defaults) {
            $ = new SourceControlArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentTypes(Output<List<Either<String,ContentType>>> contentTypes) {
            $.contentTypes = contentTypes;
            return this;
        }

        public Builder contentTypes(List<Either<String,ContentType>> contentTypes) {
            return contentTypes(Output.of(contentTypes));
        }

        public Builder contentTypes(Either<String,ContentType>... contentTypes) {
            return contentTypes(List.of(contentTypes));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        public Builder createdByType(@Nullable Output<Either<String,CreatedByType>> createdByType) {
            $.createdByType = createdByType;
            return this;
        }

        public Builder createdByType(Either<String,CreatedByType> createdByType) {
            return createdByType(Output.of(createdByType));
        }

        public Builder createdByType(String createdByType) {
            return createdByType(Either.ofLeft(createdByType));
        }

        public Builder createdByType(CreatedByType createdByType) {
            return createdByType(Either.ofRight(createdByType));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder lastModifiedAt(@Nullable Output<String> lastModifiedAt) {
            $.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder lastModifiedAt(String lastModifiedAt) {
            return lastModifiedAt(Output.of(lastModifiedAt));
        }

        public Builder lastModifiedBy(@Nullable Output<String> lastModifiedBy) {
            $.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder lastModifiedBy(String lastModifiedBy) {
            return lastModifiedBy(Output.of(lastModifiedBy));
        }

        public Builder lastModifiedByType(@Nullable Output<Either<String,CreatedByType>> lastModifiedByType) {
            $.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder lastModifiedByType(Either<String,CreatedByType> lastModifiedByType) {
            return lastModifiedByType(Output.of(lastModifiedByType));
        }

        public Builder lastModifiedByType(String lastModifiedByType) {
            return lastModifiedByType(Either.ofLeft(lastModifiedByType));
        }

        public Builder lastModifiedByType(CreatedByType lastModifiedByType) {
            return lastModifiedByType(Either.ofRight(lastModifiedByType));
        }

        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            return operationalInsightsResourceProvider(Output.of(operationalInsightsResourceProvider));
        }

        public Builder repoType(Output<Either<String,RepoType>> repoType) {
            $.repoType = repoType;
            return this;
        }

        public Builder repoType(Either<String,RepoType> repoType) {
            return repoType(Output.of(repoType));
        }

        public Builder repoType(String repoType) {
            return repoType(Either.ofLeft(repoType));
        }

        public Builder repoType(RepoType repoType) {
            return repoType(Either.ofRight(repoType));
        }

        public Builder repository(Output<RepositoryArgs> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(RepositoryArgs repository) {
            return repository(Output.of(repository));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sourceControlId(@Nullable Output<String> sourceControlId) {
            $.sourceControlId = sourceControlId;
            return this;
        }

        public Builder sourceControlId(String sourceControlId) {
            return sourceControlId(Output.of(sourceControlId));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public SourceControlArgs build() {
            $.contentTypes = Objects.requireNonNull($.contentTypes, "expected parameter 'contentTypes' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.repoType = Objects.requireNonNull($.repoType, "expected parameter 'repoType' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
