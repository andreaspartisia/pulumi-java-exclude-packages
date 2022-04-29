// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ServiceCatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivateApplicationPackageResult {
    private final String contentUrl;
    /**
     * @return The display name of the package.
     * 
     */
    private final String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String mimeType;
    /**
     * @return The specified package&#39;s type.
     * 
     */
    private final String packageType;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private application where the package is hosted.
     * 
     */
    private final String privateApplicationId;
    private final String privateApplicationPackageId;
    /**
     * @return The date and time the private application package was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2021-05-27T21:10:29.600Z`
     * 
     */
    private final String timeCreated;
    /**
     * @return The package version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetPrivateApplicationPackageResult(
        @CustomType.Parameter("contentUrl") String contentUrl,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("mimeType") String mimeType,
        @CustomType.Parameter("packageType") String packageType,
        @CustomType.Parameter("privateApplicationId") String privateApplicationId,
        @CustomType.Parameter("privateApplicationPackageId") String privateApplicationPackageId,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("version") String version) {
        this.contentUrl = contentUrl;
        this.displayName = displayName;
        this.id = id;
        this.mimeType = mimeType;
        this.packageType = packageType;
        this.privateApplicationId = privateApplicationId;
        this.privateApplicationPackageId = privateApplicationPackageId;
        this.timeCreated = timeCreated;
        this.version = version;
    }

    public String contentUrl() {
        return this.contentUrl;
    }
    /**
     * @return The display name of the package.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String mimeType() {
        return this.mimeType;
    }
    /**
     * @return The specified package&#39;s type.
     * 
     */
    public String packageType() {
        return this.packageType;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private application where the package is hosted.
     * 
     */
    public String privateApplicationId() {
        return this.privateApplicationId;
    }
    public String privateApplicationPackageId() {
        return this.privateApplicationPackageId;
    }
    /**
     * @return The date and time the private application package was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2021-05-27T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The package version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateApplicationPackageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentUrl;
        private String displayName;
        private String id;
        private String mimeType;
        private String packageType;
        private String privateApplicationId;
        private String privateApplicationPackageId;
        private String timeCreated;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateApplicationPackageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentUrl = defaults.contentUrl;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.mimeType = defaults.mimeType;
    	      this.packageType = defaults.packageType;
    	      this.privateApplicationId = defaults.privateApplicationId;
    	      this.privateApplicationPackageId = defaults.privateApplicationPackageId;
    	      this.timeCreated = defaults.timeCreated;
    	      this.version = defaults.version;
        }

        public Builder contentUrl(String contentUrl) {
            this.contentUrl = Objects.requireNonNull(contentUrl);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder mimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public Builder privateApplicationId(String privateApplicationId) {
            this.privateApplicationId = Objects.requireNonNull(privateApplicationId);
            return this;
        }
        public Builder privateApplicationPackageId(String privateApplicationPackageId) {
            this.privateApplicationPackageId = Objects.requireNonNull(privateApplicationPackageId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetPrivateApplicationPackageResult build() {
            return new GetPrivateApplicationPackageResult(contentUrl, displayName, id, mimeType, packageType, privateApplicationId, privateApplicationPackageId, timeCreated, version);
        }
    }
}
