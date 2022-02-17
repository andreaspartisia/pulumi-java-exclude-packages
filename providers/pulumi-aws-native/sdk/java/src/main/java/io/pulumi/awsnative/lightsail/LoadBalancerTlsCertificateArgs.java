// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerTlsCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerTlsCertificateArgs Empty = new LoadBalancerTlsCertificateArgs();

    /**
     * An array of strings listing alternative domains and subdomains for your SSL/TLS certificate.
     * 
     */
    @InputImport(name="certificateAlternativeNames")
    private final @Nullable Input<List<String>> certificateAlternativeNames;

    public Input<List<String>> getCertificateAlternativeNames() {
        return this.certificateAlternativeNames == null ? Input.empty() : this.certificateAlternativeNames;
    }

    /**
     * The domain name (e.g., example.com ) for your SSL/TLS certificate.
     * 
     */
    @InputImport(name="certificateDomainName", required=true)
    private final Input<String> certificateDomainName;

    public Input<String> getCertificateDomainName() {
        return this.certificateDomainName;
    }

    /**
     * The SSL/TLS certificate name.
     * 
     */
    @InputImport(name="certificateName", required=true)
    private final Input<String> certificateName;

    public Input<String> getCertificateName() {
        return this.certificateName;
    }

    /**
     * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * 
     */
    @InputImport(name="isAttached")
    private final @Nullable Input<Boolean> isAttached;

    public Input<Boolean> getIsAttached() {
        return this.isAttached == null ? Input.empty() : this.isAttached;
    }

    /**
     * The name of your load balancer.
     * 
     */
    @InputImport(name="loadBalancerName", required=true)
    private final Input<String> loadBalancerName;

    public Input<String> getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public LoadBalancerTlsCertificateArgs(
        @Nullable Input<List<String>> certificateAlternativeNames,
        Input<String> certificateDomainName,
        Input<String> certificateName,
        @Nullable Input<Boolean> isAttached,
        Input<String> loadBalancerName) {
        this.certificateAlternativeNames = certificateAlternativeNames;
        this.certificateDomainName = Objects.requireNonNull(certificateDomainName, "expected parameter 'certificateDomainName' to be non-null");
        this.certificateName = Objects.requireNonNull(certificateName, "expected parameter 'certificateName' to be non-null");
        this.isAttached = isAttached;
        this.loadBalancerName = Objects.requireNonNull(loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
    }

    private LoadBalancerTlsCertificateArgs() {
        this.certificateAlternativeNames = Input.empty();
        this.certificateDomainName = Input.empty();
        this.certificateName = Input.empty();
        this.isAttached = Input.empty();
        this.loadBalancerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerTlsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> certificateAlternativeNames;
        private Input<String> certificateDomainName;
        private Input<String> certificateName;
        private @Nullable Input<Boolean> isAttached;
        private Input<String> loadBalancerName;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerTlsCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAlternativeNames = defaults.certificateAlternativeNames;
    	      this.certificateDomainName = defaults.certificateDomainName;
    	      this.certificateName = defaults.certificateName;
    	      this.isAttached = defaults.isAttached;
    	      this.loadBalancerName = defaults.loadBalancerName;
        }

        public Builder setCertificateAlternativeNames(@Nullable Input<List<String>> certificateAlternativeNames) {
            this.certificateAlternativeNames = certificateAlternativeNames;
            return this;
        }

        public Builder setCertificateAlternativeNames(@Nullable List<String> certificateAlternativeNames) {
            this.certificateAlternativeNames = Input.ofNullable(certificateAlternativeNames);
            return this;
        }

        public Builder setCertificateDomainName(Input<String> certificateDomainName) {
            this.certificateDomainName = Objects.requireNonNull(certificateDomainName);
            return this;
        }

        public Builder setCertificateDomainName(String certificateDomainName) {
            this.certificateDomainName = Input.of(Objects.requireNonNull(certificateDomainName));
            return this;
        }

        public Builder setCertificateName(Input<String> certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }

        public Builder setCertificateName(String certificateName) {
            this.certificateName = Input.of(Objects.requireNonNull(certificateName));
            return this;
        }

        public Builder setIsAttached(@Nullable Input<Boolean> isAttached) {
            this.isAttached = isAttached;
            return this;
        }

        public Builder setIsAttached(@Nullable Boolean isAttached) {
            this.isAttached = Input.ofNullable(isAttached);
            return this;
        }

        public Builder setLoadBalancerName(Input<String> loadBalancerName) {
            this.loadBalancerName = Objects.requireNonNull(loadBalancerName);
            return this;
        }

        public Builder setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = Input.of(Objects.requireNonNull(loadBalancerName));
            return this;
        }

        public LoadBalancerTlsCertificateArgs build() {
            return new LoadBalancerTlsCertificateArgs(certificateAlternativeNames, certificateDomainName, certificateName, isAttached, loadBalancerName);
        }
    }
}