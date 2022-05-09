// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databricks.inputs;

import com.pulumi.azure.databricks.inputs.WorkspaceCustomParametersArgs;
import com.pulumi.azure.databricks.inputs.WorkspaceStorageAccountIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceState extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceState Empty = new WorkspaceState();

    /**
     * A `custom_parameters` block as documented below.
     * 
     */
    @Import(name="customParameters")
    private @Nullable Output<WorkspaceCustomParametersArgs> customParameters;

    /**
     * @return A `custom_parameters` block as documented below.
     * 
     */
    public Optional<Output<WorkspaceCustomParametersArgs>> customParameters() {
        return Optional.ofNullable(this.customParameters);
    }

    /**
     * Is the workspace enabled for customer managed key encryption? If `true` this enables the Managed Identity for the managed storage account. Possible values are `true` or `false`. Defaults to `false`. This field is only valid if the Databricks Workspace `sku` is set to `premium`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="customerManagedKeyEnabled")
    private @Nullable Output<Boolean> customerManagedKeyEnabled;

    /**
     * @return Is the workspace enabled for customer managed key encryption? If `true` this enables the Managed Identity for the managed storage account. Possible values are `true` or `false`. Defaults to `false`. This field is only valid if the Databricks Workspace `sku` is set to `premium`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> customerManagedKeyEnabled() {
        return Optional.ofNullable(this.customerManagedKeyEnabled);
    }

    /**
     * Is the Databricks File System root file system enabled with a secondary layer of encryption with platform managed keys? Possible values are `true` or `false`. Defaults to `false`. This field is only valid if the Databricks Workspace `sku` is set to `premium`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="infrastructureEncryptionEnabled")
    private @Nullable Output<Boolean> infrastructureEncryptionEnabled;

    /**
     * @return Is the Databricks File System root file system enabled with a secondary layer of encryption with platform managed keys? Possible values are `true` or `false`. Defaults to `false`. This field is only valid if the Databricks Workspace `sku` is set to `premium`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> infrastructureEncryptionEnabled() {
        return Optional.ofNullable(this.infrastructureEncryptionEnabled);
    }

    /**
     * Resource ID of the Outbound Load balancer Backend Address Pool for Secure Cluster Connectivity (No Public IP) workspace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="loadBalancerBackendAddressPoolId")
    private @Nullable Output<String> loadBalancerBackendAddressPoolId;

    /**
     * @return Resource ID of the Outbound Load balancer Backend Address Pool for Secure Cluster Connectivity (No Public IP) workspace. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> loadBalancerBackendAddressPoolId() {
        return Optional.ofNullable(this.loadBalancerBackendAddressPoolId);
    }

    /**
     * Specifies the supported Azure location where the resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the Managed Resource Group created by the Databricks Workspace.
     * 
     */
    @Import(name="managedResourceGroupId")
    private @Nullable Output<String> managedResourceGroupId;

    /**
     * @return The ID of the Managed Resource Group created by the Databricks Workspace.
     * 
     */
    public Optional<Output<String>> managedResourceGroupId() {
        return Optional.ofNullable(this.managedResourceGroupId);
    }

    /**
     * The name of the resource group where Azure should place the managed Databricks resources. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="managedResourceGroupName")
    private @Nullable Output<String> managedResourceGroupName;

    /**
     * @return The name of the resource group where Azure should place the managed Databricks resources. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> managedResourceGroupName() {
        return Optional.ofNullable(this.managedResourceGroupName);
    }

    /**
     * Customer managed encryption properties for the Databricks Workspace managed resources(e.g. Notebooks and Artifacts). Changing this forces a new resource to be created.
     * 
     */
    @Import(name="managedServicesCmkKeyVaultKeyId")
    private @Nullable Output<String> managedServicesCmkKeyVaultKeyId;

    /**
     * @return Customer managed encryption properties for the Databricks Workspace managed resources(e.g. Notebooks and Artifacts). Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> managedServicesCmkKeyVaultKeyId() {
        return Optional.ofNullable(this.managedServicesCmkKeyVaultKeyId);
    }

    /**
     * Specifies the name of the Databricks Workspace resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Databricks Workspace resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Does the data plane (clusters) to control plane communication happen over private link endpoint only or publicly? Possible values `AllRules`, `NoAzureDatabricksRules` or `NoAzureServiceRules`. Required when `public_network_access_enabled` is set to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="networkSecurityGroupRulesRequired")
    private @Nullable Output<String> networkSecurityGroupRulesRequired;

    /**
     * @return Does the data plane (clusters) to control plane communication happen over private link endpoint only or publicly? Possible values `AllRules`, `NoAzureDatabricksRules` or `NoAzureServiceRules`. Required when `public_network_access_enabled` is set to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> networkSecurityGroupRulesRequired() {
        return Optional.ofNullable(this.networkSecurityGroupRulesRequired);
    }

    /**
     * Allow public access for accessing workspace. Set value to `false` to access workspace only via private link endpoint. Possible values include `true` or `false`. Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Allow public access for accessing workspace. Set value to `false` to access workspace only via private link endpoint. Possible values include `true` or `false`. Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * The name of the Resource Group in which the Databricks Workspace should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Databricks Workspace should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The `sku` to use for the Databricks Workspace. Possible values are `standard`, `premium`, or `trial`. Changing this can force a new resource to be created in some circumstances.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return The `sku` to use for the Databricks Workspace. Possible values are `standard`, `premium`, or `trial`. Changing this can force a new resource to be created in some circumstances.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * A `storage_account_identity` block as documented below.
     * 
     */
    @Import(name="storageAccountIdentities")
    private @Nullable Output<List<WorkspaceStorageAccountIdentityArgs>> storageAccountIdentities;

    /**
     * @return A `storage_account_identity` block as documented below.
     * 
     */
    public Optional<Output<List<WorkspaceStorageAccountIdentityArgs>>> storageAccountIdentities() {
        return Optional.ofNullable(this.storageAccountIdentities);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The unique identifier of the databricks workspace in Databricks control plane.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The unique identifier of the databricks workspace in Databricks control plane.
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    /**
     * The workspace URL which is of the format &#39;adb-{workspaceId}.{random}.azuredatabricks.net&#39;
     * 
     */
    @Import(name="workspaceUrl")
    private @Nullable Output<String> workspaceUrl;

    /**
     * @return The workspace URL which is of the format &#39;adb-{workspaceId}.{random}.azuredatabricks.net&#39;
     * 
     */
    public Optional<Output<String>> workspaceUrl() {
        return Optional.ofNullable(this.workspaceUrl);
    }

    private WorkspaceState() {}

    private WorkspaceState(WorkspaceState $) {
        this.customParameters = $.customParameters;
        this.customerManagedKeyEnabled = $.customerManagedKeyEnabled;
        this.infrastructureEncryptionEnabled = $.infrastructureEncryptionEnabled;
        this.loadBalancerBackendAddressPoolId = $.loadBalancerBackendAddressPoolId;
        this.location = $.location;
        this.managedResourceGroupId = $.managedResourceGroupId;
        this.managedResourceGroupName = $.managedResourceGroupName;
        this.managedServicesCmkKeyVaultKeyId = $.managedServicesCmkKeyVaultKeyId;
        this.name = $.name;
        this.networkSecurityGroupRulesRequired = $.networkSecurityGroupRulesRequired;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.storageAccountIdentities = $.storageAccountIdentities;
        this.tags = $.tags;
        this.workspaceId = $.workspaceId;
        this.workspaceUrl = $.workspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceState $;

        public Builder() {
            $ = new WorkspaceState();
        }

        public Builder(WorkspaceState defaults) {
            $ = new WorkspaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customParameters A `custom_parameters` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder customParameters(@Nullable Output<WorkspaceCustomParametersArgs> customParameters) {
            $.customParameters = customParameters;
            return this;
        }

        /**
         * @param customParameters A `custom_parameters` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder customParameters(WorkspaceCustomParametersArgs customParameters) {
            return customParameters(Output.of(customParameters));
        }

        /**
         * @param customerManagedKeyEnabled Is the workspace enabled for customer managed key encryption? If `true` this enables the Managed Identity for the managed storage account. Possible values are `true` or `false`. Defaults to `false`. This field is only valid if the Databricks Workspace `sku` is set to `premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedKeyEnabled(@Nullable Output<Boolean> customerManagedKeyEnabled) {
            $.customerManagedKeyEnabled = customerManagedKeyEnabled;
            return this;
        }

        /**
         * @param customerManagedKeyEnabled Is the workspace enabled for customer managed key encryption? If `true` this enables the Managed Identity for the managed storage account. Possible values are `true` or `false`. Defaults to `false`. This field is only valid if the Databricks Workspace `sku` is set to `premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedKeyEnabled(Boolean customerManagedKeyEnabled) {
            return customerManagedKeyEnabled(Output.of(customerManagedKeyEnabled));
        }

        /**
         * @param infrastructureEncryptionEnabled Is the Databricks File System root file system enabled with a secondary layer of encryption with platform managed keys? Possible values are `true` or `false`. Defaults to `false`. This field is only valid if the Databricks Workspace `sku` is set to `premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder infrastructureEncryptionEnabled(@Nullable Output<Boolean> infrastructureEncryptionEnabled) {
            $.infrastructureEncryptionEnabled = infrastructureEncryptionEnabled;
            return this;
        }

        /**
         * @param infrastructureEncryptionEnabled Is the Databricks File System root file system enabled with a secondary layer of encryption with platform managed keys? Possible values are `true` or `false`. Defaults to `false`. This field is only valid if the Databricks Workspace `sku` is set to `premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder infrastructureEncryptionEnabled(Boolean infrastructureEncryptionEnabled) {
            return infrastructureEncryptionEnabled(Output.of(infrastructureEncryptionEnabled));
        }

        /**
         * @param loadBalancerBackendAddressPoolId Resource ID of the Outbound Load balancer Backend Address Pool for Secure Cluster Connectivity (No Public IP) workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPoolId(@Nullable Output<String> loadBalancerBackendAddressPoolId) {
            $.loadBalancerBackendAddressPoolId = loadBalancerBackendAddressPoolId;
            return this;
        }

        /**
         * @param loadBalancerBackendAddressPoolId Resource ID of the Outbound Load balancer Backend Address Pool for Secure Cluster Connectivity (No Public IP) workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPoolId(String loadBalancerBackendAddressPoolId) {
            return loadBalancerBackendAddressPoolId(Output.of(loadBalancerBackendAddressPoolId));
        }

        /**
         * @param location Specifies the supported Azure location where the resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedResourceGroupId The ID of the Managed Resource Group created by the Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupId(@Nullable Output<String> managedResourceGroupId) {
            $.managedResourceGroupId = managedResourceGroupId;
            return this;
        }

        /**
         * @param managedResourceGroupId The ID of the Managed Resource Group created by the Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupId(String managedResourceGroupId) {
            return managedResourceGroupId(Output.of(managedResourceGroupId));
        }

        /**
         * @param managedResourceGroupName The name of the resource group where Azure should place the managed Databricks resources. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupName(@Nullable Output<String> managedResourceGroupName) {
            $.managedResourceGroupName = managedResourceGroupName;
            return this;
        }

        /**
         * @param managedResourceGroupName The name of the resource group where Azure should place the managed Databricks resources. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupName(String managedResourceGroupName) {
            return managedResourceGroupName(Output.of(managedResourceGroupName));
        }

        /**
         * @param managedServicesCmkKeyVaultKeyId Customer managed encryption properties for the Databricks Workspace managed resources(e.g. Notebooks and Artifacts). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedServicesCmkKeyVaultKeyId(@Nullable Output<String> managedServicesCmkKeyVaultKeyId) {
            $.managedServicesCmkKeyVaultKeyId = managedServicesCmkKeyVaultKeyId;
            return this;
        }

        /**
         * @param managedServicesCmkKeyVaultKeyId Customer managed encryption properties for the Databricks Workspace managed resources(e.g. Notebooks and Artifacts). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedServicesCmkKeyVaultKeyId(String managedServicesCmkKeyVaultKeyId) {
            return managedServicesCmkKeyVaultKeyId(Output.of(managedServicesCmkKeyVaultKeyId));
        }

        /**
         * @param name Specifies the name of the Databricks Workspace resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Databricks Workspace resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkSecurityGroupRulesRequired Does the data plane (clusters) to control plane communication happen over private link endpoint only or publicly? Possible values `AllRules`, `NoAzureDatabricksRules` or `NoAzureServiceRules`. Required when `public_network_access_enabled` is set to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupRulesRequired(@Nullable Output<String> networkSecurityGroupRulesRequired) {
            $.networkSecurityGroupRulesRequired = networkSecurityGroupRulesRequired;
            return this;
        }

        /**
         * @param networkSecurityGroupRulesRequired Does the data plane (clusters) to control plane communication happen over private link endpoint only or publicly? Possible values `AllRules`, `NoAzureDatabricksRules` or `NoAzureServiceRules`. Required when `public_network_access_enabled` is set to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupRulesRequired(String networkSecurityGroupRulesRequired) {
            return networkSecurityGroupRulesRequired(Output.of(networkSecurityGroupRulesRequired));
        }

        /**
         * @param publicNetworkAccessEnabled Allow public access for accessing workspace. Set value to `false` to access workspace only via private link endpoint. Possible values include `true` or `false`. Defaults to `true`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Allow public access for accessing workspace. Set value to `false` to access workspace only via private link endpoint. Possible values include `true` or `false`. Defaults to `true`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Databricks Workspace should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Databricks Workspace should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku The `sku` to use for the Databricks Workspace. Possible values are `standard`, `premium`, or `trial`. Changing this can force a new resource to be created in some circumstances.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The `sku` to use for the Databricks Workspace. Possible values are `standard`, `premium`, or `trial`. Changing this can force a new resource to be created in some circumstances.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param storageAccountIdentities A `storage_account_identity` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountIdentities(@Nullable Output<List<WorkspaceStorageAccountIdentityArgs>> storageAccountIdentities) {
            $.storageAccountIdentities = storageAccountIdentities;
            return this;
        }

        /**
         * @param storageAccountIdentities A `storage_account_identity` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountIdentities(List<WorkspaceStorageAccountIdentityArgs> storageAccountIdentities) {
            return storageAccountIdentities(Output.of(storageAccountIdentities));
        }

        /**
         * @param storageAccountIdentities A `storage_account_identity` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountIdentities(WorkspaceStorageAccountIdentityArgs... storageAccountIdentities) {
            return storageAccountIdentities(List.of(storageAccountIdentities));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workspaceId The unique identifier of the databricks workspace in Databricks control plane.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The unique identifier of the databricks workspace in Databricks control plane.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        /**
         * @param workspaceUrl The workspace URL which is of the format &#39;adb-{workspaceId}.{random}.azuredatabricks.net&#39;
         * 
         * @return builder
         * 
         */
        public Builder workspaceUrl(@Nullable Output<String> workspaceUrl) {
            $.workspaceUrl = workspaceUrl;
            return this;
        }

        /**
         * @param workspaceUrl The workspace URL which is of the format &#39;adb-{workspaceId}.{random}.azuredatabricks.net&#39;
         * 
         * @return builder
         * 
         */
        public Builder workspaceUrl(String workspaceUrl) {
            return workspaceUrl(Output.of(workspaceUrl));
        }

        public WorkspaceState build() {
            return $;
        }
    }

}
