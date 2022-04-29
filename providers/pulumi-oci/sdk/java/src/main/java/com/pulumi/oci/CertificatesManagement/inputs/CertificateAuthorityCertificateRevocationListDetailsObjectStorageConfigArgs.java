// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs Empty = new CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs();

    /**
     * (Updatable) The name of the bucket where the CRL is stored.
     * 
     */
    @Import(name="objectStorageBucketName", required=true)
    private Output<String> objectStorageBucketName;

    /**
     * @return (Updatable) The name of the bucket where the CRL is stored.
     * 
     */
    public Output<String> objectStorageBucketName() {
        return this.objectStorageBucketName;
    }

    /**
     * (Updatable) The tenancy of the bucket where the CRL is stored.
     * 
     */
    @Import(name="objectStorageNamespace")
    private @Nullable Output<String> objectStorageNamespace;

    /**
     * @return (Updatable) The tenancy of the bucket where the CRL is stored.
     * 
     */
    public Optional<Output<String>> objectStorageNamespace() {
        return Optional.ofNullable(this.objectStorageNamespace);
    }

    /**
     * (Updatable) The object name in the bucket where the CRL is stored, expressed using a format where the version number of the issuing CA is inserted as part of the Object Storage object name wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
     * 
     */
    @Import(name="objectStorageObjectNameFormat", required=true)
    private Output<String> objectStorageObjectNameFormat;

    /**
     * @return (Updatable) The object name in the bucket where the CRL is stored, expressed using a format where the version number of the issuing CA is inserted as part of the Object Storage object name wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
     * 
     */
    public Output<String> objectStorageObjectNameFormat() {
        return this.objectStorageObjectNameFormat;
    }

    private CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs() {}

    private CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs(CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs $) {
        this.objectStorageBucketName = $.objectStorageBucketName;
        this.objectStorageNamespace = $.objectStorageNamespace;
        this.objectStorageObjectNameFormat = $.objectStorageObjectNameFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs $;

        public Builder() {
            $ = new CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs();
        }

        public Builder(CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs defaults) {
            $ = new CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectStorageBucketName (Updatable) The name of the bucket where the CRL is stored.
         * 
         * @return builder
         * 
         */
        public Builder objectStorageBucketName(Output<String> objectStorageBucketName) {
            $.objectStorageBucketName = objectStorageBucketName;
            return this;
        }

        /**
         * @param objectStorageBucketName (Updatable) The name of the bucket where the CRL is stored.
         * 
         * @return builder
         * 
         */
        public Builder objectStorageBucketName(String objectStorageBucketName) {
            return objectStorageBucketName(Output.of(objectStorageBucketName));
        }

        /**
         * @param objectStorageNamespace (Updatable) The tenancy of the bucket where the CRL is stored.
         * 
         * @return builder
         * 
         */
        public Builder objectStorageNamespace(@Nullable Output<String> objectStorageNamespace) {
            $.objectStorageNamespace = objectStorageNamespace;
            return this;
        }

        /**
         * @param objectStorageNamespace (Updatable) The tenancy of the bucket where the CRL is stored.
         * 
         * @return builder
         * 
         */
        public Builder objectStorageNamespace(String objectStorageNamespace) {
            return objectStorageNamespace(Output.of(objectStorageNamespace));
        }

        /**
         * @param objectStorageObjectNameFormat (Updatable) The object name in the bucket where the CRL is stored, expressed using a format where the version number of the issuing CA is inserted as part of the Object Storage object name wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
         * 
         * @return builder
         * 
         */
        public Builder objectStorageObjectNameFormat(Output<String> objectStorageObjectNameFormat) {
            $.objectStorageObjectNameFormat = objectStorageObjectNameFormat;
            return this;
        }

        /**
         * @param objectStorageObjectNameFormat (Updatable) The object name in the bucket where the CRL is stored, expressed using a format where the version number of the issuing CA is inserted as part of the Object Storage object name wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
         * 
         * @return builder
         * 
         */
        public Builder objectStorageObjectNameFormat(String objectStorageObjectNameFormat) {
            return objectStorageObjectNameFormat(Output.of(objectStorageObjectNameFormat));
        }

        public CertificateAuthorityCertificateRevocationListDetailsObjectStorageConfigArgs build() {
            $.objectStorageBucketName = Objects.requireNonNull($.objectStorageBucketName, "expected parameter 'objectStorageBucketName' to be non-null");
            $.objectStorageObjectNameFormat = Objects.requireNonNull($.objectStorageObjectNameFormat, "expected parameter 'objectStorageObjectNameFormat' to be non-null");
            return $;
        }
    }

}
