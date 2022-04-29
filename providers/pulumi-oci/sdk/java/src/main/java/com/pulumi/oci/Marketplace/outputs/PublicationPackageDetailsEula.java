// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PublicationPackageDetailsEula {
    /**
     * @return The end user license agreement&#39;s type.
     * 
     */
    private final String eulaType;
    /**
     * @return The text of the end user license agreement.
     * 
     */
    private final @Nullable String licenseText;

    @CustomType.Constructor
    private PublicationPackageDetailsEula(
        @CustomType.Parameter("eulaType") String eulaType,
        @CustomType.Parameter("licenseText") @Nullable String licenseText) {
        this.eulaType = eulaType;
        this.licenseText = licenseText;
    }

    /**
     * @return The end user license agreement&#39;s type.
     * 
     */
    public String eulaType() {
        return this.eulaType;
    }
    /**
     * @return The text of the end user license agreement.
     * 
     */
    public Optional<String> licenseText() {
        return Optional.ofNullable(this.licenseText);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicationPackageDetailsEula defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eulaType;
        private @Nullable String licenseText;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicationPackageDetailsEula defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eulaType = defaults.eulaType;
    	      this.licenseText = defaults.licenseText;
        }

        public Builder eulaType(String eulaType) {
            this.eulaType = Objects.requireNonNull(eulaType);
            return this;
        }
        public Builder licenseText(@Nullable String licenseText) {
            this.licenseText = licenseText;
            return this;
        }        public PublicationPackageDetailsEula build() {
            return new PublicationPackageDetailsEula(eulaType, licenseText);
        }
    }
}
