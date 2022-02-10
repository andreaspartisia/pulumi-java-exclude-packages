// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.inputs.PrivateIPAddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerConfigurationArgs Empty = new LoadBalancerConfigurationArgs();

    @InputImport(name="loadBalancerResourceId")
    private final @Nullable Input<String> loadBalancerResourceId;

    public Input<String> getLoadBalancerResourceId() {
        return this.loadBalancerResourceId == null ? Input.empty() : this.loadBalancerResourceId;
    }

    @InputImport(name="privateIpAddress")
    private final @Nullable Input<PrivateIPAddressArgs> privateIpAddress;

    public Input<PrivateIPAddressArgs> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Input.empty() : this.privateIpAddress;
    }

    @InputImport(name="probePort")
    private final @Nullable Input<Integer> probePort;

    public Input<Integer> getProbePort() {
        return this.probePort == null ? Input.empty() : this.probePort;
    }

    @InputImport(name="publicIpAddressResourceId")
    private final @Nullable Input<String> publicIpAddressResourceId;

    public Input<String> getPublicIpAddressResourceId() {
        return this.publicIpAddressResourceId == null ? Input.empty() : this.publicIpAddressResourceId;
    }

    @InputImport(name="sqlVirtualMachineInstances")
    private final @Nullable Input<List<String>> sqlVirtualMachineInstances;

    public Input<List<String>> getSqlVirtualMachineInstances() {
        return this.sqlVirtualMachineInstances == null ? Input.empty() : this.sqlVirtualMachineInstances;
    }

    public LoadBalancerConfigurationArgs(
        @Nullable Input<String> loadBalancerResourceId,
        @Nullable Input<PrivateIPAddressArgs> privateIpAddress,
        @Nullable Input<Integer> probePort,
        @Nullable Input<String> publicIpAddressResourceId,
        @Nullable Input<List<String>> sqlVirtualMachineInstances) {
        this.loadBalancerResourceId = loadBalancerResourceId;
        this.privateIpAddress = privateIpAddress;
        this.probePort = probePort;
        this.publicIpAddressResourceId = publicIpAddressResourceId;
        this.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
    }

    private LoadBalancerConfigurationArgs() {
        this.loadBalancerResourceId = Input.empty();
        this.privateIpAddress = Input.empty();
        this.probePort = Input.empty();
        this.publicIpAddressResourceId = Input.empty();
        this.sqlVirtualMachineInstances = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> loadBalancerResourceId;
        private @Nullable Input<PrivateIPAddressArgs> privateIpAddress;
        private @Nullable Input<Integer> probePort;
        private @Nullable Input<String> publicIpAddressResourceId;
        private @Nullable Input<List<String>> sqlVirtualMachineInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerResourceId = defaults.loadBalancerResourceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.probePort = defaults.probePort;
    	      this.publicIpAddressResourceId = defaults.publicIpAddressResourceId;
    	      this.sqlVirtualMachineInstances = defaults.sqlVirtualMachineInstances;
        }

        public Builder setLoadBalancerResourceId(@Nullable Input<String> loadBalancerResourceId) {
            this.loadBalancerResourceId = loadBalancerResourceId;
            return this;
        }

        public Builder setLoadBalancerResourceId(@Nullable String loadBalancerResourceId) {
            this.loadBalancerResourceId = Input.ofNullable(loadBalancerResourceId);
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable Input<PrivateIPAddressArgs> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable PrivateIPAddressArgs privateIpAddress) {
            this.privateIpAddress = Input.ofNullable(privateIpAddress);
            return this;
        }

        public Builder setProbePort(@Nullable Input<Integer> probePort) {
            this.probePort = probePort;
            return this;
        }

        public Builder setProbePort(@Nullable Integer probePort) {
            this.probePort = Input.ofNullable(probePort);
            return this;
        }

        public Builder setPublicIpAddressResourceId(@Nullable Input<String> publicIpAddressResourceId) {
            this.publicIpAddressResourceId = publicIpAddressResourceId;
            return this;
        }

        public Builder setPublicIpAddressResourceId(@Nullable String publicIpAddressResourceId) {
            this.publicIpAddressResourceId = Input.ofNullable(publicIpAddressResourceId);
            return this;
        }

        public Builder setSqlVirtualMachineInstances(@Nullable Input<List<String>> sqlVirtualMachineInstances) {
            this.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
            return this;
        }

        public Builder setSqlVirtualMachineInstances(@Nullable List<String> sqlVirtualMachineInstances) {
            this.sqlVirtualMachineInstances = Input.ofNullable(sqlVirtualMachineInstances);
            return this;
        }

        public LoadBalancerConfigurationArgs build() {
            return new LoadBalancerConfigurationArgs(loadBalancerResourceId, privateIpAddress, probePort, publicIpAddressResourceId, sqlVirtualMachineInstances);
        }
    }
}