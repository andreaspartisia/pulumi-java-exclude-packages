// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTrafficManagerProfileDnsConfig {
    /**
     * @return The relative domain name, this is combined with the domain name used by Traffic Manager to form the FQDN which is exported as documented below.
     * 
     */
    private final String relativeName;
    /**
     * @return The TTL value of the Profile used by Local DNS resolvers and clients.
     * 
     */
    private final Integer ttl;

    @CustomType.Constructor
    private GetTrafficManagerProfileDnsConfig(
        @CustomType.Parameter("relativeName") String relativeName,
        @CustomType.Parameter("ttl") Integer ttl) {
        this.relativeName = relativeName;
        this.ttl = ttl;
    }

    /**
     * @return The relative domain name, this is combined with the domain name used by Traffic Manager to form the FQDN which is exported as documented below.
     * 
     */
    public String relativeName() {
        return this.relativeName;
    }
    /**
     * @return The TTL value of the Profile used by Local DNS resolvers and clients.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficManagerProfileDnsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String relativeName;
        private Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrafficManagerProfileDnsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relativeName = defaults.relativeName;
    	      this.ttl = defaults.ttl;
        }

        public Builder relativeName(String relativeName) {
            this.relativeName = Objects.requireNonNull(relativeName);
            return this;
        }
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }        public GetTrafficManagerProfileDnsConfig build() {
            return new GetTrafficManagerProfileDnsConfig(relativeName, ttl);
        }
    }
}
