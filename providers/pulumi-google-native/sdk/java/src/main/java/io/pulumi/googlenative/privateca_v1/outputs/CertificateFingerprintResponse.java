// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateFingerprintResponse {
    /**
     * The SHA 256 hash, encoded in hexadecimal, of the DER x509 certificate.
     * 
     */
    private final String sha256Hash;

    @CustomType.Constructor
    private CertificateFingerprintResponse(@CustomType.Parameter("sha256Hash") String sha256Hash) {
        this.sha256Hash = sha256Hash;
    }

    /**
     * The SHA 256 hash, encoded in hexadecimal, of the DER x509 certificate.
     * 
    */
    public String sha256Hash() {
        return this.sha256Hash;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateFingerprintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sha256Hash;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateFingerprintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Hash = defaults.sha256Hash;
        }

        public Builder sha256Hash(String sha256Hash) {
            this.sha256Hash = Objects.requireNonNull(sha256Hash);
            return this;
        }        public CertificateFingerprintResponse build() {
            return new CertificateFingerprintResponse(sha256Hash);
        }
    }
}
