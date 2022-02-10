// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ApiEntityReferenceResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetPublicIPAddressConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineScaleSetIPConfigurationResponse {
    private final @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools;
    private final @Nullable List<SubResourceResponse> applicationSecurityGroups;
    private final @Nullable String id;
    private final @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools;
    private final @Nullable List<SubResourceResponse> loadBalancerInboundNatPools;
    private final String name;
    private final @Nullable Boolean primary;
    private final @Nullable String privateIPAddressVersion;
    private final @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration;
    private final @Nullable ApiEntityReferenceResponse subnet;

    @OutputCustomType.Constructor({"applicationGatewayBackendAddressPools","applicationSecurityGroups","id","loadBalancerBackendAddressPools","loadBalancerInboundNatPools","name","primary","privateIPAddressVersion","publicIPAddressConfiguration","subnet"})
    private VirtualMachineScaleSetIPConfigurationResponse(
        @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools,
        @Nullable List<SubResourceResponse> applicationSecurityGroups,
        @Nullable String id,
        @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools,
        @Nullable List<SubResourceResponse> loadBalancerInboundNatPools,
        String name,
        @Nullable Boolean primary,
        @Nullable String privateIPAddressVersion,
        @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration,
        @Nullable ApiEntityReferenceResponse subnet) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        this.applicationSecurityGroups = applicationSecurityGroups;
        this.id = id;
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
        this.name = Objects.requireNonNull(name);
        this.primary = primary;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        this.subnet = subnet;
    }

    public List<SubResourceResponse> getApplicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools == null ? List.of() : this.applicationGatewayBackendAddressPools;
    }
    public List<SubResourceResponse> getApplicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? List.of() : this.applicationSecurityGroups;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<SubResourceResponse> getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools == null ? List.of() : this.loadBalancerBackendAddressPools;
    }
    public List<SubResourceResponse> getLoadBalancerInboundNatPools() {
        return this.loadBalancerInboundNatPools == null ? List.of() : this.loadBalancerInboundNatPools;
    }
    public String getName() {
        return this.name;
    }
    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }
    public Optional<String> getPrivateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }
    public Optional<VirtualMachineScaleSetPublicIPAddressConfigurationResponse> getPublicIPAddressConfiguration() {
        return Optional.ofNullable(this.publicIPAddressConfiguration);
    }
    public Optional<ApiEntityReferenceResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools;
        private @Nullable List<SubResourceResponse> applicationSecurityGroups;
        private @Nullable String id;
        private @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools;
        private @Nullable List<SubResourceResponse> loadBalancerInboundNatPools;
        private String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIPAddressVersion;
        private @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration;
        private @Nullable ApiEntityReferenceResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGatewayBackendAddressPools = defaults.applicationGatewayBackendAddressPools;
    	      this.applicationSecurityGroups = defaults.applicationSecurityGroups;
    	      this.id = defaults.id;
    	      this.loadBalancerBackendAddressPools = defaults.loadBalancerBackendAddressPools;
    	      this.loadBalancerInboundNatPools = defaults.loadBalancerInboundNatPools;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.publicIPAddressConfiguration = defaults.publicIPAddressConfiguration;
    	      this.subnet = defaults.subnet;
        }

        public Builder setApplicationGatewayBackendAddressPools(@Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
            return this;
        }

        public Builder setApplicationSecurityGroups(@Nullable List<SubResourceResponse> applicationSecurityGroups) {
            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLoadBalancerBackendAddressPools(@Nullable List<SubResourceResponse> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }

        public Builder setLoadBalancerInboundNatPools(@Nullable List<SubResourceResponse> loadBalancerInboundNatPools) {
            this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrimary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }

        public Builder setPrivateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        public Builder setPublicIPAddressConfiguration(@Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }

        public Builder setSubnet(@Nullable ApiEntityReferenceResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public VirtualMachineScaleSetIPConfigurationResponse build() {
            return new VirtualMachineScaleSetIPConfigurationResponse(applicationGatewayBackendAddressPools, applicationSecurityGroups, id, loadBalancerBackendAddressPools, loadBalancerInboundNatPools, name, primary, privateIPAddressVersion, publicIPAddressConfiguration, subnet);
        }
    }
}