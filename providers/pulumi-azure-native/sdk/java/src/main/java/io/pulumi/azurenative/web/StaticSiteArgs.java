// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.enums.StagingEnvironmentPolicy;
import io.pulumi.azurenative.web.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.web.inputs.SkuDescriptionArgs;
import io.pulumi.azurenative.web.inputs.StaticSiteBuildPropertiesArgs;
import io.pulumi.azurenative.web.inputs.StaticSiteTemplateOptionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticSiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticSiteArgs Empty = new StaticSiteArgs();

    @InputImport(name="allowConfigFileUpdates")
    private final @Nullable Input<Boolean> allowConfigFileUpdates;

    public Input<Boolean> getAllowConfigFileUpdates() {
        return this.allowConfigFileUpdates == null ? Input.empty() : this.allowConfigFileUpdates;
    }

    @InputImport(name="branch")
    private final @Nullable Input<String> branch;

    public Input<String> getBranch() {
        return this.branch == null ? Input.empty() : this.branch;
    }

    @InputImport(name="buildProperties")
    private final @Nullable Input<StaticSiteBuildPropertiesArgs> buildProperties;

    public Input<StaticSiteBuildPropertiesArgs> getBuildProperties() {
        return this.buildProperties == null ? Input.empty() : this.buildProperties;
    }

    @InputImport(name="identity")
    private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="repositoryToken")
    private final @Nullable Input<String> repositoryToken;

    public Input<String> getRepositoryToken() {
        return this.repositoryToken == null ? Input.empty() : this.repositoryToken;
    }

    @InputImport(name="repositoryUrl")
    private final @Nullable Input<String> repositoryUrl;

    public Input<String> getRepositoryUrl() {
        return this.repositoryUrl == null ? Input.empty() : this.repositoryUrl;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<SkuDescriptionArgs> sku;

    public Input<SkuDescriptionArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="stagingEnvironmentPolicy")
    private final @Nullable Input<StagingEnvironmentPolicy> stagingEnvironmentPolicy;

    public Input<StagingEnvironmentPolicy> getStagingEnvironmentPolicy() {
        return this.stagingEnvironmentPolicy == null ? Input.empty() : this.stagingEnvironmentPolicy;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="templateProperties")
    private final @Nullable Input<StaticSiteTemplateOptionsArgs> templateProperties;

    public Input<StaticSiteTemplateOptionsArgs> getTemplateProperties() {
        return this.templateProperties == null ? Input.empty() : this.templateProperties;
    }

    public StaticSiteArgs(
        @Nullable Input<Boolean> allowConfigFileUpdates,
        @Nullable Input<String> branch,
        @Nullable Input<StaticSiteBuildPropertiesArgs> buildProperties,
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> repositoryToken,
        @Nullable Input<String> repositoryUrl,
        Input<String> resourceGroupName,
        @Nullable Input<SkuDescriptionArgs> sku,
        @Nullable Input<StagingEnvironmentPolicy> stagingEnvironmentPolicy,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<StaticSiteTemplateOptionsArgs> templateProperties) {
        this.allowConfigFileUpdates = allowConfigFileUpdates;
        this.branch = branch;
        this.buildProperties = buildProperties;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.repositoryToken = repositoryToken;
        this.repositoryUrl = repositoryUrl;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.stagingEnvironmentPolicy = stagingEnvironmentPolicy;
        this.tags = tags;
        this.templateProperties = templateProperties;
    }

    private StaticSiteArgs() {
        this.allowConfigFileUpdates = Input.empty();
        this.branch = Input.empty();
        this.buildProperties = Input.empty();
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.repositoryToken = Input.empty();
        this.repositoryUrl = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.stagingEnvironmentPolicy = Input.empty();
        this.tags = Input.empty();
        this.templateProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowConfigFileUpdates;
        private @Nullable Input<String> branch;
        private @Nullable Input<StaticSiteBuildPropertiesArgs> buildProperties;
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> repositoryToken;
        private @Nullable Input<String> repositoryUrl;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuDescriptionArgs> sku;
        private @Nullable Input<StagingEnvironmentPolicy> stagingEnvironmentPolicy;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<StaticSiteTemplateOptionsArgs> templateProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowConfigFileUpdates = defaults.allowConfigFileUpdates;
    	      this.branch = defaults.branch;
    	      this.buildProperties = defaults.buildProperties;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.repositoryToken = defaults.repositoryToken;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.stagingEnvironmentPolicy = defaults.stagingEnvironmentPolicy;
    	      this.tags = defaults.tags;
    	      this.templateProperties = defaults.templateProperties;
        }

        public Builder setAllowConfigFileUpdates(@Nullable Input<Boolean> allowConfigFileUpdates) {
            this.allowConfigFileUpdates = allowConfigFileUpdates;
            return this;
        }

        public Builder setAllowConfigFileUpdates(@Nullable Boolean allowConfigFileUpdates) {
            this.allowConfigFileUpdates = Input.ofNullable(allowConfigFileUpdates);
            return this;
        }

        public Builder setBranch(@Nullable Input<String> branch) {
            this.branch = branch;
            return this;
        }

        public Builder setBranch(@Nullable String branch) {
            this.branch = Input.ofNullable(branch);
            return this;
        }

        public Builder setBuildProperties(@Nullable Input<StaticSiteBuildPropertiesArgs> buildProperties) {
            this.buildProperties = buildProperties;
            return this;
        }

        public Builder setBuildProperties(@Nullable StaticSiteBuildPropertiesArgs buildProperties) {
            this.buildProperties = Input.ofNullable(buildProperties);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRepositoryToken(@Nullable Input<String> repositoryToken) {
            this.repositoryToken = repositoryToken;
            return this;
        }

        public Builder setRepositoryToken(@Nullable String repositoryToken) {
            this.repositoryToken = Input.ofNullable(repositoryToken);
            return this;
        }

        public Builder setRepositoryUrl(@Nullable Input<String> repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }

        public Builder setRepositoryUrl(@Nullable String repositoryUrl) {
            this.repositoryUrl = Input.ofNullable(repositoryUrl);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(@Nullable Input<SkuDescriptionArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuDescriptionArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setStagingEnvironmentPolicy(@Nullable Input<StagingEnvironmentPolicy> stagingEnvironmentPolicy) {
            this.stagingEnvironmentPolicy = stagingEnvironmentPolicy;
            return this;
        }

        public Builder setStagingEnvironmentPolicy(@Nullable StagingEnvironmentPolicy stagingEnvironmentPolicy) {
            this.stagingEnvironmentPolicy = Input.ofNullable(stagingEnvironmentPolicy);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTemplateProperties(@Nullable Input<StaticSiteTemplateOptionsArgs> templateProperties) {
            this.templateProperties = templateProperties;
            return this;
        }

        public Builder setTemplateProperties(@Nullable StaticSiteTemplateOptionsArgs templateProperties) {
            this.templateProperties = Input.ofNullable(templateProperties);
            return this;
        }

        public StaticSiteArgs build() {
            return new StaticSiteArgs(allowConfigFileUpdates, branch, buildProperties, identity, kind, location, name, repositoryToken, repositoryUrl, resourceGroupName, sku, stagingEnvironmentPolicy, tags, templateProperties);
        }
    }
}