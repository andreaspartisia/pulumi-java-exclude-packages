// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.identityplatform.outputs.TenantInboundSamlConfigIdpConfigIdpCertificate;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TenantInboundSamlConfigIdpConfig {
    /**
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    private final List<TenantInboundSamlConfigIdpConfigIdpCertificate> idpCertificates;
    /**
     * Unique identifier for all SAML entities
     * 
     */
    private final String idpEntityId;
    /**
     * Indicates if outbounding SAMLRequest should be signed.
     * 
     */
    private final @Nullable Boolean signRequest;
    /**
     * URL to send Authentication request to.
     * 
     */
    private final String ssoUrl;

    @OutputCustomType.Constructor
    private TenantInboundSamlConfigIdpConfig(
        @OutputCustomType.Parameter("idpCertificates") List<TenantInboundSamlConfigIdpConfigIdpCertificate> idpCertificates,
        @OutputCustomType.Parameter("idpEntityId") String idpEntityId,
        @OutputCustomType.Parameter("signRequest") @Nullable Boolean signRequest,
        @OutputCustomType.Parameter("ssoUrl") String ssoUrl) {
        this.idpCertificates = idpCertificates;
        this.idpEntityId = idpEntityId;
        this.signRequest = signRequest;
        this.ssoUrl = ssoUrl;
    }

    /**
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
    */
    public List<TenantInboundSamlConfigIdpConfigIdpCertificate> getIdpCertificates() {
        return this.idpCertificates;
    }
    /**
     * Unique identifier for all SAML entities
     * 
    */
    public String getIdpEntityId() {
        return this.idpEntityId;
    }
    /**
     * Indicates if outbounding SAMLRequest should be signed.
     * 
    */
    public Optional<Boolean> getSignRequest() {
        return Optional.ofNullable(this.signRequest);
    }
    /**
     * URL to send Authentication request to.
     * 
    */
    public String getSsoUrl() {
        return this.ssoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantInboundSamlConfigIdpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TenantInboundSamlConfigIdpConfigIdpCertificate> idpCertificates;
        private String idpEntityId;
        private @Nullable Boolean signRequest;
        private String ssoUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantInboundSamlConfigIdpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idpCertificates = defaults.idpCertificates;
    	      this.idpEntityId = defaults.idpEntityId;
    	      this.signRequest = defaults.signRequest;
    	      this.ssoUrl = defaults.ssoUrl;
        }

        public Builder setIdpCertificates(List<TenantInboundSamlConfigIdpConfigIdpCertificate> idpCertificates) {
            this.idpCertificates = Objects.requireNonNull(idpCertificates);
            return this;
        }

        public Builder setIdpEntityId(String idpEntityId) {
            this.idpEntityId = Objects.requireNonNull(idpEntityId);
            return this;
        }

        public Builder setSignRequest(@Nullable Boolean signRequest) {
            this.signRequest = signRequest;
            return this;
        }

        public Builder setSsoUrl(String ssoUrl) {
            this.ssoUrl = Objects.requireNonNull(ssoUrl);
            return this;
        }
        public TenantInboundSamlConfigIdpConfig build() {
            return new TenantInboundSamlConfigIdpConfig(idpCertificates, idpEntityId, signRequest, ssoUrl);
        }
    }
}
