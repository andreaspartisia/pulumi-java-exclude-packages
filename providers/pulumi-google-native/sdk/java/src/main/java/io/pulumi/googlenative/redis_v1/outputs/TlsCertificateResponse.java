// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TlsCertificateResponse {
    /**
     * PEM representation.
     * 
     */
    private final String cert;
    /**
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
     * 
     */
    private final String createTime;
    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
     * 
     */
    private final String expireTime;
    /**
     * Serial number, as extracted from the certificate.
     * 
     */
    private final String serialNumber;
    /**
     * Sha1 Fingerprint of the certificate.
     * 
     */
    private final String sha1Fingerprint;

    @CustomType.Constructor
    private TlsCertificateResponse(
        @CustomType.Parameter("cert") String cert,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("serialNumber") String serialNumber,
        @CustomType.Parameter("sha1Fingerprint") String sha1Fingerprint) {
        this.cert = cert;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.serialNumber = serialNumber;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    /**
     * PEM representation.
     * 
    */
    public String cert() {
        return this.cert;
    }
    /**
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
     * 
    */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * Serial number, as extracted from the certificate.
     * 
    */
    public String serialNumber() {
        return this.serialNumber;
    }
    /**
     * Sha1 Fingerprint of the certificate.
     * 
    */
    public String sha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cert;
        private String createTime;
        private String expireTime;
        private String serialNumber;
        private String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder cert(String cert) {
            this.cert = Objects.requireNonNull(cert);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }
        public Builder sha1Fingerprint(String sha1Fingerprint) {
            this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint);
            return this;
        }        public TlsCertificateResponse build() {
            return new TlsCertificateResponse(cert, createTime, expireTime, serialNumber, sha1Fingerprint);
        }
    }
}
