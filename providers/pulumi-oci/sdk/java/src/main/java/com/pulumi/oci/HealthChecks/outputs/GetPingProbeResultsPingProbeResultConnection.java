// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.HealthChecks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPingProbeResultsPingProbeResultConnection {
    /**
     * @return The connection IP address.
     * 
     */
    private final String address;
    /**
     * @return The port.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private GetPingProbeResultsPingProbeResultConnection(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("port") Integer port) {
        this.address = address;
        this.port = port;
    }

    /**
     * @return The connection IP address.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The port.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPingProbeResultsPingProbeResultConnection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPingProbeResultsPingProbeResultConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public GetPingProbeResultsPingProbeResultConnection build() {
            return new GetPingProbeResultsPingProbeResultConnection(address, port);
        }
    }
}
