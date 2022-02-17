// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateConfigPublicKey;
import io.pulumi.gcp.certificateauthority.outputs.CertificateConfigSubjectConfig;
import io.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509Config;
import java.util.Objects;

@OutputCustomType
public final class CertificateConfig {
    /**
     * A PublicKey describes a public key.
     * Structure is documented below.
     * 
     */
    private final CertificateConfigPublicKey publicKey;
    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * 
     */
    private final CertificateConfigSubjectConfig subjectConfig;
    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    private final CertificateConfigX509Config x509Config;

    @OutputCustomType.Constructor({"publicKey","subjectConfig","x509Config"})
    private CertificateConfig(
        CertificateConfigPublicKey publicKey,
        CertificateConfigSubjectConfig subjectConfig,
        CertificateConfigX509Config x509Config) {
        this.publicKey = Objects.requireNonNull(publicKey);
        this.subjectConfig = Objects.requireNonNull(subjectConfig);
        this.x509Config = Objects.requireNonNull(x509Config);
    }

    /**
     * A PublicKey describes a public key.
     * Structure is documented below.
     * 
     */
    public CertificateConfigPublicKey getPublicKey() {
        return this.publicKey;
    }
    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * 
     */
    public CertificateConfigSubjectConfig getSubjectConfig() {
        return this.subjectConfig;
    }
    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    public CertificateConfigX509Config getX509Config() {
        return this.x509Config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigPublicKey publicKey;
        private CertificateConfigSubjectConfig subjectConfig;
        private CertificateConfigX509Config x509Config;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
    	      this.subjectConfig = defaults.subjectConfig;
    	      this.x509Config = defaults.x509Config;
        }

        public Builder setPublicKey(CertificateConfigPublicKey publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setSubjectConfig(CertificateConfigSubjectConfig subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }

        public Builder setX509Config(CertificateConfigX509Config x509Config) {
            this.x509Config = Objects.requireNonNull(x509Config);
            return this;
        }

        public CertificateConfig build() {
            return new CertificateConfig(publicKey, subjectConfig, x509Config);
        }
    }
}