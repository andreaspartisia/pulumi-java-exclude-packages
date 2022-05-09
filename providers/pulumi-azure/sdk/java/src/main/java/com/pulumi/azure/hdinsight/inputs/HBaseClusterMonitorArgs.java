// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class HBaseClusterMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final HBaseClusterMonitorArgs Empty = new HBaseClusterMonitorArgs();

    /**
     * The Operations Management Suite (OMS) workspace ID.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The Operations Management Suite (OMS) workspace ID.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * The Operations Management Suite (OMS) workspace key.
     * 
     */
    @Import(name="primaryKey", required=true)
    private Output<String> primaryKey;

    /**
     * @return The Operations Management Suite (OMS) workspace key.
     * 
     */
    public Output<String> primaryKey() {
        return this.primaryKey;
    }

    private HBaseClusterMonitorArgs() {}

    private HBaseClusterMonitorArgs(HBaseClusterMonitorArgs $) {
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.primaryKey = $.primaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HBaseClusterMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HBaseClusterMonitorArgs $;

        public Builder() {
            $ = new HBaseClusterMonitorArgs();
        }

        public Builder(HBaseClusterMonitorArgs defaults) {
            $ = new HBaseClusterMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logAnalyticsWorkspaceId The Operations Management Suite (OMS) workspace ID.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The Operations Management Suite (OMS) workspace ID.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param primaryKey The Operations Management Suite (OMS) workspace key.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(Output<String> primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        /**
         * @param primaryKey The Operations Management Suite (OMS) workspace key.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(String primaryKey) {
            return primaryKey(Output.of(primaryKey));
        }

        public HBaseClusterMonitorArgs build() {
            $.logAnalyticsWorkspaceId = Objects.requireNonNull($.logAnalyticsWorkspaceId, "expected parameter 'logAnalyticsWorkspaceId' to be non-null");
            $.primaryKey = Objects.requireNonNull($.primaryKey, "expected parameter 'primaryKey' to be non-null");
            return $;
        }
    }

}
