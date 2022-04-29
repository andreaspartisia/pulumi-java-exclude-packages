// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPublicationPackagesPublicationPackage {
    /**
     * @return The ID of the listing that the specified package belongs to.
     * 
     */
    private final String listingId;
    /**
     * @return A filter to return only packages that match the given package type exactly.
     * 
     */
    private final String packageType;
    /**
     * @return The version of the package. Package versions are unique within a listing.
     * 
     */
    private final String packageVersion;
    /**
     * @return The unique identifier for the package resource.
     * 
     */
    private final String resourceId;
    /**
     * @return The date and time the publication package was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetPublicationPackagesPublicationPackage(
        @CustomType.Parameter("listingId") String listingId,
        @CustomType.Parameter("packageType") String packageType,
        @CustomType.Parameter("packageVersion") String packageVersion,
        @CustomType.Parameter("resourceId") String resourceId,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.listingId = listingId;
        this.packageType = packageType;
        this.packageVersion = packageVersion;
        this.resourceId = resourceId;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The ID of the listing that the specified package belongs to.
     * 
     */
    public String listingId() {
        return this.listingId;
    }
    /**
     * @return A filter to return only packages that match the given package type exactly.
     * 
     */
    public String packageType() {
        return this.packageType;
    }
    /**
     * @return The version of the package. Package versions are unique within a listing.
     * 
     */
    public String packageVersion() {
        return this.packageVersion;
    }
    /**
     * @return The unique identifier for the package resource.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return The date and time the publication package was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicationPackagesPublicationPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String listingId;
        private String packageType;
        private String packageVersion;
        private String resourceId;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicationPackagesPublicationPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listingId = defaults.listingId;
    	      this.packageType = defaults.packageType;
    	      this.packageVersion = defaults.packageVersion;
    	      this.resourceId = defaults.resourceId;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder listingId(String listingId) {
            this.listingId = Objects.requireNonNull(listingId);
            return this;
        }
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = Objects.requireNonNull(packageVersion);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetPublicationPackagesPublicationPackage build() {
            return new GetPublicationPackagesPublicationPackage(listingId, packageType, packageVersion, resourceId, timeCreated);
        }
    }
}
