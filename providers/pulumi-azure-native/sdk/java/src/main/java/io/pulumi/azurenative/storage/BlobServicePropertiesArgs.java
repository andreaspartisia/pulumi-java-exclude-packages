// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.inputs.ChangeFeedArgs;
import io.pulumi.azurenative.storage.inputs.CorsRulesArgs;
import io.pulumi.azurenative.storage.inputs.DeleteRetentionPolicyArgs;
import io.pulumi.azurenative.storage.inputs.LastAccessTimeTrackingPolicyArgs;
import io.pulumi.azurenative.storage.inputs.RestorePolicyPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlobServicePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobServicePropertiesArgs Empty = new BlobServicePropertiesArgs();

    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    @InputImport(name="automaticSnapshotPolicyEnabled")
    private final @Nullable Input<Boolean> automaticSnapshotPolicyEnabled;

    public Input<Boolean> getAutomaticSnapshotPolicyEnabled() {
        return this.automaticSnapshotPolicyEnabled == null ? Input.empty() : this.automaticSnapshotPolicyEnabled;
    }

    @InputImport(name="blobServicesName")
    private final @Nullable Input<String> blobServicesName;

    public Input<String> getBlobServicesName() {
        return this.blobServicesName == null ? Input.empty() : this.blobServicesName;
    }

    @InputImport(name="changeFeed")
    private final @Nullable Input<ChangeFeedArgs> changeFeed;

    public Input<ChangeFeedArgs> getChangeFeed() {
        return this.changeFeed == null ? Input.empty() : this.changeFeed;
    }

    @InputImport(name="containerDeleteRetentionPolicy")
    private final @Nullable Input<DeleteRetentionPolicyArgs> containerDeleteRetentionPolicy;

    public Input<DeleteRetentionPolicyArgs> getContainerDeleteRetentionPolicy() {
        return this.containerDeleteRetentionPolicy == null ? Input.empty() : this.containerDeleteRetentionPolicy;
    }

    @InputImport(name="cors")
    private final @Nullable Input<CorsRulesArgs> cors;

    public Input<CorsRulesArgs> getCors() {
        return this.cors == null ? Input.empty() : this.cors;
    }

    @InputImport(name="defaultServiceVersion")
    private final @Nullable Input<String> defaultServiceVersion;

    public Input<String> getDefaultServiceVersion() {
        return this.defaultServiceVersion == null ? Input.empty() : this.defaultServiceVersion;
    }

    @InputImport(name="deleteRetentionPolicy")
    private final @Nullable Input<DeleteRetentionPolicyArgs> deleteRetentionPolicy;

    public Input<DeleteRetentionPolicyArgs> getDeleteRetentionPolicy() {
        return this.deleteRetentionPolicy == null ? Input.empty() : this.deleteRetentionPolicy;
    }

    @InputImport(name="isVersioningEnabled")
    private final @Nullable Input<Boolean> isVersioningEnabled;

    public Input<Boolean> getIsVersioningEnabled() {
        return this.isVersioningEnabled == null ? Input.empty() : this.isVersioningEnabled;
    }

    @InputImport(name="lastAccessTimeTrackingPolicy")
    private final @Nullable Input<LastAccessTimeTrackingPolicyArgs> lastAccessTimeTrackingPolicy;

    public Input<LastAccessTimeTrackingPolicyArgs> getLastAccessTimeTrackingPolicy() {
        return this.lastAccessTimeTrackingPolicy == null ? Input.empty() : this.lastAccessTimeTrackingPolicy;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="restorePolicy")
    private final @Nullable Input<RestorePolicyPropertiesArgs> restorePolicy;

    public Input<RestorePolicyPropertiesArgs> getRestorePolicy() {
        return this.restorePolicy == null ? Input.empty() : this.restorePolicy;
    }

    public BlobServicePropertiesArgs(
        Input<String> accountName,
        @Nullable Input<Boolean> automaticSnapshotPolicyEnabled,
        @Nullable Input<String> blobServicesName,
        @Nullable Input<ChangeFeedArgs> changeFeed,
        @Nullable Input<DeleteRetentionPolicyArgs> containerDeleteRetentionPolicy,
        @Nullable Input<CorsRulesArgs> cors,
        @Nullable Input<String> defaultServiceVersion,
        @Nullable Input<DeleteRetentionPolicyArgs> deleteRetentionPolicy,
        @Nullable Input<Boolean> isVersioningEnabled,
        @Nullable Input<LastAccessTimeTrackingPolicyArgs> lastAccessTimeTrackingPolicy,
        Input<String> resourceGroupName,
        @Nullable Input<RestorePolicyPropertiesArgs> restorePolicy) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.automaticSnapshotPolicyEnabled = automaticSnapshotPolicyEnabled;
        this.blobServicesName = blobServicesName;
        this.changeFeed = changeFeed;
        this.containerDeleteRetentionPolicy = containerDeleteRetentionPolicy;
        this.cors = cors;
        this.defaultServiceVersion = defaultServiceVersion;
        this.deleteRetentionPolicy = deleteRetentionPolicy;
        this.isVersioningEnabled = isVersioningEnabled;
        this.lastAccessTimeTrackingPolicy = lastAccessTimeTrackingPolicy;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorePolicy = restorePolicy;
    }

    private BlobServicePropertiesArgs() {
        this.accountName = Input.empty();
        this.automaticSnapshotPolicyEnabled = Input.empty();
        this.blobServicesName = Input.empty();
        this.changeFeed = Input.empty();
        this.containerDeleteRetentionPolicy = Input.empty();
        this.cors = Input.empty();
        this.defaultServiceVersion = Input.empty();
        this.deleteRetentionPolicy = Input.empty();
        this.isVersioningEnabled = Input.empty();
        this.lastAccessTimeTrackingPolicy = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restorePolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<Boolean> automaticSnapshotPolicyEnabled;
        private @Nullable Input<String> blobServicesName;
        private @Nullable Input<ChangeFeedArgs> changeFeed;
        private @Nullable Input<DeleteRetentionPolicyArgs> containerDeleteRetentionPolicy;
        private @Nullable Input<CorsRulesArgs> cors;
        private @Nullable Input<String> defaultServiceVersion;
        private @Nullable Input<DeleteRetentionPolicyArgs> deleteRetentionPolicy;
        private @Nullable Input<Boolean> isVersioningEnabled;
        private @Nullable Input<LastAccessTimeTrackingPolicyArgs> lastAccessTimeTrackingPolicy;
        private Input<String> resourceGroupName;
        private @Nullable Input<RestorePolicyPropertiesArgs> restorePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobServicePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.automaticSnapshotPolicyEnabled = defaults.automaticSnapshotPolicyEnabled;
    	      this.blobServicesName = defaults.blobServicesName;
    	      this.changeFeed = defaults.changeFeed;
    	      this.containerDeleteRetentionPolicy = defaults.containerDeleteRetentionPolicy;
    	      this.cors = defaults.cors;
    	      this.defaultServiceVersion = defaults.defaultServiceVersion;
    	      this.deleteRetentionPolicy = defaults.deleteRetentionPolicy;
    	      this.isVersioningEnabled = defaults.isVersioningEnabled;
    	      this.lastAccessTimeTrackingPolicy = defaults.lastAccessTimeTrackingPolicy;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePolicy = defaults.restorePolicy;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setAutomaticSnapshotPolicyEnabled(@Nullable Input<Boolean> automaticSnapshotPolicyEnabled) {
            this.automaticSnapshotPolicyEnabled = automaticSnapshotPolicyEnabled;
            return this;
        }

        public Builder setAutomaticSnapshotPolicyEnabled(@Nullable Boolean automaticSnapshotPolicyEnabled) {
            this.automaticSnapshotPolicyEnabled = Input.ofNullable(automaticSnapshotPolicyEnabled);
            return this;
        }

        public Builder setBlobServicesName(@Nullable Input<String> blobServicesName) {
            this.blobServicesName = blobServicesName;
            return this;
        }

        public Builder setBlobServicesName(@Nullable String blobServicesName) {
            this.blobServicesName = Input.ofNullable(blobServicesName);
            return this;
        }

        public Builder setChangeFeed(@Nullable Input<ChangeFeedArgs> changeFeed) {
            this.changeFeed = changeFeed;
            return this;
        }

        public Builder setChangeFeed(@Nullable ChangeFeedArgs changeFeed) {
            this.changeFeed = Input.ofNullable(changeFeed);
            return this;
        }

        public Builder setContainerDeleteRetentionPolicy(@Nullable Input<DeleteRetentionPolicyArgs> containerDeleteRetentionPolicy) {
            this.containerDeleteRetentionPolicy = containerDeleteRetentionPolicy;
            return this;
        }

        public Builder setContainerDeleteRetentionPolicy(@Nullable DeleteRetentionPolicyArgs containerDeleteRetentionPolicy) {
            this.containerDeleteRetentionPolicy = Input.ofNullable(containerDeleteRetentionPolicy);
            return this;
        }

        public Builder setCors(@Nullable Input<CorsRulesArgs> cors) {
            this.cors = cors;
            return this;
        }

        public Builder setCors(@Nullable CorsRulesArgs cors) {
            this.cors = Input.ofNullable(cors);
            return this;
        }

        public Builder setDefaultServiceVersion(@Nullable Input<String> defaultServiceVersion) {
            this.defaultServiceVersion = defaultServiceVersion;
            return this;
        }

        public Builder setDefaultServiceVersion(@Nullable String defaultServiceVersion) {
            this.defaultServiceVersion = Input.ofNullable(defaultServiceVersion);
            return this;
        }

        public Builder setDeleteRetentionPolicy(@Nullable Input<DeleteRetentionPolicyArgs> deleteRetentionPolicy) {
            this.deleteRetentionPolicy = deleteRetentionPolicy;
            return this;
        }

        public Builder setDeleteRetentionPolicy(@Nullable DeleteRetentionPolicyArgs deleteRetentionPolicy) {
            this.deleteRetentionPolicy = Input.ofNullable(deleteRetentionPolicy);
            return this;
        }

        public Builder setIsVersioningEnabled(@Nullable Input<Boolean> isVersioningEnabled) {
            this.isVersioningEnabled = isVersioningEnabled;
            return this;
        }

        public Builder setIsVersioningEnabled(@Nullable Boolean isVersioningEnabled) {
            this.isVersioningEnabled = Input.ofNullable(isVersioningEnabled);
            return this;
        }

        public Builder setLastAccessTimeTrackingPolicy(@Nullable Input<LastAccessTimeTrackingPolicyArgs> lastAccessTimeTrackingPolicy) {
            this.lastAccessTimeTrackingPolicy = lastAccessTimeTrackingPolicy;
            return this;
        }

        public Builder setLastAccessTimeTrackingPolicy(@Nullable LastAccessTimeTrackingPolicyArgs lastAccessTimeTrackingPolicy) {
            this.lastAccessTimeTrackingPolicy = Input.ofNullable(lastAccessTimeTrackingPolicy);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRestorePolicy(@Nullable Input<RestorePolicyPropertiesArgs> restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }

        public Builder setRestorePolicy(@Nullable RestorePolicyPropertiesArgs restorePolicy) {
            this.restorePolicy = Input.ofNullable(restorePolicy);
            return this;
        }

        public BlobServicePropertiesArgs build() {
            return new BlobServicePropertiesArgs(accountName, automaticSnapshotPolicyEnabled, blobServicesName, changeFeed, containerDeleteRetentionPolicy, cors, defaultServiceVersion, deleteRetentionPolicy, isVersioningEnabled, lastAccessTimeTrackingPolicy, resourceGroupName, restorePolicy);
        }
    }
}