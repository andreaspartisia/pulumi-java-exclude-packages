// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SubscriptionCostManagementExportExportDataStorageLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionCostManagementExportExportDataStorageLocationArgs Empty = new SubscriptionCostManagementExportExportDataStorageLocationArgs();

    /**
     * The Resource Manager ID of the container where exports will be uploaded.
     * 
     */
    @Import(name="containerId", required=true)
    private Output<String> containerId;

    /**
     * @return The Resource Manager ID of the container where exports will be uploaded.
     * 
     */
    public Output<String> containerId() {
        return this.containerId;
    }

    /**
     * The path of the directory where exports will be uploaded.
     * 
     */
    @Import(name="rootFolderPath", required=true)
    private Output<String> rootFolderPath;

    /**
     * @return The path of the directory where exports will be uploaded.
     * 
     */
    public Output<String> rootFolderPath() {
        return this.rootFolderPath;
    }

    private SubscriptionCostManagementExportExportDataStorageLocationArgs() {}

    private SubscriptionCostManagementExportExportDataStorageLocationArgs(SubscriptionCostManagementExportExportDataStorageLocationArgs $) {
        this.containerId = $.containerId;
        this.rootFolderPath = $.rootFolderPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionCostManagementExportExportDataStorageLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionCostManagementExportExportDataStorageLocationArgs $;

        public Builder() {
            $ = new SubscriptionCostManagementExportExportDataStorageLocationArgs();
        }

        public Builder(SubscriptionCostManagementExportExportDataStorageLocationArgs defaults) {
            $ = new SubscriptionCostManagementExportExportDataStorageLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerId The Resource Manager ID of the container where exports will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder containerId(Output<String> containerId) {
            $.containerId = containerId;
            return this;
        }

        /**
         * @param containerId The Resource Manager ID of the container where exports will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder containerId(String containerId) {
            return containerId(Output.of(containerId));
        }

        /**
         * @param rootFolderPath The path of the directory where exports will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder rootFolderPath(Output<String> rootFolderPath) {
            $.rootFolderPath = rootFolderPath;
            return this;
        }

        /**
         * @param rootFolderPath The path of the directory where exports will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder rootFolderPath(String rootFolderPath) {
            return rootFolderPath(Output.of(rootFolderPath));
        }

        public SubscriptionCostManagementExportExportDataStorageLocationArgs build() {
            $.containerId = Objects.requireNonNull($.containerId, "expected parameter 'containerId' to be non-null");
            $.rootFolderPath = Objects.requireNonNull($.rootFolderPath, "expected parameter 'rootFolderPath' to be non-null");
            return $;
        }
    }

}
