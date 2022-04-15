// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The interface for the external VPN gateway.
 * 
 */
public final class ExternalVpnGatewayInterfaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExternalVpnGatewayInterfaceResponse Empty = new ExternalVpnGatewayInterfaceResponse();

    /**
     * IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider's VPN gateway, it cannot be an IP address from Google Compute Engine.
     * 
     */
    @Import(name="ipAddress", required=true)
      private final String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    public ExternalVpnGatewayInterfaceResponse(String ipAddress) {
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
    }

    private ExternalVpnGatewayInterfaceResponse() {
        this.ipAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVpnGatewayInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalVpnGatewayInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }        public ExternalVpnGatewayInterfaceResponse build() {
            return new ExternalVpnGatewayInterfaceResponse(ipAddress);
        }
    }
}
