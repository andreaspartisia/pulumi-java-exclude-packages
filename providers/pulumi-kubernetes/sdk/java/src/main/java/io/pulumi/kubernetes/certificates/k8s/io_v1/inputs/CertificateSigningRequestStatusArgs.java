// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.certificates.k8s.io_v1.inputs.CertificateSigningRequestConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed status of the request, and the issued certificate.
 * 
 */
public final class CertificateSigningRequestStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateSigningRequestStatusArgs Empty = new CertificateSigningRequestStatusArgs();

    /**
     * certificate is populated with an issued certificate by the signer after an Approved condition is present. This field is set via the /status subresource. Once populated, this field is immutable.
     * 
     * If the certificate signing request is denied, a condition of type "Denied" is added and this field remains empty. If the signer cannot issue the certificate, a condition of type "Failed" is added and this field remains empty.
     * 
     * Validation requirements:
     *  1. certificate must contain one or more PEM blocks.
     *  2. All PEM blocks must have the "CERTIFICATE" label, contain no headers, and the encoded data
     *       must be a BER-encoded ASN.1 Certificate structure as described in section 4 of RFC5280.
     *  3. Non-PEM content may appear before or after the "CERTIFICATE" PEM blocks and is unvalidated,
     *       to allow for explanatory text as described in section 5.2 of RFC7468.
     * 
     * If more than one PEM block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.
     * 
     * The certificate is encoded in PEM format.
     * 
     * When serialized as JSON or YAML, the data is additionally base64-encoded, so it consists of:
     * 
     *     base64(
     *     -----BEGIN CERTIFICATE-----
     *     ...
     *     -----END CERTIFICATE-----
     *     )
     * 
     */
    @InputImport(name="certificate")
    private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * conditions applied to the request. Known conditions are "Approved", "Denied", and "Failed".
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<CertificateSigningRequestConditionArgs>> conditions;

    public Input<List<CertificateSigningRequestConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    public CertificateSigningRequestStatusArgs(
        @Nullable Input<String> certificate,
        @Nullable Input<List<CertificateSigningRequestConditionArgs>> conditions) {
        this.certificate = certificate;
        this.conditions = conditions;
    }

    private CertificateSigningRequestStatusArgs() {
        this.certificate = Input.empty();
        this.conditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificate;
        private @Nullable Input<List<CertificateSigningRequestConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.conditions = defaults.conditions;
        }

        public Builder setCertificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setConditions(@Nullable Input<List<CertificateSigningRequestConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<CertificateSigningRequestConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public CertificateSigningRequestStatusArgs build() {
            return new CertificateSigningRequestStatusArgs(certificate, conditions);
        }
    }
}