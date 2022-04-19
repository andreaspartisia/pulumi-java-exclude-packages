// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlobDataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobDataSetArgs Empty = new BlobDataSetArgs();

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
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName")
      private final @Nullable Output<String> dataSetName;

    public Output<String> dataSetName() {
        return this.dataSetName == null ? Codegen.empty() : this.dataSetName;
    }

    /**
     * File path within the source data set
     * 
     */
    @Import(name="filePath", required=true)
      private final Output<String> filePath;

    public Output<String> filePath() {
        return this.filePath;
    }

    /**
     * Kind of data set.
     * Expected value is 'Blob'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource group of storage account
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
     * The name of the share to add the data set to.
     * 
     */
    @Import(name="shareName", required=true)
      private final Output<String> shareName;

    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     * Storage account name of the source data set
     * 
     */
    @Import(name="storageAccountName", required=true)
      private final Output<String> storageAccountName;

    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Subscription id of storage account
     * 
     */
    @Import(name="subscriptionId", required=true)
      private final Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    public BlobDataSetArgs(
        Output<String> accountName,
        Output<String> containerName,
        @Nullable Output<String> dataSetName,
        Output<String> filePath,
        Output<String> kind,
        Output<String> resourceGroup,
        Output<String> resourceGroupName,
        Output<String> shareName,
        Output<String> storageAccountName,
        Output<String> subscriptionId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.dataSetName = dataSetName;
        this.filePath = Objects.requireNonNull(filePath, "expected parameter 'filePath' to be non-null");
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private BlobDataSetArgs() {
        this.accountName = Codegen.empty();
        this.containerName = Codegen.empty();
        this.dataSetName = Codegen.empty();
        this.filePath = Codegen.empty();
        this.kind = Codegen.empty();
        this.resourceGroup = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.shareName = Codegen.empty();
        this.storageAccountName = Codegen.empty();
        this.subscriptionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<String> containerName;
        private @Nullable Output<String> dataSetName;
        private Output<String> filePath;
        private Output<String> kind;
        private Output<String> resourceGroup;
        private Output<String> resourceGroupName;
        private Output<String> shareName;
        private Output<String> storageAccountName;
        private Output<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.containerName = defaults.containerName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.filePath = defaults.filePath;
    	      this.kind = defaults.kind;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
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
        public Builder dataSetName(@Nullable Output<String> dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public Builder dataSetName(@Nullable String dataSetName) {
            this.dataSetName = Codegen.ofNullable(dataSetName);
            return this;
        }
        public Builder filePath(Output<String> filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }
        public Builder filePath(String filePath) {
            this.filePath = Output.of(Objects.requireNonNull(filePath));
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
        public Builder shareName(Output<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Output.of(Objects.requireNonNull(shareName));
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
        }        public BlobDataSetArgs build() {
            return new BlobDataSetArgs(accountName, containerName, dataSetName, filePath, kind, resourceGroup, resourceGroupName, shareName, storageAccountName, subscriptionId);
        }
    }
}
