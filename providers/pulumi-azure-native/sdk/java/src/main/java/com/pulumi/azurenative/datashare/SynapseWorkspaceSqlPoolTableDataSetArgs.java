// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SynapseWorkspaceSqlPoolTableDataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SynapseWorkspaceSqlPoolTableDataSetArgs Empty = new SynapseWorkspaceSqlPoolTableDataSetArgs();

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
     * Kind of data set.
     * Expected value is 'SynapseWorkspaceSqlPoolTable'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
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
     * Resource id of the Synapse Workspace SQL Pool Table
     * 
     */
    @Import(name="synapseWorkspaceSqlPoolTableResourceId", required=true)
      private final Output<String> synapseWorkspaceSqlPoolTableResourceId;

    public Output<String> synapseWorkspaceSqlPoolTableResourceId() {
        return this.synapseWorkspaceSqlPoolTableResourceId;
    }

    public SynapseWorkspaceSqlPoolTableDataSetArgs(
        Output<String> accountName,
        @Nullable Output<String> dataSetName,
        Output<String> kind,
        Output<String> resourceGroupName,
        Output<String> shareName,
        Output<String> synapseWorkspaceSqlPoolTableResourceId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = dataSetName;
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId, "expected parameter 'synapseWorkspaceSqlPoolTableResourceId' to be non-null");
    }

    private SynapseWorkspaceSqlPoolTableDataSetArgs() {
        this.accountName = Codegen.empty();
        this.dataSetName = Codegen.empty();
        this.kind = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.shareName = Codegen.empty();
        this.synapseWorkspaceSqlPoolTableResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SynapseWorkspaceSqlPoolTableDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> dataSetName;
        private Output<String> kind;
        private Output<String> resourceGroupName;
        private Output<String> shareName;
        private Output<String> synapseWorkspaceSqlPoolTableResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(SynapseWorkspaceSqlPoolTableDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
    	      this.synapseWorkspaceSqlPoolTableResourceId = defaults.synapseWorkspaceSqlPoolTableResourceId;
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
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
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
        public Builder synapseWorkspaceSqlPoolTableResourceId(Output<String> synapseWorkspaceSqlPoolTableResourceId) {
            this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId);
            return this;
        }
        public Builder synapseWorkspaceSqlPoolTableResourceId(String synapseWorkspaceSqlPoolTableResourceId) {
            this.synapseWorkspaceSqlPoolTableResourceId = Output.of(Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId));
            return this;
        }        public SynapseWorkspaceSqlPoolTableDataSetArgs build() {
            return new SynapseWorkspaceSqlPoolTableDataSetArgs(accountName, dataSetName, kind, resourceGroupName, shareName, synapseWorkspaceSqlPoolTableResourceId);
        }
    }
}
