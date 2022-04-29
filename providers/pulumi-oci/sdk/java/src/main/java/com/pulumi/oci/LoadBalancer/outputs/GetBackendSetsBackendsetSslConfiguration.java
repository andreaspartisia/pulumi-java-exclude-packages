// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendSetsBackendsetSslConfiguration {
    /**
     * @return Ids for Oracle Cloud Infrastructure certificates service certificates. Currently only a single Id may be passed.  Example: `[ocid1.certificate.oc1.us-ashburn-1.amaaaaaaav3bgsaa5o2q7rh5nfmkkukfkogasqhk6af2opufhjlqg7m6jqzq]`
     * 
     */
    private final List<String> certificateIds;
    /**
     * @return A friendly name for the certificate bundle. It must be unique and it cannot be changed. Valid certificate bundle names include only alphanumeric characters, dashes, and underscores. Certificate bundle names cannot contain spaces. Avoid entering confidential information.  Example: `example_certificate_bundle`
     * 
     */
    private final String certificateName;
    /**
     * @return The name of the cipher suite to use for HTTPS or SSL connections.
     * 
     */
    private final String cipherSuiteName;
    /**
     * @return A list of SSL protocols the load balancer must support for HTTPS or SSL connections.
     * 
     */
    private final List<String> protocols;
    /**
     * @return When this attribute is set to ENABLED, the system gives preference to the server ciphers over the client ciphers.
     * 
     */
    private final String serverOrderPreference;
    /**
     * @return Ids for Oracle Cloud Infrastructure certificates service CA or CA bundles for the load balancer to trust.  Example: `[ocid1.cabundle.oc1.us-ashburn-1.amaaaaaaav3bgsaagl4zzyqdop5i2vuwoqewdvauuw34llqa74otq2jdsfyq]`
     * 
     */
    private final List<String> trustedCertificateAuthorityIds;
    /**
     * @return The maximum depth for peer certificate chain verification.  Example: `3`
     * 
     */
    private final Integer verifyDepth;
    /**
     * @return Whether the load balancer listener should verify peer certificates.  Example: `true`
     * 
     */
    private final Boolean verifyPeerCertificate;

    @CustomType.Constructor
    private GetBackendSetsBackendsetSslConfiguration(
        @CustomType.Parameter("certificateIds") List<String> certificateIds,
        @CustomType.Parameter("certificateName") String certificateName,
        @CustomType.Parameter("cipherSuiteName") String cipherSuiteName,
        @CustomType.Parameter("protocols") List<String> protocols,
        @CustomType.Parameter("serverOrderPreference") String serverOrderPreference,
        @CustomType.Parameter("trustedCertificateAuthorityIds") List<String> trustedCertificateAuthorityIds,
        @CustomType.Parameter("verifyDepth") Integer verifyDepth,
        @CustomType.Parameter("verifyPeerCertificate") Boolean verifyPeerCertificate) {
        this.certificateIds = certificateIds;
        this.certificateName = certificateName;
        this.cipherSuiteName = cipherSuiteName;
        this.protocols = protocols;
        this.serverOrderPreference = serverOrderPreference;
        this.trustedCertificateAuthorityIds = trustedCertificateAuthorityIds;
        this.verifyDepth = verifyDepth;
        this.verifyPeerCertificate = verifyPeerCertificate;
    }

    /**
     * @return Ids for Oracle Cloud Infrastructure certificates service certificates. Currently only a single Id may be passed.  Example: `[ocid1.certificate.oc1.us-ashburn-1.amaaaaaaav3bgsaa5o2q7rh5nfmkkukfkogasqhk6af2opufhjlqg7m6jqzq]`
     * 
     */
    public List<String> certificateIds() {
        return this.certificateIds;
    }
    /**
     * @return A friendly name for the certificate bundle. It must be unique and it cannot be changed. Valid certificate bundle names include only alphanumeric characters, dashes, and underscores. Certificate bundle names cannot contain spaces. Avoid entering confidential information.  Example: `example_certificate_bundle`
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }
    /**
     * @return The name of the cipher suite to use for HTTPS or SSL connections.
     * 
     */
    public String cipherSuiteName() {
        return this.cipherSuiteName;
    }
    /**
     * @return A list of SSL protocols the load balancer must support for HTTPS or SSL connections.
     * 
     */
    public List<String> protocols() {
        return this.protocols;
    }
    /**
     * @return When this attribute is set to ENABLED, the system gives preference to the server ciphers over the client ciphers.
     * 
     */
    public String serverOrderPreference() {
        return this.serverOrderPreference;
    }
    /**
     * @return Ids for Oracle Cloud Infrastructure certificates service CA or CA bundles for the load balancer to trust.  Example: `[ocid1.cabundle.oc1.us-ashburn-1.amaaaaaaav3bgsaagl4zzyqdop5i2vuwoqewdvauuw34llqa74otq2jdsfyq]`
     * 
     */
    public List<String> trustedCertificateAuthorityIds() {
        return this.trustedCertificateAuthorityIds;
    }
    /**
     * @return The maximum depth for peer certificate chain verification.  Example: `3`
     * 
     */
    public Integer verifyDepth() {
        return this.verifyDepth;
    }
    /**
     * @return Whether the load balancer listener should verify peer certificates.  Example: `true`
     * 
     */
    public Boolean verifyPeerCertificate() {
        return this.verifyPeerCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendSetsBackendsetSslConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certificateIds;
        private String certificateName;
        private String cipherSuiteName;
        private List<String> protocols;
        private String serverOrderPreference;
        private List<String> trustedCertificateAuthorityIds;
        private Integer verifyDepth;
        private Boolean verifyPeerCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendSetsBackendsetSslConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateIds = defaults.certificateIds;
    	      this.certificateName = defaults.certificateName;
    	      this.cipherSuiteName = defaults.cipherSuiteName;
    	      this.protocols = defaults.protocols;
    	      this.serverOrderPreference = defaults.serverOrderPreference;
    	      this.trustedCertificateAuthorityIds = defaults.trustedCertificateAuthorityIds;
    	      this.verifyDepth = defaults.verifyDepth;
    	      this.verifyPeerCertificate = defaults.verifyPeerCertificate;
        }

        public Builder certificateIds(List<String> certificateIds) {
            this.certificateIds = Objects.requireNonNull(certificateIds);
            return this;
        }
        public Builder certificateIds(String... certificateIds) {
            return certificateIds(List.of(certificateIds));
        }
        public Builder certificateName(String certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }
        public Builder cipherSuiteName(String cipherSuiteName) {
            this.cipherSuiteName = Objects.requireNonNull(cipherSuiteName);
            return this;
        }
        public Builder protocols(List<String> protocols) {
            this.protocols = Objects.requireNonNull(protocols);
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder serverOrderPreference(String serverOrderPreference) {
            this.serverOrderPreference = Objects.requireNonNull(serverOrderPreference);
            return this;
        }
        public Builder trustedCertificateAuthorityIds(List<String> trustedCertificateAuthorityIds) {
            this.trustedCertificateAuthorityIds = Objects.requireNonNull(trustedCertificateAuthorityIds);
            return this;
        }
        public Builder trustedCertificateAuthorityIds(String... trustedCertificateAuthorityIds) {
            return trustedCertificateAuthorityIds(List.of(trustedCertificateAuthorityIds));
        }
        public Builder verifyDepth(Integer verifyDepth) {
            this.verifyDepth = Objects.requireNonNull(verifyDepth);
            return this;
        }
        public Builder verifyPeerCertificate(Boolean verifyPeerCertificate) {
            this.verifyPeerCertificate = Objects.requireNonNull(verifyPeerCertificate);
            return this;
        }        public GetBackendSetsBackendsetSslConfiguration build() {
            return new GetBackendSetsBackendsetSslConfiguration(certificateIds, certificateName, cipherSuiteName, protocols, serverOrderPreference, trustedCertificateAuthorityIds, verifyDepth, verifyPeerCertificate);
        }
    }
}
