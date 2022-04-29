// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppCatalogListingResourceVersionAgreementState extends com.pulumi.resources.ResourceArgs {

    public static final AppCatalogListingResourceVersionAgreementState Empty = new AppCatalogListingResourceVersionAgreementState();

    /**
     * EULA link
     * 
     */
    @Import(name="eulaLink")
    private @Nullable Output<String> eulaLink;

    /**
     * @return EULA link
     * 
     */
    public Optional<Output<String>> eulaLink() {
        return Optional.ofNullable(this.eulaLink);
    }

    /**
     * The OCID of the listing.
     * 
     */
    @Import(name="listingId")
    private @Nullable Output<String> listingId;

    /**
     * @return The OCID of the listing.
     * 
     */
    public Optional<Output<String>> listingId() {
        return Optional.ofNullable(this.listingId);
    }

    /**
     * Listing Resource Version.
     * 
     */
    @Import(name="listingResourceVersion")
    private @Nullable Output<String> listingResourceVersion;

    /**
     * @return Listing Resource Version.
     * 
     */
    public Optional<Output<String>> listingResourceVersion() {
        return Optional.ofNullable(this.listingResourceVersion);
    }

    /**
     * Oracle TOU link
     * 
     */
    @Import(name="oracleTermsOfUseLink")
    private @Nullable Output<String> oracleTermsOfUseLink;

    /**
     * @return Oracle TOU link
     * 
     */
    public Optional<Output<String>> oracleTermsOfUseLink() {
        return Optional.ofNullable(this.oracleTermsOfUseLink);
    }

    /**
     * A generated signature for this agreement retrieval operation which should be used in the create subscription call.
     * 
     */
    @Import(name="signature")
    private @Nullable Output<String> signature;

    /**
     * @return A generated signature for this agreement retrieval operation which should be used in the create subscription call.
     * 
     */
    public Optional<Output<String>> signature() {
        return Optional.ofNullable(this.signature);
    }

    /**
     * Date and time the agreements were retrieved, in RFC3339 format. Example: `2018-03-20T12:32:53.532Z`
     * 
     */
    @Import(name="timeRetrieved")
    private @Nullable Output<String> timeRetrieved;

    /**
     * @return Date and time the agreements were retrieved, in RFC3339 format. Example: `2018-03-20T12:32:53.532Z`
     * 
     */
    public Optional<Output<String>> timeRetrieved() {
        return Optional.ofNullable(this.timeRetrieved);
    }

    private AppCatalogListingResourceVersionAgreementState() {}

    private AppCatalogListingResourceVersionAgreementState(AppCatalogListingResourceVersionAgreementState $) {
        this.eulaLink = $.eulaLink;
        this.listingId = $.listingId;
        this.listingResourceVersion = $.listingResourceVersion;
        this.oracleTermsOfUseLink = $.oracleTermsOfUseLink;
        this.signature = $.signature;
        this.timeRetrieved = $.timeRetrieved;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppCatalogListingResourceVersionAgreementState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppCatalogListingResourceVersionAgreementState $;

        public Builder() {
            $ = new AppCatalogListingResourceVersionAgreementState();
        }

        public Builder(AppCatalogListingResourceVersionAgreementState defaults) {
            $ = new AppCatalogListingResourceVersionAgreementState(Objects.requireNonNull(defaults));
        }

        /**
         * @param eulaLink EULA link
         * 
         * @return builder
         * 
         */
        public Builder eulaLink(@Nullable Output<String> eulaLink) {
            $.eulaLink = eulaLink;
            return this;
        }

        /**
         * @param eulaLink EULA link
         * 
         * @return builder
         * 
         */
        public Builder eulaLink(String eulaLink) {
            return eulaLink(Output.of(eulaLink));
        }

        /**
         * @param listingId The OCID of the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingId(@Nullable Output<String> listingId) {
            $.listingId = listingId;
            return this;
        }

        /**
         * @param listingId The OCID of the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingId(String listingId) {
            return listingId(Output.of(listingId));
        }

        /**
         * @param listingResourceVersion Listing Resource Version.
         * 
         * @return builder
         * 
         */
        public Builder listingResourceVersion(@Nullable Output<String> listingResourceVersion) {
            $.listingResourceVersion = listingResourceVersion;
            return this;
        }

        /**
         * @param listingResourceVersion Listing Resource Version.
         * 
         * @return builder
         * 
         */
        public Builder listingResourceVersion(String listingResourceVersion) {
            return listingResourceVersion(Output.of(listingResourceVersion));
        }

        /**
         * @param oracleTermsOfUseLink Oracle TOU link
         * 
         * @return builder
         * 
         */
        public Builder oracleTermsOfUseLink(@Nullable Output<String> oracleTermsOfUseLink) {
            $.oracleTermsOfUseLink = oracleTermsOfUseLink;
            return this;
        }

        /**
         * @param oracleTermsOfUseLink Oracle TOU link
         * 
         * @return builder
         * 
         */
        public Builder oracleTermsOfUseLink(String oracleTermsOfUseLink) {
            return oracleTermsOfUseLink(Output.of(oracleTermsOfUseLink));
        }

        /**
         * @param signature A generated signature for this agreement retrieval operation which should be used in the create subscription call.
         * 
         * @return builder
         * 
         */
        public Builder signature(@Nullable Output<String> signature) {
            $.signature = signature;
            return this;
        }

        /**
         * @param signature A generated signature for this agreement retrieval operation which should be used in the create subscription call.
         * 
         * @return builder
         * 
         */
        public Builder signature(String signature) {
            return signature(Output.of(signature));
        }

        /**
         * @param timeRetrieved Date and time the agreements were retrieved, in RFC3339 format. Example: `2018-03-20T12:32:53.532Z`
         * 
         * @return builder
         * 
         */
        public Builder timeRetrieved(@Nullable Output<String> timeRetrieved) {
            $.timeRetrieved = timeRetrieved;
            return this;
        }

        /**
         * @param timeRetrieved Date and time the agreements were retrieved, in RFC3339 format. Example: `2018-03-20T12:32:53.532Z`
         * 
         * @return builder
         * 
         */
        public Builder timeRetrieved(String timeRetrieved) {
            return timeRetrieved(Output.of(timeRetrieved));
        }

        public AppCatalogListingResourceVersionAgreementState build() {
            return $;
        }
    }

}
