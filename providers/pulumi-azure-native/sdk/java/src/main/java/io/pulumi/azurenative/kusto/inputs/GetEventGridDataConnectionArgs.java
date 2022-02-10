// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEventGridDataConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventGridDataConnectionArgs Empty = new GetEventGridDataConnectionArgs();

    @InputImport(name="clusterName", required=true)
    private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    @InputImport(name="dataConnectionName", required=true)
    private final String dataConnectionName;

    public String getDataConnectionName() {
        return this.dataConnectionName;
    }

    @InputImport(name="databaseName", required=true)
    private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetEventGridDataConnectionArgs(
        String clusterName,
        String dataConnectionName,
        String databaseName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.dataConnectionName = Objects.requireNonNull(dataConnectionName, "expected parameter 'dataConnectionName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetEventGridDataConnectionArgs() {
        this.clusterName = null;
        this.dataConnectionName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventGridDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String dataConnectionName;
        private String databaseName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventGridDataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setDataConnectionName(String dataConnectionName) {
            this.dataConnectionName = Objects.requireNonNull(dataConnectionName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetEventGridDataConnectionArgs build() {
            return new GetEventGridDataConnectionArgs(clusterName, dataConnectionName, databaseName, resourceGroupName);
        }
    }
}