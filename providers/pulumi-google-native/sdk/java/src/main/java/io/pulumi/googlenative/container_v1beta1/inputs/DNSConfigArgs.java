// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.container_v1beta1.enums.DNSConfigClusterDns;
import io.pulumi.googlenative.container_v1beta1.enums.DNSConfigClusterDnsScope;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DNSConfig contains the desired set of options for configuring clusterDNS.
 * 
 */
public final class DNSConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DNSConfigArgs Empty = new DNSConfigArgs();

    /**
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * 
     */
    @Import(name="clusterDns")
      private final @Nullable Output<DNSConfigClusterDns> clusterDns;

    public Output<DNSConfigClusterDns> clusterDns() {
        return this.clusterDns == null ? Codegen.empty() : this.clusterDns;
    }

    /**
     * cluster_dns_domain is the suffix used for all cluster service records.
     * 
     */
    @Import(name="clusterDnsDomain")
      private final @Nullable Output<String> clusterDnsDomain;

    public Output<String> clusterDnsDomain() {
        return this.clusterDnsDomain == null ? Codegen.empty() : this.clusterDnsDomain;
    }

    /**
     * cluster_dns_scope indicates the scope of access to cluster DNS records.
     * 
     */
    @Import(name="clusterDnsScope")
      private final @Nullable Output<DNSConfigClusterDnsScope> clusterDnsScope;

    public Output<DNSConfigClusterDnsScope> clusterDnsScope() {
        return this.clusterDnsScope == null ? Codegen.empty() : this.clusterDnsScope;
    }

    public DNSConfigArgs(
        @Nullable Output<DNSConfigClusterDns> clusterDns,
        @Nullable Output<String> clusterDnsDomain,
        @Nullable Output<DNSConfigClusterDnsScope> clusterDnsScope) {
        this.clusterDns = clusterDns;
        this.clusterDnsDomain = clusterDnsDomain;
        this.clusterDnsScope = clusterDnsScope;
    }

    private DNSConfigArgs() {
        this.clusterDns = Codegen.empty();
        this.clusterDnsDomain = Codegen.empty();
        this.clusterDnsScope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DNSConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DNSConfigClusterDns> clusterDns;
        private @Nullable Output<String> clusterDnsDomain;
        private @Nullable Output<DNSConfigClusterDnsScope> clusterDnsScope;

        public Builder() {
    	      // Empty
        }

        public Builder(DNSConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDns = defaults.clusterDns;
    	      this.clusterDnsDomain = defaults.clusterDnsDomain;
    	      this.clusterDnsScope = defaults.clusterDnsScope;
        }

        public Builder clusterDns(@Nullable Output<DNSConfigClusterDns> clusterDns) {
            this.clusterDns = clusterDns;
            return this;
        }
        public Builder clusterDns(@Nullable DNSConfigClusterDns clusterDns) {
            this.clusterDns = Codegen.ofNullable(clusterDns);
            return this;
        }
        public Builder clusterDnsDomain(@Nullable Output<String> clusterDnsDomain) {
            this.clusterDnsDomain = clusterDnsDomain;
            return this;
        }
        public Builder clusterDnsDomain(@Nullable String clusterDnsDomain) {
            this.clusterDnsDomain = Codegen.ofNullable(clusterDnsDomain);
            return this;
        }
        public Builder clusterDnsScope(@Nullable Output<DNSConfigClusterDnsScope> clusterDnsScope) {
            this.clusterDnsScope = clusterDnsScope;
            return this;
        }
        public Builder clusterDnsScope(@Nullable DNSConfigClusterDnsScope clusterDnsScope) {
            this.clusterDnsScope = Codegen.ofNullable(clusterDnsScope);
            return this;
        }        public DNSConfigArgs build() {
            return new DNSConfigArgs(clusterDns, clusterDnsDomain, clusterDnsScope);
        }
    }
}
