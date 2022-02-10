// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.HttpProtocol;
import io.pulumi.azurenative.storage.enums.Permissions;
import io.pulumi.azurenative.storage.enums.Services;
import io.pulumi.azurenative.storage.enums.SignedResourceTypes;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListStorageAccountSASArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListStorageAccountSASArgs Empty = new ListStorageAccountSASArgs();

    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    @InputImport(name="iPAddressOrRange")
    private final @Nullable String iPAddressOrRange;

    public Optional<String> getIPAddressOrRange() {
        return this.iPAddressOrRange == null ? Optional.empty() : Optional.ofNullable(this.iPAddressOrRange);
    }

    @InputImport(name="keyToSign")
    private final @Nullable String keyToSign;

    public Optional<String> getKeyToSign() {
        return this.keyToSign == null ? Optional.empty() : Optional.ofNullable(this.keyToSign);
    }

    @InputImport(name="permissions", required=true)
    private final Either<String,Permissions> permissions;

    public Either<String,Permissions> getPermissions() {
        return this.permissions;
    }

    @InputImport(name="protocols")
    private final @Nullable HttpProtocol protocols;

    public Optional<HttpProtocol> getProtocols() {
        return this.protocols == null ? Optional.empty() : Optional.ofNullable(this.protocols);
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceTypes", required=true)
    private final Either<String,SignedResourceTypes> resourceTypes;

    public Either<String,SignedResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    @InputImport(name="services", required=true)
    private final Either<String,Services> services;

    public Either<String,Services> getServices() {
        return this.services;
    }

    @InputImport(name="sharedAccessExpiryTime", required=true)
    private final String sharedAccessExpiryTime;

    public String getSharedAccessExpiryTime() {
        return this.sharedAccessExpiryTime;
    }

    @InputImport(name="sharedAccessStartTime")
    private final @Nullable String sharedAccessStartTime;

    public Optional<String> getSharedAccessStartTime() {
        return this.sharedAccessStartTime == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessStartTime);
    }

    public ListStorageAccountSASArgs(
        String accountName,
        @Nullable String iPAddressOrRange,
        @Nullable String keyToSign,
        Either<String,Permissions> permissions,
        @Nullable HttpProtocol protocols,
        String resourceGroupName,
        Either<String,SignedResourceTypes> resourceTypes,
        Either<String,Services> services,
        String sharedAccessExpiryTime,
        @Nullable String sharedAccessStartTime) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.iPAddressOrRange = iPAddressOrRange;
        this.keyToSign = keyToSign;
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.protocols = protocols;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceTypes = Objects.requireNonNull(resourceTypes, "expected parameter 'resourceTypes' to be non-null");
        this.services = Objects.requireNonNull(services, "expected parameter 'services' to be non-null");
        this.sharedAccessExpiryTime = Objects.requireNonNull(sharedAccessExpiryTime, "expected parameter 'sharedAccessExpiryTime' to be non-null");
        this.sharedAccessStartTime = sharedAccessStartTime;
    }

    private ListStorageAccountSASArgs() {
        this.accountName = null;
        this.iPAddressOrRange = null;
        this.keyToSign = null;
        this.permissions = null;
        this.protocols = null;
        this.resourceGroupName = null;
        this.resourceTypes = null;
        this.services = null;
        this.sharedAccessExpiryTime = null;
        this.sharedAccessStartTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountSASArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private @Nullable String iPAddressOrRange;
        private @Nullable String keyToSign;
        private Either<String,Permissions> permissions;
        private @Nullable HttpProtocol protocols;
        private String resourceGroupName;
        private Either<String,SignedResourceTypes> resourceTypes;
        private Either<String,Services> services;
        private String sharedAccessExpiryTime;
        private @Nullable String sharedAccessStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountSASArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.iPAddressOrRange = defaults.iPAddressOrRange;
    	      this.keyToSign = defaults.keyToSign;
    	      this.permissions = defaults.permissions;
    	      this.protocols = defaults.protocols;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.services = defaults.services;
    	      this.sharedAccessExpiryTime = defaults.sharedAccessExpiryTime;
    	      this.sharedAccessStartTime = defaults.sharedAccessStartTime;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setIPAddressOrRange(@Nullable String iPAddressOrRange) {
            this.iPAddressOrRange = iPAddressOrRange;
            return this;
        }

        public Builder setKeyToSign(@Nullable String keyToSign) {
            this.keyToSign = keyToSign;
            return this;
        }

        public Builder setPermissions(Either<String,Permissions> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setProtocols(@Nullable HttpProtocol protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceTypes(Either<String,SignedResourceTypes> resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }

        public Builder setServices(Either<String,Services> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }

        public Builder setSharedAccessExpiryTime(String sharedAccessExpiryTime) {
            this.sharedAccessExpiryTime = Objects.requireNonNull(sharedAccessExpiryTime);
            return this;
        }

        public Builder setSharedAccessStartTime(@Nullable String sharedAccessStartTime) {
            this.sharedAccessStartTime = sharedAccessStartTime;
            return this;
        }

        public ListStorageAccountSASArgs build() {
            return new ListStorageAccountSASArgs(accountName, iPAddressOrRange, keyToSign, permissions, protocols, resourceGroupName, resourceTypes, services, sharedAccessExpiryTime, sharedAccessStartTime);
        }
    }
}