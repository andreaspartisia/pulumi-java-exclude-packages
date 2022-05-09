// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.role.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DefinitionPermission {
    /**
     * @return One or more Allowed Actions, such as `*`, `Microsoft.Resources/subscriptions/resourceGroups/read`. See [&#39;Azure Resource Manager resource provider operations&#39;](https://docs.microsoft.com/en-us/azure/role-based-access-control/resource-provider-operations) for details.
     * 
     */
    private final @Nullable List<String> actions;
    /**
     * @return One or more Allowed Data Actions, such as `*`, `Microsoft.Storage/storageAccounts/blobServices/containers/blobs/read`. See [&#39;Azure Resource Manager resource provider operations&#39;](https://docs.microsoft.com/en-us/azure/role-based-access-control/resource-provider-operations) for details.
     * 
     */
    private final @Nullable List<String> dataActions;
    /**
     * @return One or more Disallowed Actions, such as `*`, `Microsoft.Resources/subscriptions/resourceGroups/read`. See [&#39;Azure Resource Manager resource provider operations&#39;](https://docs.microsoft.com/en-us/azure/role-based-access-control/resource-provider-operations) for details.
     * 
     */
    private final @Nullable List<String> notActions;
    /**
     * @return One or more Disallowed Data Actions, such as `*`, `Microsoft.Resources/subscriptions/resourceGroups/read`. See [&#39;Azure Resource Manager resource provider operations&#39;](https://docs.microsoft.com/en-us/azure/role-based-access-control/resource-provider-operations) for details.
     * 
     */
    private final @Nullable List<String> notDataActions;

    @CustomType.Constructor
    private DefinitionPermission(
        @CustomType.Parameter("actions") @Nullable List<String> actions,
        @CustomType.Parameter("dataActions") @Nullable List<String> dataActions,
        @CustomType.Parameter("notActions") @Nullable List<String> notActions,
        @CustomType.Parameter("notDataActions") @Nullable List<String> notDataActions) {
        this.actions = actions;
        this.dataActions = dataActions;
        this.notActions = notActions;
        this.notDataActions = notDataActions;
    }

    /**
     * @return One or more Allowed Actions, such as `*`, `Microsoft.Resources/subscriptions/resourceGroups/read`. See [&#39;Azure Resource Manager resource provider operations&#39;](https://docs.microsoft.com/en-us/azure/role-based-access-control/resource-provider-operations) for details.
     * 
     */
    public List<String> actions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * @return One or more Allowed Data Actions, such as `*`, `Microsoft.Storage/storageAccounts/blobServices/containers/blobs/read`. See [&#39;Azure Resource Manager resource provider operations&#39;](https://docs.microsoft.com/en-us/azure/role-based-access-control/resource-provider-operations) for details.
     * 
     */
    public List<String> dataActions() {
        return this.dataActions == null ? List.of() : this.dataActions;
    }
    /**
     * @return One or more Disallowed Actions, such as `*`, `Microsoft.Resources/subscriptions/resourceGroups/read`. See [&#39;Azure Resource Manager resource provider operations&#39;](https://docs.microsoft.com/en-us/azure/role-based-access-control/resource-provider-operations) for details.
     * 
     */
    public List<String> notActions() {
        return this.notActions == null ? List.of() : this.notActions;
    }
    /**
     * @return One or more Disallowed Data Actions, such as `*`, `Microsoft.Resources/subscriptions/resourceGroups/read`. See [&#39;Azure Resource Manager resource provider operations&#39;](https://docs.microsoft.com/en-us/azure/role-based-access-control/resource-provider-operations) for details.
     * 
     */
    public List<String> notDataActions() {
        return this.notDataActions == null ? List.of() : this.notDataActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefinitionPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> actions;
        private @Nullable List<String> dataActions;
        private @Nullable List<String> notActions;
        private @Nullable List<String> notDataActions;

        public Builder() {
    	      // Empty
        }

        public Builder(DefinitionPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.dataActions = defaults.dataActions;
    	      this.notActions = defaults.notActions;
    	      this.notDataActions = defaults.notDataActions;
        }

        public Builder actions(@Nullable List<String> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder dataActions(@Nullable List<String> dataActions) {
            this.dataActions = dataActions;
            return this;
        }
        public Builder dataActions(String... dataActions) {
            return dataActions(List.of(dataActions));
        }
        public Builder notActions(@Nullable List<String> notActions) {
            this.notActions = notActions;
            return this;
        }
        public Builder notActions(String... notActions) {
            return notActions(List.of(notActions));
        }
        public Builder notDataActions(@Nullable List<String> notDataActions) {
            this.notDataActions = notDataActions;
            return this;
        }
        public Builder notDataActions(String... notDataActions) {
            return notDataActions(List.of(notDataActions));
        }        public DefinitionPermission build() {
            return new DefinitionPermission(actions, dataActions, notActions, notDataActions);
        }
    }
}
