// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterDiagnosticsConfig {
    /**
     * @return The Blob Endpoint of the Storage Account.
     * 
     */
    private final String blobEndpoint;
    /**
     * @return The protected diagnostics storage key name, such as `StorageAccountKey1`.
     * 
     */
    private final String protectedAccountKeyName;
    /**
     * @return The Queue Endpoint of the Storage Account.
     * 
     */
    private final String queueEndpoint;
    /**
     * @return The name of the Storage Account where the Diagnostics should be sent to.
     * 
     */
    private final String storageAccountName;
    /**
     * @return The Table Endpoint of the Storage Account.
     * 
     */
    private final String tableEndpoint;

    @CustomType.Constructor
    private ClusterDiagnosticsConfig(
        @CustomType.Parameter("blobEndpoint") String blobEndpoint,
        @CustomType.Parameter("protectedAccountKeyName") String protectedAccountKeyName,
        @CustomType.Parameter("queueEndpoint") String queueEndpoint,
        @CustomType.Parameter("storageAccountName") String storageAccountName,
        @CustomType.Parameter("tableEndpoint") String tableEndpoint) {
        this.blobEndpoint = blobEndpoint;
        this.protectedAccountKeyName = protectedAccountKeyName;
        this.queueEndpoint = queueEndpoint;
        this.storageAccountName = storageAccountName;
        this.tableEndpoint = tableEndpoint;
    }

    /**
     * @return The Blob Endpoint of the Storage Account.
     * 
     */
    public String blobEndpoint() {
        return this.blobEndpoint;
    }
    /**
     * @return The protected diagnostics storage key name, such as `StorageAccountKey1`.
     * 
     */
    public String protectedAccountKeyName() {
        return this.protectedAccountKeyName;
    }
    /**
     * @return The Queue Endpoint of the Storage Account.
     * 
     */
    public String queueEndpoint() {
        return this.queueEndpoint;
    }
    /**
     * @return The name of the Storage Account where the Diagnostics should be sent to.
     * 
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * @return The Table Endpoint of the Storage Account.
     * 
     */
    public String tableEndpoint() {
        return this.tableEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDiagnosticsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blobEndpoint;
        private String protectedAccountKeyName;
        private String queueEndpoint;
        private String storageAccountName;
        private String tableEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDiagnosticsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobEndpoint = defaults.blobEndpoint;
    	      this.protectedAccountKeyName = defaults.protectedAccountKeyName;
    	      this.queueEndpoint = defaults.queueEndpoint;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.tableEndpoint = defaults.tableEndpoint;
        }

        public Builder blobEndpoint(String blobEndpoint) {
            this.blobEndpoint = Objects.requireNonNull(blobEndpoint);
            return this;
        }
        public Builder protectedAccountKeyName(String protectedAccountKeyName) {
            this.protectedAccountKeyName = Objects.requireNonNull(protectedAccountKeyName);
            return this;
        }
        public Builder queueEndpoint(String queueEndpoint) {
            this.queueEndpoint = Objects.requireNonNull(queueEndpoint);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder tableEndpoint(String tableEndpoint) {
            this.tableEndpoint = Objects.requireNonNull(tableEndpoint);
            return this;
        }        public ClusterDiagnosticsConfig build() {
            return new ClusterDiagnosticsConfig(blobEndpoint, protectedAccountKeyName, queueEndpoint, storageAccountName, tableEndpoint);
        }
    }
}
