// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Marketplace.outputs.GetListingsListingBanner;
import com.pulumi.oci.Marketplace.outputs.GetListingsListingDocumentationLink;
import com.pulumi.oci.Marketplace.outputs.GetListingsListingIcon;
import com.pulumi.oci.Marketplace.outputs.GetListingsListingPublisher;
import com.pulumi.oci.Marketplace.outputs.GetListingsListingRegion;
import com.pulumi.oci.Marketplace.outputs.GetListingsListingSupportedOperatingSystem;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetListingsListing {
    /**
     * @return The model for upload data for images and icons.
     * 
     */
    private final List<GetListingsListingBanner> banners;
    /**
     * @return Product categories that the listing belongs to.
     * 
     */
    private final List<String> categories;
    /**
     * @return The list of compatible architectures supported by the listing
     * 
     */
    private final List<String> compatibleArchitectures;
    /**
     * @return The default package version.
     * 
     */
    private final String defaultPackageVersion;
    /**
     * @return Links to additional documentation provided by the publisher specifically for the listing.
     * 
     */
    private final List<GetListingsListingDocumentationLink> documentationLinks;
    /**
     * @return The model for upload data for images and icons.
     * 
     */
    private final List<GetListingsListingIcon> icons;
    /**
     * @return The unique identifier for the publisher.
     * 
     */
    private final String id;
    /**
     * @return Indicates whether to show only featured listings. If this is set to `false` or is omitted, then all listings will be returned.
     * 
     */
    private final Boolean isFeatured;
    /**
     * @return The publisher category to which the listing belongs. The publisher category informs where the listing appears for use.
     * 
     */
    private final String listingType;
    /**
     * @return The name of the listing.
     * 
     */
    private final String name;
    /**
     * @return A filter to return only packages that match the given package type exactly.
     * 
     */
    private final String packageType;
    private final List<String> pricingTypes;
    /**
     * @return Summary details about the publisher of the listing.
     * 
     */
    private final List<GetListingsListingPublisher> publishers;
    /**
     * @return The regions where the listing is eligible to be deployed.
     * 
     */
    private final List<GetListingsListingRegion> regions;
    /**
     * @return A short description of the listing.
     * 
     */
    private final String shortDescription;
    /**
     * @return The list of operating systems supported by the listing.
     * 
     */
    private final List<GetListingsListingSupportedOperatingSystem> supportedOperatingSystems;

    @CustomType.Constructor
    private GetListingsListing(
        @CustomType.Parameter("banners") List<GetListingsListingBanner> banners,
        @CustomType.Parameter("categories") List<String> categories,
        @CustomType.Parameter("compatibleArchitectures") List<String> compatibleArchitectures,
        @CustomType.Parameter("defaultPackageVersion") String defaultPackageVersion,
        @CustomType.Parameter("documentationLinks") List<GetListingsListingDocumentationLink> documentationLinks,
        @CustomType.Parameter("icons") List<GetListingsListingIcon> icons,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isFeatured") Boolean isFeatured,
        @CustomType.Parameter("listingType") String listingType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("packageType") String packageType,
        @CustomType.Parameter("pricingTypes") List<String> pricingTypes,
        @CustomType.Parameter("publishers") List<GetListingsListingPublisher> publishers,
        @CustomType.Parameter("regions") List<GetListingsListingRegion> regions,
        @CustomType.Parameter("shortDescription") String shortDescription,
        @CustomType.Parameter("supportedOperatingSystems") List<GetListingsListingSupportedOperatingSystem> supportedOperatingSystems) {
        this.banners = banners;
        this.categories = categories;
        this.compatibleArchitectures = compatibleArchitectures;
        this.defaultPackageVersion = defaultPackageVersion;
        this.documentationLinks = documentationLinks;
        this.icons = icons;
        this.id = id;
        this.isFeatured = isFeatured;
        this.listingType = listingType;
        this.name = name;
        this.packageType = packageType;
        this.pricingTypes = pricingTypes;
        this.publishers = publishers;
        this.regions = regions;
        this.shortDescription = shortDescription;
        this.supportedOperatingSystems = supportedOperatingSystems;
    }

    /**
     * @return The model for upload data for images and icons.
     * 
     */
    public List<GetListingsListingBanner> banners() {
        return this.banners;
    }
    /**
     * @return Product categories that the listing belongs to.
     * 
     */
    public List<String> categories() {
        return this.categories;
    }
    /**
     * @return The list of compatible architectures supported by the listing
     * 
     */
    public List<String> compatibleArchitectures() {
        return this.compatibleArchitectures;
    }
    /**
     * @return The default package version.
     * 
     */
    public String defaultPackageVersion() {
        return this.defaultPackageVersion;
    }
    /**
     * @return Links to additional documentation provided by the publisher specifically for the listing.
     * 
     */
    public List<GetListingsListingDocumentationLink> documentationLinks() {
        return this.documentationLinks;
    }
    /**
     * @return The model for upload data for images and icons.
     * 
     */
    public List<GetListingsListingIcon> icons() {
        return this.icons;
    }
    /**
     * @return The unique identifier for the publisher.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether to show only featured listings. If this is set to `false` or is omitted, then all listings will be returned.
     * 
     */
    public Boolean isFeatured() {
        return this.isFeatured;
    }
    /**
     * @return The publisher category to which the listing belongs. The publisher category informs where the listing appears for use.
     * 
     */
    public String listingType() {
        return this.listingType;
    }
    /**
     * @return The name of the listing.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A filter to return only packages that match the given package type exactly.
     * 
     */
    public String packageType() {
        return this.packageType;
    }
    public List<String> pricingTypes() {
        return this.pricingTypes;
    }
    /**
     * @return Summary details about the publisher of the listing.
     * 
     */
    public List<GetListingsListingPublisher> publishers() {
        return this.publishers;
    }
    /**
     * @return The regions where the listing is eligible to be deployed.
     * 
     */
    public List<GetListingsListingRegion> regions() {
        return this.regions;
    }
    /**
     * @return A short description of the listing.
     * 
     */
    public String shortDescription() {
        return this.shortDescription;
    }
    /**
     * @return The list of operating systems supported by the listing.
     * 
     */
    public List<GetListingsListingSupportedOperatingSystem> supportedOperatingSystems() {
        return this.supportedOperatingSystems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListingsListing defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetListingsListingBanner> banners;
        private List<String> categories;
        private List<String> compatibleArchitectures;
        private String defaultPackageVersion;
        private List<GetListingsListingDocumentationLink> documentationLinks;
        private List<GetListingsListingIcon> icons;
        private String id;
        private Boolean isFeatured;
        private String listingType;
        private String name;
        private String packageType;
        private List<String> pricingTypes;
        private List<GetListingsListingPublisher> publishers;
        private List<GetListingsListingRegion> regions;
        private String shortDescription;
        private List<GetListingsListingSupportedOperatingSystem> supportedOperatingSystems;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListingsListing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.banners = defaults.banners;
    	      this.categories = defaults.categories;
    	      this.compatibleArchitectures = defaults.compatibleArchitectures;
    	      this.defaultPackageVersion = defaults.defaultPackageVersion;
    	      this.documentationLinks = defaults.documentationLinks;
    	      this.icons = defaults.icons;
    	      this.id = defaults.id;
    	      this.isFeatured = defaults.isFeatured;
    	      this.listingType = defaults.listingType;
    	      this.name = defaults.name;
    	      this.packageType = defaults.packageType;
    	      this.pricingTypes = defaults.pricingTypes;
    	      this.publishers = defaults.publishers;
    	      this.regions = defaults.regions;
    	      this.shortDescription = defaults.shortDescription;
    	      this.supportedOperatingSystems = defaults.supportedOperatingSystems;
        }

        public Builder banners(List<GetListingsListingBanner> banners) {
            this.banners = Objects.requireNonNull(banners);
            return this;
        }
        public Builder banners(GetListingsListingBanner... banners) {
            return banners(List.of(banners));
        }
        public Builder categories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder compatibleArchitectures(List<String> compatibleArchitectures) {
            this.compatibleArchitectures = Objects.requireNonNull(compatibleArchitectures);
            return this;
        }
        public Builder compatibleArchitectures(String... compatibleArchitectures) {
            return compatibleArchitectures(List.of(compatibleArchitectures));
        }
        public Builder defaultPackageVersion(String defaultPackageVersion) {
            this.defaultPackageVersion = Objects.requireNonNull(defaultPackageVersion);
            return this;
        }
        public Builder documentationLinks(List<GetListingsListingDocumentationLink> documentationLinks) {
            this.documentationLinks = Objects.requireNonNull(documentationLinks);
            return this;
        }
        public Builder documentationLinks(GetListingsListingDocumentationLink... documentationLinks) {
            return documentationLinks(List.of(documentationLinks));
        }
        public Builder icons(List<GetListingsListingIcon> icons) {
            this.icons = Objects.requireNonNull(icons);
            return this;
        }
        public Builder icons(GetListingsListingIcon... icons) {
            return icons(List.of(icons));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isFeatured(Boolean isFeatured) {
            this.isFeatured = Objects.requireNonNull(isFeatured);
            return this;
        }
        public Builder listingType(String listingType) {
            this.listingType = Objects.requireNonNull(listingType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public Builder pricingTypes(List<String> pricingTypes) {
            this.pricingTypes = Objects.requireNonNull(pricingTypes);
            return this;
        }
        public Builder pricingTypes(String... pricingTypes) {
            return pricingTypes(List.of(pricingTypes));
        }
        public Builder publishers(List<GetListingsListingPublisher> publishers) {
            this.publishers = Objects.requireNonNull(publishers);
            return this;
        }
        public Builder publishers(GetListingsListingPublisher... publishers) {
            return publishers(List.of(publishers));
        }
        public Builder regions(List<GetListingsListingRegion> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public Builder regions(GetListingsListingRegion... regions) {
            return regions(List.of(regions));
        }
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }
        public Builder supportedOperatingSystems(List<GetListingsListingSupportedOperatingSystem> supportedOperatingSystems) {
            this.supportedOperatingSystems = Objects.requireNonNull(supportedOperatingSystems);
            return this;
        }
        public Builder supportedOperatingSystems(GetListingsListingSupportedOperatingSystem... supportedOperatingSystems) {
            return supportedOperatingSystems(List.of(supportedOperatingSystems));
        }        public GetListingsListing build() {
            return new GetListingsListing(banners, categories, compatibleArchitectures, defaultPackageVersion, documentationLinks, icons, id, isFeatured, listingType, name, packageType, pricingTypes, publishers, regions, shortDescription, supportedOperatingSystems);
        }
    }
}
