// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CertificatesManagement.outputs.CertificateCertificateRevocationListDetailObjectStorageConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificateRevocationListDetail {
    /**
     * @return Optional CRL access points, expressed using a format where the version number of the issuing CA is inserted wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
     * 
     */
    private final @Nullable List<String> customFormattedUrls;
    /**
     * @return The details of the Object Storage bucket configured to store the certificate revocation list (CRL).
     * 
     */
    private final @Nullable List<CertificateCertificateRevocationListDetailObjectStorageConfig> objectStorageConfigs;

    @CustomType.Constructor
    private CertificateCertificateRevocationListDetail(
        @CustomType.Parameter("customFormattedUrls") @Nullable List<String> customFormattedUrls,
        @CustomType.Parameter("objectStorageConfigs") @Nullable List<CertificateCertificateRevocationListDetailObjectStorageConfig> objectStorageConfigs) {
        this.customFormattedUrls = customFormattedUrls;
        this.objectStorageConfigs = objectStorageConfigs;
    }

    /**
     * @return Optional CRL access points, expressed using a format where the version number of the issuing CA is inserted wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
     * 
     */
    public List<String> customFormattedUrls() {
        return this.customFormattedUrls == null ? List.of() : this.customFormattedUrls;
    }
    /**
     * @return The details of the Object Storage bucket configured to store the certificate revocation list (CRL).
     * 
     */
    public List<CertificateCertificateRevocationListDetailObjectStorageConfig> objectStorageConfigs() {
        return this.objectStorageConfigs == null ? List.of() : this.objectStorageConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateRevocationListDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customFormattedUrls;
        private @Nullable List<CertificateCertificateRevocationListDetailObjectStorageConfig> objectStorageConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateRevocationListDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFormattedUrls = defaults.customFormattedUrls;
    	      this.objectStorageConfigs = defaults.objectStorageConfigs;
        }

        public Builder customFormattedUrls(@Nullable List<String> customFormattedUrls) {
            this.customFormattedUrls = customFormattedUrls;
            return this;
        }
        public Builder customFormattedUrls(String... customFormattedUrls) {
            return customFormattedUrls(List.of(customFormattedUrls));
        }
        public Builder objectStorageConfigs(@Nullable List<CertificateCertificateRevocationListDetailObjectStorageConfig> objectStorageConfigs) {
            this.objectStorageConfigs = objectStorageConfigs;
            return this;
        }
        public Builder objectStorageConfigs(CertificateCertificateRevocationListDetailObjectStorageConfig... objectStorageConfigs) {
            return objectStorageConfigs(List.of(objectStorageConfigs));
        }        public CertificateCertificateRevocationListDetail build() {
            return new CertificateCertificateRevocationListDetail(customFormattedUrls, objectStorageConfigs);
        }
    }
}
