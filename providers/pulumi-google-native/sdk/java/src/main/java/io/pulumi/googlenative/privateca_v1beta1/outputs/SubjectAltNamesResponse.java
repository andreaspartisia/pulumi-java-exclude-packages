// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.X509ExtensionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SubjectAltNamesResponse {
    /**
     * Contains additional subject alternative name values.
     * 
     */
    private final List<X509ExtensionResponse> customSans;
    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    private final List<String> dnsNames;
    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    private final List<String> emailAddresses;
    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    private final List<String> ipAddresses;
    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    private final List<String> uris;

    @CustomType.Constructor
    private SubjectAltNamesResponse(
        @CustomType.Parameter("customSans") List<X509ExtensionResponse> customSans,
        @CustomType.Parameter("dnsNames") List<String> dnsNames,
        @CustomType.Parameter("emailAddresses") List<String> emailAddresses,
        @CustomType.Parameter("ipAddresses") List<String> ipAddresses,
        @CustomType.Parameter("uris") List<String> uris) {
        this.customSans = customSans;
        this.dnsNames = dnsNames;
        this.emailAddresses = emailAddresses;
        this.ipAddresses = ipAddresses;
        this.uris = uris;
    }

    /**
     * Contains additional subject alternative name values.
     * 
    */
    public List<X509ExtensionResponse> customSans() {
        return this.customSans;
    }
    /**
     * Contains only valid, fully-qualified host names.
     * 
    */
    public List<String> dnsNames() {
        return this.dnsNames;
    }
    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
    */
    public List<String> emailAddresses() {
        return this.emailAddresses;
    }
    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
    */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }
    /**
     * Contains only valid RFC 3986 URIs.
     * 
    */
    public List<String> uris() {
        return this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectAltNamesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<X509ExtensionResponse> customSans;
        private List<String> dnsNames;
        private List<String> emailAddresses;
        private List<String> ipAddresses;
        private List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectAltNamesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSans = defaults.customSans;
    	      this.dnsNames = defaults.dnsNames;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.uris = defaults.uris;
        }

        public Builder customSans(List<X509ExtensionResponse> customSans) {
            this.customSans = Objects.requireNonNull(customSans);
            return this;
        }
        public Builder customSans(X509ExtensionResponse... customSans) {
            return customSans(List.of(customSans));
        }
        public Builder dnsNames(List<String> dnsNames) {
            this.dnsNames = Objects.requireNonNull(dnsNames);
            return this;
        }
        public Builder dnsNames(String... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }
        public Builder emailAddresses(List<String> emailAddresses) {
            this.emailAddresses = Objects.requireNonNull(emailAddresses);
            return this;
        }
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }
        public Builder ipAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder uris(List<String> uris) {
            this.uris = Objects.requireNonNull(uris);
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }        public SubjectAltNamesResponse build() {
            return new SubjectAltNamesResponse(customSans, dnsNames, emailAddresses, ipAddresses, uris);
        }
    }
}
