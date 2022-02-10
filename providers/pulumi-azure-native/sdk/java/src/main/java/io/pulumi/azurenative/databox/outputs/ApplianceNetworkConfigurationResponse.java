// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApplianceNetworkConfigurationResponse {
    private final String macAddress;
    private final String name;

    @OutputCustomType.Constructor({"macAddress","name"})
    private ApplianceNetworkConfigurationResponse(
        String macAddress,
        String name) {
        this.macAddress = Objects.requireNonNull(macAddress);
        this.name = Objects.requireNonNull(name);
    }

    public String getMacAddress() {
        return this.macAddress;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String macAddress;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplianceNetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.macAddress = defaults.macAddress;
    	      this.name = defaults.name;
        }

        public Builder setMacAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public ApplianceNetworkConfigurationResponse build() {
            return new ApplianceNetworkConfigurationResponse(macAddress, name);
        }
    }
}