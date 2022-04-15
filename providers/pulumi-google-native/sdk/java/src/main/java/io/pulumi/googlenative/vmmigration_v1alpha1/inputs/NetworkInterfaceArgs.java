// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkInterface represents a NIC of a VM.
 * 
 */
public final class NetworkInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * The external IP to define in the NIC.
     * 
     */
    @Import(name="externalIp")
      private final @Nullable Output<String> externalIp;

    public Output<String> externalIp() {
        return this.externalIp == null ? Codegen.empty() : this.externalIp;
    }

    /**
     * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
     * 
     */
    @Import(name="internalIp")
      private final @Nullable Output<String> internalIp;

    public Output<String> internalIp() {
        return this.internalIp == null ? Codegen.empty() : this.internalIp;
    }

    /**
     * The network to connect the NIC to.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * The subnetwork to connect the NIC to.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    public NetworkInterfaceArgs(
        @Nullable Output<String> externalIp,
        @Nullable Output<String> internalIp,
        @Nullable Output<String> network,
        @Nullable Output<String> subnetwork) {
        this.externalIp = externalIp;
        this.internalIp = internalIp;
        this.network = network;
        this.subnetwork = subnetwork;
    }

    private NetworkInterfaceArgs() {
        this.externalIp = Codegen.empty();
        this.internalIp = Codegen.empty();
        this.network = Codegen.empty();
        this.subnetwork = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> externalIp;
        private @Nullable Output<String> internalIp;
        private @Nullable Output<String> network;
        private @Nullable Output<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIp = defaults.externalIp;
    	      this.internalIp = defaults.internalIp;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder externalIp(@Nullable Output<String> externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public Builder externalIp(@Nullable String externalIp) {
            this.externalIp = Codegen.ofNullable(externalIp);
            return this;
        }
        public Builder internalIp(@Nullable Output<String> internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public Builder internalIp(@Nullable String internalIp) {
            this.internalIp = Codegen.ofNullable(internalIp);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }        public NetworkInterfaceArgs build() {
            return new NetworkInterfaceArgs(externalIp, internalIp, network, subnetwork);
        }
    }
}
