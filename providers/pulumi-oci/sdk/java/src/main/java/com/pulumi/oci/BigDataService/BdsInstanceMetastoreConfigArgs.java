// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.BigDataService;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BdsInstanceMetastoreConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BdsInstanceMetastoreConfigArgs Empty = new BdsInstanceMetastoreConfigArgs();

    /**
     * (Updatable) An optional integer, when flipped triggers activation of metastore config.
     * 
     */
    @Import(name="activateTrigger")
    private @Nullable Output<Integer> activateTrigger;

    /**
     * @return (Updatable) An optional integer, when flipped triggers activation of metastore config.
     * 
     */
    public Optional<Output<Integer>> activateTrigger() {
        return Optional.ofNullable(this.activateTrigger);
    }

    /**
     * (Updatable) The ID of BDS Api Key used for Data Catalog metastore integration.
     * 
     */
    @Import(name="bdsApiKeyId", required=true)
    private Output<String> bdsApiKeyId;

    /**
     * @return (Updatable) The ID of BDS Api Key used for Data Catalog metastore integration.
     * 
     */
    public Output<String> bdsApiKeyId() {
        return this.bdsApiKeyId;
    }

    /**
     * (Updatable) Base-64 encoded passphrase of the BDS Api Key.
     * 
     */
    @Import(name="bdsApiKeyPassphrase", required=true)
    private Output<String> bdsApiKeyPassphrase;

    /**
     * @return (Updatable) Base-64 encoded passphrase of the BDS Api Key.
     * 
     */
    public Output<String> bdsApiKeyPassphrase() {
        return this.bdsApiKeyPassphrase;
    }

    /**
     * The OCID of the cluster.
     * 
     */
    @Import(name="bdsInstanceId", required=true)
    private Output<String> bdsInstanceId;

    /**
     * @return The OCID of the cluster.
     * 
     */
    public Output<String> bdsInstanceId() {
        return this.bdsInstanceId;
    }

    /**
     * (Updatable) Base-64 encoded password for the cluster admin user.
     * 
     */
    @Import(name="clusterAdminPassword", required=true)
    private Output<String> clusterAdminPassword;

    /**
     * @return (Updatable) Base-64 encoded password for the cluster admin user.
     * 
     */
    public Output<String> clusterAdminPassword() {
        return this.clusterAdminPassword;
    }

    /**
     * (Updatable) The display name of the metastore configuration
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) The display name of the metastore configuration
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The OCID of the Data Catalog metastore.
     * 
     */
    @Import(name="metastoreId", required=true)
    private Output<String> metastoreId;

    /**
     * @return The OCID of the Data Catalog metastore.
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }

    private BdsInstanceMetastoreConfigArgs() {}

    private BdsInstanceMetastoreConfigArgs(BdsInstanceMetastoreConfigArgs $) {
        this.activateTrigger = $.activateTrigger;
        this.bdsApiKeyId = $.bdsApiKeyId;
        this.bdsApiKeyPassphrase = $.bdsApiKeyPassphrase;
        this.bdsInstanceId = $.bdsInstanceId;
        this.clusterAdminPassword = $.clusterAdminPassword;
        this.displayName = $.displayName;
        this.metastoreId = $.metastoreId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BdsInstanceMetastoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BdsInstanceMetastoreConfigArgs $;

        public Builder() {
            $ = new BdsInstanceMetastoreConfigArgs();
        }

        public Builder(BdsInstanceMetastoreConfigArgs defaults) {
            $ = new BdsInstanceMetastoreConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activateTrigger (Updatable) An optional integer, when flipped triggers activation of metastore config.
         * 
         * @return builder
         * 
         */
        public Builder activateTrigger(@Nullable Output<Integer> activateTrigger) {
            $.activateTrigger = activateTrigger;
            return this;
        }

        /**
         * @param activateTrigger (Updatable) An optional integer, when flipped triggers activation of metastore config.
         * 
         * @return builder
         * 
         */
        public Builder activateTrigger(Integer activateTrigger) {
            return activateTrigger(Output.of(activateTrigger));
        }

        /**
         * @param bdsApiKeyId (Updatable) The ID of BDS Api Key used for Data Catalog metastore integration.
         * 
         * @return builder
         * 
         */
        public Builder bdsApiKeyId(Output<String> bdsApiKeyId) {
            $.bdsApiKeyId = bdsApiKeyId;
            return this;
        }

        /**
         * @param bdsApiKeyId (Updatable) The ID of BDS Api Key used for Data Catalog metastore integration.
         * 
         * @return builder
         * 
         */
        public Builder bdsApiKeyId(String bdsApiKeyId) {
            return bdsApiKeyId(Output.of(bdsApiKeyId));
        }

        /**
         * @param bdsApiKeyPassphrase (Updatable) Base-64 encoded passphrase of the BDS Api Key.
         * 
         * @return builder
         * 
         */
        public Builder bdsApiKeyPassphrase(Output<String> bdsApiKeyPassphrase) {
            $.bdsApiKeyPassphrase = bdsApiKeyPassphrase;
            return this;
        }

        /**
         * @param bdsApiKeyPassphrase (Updatable) Base-64 encoded passphrase of the BDS Api Key.
         * 
         * @return builder
         * 
         */
        public Builder bdsApiKeyPassphrase(String bdsApiKeyPassphrase) {
            return bdsApiKeyPassphrase(Output.of(bdsApiKeyPassphrase));
        }

        /**
         * @param bdsInstanceId The OCID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder bdsInstanceId(Output<String> bdsInstanceId) {
            $.bdsInstanceId = bdsInstanceId;
            return this;
        }

        /**
         * @param bdsInstanceId The OCID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            return bdsInstanceId(Output.of(bdsInstanceId));
        }

        /**
         * @param clusterAdminPassword (Updatable) Base-64 encoded password for the cluster admin user.
         * 
         * @return builder
         * 
         */
        public Builder clusterAdminPassword(Output<String> clusterAdminPassword) {
            $.clusterAdminPassword = clusterAdminPassword;
            return this;
        }

        /**
         * @param clusterAdminPassword (Updatable) Base-64 encoded password for the cluster admin user.
         * 
         * @return builder
         * 
         */
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            return clusterAdminPassword(Output.of(clusterAdminPassword));
        }

        /**
         * @param displayName (Updatable) The display name of the metastore configuration
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) The display name of the metastore configuration
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param metastoreId The OCID of the Data Catalog metastore.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId The OCID of the Data Catalog metastore.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        public BdsInstanceMetastoreConfigArgs build() {
            $.bdsApiKeyId = Objects.requireNonNull($.bdsApiKeyId, "expected parameter 'bdsApiKeyId' to be non-null");
            $.bdsApiKeyPassphrase = Objects.requireNonNull($.bdsApiKeyPassphrase, "expected parameter 'bdsApiKeyPassphrase' to be non-null");
            $.bdsInstanceId = Objects.requireNonNull($.bdsInstanceId, "expected parameter 'bdsInstanceId' to be non-null");
            $.clusterAdminPassword = Objects.requireNonNull($.clusterAdminPassword, "expected parameter 'clusterAdminPassword' to be non-null");
            $.metastoreId = Objects.requireNonNull($.metastoreId, "expected parameter 'metastoreId' to be non-null");
            return $;
        }
    }

}
