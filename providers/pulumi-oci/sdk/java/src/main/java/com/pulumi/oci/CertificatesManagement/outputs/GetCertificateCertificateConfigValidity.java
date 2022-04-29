// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateCertificateConfigValidity {
    /**
     * @return The date on which the certificate validity period ends, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    private final String timeOfValidityNotAfter;
    /**
     * @return The date on which the certificate validity period begins, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    private final String timeOfValidityNotBefore;

    @CustomType.Constructor
    private GetCertificateCertificateConfigValidity(
        @CustomType.Parameter("timeOfValidityNotAfter") String timeOfValidityNotAfter,
        @CustomType.Parameter("timeOfValidityNotBefore") String timeOfValidityNotBefore) {
        this.timeOfValidityNotAfter = timeOfValidityNotAfter;
        this.timeOfValidityNotBefore = timeOfValidityNotBefore;
    }

    /**
     * @return The date on which the certificate validity period ends, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public String timeOfValidityNotAfter() {
        return this.timeOfValidityNotAfter;
    }
    /**
     * @return The date on which the certificate validity period begins, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public String timeOfValidityNotBefore() {
        return this.timeOfValidityNotBefore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateCertificateConfigValidity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String timeOfValidityNotAfter;
        private String timeOfValidityNotBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateCertificateConfigValidity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeOfValidityNotAfter = defaults.timeOfValidityNotAfter;
    	      this.timeOfValidityNotBefore = defaults.timeOfValidityNotBefore;
        }

        public Builder timeOfValidityNotAfter(String timeOfValidityNotAfter) {
            this.timeOfValidityNotAfter = Objects.requireNonNull(timeOfValidityNotAfter);
            return this;
        }
        public Builder timeOfValidityNotBefore(String timeOfValidityNotBefore) {
            this.timeOfValidityNotBefore = Objects.requireNonNull(timeOfValidityNotBefore);
            return this;
        }        public GetCertificateCertificateConfigValidity build() {
            return new GetCertificateCertificateConfigValidity(timeOfValidityNotAfter, timeOfValidityNotBefore);
        }
    }
}
