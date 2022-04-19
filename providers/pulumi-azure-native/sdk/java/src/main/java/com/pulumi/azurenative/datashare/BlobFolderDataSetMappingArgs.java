// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlobFolderDataSetMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobFolderDataSetMappingArgs Empty = new BlobFolderDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Container that has the file path.
     * 
     */
    @Import(name="containerName", required=true)
      private final Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The id of the source data set.
     * 
     */
    @Import(name="dataSetId", required=true)
      private final Output<String> dataSetId;

    public Output<String> dataSetId() {
        return this.dataSetId;
    }

    /**
     * The name of the data set mapping to be created.
     * 
     */
    @Import(name="dataSetMappingName")
      private final @Nullable Output<String> dataSetMappingName;

    public Output<String> dataSetMappingName() {
        return this.dataSetMappingName == null ? Codegen.empty() : this.dataSetMappingName;
    }

    /**
     * Kind of data set mapping.
     * Expected value is 'BlobFolder'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Prefix for blob folder
     * 
     */
    @Import(name="prefix", required=true)
      private final Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }

    /**
     * Resource group of storage account.
     * 
     */
    @Import(name="resourceGroup", required=true)
      private final Output<String> resourceGroup;

    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
      private final Output<String> shareSubscriptionName;

    public Output<String> shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Storage account name of the source data set.
     * 
     */
    @Import(name="storageAccountName", required=true)
      private final Output<String> storageAccountName;

    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Subscription id of storage account.
     * 
     */
    @Import(name="subscriptionId", required=true)
      private final Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    public BlobFolderDataSetMappingArgs(
        Output<String> accountName,
        Output<String> containerName,
        Output<String> dataSetId,
        @Nullable Output<String> dataSetMappingName,
        Output<String> kind,
        Output<String> prefix,
        Output<String> resourceGroup,
        Output<String> resourceGroupName,
        Output<String> shareSubscriptionName,
        Output<String> storageAccountName,
        Output<String> subscriptionId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.dataSetId = Objects.requireNonNull(dataSetId, "expected parameter 'dataSetId' to be non-null");
        this.dataSetMappingName = dataSetMappingName;
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.prefix = Objects.requireNonNull(prefix, "expected parameter 'prefix' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private BlobFolderDataSetMappingArgs() {
        this.accountName = Codegen.empty();
        this.containerName = Codegen.empty();
        this.dataSetId = Codegen.empty();
        this.dataSetMappingName = Codegen.empty();
        this.kind = Codegen.empty();
        this.prefix = Codegen.empty();
        this.resourceGroup = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.shareSubscriptionName = Codegen.empty();
        this.storageAccountName = Codegen.empty();
        this.subscriptionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobFolderDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<String> containerName;
        private Output<String> dataSetId;
        private @Nullable Output<String> dataSetMappingName;
        private Output<String> kind;
        private Output<String> prefix;
        private Output<String> resourceGroup;
        private Output<String> resourceGroupName;
        private Output<String> shareSubscriptionName;
        private Output<String> storageAccountName;
        private Output<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobFolderDataSetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.containerName = defaults.containerName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingName = defaults.dataSetMappingName;
    	      this.kind = defaults.kind;
    	      this.prefix = defaults.prefix;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder containerName(Output<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Output.of(Objects.requireNonNull(containerName));
            return this;
        }
        public Builder dataSetId(Output<String> dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }
        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Output.of(Objects.requireNonNull(dataSetId));
            return this;
        }
        public Builder dataSetMappingName(@Nullable Output<String> dataSetMappingName) {
            this.dataSetMappingName = dataSetMappingName;
            return this;
        }
        public Builder dataSetMappingName(@Nullable String dataSetMappingName) {
            this.dataSetMappingName = Codegen.ofNullable(dataSetMappingName);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder prefix(Output<String> prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Output.of(Objects.requireNonNull(prefix));
            return this;
        }
        public Builder resourceGroup(Output<String> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Output.of(Objects.requireNonNull(resourceGroup));
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
        public Builder shareSubscriptionName(Output<String> shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }
        public Builder shareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Output.of(Objects.requireNonNull(shareSubscriptionName));
            return this;
        }
        public Builder storageAccountName(Output<String> storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Output.of(Objects.requireNonNull(storageAccountName));
            return this;
        }
        public Builder subscriptionId(Output<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Output.of(Objects.requireNonNull(subscriptionId));
            return this;
        }        public BlobFolderDataSetMappingArgs build() {
            return new BlobFolderDataSetMappingArgs(accountName, containerName, dataSetId, dataSetMappingName, kind, prefix, resourceGroup, resourceGroupName, shareSubscriptionName, storageAccountName, subscriptionId);
        }
    }
}
