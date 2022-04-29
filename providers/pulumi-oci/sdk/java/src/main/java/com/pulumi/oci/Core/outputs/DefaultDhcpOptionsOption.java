// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DefaultDhcpOptionsOption {
    private final @Nullable List<String> customDnsServers;
    private final @Nullable List<String> searchDomainNames;
    private final @Nullable String serverType;
    private final String type;

    @CustomType.Constructor
    private DefaultDhcpOptionsOption(
        @CustomType.Parameter("customDnsServers") @Nullable List<String> customDnsServers,
        @CustomType.Parameter("searchDomainNames") @Nullable List<String> searchDomainNames,
        @CustomType.Parameter("serverType") @Nullable String serverType,
        @CustomType.Parameter("type") String type) {
        this.customDnsServers = customDnsServers;
        this.searchDomainNames = searchDomainNames;
        this.serverType = serverType;
        this.type = type;
    }

    public List<String> customDnsServers() {
        return this.customDnsServers == null ? List.of() : this.customDnsServers;
    }
    public List<String> searchDomainNames() {
        return this.searchDomainNames == null ? List.of() : this.searchDomainNames;
    }
    public Optional<String> serverType() {
        return Optional.ofNullable(this.serverType);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultDhcpOptionsOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customDnsServers;
        private @Nullable List<String> searchDomainNames;
        private @Nullable String serverType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultDhcpOptionsOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDnsServers = defaults.customDnsServers;
    	      this.searchDomainNames = defaults.searchDomainNames;
    	      this.serverType = defaults.serverType;
    	      this.type = defaults.type;
        }

        public Builder customDnsServers(@Nullable List<String> customDnsServers) {
            this.customDnsServers = customDnsServers;
            return this;
        }
        public Builder customDnsServers(String... customDnsServers) {
            return customDnsServers(List.of(customDnsServers));
        }
        public Builder searchDomainNames(@Nullable List<String> searchDomainNames) {
            this.searchDomainNames = searchDomainNames;
            return this;
        }
        public Builder searchDomainNames(String... searchDomainNames) {
            return searchDomainNames(List.of(searchDomainNames));
        }
        public Builder serverType(@Nullable String serverType) {
            this.serverType = serverType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DefaultDhcpOptionsOption build() {
            return new DefaultDhcpOptionsOption(customDnsServers, searchDomainNames, serverType, type);
        }
    }
}
