// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateAuthorityVersionRevocationStatus {
    /**
     * @return The reason the certificate or certificate authority (CA) was revoked.
     * 
     */
    private final String revocationReason;
    /**
     * @return The time when the entity was revoked, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    private final String timeOfRevocation;

    @CustomType.Constructor
    private GetCertificateAuthorityVersionRevocationStatus(
        @CustomType.Parameter("revocationReason") String revocationReason,
        @CustomType.Parameter("timeOfRevocation") String timeOfRevocation) {
        this.revocationReason = revocationReason;
        this.timeOfRevocation = timeOfRevocation;
    }

    /**
     * @return The reason the certificate or certificate authority (CA) was revoked.
     * 
     */
    public String revocationReason() {
        return this.revocationReason;
    }
    /**
     * @return The time when the entity was revoked, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public String timeOfRevocation() {
        return this.timeOfRevocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityVersionRevocationStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String revocationReason;
        private String timeOfRevocation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityVersionRevocationStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revocationReason = defaults.revocationReason;
    	      this.timeOfRevocation = defaults.timeOfRevocation;
        }

        public Builder revocationReason(String revocationReason) {
            this.revocationReason = Objects.requireNonNull(revocationReason);
            return this;
        }
        public Builder timeOfRevocation(String timeOfRevocation) {
            this.timeOfRevocation = Objects.requireNonNull(timeOfRevocation);
            return this;
        }        public GetCertificateAuthorityVersionRevocationStatus build() {
            return new GetCertificateAuthorityVersionRevocationStatus(revocationReason, timeOfRevocation);
        }
    }
}
