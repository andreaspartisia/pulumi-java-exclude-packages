// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.HttpProtocol;
import com.pulumi.azurenative.storage.enums.Permissions;
import com.pulumi.azurenative.storage.enums.Services;
import com.pulumi.azurenative.storage.enums.SignedResourceTypes;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListStorageAccountSASArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListStorageAccountSASArgs Empty = new ListStorageAccountSASArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * An IP address or a range of IP addresses from which to accept requests.
     * 
     */
    @Import(name="iPAddressOrRange")
    private @Nullable String iPAddressOrRange;

    public Optional<String> iPAddressOrRange() {
        return Optional.ofNullable(this.iPAddressOrRange);
    }

    /**
     * The key to sign the account SAS token with.
     * 
     */
    @Import(name="keyToSign")
    private @Nullable String keyToSign;

    public Optional<String> keyToSign() {
        return Optional.ofNullable(this.keyToSign);
    }

    /**
     * The signed permissions for the account SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     * 
     */
    @Import(name="permissions", required=true)
    private Either<String,Permissions> permissions;

    public Either<String,Permissions> permissions() {
        return this.permissions;
    }

    /**
     * The protocol permitted for a request made with the account SAS.
     * 
     */
    @Import(name="protocols")
    private @Nullable HttpProtocol protocols;

    public Optional<HttpProtocol> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The signed resource types that are accessible with the account SAS. Service (s): Access to service-level APIs; Container (c): Access to container-level APIs; Object (o): Access to object-level APIs for blobs, queue messages, table entities, and files.
     * 
     */
    @Import(name="resourceTypes", required=true)
    private Either<String,SignedResourceTypes> resourceTypes;

    public Either<String,SignedResourceTypes> resourceTypes() {
        return this.resourceTypes;
    }

    /**
     * The signed services accessible with the account SAS. Possible values include: Blob (b), Queue (q), Table (t), File (f).
     * 
     */
    @Import(name="services", required=true)
    private Either<String,Services> services;

    public Either<String,Services> services() {
        return this.services;
    }

    /**
     * The time at which the shared access signature becomes invalid.
     * 
     */
    @Import(name="sharedAccessExpiryTime", required=true)
    private String sharedAccessExpiryTime;

    public String sharedAccessExpiryTime() {
        return this.sharedAccessExpiryTime;
    }

    /**
     * The time at which the SAS becomes valid.
     * 
     */
    @Import(name="sharedAccessStartTime")
    private @Nullable String sharedAccessStartTime;

    public Optional<String> sharedAccessStartTime() {
        return Optional.ofNullable(this.sharedAccessStartTime);
    }

    private ListStorageAccountSASArgs() {}

    private ListStorageAccountSASArgs(ListStorageAccountSASArgs $) {
        this.accountName = $.accountName;
        this.iPAddressOrRange = $.iPAddressOrRange;
        this.keyToSign = $.keyToSign;
        this.permissions = $.permissions;
        this.protocols = $.protocols;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceTypes = $.resourceTypes;
        this.services = $.services;
        this.sharedAccessExpiryTime = $.sharedAccessExpiryTime;
        this.sharedAccessStartTime = $.sharedAccessStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListStorageAccountSASArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListStorageAccountSASArgs $;

        public Builder() {
            $ = new ListStorageAccountSASArgs();
        }

        public Builder(ListStorageAccountSASArgs defaults) {
            $ = new ListStorageAccountSASArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder iPAddressOrRange(@Nullable String iPAddressOrRange) {
            $.iPAddressOrRange = iPAddressOrRange;
            return this;
        }

        public Builder keyToSign(@Nullable String keyToSign) {
            $.keyToSign = keyToSign;
            return this;
        }

        public Builder permissions(Either<String,Permissions> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(String permissions) {
            return permissions(Either.ofLeft(permissions));
        }

        public Builder permissions(Permissions permissions) {
            return permissions(Either.ofRight(permissions));
        }

        public Builder protocols(@Nullable HttpProtocol protocols) {
            $.protocols = protocols;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceTypes(Either<String,SignedResourceTypes> resourceTypes) {
            $.resourceTypes = resourceTypes;
            return this;
        }

        public Builder resourceTypes(String resourceTypes) {
            return resourceTypes(Either.ofLeft(resourceTypes));
        }

        public Builder resourceTypes(SignedResourceTypes resourceTypes) {
            return resourceTypes(Either.ofRight(resourceTypes));
        }

        public Builder services(Either<String,Services> services) {
            $.services = services;
            return this;
        }

        public Builder services(String services) {
            return services(Either.ofLeft(services));
        }

        public Builder services(Services services) {
            return services(Either.ofRight(services));
        }

        public Builder sharedAccessExpiryTime(String sharedAccessExpiryTime) {
            $.sharedAccessExpiryTime = sharedAccessExpiryTime;
            return this;
        }

        public Builder sharedAccessStartTime(@Nullable String sharedAccessStartTime) {
            $.sharedAccessStartTime = sharedAccessStartTime;
            return this;
        }

        public ListStorageAccountSASArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceTypes = Objects.requireNonNull($.resourceTypes, "expected parameter 'resourceTypes' to be non-null");
            $.services = Objects.requireNonNull($.services, "expected parameter 'services' to be non-null");
            $.sharedAccessExpiryTime = Objects.requireNonNull($.sharedAccessExpiryTime, "expected parameter 'sharedAccessExpiryTime' to be non-null");
            return $;
        }
    }

}
