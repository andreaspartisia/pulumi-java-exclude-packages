// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPublicationPackageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicationPackageArgs Empty = new GetPublicationPackageArgs();

    /**
     * The version of the package. Package versions are unique within a listing.
     * 
     */
    @Import(name="packageVersion", required=true)
    private String packageVersion;

    /**
     * @return The version of the package. Package versions are unique within a listing.
     * 
     */
    public String packageVersion() {
        return this.packageVersion;
    }

    /**
     * The unique identifier for the publication.
     * 
     */
    @Import(name="publicationId", required=true)
    private String publicationId;

    /**
     * @return The unique identifier for the publication.
     * 
     */
    public String publicationId() {
        return this.publicationId;
    }

    private GetPublicationPackageArgs() {}

    private GetPublicationPackageArgs(GetPublicationPackageArgs $) {
        this.packageVersion = $.packageVersion;
        this.publicationId = $.publicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicationPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicationPackageArgs $;

        public Builder() {
            $ = new GetPublicationPackageArgs();
        }

        public Builder(GetPublicationPackageArgs defaults) {
            $ = new GetPublicationPackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param packageVersion The version of the package. Package versions are unique within a listing.
         * 
         * @return builder
         * 
         */
        public Builder packageVersion(String packageVersion) {
            $.packageVersion = packageVersion;
            return this;
        }

        /**
         * @param publicationId The unique identifier for the publication.
         * 
         * @return builder
         * 
         */
        public Builder publicationId(String publicationId) {
            $.publicationId = publicationId;
            return this;
        }

        public GetPublicationPackageArgs build() {
            $.packageVersion = Objects.requireNonNull($.packageVersion, "expected parameter 'packageVersion' to be non-null");
            $.publicationId = Objects.requireNonNull($.publicationId, "expected parameter 'publicationId' to be non-null");
            return $;
        }
    }

}
