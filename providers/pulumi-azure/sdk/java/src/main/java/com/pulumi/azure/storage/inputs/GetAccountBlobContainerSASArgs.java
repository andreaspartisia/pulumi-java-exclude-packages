// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPermissions;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountBlobContainerSASArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountBlobContainerSASArgs Empty = new GetAccountBlobContainerSASArgs();

    /**
     * The `Cache-Control` response header that is sent when this SAS token is used.
     * 
     */
    @Import(name="cacheControl")
    private @Nullable String cacheControl;

    /**
     * @return The `Cache-Control` response header that is sent when this SAS token is used.
     * 
     */
    public Optional<String> cacheControl() {
        return Optional.ofNullable(this.cacheControl);
    }

    /**
     * The connection string for the storage account to which this SAS applies. Typically directly from the `primary_connection_string` attribute of an `azure.storage.Account` resource.
     * 
     */
    @Import(name="connectionString", required=true)
    private String connectionString;

    /**
     * @return The connection string for the storage account to which this SAS applies. Typically directly from the `primary_connection_string` attribute of an `azure.storage.Account` resource.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Name of the container.
     * 
     */
    @Import(name="containerName", required=true)
    private String containerName;

    /**
     * @return Name of the container.
     * 
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * The `Content-Disposition` response header that is sent when this SAS token is used.
     * 
     */
    @Import(name="contentDisposition")
    private @Nullable String contentDisposition;

    /**
     * @return The `Content-Disposition` response header that is sent when this SAS token is used.
     * 
     */
    public Optional<String> contentDisposition() {
        return Optional.ofNullable(this.contentDisposition);
    }

    /**
     * The `Content-Encoding` response header that is sent when this SAS token is used.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable String contentEncoding;

    /**
     * @return The `Content-Encoding` response header that is sent when this SAS token is used.
     * 
     */
    public Optional<String> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    /**
     * The `Content-Language` response header that is sent when this SAS token is used.
     * 
     */
    @Import(name="contentLanguage")
    private @Nullable String contentLanguage;

    /**
     * @return The `Content-Language` response header that is sent when this SAS token is used.
     * 
     */
    public Optional<String> contentLanguage() {
        return Optional.ofNullable(this.contentLanguage);
    }

    /**
     * The `Content-Type` response header that is sent when this SAS token is used.
     * 
     */
    @Import(name="contentType")
    private @Nullable String contentType;

    /**
     * @return The `Content-Type` response header that is sent when this SAS token is used.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
     * 
     */
    @Import(name="expiry", required=true)
    private String expiry;

    /**
     * @return The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
     * 
     */
    public String expiry() {
        return this.expiry;
    }

    /**
     * Only permit `https` access. If `false`, both `http` and `https` are permitted. Defaults to `true`.
     * 
     */
    @Import(name="httpsOnly")
    private @Nullable Boolean httpsOnly;

    /**
     * @return Only permit `https` access. If `false`, both `http` and `https` are permitted. Defaults to `true`.
     * 
     */
    public Optional<Boolean> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }

    /**
     * Single IPv4 address or range (connected with a dash) of IPv4 addresses.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    /**
     * @return Single IPv4 address or range (connected with a dash) of IPv4 addresses.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * A `permissions` block as defined below.
     * 
     */
    @Import(name="permissions", required=true)
    private GetAccountBlobContainerSASPermissions permissions;

    /**
     * @return A `permissions` block as defined below.
     * 
     */
    public GetAccountBlobContainerSASPermissions permissions() {
        return this.permissions;
    }

    /**
     * The starting time and date of validity of this SAS. Must be a valid ISO-8601 format time/date string.
     * 
     */
    @Import(name="start", required=true)
    private String start;

    /**
     * @return The starting time and date of validity of this SAS. Must be a valid ISO-8601 format time/date string.
     * 
     */
    public String start() {
        return this.start;
    }

    private GetAccountBlobContainerSASArgs() {}

    private GetAccountBlobContainerSASArgs(GetAccountBlobContainerSASArgs $) {
        this.cacheControl = $.cacheControl;
        this.connectionString = $.connectionString;
        this.containerName = $.containerName;
        this.contentDisposition = $.contentDisposition;
        this.contentEncoding = $.contentEncoding;
        this.contentLanguage = $.contentLanguage;
        this.contentType = $.contentType;
        this.expiry = $.expiry;
        this.httpsOnly = $.httpsOnly;
        this.ipAddress = $.ipAddress;
        this.permissions = $.permissions;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountBlobContainerSASArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountBlobContainerSASArgs $;

        public Builder() {
            $ = new GetAccountBlobContainerSASArgs();
        }

        public Builder(GetAccountBlobContainerSASArgs defaults) {
            $ = new GetAccountBlobContainerSASArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheControl The `Cache-Control` response header that is sent when this SAS token is used.
         * 
         * @return builder
         * 
         */
        public Builder cacheControl(@Nullable String cacheControl) {
            $.cacheControl = cacheControl;
            return this;
        }

        /**
         * @param connectionString The connection string for the storage account to which this SAS applies. Typically directly from the `primary_connection_string` attribute of an `azure.storage.Account` resource.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param containerName Name of the container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param contentDisposition The `Content-Disposition` response header that is sent when this SAS token is used.
         * 
         * @return builder
         * 
         */
        public Builder contentDisposition(@Nullable String contentDisposition) {
            $.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * @param contentEncoding The `Content-Encoding` response header that is sent when this SAS token is used.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(@Nullable String contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * @param contentLanguage The `Content-Language` response header that is sent when this SAS token is used.
         * 
         * @return builder
         * 
         */
        public Builder contentLanguage(@Nullable String contentLanguage) {
            $.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * @param contentType The `Content-Type` response header that is sent when this SAS token is used.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable String contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param expiry The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
         * 
         * @return builder
         * 
         */
        public Builder expiry(String expiry) {
            $.expiry = expiry;
            return this;
        }

        /**
         * @param httpsOnly Only permit `https` access. If `false`, both `http` and `https` are permitted. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        /**
         * @param ipAddress Single IPv4 address or range (connected with a dash) of IPv4 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param permissions A `permissions` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder permissions(GetAccountBlobContainerSASPermissions permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param start The starting time and date of validity of this SAS. Must be a valid ISO-8601 format time/date string.
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            $.start = start;
            return this;
        }

        public GetAccountBlobContainerSASArgs build() {
            $.connectionString = Objects.requireNonNull($.connectionString, "expected parameter 'connectionString' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.expiry = Objects.requireNonNull($.expiry, "expected parameter 'expiry' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            return $;
        }
    }

}
