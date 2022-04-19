// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.machinelearningservices.inputs.EncryptionPropertyArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.IdentityArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ServiceManagedResourcesSettingsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.SharedPrivateLinkResourceArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The flag to indicate whether to allow public access when behind VNet.
     * 
     */
    @Import(name="allowPublicAccessWhenBehindVnet")
      private final @Nullable Output<Boolean> allowPublicAccessWhenBehindVnet;

    public Output<Boolean> allowPublicAccessWhenBehindVnet() {
        return this.allowPublicAccessWhenBehindVnet == null ? Codegen.empty() : this.allowPublicAccessWhenBehindVnet;
    }

    /**
     * ARM id of the application insights associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    @Import(name="applicationInsights")
      private final @Nullable Output<String> applicationInsights;

    public Output<String> applicationInsights() {
        return this.applicationInsights == null ? Codegen.empty() : this.applicationInsights;
    }

    /**
     * ARM id of the container registry associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    @Import(name="containerRegistry")
      private final @Nullable Output<String> containerRegistry;

    public Output<String> containerRegistry() {
        return this.containerRegistry == null ? Codegen.empty() : this.containerRegistry;
    }

    /**
     * The description of this workspace.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Url for the discovery service to identify regional endpoints for machine learning experimentation services
     * 
     */
    @Import(name="discoveryUrl")
      private final @Nullable Output<String> discoveryUrl;

    public Output<String> discoveryUrl() {
        return this.discoveryUrl == null ? Codegen.empty() : this.discoveryUrl;
    }

    /**
     * The encryption settings of Azure ML workspace.
     * 
     */
    @Import(name="encryption")
      private final @Nullable Output<EncryptionPropertyArgs> encryption;

    public Output<EncryptionPropertyArgs> encryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * The friendly name for this workspace. This name in mutable
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> friendlyName() {
        return this.friendlyName == null ? Codegen.empty() : this.friendlyName;
    }

    /**
     * The flag to signal HBI data in the workspace and reduce diagnostic data collected by the service
     * 
     */
    @Import(name="hbiWorkspace")
      private final @Nullable Output<Boolean> hbiWorkspace;

    public Output<Boolean> hbiWorkspace() {
        return this.hbiWorkspace == null ? Codegen.empty() : this.hbiWorkspace;
    }

    /**
     * The identity of the resource.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<IdentityArgs> identity;

    public Output<IdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The compute name for image build
     * 
     */
    @Import(name="imageBuildCompute")
      private final @Nullable Output<String> imageBuildCompute;

    public Output<String> imageBuildCompute() {
        return this.imageBuildCompute == null ? Codegen.empty() : this.imageBuildCompute;
    }

    /**
     * ARM id of the key vault associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    @Import(name="keyVault")
      private final @Nullable Output<String> keyVault;

    public Output<String> keyVault() {
        return this.keyVault == null ? Codegen.empty() : this.keyVault;
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The user assigned identity resource id that represents the workspace identity.
     * 
     */
    @Import(name="primaryUserAssignedIdentity")
      private final @Nullable Output<String> primaryUserAssignedIdentity;

    public Output<String> primaryUserAssignedIdentity() {
        return this.primaryUserAssignedIdentity == null ? Codegen.empty() : this.primaryUserAssignedIdentity;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The service managed resource settings.
     * 
     */
    @Import(name="serviceManagedResourcesSettings")
      private final @Nullable Output<ServiceManagedResourcesSettingsArgs> serviceManagedResourcesSettings;

    public Output<ServiceManagedResourcesSettingsArgs> serviceManagedResourcesSettings() {
        return this.serviceManagedResourcesSettings == null ? Codegen.empty() : this.serviceManagedResourcesSettings;
    }

    /**
     * The list of shared private link resources in this workspace.
     * 
     */
    @Import(name="sharedPrivateLinkResources")
      private final @Nullable Output<List<SharedPrivateLinkResourceArgs>> sharedPrivateLinkResources;

    public Output<List<SharedPrivateLinkResourceArgs>> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources == null ? Codegen.empty() : this.sharedPrivateLinkResources;
    }

    /**
     * The sku of the workspace.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * ARM id of the storage account associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    @Import(name="storageAccount")
      private final @Nullable Output<String> storageAccount;

    public Output<String> storageAccount() {
        return this.storageAccount == null ? Codegen.empty() : this.storageAccount;
    }

    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName")
      private final @Nullable Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName == null ? Codegen.empty() : this.workspaceName;
    }

    public WorkspaceArgs(
        @Nullable Output<Boolean> allowPublicAccessWhenBehindVnet,
        @Nullable Output<String> applicationInsights,
        @Nullable Output<String> containerRegistry,
        @Nullable Output<String> description,
        @Nullable Output<String> discoveryUrl,
        @Nullable Output<EncryptionPropertyArgs> encryption,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Boolean> hbiWorkspace,
        @Nullable Output<IdentityArgs> identity,
        @Nullable Output<String> imageBuildCompute,
        @Nullable Output<String> keyVault,
        @Nullable Output<String> location,
        @Nullable Output<String> primaryUserAssignedIdentity,
        Output<String> resourceGroupName,
        @Nullable Output<ServiceManagedResourcesSettingsArgs> serviceManagedResourcesSettings,
        @Nullable Output<List<SharedPrivateLinkResourceArgs>> sharedPrivateLinkResources,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<String> storageAccount,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> workspaceName) {
        this.allowPublicAccessWhenBehindVnet = Codegen.booleanProp("allowPublicAccessWhenBehindVnet").output().arg(allowPublicAccessWhenBehindVnet).def(false).getNullable();
        this.applicationInsights = applicationInsights;
        this.containerRegistry = containerRegistry;
        this.description = description;
        this.discoveryUrl = discoveryUrl;
        this.encryption = encryption;
        this.friendlyName = friendlyName;
        this.hbiWorkspace = Codegen.booleanProp("hbiWorkspace").output().arg(hbiWorkspace).def(false).getNullable();
        this.identity = identity;
        this.imageBuildCompute = imageBuildCompute;
        this.keyVault = keyVault;
        this.location = location;
        this.primaryUserAssignedIdentity = primaryUserAssignedIdentity;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceManagedResourcesSettings = serviceManagedResourcesSettings;
        this.sharedPrivateLinkResources = sharedPrivateLinkResources;
        this.sku = sku;
        this.storageAccount = storageAccount;
        this.tags = tags;
        this.workspaceName = workspaceName;
    }

    private WorkspaceArgs() {
        this.allowPublicAccessWhenBehindVnet = Codegen.empty();
        this.applicationInsights = Codegen.empty();
        this.containerRegistry = Codegen.empty();
        this.description = Codegen.empty();
        this.discoveryUrl = Codegen.empty();
        this.encryption = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.hbiWorkspace = Codegen.empty();
        this.identity = Codegen.empty();
        this.imageBuildCompute = Codegen.empty();
        this.keyVault = Codegen.empty();
        this.location = Codegen.empty();
        this.primaryUserAssignedIdentity = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceManagedResourcesSettings = Codegen.empty();
        this.sharedPrivateLinkResources = Codegen.empty();
        this.sku = Codegen.empty();
        this.storageAccount = Codegen.empty();
        this.tags = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowPublicAccessWhenBehindVnet;
        private @Nullable Output<String> applicationInsights;
        private @Nullable Output<String> containerRegistry;
        private @Nullable Output<String> description;
        private @Nullable Output<String> discoveryUrl;
        private @Nullable Output<EncryptionPropertyArgs> encryption;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Boolean> hbiWorkspace;
        private @Nullable Output<IdentityArgs> identity;
        private @Nullable Output<String> imageBuildCompute;
        private @Nullable Output<String> keyVault;
        private @Nullable Output<String> location;
        private @Nullable Output<String> primaryUserAssignedIdentity;
        private Output<String> resourceGroupName;
        private @Nullable Output<ServiceManagedResourcesSettingsArgs> serviceManagedResourcesSettings;
        private @Nullable Output<List<SharedPrivateLinkResourceArgs>> sharedPrivateLinkResources;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<String> storageAccount;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPublicAccessWhenBehindVnet = defaults.allowPublicAccessWhenBehindVnet;
    	      this.applicationInsights = defaults.applicationInsights;
    	      this.containerRegistry = defaults.containerRegistry;
    	      this.description = defaults.description;
    	      this.discoveryUrl = defaults.discoveryUrl;
    	      this.encryption = defaults.encryption;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hbiWorkspace = defaults.hbiWorkspace;
    	      this.identity = defaults.identity;
    	      this.imageBuildCompute = defaults.imageBuildCompute;
    	      this.keyVault = defaults.keyVault;
    	      this.location = defaults.location;
    	      this.primaryUserAssignedIdentity = defaults.primaryUserAssignedIdentity;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceManagedResourcesSettings = defaults.serviceManagedResourcesSettings;
    	      this.sharedPrivateLinkResources = defaults.sharedPrivateLinkResources;
    	      this.sku = defaults.sku;
    	      this.storageAccount = defaults.storageAccount;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder allowPublicAccessWhenBehindVnet(@Nullable Output<Boolean> allowPublicAccessWhenBehindVnet) {
            this.allowPublicAccessWhenBehindVnet = allowPublicAccessWhenBehindVnet;
            return this;
        }
        public Builder allowPublicAccessWhenBehindVnet(@Nullable Boolean allowPublicAccessWhenBehindVnet) {
            this.allowPublicAccessWhenBehindVnet = Codegen.ofNullable(allowPublicAccessWhenBehindVnet);
            return this;
        }
        public Builder applicationInsights(@Nullable Output<String> applicationInsights) {
            this.applicationInsights = applicationInsights;
            return this;
        }
        public Builder applicationInsights(@Nullable String applicationInsights) {
            this.applicationInsights = Codegen.ofNullable(applicationInsights);
            return this;
        }
        public Builder containerRegistry(@Nullable Output<String> containerRegistry) {
            this.containerRegistry = containerRegistry;
            return this;
        }
        public Builder containerRegistry(@Nullable String containerRegistry) {
            this.containerRegistry = Codegen.ofNullable(containerRegistry);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder discoveryUrl(@Nullable Output<String> discoveryUrl) {
            this.discoveryUrl = discoveryUrl;
            return this;
        }
        public Builder discoveryUrl(@Nullable String discoveryUrl) {
            this.discoveryUrl = Codegen.ofNullable(discoveryUrl);
            return this;
        }
        public Builder encryption(@Nullable Output<EncryptionPropertyArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable EncryptionPropertyArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Codegen.ofNullable(friendlyName);
            return this;
        }
        public Builder hbiWorkspace(@Nullable Output<Boolean> hbiWorkspace) {
            this.hbiWorkspace = hbiWorkspace;
            return this;
        }
        public Builder hbiWorkspace(@Nullable Boolean hbiWorkspace) {
            this.hbiWorkspace = Codegen.ofNullable(hbiWorkspace);
            return this;
        }
        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable IdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder imageBuildCompute(@Nullable Output<String> imageBuildCompute) {
            this.imageBuildCompute = imageBuildCompute;
            return this;
        }
        public Builder imageBuildCompute(@Nullable String imageBuildCompute) {
            this.imageBuildCompute = Codegen.ofNullable(imageBuildCompute);
            return this;
        }
        public Builder keyVault(@Nullable Output<String> keyVault) {
            this.keyVault = keyVault;
            return this;
        }
        public Builder keyVault(@Nullable String keyVault) {
            this.keyVault = Codegen.ofNullable(keyVault);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder primaryUserAssignedIdentity(@Nullable Output<String> primaryUserAssignedIdentity) {
            this.primaryUserAssignedIdentity = primaryUserAssignedIdentity;
            return this;
        }
        public Builder primaryUserAssignedIdentity(@Nullable String primaryUserAssignedIdentity) {
            this.primaryUserAssignedIdentity = Codegen.ofNullable(primaryUserAssignedIdentity);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceManagedResourcesSettings(@Nullable Output<ServiceManagedResourcesSettingsArgs> serviceManagedResourcesSettings) {
            this.serviceManagedResourcesSettings = serviceManagedResourcesSettings;
            return this;
        }
        public Builder serviceManagedResourcesSettings(@Nullable ServiceManagedResourcesSettingsArgs serviceManagedResourcesSettings) {
            this.serviceManagedResourcesSettings = Codegen.ofNullable(serviceManagedResourcesSettings);
            return this;
        }
        public Builder sharedPrivateLinkResources(@Nullable Output<List<SharedPrivateLinkResourceArgs>> sharedPrivateLinkResources) {
            this.sharedPrivateLinkResources = sharedPrivateLinkResources;
            return this;
        }
        public Builder sharedPrivateLinkResources(@Nullable List<SharedPrivateLinkResourceArgs> sharedPrivateLinkResources) {
            this.sharedPrivateLinkResources = Codegen.ofNullable(sharedPrivateLinkResources);
            return this;
        }
        public Builder sharedPrivateLinkResources(SharedPrivateLinkResourceArgs... sharedPrivateLinkResources) {
            return sharedPrivateLinkResources(List.of(sharedPrivateLinkResources));
        }
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder storageAccount(@Nullable Output<String> storageAccount) {
            this.storageAccount = storageAccount;
            return this;
        }
        public Builder storageAccount(@Nullable String storageAccount) {
            this.storageAccount = Codegen.ofNullable(storageAccount);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public Builder workspaceName(@Nullable String workspaceName) {
            this.workspaceName = Codegen.ofNullable(workspaceName);
            return this;
        }        public WorkspaceArgs build() {
            return new WorkspaceArgs(allowPublicAccessWhenBehindVnet, applicationInsights, containerRegistry, description, discoveryUrl, encryption, friendlyName, hbiWorkspace, identity, imageBuildCompute, keyVault, location, primaryUserAssignedIdentity, resourceGroupName, serviceManagedResourcesSettings, sharedPrivateLinkResources, sku, storageAccount, tags, workspaceName);
        }
    }
}
