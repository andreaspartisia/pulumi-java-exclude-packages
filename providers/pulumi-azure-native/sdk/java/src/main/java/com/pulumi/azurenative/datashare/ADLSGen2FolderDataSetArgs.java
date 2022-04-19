// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ADLSGen2FolderDataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ADLSGen2FolderDataSetArgs Empty = new ADLSGen2FolderDataSetArgs();

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
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName")
      private final @Nullable Output<String> dataSetName;

    public Output<String> dataSetName() {
        return this.dataSetName == null ? Codegen.empty() : this.dataSetName;
    }

    /**
     * File system to which the folder belongs.
     * 
     */
    @Import(name="fileSystem", required=true)
      private final Output<String> fileSystem;

    public Output<String> fileSystem() {
        return this.fileSystem;
    }

    /**
     * Folder path within the file system.
     * 
     */
    @Import(name="folderPath", required=true)
      private final Output<String> folderPath;

    public Output<String> folderPath() {
        return this.folderPath;
    }

    /**
     * Kind of data set.
     * Expected value is 'AdlsGen2Folder'.
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

    public ADLSGen2FolderDataSetArgs(
        Output<String> accountName,
        @Nullable Output<String> dataSetName,
        Output<String> fileSystem,
        Output<String> folderPath,
        Output<String> kind,
        Output<String> resourceGroup,
        Output<String> resourceGroupName,
        Output<String> shareName,
        Output<String> storageAccountName,
        Output<String> subscriptionId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = dataSetName;
        this.fileSystem = Objects.requireNonNull(fileSystem, "expected parameter 'fileSystem' to be non-null");
        this.folderPath = Objects.requireNonNull(folderPath, "expected parameter 'folderPath' to be non-null");
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private ADLSGen2FolderDataSetArgs() {
        this.accountName = Codegen.empty();
        this.dataSetName = Codegen.empty();
        this.fileSystem = Codegen.empty();
        this.folderPath = Codegen.empty();
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

    public static Builder builder(ADLSGen2FolderDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> dataSetName;
        private Output<String> fileSystem;
        private Output<String> folderPath;
        private Output<String> kind;
        private Output<String> resourceGroup;
        private Output<String> resourceGroupName;
        private Output<String> shareName;
        private Output<String> storageAccountName;
        private Output<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ADLSGen2FolderDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.fileSystem = defaults.fileSystem;
    	      this.folderPath = defaults.folderPath;
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
        public Builder dataSetName(@Nullable Output<String> dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public Builder dataSetName(@Nullable String dataSetName) {
            this.dataSetName = Codegen.ofNullable(dataSetName);
            return this;
        }
        public Builder fileSystem(Output<String> fileSystem) {
            this.fileSystem = Objects.requireNonNull(fileSystem);
            return this;
        }
        public Builder fileSystem(String fileSystem) {
            this.fileSystem = Output.of(Objects.requireNonNull(fileSystem));
            return this;
        }
        public Builder folderPath(Output<String> folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }
        public Builder folderPath(String folderPath) {
            this.folderPath = Output.of(Objects.requireNonNull(folderPath));
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
        }        public ADLSGen2FolderDataSetArgs build() {
            return new ADLSGen2FolderDataSetArgs(accountName, dataSetName, fileSystem, folderPath, kind, resourceGroup, resourceGroupName, shareName, storageAccountName, subscriptionId);
        }
    }
}
