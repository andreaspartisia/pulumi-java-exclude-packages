// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.certificates.k8s.io_v1beta1.outputs.CertificateSigningRequestCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateSigningRequestStatus {
    /**
     * If request was approved, the controller will place the issued certificate here.
     * 
     */
    private final @Nullable String certificate;
    /**
     * Conditions applied to the request, such as approval or denial.
     * 
     */
    private final @Nullable List<CertificateSigningRequestCondition> conditions;

    @OutputCustomType.Constructor({"certificate","conditions"})
    private CertificateSigningRequestStatus(
        @Nullable String certificate,
        @Nullable List<CertificateSigningRequestCondition> conditions) {
        this.certificate = certificate;
        this.conditions = conditions;
    }

    /**
     * If request was approved, the controller will place the issued certificate here.
     * 
     */
    public Optional<String> getCertificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * Conditions applied to the request, such as approval or denial.
     * 
     */
    public List<CertificateSigningRequestCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificate;
        private @Nullable List<CertificateSigningRequestCondition> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.conditions = defaults.conditions;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setConditions(@Nullable List<CertificateSigningRequestCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public CertificateSigningRequestStatus build() {
            return new CertificateSigningRequestStatus(certificate, conditions);
        }
    }
}