// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayIpAddress {
    /**
     * @return An IP address.
     * 
     */
    private final @Nullable String ipAddress;

    @CustomType.Constructor
    private GatewayIpAddress(@CustomType.Parameter("ipAddress") @Nullable String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return An IP address.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayIpAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }        public GatewayIpAddress build() {
            return new GatewayIpAddress(ipAddress);
        }
    }
}
