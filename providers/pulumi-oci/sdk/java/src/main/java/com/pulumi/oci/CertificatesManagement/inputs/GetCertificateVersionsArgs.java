// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.CertificatesManagement.inputs.GetCertificateVersionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateVersionsArgs Empty = new GetCertificateVersionsArgs();

    /**
     * The OCID of the certificate.
     * 
     */
    @Import(name="certificateId", required=true)
    private String certificateId;

    /**
     * @return The OCID of the certificate.
     * 
     */
    public String certificateId() {
        return this.certificateId;
    }

    @Import(name="filters")
    private @Nullable List<GetCertificateVersionsFilter> filters;

    public Optional<List<GetCertificateVersionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter that returns only resources that match the specified version number. The default value is 0, which means that this filter is not applied.
     * 
     */
    @Import(name="versionNumber")
    private @Nullable String versionNumber;

    /**
     * @return A filter that returns only resources that match the specified version number. The default value is 0, which means that this filter is not applied.
     * 
     */
    public Optional<String> versionNumber() {
        return Optional.ofNullable(this.versionNumber);
    }

    private GetCertificateVersionsArgs() {}

    private GetCertificateVersionsArgs(GetCertificateVersionsArgs $) {
        this.certificateId = $.certificateId;
        this.filters = $.filters;
        this.versionNumber = $.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateVersionsArgs $;

        public Builder() {
            $ = new GetCertificateVersionsArgs();
        }

        public Builder(GetCertificateVersionsArgs defaults) {
            $ = new GetCertificateVersionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId The OCID of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        public Builder filters(@Nullable List<GetCertificateVersionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetCertificateVersionsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param versionNumber A filter that returns only resources that match the specified version number. The default value is 0, which means that this filter is not applied.
         * 
         * @return builder
         * 
         */
        public Builder versionNumber(@Nullable String versionNumber) {
            $.versionNumber = versionNumber;
            return this;
        }

        public GetCertificateVersionsArgs build() {
            $.certificateId = Objects.requireNonNull($.certificateId, "expected parameter 'certificateId' to be non-null");
            return $;
        }
    }

}
